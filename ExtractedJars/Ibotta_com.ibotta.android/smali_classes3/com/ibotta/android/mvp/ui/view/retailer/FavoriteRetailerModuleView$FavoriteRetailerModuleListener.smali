.class public interface abstract Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView$FavoriteRetailerModuleListener;
.super Ljava/lang/Object;
.source "FavoriteRetailerModuleView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FavoriteRetailerModuleListener"
.end annotation


# virtual methods
.method public abstract onActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
.end method

.method public abstract onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onRetailerViewAllClicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onTitleMenuActionClicked(Lcom/ibotta/api/model/base/Module;Lcom/ibotta/api/model/base/Actionable;)V
.end method

.method public abstract onTitleMenuClicked(Lcom/ibotta/api/model/base/Module;)V
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
