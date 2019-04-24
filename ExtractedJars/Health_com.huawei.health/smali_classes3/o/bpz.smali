.class public final Lo/bpz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bpz$a;,
        Lo/bpz$c;
    }
.end annotation


# static fields
.field public static final b:Ljava/net/CookieManager;


# instance fields
.field private a:Lo/bqk;

.field private c:Lo/bqg;

.field private d:Ljava/net/HttpURLConnection;

.field private final e:I

.field private final f:Lo/bqe;

.field private final g:Z

.field private final h:Lo/bqe;

.field private final i:Z

.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 76
    new-instance v0, Ljava/net/CookieManager;

    new-instance v1, Lo/bpz$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/bpz$c;-><init>(Lo/bpz$4;)V

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/net/CookieManager;-><init>(Ljava/net/CookieStore;Ljava/net/CookiePolicy;)V

    sput-object v0, Lo/bpz;->b:Ljava/net/CookieManager;

    .line 132
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 134
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    :cond_0
    sget-object v0, Lo/bpz;->b:Ljava/net/CookieManager;

    invoke-static {v0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 139
    return-void
.end method

.method private constructor <init>(Lo/bpz$a;)V
    .locals 1

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    invoke-static {p1}, Lo/bpz$a;->d(Lo/bpz$a;)I

    move-result v0

    iput v0, p0, Lo/bpz;->e:I

    .line 144
    invoke-static {p1}, Lo/bpz$a;->c(Lo/bpz$a;)I

    move-result v0

    iput v0, p0, Lo/bpz;->k:I

    .line 145
    invoke-static {p1}, Lo/bpz$a;->e(Lo/bpz$a;)Z

    move-result v0

    iput-boolean v0, p0, Lo/bpz;->i:Z

    .line 146
    invoke-static {p1}, Lo/bpz$a;->b(Lo/bpz$a;)Z

    move-result v0

    iput-boolean v0, p0, Lo/bpz;->g:Z

    .line 147
    invoke-static {p1}, Lo/bpz$a;->a(Lo/bpz$a;)Lo/bqe;

    move-result-object v0

    iput-object v0, p0, Lo/bpz;->h:Lo/bqe;

    .line 148
    invoke-static {p1}, Lo/bpz$a;->h(Lo/bpz$a;)Lo/bqe;

    move-result-object v0

    iput-object v0, p0, Lo/bpz;->f:Lo/bqe;

    .line 149
    return-void
.end method

.method synthetic constructor <init>(Lo/bpz$a;Lo/bpz$4;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/bpz;-><init>(Lo/bpz$a;)V

    return-void
.end method

.method private static a(Ljava/lang/String;)J
    .locals 3

    .line 394
    if-nez p0, :cond_0

    .line 396
    const-wide/16 v0, -0x1

    return-wide v0

    .line 400
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 402
    :catch_0
    move-exception v2

    .line 404
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private a(Lo/bqk;)Lo/bqg;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 262
    if-nez p1, :cond_0

    .line 264
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "request is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 267
    :cond_0
    invoke-direct {p0, p1}, Lo/bpz;->b(Lo/bqk;)Lo/bqg;

    move-result-object v2

    .line 268
    invoke-direct {p0}, Lo/bpz;->d()Lo/bqk;

    move-result-object v3

    .line 269
    if-eqz v3, :cond_1

    .line 272
    invoke-virtual {v2}, Lo/bqg;->close()V

    .line 275
    invoke-direct {p0, v3}, Lo/bpz;->b(Lo/bqk;)Lo/bqg;

    move-result-object v2

    .line 278
    :cond_1
    return-object v2
.end method

.method private b(Lo/bqk;)Lo/bqg;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 284
    iput-object p1, p0, Lo/bpz;->a:Lo/bqk;

    .line 286
    invoke-virtual {p1}, Lo/bqk;->d()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 289
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    move-object v3, v0

    check-cast v3, Ljavax/net/ssl/HttpsURLConnection;

    .line 292
    invoke-static {v3}, Lo/bpw;->d(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 296
    :cond_0
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    iget v1, p0, Lo/bpz;->k:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 297
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    iget v1, p0, Lo/bpz;->e:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 300
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {p1}, Lo/bqk;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 302
    invoke-direct {p0, p1}, Lo/bpz;->c(Lo/bqk;)V

    .line 305
    invoke-virtual {p1}, Lo/bqk;->a()Lo/bqh;

    move-result-object v3

    .line 306
    invoke-virtual {p1}, Lo/bqk;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    .line 308
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 310
    invoke-virtual {v3}, Lo/bqh;->a()Ljava/lang/String;

    move-result-object v4

    .line 311
    if-eqz v4, :cond_1

    .line 313
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    :cond_1
    invoke-virtual {v3}, Lo/bqh;->e()J

    move-result-wide v5

    .line 317
    const-wide/16 v0, -0x1

    cmp-long v0, v5, v0

    if-eqz v0, :cond_3

    .line 319
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 321
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v5, v6}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(J)V

    goto :goto_0

    .line 326
    :cond_2
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    long-to-int v1, v5

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    goto :goto_0

    .line 331
    :cond_3
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 335
    :goto_0
    new-instance v7, Lo/bqa;

    iget-object v0, p0, Lo/bpz;->f:Lo/bqe;

    invoke-direct {v7, v0}, Lo/bqa;-><init>(Lo/bqe;)V

    .line 336
    invoke-virtual {v7, v5, v6}, Lo/bqa;->e(J)V

    .line 339
    new-instance v8, Lo/bqf;

    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v8, v0, v7}, Lo/bqf;-><init>(Ljava/io/OutputStream;Lo/bqa;)V

    .line 344
    :try_start_0
    invoke-virtual {v3, v8}, Lo/bqh;->d(Ljava/io/OutputStream;)V

    .line 345
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 350
    invoke-static {v8}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 351
    goto :goto_1

    .line 350
    :catchall_0
    move-exception v9

    invoke-static {v8}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 351
    throw v9

    .line 355
    :cond_4
    :goto_1
    new-instance v4, Lo/bqg$d;

    invoke-direct {v4}, Lo/bqg$d;-><init>()V

    .line 356
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    .line 357
    invoke-virtual {v4, v5}, Lo/bqg$d;->e(I)Lo/bqg$d;

    move-result-object v0

    iget-object v1, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 358
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bqg$d;->b(Ljava/lang/String;)Lo/bqg$d;

    move-result-object v0

    iget-object v1, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 359
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bqg$d;->a(Ljava/util/Map;)Lo/bqg$d;

    move-result-object v0

    iget-object v1, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 360
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bqg$d;->a(Ljava/net/URL;)Lo/bqg$d;

    .line 361
    const/4 v6, 0x0

    .line 362
    const/16 v0, 0xc8

    if-ne v5, v0, :cond_5

    .line 365
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpz;->a(Ljava/lang/String;)J

    move-result-wide v7

    .line 368
    new-instance v9, Lo/bqa;

    iget-object v0, p0, Lo/bpz;->h:Lo/bqe;

    invoke-direct {v9, v0}, Lo/bqa;-><init>(Lo/bqe;)V

    .line 369
    invoke-virtual {v9, v7, v8}, Lo/bqa;->e(J)V

    .line 371
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 372
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/bqd;

    iget-object v2, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 374
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2, v9}, Lo/bqd;-><init>(Ljava/io/InputStream;Lo/bqa;)V

    .line 371
    invoke-static {v0, v7, v8, v1}, Lo/bqi;->c(Ljava/lang/String;JLjava/io/InputStream;)Lo/bqi;

    move-result-object v6

    .line 377
    invoke-virtual {v4, v6}, Lo/bqg$d;->d(Lo/bqi;)Lo/bqg$d;

    .line 380
    :cond_5
    invoke-virtual {v4, p0}, Lo/bqg$d;->e(Lo/bpz;)Lo/bqg$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqg$d;->e()Lo/bqg;

    move-result-object v0

    iput-object v0, p0, Lo/bpz;->c:Lo/bqg;

    .line 389
    iget-object v0, p0, Lo/bpz;->c:Lo/bqg;

    return-object v0
.end method

.method public static b()V
    .locals 1

    .line 492
    sget-object v0, Lo/bpz;->b:Ljava/net/CookieManager;

    invoke-virtual {v0}, Ljava/net/CookieManager;->getCookieStore()Ljava/net/CookieStore;

    move-result-object v0

    invoke-interface {v0}, Ljava/net/CookieStore;->removeAll()Z

    .line 493
    return-void
.end method

.method private static b(Ljava/io/IOException;)Z
    .locals 1

    .line 163
    instance-of v0, p0, Ljava/net/ProtocolException;

    if-eqz v0, :cond_0

    .line 165
    const/4 v0, 0x0

    return v0

    .line 169
    :cond_0
    instance-of v0, p0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 171
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    return v0

    .line 175
    :cond_1
    instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_2

    .line 177
    invoke-virtual {p0}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/cert/CertificateException;

    if-eqz v0, :cond_2

    .line 179
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_2
    instance-of v0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_3

    .line 185
    const/4 v0, 0x0

    return v0

    .line 188
    :cond_3
    instance-of v0, p0, Ljava/net/ConnectException;

    if-eqz v0, :cond_4

    .line 191
    const/4 v0, 0x0

    return v0

    .line 194
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lo/bqk;)V
    .locals 6

    .line 460
    invoke-virtual {p1}, Lo/bqk;->c()Lo/bpv;

    move-result-object v1

    .line 461
    if-nez v1, :cond_0

    .line 463
    return-void

    .line 466
    :cond_0
    invoke-virtual {v1}, Lo/bpv;->a()I

    move-result v2

    .line 467
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 469
    invoke-virtual {v1, v3}, Lo/bpv;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 470
    invoke-virtual {v1, v3}, Lo/bpv;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 471
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v4, v5}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 474
    :cond_1
    return-void
.end method

.method private d()Lo/bqk;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lo/bpz;->c:Lo/bqg;

    if-nez v0, :cond_0

    .line 416
    const/4 v0, 0x0

    return-object v0

    .line 419
    :cond_0
    iget-boolean v0, p0, Lo/bpz;->i:Z

    if-nez v0, :cond_1

    .line 421
    const/4 v0, 0x0

    return-object v0

    .line 424
    :cond_1
    iget-object v0, p0, Lo/bpz;->c:Lo/bqg;

    invoke-virtual {v0}, Lo/bqg;->e()I

    move-result v2

    .line 425
    const/16 v0, 0x12d

    if-eq v2, v0, :cond_2

    const/16 v0, 0x12e

    if-ne v2, v0, :cond_5

    .line 429
    :cond_2
    iget-object v0, p0, Lo/bpz;->c:Lo/bqg;

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Lo/bqg;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 430
    if-nez v3, :cond_3

    .line 432
    const/4 v0, 0x0

    return-object v0

    .line 436
    :cond_3
    iget-object v0, p0, Lo/bpz;->a:Lo/bqk;

    invoke-virtual {v0}, Lo/bqk;->e()Lo/bqk$d;

    move-result-object v4

    .line 437
    const-string v0, "POST"

    iget-object v1, p0, Lo/bpz;->a:Lo/bqk;

    invoke-virtual {v1}, Lo/bqk;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 440
    const-string v0, "GET"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lo/bqk$d;->b(Ljava/lang/String;Lo/bqh;)Lo/bqk$d;

    .line 442
    const-string v0, "Transfer-Encoding"

    invoke-virtual {v4, v0}, Lo/bqk$d;->a(Ljava/lang/String;)Lo/bqk$d;

    .line 443
    const-string v0, "Content-Length"

    invoke-virtual {v4, v0}, Lo/bqk$d;->a(Ljava/lang/String;)Lo/bqk$d;

    .line 444
    const-string v0, "Content-Type"

    invoke-virtual {v4, v0}, Lo/bqk$d;->a(Ljava/lang/String;)Lo/bqk$d;

    .line 447
    :cond_4
    invoke-virtual {v4, v3}, Lo/bqk$d;->d(Ljava/lang/String;)Lo/bqk$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqk$d;->c()Lo/bqk;

    move-result-object v0

    return-object v0

    .line 451
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 480
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 483
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bpz;->d:Ljava/net/HttpURLConnection;

    .line 485
    :cond_0
    return-void
.end method

.method public e(Lo/bqk;)Lo/bqg;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    const/4 v1, 0x0

    .line 208
    const/4 v2, -0x1

    .line 210
    const/4 v3, 0x0

    .line 226
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lo/bpz;->a(Lo/bqk;)Lo/bqg;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v1, v0

    .line 228
    const/4 v3, 0x0

    .line 237
    if-nez v1, :cond_2

    .line 239
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    goto :goto_0

    .line 230
    :catch_0
    move-exception v4

    .line 232
    move-object v3, v4

    .line 237
    if-nez v1, :cond_2

    .line 239
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    goto :goto_0

    .line 237
    :catchall_0
    move-exception v5

    if-nez v1, :cond_1

    .line 239
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 241
    :cond_1
    throw v5

    .line 243
    :cond_2
    :goto_0
    add-int/lit8 v2, v2, 0x1

    .line 246
    if-eqz v3, :cond_3

    iget-boolean v0, p0, Lo/bpz;->g:Z

    if-eqz v0, :cond_3

    .line 248
    invoke-static {v3}, Lo/bpz;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    if-lt v2, v0, :cond_0

    .line 251
    :cond_3
    if-eqz v3, :cond_4

    .line 253
    throw v3

    .line 257
    :cond_4
    return-object v1
.end method
