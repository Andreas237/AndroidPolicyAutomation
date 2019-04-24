.class public Lcom/ibotta/android/util/content/ContentHelperImpl;
.super Ljava/lang/Object;
.source "ContentHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/content/ContentHelper;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method

.method private getDealImageUrl(Lcom/ibotta/api/model/DealModel;)Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/AppHelper;->getBestImgUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 80
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private getProductImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->getBestImgUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getBestImageUrl(Lcom/ibotta/api/model/ContentModel;)Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 45
    sget-object v0, Lcom/ibotta/android/util/content/ContentHelperImpl$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 64
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Content Type not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :pswitch_0
    check-cast p1, Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 53
    :pswitch_1
    check-cast p1, Lcom/ibotta/api/model/DealModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/util/content/ContentHelperImpl;->getDealImageUrl(Lcom/ibotta/api/model/DealModel;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 50
    :pswitch_2
    check-cast p1, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/util/content/ContentHelperImpl;->getProductImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 47
    :pswitch_3
    iget-object v0, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isShopNow(Lcom/ibotta/api/model/ContentModel;)Z
    .locals 2

    .line 30
    sget-object v0, Lcom/ibotta/android/util/content/ContentHelperImpl$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x1

    goto :goto_0

    .line 32
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/util/content/ContentHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
