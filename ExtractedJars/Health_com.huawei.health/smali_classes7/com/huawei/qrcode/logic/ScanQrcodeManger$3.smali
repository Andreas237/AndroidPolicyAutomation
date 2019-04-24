.class Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IAppInfoCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startAnalyzeQrcode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$eventId:Ljava/lang/String;

.field final synthetic val$qrcodeUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    iput-object p2, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$eventId:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$qrcodeUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppInfoFail(I)V
    .locals 3

    const-string v0, "ScanQrcodeManger onAppInfoFail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$qrcodeUrl:Ljava/lang/String;

    invoke-static {v0, v1, p1, v2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$400(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method

.method public onAppInfoSuccess(Ljava/lang/Object;)V
    .locals 4

    const-string v0, "ScanQrcodeManger onAppInfoSuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    move-object v3, p1

    check-cast v3, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$3;->val$eventId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v3, v2, v1}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->dealWithQrcodeApp(Landroid/content/Context;Lcom/huawei/qrcode/model/QrcodeAppInfo;ZLjava/lang/String;)V

    return-void
.end method
