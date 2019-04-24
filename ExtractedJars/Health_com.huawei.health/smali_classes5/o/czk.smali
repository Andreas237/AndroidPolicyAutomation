.class public abstract Lo/czk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/nio/charset/Charset;


# instance fields
.field protected a:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 96
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo/czk;->e:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const-string v0, "https://api.vmall.com/rest.php"

    iput-object v0, p0, Lo/czk;->a:Ljava/lang/String;

    .line 87
    const-string v0, "https://healthdata.hicloud.com"

    iput-object v0, p0, Lo/czk;->d:Ljava/lang/String;

    .line 95
    const-string v0, "api.vmall.com"

    iput-object v0, p0, Lo/czk;->c:Ljava/lang/String;

    return-void
.end method

.method private a(Lo/diy;Lorg/apache/http/HttpResponse;Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;Lorg/apache/http/client/HttpClient;Lo/czs;Lorg/apache/http/HttpHost;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 268
    if-eqz p4, :cond_1

    .line 269
    const-string v0, "UTF-8"

    invoke-virtual {p4, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/czk;->a([B)[B

    move-result-object v4

    .line 270
    new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v0, v4}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    invoke-virtual {p3, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 272
    const/4 v0, 0x2

    if-ne v0, p8, :cond_0

    .line 273
    invoke-virtual {p1, p7, p3}, Lo/diy;->b(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p2

    goto :goto_0

    .line 276
    :cond_0
    invoke-interface {p5, p7, p3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object p2

    .line 278
    :goto_0
    goto :goto_1

    .line 281
    :cond_1
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "request data is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "request data is null!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :goto_1
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "httpResponse status ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_2

    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    const/16 v1, 0x12e

    if-ne v0, v1, :cond_4

    .line 287
    :cond_2
    invoke-interface {p2}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 288
    invoke-virtual {p0, p2}, Lo/czk;->b(Lorg/apache/http/HttpResponse;)[B

    move-result-object v0

    invoke-virtual {p6, v0}, Lo/czs;->e([B)V

    goto :goto_2

    .line 290
    :cond_3
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpResponse.getEntity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    :cond_4
    :goto_2
    return-void
.end method

.method public static a([B)[B
    .locals 8

    .line 419
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 420
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 422
    :cond_0
    const/4 v3, 0x0

    .line 423
    const/4 v4, 0x0

    .line 425
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v4, v0

    .line 426
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    array-length v2, p0

    invoke-direct {v1, v4, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 428
    array-length v0, p0

    const/4 v1, 0x0

    invoke-virtual {v3, p0, v1, v0}, Ljava/io/DataOutputStream;->write([BII)V

    .line 429
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    if-eqz v3, :cond_2

    .line 435
    :try_start_1
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 438
    goto/16 :goto_1

    .line 436
    :catch_0
    move-exception v5

    .line 437
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gzip error!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    goto :goto_1

    .line 430
    :catch_1
    move-exception v5

    .line 431
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gzip error!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 433
    if-eqz v3, :cond_2

    .line 435
    :try_start_3
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 438
    goto :goto_1

    .line 436
    :catch_2
    move-exception v5

    .line 437
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gzip error!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    goto :goto_1

    .line 433
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_1

    .line 435
    :try_start_4
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 438
    goto :goto_0

    .line 436
    :catch_3
    move-exception v7

    .line 437
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gzip error!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    :cond_1
    :goto_0
    throw v6

    .line 443
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/czs;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 399
    invoke-virtual {p1}, Lo/czs;->c()I

    move-result v0

    if-lez v0, :cond_1

    .line 400
    const/4 v4, 0x0

    .line 402
    :try_start_0
    invoke-virtual {p1}, Lo/czs;->a()[B

    move-result-object v0

    invoke-static {v0}, Lo/czu;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 405
    goto :goto_0

    .line 403
    :catch_0
    move-exception v5

    .line 404
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    :goto_0
    if-nez v4, :cond_0

    .line 407
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {p1}, Lo/czs;->c()I

    move-result v1

    const-string v2, "Unknown error"

    invoke-direct {v0, v1, v2}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 409
    :cond_0
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {p1}, Lo/czs;->c()I

    move-result v1

    invoke-direct {v0, v1, v4}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 411
    :cond_1
    return-void
.end method


# virtual methods
.method protected abstract b(Ljava/lang/String;Ljava/util/Map;III)Lo/czs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;III)Lo/czs;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation
.end method

.method protected b(Lorg/apache/http/HttpResponse;)[B
    .locals 14

    .line 451
    const/4 v4, 0x0

    .line 453
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v5

    .line 454
    if-nez v5, :cond_0

    .line 455
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseHttpResponse entity = null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 460
    :cond_0
    const/4 v6, 0x0

    .line 461
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 463
    :try_start_0
    invoke-interface {v5}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v8

    .line 464
    const/4 v9, 0x0

    .line 465
    if-eqz v8, :cond_1

    .line 466
    invoke-interface {v8}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v9

    .line 470
    :cond_1
    const-string v0, "gzip"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "z"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 471
    :cond_2
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Gzip support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-interface {v5}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    goto :goto_0

    .line 474
    :cond_3
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Gzip not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-interface {v5}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .line 477
    :goto_0
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 478
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v6, v10}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 480
    const/4 v0, 0x0

    invoke-virtual {v7, v10, v0, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 482
    :cond_4
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 490
    if-eqz v6, :cond_5

    .line 492
    :try_start_1
    invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 495
    goto :goto_2

    .line 493
    :catch_0
    move-exception v8

    .line 494
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bin.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_5
    :goto_2
    if-eqz v7, :cond_b

    .line 499
    :try_start_2
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 502
    goto/16 :goto_8

    .line 500
    :catch_1
    move-exception v8

    .line 501
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baos.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    goto/16 :goto_8

    .line 483
    :catch_2
    move-exception v8

    .line 484
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseHttpResponse1 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 490
    if-eqz v6, :cond_6

    .line 492
    :try_start_4
    invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 495
    goto :goto_3

    .line 493
    :catch_3
    move-exception v8

    .line 494
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bin.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_6
    :goto_3
    if-eqz v7, :cond_b

    .line 499
    :try_start_5
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 502
    goto/16 :goto_8

    .line 500
    :catch_4
    move-exception v8

    .line 501
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baos.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    goto/16 :goto_8

    .line 485
    :catch_5
    move-exception v8

    .line 486
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseHttpResponse2 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 490
    if-eqz v6, :cond_7

    .line 492
    :try_start_7
    invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 495
    goto :goto_4

    .line 493
    :catch_6
    move-exception v8

    .line 494
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bin.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_7
    :goto_4
    if-eqz v7, :cond_b

    .line 499
    :try_start_8
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 502
    goto/16 :goto_8

    .line 500
    :catch_7
    move-exception v8

    .line 501
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baos.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    goto/16 :goto_8

    .line 487
    :catch_8
    move-exception v8

    .line 488
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseHttpResponse3 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 490
    if-eqz v6, :cond_8

    .line 492
    :try_start_a
    invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 495
    goto :goto_5

    .line 493
    :catch_9
    move-exception v8

    .line 494
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bin.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_8
    :goto_5
    if-eqz v7, :cond_b

    .line 499
    :try_start_b
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 502
    goto/16 :goto_8

    .line 500
    :catch_a
    move-exception v8

    .line 501
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baos.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    goto :goto_8

    .line 490
    :catchall_0
    move-exception v12

    if-eqz v6, :cond_9

    .line 492
    :try_start_c
    invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b

    .line 495
    goto :goto_6

    .line 493
    :catch_b
    move-exception v13

    .line 494
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bin.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_9
    :goto_6
    if-eqz v7, :cond_a

    .line 499
    :try_start_d
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_c

    .line 502
    goto :goto_7

    .line 500
    :catch_c
    move-exception v13

    .line 501
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baos.close() error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :cond_a
    :goto_7
    throw v12

    .line 505
    :cond_b
    :goto_8
    return-object v4
.end method

.method public c(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;III)Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 143
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    const/4 v6, 0x2

    invoke-virtual/range {v0 .. v6}, Lo/czk;->d(Ljava/lang/String;Ljava/util/Map;IIII)Lo/czs;

    move-result-object v7

    .line 144
    const/4 v8, 0x0

    .line 145
    invoke-virtual {v7}, Lo/czs;->a()[B

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 147
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifiCall param 5 Request failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {v7}, Lo/czs;->b()I

    move-result v1

    const-string v2, "wifiCall param 5 Request failed."

    invoke-direct {v0, v1, v2}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 152
    :cond_0
    :try_start_0
    invoke-virtual {v7}, Lo/czs;->a()[B

    move-result-object v0

    invoke-static {v0}, Lo/czu;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 157
    goto :goto_0

    .line 153
    :catch_0
    move-exception v9

    .line 154
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifiCall param 5 Parse failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {v7}, Lo/czs;->b()I

    move-result v1

    const-string v2, "wifiCall param 5 Parse failed."

    invoke-direct {v0, v1, v2, v9}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 158
    :goto_0
    if-eqz v8, :cond_1

    .line 159
    move-object v9, v8

    .line 160
    const-string v0, "\"devId\":\".*?\""

    const-string v1, "\"devId\";\"***\""

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 161
    const-string v0, "\"psk\":\".*?\""

    const-string v1, "\"psk\";\"***\""

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 162
    const-string v0, "\"verifyCode\":\".*?\""

    const-string v1, "\"verifyCode\";\"***\""

    invoke-virtual {v9, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 163
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wifiCall = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :cond_1
    return-object v8
.end method

.method protected d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;III)Lo/czs;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 189
    const/4 v9, 0x0

    .line 190
    const/4 v10, 0x0

    .line 191
    const/4 v11, 0x0

    .line 192
    const/4 v12, 0x0

    .line 193
    const/4 v13, 0x0

    .line 196
    const/4 v0, 0x2

    move/from16 v1, p6

    if-ne v0, v1, :cond_0

    .line 197
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getLimitedHttpClient(Landroid/content/Context;Ljava/lang/String;)Lo/diy;

    move-result-object v9

    goto :goto_0

    .line 200
    :cond_0
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpClient(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;

    move-result-object v10

    .line 203
    :goto_0
    move-object/from16 v0, p2

    move/from16 v1, p4

    move/from16 v2, p5

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpPost(Ljava/lang/String;IIZ)Lorg/apache/http/client/methods/HttpPost;

    move-result-object v12

    .line 205
    invoke-static/range {p2 .. p2}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getHttpHost(Ljava/lang/String;)Lorg/apache/http/HttpHost;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v13

    .line 211
    goto :goto_1

    .line 207
    :catch_0
    move-exception v14

    .line 209
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHttpClient Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service unavailable.6"

    const/4 v2, 0x6

    invoke-direct {v0, v2, v1, v14}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 213
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v12, :cond_1

    .line 214
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service unavailable."

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 218
    :cond_1
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v12, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    const-string v0, "Content-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v12, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    invoke-static/range {p1 .. p1}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 223
    const-string v0, "x-huid"

    invoke-virtual {v12, v0, v14}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "x-huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 226
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huid isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-static/range {p1 .. p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->moveInfoFromSPTODB()V

    .line 228
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "huid is empty."

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 231
    :cond_2
    const-string v0, "0"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 232
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huid is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "huid is 0."

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 236
    :cond_3
    invoke-static/range {p1 .. p1}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v15

    .line 237
    const-string v0, "x-version"

    invoke-virtual {v12, v0, v15}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v0, "Content-Type"

    const-string v1, "application/json;charset=UTF-8"

    invoke-virtual {v12, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v12, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const/16 v16, 0x0

    .line 241
    new-instance v17, Lo/czs;

    invoke-direct/range {v17 .. v17}, Lo/czs;-><init>()V

    .line 244
    move-object/from16 v0, p0

    move-object v1, v9

    move-object/from16 v2, v16

    move-object v3, v12

    move-object/from16 v4, p3

    move-object v5, v10

    move-object/from16 v6, v17

    move-object v7, v13

    move/from16 v8, p6

    const/4 v2, 0x0

    :try_start_1
    invoke-direct/range {v0 .. v8}, Lo/czk;->a(Lo/diy;Lorg/apache/http/HttpResponse;Lorg/apache/http/client/methods/HttpPost;Ljava/lang/String;Lorg/apache/http/client/HttpClient;Lo/czs;Lorg/apache/http/HttpHost;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 253
    :try_start_2
    invoke-virtual {v12}, Lorg/apache/http/client/methods/HttpPost;->isAborted()Z

    move-result v0

    if-nez v0, :cond_4

    .line 254
    invoke-virtual {v12}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 258
    :cond_4
    goto/16 :goto_3

    .line 256
    :catch_1
    move-exception v18

    .line 257
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reuest param 6 Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    goto :goto_3

    .line 246
    :catch_2
    move-exception v18

    .line 248
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reuest param 6 Service unavailable e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service unavailable.6"

    const/4 v2, 0x6

    move-object/from16 v3, v18

    invoke-direct {v0, v2, v1, v3}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 252
    :catchall_0
    move-exception v19

    .line 253
    :try_start_4
    invoke-virtual {v12}, Lorg/apache/http/client/methods/HttpPost;->isAborted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 254
    invoke-virtual {v12}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 258
    :cond_5
    goto :goto_2

    .line 256
    :catch_3
    move-exception v20

    .line 257
    const-string v0, "AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reuest param 6 Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :goto_2
    throw v19

    .line 261
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/czk;->e(Lo/czs;)V

    .line 263
    return-object v17
.end method

.method protected abstract d(Ljava/lang/String;Ljava/util/Map;IIII)Lo/czs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;IIII)Lo/czs;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation
.end method

.method public e(Ljava/lang/String;Ljava/util/Map;III)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;III)Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 124
    invoke-virtual/range {p0 .. p5}, Lo/czk;->b(Ljava/lang/String;Ljava/util/Map;III)Lo/czs;

    move-result-object v4

    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-virtual {v4}, Lo/czs;->a()[B

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 128
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "call param 5 Request failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {v4}, Lo/czs;->b()I

    move-result v1

    const-string v2, "call param 5 Request failed."

    invoke-direct {v0, v1, v2}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 133
    :cond_0
    :try_start_0
    invoke-virtual {v4}, Lo/czs;->a()[B

    move-result-object v0

    invoke-static {v0}, Lo/czu;->e([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 138
    goto :goto_0

    .line 134
    :catch_0
    move-exception v6

    .line 135
    const-string v0, "UIME_AbsNSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "call param 5 Parse failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    invoke-virtual {v4}, Lo/czs;->b()I

    move-result v1

    const-string v2, "call param 5 Parse failed."

    invoke-direct {v0, v1, v2, v6}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0

    .line 139
    :goto_0
    return-object v5
.end method
