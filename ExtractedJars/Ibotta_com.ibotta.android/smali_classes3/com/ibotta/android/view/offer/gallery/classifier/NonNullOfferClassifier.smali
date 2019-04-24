.class public Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;
.super Ljava/lang/Object;
.source "NonNullOfferClassifier.java"

# interfaces
.implements Lcom/ibotta/android/view/offer/gallery/classifier/OfferClassifier;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public matches(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
