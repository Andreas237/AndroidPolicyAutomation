.class public Lcom/ibotta/android/view/common/CategoryOfferPair;
.super Ljava/lang/Object;
.source "CategoryOfferPair.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# instance fields
.field private availableWhere:Ljava/lang/String;

.field private category:Lcom/ibotta/api/model/offer/Category;

.field private final eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

.field private index:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    invoke-direct {p0, v0}, Lcom/ibotta/android/view/common/CategoryOfferPair;-><init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->createLink(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 66
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->category:Lcom/ibotta/api/model/offer/Category;

    if-eqz v0, :cond_1

    .line 70
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/Category;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferCategoryId(Ljava/lang/Integer;)V

    .line 72
    :cond_1
    iget v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setListIndex(Ljava/lang/Integer;)V

    return-void
.end method

.method public getAvailableWhere()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->availableWhere:Ljava/lang/String;

    return-object v0
.end method

.method public getCategory()Lcom/ibotta/api/model/offer/Category;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->category:Lcom/ibotta/api/model/offer/Category;

    return-object v0
.end method

.method public getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->index:I

    return v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public setAvailableWhere(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->availableWhere:Ljava/lang/String;

    return-void
.end method

.method public setCategory(Lcom/ibotta/api/model/offer/Category;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->category:Lcom/ibotta/api/model/offer/Category;

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->index:I

    return-void
.end method

.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/view/common/CategoryOfferPair;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method
