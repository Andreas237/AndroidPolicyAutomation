.class public Lcom/ibotta/api/model/card/GiftCard;
.super Ljava/lang/Object;
.source "GiftCard.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/card/GiftCard$Template;,
        Lcom/ibotta/api/model/card/GiftCard$DenominationType;
    }
.end annotation


# instance fields
.field private barcodeType:Ljava/lang/String;

.field private cardNumberName:Ljava/lang/String;

.field private customerService:Ljava/lang/String;

.field private denominationType:Ljava/lang/String;

.field private denominationValues:[F

.field private description:Ljava/lang/String;

.field private featured:Z

.field private id:I

.field private legalText:Ljava/lang/String;

.field private longName:Ljava/lang/String;

.field private merchantLogo:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private pinNumberName:Ljava/lang/String;

.field private redemptionInstr:Ljava/lang/String;

.field private sortOrder:Ljava/lang/Integer;

.field private supportsBalance:Ljava/lang/Boolean;

.field private templates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;"
        }
    .end annotation
.end field

.field private terms:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBarcodeType()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->barcodeType:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumberName()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->cardNumberName:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerService()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->customerService:Ljava/lang/String;

    return-object v0
.end method

.method public getDenominationType()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationType:Ljava/lang/String;

    return-object v0
.end method

.method public getDenominationTypeEnum()Lcom/ibotta/api/model/card/GiftCard$DenominationType;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/card/GiftCard$DenominationType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/card/GiftCard$DenominationType;

    move-result-object v0

    return-object v0
.end method

.method public getDenominationValues()[F
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationValues:[F

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstTemplate()Lcom/ibotta/api/model/card/GiftCard$Template;
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/card/GiftCard$Template;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/api/model/card/GiftCard;->id:I

    return v0
.end method

.method public getLegalText()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->legalText:Ljava/lang/String;

    return-object v0
.end method

.method public getLongName()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->longName:Ljava/lang/String;

    return-object v0
.end method

.method public getMaximum()F
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationValues:[F

    if-eqz v0, :cond_1

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    .line 212
    :cond_0
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMerchantLogo()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->merchantLogo:Ljava/lang/String;

    return-object v0
.end method

.method public getMinimum()F
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationValues:[F

    if-eqz v0, :cond_1

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 204
    aget v0, v0, v1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPinNumberName()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->pinNumberName:Ljava/lang/String;

    return-object v0
.end method

.method public getRedemptionInstr()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->redemptionInstr:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/Integer;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->sortOrder:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTemplateFrontUrls()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 237
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    iget-object v1, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 240
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/card/GiftCard$Template;

    .line 241
    invoke-virtual {v2}, Lcom/ibotta/api/model/card/GiftCard$Template;->getFrontUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getTemplateThumbnails()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 227
    iget-object v1, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 228
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/card/GiftCard$Template;

    .line 229
    invoke-virtual {v2}, Lcom/ibotta/api/model/card/GiftCard$Template;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getTemplates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public isFeatured()Z
    .locals 1

    .line 184
    iget-boolean v0, p0, Lcom/ibotta/api/model/card/GiftCard;->featured:Z

    return v0
.end method

.method public isSupportsBalance()Z
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/api/model/card/GiftCard;->supportsBalance:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBarcodeType(Ljava/lang/String;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->barcodeType:Ljava/lang/String;

    return-void
.end method

.method public setCardNumberName(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->cardNumberName:Ljava/lang/String;

    return-void
.end method

.method public setCustomerService(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->customerService:Ljava/lang/String;

    return-void
.end method

.method public setDenominationType(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationType:Ljava/lang/String;

    return-void
.end method

.method public setDenominationValues([F)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->denominationValues:[F

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->description:Ljava/lang/String;

    return-void
.end method

.method public setFeatured(Z)V
    .locals 0

    .line 188
    iput-boolean p1, p0, Lcom/ibotta/api/model/card/GiftCard;->featured:Z

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/ibotta/api/model/card/GiftCard;->id:I

    return-void
.end method

.method public setLegalText(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->legalText:Ljava/lang/String;

    return-void
.end method

.method public setLongName(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->longName:Ljava/lang/String;

    return-void
.end method

.method public setMerchantLogo(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->merchantLogo:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->name:Ljava/lang/String;

    return-void
.end method

.method public setPinNumberName(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->pinNumberName:Ljava/lang/String;

    return-void
.end method

.method public setRedemptionInstr(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->redemptionInstr:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/Integer;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->sortOrder:Ljava/lang/Integer;

    return-void
.end method

.method public setSupportsBalance(Ljava/lang/Boolean;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->supportsBalance:Ljava/lang/Boolean;

    return-void
.end method

.method public setTemplates(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;)V"
        }
    .end annotation

    .line 196
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->templates:Ljava/util/List;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/api/model/card/GiftCard;->terms:Ljava/lang/String;

    return-void
.end method
