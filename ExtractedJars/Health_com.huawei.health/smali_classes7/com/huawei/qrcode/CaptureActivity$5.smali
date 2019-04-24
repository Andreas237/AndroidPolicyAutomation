.class Lcom/huawei/qrcode/CaptureActivity$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/IHandlerResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/CaptureActivity;->parseStrResult(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity$5;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onHandlerFail(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity onHandlerFail type---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$5;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0, p1}, Lcom/huawei/qrcode/CaptureActivity;->access$700(Lcom/huawei/qrcode/CaptureActivity;I)V

    return-void
.end method

.method public onHandlerSuccess()V
    .locals 3

    const-string v0, "CaptureActivity onHandlerSuccess."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$5;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "01"

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity$5;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v2}, Lcom/huawei/qrcode/CaptureActivity;->access$600(Lcom/huawei/qrcode/CaptureActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportIdentificationCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$5;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    return-void
.end method
