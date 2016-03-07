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
        admin.setFirstName("������");
        admin.setLastName("�������");
        admin.setCity("���� ����");
        admin.setRagion("����");
        admin.setOblast("�����-����������");
        admin.setCountry("������");
        admin.setNumberPhone("+380(67)-96-76-813");
        em.persist(admin);

        TypeObrobku typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("������ �����");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("�����-����");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("ϳ�����");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        typeObrobku = new TypeObrobku();
        typeObrobku.setNameObrobku("�������");
        typeObrobku.setAdmin(em.find(Admin.class,1));
        em.persist(typeObrobku);

        TypeWood typeWood = new TypeWood();
        typeWood.setNameWood("���");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("�������");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,1));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("���");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("�������");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,2));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("���");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("�������");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,3));
        em.persist(typeWood);

        typeWood = new TypeWood();
        typeWood.setNameWood("���");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("�������");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);
        typeWood = new TypeWood();
        typeWood.setNameWood("����");
        typeWood.setTypeObrobku(em.find(TypeObrobku.class,4));
        em.persist(typeWood);

        Product product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("������ ����� ����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("������� �����-����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("������ ϳ�����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,1));
        product.setNameProduct("������ �������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("��������� ����� ����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("���������� �����-����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("��������� ������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,2));
        product.setNameProduct("��������� �������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("������� ����� ����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("�������� �����-����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("������� ������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,3));
        product.setNameProduct("������� �������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);

        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("���� ����� ����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("���� �����-����");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("���� ������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);
        product = new Product();
        product.setTypeWood(em.find(TypeWood.class,4));
        product.setNameProduct("���� �������");
        product.setHeigthProduct("25 ��");
        product.setLongProduct("6 �");
        product.setOpusProduct("������ �����");
        product.setPriceForLong("200 ��� �� 1 ������� ����");
        product.setPriceForSque("150 �� 1 ���������� ����");
        product.setWidthProduct("50");
        em.persist(product);




        em.getTransaction().commit();
        em.close();
        factory.close();

    }

}
