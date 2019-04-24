.class public abstract Lcom/ibotta/api/model/base/BaseContent;
.super Ljava/lang/Object;
.source "BaseContent.java"

# interfaces
.implements Lcom/ibotta/api/model/ContentModel;


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonSubTypes;
    value = {
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Bonus"
            value = Lcom/ibotta/api/model/content/BonusContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "BuyableGiftCard"
            value = Lcom/ibotta/api/model/content/BuyableGiftCardContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Deal"
            value = Lcom/ibotta/api/model/content/DealContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Feature"
            value = Lcom/ibotta/api/model/content/FeatureContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "FeaturedRetailer"
            value = Lcom/ibotta/api/model/content/RetailerContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Offer"
            value = Lcom/ibotta/api/model/content/OfferContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Product"
            value = Lcom/ibotta/api/model/content/ProductContent;
        .end subannotation,
        .subannotation Lcom/fasterxml/jackson/annotation/JsonSubTypes$Type;
            name = "Retailer"
            value = Lcom/ibotta/api/model/content/RetailerContent;
        .end subannotation
    }
.end annotation

.annotation runtime Lcom/fasterxml/jackson/annotation/JsonTypeInfo;
    include = .enum Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;->PROPERTY:Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;
    property = "type"
    use = .enum Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;->NAME:Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;
    visible = true
.end annotation


# instance fields
.field private cacheKey:Ljava/lang/String;

.field private id:I

.field private idString:Ljava/lang/String;

.field private link:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sortOrder:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private transient typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

.field private typedId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCacheKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->cacheKey:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/api/model/base/BaseContent;->id:I

    return v0
.end method

.method public getIdString()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->idString:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->sortOrder:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

    if-eqz v0, :cond_0

    return-object v0

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/ContentModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

    .line 117
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->typeEnum:Lcom/ibotta/api/model/ContentModel$Type;

    return-object v0
.end method

.method public getTypedId()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/api/model/base/BaseContent;->typedId:Ljava/lang/String;

    return-object v0
.end method

.method public setCacheKey(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->cacheKey:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/api/model/base/BaseContent;->id:I

    return-void
.end method

.method public setIdString(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->idString:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->link:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->sortOrder:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->type:Ljava/lang/String;

    return-void
.end method

.method public setTypedId(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/api/model/base/BaseContent;->typedId:Ljava/lang/String;

    return-void
.end method
