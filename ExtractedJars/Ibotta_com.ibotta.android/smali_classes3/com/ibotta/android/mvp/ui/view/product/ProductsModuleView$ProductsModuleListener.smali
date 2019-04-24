.class public interface abstract Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView$ProductsModuleListener;
.super Ljava/lang/Object;
.source "ProductsModuleView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ProductsModuleListener"
.end annotation


# virtual methods
.method public abstract onActionClicked(Lcom/ibotta/api/model/base/Actionable;)V
.end method

.method public abstract onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V
.end method

.method public abstract onProductShopClicked(Lcom/ibotta/api/model/ProductModel;)V
.end method

.method public abstract onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
.end method
