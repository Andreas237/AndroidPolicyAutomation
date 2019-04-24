.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/product/ProductView;
.super Ljava/lang/Object;
.source "ProductView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setProduct(Lcom/ibotta/api/model/ProductModel;)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract showFullScreenImage(Ljava/lang/String;)V
.end method

.method public abstract showProductNotFound()V
.end method

.method public abstract trackProductShop()V
.end method
