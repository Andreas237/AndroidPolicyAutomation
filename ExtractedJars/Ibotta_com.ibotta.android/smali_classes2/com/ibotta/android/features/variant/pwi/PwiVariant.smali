.class public interface abstract Lcom/ibotta/android/features/variant/pwi/PwiVariant;
.super Ljava/lang/Object;
.source "PwiVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/Variant;


# virtual methods
.method public abstract addBuyableGiftCards(Ljava/util/List;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addBuyableGiftCardsToGallerySection(Lcom/ibotta/android/view/model/GallerySection;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract createAccountRows()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/account/row/AbstractAccountRow;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
.end method

.method public abstract getGooglePayEnvironmentType()I
.end method

.method public abstract getPwiFlowClass()Ljava/lang/Class;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
.end method

.method public abstract isProduction()Z
.end method

.method public abstract shouldShowBuyableGiftCardNavButton(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract shouldShowRetailerHeaderButton(Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract showBuyableGiftCards()Z
.end method

.method public abstract showFeatureDisabled(Ljava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;Z)Z"
        }
    .end annotation
.end method
