.class public Lcom/tencent/open/utils/AsynLoadImg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/tencent/open/utils/AsynLoadImgBack;

.field private d:J

.field private e:Landroid/os/Handler;

.field private f:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    new-instance v0, Lcom/tencent/open/utils/AsynLoadImg$2;

    invoke-direct {v0, p0}, Lcom/tencent/open/utils/AsynLoadImg$2;-><init>(Lcom/tencent/open/utils/AsynLoadImg;)V

    iput-object v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->f:Ljava/lang/Runnable;

    .line 44
    new-instance v0, Lcom/tencent/open/utils/AsynLoadImg$1;

    invoke-virtual {p1}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/tencent/open/utils/AsynLoadImg$1;-><init>(Lcom/tencent/open/utils/AsynLoadImg;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->e:Landroid/os/Handler;

    .line 56
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/utils/AsynLoadImg;)Lcom/tencent/open/utils/AsynLoadImgBack;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->b:Lcom/tencent/open/utils/AsynLoadImgBack;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Lcom/tencent/open/utils/AsynLoadImg;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/tencent/open/utils/AsynLoadImg;)Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/open/utils/AsynLoadImg;)Landroid/os/Handler;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->e:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/tencent/open/utils/AsynLoadImg;)J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->d:J

    return-wide v0
.end method

.method public static getbitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 123
    const-string v0, "AsynLoadImg"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getbitmap:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v3, 0x0

    .line 127
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/net/HttpURLConnection;

    .line 130
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 131
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->connect()V

    .line 132
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    .line 133
    invoke-static {v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 134
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 136
    const-string v0, "AsynLoadImg"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "image download finished."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 145
    goto :goto_0

    .line 137
    :catch_0
    move-exception v4

    .line 138
    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 139
    const-string v0, "AsynLoadImg"

    const-string v1, "getbitmap bmp fail---"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const/4 v0, 0x0

    return-object v0

    .line 141
    :catch_1
    move-exception v4

    .line 142
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 143
    const-string v0, "AsynLoadImg"

    const-string v1, "getbitmap bmp fail---"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const/4 v0, 0x0

    return-object v0

    .line 146
    :goto_0
    return-object v3
.end method


# virtual methods
.method public save(Ljava/lang/String;Lcom/tencent/open/utils/AsynLoadImgBack;)V
    .locals 2

    .line 60
    const-string v0, "AsynLoadImg"

    const-string v1, "--save---"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 63
    return-void

    .line 65
    :cond_1
    invoke-static {}, Lcom/tencent/open/utils/Util;->hasSDCard()Z

    move-result v0

    if-nez v0, :cond_2

    .line 66
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 67
    return-void

    .line 69
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tmp/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/utils/AsynLoadImg;->c:Ljava/lang/String;

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/open/utils/AsynLoadImg;->d:J

    .line 73
    iput-object p1, p0, Lcom/tencent/open/utils/AsynLoadImg;->a:Ljava/lang/String;

    .line 74
    iput-object p2, p0, Lcom/tencent/open/utils/AsynLoadImg;->b:Lcom/tencent/open/utils/AsynLoadImgBack;

    .line 75
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/tencent/open/utils/AsynLoadImg;->f:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 76
    return-void
.end method

.method public saveFile(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
    .locals 10

    .line 85
    sget-object v3, Lcom/tencent/open/utils/AsynLoadImg;->c:Ljava/lang/String;

    .line 86
    const/4 v4, 0x0

    .line 88
    :try_start_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    .line 92
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 93
    const-string v0, "AsynLoadImg"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveFile:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 95
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    .line 96
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x50

    invoke-virtual {p1, v0, v1, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 97
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    if-eqz v4, :cond_3

    .line 105
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    goto :goto_0

    .line 106
    :catch_0
    move-exception v5

    .line 107
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_0
    const/4 v4, 0x0

    goto :goto_3

    .line 98
    :catch_1
    move-exception v5

    .line 99
    :try_start_2
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 100
    const-string v0, "AsynLoadImg"

    const-string v1, "saveFile bmp fail---"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    const/4 v6, 0x0

    .line 103
    if-eqz v4, :cond_1

    .line 105
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 108
    goto :goto_1

    .line 106
    :catch_2
    move-exception v7

    .line 107
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_1
    const/4 v4, 0x0

    :cond_1
    return v6

    .line 103
    :catchall_0
    move-exception v8

    if-eqz v4, :cond_2

    .line 105
    :try_start_4
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 108
    goto :goto_2

    .line 106
    :catch_3
    move-exception v9

    .line 107
    invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_2
    const/4 v4, 0x0

    :cond_2
    throw v8

    .line 112
    :cond_3
    :goto_3
    const/4 v0, 0x1

    return v0
.end method
