.class public final enum Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
.super Ljava/lang/Enum;
.source "PageView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/PageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MatchType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

.field public static final enum ORDER_CHECKOUT:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

.field public static final enum PRODUCT_VIEWED:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

.field public static final enum UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;


# instance fields
.field final matchType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 16
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    const-string v1, "PRODUCT_VIEWED"

    const-string v2, "product-viewed"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->PRODUCT_VIEWED:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    .line 17
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    const-string v1, "ORDER_CHECKOUT"

    const-string v2, "order-checkout"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->ORDER_CHECKOUT:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    .line 18
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    const-string v1, "UNKNOWN"

    const-string/jumbo v2, "unknown"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    const/4 v0, 0x3

    .line 15
    new-array v0, v0, [Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->PRODUCT_VIEWED:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->ORDER_CHECKOUT:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->$VALUES:[Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

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

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 31
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->matchType:Ljava/lang/String;

    return-void
.end method

.method public static getType(Ljava/lang/String;)Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
    .locals 5

    .line 41
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->values()[Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 42
    iget-object v4, v3, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->matchType:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 45
    :cond_1
    sget-object p0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
    .locals 1

    .line 15
    const-class v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
    .locals 1

    .line 15
    sget-object v0, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->$VALUES:[Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    return-object v0
.end method
