.class Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/share/ShareConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DownImgAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/String;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/share/ShareConfig;


# direct methods
.method constructor <init>(Lcom/huawei/operation/share/ShareConfig;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .line 242
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$600(Lcom/huawei/operation/share/ShareConfig;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v1}, Lcom/huawei/operation/share/ShareConfig;->access$000(Lcom/huawei/operation/share/ShareConfig;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/https/HttpUtils;->obtionBitmap(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 243
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DownImgAsyncTask:obtionBitmap bm = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-object v4
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 238
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->doInBackground([Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 249
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 250
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0, p1}, Lcom/huawei/operation/share/ShareConfig;->access$702(Lcom/huawei/operation/share/ShareConfig;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 252
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$700(Lcom/huawei/operation/share/ShareConfig;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v1}, Lcom/huawei/operation/share/ShareConfig;->access$800(Lcom/huawei/operation/share/ShareConfig;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->access$702(Lcom/huawei/operation/share/ShareConfig;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$500(Lcom/huawei/operation/share/ShareConfig;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$900(Lcom/huawei/operation/share/ShareConfig;)V

    .line 260
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 238
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->onPostExecute(Landroid/graphics/Bitmap;)V

    return-void
.end method
