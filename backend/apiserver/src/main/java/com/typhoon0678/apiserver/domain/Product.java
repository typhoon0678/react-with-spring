package com.typhoon0678.apiserver.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "tbl_product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "imageList")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pno;

    private String pname;

    private int price;

    private String pdesc;

    private boolean delFlag;

    @ElementCollection
    @Builder.Default
    private List<ProductImage> imageList = new ArrayList<>();

    public void changePrice(int price) {
        this.price = price;
    }

    public void changeDesc(String desc) {
        this.pdesc = desc;
    }

    public void changeName(String pname) {
        this.pname = pname;
    }

    public void addImage(ProductImage image) {
        image.setOrd(imageList.size());
        imageList.add(image);
    }

    public void addImageString(String filename) {
        ProductImage productImage = ProductImage.builder()
                .fileName(filename)
                .build();

        addImage(productImage);
    }

    public void clearList() {

        this.imageList.clear();
    }
}
