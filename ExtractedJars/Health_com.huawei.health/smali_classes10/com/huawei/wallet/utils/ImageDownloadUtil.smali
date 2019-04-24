.class public Lcom/huawei/wallet/utils/ImageDownloadUtil;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/String;Ljava/lang/Void;[Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field private b:I

.field private c:Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;

.field private e:Landroid/content/Context;


# direct methods
.method private a()Ljava/lang/String;
    .locals 2

    .line 196
    iget v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 198
    iget-object v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/path/PayStorageUtil;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 200
    :cond_0
    iget v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 202
    iget-object v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/path/PayStorageUtil;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 204
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/io/InputStream;[Ljava/lang/String;)V
    .locals 11

    .line 215
    const/4 v4, 0x0

    .line 216
    const/16 v0, 0x400

    new-array v5, v0, [B

    .line 217
    const/4 v6, 0x0

    .line 221
    :try_start_0
    new-instance v7, Ljava/io/File;

    invoke-direct {p0}, Lcom/huawei/wallet/utils/ImageDownloadUtil;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 222
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v8

    .line 225
    if-eqz v8, :cond_0

    .line 227
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile create dir fail!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 230
    :cond_0
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 231
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 232
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x400

    invoke-virtual {p2, v5, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 234
    const/4 v0, 0x0

    invoke-virtual {v4, v5, v0, v6}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 236
    :cond_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V

    .line 237
    const-string v0, "0"

    const/4 v1, 0x0

    aput-object v0, p3, v1

    .line 238
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p3, v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 259
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 264
    goto/16 :goto_2

    .line 261
    :catch_0
    move-exception v7

    .line 263
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile IOException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 264
    goto :goto_2

    .line 240
    :catch_1
    move-exception v7

    .line 244
    const-string v0, "ImageDownloaderTasksaveToFile FileNotFoundException"

    const-string v1, "ImageDownloadUtil.saveToFile"

    .line 246
    :try_start_2
    invoke-virtual {v7}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 244
    const v2, 0x3611862d

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;ILjava/util/Map;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 259
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 264
    goto :goto_2

    .line 261
    :catch_2
    move-exception v7

    .line 263
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile IOException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 264
    goto :goto_2

    .line 249
    :catch_3
    move-exception v7

    .line 251
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile IOException"

    const/4 v2, 0x0

    :try_start_4
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 255
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 259
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 264
    goto :goto_2

    .line 261
    :catch_4
    move-exception v7

    .line 263
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile IOException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 264
    goto :goto_2

    .line 255
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 259
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 264
    goto :goto_1

    .line 261
    :catch_5
    move-exception v10

    .line 263
    const-string v0, "ImageDownloaderTask"

    const-string v1, "saveToFile IOException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 266
    :cond_2
    :goto_1
    throw v9

    .line 267
    :cond_3
    :goto_2
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 14

    .line 119
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "-1"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, ""

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 120
    const-string v0, "image_downloader"

    invoke-static {v0}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v4

    .line 121
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 124
    :try_start_0
    invoke-interface {v4, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 125
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v7

    .line 126
    const/16 v0, 0xc8

    if-eq v7, v0, :cond_1

    .line 128
    const-string v0, "ImageDownloaderTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " while retrieving bitmap from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_a
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 129
    move-object v8, v3

    .line 186
    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_0

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 129
    :cond_0
    return-object v8

    .line 131
    :cond_1
    :try_start_1
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
    :try_end_1
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v8

    .line 132
    if-eqz v8, :cond_7

    .line 134
    const/4 v9, 0x0

    .line 137
    :try_start_2
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v0

    move-object v9, v0

    .line 138
    move-object/from16 v0, p2

    invoke-direct {p0, v0, v9, v3}, Lcom/huawei/wallet/utils/ImageDownloadUtil;->a(Ljava/lang/String;Ljava/io/InputStream;[Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    if-eqz v9, :cond_2

    .line 158
    :try_start_3
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 163
    goto :goto_0

    .line 160
    :catch_0
    move-exception v10

    .line 162
    const-string v0, "ImageDownloaderTask"

    const-string v1, "can not close stream"

    const/4 v2, 0x0

    :try_start_4
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    :cond_2
    :goto_0
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_a
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 166
    goto/16 :goto_5

    .line 140
    :catch_1
    move-exception v10

    .line 142
    const-string v0, "ImageDownloaderTask"

    const-string v1, "streamdecode error."

    const/4 v2, 0x0

    :try_start_5
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 154
    if-eqz v9, :cond_3

    .line 158
    :try_start_6
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_a
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 163
    goto :goto_1

    .line 160
    :catch_2
    move-exception v10

    .line 162
    const-string v0, "ImageDownloaderTask"

    const-string v1, "can not close stream"

    const/4 v2, 0x0

    :try_start_7
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    :cond_3
    :goto_1
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_7
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_a
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 166
    goto :goto_5

    .line 144
    :catch_3
    move-exception v10

    .line 146
    const-string v0, "ImageDownloaderTask"

    const-string v1, "streamdecode error."

    const/4 v2, 0x0

    :try_start_8
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 154
    if-eqz v9, :cond_4

    .line 158
    :try_start_9
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_a
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 163
    goto :goto_2

    .line 160
    :catch_4
    move-exception v10

    .line 162
    const-string v0, "ImageDownloaderTask"

    const-string v1, "can not close stream"

    const/4 v2, 0x0

    :try_start_a
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    :cond_4
    :goto_2
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_a
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 166
    goto :goto_5

    .line 148
    :catch_5
    move-exception v10

    .line 150
    const-string v0, "ImageDownloaderTask"

    const-string v1, "streamdecode error."

    const/4 v2, 0x0

    :try_start_b
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 154
    if-eqz v9, :cond_5

    .line 158
    :try_start_c
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_a
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 163
    goto :goto_3

    .line 160
    :catch_6
    move-exception v10

    .line 162
    const-string v0, "ImageDownloaderTask"

    const-string v1, "can not close stream"

    const/4 v2, 0x0

    :try_start_d
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    :cond_5
    :goto_3
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_d
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_a
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 166
    goto :goto_5

    .line 154
    :catchall_0
    move-exception v11

    if-eqz v9, :cond_6

    .line 158
    :try_start_e
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_e .. :try_end_e} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_e .. :try_end_e} :catch_a
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 163
    goto :goto_4

    .line 160
    :catch_7
    move-exception v12

    .line 162
    const-string v0, "ImageDownloaderTask"

    const-string v1, "can not close stream"

    const/4 v2, 0x0

    :try_start_f
    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    :cond_6
    :goto_4
    invoke-interface {v8}, Lorg/apache/http/HttpEntity;->consumeContent()V

    .line 166
    throw v11
    :try_end_f
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_f .. :try_end_f} :catch_8
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 186
    :cond_7
    :goto_5
    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_9

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_6

    .line 169
    :catch_8
    move-exception v6

    .line 171
    :try_start_10
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 172
    const-string v0, "ImageDownloaderTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "I/O error while retrieving bitmap from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v6, v2}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 186
    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_9

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    goto/16 :goto_6

    .line 174
    :catch_9
    move-exception v6

    .line 176
    :try_start_11
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 177
    const-string v0, "ImageDownloaderTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "I/O error while retrieving bitmap from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v6, v2}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 186
    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_9

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_6

    .line 179
    :catch_a
    move-exception v6

    .line 181
    :try_start_12
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 182
    const-string v0, "ImageDownloaderTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Incorrect URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 186
    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_9

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    goto :goto_6

    .line 186
    :catchall_1
    move-exception v13

    instance-of v0, v4, Landroid/net/http/AndroidHttpClient;

    if-eqz v0, :cond_8

    .line 188
    move-object v0, v4

    check-cast v0, Landroid/net/http/AndroidHttpClient;

    invoke-virtual {v0}, Landroid/net/http/AndroidHttpClient;->close()V

    .line 190
    :cond_8
    throw v13

    .line 191
    :cond_9
    :goto_6
    return-object v3
.end method


# virtual methods
.method protected a([Ljava/lang/String;)V
    .locals 3

    .line 101
    const/4 v0, 0x0

    aget-object v1, p1, v0

    .line 102
    const/4 v0, 0x1

    aget-object v2, p1, v0

    .line 103
    const-string v0, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->c:Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;

    invoke-interface {v0, v2}, Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/utils/ImageDownloadUtil;->c:Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;

    invoke-interface {v0, v1}, Lcom/huawei/wallet/utils/ImageDownloadUtil$CallBack;->a(Ljava/lang/String;)V

    .line 111
    :goto_0
    return-void
.end method

.method protected varargs c([Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    .line 92
    const/4 v0, 0x0

    aget-object v1, p1, v0

    .line 93
    const/4 v0, 0x1

    aget-object v2, p1, v0

    .line 94
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 95
    invoke-direct {p0, v1, v2}, Lcom/huawei/wallet/utils/ImageDownloadUtil;->b(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 37
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/utils/ImageDownloadUtil;->c([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 37
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/utils/ImageDownloadUtil;->a([Ljava/lang/String;)V

    return-void
.end method
