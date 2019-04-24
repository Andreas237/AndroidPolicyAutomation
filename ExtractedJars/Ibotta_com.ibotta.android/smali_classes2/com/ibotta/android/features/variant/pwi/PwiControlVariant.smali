.class public Lcom/ibotta/android/features/variant/pwi/PwiControlVariant;
.super Ljava/lang/Object;
.source "PwiControlVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/pwi/PwiVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addBuyableGiftCards(Ljava/util/List;Ljava/util/List;)V
    .locals 0
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

    return-void
.end method

.method public addBuyableGiftCardsToGallerySection(Lcom/ibotta/android/view/model/GallerySection;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public createAccountRows()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/account/row/AbstractAccountRow;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;->values()[Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 63
    sget-object v5, Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;->PAYMENT_HISTORY:Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;

    if-ne v5, v4, :cond_0

    goto :goto_1

    .line 68
    :cond_0
    new-instance v5, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;

    invoke-direct {v5}, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;-><init>()V

    .line 69
    invoke-virtual {v5, v4}, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;->setAccountMenu(Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;)V

    .line 71
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method

.method public getGooglePayEnvironmentType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getPwiFlowClass()Ljava/lang/Class;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 35
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_LIVE_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object v0
.end method

.method public isProduction()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public shouldShowBuyableGiftCardNavButton(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public shouldShowRetailerHeaderButton(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public showBuyableGiftCards()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public showFeatureDisabled(Ljava/util/List;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;Z)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method
