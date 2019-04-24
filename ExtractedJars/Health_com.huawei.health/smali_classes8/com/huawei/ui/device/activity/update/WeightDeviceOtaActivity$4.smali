.class Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 8

    .line 533
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_2

    .line 534
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file dir name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/io/File;)Ljava/io/File;

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v5

    .line 539
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 540
    if-eqz v5, :cond_1

    array-length v0, v5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 541
    const/4 v7, 0x0

    :goto_0
    array-length v0, v5

    if-ge v7, v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    aget-object v1, v5, v7

    invoke-static {v0, v1, v6}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/io/File;Landroid/content/Intent;)V

    .line 541
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 545
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/Boolean;)V

    .line 546
    new-instance v0, Lo/ahi$a;

    const-string v1, "weight_device_ota_update"

    invoke-direct {v0, v1, v6}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    goto :goto_1

    .line 548
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 549
    const/4 v0, 0x6

    iput v0, v7, Landroid/os/Message;->what:I

    .line 550
    const/4 v0, 0x5

    iput v0, v7, Landroid/os/Message;->arg1:I

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 556
    :cond_2
    :goto_1
    return-void
.end method
