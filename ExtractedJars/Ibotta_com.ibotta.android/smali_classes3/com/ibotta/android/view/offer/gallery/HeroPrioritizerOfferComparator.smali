.class public Lcom/ibotta/android/view/offer/gallery/HeroPrioritizerOfferComparator;
.super Ljava/lang/Object;
.source "HeroPrioritizerOfferComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/OfferModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final fallbackComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/view/offer/gallery/HeroPrioritizerOfferComparator;->fallbackComparator:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I
    .locals 5

    .line 21
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v0

    .line 22
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v1

    .line 24
    sget-object v2, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    sget-object v2, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 27
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/view/offer/gallery/HeroPrioritizerOfferComparator;->fallbackComparator:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    :cond_2
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/view/offer/gallery/HeroPrioritizerOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
