.class Lcom/huawei/qrcode/CaptureActivity$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/CaptureActivity;->onActivityResult(IILandroid/content/Intent;)V
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

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQRCodeResult(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/CaptureActivity;->access$400(Lcom/huawei/qrcode/CaptureActivity;)V

    const-string v0, "CaptureActivity onQRCodeResult."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "CaptureActivity recognitionQrcodePicture success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0, p1}, Lcom/huawei/qrcode/CaptureActivity;->access$500(Lcom/huawei/qrcode/CaptureActivity;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity$4;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    const-string v3, "scanqrcode_sdk_not_found_qrcode"

    invoke-static {v2, v3}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    const-string v0, "CaptureActivity recognitionQrcodePicture fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method
