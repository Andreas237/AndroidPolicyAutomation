.class public final enum Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;
.super Ljava/lang/Enum;
.source "OfferBadgeMultiples.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;",
        "",
        "drawableResId",
        "",
        "(Ljava/lang/String;II)V",
        "getDrawableResId",
        "()I",
        "ONE",
        "TWO",
        "THREE",
        "FOUR",
        "FIVE",
        "FIVE_PLUS",
        "Companion",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final Companion:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;

.field public static final enum FIVE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final enum FIVE_PLUS:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final enum FOUR:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final enum ONE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final enum THREE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

.field public static final enum TWO:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;


# instance fields
.field private final drawableResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "ONE"

    .line 7
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_1:I

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->ONE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "TWO"

    .line 8
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_2:I

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->TWO:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "THREE"

    .line 9
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_3:I

    const/4 v4, 0x2

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->THREE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "FOUR"

    .line 10
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_4:I

    const/4 v4, 0x3

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->FOUR:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "FIVE"

    .line 11
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_5:I

    const/4 v4, 0x4

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->FIVE:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    new-instance v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    const-string v2, "FIVE_PLUS"

    .line 12
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_number_5_plus:I

    const/4 v4, 0x5

    invoke-direct {v1, v2, v4, v3}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->FIVE_PLUS:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->$VALUES:[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    new-instance v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->Companion:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->drawableResId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;
    .locals 1

    const-class v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;
    .locals 1

    sget-object v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->$VALUES:[Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    invoke-virtual {v0}, [Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    return-object v0
.end method


# virtual methods
.method public final getDrawableResId()I
    .locals 1

    .line 6
    iget v0, p0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->drawableResId:I

    return v0
.end method
