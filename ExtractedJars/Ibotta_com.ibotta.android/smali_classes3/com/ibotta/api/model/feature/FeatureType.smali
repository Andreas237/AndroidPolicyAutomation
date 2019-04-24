.class public final enum Lcom/ibotta/api/model/feature/FeatureType;
.super Ljava/lang/Enum;
.source "FeatureType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/feature/FeatureType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/feature/FeatureType;

.field public static final enum BANNER:Lcom/ibotta/api/model/feature/FeatureType;

.field public static final enum BONUS:Lcom/ibotta/api/model/feature/FeatureType;

.field public static final enum DISCOUNT_BANNER:Lcom/ibotta/api/model/feature/FeatureType;

.field public static final enum HERO:Lcom/ibotta/api/model/feature/FeatureType;

.field public static final enum SMALL_BANNER:Lcom/ibotta/api/model/feature/FeatureType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 7
    new-instance v0, Lcom/ibotta/api/model/feature/FeatureType;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/feature/FeatureType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/feature/FeatureType;

    const-string v1, "DISCOUNT_BANNER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/feature/FeatureType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->DISCOUNT_BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/feature/FeatureType;

    const-string v1, "HERO"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/feature/FeatureType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->HERO:Lcom/ibotta/api/model/feature/FeatureType;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/feature/FeatureType;

    const-string v1, "BONUS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/feature/FeatureType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->BONUS:Lcom/ibotta/api/model/feature/FeatureType;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/feature/FeatureType;

    const-string v1, "SMALL_BANNER"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/feature/FeatureType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->SMALL_BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    const/4 v0, 0x5

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/feature/FeatureType;

    sget-object v1, Lcom/ibotta/api/model/feature/FeatureType;->BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/feature/FeatureType;->DISCOUNT_BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/feature/FeatureType;->HERO:Lcom/ibotta/api/model/feature/FeatureType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/feature/FeatureType;->BONUS:Lcom/ibotta/api/model/feature/FeatureType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/feature/FeatureType;->SMALL_BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/api/model/feature/FeatureType;->$VALUES:[Lcom/ibotta/api/model/feature/FeatureType;

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

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/feature/FeatureType;
    .locals 1

    if-nez p0, :cond_0

    .line 15
    sget-object p0, Lcom/ibotta/api/model/feature/FeatureType;->BANNER:Lcom/ibotta/api/model/feature/FeatureType;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/feature/FeatureType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/feature/FeatureType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/feature/FeatureType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/feature/FeatureType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/feature/FeatureType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/feature/FeatureType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/feature/FeatureType;->$VALUES:[Lcom/ibotta/api/model/feature/FeatureType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/feature/FeatureType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/feature/FeatureType;

    return-object v0
.end method
