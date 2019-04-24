.class Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwbtsdk/ui/BTDialogActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hwbtsdk/ui/BTDialogActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 1

    .line 491
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 492
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;->a:Ljava/lang/ref/WeakReference;

    .line 493
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 497
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    .line 499
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 500
    return-void

    .line 502
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "receive msg:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->what:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 503
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 505
    :sswitch_0
    invoke-virtual {v5}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 506
    invoke-static {v5}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Lhuawei/widget/HwProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 507
    invoke-static {v5}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 508
    invoke-static {v5}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_device_mgr_device_scan_completed_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 513
    :sswitch_1
    invoke-static {}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a()V

    .line 514
    .line 518
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
.end method
