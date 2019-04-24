.class Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->downLoad(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

.field final synthetic val$savePath:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->val$savePath:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->fileDownloadApi:Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->val$url:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->val$savePath:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v3, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;

    invoke-direct {v3, p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->download(Ljava/lang/String;Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;)I

    move-result v4

    .line 201
    if-nez v4, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$300(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;)V

    goto :goto_0

    .line 205
    :cond_0
    const/4 v0, -0x5

    if-ne v4, v0, :cond_1

    .line 207
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$400(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;I)V

    goto :goto_0

    .line 211
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-static {v0, v4}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$400(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;I)V

    .line 213
    :goto_0
    return-void
.end method
