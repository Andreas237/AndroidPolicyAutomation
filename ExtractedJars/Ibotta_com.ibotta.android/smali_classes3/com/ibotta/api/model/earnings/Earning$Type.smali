.class public final enum Lcom/ibotta/api/model/earnings/Earning$Type;
.super Ljava/lang/Enum;
.source "Earning.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/earnings/Earning;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/earnings/Earning$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/earnings/Earning$Type;

.field public static final enum BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

.field public static final enum GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

.field public static final enum RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;


# instance fields
.field private final apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 57
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$Type;

    const-string v1, "RECEIPT"

    const-string v2, "receipt"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/earnings/Earning$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    .line 58
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$Type;

    const-string v1, "BONUS"

    const-string v2, "customerbonus"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/earnings/Earning$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

    .line 59
    new-instance v0, Lcom/ibotta/api/model/earnings/Earning$Type;

    const-string v1, "GIFT_CARD"

    const-string v2, "customerbuyablegiftcard"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/earnings/Earning$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

    const/4 v0, 0x3

    .line 56
    new-array v0, v0, [Lcom/ibotta/api/model/earnings/Earning$Type;

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->$VALUES:[Lcom/ibotta/api/model/earnings/Earning$Type;

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

    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    iput-object p3, p0, Lcom/ibotta/api/model/earnings/Earning$Type;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$Type;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 76
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 79
    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 80
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->RECEIPT:Lcom/ibotta/api/model/earnings/Earning$Type;

    goto :goto_0

    .line 81
    :cond_1
    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 82
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->BONUS:Lcom/ibotta/api/model/earnings/Earning$Type;

    goto :goto_0

    .line 83
    :cond_2
    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$Type;->GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 84
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->GIFT_CARD:Lcom/ibotta/api/model/earnings/Earning$Type;

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/earnings/Earning$Type;
    .locals 1

    .line 56
    const-class v0, Lcom/ibotta/api/model/earnings/Earning$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/earnings/Earning$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/earnings/Earning$Type;
    .locals 1

    .line 56
    sget-object v0, Lcom/ibotta/api/model/earnings/Earning$Type;->$VALUES:[Lcom/ibotta/api/model/earnings/Earning$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/earnings/Earning$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/earnings/Earning$Type;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/earnings/Earning$Type;->apiName:Ljava/lang/String;

    return-object v0
.end method
