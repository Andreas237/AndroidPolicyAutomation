.class public final enum Lcom/usebutton/sdk/internal/models/BrowserCardType;
.super Ljava/lang/Enum;
.source "BrowserCardType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/internal/models/BrowserCardType;

.field public static final enum INSTALL_CARD:Lcom/usebutton/sdk/internal/models/BrowserCardType;

.field public static final enum INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

.field public static final enum PREDICTABLE_REWARDS_AVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

.field public static final enum PREDICTABLE_REWARDS_UNAVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

.field public static final enum UNKNOWN:Lcom/usebutton/sdk/internal/models/BrowserCardType;


# instance fields
.field private final apiValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 5
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const-string v1, "UNKNOWN"

    const-string/jumbo v2, "unknown"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/usebutton/sdk/internal/models/BrowserCardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->UNKNOWN:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 6
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const-string v1, "PREDICTABLE_REWARDS_AVAILABLE"

    const-string v2, "predictable_rewards_available"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/usebutton/sdk/internal/models/BrowserCardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_AVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 7
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const-string v1, "PREDICTABLE_REWARDS_UNAVAILABLE"

    const-string v2, "predictable_rewards_unavailable"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/usebutton/sdk/internal/models/BrowserCardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_UNAVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 8
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const-string v1, "INSTANT_REWARDS"

    const-string v2, "instant_rewards"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/usebutton/sdk/internal/models/BrowserCardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 9
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const-string v1, "INSTALL_CARD"

    const-string v2, "install_card"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/usebutton/sdk/internal/models/BrowserCardType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTALL_CARD:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const/4 v0, 0x5

    .line 3
    new-array v0, v0, [Lcom/usebutton/sdk/internal/models/BrowserCardType;

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->UNKNOWN:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_AVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_UNAVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTALL_CARD:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    aput-object v1, v0, v7

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->$VALUES:[Lcom/usebutton/sdk/internal/models/BrowserCardType;

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
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->apiValue:Ljava/lang/String;

    return-void
.end method

.method public static getCardType(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/BrowserCardType;
    .locals 5

    .line 22
    invoke-static {}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->values()[Lcom/usebutton/sdk/internal/models/BrowserCardType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 23
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getApiValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 28
    :cond_1
    sget-object p0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->UNKNOWN:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/BrowserCardType;
    .locals 1

    .line 3
    const-class v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/internal/models/BrowserCardType;
    .locals 1

    .line 3
    sget-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->$VALUES:[Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/internal/models/BrowserCardType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/internal/models/BrowserCardType;

    return-object v0
.end method


# virtual methods
.method public getApiValue()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->apiValue:Ljava/lang/String;

    return-object v0
.end method
