.class Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$DownLoadImp;-><init>(Lcom/tencent/open/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;Lcom/tencent/open/weiyun/WeiyunFile;Ljava/lang/String;Lcom/tencent/open/weiyun/IDownLoadFileCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

.field final synthetic val$this$0:Lcom/tencent/open/weiyun/FileManager;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Landroid/os/Looper;Lcom/tencent/open/weiyun/FileManager;)V
    .locals 0

    .line 569
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    iput-object p3, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->val$this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 572
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 574
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 576
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 577
    if-eqz v6, :cond_0

    .line 578
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v6, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 579
    return-void

    .line 581
    :cond_0
    const-string v0, "data"

    :try_start_1
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 582
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_encrypt_url"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1602(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_cookie_name"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1702(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;

    .line 584
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_cookie_value"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1802(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;

    .line 585
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_svr_port"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1902(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;I)I

    .line 586
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_svr_host"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2002(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;

    .line 587
    const-string v0, "dl_thumb_size"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 588
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    const-string v1, "dl_thumb_size"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2102(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 593
    :cond_1
    goto :goto_0

    .line 590
    :catch_0
    move-exception v6

    .line 591
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x4

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V

    .line 592
    return-void

    .line 594
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onDownloadStart()V

    .line 595
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2200(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)V

    .line 596
    goto :goto_2

    .line 598
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 599
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 600
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onDownloadProgress(I)V

    .line 601
    goto :goto_2

    .line 603
    :pswitch_2
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2300(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onDownloadSuccess(Ljava/lang/String;)V

    .line 604
    goto :goto_2

    .line 606
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$1500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/IDownLoadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    iget v2, p1, Landroid/os/Message;->what:I

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IDownLoadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V

    .line 608
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
