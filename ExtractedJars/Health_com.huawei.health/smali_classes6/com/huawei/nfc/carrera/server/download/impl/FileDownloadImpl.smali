.class public Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/server/download/FileDownloadApi;


# static fields
.field private static final DOWNLOAD_CONNECT_TIME_OUT:I = 0x7530

.field private static final DOWNLOAD_READ_TIME_OUT:I = 0x7530

.field private static SYNC_LOCK:[B = null


# instance fields
.field private currentSize:J

.field private volatile isCancel:Z

.field private final mContext:Landroid/content/Context;

.field private progressTemp:I

.field private validUrlArray:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->SYNC_LOCK:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->isCancel:Z

    .line 66
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->currentSize:J

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->progressTemp:I

    .line 77
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "mpay.unionpay.com/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "file.dbank.com/dl/HuaweiPay/rfconf/LEO/B100/"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->validUrlArray:[Ljava/lang/String;

    .line 84
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->mContext:Landroid/content/Context;

    .line 85
    return-void
.end method

.method private static checkAndMakeDir(Ljava/io/File;)Z
    .locals 4

    .line 226
    if-nez p0, :cond_0

    .line 228
    const/4 v0, 0x0

    return v0

    .line 231
    :cond_0
    sget-object v1, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->SYNC_LOCK:[B

    monitor-enter v1

    .line 233
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 235
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    .line 236
    if-nez v2, :cond_1

    .line 238
    monitor-exit v1

    const/4 v0, 0x0

    return v0

    .line 241
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 243
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private downLoadConnect(Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;J)V
    .locals 1

    .line 289
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 291
    invoke-interface {p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;->downLoadConnected(J)V

    .line 293
    :cond_0
    return-void
.end method

.method private downProgressMethod(Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;IJLjava/lang/String;)V
    .locals 1

    .line 274
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 276
    invoke-interface {p1, p2, p3, p4, p5}, Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;->downProgress(IJLjava/lang/String;)V

    .line 278
    :cond_0
    return-void
.end method

.method private isUrlInArray(Ljava/lang/String;)Z
    .locals 8

    .line 310
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v4

    .line 311
    const-string v0, "[<>]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 312
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 313
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 314
    const-string v0, "isUrlInArray"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " url is illegal..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 317
    :cond_0
    const-string v0, "isUrlInArray"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is correct..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->validUrlArray:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_3

    .line 320
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->validUrlArray:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->validUrlArray:[Ljava/lang/String;

    aget-object v0, v0, v7

    .line 321
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 322
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 318
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 326
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private updateProgress(Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;JI)V
    .locals 7

    .line 256
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->currentSize:J

    int-to-long v2, p5

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->currentSize:J

    .line 257
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->currentSize:J

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    div-long/2addr v0, p3

    long-to-int v6, v0

    .line 258
    iget v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->progressTemp:I

    if-le v6, v0, :cond_0

    .line 260
    move-object v0, p0

    move-object v1, p2

    move v2, v6

    iget-wide v3, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->currentSize:J

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->downProgressMethod(Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;IJLjava/lang/String;)V

    .line 261
    iput v6, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->progressTemp:I

    .line 263
    :cond_0
    return-void
.end method


# virtual methods
.method public cancelDownLoad()V
    .locals 1

    .line 300
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->isCancel:Z

    .line 301
    return-void
.end method

.method public download(Ljava/lang/String;Ljava/io/File;)I
    .locals 1

    .line 97
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->download(Ljava/lang/String;Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;)I

    move-result v0

    return v0
.end method

.method public download(Ljava/lang/String;Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;)I
    .locals 20

    .line 104
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    const-string v0, "download file, but no network."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 107
    const/4 v0, -0x1

    return v0

    .line 110
    :cond_0
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    const-string v0, "download, but remote path is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 113
    const/4 v0, -0x2

    return v0

    .line 116
    :cond_1
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->isCancel:Z

    .line 122
    :try_start_0
    new-instance v9, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v8, v0

    .line 124
    const/16 v0, 0x7530

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 125
    const/16 v0, 0x7530

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 126
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 127
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->connect()V

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===download,getResponseCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0x12e

    if-ne v1, v0, :cond_6

    .line 130
    const-string v0, "Location"

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 132
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 133
    const/4 v11, -0x2

    .line 188
    nop

    .line 190
    .line 196
    nop

    .line 193
    .line 195
    .line 200
    nop

    .line 202
    .line 208
    nop

    .line 205
    .line 207
    .line 210
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 133
    :cond_2
    return v11

    .line 136
    :cond_3
    move-object/from16 v0, p0

    :try_start_1
    invoke-direct {v0, v10}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->isUrlInArray(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_5

    .line 137
    const/4 v11, -0x2

    .line 188
    nop

    .line 190
    .line 196
    nop

    .line 193
    .line 195
    .line 200
    nop

    .line 202
    .line 208
    nop

    .line 205
    .line 207
    .line 210
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 137
    :cond_4
    return v11

    .line 139
    :cond_5
    :try_start_2
    new-instance v9, Ljava/net/URL;

    invoke-direct {v9, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v8, v0

    .line 141
    const/16 v0, 0x7530

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 142
    const/16 v0, 0x7530

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 143
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 144
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->connect()V

    .line 146
    :cond_6
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v10, v0

    .line 147
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1, v10, v11}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->downLoadConnect(Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;J)V

    .line 148
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 150
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12

    .line 151
    invoke-static {v12}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->checkAndMakeDir(Ljava/io/File;)Z
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v13

    .line 152
    if-nez v13, :cond_9

    .line 154
    const/4 v14, -0x4

    .line 188
    nop

    .line 190
    .line 196
    nop

    .line 193
    .line 195
    .line 200
    if-eqz v6, :cond_7

    .line 202
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 208
    :cond_7
    goto :goto_0

    .line 205
    :catch_0
    move-exception v15

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_8

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 154
    :cond_8
    return v14

    .line 157
    :cond_9
    :try_start_4
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 159
    const/16 v0, 0x400

    new-array v14, v0, [B

    .line 160
    const/4 v15, 0x0

    .line 162
    :goto_1
    invoke-virtual {v6, v14}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v15, v0

    if-lez v0, :cond_e

    .line 164
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->isCancel:Z
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_8
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_d

    .line 166
    const/16 v16, -0x5

    .line 188
    if-eqz v7, :cond_a

    .line 190
    :try_start_5
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 196
    :cond_a
    goto :goto_2

    .line 193
    :catch_1
    move-exception v17

    .line 195
    const-string v0, "close stream 1 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    :goto_2
    if-eqz v6, :cond_b

    .line 202
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 208
    :cond_b
    goto :goto_3

    .line 205
    :catch_2
    move-exception v17

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_c

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 166
    :cond_c
    return v16

    .line 168
    :cond_d
    const/4 v0, 0x0

    :try_start_7
    invoke-virtual {v7, v14, v0, v15}, Ljava/io/FileOutputStream;->write([BII)V

    .line 170
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-wide v3, v10

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;->updateProgress(Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;JI)V
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_1

    .line 188
    :cond_e
    if-eqz v7, :cond_f

    .line 190
    :try_start_8
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 196
    :cond_f
    goto :goto_4

    .line 193
    :catch_3
    move-exception v9

    .line 195
    const-string v0, "close stream 1 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    :goto_4
    if-eqz v6, :cond_10

    .line 202
    :try_start_9
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 208
    :cond_10
    goto :goto_5

    .line 205
    :catch_4
    move-exception v9

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1a

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_c

    .line 173
    :catch_5
    move-exception v9

    .line 175
    :try_start_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "download failed, FileNotFoundException."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 176
    const/4 v10, -0x4

    .line 188
    if-eqz v7, :cond_11

    .line 190
    :try_start_b
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    .line 196
    :cond_11
    goto :goto_6

    .line 193
    :catch_6
    move-exception v11

    .line 195
    const-string v0, "close stream 1 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    :goto_6
    if-eqz v6, :cond_12

    .line 202
    :try_start_c
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7

    .line 208
    :cond_12
    goto :goto_7

    .line 205
    :catch_7
    move-exception v11

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_7
    const/4 v0, 0x0

    if-eq v0, v8, :cond_13

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 176
    :cond_13
    return v10

    .line 178
    :catch_8
    move-exception v9

    .line 180
    const-string v0, "download failed, IOException."

    :try_start_d
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 181
    const/4 v10, -0x3

    .line 188
    if-eqz v7, :cond_14

    .line 190
    :try_start_e
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    .line 196
    :cond_14
    goto :goto_8

    .line 193
    :catch_9
    move-exception v11

    .line 195
    const-string v0, "close stream 1 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    :goto_8
    if-eqz v6, :cond_15

    .line 202
    :try_start_f
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 208
    :cond_15
    goto :goto_9

    .line 205
    :catch_a
    move-exception v11

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v8, :cond_16

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 181
    :cond_16
    return v10

    .line 186
    :catchall_0
    move-exception v18

    .line 188
    if-eqz v7, :cond_17

    .line 190
    :try_start_10
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b

    .line 196
    :cond_17
    goto :goto_a

    .line 193
    :catch_b
    move-exception v19

    .line 195
    const-string v0, "close stream 1 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 200
    :goto_a
    if-eqz v6, :cond_18

    .line 202
    :try_start_11
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c

    .line 208
    :cond_18
    goto :goto_b

    .line 205
    :catch_c
    move-exception v19

    .line 207
    const-string v0, "close stream 2 failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 210
    :goto_b
    const/4 v0, 0x0

    if-eq v0, v8, :cond_19

    .line 212
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 214
    :cond_19
    throw v18

    .line 216
    :cond_1a
    :goto_c
    const/4 v0, 0x0

    return v0
.end method
