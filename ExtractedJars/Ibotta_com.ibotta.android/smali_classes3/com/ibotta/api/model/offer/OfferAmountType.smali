.class public final enum Lcom/ibotta/api/model/offer/OfferAmountType;
.super Ljava/lang/Enum;
.source "OfferAmountType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/offer/OfferAmountType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/offer/OfferAmountType;

.field public static final enum COMBO:Lcom/ibotta/api/model/offer/OfferAmountType;

.field public static final enum DEFAULT:Lcom/ibotta/api/model/offer/OfferAmountType;

.field public static final enum MULTIPLE:Lcom/ibotta/api/model/offer/OfferAmountType;


# instance fields
.field private final trackingName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 11
    new-instance v0, Lcom/ibotta/api/model/offer/OfferAmountType;

    const-string v1, "DEFAULT"

    const-string v2, "default"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/offer/OfferAmountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferAmountType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferAmountType;

    .line 16
    new-instance v0, Lcom/ibotta/api/model/offer/OfferAmountType;

    const-string v1, "MULTIPLE"

    const-string v2, "multiple"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/offer/OfferAmountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferAmountType;->MULTIPLE:Lcom/ibotta/api/model/offer/OfferAmountType;

    .line 21
    new-instance v0, Lcom/ibotta/api/model/offer/OfferAmountType;

    const-string v1, "COMBO"

    const-string v2, "combo"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/offer/OfferAmountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/OfferAmountType;->COMBO:Lcom/ibotta/api/model/offer/OfferAmountType;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/api/model/offer/OfferAmountType;

    sget-object v1, Lcom/ibotta/api/model/offer/OfferAmountType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferAmountType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/offer/OfferAmountType;->MULTIPLE:Lcom/ibotta/api/model/offer/OfferAmountType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/offer/OfferAmountType;->COMBO:Lcom/ibotta/api/model/offer/OfferAmountType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/model/offer/OfferAmountType;->$VALUES:[Lcom/ibotta/api/model/offer/OfferAmountType;

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

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 26
    iput-object p3, p0, Lcom/ibotta/api/model/offer/OfferAmountType;->trackingName:Ljava/lang/String;

    return-void
.end method

.method public static create(ZZ)Lcom/ibotta/api/model/offer/OfferAmountType;
    .locals 0

    if-eqz p0, :cond_0

    .line 36
    sget-object p0, Lcom/ibotta/api/model/offer/OfferAmountType;->COMBO:Lcom/ibotta/api/model/offer/OfferAmountType;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 38
    sget-object p0, Lcom/ibotta/api/model/offer/OfferAmountType;->MULTIPLE:Lcom/ibotta/api/model/offer/OfferAmountType;

    goto :goto_0

    .line 40
    :cond_1
    sget-object p0, Lcom/ibotta/api/model/offer/OfferAmountType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferAmountType;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/offer/OfferAmountType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/api/model/offer/OfferAmountType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/offer/OfferAmountType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/offer/OfferAmountType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/api/model/offer/OfferAmountType;->$VALUES:[Lcom/ibotta/api/model/offer/OfferAmountType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/offer/OfferAmountType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/offer/OfferAmountType;

    return-object v0
.end method


# virtual methods
.method public getTrackingName()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/api/model/offer/OfferAmountType;->trackingName:Ljava/lang/String;

    return-object v0
.end method
