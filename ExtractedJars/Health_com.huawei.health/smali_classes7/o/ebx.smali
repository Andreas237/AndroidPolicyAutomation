.class public Lo/ebx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Landroid/graphics/Bitmap;

.field private d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, Lo/ebx;->b:Landroid/content/Context;

    .line 102
    const-string v0, "wx36bda3d35fbcfd06"

    iput-object v0, p0, Lo/ebx;->a:Ljava/lang/String;

    .line 103
    invoke-direct {p0, p1}, Lo/ebx;->a(Landroid/content/Context;)V

    .line 104
    return-void
.end method

.method private a(ILo/dav;)V
    .locals 9

    .line 387
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 389
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR wxApi in sharePicture()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    return-void

    .line 393
    :cond_1
    invoke-virtual {p2}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 394
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR sharePicture is recycled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    return-void

    .line 399
    :cond_2
    invoke-virtual {p2}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 400
    const/4 v5, 0x0

    .line 402
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 406
    goto :goto_0

    .line 403
    :catch_0
    move-exception v6

    .line 404
    const/4 v4, 0x0

    .line 405
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture copy bitmap fail: OutOfMemoryError "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 408
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture fail: bmp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    return-void

    .line 413
    :cond_3
    invoke-static {}, Lo/ebk;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/ebx;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 415
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ebx;->c:Landroid/graphics/Bitmap;

    invoke-static {v0, v4, v1}, Lo/dbk;->d(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_1

    .line 417
    :cond_4
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture() if (PluginSocialShare.getIfNeedWaterMark() && mWaterMarkBitmap != null) ELSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    move-object v5, v4

    .line 421
    :goto_1
    if-nez v5, :cond_5

    .line 422
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR newbmp in sharePicture()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    return-void

    .line 426
    :cond_5
    invoke-virtual {p2}, Lo/dav;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 427
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {p2}, Lo/dav;->c()I

    move-result v1

    invoke-static {v0, v5, v1}, Lo/dbk;->c(Landroid/content/Context;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_2

    .line 429
    :cond_6
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbk;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 432
    :goto_2
    if-nez v5, :cond_7

    .line 433
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture() if (newbmp == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    return-void

    .line 438
    :cond_7
    new-instance v6, Lcom/tencent/mm/opensdk/modelmsg/WXImageObject;

    invoke-direct {v6, v5}, Lcom/tencent/mm/opensdk/modelmsg/WXImageObject;-><init>(Landroid/graphics/Bitmap;)V

    .line 439
    new-instance v7, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-direct {v7}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>()V

    .line 440
    iput-object v6, v7, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    .line 443
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Lo/dbk;->d(Landroid/content/Context;Landroid/graphics/Bitmap;Z)[B

    move-result-object v0

    iput-object v0, v7, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    .line 446
    new-instance v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    invoke-direct {v8}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;-><init>()V

    .line 447
    const-string v0, "imgshareappdata"

    invoke-static {v0}, Lo/ece;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;

    .line 448
    iput-object v7, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 449
    iput p1, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    .line 451
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePicture wxApi.sendReq(req);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, v8}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 454
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/ebx;->a:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 113
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    iget-object v1, p0, Lo/ebx;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 114
    return-void
.end method

.method private a()Z
    .locals 1

    .line 573
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    .line 574
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->isWXAppInstalled()Z

    move-result v0

    return v0

    .line 576
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b()J
    .locals 18

    .line 323
    const-wide/16 v4, 0x0

    .line 325
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 326
    const-string v0, "com.tencent.mm"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    .line 327
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 328
    const-string v0, "\\."

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 329
    const-wide/16 v10, 0x2710

    .line 330
    move-object v12, v9

    array-length v13, v12

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_0

    aget-object v15, v12, v14

    .line 331
    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v1, v0

    move-wide/from16 v16, v1

    .line 332
    mul-long v0, v16, v10

    add-long/2addr v0, v4

    move-wide v4, v0

    .line 333
    const-wide/16 v0, 0x64

    div-long/2addr v10, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 337
    :cond_0
    goto :goto_1

    .line 335
    :catch_0
    move-exception v6

    .line 336
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wechat get version fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :goto_1
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wechat version is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-wide v4
.end method

.method private b(ILo/dav;)V
    .locals 8

    .line 184
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 185
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR wxApi in shareText()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void

    .line 189
    :cond_1
    invoke-virtual {p2}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v4

    .line 192
    new-instance v5, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;-><init>()V

    .line 193
    iput-object v4, v5, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;->text:Ljava/lang/String;

    .line 196
    new-instance v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-direct {v6}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>()V

    .line 197
    iput-object v5, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    .line 198
    iput-object v4, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    .line 201
    new-instance v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    invoke-direct {v7}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;-><init>()V

    .line 204
    const-string v0, "textshare"

    invoke-static {v0}, Lo/ece;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;

    .line 205
    iput-object v6, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 208
    iput p1, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    .line 210
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareText wxApi.sendReq(req);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, v7}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 213
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 348
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 349
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareMomentMultiImage get images failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    return-void

    .line 352
    :cond_1
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 354
    const-string v0, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 355
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 356
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 357
    const-string v0, "image/*"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 360
    new-instance v5, Landroid/content/ComponentName;

    const-string v0, "com.tencent.mm"

    const-string v1, "com.tencent.mm.ui.tools.ShareToTimeLineUI"

    invoke-direct {v5, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 364
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 365
    return-void
.end method

.method private b(Lo/dav;)V
    .locals 10

    .line 283
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lo/ece;->a(Landroid/content/Context;Lo/dav;I)Ljava/util/ArrayList;

    move-result-object v5

    .line 285
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 286
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 287
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$plurals;->IDS_plugin_socialshare_wechatmoment_select_byself:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 288
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_go_ahead_sharing:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 289
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 290
    invoke-virtual {v0, v7}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lo/ebx$2;

    invoke-direct {v1, p0}, Lo/ebx$2;-><init>(Lo/ebx;)V

    .line 291
    invoke-virtual {v0, v8, v1}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v9

    .line 297
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 298
    goto :goto_0

    .line 299
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideToMomentMultiImage::imageUriList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/ebx;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/ebx;->c()V

    return-void
.end method

.method private c()V
    .locals 4

    .line 371
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 372
    new-instance v3, Landroid/content/ComponentName;

    const-string v0, "com.tencent.mm"

    const-string v1, "com.tencent.mm.ui.LauncherUI"

    invoke-direct {v3, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 374
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 375
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 376
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 377
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 378
    return-void
.end method

.method private c(ILo/dav;)V
    .locals 9

    .line 462
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePictureByPath()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 464
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePictureByPath param invalied "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    return-void

    .line 469
    :cond_1
    invoke-virtual {p2}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v4

    .line 470
    invoke-direct {p0, v4}, Lo/ebx;->d(Ljava/lang/String;)V

    .line 471
    new-instance v5, Lcom/tencent/mm/opensdk/modelmsg/WXImageObject;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/modelmsg/WXImageObject;-><init>()V

    .line 472
    invoke-virtual {v5, v4}, Lcom/tencent/mm/opensdk/modelmsg/WXImageObject;->setImagePath(Ljava/lang/String;)V

    .line 473
    new-instance v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-direct {v6}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>()V

    .line 474
    iput-object v5, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    .line 477
    invoke-virtual {p2}, Lo/dav;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 478
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lo/dbk;->d(Landroid/content/Context;Landroid/graphics/Bitmap;Z)[B

    move-result-object v0

    iput-object v0, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    .line 481
    new-instance v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    invoke-direct {v8}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;-><init>()V

    .line 482
    const-string v0, "imgshareappdata"

    invoke-static {v0}, Lo/ece;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;

    .line 483
    iput-object v6, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 484
    iput p1, v8, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    .line 486
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sharePictureByPath wxApi.sendReq(req);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, v8}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 489
    return-void
.end method

.method private c(Lo/dav;)V
    .locals 12

    .line 251
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, p1, v1}, Lo/ece;->a(Landroid/content/Context;Lo/dav;I)Ljava/util/ArrayList;

    move-result-object v6

    .line 253
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 254
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 257
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 258
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$plurals;->IDS_plugin_socialshare_wechatmoment_select_byself:I

    add-int/lit8 v2, v7, -0x1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    add-int/lit8 v4, v7, -0x1

    .line 261
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 259
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 262
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_go_ahead_sharing:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 263
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 264
    invoke-virtual {v0, v9}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lo/ebx$3;

    invoke-direct {v1, p0, v8}, Lo/ebx$3;-><init>(Lo/ebx;Ljava/util/ArrayList;)V

    .line 265
    invoke-virtual {v0, v10, v1}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v11

    .line 271
    invoke-virtual {v11}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 272
    goto :goto_0

    .line 273
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideToMomentMultiImage::imageUriList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/ebx;Ljava/util/ArrayList;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/ebx;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method private d(ILo/dav;)V
    .locals 8

    .line 498
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 499
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR wxApi in shareWebPage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    return-void

    .line 504
    :cond_1
    new-instance v4, Lcom/tencent/mm/opensdk/modelmsg/WXWebpageObject;

    invoke-direct {v4}, Lcom/tencent/mm/opensdk/modelmsg/WXWebpageObject;-><init>()V

    .line 505
    invoke-virtual {p2}, Lo/dav;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/tencent/mm/opensdk/modelmsg/WXWebpageObject;->webpageUrl:Ljava/lang/String;

    .line 508
    new-instance v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-direct {v5, v4}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;-><init>(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V

    .line 509
    invoke-virtual {p2}, Lo/dav;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;

    .line 510
    invoke-virtual {p2}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;

    .line 512
    invoke-virtual {p2}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v6

    .line 513
    if-nez v6, :cond_2

    .line 514
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->huafen_share_img_zero:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 515
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lo/dbk;->c(Landroid/content/Context;Landroid/graphics/Bitmap;Z)[B

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    .line 516
    const-string v0, "TAG"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWebPage() thumb is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    goto :goto_0

    .line 518
    :cond_2
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/16 v1, 0x12c

    const/16 v2, 0x12c

    invoke-static {v0, v6, v1, v2}, Lo/dbk;->b(Landroid/content/Context;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 519
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v6, v1}, Lo/dbk;->c(Landroid/content/Context;Landroid/graphics/Bitmap;Z)[B

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->thumbData:[B

    .line 523
    :goto_0
    new-instance v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    invoke-direct {v7}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;-><init>()V

    .line 524
    const-string v0, "webpage"

    invoke-static {v0}, Lo/ece;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;

    .line 525
    iput-object v5, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 526
    iput p1, v7, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    .line 528
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareWebPage wxApi.sendReq(req);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget-object v0, p0, Lo/ebx;->d:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, v7}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    .line 531
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 15

    .line 539
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ensureMaxHeight start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 541
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ensureMaxHeight fail:orgFilePath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    return-void

    .line 544
    :cond_0
    const/4 v7, 0x0

    .line 545
    const/4 v8, 0x0

    .line 546
    const/4 v9, 0x0

    .line 548
    :try_start_0
    invoke-static/range {p1 .. p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 549
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v11

    .line 550
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    .line 551
    const/16 v0, 0x2800

    if-le v11, v0, :cond_1

    .line 552
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ensureMaxHeight height exceeds, rescale it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    int-to-float v0, v11

    const/high16 v1, 0x46200000    # 10240.0f

    div-float v13, v1, v0

    .line 554
    invoke-virtual {v12, v13, v13}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 555
    move-object v0, v10

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v12

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 556
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v9, v0

    .line 557
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v9}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v8, v0

    .line 558
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {v7, v0, v1, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 559
    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 564
    :cond_1
    invoke-static {v8}, Lo/ece;->c(Ljava/io/BufferedOutputStream;)V

    .line 565
    invoke-static {v9}, Lo/ece;->a(Ljava/io/FileOutputStream;)V

    .line 566
    goto :goto_0

    .line 561
    :catch_0
    move-exception v10

    .line 562
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ensureMaxHeight fail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 564
    invoke-static {v8}, Lo/ece;->c(Ljava/io/BufferedOutputStream;)V

    .line 565
    invoke-static {v9}, Lo/ece;->a(Ljava/io/FileOutputStream;)V

    .line 566
    goto :goto_0

    .line 564
    :catchall_0
    move-exception v14

    invoke-static {v8}, Lo/ece;->c(Ljava/io/BufferedOutputStream;)V

    .line 565
    invoke-static {v9}, Lo/ece;->a(Ljava/io/FileOutputStream;)V

    .line 566
    throw v14

    .line 567
    :goto_0
    return-void
.end method

.method private d(Lo/dav;)V
    .locals 5

    .line 308
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lo/ece;->a(Landroid/content/Context;Lo/dav;I)Ljava/util/ArrayList;

    move-result-object v4

    .line 310
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 311
    invoke-direct {p0, v4}, Lo/ebx;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 313
    :cond_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideToMomentMultiImage::imageUriList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    :goto_0
    return-void
.end method

.method private e(ILo/dav;)V
    .locals 6

    .line 226
    const/4 v0, 0x1

    if-ne v0, p1, :cond_3

    .line 227
    invoke-direct {p0}, Lo/ebx;->b()J

    move-result-wide v4

    .line 228
    const-wide/32 v0, 0xed1f    # 2.99913E-319

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    .line 229
    invoke-direct {p0, p2}, Lo/ebx;->d(Lo/dav;)V

    goto :goto_0

    .line 230
    :cond_0
    const-wide/32 v0, 0xed1f    # 2.99913E-319

    cmp-long v0, v4, v0

    if-nez v0, :cond_1

    .line 231
    invoke-direct {p0, p2}, Lo/ebx;->c(Lo/dav;)V

    goto :goto_0

    .line 232
    :cond_1
    const-wide/32 v0, 0x11170

    cmp-long v0, v4, v0

    if-ltz v0, :cond_2

    .line 233
    invoke-direct {p0, p2}, Lo/ebx;->b(Lo/dav;)V

    goto :goto_0

    .line 235
    :cond_2
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wechat version unknow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :goto_0
    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 239
    invoke-direct {p0, p1, p2}, Lo/ebx;->c(ILo/dav;)V

    goto :goto_1

    .line 241
    :cond_4
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unknow wexin share type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    :goto_1
    return-void
.end method


# virtual methods
.method public e(Lo/dav;I)I
    .locals 4

    .line 134
    invoke-direct {p0}, Lo/ebx;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/ebx;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$string;->IDS_plugin_socialshare_install_wechat:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 136
    const/4 v0, 0x1

    return v0

    .line 139
    :cond_0
    if-nez p1, :cond_1

    .line 140
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareByWeixin get NULL shareContent!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v0, 0x0

    return v0

    .line 144
    :cond_1
    invoke-virtual {p1}, Lo/dav;->h()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 147
    :pswitch_0
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIXIN_SHARE_WAY_TEXT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0, p2, p1}, Lo/ebx;->b(ILo/dav;)V

    .line 149
    goto :goto_1

    .line 152
    :pswitch_1
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIXIN_SHARE_WAY_PIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-direct {p0, p2, p1}, Lo/ebx;->a(ILo/dav;)V

    .line 154
    goto :goto_1

    .line 157
    :pswitch_2
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIXIN_SHARE_WAY_WEBPAGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    invoke-direct {p0, p2, p1}, Lo/ebx;->d(ILo/dav;)V

    .line 159
    goto :goto_1

    .line 162
    :pswitch_3
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIXIN SHARE_WAY_IMG_PATH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-direct {p0, p2, p1}, Lo/ebx;->c(ILo/dav;)V

    .line 164
    goto :goto_1

    .line 166
    :pswitch_4
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIXIN SHARE_WAY_MULTI_IMG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-direct {p0, p2, p1}, Lo/ebx;->e(ILo/dav;)V

    .line 168
    goto :goto_1

    .line 170
    :goto_0
    :pswitch_5
    const-string v0, "Share_WeChatShareManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNKNOWN WexinShareWay!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    :goto_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
