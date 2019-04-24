.class public Lcom/ibotta/api/helper/bonus/BonusHelperImpl;
.super Ljava/lang/Object;
.source "BonusHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/bonus/BonusHelper;


# instance fields
.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-void
.end method


# virtual methods
.method public findAccessibleBonuses(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 90
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    .line 91
    iget-object v2, p0, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getRetailerId()I

    move-result v3

    invoke-interface {v2, p2, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    .line 93
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->isBonusAvailableAt(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 95
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public findBonusById(Ljava/util/List;I)Lcom/ibotta/api/model/BonusModel;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;I)",
            "Lcom/ibotta/api/model/BonusModel;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 73
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BonusModel;

    .line 74
    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method protected formatAmount(Ljava/text/Format;F)Ljava/lang/String;
    .locals 0

    .line 131
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAmountString(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;
    .locals 1

    .line 161
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 162
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->getDisplayAmount(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDisplayAmount(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 41
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->isOtherReward(Lcom/ibotta/api/model/BonusModel;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 42
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 43
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getAmount()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2

    const-string v0, ""

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    .line 46
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getAmount()F

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->formatAmount(Ljava/text/Format;F)Ljava/lang/String;

    move-result-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public getDisplayAmount(Ljava/lang/Float;Ljava/text/Format;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->formatAmount(Ljava/text/Format;F)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method protected getRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-object v0
.end method

.method protected isBonusAvailableAt(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 106
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getRetailerId()I

    move-result v1

    if-lez v1, :cond_1

    if-nez p2, :cond_1

    return v0

    .line 112
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getRetailerId()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getMaxRetailerDistance()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 114
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;->isNearby(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v1

    goto :goto_0

    .line 115
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getRetailerId()I

    move-result p1

    :goto_0
    return v1
.end method

.method public isCompleted(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 60
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->isCompleted()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result p1

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public isFeatured(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 156
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getBonusTypeEnum()Lcom/ibotta/api/model/BonusModel$Type;

    move-result-object p1

    sget-object v1, Lcom/ibotta/api/model/BonusModel$Type;->FEATURED:Lcom/ibotta/api/model/BonusModel$Type;

    if-ne p1, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method protected isNearby(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 140
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object v1

    .line 141
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result p2

    if-nez p2, :cond_1

    if-eqz v1, :cond_2

    .line 142
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getMaxRetailerDistance()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v0
.end method

.method protected isOtherReward(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 1

    .line 127
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
