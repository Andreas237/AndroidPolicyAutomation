.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6386
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 6390
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6392
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isNoNetworkActive(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6393
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6394
    return-void

    .line 6396
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6398
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_background:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6399
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6b63\u5728\u8fdb\u884clog\u6d41\u91cf\u4e0a\u4f20"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6400
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->startUploadLogWithNetwork(Landroid/content/Context;)V

    .line 6401
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 6402
    const/16 v0, 0x3fd

    iput v0, v4, Landroid/os/Message;->what:I

    .line 6403
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 6404
    return-void
.end method
