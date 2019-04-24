.class public final enum Lcom/ibotta/api/model/offer/Multiples;
.super Ljava/lang/Enum;
.source "Multiples.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/offer/Multiples;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/offer/Multiples;

.field public static final enum ANY:Lcom/ibotta/api/model/offer/Multiples;

.field public static final enum NONE:Lcom/ibotta/api/model/offer/Multiples;

.field public static final enum UNIQUE:Lcom/ibotta/api/model/offer/Multiples;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 7
    new-instance v0, Lcom/ibotta/api/model/offer/Multiples;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/offer/Multiples;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/offer/Multiples;

    const-string v1, "ANY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/offer/Multiples;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/offer/Multiples;->ANY:Lcom/ibotta/api/model/offer/Multiples;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/offer/Multiples;

    const-string v1, "UNIQUE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/offer/Multiples;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/offer/Multiples;->UNIQUE:Lcom/ibotta/api/model/offer/Multiples;

    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/offer/Multiples;

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->ANY:Lcom/ibotta/api/model/offer/Multiples;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->UNIQUE:Lcom/ibotta/api/model/offer/Multiples;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/offer/Multiples;->$VALUES:[Lcom/ibotta/api/model/offer/Multiples;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    if-nez p0, :cond_0

    .line 14
    sget-object p0, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/offer/Multiples;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v0, :cond_1

    .line 25
    sget-object v0, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/offer/Multiples;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/offer/Multiples;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/offer/Multiples;->$VALUES:[Lcom/ibotta/api/model/offer/Multiples;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/offer/Multiples;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/offer/Multiples;

    return-object v0
.end method
