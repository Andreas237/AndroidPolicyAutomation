.class public final enum Lcom/ibotta/api/model/offer/OfferType;
.super Ljava/lang/Enum;
.source "OfferType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/offer/OfferType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/offer/OfferType;

.field public static final enum DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

.field public static final enum HERO:Lcom/ibotta/api/model/offer/OfferType;

.field public static final enum PROMO:Lcom/ibotta/api/model/offer/OfferType;

.field public static final enum SALE:Lcom/ibotta/api/model/offer/OfferType;

.field public static final enum SPECIAL:Lcom/ibotta/api/model/offer/OfferType;


# instance fields
.field private apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 4
    new-instance v0, Lcom/ibotta/api/model/offer/OfferType;

    const-string v1, "DEFAULT"

    const-string v2, "default"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/offer/OfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    .line 5
    new-instance v0, Lcom/ibotta/api/model/offer/OfferType;

    const-string v1, "SPECIAL"

    const-string v2, "special"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/offer/OfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->SPECIAL:Lcom/ibotta/api/model/offer/OfferType;

    .line 6
    new-instance v0, Lcom/ibotta/api/model/offer/OfferType;

    const-string v1, "HERO"

    const-string v2, "hero"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/offer/OfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    .line 7
    new-instance v0, Lcom/ibotta/api/model/offer/OfferType;

    const-string v1, "SALE"

    const-string v2, "sale"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/model/offer/OfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->SALE:Lcom/ibotta/api/model/offer/OfferType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/offer/OfferType;

    const-string v1, "PROMO"

    const-string v2, "promo"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/api/model/offer/OfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->PROMO:Lcom/ibotta/api/model/offer/OfferType;

    const/4 v0, 0x5

    .line 3
    new-array v0, v0, [Lcom/ibotta/api/model/offer/OfferType;

    sget-object v1, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/offer/OfferType;->SPECIAL:Lcom/ibotta/api/model/offer/OfferType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/offer/OfferType;->SALE:Lcom/ibotta/api/model/offer/OfferType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/offer/OfferType;->PROMO:Lcom/ibotta/api/model/offer/OfferType;

    aput-object v1, v0, v7

    sput-object v0, Lcom/ibotta/api/model/offer/OfferType;->$VALUES:[Lcom/ibotta/api/model/offer/OfferType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 13
    iput-object p3, p0, Lcom/ibotta/api/model/offer/OfferType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/OfferType;
    .locals 5

    .line 23
    invoke-static {}, Lcom/ibotta/api/model/offer/OfferType;->values()[Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 24
    invoke-virtual {v3}, Lcom/ibotta/api/model/offer/OfferType;->getApiName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    .line 31
    sget-object v3, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    :cond_2
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/offer/OfferType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/api/model/offer/OfferType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/offer/OfferType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/offer/OfferType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->$VALUES:[Lcom/ibotta/api/model/offer/OfferType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/offer/OfferType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/offer/OfferType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/model/offer/OfferType;->apiName:Ljava/lang/String;

    return-object v0
.end method
