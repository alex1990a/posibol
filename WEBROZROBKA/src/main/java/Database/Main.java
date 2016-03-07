package Database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("primary");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        Admin admin = new Admin();
        admin.setFirstName("Богдан");
        admin.setLastName("Близнюк");
        admin.setCity("Старі Кути");
        admin.setRagion("Косів");
        admin.setOblast("Івано-Франківська");
        admin.setCountry("Україна");
        admin.setNumberPhone("+380(67)-96-76-813");
        em.persist(admin);

        TypeObrobku typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("Стінова доска");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("Фальш-Брус");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("Підлога");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("Вагонка");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        TypeWood typeWood = new TypeWood();
        typeWood.setNameWood("Дуб");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Смерека");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Горіх");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Ясен");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("Дуб");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Смерека");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Горіх");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Ясен");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("Дуб");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Смерека");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Горіх");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Ясен");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("Дуб");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Смерека");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Горіх");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("Ясен");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);

        Product product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("Дубова Доска Стіни");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("Дубовий Фальш-Брус");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("Дубова Підлога");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("Дубова Вагонка");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("Смерикова Доска стіни");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("Смериковий Фальш-Брус");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("Смериковф підлога°");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("Смерикова вогонка");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("Горіхова Доска стіни");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("Горіховий Фальш-Брус");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("Горіхова підлога");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("Горіхова вогонка");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("Ясен Доска стіни");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("Ясен Фальш-Брус");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("Ясен підлога");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("Ясен вогонка");
        product.setHeigthProduct("25 см");
        product.setLongProduct("6 м");
        product.setOpusProduct("Хороша доска");
        product.setPriceForLong("200 грн за 1 погоний метр");
        product.setPriceForSque("150 за 1 квадратний метр");
        product.setWidthProduct("50");
        em.persist(product);




        em.getTransaction().commit();
        em.close();
        factory.close();

    }

}
