.class public Lcom/usebutton/sdk/internal/purchasepath/PageView;
.super Ljava/lang/Object;
.source "PageView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
    }
.end annotation


# instance fields
.field private commission:Lcom/usebutton/sdk/purchasepath/Commission;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private matchType:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

.field private product:Lcom/usebutton/sdk/purchasepath/Product;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;Lcom/usebutton/sdk/purchasepath/Product;Lcom/usebutton/sdk/purchasepath/Commission;)V
    .locals 0
    .param p2    # Lcom/usebutton/sdk/purchasepath/Product;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/purchasepath/Commission;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->matchType:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    .line 69
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->product:Lcom/usebutton/sdk/purchasepath/Product;

    .line 70
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->commission:Lcom/usebutton/sdk/purchasepath/Commission;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/purchasepath/PageView;
    .locals 5
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    const-string v1, "object"

    .line 74
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_4

    :cond_0
    const-string v1, "object"

    .line 78
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 79
    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    const-string v2, "match_type"

    .line 84
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "match_type"

    .line 85
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->getType(Ljava/lang/String;)Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    move-result-object v1

    :cond_1
    const-string v2, "commission"

    .line 89
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "commission"

    .line 90
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/purchasepath/Commission;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/purchasepath/Commission;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v0

    :goto_0
    const-string v3, "product"

    .line 94
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "product"

    .line 95
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/usebutton/sdk/purchasepath/Product;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/purchasepath/Product;

    move-result-object p0

    goto :goto_1

    :cond_3
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_4

    if-eqz v2, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 100
    :goto_2
    sget-object v4, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->PRODUCT_VIEWED:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    if-ne v4, v1, :cond_5

    if-nez v3, :cond_5

    .line 101
    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    move-object p0, v0

    goto :goto_3

    :cond_5
    move-object v0, v2

    .line 106
    :goto_3
    new-instance v2, Lcom/usebutton/sdk/internal/purchasepath/PageView;

    invoke-direct {v2, v1, p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/PageView;-><init>(Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;Lcom/usebutton/sdk/purchasepath/Product;Lcom/usebutton/sdk/purchasepath/Commission;)V

    return-object v2

    .line 75
    :cond_6
    :goto_4
    new-instance p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;

    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;->UNKNOWN:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    invoke-direct {p0, v1, v0, v0}, Lcom/usebutton/sdk/internal/purchasepath/PageView;-><init>(Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;Lcom/usebutton/sdk/purchasepath/Product;Lcom/usebutton/sdk/purchasepath/Commission;)V

    return-object p0
.end method


# virtual methods
.method public getCommission()Lcom/usebutton/sdk/purchasepath/Commission;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->commission:Lcom/usebutton/sdk/purchasepath/Commission;

    return-object v0
.end method

.method public getProduct()Lcom/usebutton/sdk/purchasepath/Product;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->product:Lcom/usebutton/sdk/purchasepath/Product;

    return-object v0
.end method

.method public getType()Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/PageView;->matchType:Lcom/usebutton/sdk/internal/purchasepath/PageView$MatchType;

    return-object v0
.end method
