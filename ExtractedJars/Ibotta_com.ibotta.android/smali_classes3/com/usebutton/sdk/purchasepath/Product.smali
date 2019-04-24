.class public Lcom/usebutton/sdk/purchasepath/Product;
.super Ljava/lang/Object;
.source "Product.java"


# instance fields
.field private uri:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "url"

    .line 24
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/Product;->uri:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/purchasepath/Product;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "url"

    .line 29
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 32
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/purchasepath/Product;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/purchasepath/Product;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 43
    instance-of v0, p1, Lcom/usebutton/sdk/purchasepath/Product;

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/purchasepath/Product;

    .line 47
    invoke-virtual {p0}, Lcom/usebutton/sdk/purchasepath/Product;->getUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/Product;->getUri()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getUri()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Product;->uri:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Product;->uri:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0xcb

    add-int/2addr v1, v0

    return v1
.end method
