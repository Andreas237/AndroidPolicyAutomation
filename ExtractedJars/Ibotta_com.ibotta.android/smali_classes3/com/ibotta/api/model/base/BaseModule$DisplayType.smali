.class public final enum Lcom/ibotta/api/model/base/BaseModule$DisplayType;
.super Ljava/lang/Enum;
.source "BaseModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/base/BaseModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DisplayType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/base/BaseModule$DisplayType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum BOXED:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum CIRCLES:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum GRID:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum QUESTS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum ROWS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

.field public static final enum SMALL_BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 32
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 33
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "CIRCLES"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->CIRCLES:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 34
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "BOXED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->BOXED:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 35
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "SMALL_BANNER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->SMALL_BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 36
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "ROWS"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ROWS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 37
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "QUESTS"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->QUESTS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    .line 38
    new-instance v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const-string v1, "GRID"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->GRID:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    const/4 v0, 0x7

    .line 31
    new-array v0, v0, [Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->CIRCLES:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->BOXED:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->SMALL_BANNER:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->ROWS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->QUESTS:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->GRID:Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->$VALUES:[Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/base/BaseModule$DisplayType;
    .locals 0

    .line 43
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/base/BaseModule$DisplayType;
    .locals 1

    .line 31
    const-class v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/base/BaseModule$DisplayType;
    .locals 1

    .line 31
    sget-object v0, Lcom/ibotta/api/model/base/BaseModule$DisplayType;->$VALUES:[Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/base/BaseModule$DisplayType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/base/BaseModule$DisplayType;

    return-object v0
.end method
