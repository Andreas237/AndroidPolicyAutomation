.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "ProductRow.java"


# instance fields
.field private productItem:Lcom/ibotta/android/view/model/content/ProductItem;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->PRODUCT_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    return-void
.end method


# virtual methods
.method public getProductItem()Lcom/ibotta/android/view/model/content/ProductItem;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;->productItem:Lcom/ibotta/android/view/model/content/ProductItem;

    return-object v0
.end method

.method public setProductItem(Lcom/ibotta/android/view/model/content/ProductItem;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/ProductRow;->productItem:Lcom/ibotta/android/view/model/content/ProductItem;

    return-void
.end method
