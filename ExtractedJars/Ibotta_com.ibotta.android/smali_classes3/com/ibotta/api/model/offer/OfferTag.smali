.class public Lcom/ibotta/api/model/offer/OfferTag;
.super Ljava/lang/Object;
.source "OfferTag.java"


# instance fields
.field private tag:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offer_tag"
    .end annotation
.end field

.field private weight:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offer_tag_weight"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/model/offer/OfferTag;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/ibotta/api/model/offer/OfferTag;->weight:I

    return v0
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/model/offer/OfferTag;->tag:Ljava/lang/String;

    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 19
    iput p1, p0, Lcom/ibotta/api/model/offer/OfferTag;->weight:I

    return-void
.end method
