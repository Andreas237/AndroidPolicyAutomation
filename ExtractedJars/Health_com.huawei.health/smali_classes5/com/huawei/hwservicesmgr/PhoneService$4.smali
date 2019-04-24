.class Lcom/huawei/hwservicesmgr/PhoneService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$4;->c:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 484
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 449
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "stepsNotifiState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 450
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOpenRealTimeStep :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    if-nez v4, :cond_0

    .line 452
    return-void

    .line 454
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$4;->c:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/cmj;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/PhoneService$4$5;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/PhoneService$4$5;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$4;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 474
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 479
    return-void
.end method
