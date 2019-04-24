.class Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;
.super Lo/djw$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-direct {p0}, Lo/djw$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 5

    .line 405
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState percentage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 411
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 412
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 413
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState percentage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 416
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAW70UpdateInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 420
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 421
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 422
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState percentage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 425
    :cond_2
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOtaInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    :cond_3
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 452
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileRespond: checkResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 456
    if-eqz p1, :cond_0

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 458
    const/4 v0, 0x5

    iput v0, v4, Landroid/os/Message;->what:I

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 460
    goto :goto_0

    .line 461
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileRespond DeviceUpgradeCallback, i != 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 463
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 464
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 468
    :cond_1
    :goto_0
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 5

    .line 433
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onUpgradeFailed: onUpgradeFailed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorMessage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 436
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5355\u677f\u5347\u7ea7\u8d85\u65f6\u4e3a\u4e0a\u6b21\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 439
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 440
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 441
    const v0, 0x1a9ca

    if-ne v0, p1, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 442
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a(I)I

    .line 443
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5355\u677f\u5347\u7ea7\u7535\u91cf\u95e8\u9650\u503c\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;->d:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->sendMessage(Landroid/os/Message;)Z

    .line 448
    :cond_2
    :goto_0
    return-void
.end method
