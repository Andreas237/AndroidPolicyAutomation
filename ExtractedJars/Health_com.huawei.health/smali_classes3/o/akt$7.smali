.class Lo/akt$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/flc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 765
    iput-object p1, p0, Lo/akt$7;->e:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 792
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 793
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 787
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aks;->l(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 788
    return-void
.end method

.method public b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 768
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->d(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 769
    return-void
.end method

.method public c()Z
    .locals 3

    .line 773
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 774
    if-eqz v2, :cond_1

    .line 775
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 776
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 777
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x15

    if-eq v0, v1, :cond_0

    .line 778
    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    .line 779
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 782
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
