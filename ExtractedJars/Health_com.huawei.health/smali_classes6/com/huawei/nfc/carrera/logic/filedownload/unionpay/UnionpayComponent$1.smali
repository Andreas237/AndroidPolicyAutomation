.class Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->install(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

.field final synthetic val$apkFile:Ljava/io/File;

.field final synthetic val$signature:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->val$apkFile:Ljava/io/File;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->val$signature:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->val$apkFile:Ljava/io/File;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->val$signature:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->val$apkFile:Ljava/io/File;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;)Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->sendWrongSignMessage()V

    .line 137
    :goto_0
    return-void
.end method
