.class public Lcom/ibotta/api/model/offer/RecommendationScoreOfferComparator;
.super Lcom/ibotta/api/model/offer/HotOfferComparator;
.source "RecommendationScoreOfferComparator.java"


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/model/offer/HotOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I
    .locals 3

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 v0, -0x1

    if-nez p2, :cond_2

    return v0

    .line 24
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRecommendationScore()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getRecommendationScore()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v1

    mul-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_3

    .line 28
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/model/offer/HotOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v1

    :cond_3
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/offer/RecommendationScoreOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
