.class Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;->this$1:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public downLoadConnected(J)V
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;->this$1:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-static {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;J)V

    .line 198
    return-void
.end method

.method public downProgress(IJLjava/lang/String;)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;->this$1:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-static {v0, p4}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$002(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1$1;->this$1:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-static {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;IJ)V

    .line 192
    return-void
.end method
