.class Lo/dez$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dez;


# direct methods
.method constructor <init>(Lo/dez;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lo/dez$2;->d:Lo/dez;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 368
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 369
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onReceive deviceStatusReceiver:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 370
    if-nez v5, :cond_0

    .line 371
    return-void

    .line 372
    :cond_0
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 374
    const-string v0, "deviceinfo"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 375
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 376
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x17

    if-eq v1, v0, :cond_1

    .line 377
    iget-object v0, p0, Lo/dez$2;->d:Lo/dez;

    invoke-static {v0, v6}, Lo/dez;->a(Lo/dez;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 379
    :cond_1
    iget-object v0, p0, Lo/dez$2;->d:Lo/dez;

    invoke-static {v0}, Lo/dez;->c(Lo/dez;)Lo/dfv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 380
    iget-object v0, p0, Lo/dez$2;->d:Lo/dez;

    invoke-static {v0}, Lo/dez;->c(Lo/dez;)Lo/dfv;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dfv;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 383
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/dez$2;->d:Lo/dez;

    new-instance v1, Lo/dez$2$4;

    invoke-direct {v1, p0}, Lo/dez$2$4;-><init>(Lo/dez$2;)V

    invoke-virtual {v0, v1}, Lo/dez;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 390
    :cond_3
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceStatusReceiver() deviceInfo is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 394
    :goto_1
    goto :goto_2

    .line 392
    :catch_0
    move-exception v6

    .line 393
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " deviceStatusReceiver Exception :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 396
    :cond_4
    :goto_2
    return-void
.end method
