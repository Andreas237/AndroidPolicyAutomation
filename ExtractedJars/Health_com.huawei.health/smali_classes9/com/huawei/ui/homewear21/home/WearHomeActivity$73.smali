.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6628
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 6631
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6632
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "log\u91c7\u96c6\u8fd8\u6ca1\u6709\u624b\u52a8\u4e0a\u4f20log"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6633
    return-void

    .line 6636
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 6637
    return-void

    .line 6639
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 6640
    const-string v0, "com.huawei.crowdtestsdk.LOG_UPLOAD_RESULT"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 6641
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6642
    const-string v0, "logUploadResult"

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 6643
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0a\u4f20\u7ed3\u679c\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6645
    const/16 v0, 0x10

    if-eq v0, v5, :cond_4

    .line 6646
    const-string v0, "LogUploadFilePath"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 6647
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file\uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6648
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 6649
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->ENCYPTION_PATH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6650
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6651
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUploadLogResultBroadcastReceiver: log upload failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6652
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6659
    return-void

    .line 6662
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fe

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6663
    goto :goto_0

    .line 6664
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fe

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 6667
    :cond_5
    :goto_0
    return-void
.end method
