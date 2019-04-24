.class final Lcom/huawei/operation/https/Https$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/https/Https;->download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

.field final synthetic val$savePath:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljavax/net/ssl/HttpsURLConnection;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/huawei/operation/https/Https$2;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    iput-object p2, p0, Lcom/huawei/operation/https/Https$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/operation/https/Https$2;->val$savePath:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/operation/https/Https$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 237
    const/4 v4, 0x0

    .line 238
    const/4 v5, 0x0

    .line 239
    const/4 v6, -0x1

    .line 241
    :try_start_0
    iget-object v0, p0, Lcom/huawei/operation/https/Https$2;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v6

    .line 242
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download-->responseCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_1

    .line 244
    iget-object v0, p0, Lcom/huawei/operation/https/Https$2;->val$httpsURLConnection:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 245
    invoke-static {v4}, Lcom/huawei/operation/https/HttpUtils;->readInputStream(Ljava/io/InputStream;)[B

    move-result-object v7

    .line 246
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v5, v0

    .line 247
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->jsonResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/operation/https/Https$2;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/https/Https$2;->val$savePath:Ljava/lang/String;

    invoke-static {v0, v4, v1}, Lcom/huawei/operation/https/HttpUtils;->saveFile(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    .line 249
    if-eqz v8, :cond_0

    .line 250
    const/16 v6, 0xc8

    goto :goto_0

    .line 252
    :cond_0
    const/4 v6, -0x1

    .line 254
    :goto_0
    goto :goto_1

    .line 255
    :cond_1
    const/4 v6, -0x1

    .line 265
    :goto_1
    if-eqz v4, :cond_3

    .line 267
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 270
    goto/16 :goto_3

    .line 268
    :catch_0
    move-exception v7

    .line 269
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    goto/16 :goto_3

    .line 257
    :catch_1
    move-exception v7

    .line 258
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 259
    const/4 v6, -0x1

    .line 265
    if-eqz v4, :cond_3

    .line 267
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 270
    goto :goto_3

    .line 268
    :catch_2
    move-exception v7

    .line 269
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    goto :goto_3

    .line 260
    :catch_3
    move-exception v7

    .line 261
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 262
    const/4 v6, -0x1

    .line 265
    if-eqz v4, :cond_3

    .line 267
    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 270
    goto :goto_3

    .line 268
    :catch_4
    move-exception v7

    .line 269
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    goto :goto_3

    .line 265
    :catchall_0
    move-exception v9

    if-eqz v4, :cond_2

    .line 267
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 270
    goto :goto_2

    .line 268
    :catch_5
    move-exception v10

    .line 269
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :cond_2
    :goto_2
    throw v9

    .line 273
    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/huawei/operation/https/Https$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    if-eqz v0, :cond_4

    .line 274
    iget-object v0, p0, Lcom/huawei/operation/https/Https$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    invoke-interface {v0, v6, v5}, Lcom/huawei/operation/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 276
    :cond_4
    return-void
.end method
