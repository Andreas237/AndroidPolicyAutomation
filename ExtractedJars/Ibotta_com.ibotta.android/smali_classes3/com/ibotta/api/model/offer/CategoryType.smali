.class public final enum Lcom/ibotta/api/model/offer/CategoryType;
.super Ljava/lang/Enum;
.source "CategoryType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/offer/CategoryType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/offer/CategoryType;

.field public static final enum NORMAL:Lcom/ibotta/api/model/offer/CategoryType;

.field public static final enum SYNTHESIZED:Lcom/ibotta/api/model/offer/CategoryType;


# instance fields
.field private apiName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/api/model/offer/CategoryType;

    const-string v1, "NORMAL"

    const-string v2, "normal"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/offer/CategoryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/CategoryType;->NORMAL:Lcom/ibotta/api/model/offer/CategoryType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/offer/CategoryType;

    const-string v1, "SYNTHESIZED"

    const-string v2, "synthesized"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/offer/CategoryType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/offer/CategoryType;->SYNTHESIZED:Lcom/ibotta/api/model/offer/CategoryType;

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [Lcom/ibotta/api/model/offer/CategoryType;

    sget-object v1, Lcom/ibotta/api/model/offer/CategoryType;->NORMAL:Lcom/ibotta/api/model/offer/CategoryType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/offer/CategoryType;->SYNTHESIZED:Lcom/ibotta/api/model/offer/CategoryType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/offer/CategoryType;->$VALUES:[Lcom/ibotta/api/model/offer/CategoryType;

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

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 14
    iput-object p3, p0, Lcom/ibotta/api/model/offer/CategoryType;->apiName:Ljava/lang/String;

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/CategoryType;
    .locals 5

    .line 24
    invoke-static {}, Lcom/ibotta/api/model/offer/CategoryType;->values()[Lcom/ibotta/api/model/offer/CategoryType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 25
    invoke-virtual {v3}, Lcom/ibotta/api/model/offer/CategoryType;->getApiName()Ljava/lang/String;

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

    .line 32
    sget-object v3, Lcom/ibotta/api/model/offer/CategoryType;->NORMAL:Lcom/ibotta/api/model/offer/CategoryType;

    :cond_2
    return-object v3
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/offer/CategoryType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/api/model/offer/CategoryType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/offer/CategoryType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/offer/CategoryType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/api/model/offer/CategoryType;->$VALUES:[Lcom/ibotta/api/model/offer/CategoryType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/offer/CategoryType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/offer/CategoryType;

    return-object v0
.end method


# virtual methods
.method public getApiName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/api/model/offer/CategoryType;->apiName:Ljava/lang/String;

    return-object v0
.end method
