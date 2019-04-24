.class public Lcom/ibotta/api/model/content/ProductContent;
.super Lcom/ibotta/api/model/base/BaseContent;
.source "ProductContent.java"

# interfaces
.implements Lcom/ibotta/api/model/ProductModel;


# instance fields
.field private actionButtonText:Ljava/lang/String;

.field private actionButtonType:Ljava/lang/String;

.field private cacheKey:Ljava/lang/String;

.field private currentValue:Ljava/lang/String;

.field private deeplinkUrl:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private imageUrlLarge:Ljava/lang/String;

.field private imageUrlSmall:Ljava/lang/String;

.field private imageUrlThumbnail:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private price:F

.field private retailerId:I

.field private sortOrder:Ljava/lang/String;

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/model/base/BaseContent;-><init>()V

    return-void
.end method


# virtual methods
.method public getActionButtonText()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->actionButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public getActionButtonType()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->actionButtonType:Ljava/lang/String;

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getDeeplinkUrl()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->deeplinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getImageUrlLarge()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlLarge:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrlSmall()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlSmall:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrlThumbnail()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlThumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPrice()F
    .locals 1

    .line 132
    iget v0, p0, Lcom/ibotta/api/model/content/ProductContent;->price:F

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 140
    iget v0, p0, Lcom/ibotta/api/model/content/ProductContent;->retailerId:I

    return v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->sortOrder:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/api/model/content/ProductContent;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setActionButtonText(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->actionButtonText:Ljava/lang/String;

    return-void
.end method

.method public setActionButtonType(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->actionButtonType:Ljava/lang/String;

    return-void
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setDeeplinkUrl(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->deeplinkUrl:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->description:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    return-void
.end method

.method public setImageUrlLarge(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlLarge:Ljava/lang/String;

    return-void
.end method

.method public setImageUrlSmall(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlSmall:Ljava/lang/String;

    return-void
.end method

.method public setImageUrlThumbnail(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->imageUrlThumbnail:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->link:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setPrice(F)V
    .locals 0

    .line 136
    iput p1, p0, Lcom/ibotta/api/model/content/ProductContent;->price:F

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 144
    iput p1, p0, Lcom/ibotta/api/model/content/ProductContent;->retailerId:I

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->sortOrder:Ljava/lang/String;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/ibotta/api/model/content/ProductContent;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method
