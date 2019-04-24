.class public Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;
.super Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;
.source "SourceFile"


# static fields
.field private static final SHARE_URL:Ljava/lang/String; = "http://service.weibo.com/share/mobilesdk.php"

.field private static final UPLOAD_PIC_URL:Ljava/lang/String; = "http://service.weibo.com/share/mobilesdk_uppic.php"


# instance fields
.field private hashKey:Ljava/lang/String;

.field private mBase64ImgData:[B

.field private mShareContent:Ljava/lang/String;

.field private multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

.field private packageName:Ljava/lang/String;

.field private picId:Ljava/lang/String;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;-><init>()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->context:Landroid/content/Context;

    .line 51
    return-void
.end method

.method public constructor <init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 56
    invoke-direct/range {p0 .. p7}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;-><init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 8

    .line 53
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;-><init>(Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/web/WebRequestType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method static synthetic access$000(Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->picId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->picId:Ljava/lang/String;

    return-object p1
.end method

.method private getBaseUrl()V
    .locals 4

    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->textObject:Lcom/sina/weibo/sdk/api/TextObject;

    instance-of v0, v0, Lcom/sina/weibo/sdk/api/TextObject;

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v3, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->textObject:Lcom/sina/weibo/sdk/api/TextObject;

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v3, Lcom/sina/weibo/sdk/api/TextObject;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->mediaObject:Lcom/sina/weibo/sdk/api/BaseMediaObject;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->mediaObject:Lcom/sina/weibo/sdk/api/BaseMediaObject;

    instance-of v0, v0, Lcom/sina/weibo/sdk/api/WebpageObject;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->mediaObject:Lcom/sina/weibo/sdk/api/BaseMediaObject;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/BaseMediaObject;->actionUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->mediaObject:Lcom/sina/weibo/sdk/api/BaseMediaObject;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/BaseMediaObject;->actionUrl:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v0, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    instance-of v0, v0, Lcom/sina/weibo/sdk/api/ImageObject;

    if-eqz v0, :cond_2

    .line 198
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    iget-object v3, v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->imageObject:Lcom/sina/weibo/sdk/api/ImageObject;

    .line 199
    iget-object v0, v3, Lcom/sina/weibo/sdk/api/ImageObject;->imagePath:Ljava/lang/String;

    iget-object v1, v3, Lcom/sina/weibo/sdk/api/ImageObject;->imageData:[B

    invoke-direct {p0, v0, v1}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->handleMblogPic(Ljava/lang/String;[B)V

    .line 203
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mShareContent:Ljava/lang/String;

    .line 204
    return-void
.end method

.method private handleMblogPic(Ljava/lang/String;[B)V
    .locals 10

    .line 213
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 214
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 216
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v0, v0

    new-array v5, v0, [B
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4

    .line 217
    const/4 v6, 0x0

    .line 219
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 220
    invoke-virtual {v6, v5}, Ljava/io/FileInputStream;->read([B)I

    .line 221
    invoke-static {v5}, Lcom/sina/weibo/sdk/utils/Base64;->encodebyte([B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mBase64ImgData:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    if-eqz v6, :cond_0

    .line 228
    :try_start_2
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_4

    .line 230
    :cond_0
    goto :goto_0

    :catch_0
    move-exception v7

    .line 222
    :goto_0
    return-void

    .line 223
    :catch_1
    move-exception v7

    .line 224
    const/4 v5, 0x0

    .line 227
    if-eqz v6, :cond_1

    .line 228
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_4

    .line 230
    :cond_1
    goto :goto_2

    :catch_2
    move-exception v7

    .line 231
    goto :goto_2

    .line 226
    :catchall_0
    move-exception v8

    .line 227
    if-eqz v6, :cond_2

    .line 228
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_4

    .line 230
    :cond_2
    goto :goto_1

    :catch_3
    move-exception v9

    :goto_1
    :try_start_5
    throw v8
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_4

    .line 235
    :cond_3
    :goto_2
    goto :goto_3

    :catch_4
    move-exception v4

    .line 237
    :goto_3
    if-eqz p2, :cond_4

    array-length v0, p2

    if-lez v0, :cond_4

    .line 238
    invoke-static {p2}, Lcom/sina/weibo/sdk/utils/Base64;->encodebyte([B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mBase64ImgData:[B

    .line 240
    :cond_4
    return-void
.end method


# virtual methods
.method protected childFillBundle(Landroid/os/Bundle;)V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-virtual {v0, p1}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->toBundle(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 112
    :cond_0
    const-string v0, "token"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->token:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v0, "packageName"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v0, "hashKey"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->hashKey:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void
.end method

.method public doExtraTask(Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam$ExtraTaskCallback;)V
    .locals 6

    .line 68
    invoke-super {p0, p1}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;->doExtraTask(Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam$ExtraTaskCallback;)V

    .line 69
    new-instance v2, Lcom/sina/weibo/sdk/net/WeiboParameters;

    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->getBaseData()Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/sina/weibo/sdk/net/WeiboParameters;-><init>(Ljava/lang/String;)V

    .line 70
    new-instance v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mBase64ImgData:[B

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    .line 72
    invoke-static {}, Lcom/sina/weibo/sdk/network/impl/RequestService;->getInstance()Lcom/sina/weibo/sdk/network/IRequestService;

    move-result-object v4

    .line 73
    new-instance v5, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;

    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->context:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;-><init>(Landroid/content/Context;)V

    .line 74
    const-string v0, "http://service.weibo.com/share/mobilesdk_uppic.php"

    invoke-virtual {v5, v0}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->setShortUrl(Ljava/lang/String;)V

    .line 75
    const-string v0, "img"

    invoke-virtual {v5, v0, v3}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "appKey"

    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->getBaseData()Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->addPostParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v5}, Lcom/sina/weibo/sdk/network/impl/RequestParam$Builder;->build()Lcom/sina/weibo/sdk/network/impl/RequestParam;

    move-result-object v0

    new-instance v1, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam$1;

    invoke-direct {v1, p0, p1}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam$1;-><init>(Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam$ExtraTaskCallback;)V

    invoke-interface {v4, v0, v1}, Lcom/sina/weibo/sdk/network/IRequestService;->asyncRequest(Lcom/sina/weibo/sdk/network/IRequestParam;Lcom/sina/weibo/sdk/network/target/Target;)Lcom/sina/weibo/sdk/network/RequestCancelable;

    .line 105
    return-void
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 7

    .line 130
    invoke-virtual {p0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->getBaseData()Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/web/BaseWebViewRequestData;->getAuthInfo()Lcom/sina/weibo/sdk/auth/AuthInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/AuthInfo;->getAppKey()Ljava/lang/String;

    move-result-object v3

    .line 132
    const-string v0, "http://service.weibo.com/share/mobilesdk.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 133
    invoke-virtual {v4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v5

    .line 134
    const-string v0, "title"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mShareContent:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 135
    const-string v0, "version"

    const-string v1, "0041005000"

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 136
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 137
    const-string v0, "source"

    invoke-virtual {v5, v0, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->token:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    const-string v0, "access_token"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->token:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->context:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 143
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->context:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 144
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 145
    const-string v0, "aid"

    invoke-virtual {v5, v0, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 149
    :cond_2
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 150
    const-string v0, "packagename"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 152
    :cond_3
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->hashKey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 153
    const-string v0, "key_hash"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->hashKey:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 155
    :cond_4
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->picId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 156
    const-string v0, "picinfo"

    iget-object v1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->picId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 158
    :cond_5
    const-string v0, "luicode"

    const-string v1, "10000360"

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 159
    const-string v0, "lfid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OP_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 160
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasExtraTask()Z
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mBase64ImgData:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->mBase64ImgData:[B

    array-length v0, v0

    if-lez v0, :cond_0

    .line 61
    const/4 v0, 0x1

    return v0

    .line 63
    :cond_0
    invoke-super {p0}, Lcom/sina/weibo/sdk/web/param/BaseWebViewRequestParam;->hasExtraTask()Z

    move-result v0

    return v0
.end method

.method public setHashKey(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->hashKey:Ljava/lang/String;

    .line 178
    return-void
.end method

.method public setMultiMessage(Lcom/sina/weibo/sdk/api/WeiboMultiMessage;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 170
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->packageName:Ljava/lang/String;

    .line 182
    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->token:Ljava/lang/String;

    .line 174
    return-void
.end method

.method protected transformChildBundle(Landroid/os/Bundle;)V
    .locals 1

    .line 119
    new-instance v0, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;-><init>()V

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 120
    iget-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->multiMessage:Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    invoke-virtual {v0, p1}, Lcom/sina/weibo/sdk/api/WeiboMultiMessage;->toObject(Landroid/os/Bundle;)Lcom/sina/weibo/sdk/api/WeiboMultiMessage;

    .line 121
    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->token:Ljava/lang/String;

    .line 122
    const-string v0, "packageName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->packageName:Ljava/lang/String;

    .line 123
    const-string v0, "hashKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->hashKey:Ljava/lang/String;

    .line 124
    invoke-direct {p0}, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->getBaseUrl()V

    .line 125
    return-void
.end method

.method public updateRequestUrl(Ljava/lang/String;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/sina/weibo/sdk/web/param/ShareWebViewRequestParam;->picId:Ljava/lang/String;

    .line 166
    return-void
.end method
