.class Lcom/huawei/qrcode/CaptureActivity$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IAppInfoCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/CaptureActivity;->startQuery()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/CaptureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity$6;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppInfoFail(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity onAppInfoFail code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$6;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/CaptureActivity;->access$900(Lcom/huawei/qrcode/CaptureActivity;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$6;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0, p1}, Lcom/huawei/qrcode/CaptureActivity;->access$1100(Lcom/huawei/qrcode/CaptureActivity;I)V

    return-void
.end method

.method public onAppInfoSuccess(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "CaptureActivity onAppInfoSuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$6;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/CaptureActivity;->access$900(Lcom/huawei/qrcode/CaptureActivity;)V

    const-string v0, "CaptureActivity onAppInfoSuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    move-object v2, p1

    check-cast v2, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$6;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0, v2}, Lcom/huawei/qrcode/CaptureActivity;->access$1000(Lcom/huawei/qrcode/CaptureActivity;Lcom/huawei/qrcode/model/QrcodeAppInfo;)V

    return-void
.end method
