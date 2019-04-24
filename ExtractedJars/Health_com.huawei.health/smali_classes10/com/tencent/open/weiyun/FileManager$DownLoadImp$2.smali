.class Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->getDownloadPermission()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)V
    .locals 0

    .line 658
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 660
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager;->c(Lcom/tencent/open/weiyun/FileManager;)Landroid/os/Bundle;

    move-result-object v4

    .line 661
    const-string v0, "file_id"

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2500(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/WeiyunFile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/open/weiyun/WeiyunFile;->getFileId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 663
    const-string v0, "thumb"

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2600(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    :cond_0
    const/4 v5, 0x0

    .line 667
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager;->d(Lcom/tencent/open/weiyun/FileManager;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2800(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    iget-object v3, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v3}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$2900(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3000(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "GET"

    invoke-static {v0, v1, v2, v4, v3}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 668
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 669
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->what:I

    .line 670
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 671
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_4

    .line 697
    goto/16 :goto_0

    .line 672
    :catch_0
    move-exception v6

    .line 673
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 674
    const/4 v0, -0x3

    iput v0, v7, Landroid/os/Message;->what:I

    .line 675
    invoke-virtual {v6}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 676
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 697
    goto/16 :goto_0

    .line 677
    :catch_1
    move-exception v6

    .line 678
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 679
    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 680
    const/4 v0, -0x2

    iput v0, v7, Landroid/os/Message;->what:I

    .line 681
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 697
    goto/16 :goto_0

    .line 682
    :catch_2
    move-exception v6

    .line 683
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 684
    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 685
    const/4 v0, -0x4

    iput v0, v7, Landroid/os/Message;->what:I

    .line 686
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 697
    goto :goto_0

    .line 687
    :catch_3
    move-exception v6

    .line 688
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 689
    invoke-virtual {v6}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 690
    const/16 v0, -0xa

    iput v0, v7, Landroid/os/Message;->what:I

    .line 691
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 697
    goto :goto_0

    .line 692
    :catch_4
    move-exception v6

    .line 693
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 694
    invoke-virtual {v6}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 695
    const/16 v0, -0x9

    iput v0, v7, Landroid/os/Message;->what:I

    .line 696
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$DownLoadImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$DownLoadImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$DownLoadImp;->access$3100(Lcom/tencent/open/weiyun/FileManager$DownLoadImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 698
    :goto_0
    return-void
.end method
