.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;
.super Ljava/lang/Object;
.source "MyOffersGalleryPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getSelectedItemsList()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSelectedItemsListSize()I
.end method

.method public abstract isEditing()Z
.end method

.method public abstract onBackClicked()V
.end method

.method public abstract onCancelEditing()V
.end method

.method public abstract onEditClicked()V
.end method

.method public abstract onFindRebatesClicked()V
.end method

.method public abstract onHeaderBuyIgcClicked()V
.end method

.method public abstract onHeaderImCardClicked()V
.end method

.method public abstract onHeaderLoyaltyCardClicked()V
.end method

.method public abstract onHeaderRedeemClicked()V
.end method

.method public abstract onMyRebatesSelectionChanged(Ljava/lang/Integer;)V
.end method

.method public abstract onOptionsItemSelected()Z
.end method

.method public abstract onRemoveClicked()V
.end method

.method public abstract onRemoveConfirmed()V
.end method

.method public abstract onViewMyRebateClicked(ILjava/lang/Integer;)V
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setImConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)V
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
.end method

.method public abstract setSelectedCategoryId(Ljava/lang/Integer;)V
.end method
