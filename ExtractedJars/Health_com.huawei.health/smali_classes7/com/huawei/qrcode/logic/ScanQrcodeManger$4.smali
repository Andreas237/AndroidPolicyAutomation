.class Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startQueryApp(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IAppInfoCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

.field final synthetic val$scanResult:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    iput-object p2, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->val$scanResult:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQueryFailCallBack(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanQrcodeManger onQueryFailCallBack code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$600(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$600(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    move-result-object v0

    const/16 v1, -0x12f

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/IAppInfoCallBack;->onAppInfoFail(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$600(Lcom/huawei/qrcode/logic/ScanQrcodeManger;)Lcom/huawei/qrcode/logic/IAppInfoCallBack;

    move-result-object v0

    const/16 v1, -0x130

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/IAppInfoCallBack;->onAppInfoFail(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onQuerySuccessCallBack(Ljava/lang/String;)V
    .locals 2

    const-string v0, "ScanQrcodeManger onQuerySuccessCallBack."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "onQuerySuccessCallBack object is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->this$0:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$4;->val$scanResult:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->access$500(Lcom/huawei/qrcode/logic/ScanQrcodeManger;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
