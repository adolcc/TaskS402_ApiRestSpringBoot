package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Integer id, Fruit fruitDetails) {
        return fruitRepository.findById(id)
                .map(existingFruit -> {
                    existingFruit.setName(fruitDetails.getName());
                    existingFruit.setQuantityKg(fruitDetails.getQuantityKg());
                    return fruitRepository.save(existingFruit);
                })
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public void deleteFruit(Integer id) {
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException(id);
        }
        fruitRepository.deleteById(id);
    }

    public Fruit getOneFruit(Integer id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}