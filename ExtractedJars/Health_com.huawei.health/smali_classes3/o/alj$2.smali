.class Lo/alj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alj;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/alj;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/alj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lo/alj$2;->d:Lo/alj;

    iput-object p2, p0, Lo/alj$2;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/alj$2;->a:Ljava/lang/String;

    iput-object p4, p0, Lo/alj$2;->e:Ljava/lang/String;

    iput-object p5, p0, Lo/alj$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 4

    .line 282
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 287
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    invoke-virtual/range {p2 .. p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v7

    .line 289
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual/range {p2 .. p2}, Lokhttp3/Response;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_1

    .line 290
    :cond_0
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage null==responseBody || !response.isSuccessful()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    return-void

    .line 293
    :cond_1
    invoke-virtual {v7}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v8

    .line 294
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadAdImage contentLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-virtual {v7}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v10

    .line 296
    invoke-static {v10}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 297
    const/4 v0, 0x0

    if-ne v0, v11, :cond_2

    .line 298
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage null == bitmap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    return-void

    .line 301
    :cond_2
    move-object v12, v11

    .line 302
    const-string v0, "2"

    iget-object v1, p0, Lo/alj$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 303
    iget-object v0, p0, Lo/alj$2;->d:Lo/alj;

    invoke-static {v0}, Lo/alj;->a(Lo/alj;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f050785

    invoke-static {v1, v0}, Lo/fis;->a(ILandroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 304
    iget-object v0, p0, Lo/alj$2;->d:Lo/alj;

    invoke-static {v0}, Lo/alj;->a(Lo/alj;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0207d9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 305
    iget-object v0, p0, Lo/alj$2;->d:Lo/alj;

    invoke-static {v0}, Lo/alj;->a(Lo/alj;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v11, v13, v14, v0}, Lo/fis;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 306
    const/4 v0, 0x0

    if-ne v0, v12, :cond_3

    .line 307
    const-string v0, "Login_AdUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadAdImage null == newBitmap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    return-void

    .line 311
    :cond_3
    iget-object v0, p0, Lo/alj$2;->d:Lo/alj;

    invoke-static {v0}, Lo/alj;->d(Lo/alj;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v13

    .line 312
    new-instance v0, Lo/alj$d;

    move-object v1, v12

    iget-object v2, p0, Lo/alj$2;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/alj$2;->e:Ljava/lang/String;

    iget-object v4, p0, Lo/alj$2;->c:Ljava/lang/String;

    iget-object v5, p0, Lo/alj$2;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/alj$d;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/alj$5;)V

    move-object v14, v0

    .line 313
    iput-object v14, v13, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 314
    const/16 v0, 0xc8

    iput v0, v13, Landroid/os/Message;->what:I

    .line 315
    iget-object v0, p0, Lo/alj$2;->d:Lo/alj;

    invoke-static {v0}, Lo/alj;->d(Lo/alj;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 316
    return-void
.end method
