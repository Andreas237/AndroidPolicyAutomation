.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;
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
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6580
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 6585
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 6586
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWifiBroadcastReceiver----onReceive intent ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=isagree="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->getAgreeUploadUseFlow()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6588
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 6589
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 6590
    const-string v0, "connectivity"

    .line 6591
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 6592
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CONNECTIVITY_ACTION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6594
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 6595
    if-eqz v5, :cond_4

    .line 6596
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6597
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\u8fde\u63a5\uff0c\u8bf7\u786e\u4fdd\u4f60\u5df2\u7ecf\u6253\u5f00\u7f51\u7edc "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6598
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6599
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6600
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 6602
    :cond_0
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 6604
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524dWiFi\u8fde\u63a5\u53ef\u7528 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 6605
    :cond_1
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    if-nez v0, :cond_3

    .line 6607
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->getAgreeUploadUseFlow()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6608
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6609
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6610
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6612
    :cond_2
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u79fb\u52a8\u7f51\u7edc\u8fde\u63a5\u53ef\u7528 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6615
    :cond_3
    :goto_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "info.getTypeName()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 6617
    :cond_4
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u6ca1\u6709\u7f51\u7edc\u8fde\u63a5\uff0c\u8bf7\u786e\u4fdd\u4f60\u5df2\u7ecf\u6253\u5f00\u7f51\u7edc "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6618
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6619
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6620
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6625
    :cond_5
    :goto_1
    return-void
.end method
