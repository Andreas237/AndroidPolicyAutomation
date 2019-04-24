.class public Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;
.super Ljava/lang/Object;
.source "PwiBaseExperimentalVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/pwi/PwiVariant;


# static fields
.field protected static final DEBUG_SKU:Ljava/lang/String; = "VUSD-D-V-01"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private areAllContentModelsOnlyBuyableGiftCards(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;)Z"
        }
    .end annotation

    .line 113
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/features/variant/pwi/-$$Lambda$PwiBaseExperimentalVariant$IUQX-H1-zl5r50RqmYiJGBYEYZE;->INSTANCE:Lcom/ibotta/android/features/variant/pwi/-$$Lambda$PwiBaseExperimentalVariant$IUQX-H1-zl5r50RqmYiJGBYEYZE;

    .line 114
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->allMatch(Ljava9/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method private convertToBuyableGiftCardItems(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BuyableGiftCardModel;

    .line 98
    new-instance v2, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;

    invoke-direct {v2, v1}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;-><init>(Lcom/ibotta/api/model/BuyableGiftCardModel;)V

    .line 99
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 101
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method static synthetic lambda$areAllContentModelsOnlyBuyableGiftCards$0(Lcom/ibotta/api/model/ContentModel;)Z
    .locals 1

    .line 114
    sget-object v0, Lcom/ibotta/api/model/ContentModel$Type;->BUYABLE_GIFT_CARD:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-interface {p0}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/api/model/ContentModel$Type;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
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

    .line 81
    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public addBuyableGiftCardsToGallerySection(Lcom/ibotta/android/view/model/GallerySection;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation

    .line 87
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;->convertToBuyableGiftCardItems(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
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

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;->values()[Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 69
    new-instance v5, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;

    invoke-direct {v5}, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;-><init>()V

    .line 70
    invoke-virtual {v5, v4}, Lcom/ibotta/android/mvp/ui/activity/account/row/AccountMenuRow;->setAccountMenu(Lcom/ibotta/android/mvp/ui/activity/account/AccountMenu;)V

    .line 72
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getBuyableGiftCardSku(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 0

    const-string p1, "VUSD-D-V-01"

    return-object p1
.end method

.method public getGooglePayEnvironmentType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getPwiFlowClass()Ljava/lang/Class;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 119
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    return-object v0
.end method

.method public getStripeSdkKeyType()Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;
    .locals 1

    .line 39
    sget-object v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->STRIPE_TEST_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    return-object v0
.end method

.method public isProduction()Z
    .locals 1

    const/4 v0, 0x0

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

    .line 60
    invoke-direct {p0, p1}, Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;->areAllContentModelsOnlyBuyableGiftCards(Ljava/util/List;)Z

    move-result p1

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

    .line 54
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public showBuyableGiftCards()Z
    .locals 1

    const/4 v0, 0x1

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

    if-nez p2, :cond_0

    .line 109
    invoke-direct {p0, p1}, Lcom/ibotta/android/features/variant/pwi/PwiBaseExperimentalVariant;->areAllContentModelsOnlyBuyableGiftCards(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
