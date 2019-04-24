.class public Lcom/ibotta/api/model/promo/Promo;
.super Ljava/lang/Object;
.source "Promo.java"


# instance fields
.field private clickUrl:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private endTime:Ljava/util/Date;

.field private fullImageUrl:Ljava/lang/String;

.field private iconImageUrl:Ljava/lang/String;

.field private id:I

.field private instructions:Ljava/lang/String;

.field private promoCode:Ljava/lang/String;

.field private promoType:Ljava/lang/String;

.field private sortOrder:F

.field private startTime:Ljava/util/Date;

.field private terms:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getClickUrl()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->clickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/util/Date;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->endTime:Ljava/util/Date;

    return-object v0
.end method

.method public getFullImageUrl()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->fullImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIconImageUrl()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->iconImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/ibotta/api/model/promo/Promo;->id:I

    return v0
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->instructions:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoCode()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->promoCode:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoType()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->promoType:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoTypeEnum()Lcom/ibotta/api/model/promo/PromoType;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->promoType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/promo/PromoType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/promo/PromoType;

    move-result-object v0

    return-object v0
.end method

.method public getSortOrder()F
    .locals 1

    .line 57
    iget v0, p0, Lcom/ibotta/api/model/promo/Promo;->sortOrder:F

    return v0
.end method

.method public getStartTime()Ljava/util/Date;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->startTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTerms()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->terms:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/api/model/promo/Promo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->clickUrl:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->description:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(Ljava/util/Date;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->endTime:Ljava/util/Date;

    return-void
.end method

.method public setFullImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->fullImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setIconImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->iconImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/ibotta/api/model/promo/Promo;->id:I

    return-void
.end method

.method public setInstructions(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->instructions:Ljava/lang/String;

    return-void
.end method

.method public setPromoCode(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->promoCode:Ljava/lang/String;

    return-void
.end method

.method public setPromoType(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->promoType:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(F)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/ibotta/api/model/promo/Promo;->sortOrder:F

    return-void
.end method

.method public setStartTime(Ljava/util/Date;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->startTime:Ljava/util/Date;

    return-void
.end method

.method public setTerms(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->terms:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/promo/Promo;->title:Ljava/lang/String;

    return-void
.end method
