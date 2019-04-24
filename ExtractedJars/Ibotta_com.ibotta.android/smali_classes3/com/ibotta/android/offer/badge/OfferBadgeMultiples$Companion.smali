.class public final Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;
.super Ljava/lang/Object;
.source "OfferBadgeMultiples.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;",
        "",
        "()V",
        "fromQuantity",
        "Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;",
        "quantity",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromQuantity(I)Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-gtz p1, :cond_0

    .line 17
    sget-object p1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->ONE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->values()[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    move-result-object v0

    array-length v0, v0

    if-lt p1, v0, :cond_1

    sget-object p1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->FIVE_PLUS:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    goto :goto_0

    .line 19
    :cond_1
    invoke-static {}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->values()[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    move-result-object v0

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    :goto_0
    return-object p1
.end method
