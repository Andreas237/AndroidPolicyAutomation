.class Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->recognitionQrcodePicture(Landroid/net/Uri;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V
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

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;Landroid/net/Uri;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    iput-object p2, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->val$uri:Landroid/net/Uri;

    iput-object p3, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->this$0:Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    invoke-static {}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->access$300()I

    move-result v1

    const-string v2, ""

    iget-object v3, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->val$uri:Landroid/net/Uri;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->access$100(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;ILjava/lang/String;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->val$callback:Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;

    invoke-interface {v0, p1}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;->onQRCodeResult(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
