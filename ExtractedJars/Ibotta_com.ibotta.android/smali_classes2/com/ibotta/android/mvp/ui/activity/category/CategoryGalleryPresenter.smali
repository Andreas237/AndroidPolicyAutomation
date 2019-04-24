.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPresenter;
.super Ljava/lang/Object;
.source "CategoryGalleryPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract setRetailerCategoryParcel(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
.end method
