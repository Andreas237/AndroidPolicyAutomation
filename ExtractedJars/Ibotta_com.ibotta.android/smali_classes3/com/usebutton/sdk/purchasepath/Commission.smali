.class public Lcom/usebutton/sdk/purchasepath/Commission;
.super Ljava/lang/Object;
.source "Commission.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
    }
.end annotation


# instance fields
.field private commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;


# direct methods
.method private constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "commission_type"

    .line 59
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->getType(Ljava/lang/String;)Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/Commission;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/purchasepath/Commission;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "commission_type"

    .line 64
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 67
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/purchasepath/Commission;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/purchasepath/Commission;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 77
    instance-of v0, p1, Lcom/usebutton/sdk/purchasepath/Commission;

    if-nez v0, :cond_0

    goto :goto_0

    .line 78
    :cond_0
    check-cast p1, Lcom/usebutton/sdk/purchasepath/Commission;

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Commission;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    iget-object p1, p1, Lcom/usebutton/sdk/purchasepath/Commission;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getCommissionType()Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Commission;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/Commission;->commissionType:Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    invoke-virtual {v0}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->hashCode()I

    move-result v0

    const/16 v1, 0xcb

    add-int/2addr v1, v0

    return v1
.end method
