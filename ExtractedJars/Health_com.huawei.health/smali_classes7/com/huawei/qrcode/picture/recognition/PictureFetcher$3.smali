.class Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->recognitionQrcodePicture(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

.field final synthetic val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

.field final synthetic val$externalValue:Ljava/lang/String;

.field final synthetic val$iScanListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

.field final synthetic val$photoPath:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    iput-object p2, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$photoPath:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$externalValue:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$iScanListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    iput-object p5, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    invoke-static {}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->access$000()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$photoPath:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->access$100(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;ILjava/lang/String;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "PictureFetcher recognitionQrcodePicture result is not null, starut parse result."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    invoke-static {v1}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->access$200(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$externalValue:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$iScanListener:Lcom/huawei/qrcode/logic/IScanQrcodeListener;

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startAnalyzeQrcode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V

    goto :goto_0

    :cond_0
    const-string v0, "PictureFetcher recognitionQrcodePicture result is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;->onQRCodeResult(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
