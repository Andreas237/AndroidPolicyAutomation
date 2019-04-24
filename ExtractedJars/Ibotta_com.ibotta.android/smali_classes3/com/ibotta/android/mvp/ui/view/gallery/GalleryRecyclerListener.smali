.class public interface abstract Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRecyclerListener;
.super Ljava/lang/Object;
.source "GalleryRecyclerListener.java"


# virtual methods
.method public abstract onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
.end method

.method public abstract onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract onTrackContentClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
.end method

.method public abstract onTrackShopClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
.end method

.method public abstract onTrackUnlockClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
.end method

.method public abstract onTrackUnlockedClicked(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V
.end method

.method public abstract onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
