.class public Lcom/ibotta/api/model/content/BuyableGiftCardContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "BuyableGiftCardContent.java"

# interfaces
.implements Lcom/ibotta/api/model/BuyableGiftCardModel;


# instance fields
.field private description:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private endTime:Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private imageUrl:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private launch:Z

.field private maxPurchaseAmount:F

.field private minPurchaseAmount:F

.field private preconfiguredAmounts:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private retailerId:I

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerSku:Ljava/lang/String;

.field private rewardPercentage:F

.field private startTime:Ljava/util/Date;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private terms:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxPurchaseAmount()F
    .locals 1

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->maxPurchaseAmount:F

    return v0
.end method

.method public getMinPurchaseAmount()F
    .locals 1

    .line 78
    iget v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->minPurchaseAmount:F

    return v0
.end method

.method public getPreconfiguredAmounts()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->preconfiguredAmounts:Ljava/util/Set;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerId:I

    return v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public getRetailerSku()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerSku:Ljava/lang/String;

    return-object v0
.end method

.method public getRewardPercentage()F
    .locals 1

    .line 123
    iget v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->rewardPercentage:F

    return v0
.end method

.method public getStartTime()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->startTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public isLaunch()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->launch:Z

    return v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(Ljava/util/Date;)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->endTime:Ljava/util/Date;

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setLaunch(Z)V
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->launch:Z

    return-void
.end method

.method public setMaxPurchaseAmount(F)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->maxPurchaseAmount:F

    return-void
.end method

.method public setMinPurchaseAmount(F)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->minPurchaseAmount:F

    return-void
.end method

.method public setPreconfiguredAmounts(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->preconfiguredAmounts:Ljava/util/Set;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerId:I

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method

.method public setRetailerSku(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->retailerSku:Ljava/lang/String;

    return-void
.end method

.method public setRewardPercentage(F)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->rewardPercentage:F

    return-void
.end method

.method public setStartTime(Ljava/util/Date;)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 136
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->startTime:Ljava/util/Date;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 145
    iput-object p1, p0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->terms:Ljava/lang/String;

    return-void
.end method
