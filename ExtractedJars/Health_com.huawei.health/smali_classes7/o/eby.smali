.class public Lo/eby;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private c:Landroid/content/Context;

.field private d:Lo/dav;

.field private e:Lcom/sina/weibo/sdk/share/WbShareHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/dav;Lcom/sina/weibo/sdk/share/WbShareHandler;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lo/eby;->c:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lo/eby;->d:Lo/dav;

    .line 62
    iput-object p3, p0, Lo/eby;->e:Lcom/sina/weibo/sdk/share/WbShareHandler;

    .line 63
    return-void
.end method

.method private a(Landroid/content/Context;)Z
    .locals 1

    .line 72
    iget-object v0, p0, Lo/eby;->e:Lcom/sina/weibo/sdk/share/WbShareHandler;

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/share/WbShareHandler;->isWbAppInstalled()Z

    move-result v0

    return v0
.end method

.method private b()Lcom/sina/weibo/sdk/api/ImageObject;
    .locals 7

    .line 225
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    if-nez v0, :cond_0

    .line 226
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImageObj() if (mShareContent == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, 0x0

    return-object v0

    .line 229
    :cond_0
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 230
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR sharePicture is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    return-object v0

    .line 233
    :cond_1
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR sharePicture is recycled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const/4 v0, 0x0

    return-object v0

    .line 237
    :cond_2
    const/4 v4, 0x0

    .line 238
    new-instance v5, Lcom/sina/weibo/sdk/api/ImageObject;

    invoke-direct {v5}, Lcom/sina/weibo/sdk/api/ImageObject;-><init>()V

    .line 239
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v6

    .line 241
    if-nez v6, :cond_3

    .line 242
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImageObj() if (picResource == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->huafen_share_img_zero:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_1

    .line 246
    :cond_3
    invoke-static {}, Lo/ebk;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/eby;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 248
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eby;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v6, v1}, Lo/dbk;->d(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_0

    .line 250
    :cond_4
    move-object v4, v6

    .line 253
    :goto_0
    if-nez v4, :cond_5

    .line 254
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImageObj() if (newBmp == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v0, 0x0

    return-object v0

    .line 258
    :cond_5
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 259
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v1}, Lo/dav;->c()I

    move-result v1

    invoke-static {v0, v4, v1}, Lo/dbk;->c(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_1

    .line 261
    :cond_6
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbk;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 266
    :goto_1
    if-nez v4, :cond_7

    .line 267
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getImageObj() if (newBmp == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    const/4 v0, 0x0

    return-object v0

    .line 270
    :cond_7
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newBmp.getByteCount()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    invoke-virtual {v5, v4}, Lcom/sina/weibo/sdk/api/ImageObject;->setImageObject(Landroid/graphics/Bitmap;)V

    .line 273
    return-object v5
.end method

.method private c()Lcom/sina/weibo/sdk/api/TextObject;
    .locals 2

    .line 213
    new-instance v1, Lcom/sina/weibo/sdk/api/TextObject;

    invoke-direct {v1}, Lcom/sina/weibo/sdk/api/TextObject;-><init>()V

    .line 214
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/sina/weibo/sdk/api/TextObject;->text:Ljava/lang/String;

    .line 215
    return-object v1
.end method

.method private d(ZZZ)V
    .locals 6

    .line 172
    new-instance v4, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-direct {v4}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;-><init>()V

    .line 173
    if-eqz p1, :cond_0

    .line 174
    invoke-direct {p0}, Lo/eby;->c()Lcom/sina/weibo/sdk/api/TextObject;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->textObject:Lcom/sina/weibo/sdk/api/TextObject;

    .line 177
    :cond_0
    if-eqz p2, :cond_3

    .line 181
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 182
    new-instance v5, Lcom/sina/weibo/sdk/api/ImageObject;

    invoke-direct {v5}, Lcom/sina/weibo/sdk/api/ImageObject;-><init>()V

    .line 183
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    goto :goto_0

    .line 185
    :cond_1
    invoke-direct {p0}, Lo/eby;->b()Lcom/sina/weibo/sdk/api/ImageObject;

    move-result-object v5

    .line 186
    if-nez v5, :cond_2

    .line 187
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendMultiMessage() if (imageObject == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_too_large_picture:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 189
    return-void

    .line 193
    :cond_2
    :goto_0
    iput-object v5, v4, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    .line 197
    :cond_3
    if-eqz p3, :cond_4

    .line 198
    invoke-direct {p0}, Lo/eby;->g()Lcom/sina/weibo/sdk/api/WebpageObject;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->mediaObject:Lcom/sina/weibo/sdk/api/BaseMediaObject;

    .line 201
    :cond_4
    iget-object v0, p0, Lo/eby;->e:Lcom/sina/weibo/sdk/share/WbShareHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->shareMessage(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;Z)V

    .line 203
    return-void
.end method

.method private e()V
    .locals 8

    .line 138
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WbSdk;->supportMultiImage(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "supportMultiImage is true, sendMultiImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eby;->d:Lo/dav;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ece;->a(Landroid/content/Context;Lo/dav;I)Ljava/util/ArrayList;

    move-result-object v4

    .line 144
    new-instance v5, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-direct {v5}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;-><init>()V

    .line 146
    new-instance v6, Lcom/sina/weibo/sdk/api/TextObject;

    invoke-direct {v6}, Lcom/sina/weibo/sdk/api/TextObject;-><init>()V

    .line 147
    const-string v0, ""

    iput-object v0, v6, Lcom/sina/weibo/sdk/api/TextObject;->text:Ljava/lang/String;

    .line 148
    iput-object v6, v5, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->textObject:Lcom/sina/weibo/sdk/api/TextObject;

    .line 149
    new-instance v7, Lcom/sina/weibo/sdk/api/MultiImageObject;

    invoke-direct {v7}, Lcom/sina/weibo/sdk/api/MultiImageObject;-><init>()V

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v7, v0}, Lcom/sina/weibo/sdk/api/MultiImageObject;->setImageList(Ljava/util/ArrayList;)V

    .line 151
    iput-object v7, v5, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->multiImageObject:Lcom/sina/weibo/sdk/api/MultiImageObject;

    .line 153
    iget-object v0, p0, Lo/eby;->e:Lcom/sina/weibo/sdk/share/WbShareHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/sina/weibo/sdk/share/WbShareHandler;->shareMessage(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;Z)V

    .line 154
    goto :goto_0

    .line 155
    :cond_0
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "do not supportMultiImage is true, sendOneImage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/eby;->d(ZZZ)V

    .line 158
    :goto_0
    return-void
.end method

.method private g()Lcom/sina/weibo/sdk/api/WebpageObject;
    .locals 6

    .line 282
    new-instance v4, Lcom/sina/weibo/sdk/api/WebpageObject;

    invoke-direct {v4}, Lcom/sina/weibo/sdk/api/WebpageObject;-><init>()V

    .line 283
    invoke-static {}, Lcom/sina/weibo/sdk/utils/Utility;->generateGUID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WebpageObject;->identify:Ljava/lang/String;

    .line 284
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WebpageObject;->title:Ljava/lang/String;

    .line 285
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WebpageObject;->description:Ljava/lang/String;

    .line 286
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WebpageObject;->actionUrl:Ljava/lang/String;

    .line 287
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/sina/weibo/sdk/api/WebpageObject;->defaultText:Ljava/lang/String;

    .line 290
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v5

    .line 291
    if-eqz v5, :cond_0

    .line 292
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getImageObj() bitmap before size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    const/16 v1, 0x12c

    const/16 v2, 0x12c

    invoke-static {v0, v5, v1, v2}, Lo/dbk;->b(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 294
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getImageObj() bitmap after size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 296
    :cond_0
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->huafen_share_img_zero:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 297
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWebpageObj() bmp == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    :goto_0
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getImageObj() bitmap before size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    invoke-virtual {v4, v5}, Lcom/sina/weibo/sdk/api/WebpageObject;->setThumbImage(Landroid/graphics/Bitmap;)V

    .line 302
    return-object v4
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 306
    iget-object v0, p0, Lo/eby;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eby;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 307
    iget-object v0, p0, Lo/eby;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 309
    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 90
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eby;->e:Lcom/sina/weibo/sdk/share/WbShareHandler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 91
    :cond_0
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareBySina() if (mShareContent == null || mWeiboShareAPI == null || context == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 96
    :cond_1
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/eby;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    iget-object v0, p0, Lo/eby;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_install_weibo:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 99
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareBySina() if (!checkSinaInstalled(context))"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 103
    :cond_2
    iget-object v0, p0, Lo/eby;->d:Lo/dav;

    invoke-virtual {v0}, Lo/dav;->h()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 105
    :pswitch_0
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_TEXT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/eby;->d(ZZZ)V

    .line 107
    goto :goto_1

    .line 111
    :pswitch_1
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_PIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/eby;->d(ZZZ)V

    .line 113
    goto :goto_1

    .line 116
    :pswitch_2
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_WEBPAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lo/eby;->d(ZZZ)V

    .line 118
    goto :goto_1

    .line 121
    :pswitch_3
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_MULTI_MESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lo/eby;->d(ZZZ)V

    .line 123
    goto :goto_1

    .line 125
    :pswitch_4
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHARE_WAY_MULTI_IMG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-direct {p0}, Lo/eby;->e()V

    .line 127
    goto :goto_1

    .line 129
    :goto_0
    const-string v0, "Share_SinaShareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNKNOWN SinaShareWay!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method
