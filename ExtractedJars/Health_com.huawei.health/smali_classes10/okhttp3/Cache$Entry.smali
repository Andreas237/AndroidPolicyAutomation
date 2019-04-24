.class final Lokhttp3/Cache$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Entry"
.end annotation


# instance fields
.field private final code:I

.field private final handshake:Lokhttp3/Handshake;

.field private final message:Ljava/lang/String;

.field private final protocol:Lokhttp3/Protocol;

.field private final requestMethod:Ljava/lang/String;

.field private final responseHeaders:Lokhttp3/Headers;

.field private final url:Ljava/lang/String;

.field private final varyHeaders:Lokhttp3/Headers;


# direct methods
.method public constructor <init>(Lokhttp3/Response;)V
    .locals 1

    .line 574
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 575
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 576
    invoke-static {p1}, Lokhttp3/internal/http/OkHeaders;->varyHeaders(Lokhttp3/Response;)Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 577
    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 578
    invoke-virtual {p1}, Lokhttp3/Response;->protocol()Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 579
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    iput v0, p0, Lokhttp3/Cache$Entry;->code:I

    .line 580
    invoke-virtual {p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 581
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 582
    invoke-virtual {p1}, Lokhttp3/Response;->handshake()Lokhttp3/Handshake;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    .line 583
    return-void
.end method

.method public constructor <init>(Lokio/Source;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 530
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 532
    :try_start_0
    invoke-static/range {p1 .. p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v3

    .line 533
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 534
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 535
    new-instance v4, Lokhttp3/Headers$Builder;

    invoke-direct {v4}, Lokhttp3/Headers$Builder;-><init>()V

    .line 536
    invoke-static {v3}, Lokhttp3/Cache;->access$1000(Lokio/BufferedSource;)I

    move-result v5

    .line 537
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    .line 538
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lokhttp3/Headers$Builder;->addLenient(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 537
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 540
    :cond_0
    invoke-virtual {v4}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 542
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/StatusLine;->parse(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v6

    .line 543
    iget-object v0, v6, Lokhttp3/internal/http/StatusLine;->protocol:Lokhttp3/Protocol;

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 544
    iget v0, v6, Lokhttp3/internal/http/StatusLine;->code:I

    move-object/from16 v1, p0

    iput v0, v1, Lokhttp3/Cache$Entry;->code:I

    .line 545
    iget-object v0, v6, Lokhttp3/internal/http/StatusLine;->message:Ljava/lang/String;

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 546
    new-instance v7, Lokhttp3/Headers$Builder;

    invoke-direct {v7}, Lokhttp3/Headers$Builder;-><init>()V

    .line 547
    invoke-static {v3}, Lokhttp3/Cache;->access$1000(Lokio/BufferedSource;)I

    move-result v8

    .line 548
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    .line 549
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lokhttp3/Headers$Builder;->addLenient(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 548
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 551
    :cond_1
    invoke-virtual {v7}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 553
    invoke-direct/range {p0 .. p0}, Lokhttp3/Cache$Entry;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 554
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v9

    .line 555
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 556
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected \"\" but was \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 558
    :cond_2
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v10

    .line 559
    invoke-static {v10}, Lokhttp3/CipherSuite;->forJavaName(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v11

    .line 560
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lokhttp3/Cache$Entry;->readCertificateList(Lokio/BufferedSource;)Ljava/util/List;

    move-result-object v12

    .line 561
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lokhttp3/Cache$Entry;->readCertificateList(Lokio/BufferedSource;)Ljava/util/List;

    move-result-object v13

    .line 562
    invoke-interface {v3}, Lokio/BufferedSource;->exhausted()Z

    move-result v0

    if-nez v0, :cond_3

    .line 563
    invoke-interface {v3}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/TlsVersion;->forJavaName(Ljava/lang/String;)Lokhttp3/TlsVersion;

    move-result-object v14

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    .line 565
    :goto_2
    invoke-static {v14, v11, v12, v13}, Lokhttp3/Handshake;->get(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    .line 566
    goto :goto_3

    .line 567
    :cond_4
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 570
    :goto_3
    invoke-interface/range {p1 .. p1}, Lokio/Source;->close()V

    .line 571
    goto :goto_4

    .line 570
    :catchall_0
    move-exception v15

    invoke-interface/range {p1 .. p1}, Lokio/Source;->close()V

    throw v15

    .line 572
    :goto_4
    return-void
.end method

.method private isHttps()Z
    .locals 2

    .line 628
    iget-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private readCertificateList(Lokio/BufferedSource;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokio/BufferedSource;)Ljava/util/List<Ljava/security/cert/Certificate;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 632
    invoke-static {p1}, Lokhttp3/Cache;->access$1000(Lokio/BufferedSource;)I

    move-result v2

    .line 633
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 636
    :cond_0
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 637
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 638
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    .line 639
    invoke-interface {p1}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v6

    .line 640
    new-instance v7, Lokio/Buffer;

    invoke-direct {v7}, Lokio/Buffer;-><init>()V

    .line 641
    invoke-static {v6}, Lokio/ByteString;->decodeBase64(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v7, v0}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    .line 642
    invoke-virtual {v7}, Lokio/Buffer;->inputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 638
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 644
    :cond_1
    return-object v4

    .line 645
    :catch_0
    move-exception v3

    .line 646
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v3}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeCertList(Lokio/BufferedSink;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokio/BufferedSink;Ljava/util/List<Ljava/security/cert/Certificate;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 653
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 654
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 655
    const/4 v2, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_0

    .line 656
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v4

    .line 657
    invoke-static {v4}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lokio/ByteString;->base64()Ljava/lang/String;

    move-result-object v5

    .line 658
    invoke-interface {p1, v5}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 659
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 663
    :cond_0
    goto :goto_1

    .line 661
    :catch_0
    move-exception v2

    .line 662
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v2}, Ljava/security/cert/CertificateEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 664
    :goto_1
    return-void
.end method


# virtual methods
.method public matches(Lokhttp3/Request;Lokhttp3/Response;)Z
    .locals 2

    .line 667
    iget-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 668
    invoke-virtual {p1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 669
    invoke-static {p2, v0, p1}, Lokhttp3/internal/http/OkHeaders;->varyMatches(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public response(Lokhttp3/internal/DiskLruCache$Snapshot;)Lokhttp3/Response;
    .locals 6

    .line 673
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 674
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 675
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v1, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    .line 676
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    .line 677
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    .line 678
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 679
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v5

    .line 680
    new-instance v0, Lokhttp3/Response$Builder;

    invoke-direct {v0}, Lokhttp3/Response$Builder;-><init>()V

    .line 681
    invoke-virtual {v0, v5}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    .line 682
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget v1, p0, Lokhttp3/Cache$Entry;->code:I

    .line 683
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    .line 684
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    .line 685
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/Cache$CacheResponseBody;

    invoke-direct {v1, p1, v3, v4}, Lokhttp3/Cache$CacheResponseBody;-><init>(Lokhttp3/internal/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    .line 687
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 688
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lokhttp3/internal/DiskLruCache$Editor;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 586
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lokhttp3/internal/DiskLruCache$Editor;->newSink(I)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v4

    .line 588
    iget-object v0, p0, Lokhttp3/Cache$Entry;->url:Ljava/lang/String;

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 589
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 590
    iget-object v0, p0, Lokhttp3/Cache$Entry;->requestMethod:Ljava/lang/String;

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 591
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 592
    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {v4, v0, v1}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 593
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 594
    const/4 v5, 0x0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_0

    .line 595
    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v0, v5}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 596
    const-string v0, ": "

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 597
    iget-object v0, p0, Lokhttp3/Cache$Entry;->varyHeaders:Lokhttp3/Headers;

    invoke-virtual {v0, v5}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 598
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 594
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 601
    :cond_0
    new-instance v0, Lokhttp3/internal/http/StatusLine;

    iget-object v1, p0, Lokhttp3/Cache$Entry;->protocol:Lokhttp3/Protocol;

    iget v2, p0, Lokhttp3/Cache$Entry;->code:I

    iget-object v3, p0, Lokhttp3/Cache$Entry;->message:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/StatusLine;-><init>(Lokhttp3/Protocol;ILjava/lang/String;)V

    invoke-virtual {v0}, Lokhttp3/internal/http/StatusLine;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 602
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 603
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {v4, v0, v1}, Lokio/BufferedSink;->writeDecimalLong(J)Lokio/BufferedSink;

    .line 604
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 605
    const/4 v5, 0x0

    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    move-result v6

    :goto_1
    if-ge v5, v6, :cond_1

    .line 606
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v0, v5}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 607
    const-string v0, ": "

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 608
    iget-object v0, p0, Lokhttp3/Cache$Entry;->responseHeaders:Lokhttp3/Headers;

    invoke-virtual {v0, v5}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 609
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 605
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 612
    :cond_1
    invoke-direct {p0}, Lokhttp3/Cache$Entry;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 613
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 614
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->cipherSuite()Lokhttp3/CipherSuite;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CipherSuite;->javaName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 615
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 616
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lokhttp3/Cache$Entry;->writeCertList(Lokio/BufferedSink;Ljava/util/List;)V

    .line 617
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->localCertificates()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lokhttp3/Cache$Entry;->writeCertList(Lokio/BufferedSink;Ljava/util/List;)V

    .line 619
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->tlsVersion()Lokhttp3/TlsVersion;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 620
    iget-object v0, p0, Lokhttp3/Cache$Entry;->handshake:Lokhttp3/Handshake;

    invoke-virtual {v0}, Lokhttp3/Handshake;->tlsVersion()Lokhttp3/TlsVersion;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/TlsVersion;->javaName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 621
    const/16 v0, 0xa

    invoke-interface {v4, v0}, Lokio/BufferedSink;->writeByte(I)Lokio/BufferedSink;

    .line 624
    :cond_2
    invoke-interface {v4}, Lokio/BufferedSink;->close()V

    .line 625
    return-void
.end method
