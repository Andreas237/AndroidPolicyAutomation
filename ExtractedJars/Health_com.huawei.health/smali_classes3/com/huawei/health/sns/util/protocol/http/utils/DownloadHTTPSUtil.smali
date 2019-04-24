.class public Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final INTERVAL_PERCENT:I = 0x46

.field private static final INTERVAL_TIMES:I = 0x8

.field private static final IO_BUFFER_SIZE:I = 0x400

.field private static final TAG:Ljava/lang/String; = "DownloadHTTPSUtil"


# instance fields
.field private currentProgress:I

.field private isCanceled:Z

.field private listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->isCanceled:Z

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    return-void
.end method

.method private copyToFile(Ljava/io/InputStream;JLjava/io/File;)J
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 271
    const-wide/16 v3, 0x0

    .line 273
    const/4 v5, 0x0

    .line 277
    :try_start_0
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    move-object/from16 v2, p4

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v2, 0x400

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v5, v0

    .line 280
    const/16 v0, 0x400

    new-array v7, v0, [B

    .line 283
    const/4 v8, 0x0

    .line 284
    const/4 v9, 0x1

    .line 286
    iget v10, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 288
    const-wide/16 v0, 0x8

    div-long v11, p2, v0

    .line 290
    :cond_0
    :goto_0
    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 292
    const/4 v0, 0x0

    invoke-virtual {v5, v7, v0, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 293
    int-to-long v0, v6

    add-long/2addr v3, v0

    .line 294
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_0

    .line 296
    const-wide/16 v0, 0x46

    mul-long/2addr v0, v3

    div-long v0, v0, p2

    long-to-int v0, v0

    add-int v8, v0, v10

    .line 297
    iput v8, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 300
    int-to-long v0, v9

    mul-long/2addr v0, v11

    cmp-long v0, v3, v0

    if-ltz v0, :cond_0

    .line 302
    add-int/lit8 v9, v9, 0x1

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    iget v1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    invoke-interface {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onProgressChanged(I)V

    goto :goto_0

    .line 307
    :cond_1
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 312
    goto :goto_1

    .line 311
    :catchall_0
    move-exception v13

    invoke-static {v5}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 312
    throw v13

    .line 314
    :goto_1
    return-wide v3
.end method

.method private static isDownloadFailed(Ljava/lang/String;)Z
    .locals 4

    .line 320
    if-nez p0, :cond_0

    .line 322
    const/4 v0, 0x0

    return v0

    .line 324
    :cond_0
    const-string v1, ";"

    .line 325
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 327
    const/4 v0, 0x0

    aget-object v3, v2, v0

    .line 328
    const-string v0, "application/json"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "text/json"

    .line 329
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "json"

    .line 330
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 328
    :goto_0
    return v0
.end method

.method private notifyDownloadFail(Ljava/lang/String;I)V
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 347
    :cond_0
    return-void
.end method

.method private notifyProgress()V
    .locals 2

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    iget v1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    invoke-interface {v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onProgressChanged(I)V

    .line 339
    :cond_0
    return-void
.end method

.method private onReceivedData(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;Lo/bqg;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 179
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getFilePath()Ljava/lang/String;

    move-result-object v3

    .line 180
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    const-string v0, "no storage permission."

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 184
    return-void

    .line 187
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 189
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-virtual/range {p2 .. p2}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->e()J

    move-result-wide v8

    .line 193
    const-string v0, "DownloadHTTPSUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download contentLength["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-gtz v0, :cond_1

    .line 196
    const-string v0, "doPostDownloadMedia contentLength is not correct."

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 198
    return-void

    .line 201
    :cond_1
    const-wide/32 v0, 0x2000000

    cmp-long v0, v8, v0

    if-lez v0, :cond_2

    .line 203
    const-string v0, "doPostDownloadMedia contentLength out of gauge."

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 205
    return-void

    .line 208
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getParentPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bot;->e(Ljava/lang/String;)J

    move-result-wide v10

    .line 210
    cmp-long v0, v10, v8

    if-gez v0, :cond_3

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "doPostDownloadMedia not enough space freeSpace["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 214
    return-void

    .line 218
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0, v8, v9, v7}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->copyToFile(Ljava/io/InputStream;JLjava/io/File;)J

    move-result-wide v12

    .line 220
    const-string v0, "DownloadHTTPSUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download read inputstream complete."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    cmp-long v0, v8, v12

    if-eqz v0, :cond_4

    .line 225
    const-string v0, "DownloadHTTPSUtil"

    const-string v1, "downLength not equals contentLength"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-static {v7}, Lo/bot;->b(Ljava/io/File;)Z

    .line 227
    const-string v0, "downLength not equals contentLength"

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 228
    return-void

    .line 232
    :cond_4
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 234
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    add-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 235
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyProgress()V

    .line 237
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getImageWidth()I

    move-result v0

    .line 238
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getImageHeight()I

    move-result v1

    .line 237
    invoke-static {v3, v0, v1}, Lo/aqn;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 240
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->h()I

    move-result v0

    .line 241
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v1

    invoke-virtual {v1}, Lo/bcm;->i()I

    move-result v1

    .line 240
    invoke-static {v14, v0, v1}, Lo/boe;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 243
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    add-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 244
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyProgress()V

    .line 246
    invoke-static {v3, v14}, Lo/aqx;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    if-eqz v0, :cond_5

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    invoke-interface {v0, v3}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onCompleted(Ljava/lang/String;)V

    .line 252
    :cond_5
    goto :goto_0

    .line 256
    :cond_6
    const-string v0, "DownloadHTTPSUtil"

    const-string v1, "doPostDownloadMedia file rename failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    invoke-static {v7}, Lo/bot;->b(Ljava/io/File;)Z

    .line 258
    const-string v0, "doPostDownloadMedia file rename failed."

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 262
    :goto_0
    return-void
.end method


# virtual methods
.method public addProgress(I)V
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 81
    return-void
.end method

.method public doPostDownloadMedia(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 127
    const/4 v3, 0x0

    .line 131
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;->getCookie()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/bpy;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/bqg;

    move-result-object v0

    move-object v3, v0

    .line 135
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 137
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    add-int/lit8 v0, v0, 0xa

    iput v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    .line 140
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyProgress()V

    .line 143
    invoke-virtual {v3}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->isDownloadFailed(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    goto :goto_0

    .line 153
    :cond_1
    invoke-direct {p0, p1, v3}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->onReceivedData(Lcom/huawei/health/sns/util/protocol/http/utils/DownloadBean;Lo/bqg;)V

    goto :goto_0

    .line 159
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http response code failed, code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lo/bqg;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->notifyDownloadFail(Ljava/lang/String;I)V

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download file failed, message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 162
    invoke-virtual {v3}, Lo/bqg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 161
    const v1, 0x14ffe

    invoke-static {v1, v0}, Lo/bpj;->b(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    :goto_0
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 168
    goto :goto_1

    .line 167
    :catchall_0
    move-exception v4

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 168
    throw v4

    .line 170
    :goto_1
    return-void
.end method

.method public getCurrentProgress()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->currentProgress:I

    return v0
.end method

.method public isCanceled()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->isCanceled:Z

    return v0
.end method

.method public setCanceled(Z)V
    .locals 0

    .line 110
    iput-boolean p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->isCanceled:Z

    .line 111
    return-void
.end method

.method public setListener(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/http/utils/DownloadHTTPSUtil;->listener:Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    .line 121
    return-void
.end method
