.class final Lcom/huawei/operation/https/Http$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/https/Http;->download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$httpURLConnection:Ljava/net/HttpURLConnection;

.field final synthetic val$savePath:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/net/HttpURLConnection;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/operation/https/HttpResCallBack;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/operation/https/Http$2;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    iput-object p2, p0, Lcom/huawei/operation/https/Http$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/operation/https/Http$2;->val$savePath:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/operation/https/Http$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 225
    const/4 v4, 0x0

    .line 226
    const/4 v5, 0x0

    .line 227
    const/4 v6, -0x1

    .line 230
    :try_start_0
    iget-object v0, p0, Lcom/huawei/operation/https/Http$2;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    .line 231
    const-string v0, "PLGOPER_Http"

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

    .line 232
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/huawei/operation/https/Http$2;->val$httpURLConnection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 234
    invoke-static {v4}, Lcom/huawei/operation/https/HttpUtils;->readInputStream(Ljava/io/InputStream;)[B

    move-result-object v7

    .line 235
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v5, v0

    .line 236
    const-string v0, "PLGOPER_Http"

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

    .line 237
    iget-object v0, p0, Lcom/huawei/operation/https/Http$2;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/operation/https/Http$2;->val$savePath:Ljava/lang/String;

    invoke-static {v0, v4, v1}, Lcom/huawei/operation/https/HttpUtils;->saveFile(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    .line 238
    if-eqz v8, :cond_0

    .line 239
    const/16 v6, 0xc8

    goto :goto_0

    .line 241
    :cond_0
    const/4 v6, -0x1

    .line 243
    :goto_0
    goto :goto_1

    .line 244
    :cond_1
    const/4 v6, -0x1

    .line 251
    :goto_1
    if-eqz v4, :cond_3

    .line 253
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 256
    goto :goto_3

    .line 254
    :catch_0
    move-exception v7

    .line 255
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    goto :goto_3

    .line 246
    :catch_1
    move-exception v7

    .line 247
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 248
    const/4 v6, -0x1

    .line 251
    if-eqz v4, :cond_3

    .line 253
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 256
    goto :goto_3

    .line 254
    :catch_2
    move-exception v7

    .line 255
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    goto :goto_3

    .line 251
    :catchall_0
    move-exception v9

    if-eqz v4, :cond_2

    .line 253
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 256
    goto :goto_2

    .line 254
    :catch_3
    move-exception v10

    .line 255
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    :cond_2
    :goto_2
    throw v9

    .line 259
    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/huawei/operation/https/Http$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    if-eqz v0, :cond_4

    .line 260
    iget-object v0, p0, Lcom/huawei/operation/https/Http$2;->val$callBack:Lcom/huawei/operation/https/HttpResCallBack;

    invoke-interface {v0, v6, v5}, Lcom/huawei/operation/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 262
    :cond_4
    return-void
.end method
