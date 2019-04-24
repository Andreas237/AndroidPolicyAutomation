.class public Lcom/tencent/open/utils/HttpUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;,
        Lcom/tencent/open/utils/HttpUtils$CustomSSLSocketFactory;,
        Lcom/tencent/open/utils/HttpUtils$NetworkProxy;,
        Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;,
        Lcom/tencent/open/utils/HttpUtils$HttpStatusException;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 155
    const-class v0, Lcom/tencent/open/utils/HttpUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/utils/HttpUtils;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 5

    .line 809
    const/4 v2, -0x1

    .line 810
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_1

    .line 811
    if-eqz p0, :cond_0

    .line 812
    invoke-static {p0}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I

    move-result v2

    .line 813
    if-gez v2, :cond_2

    .line 814
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    goto :goto_0

    .line 817
    :cond_0
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v2

    goto :goto_0

    .line 820
    :cond_1
    const-string v0, "http.proxyPort"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 821
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 823
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 825
    goto :goto_0

    .line 824
    :catch_0
    move-exception v4

    .line 828
    :cond_2
    :goto_0
    return v2
.end method

.method private static a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 603
    const-string v2, ""

    .line 604
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 606
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v4

    .line 607
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 609
    const-string v0, "Content-Encoding"

    invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v6

    .line 610
    if-eqz v6, :cond_0

    invoke-interface {v6}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gzip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 612
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v4, v0

    .line 615
    :cond_0
    const/4 v7, 0x0

    .line 616
    const/16 v0, 0x200

    new-array v8, v0, [B

    .line 617
    :goto_0
    invoke-virtual {v4, v8}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 618
    const/4 v0, 0x0

    invoke-virtual {v5, v8, v0, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 620
    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 621
    return-object v2
.end method

.method private static a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V
    .locals 3

    .line 385
    const-string v0, "add_share"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "upload_pic"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "add_topic"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "set_user_face"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "add_t"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "add_pic_t"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "add_pic_url"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_0

    const-string v0, "add_video"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    .line 393
    :cond_0
    const-string v0, "requireApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p0, p1, v0, v1}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 395
    :cond_1
    return-void
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 832
    const/4 v2, 0x0

    .line 833
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_1

    .line 834
    if-eqz p0, :cond_0

    .line 835
    invoke-static {p0}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 836
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 837
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 840
    :cond_0
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 844
    :cond_1
    const-string v0, "http.proxyHost"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 846
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 748
    if-nez p0, :cond_0

    .line 749
    const-string v0, ""

    return-object v0

    .line 751
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 752
    const/4 v3, -0x1

    .line 753
    invoke-virtual {p0}, Landroid/os/Bundle;->size()I

    move-result v4

    .line 754
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 755
    add-int/lit8 v3, v3, 0x1

    .line 756
    invoke-virtual {p0, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    .line 757
    instance-of v0, v7, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 758
    goto :goto_0

    .line 761
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object v1, v7

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 763
    add-int/lit8 v0, v4, -0x1

    if-ge v3, v0, :cond_2

    .line 764
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\r\n--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    :cond_2
    goto/16 :goto_0

    .line 769
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 9

    .line 696
    if-nez p0, :cond_0

    .line 697
    const-string v0, ""

    return-object v0

    .line 700
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    const/4 v3, 0x1

    .line 702
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 703
    invoke-virtual {p0, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 704
    instance-of v0, v6, Ljava/lang/String;

    if-nez v0, :cond_1

    instance-of v0, v6, [Ljava/lang/String;

    if-nez v0, :cond_1

    .line 706
    goto :goto_0

    .line 708
    :cond_1
    instance-of v0, v6, [Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 709
    if-eqz v3, :cond_2

    .line 710
    const/4 v3, 0x0

    goto :goto_1

    .line 712
    :cond_2
    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    invoke-virtual {p0, v5}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 716
    if-nez v7, :cond_3

    .line 717
    goto :goto_0

    .line 719
    :cond_3
    const/4 v8, 0x0

    :goto_2
    array-length v0, v7

    if-ge v8, v0, :cond_5

    .line 720
    if-nez v8, :cond_4

    .line 721
    aget-object v0, v7, v8

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 723
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v7, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 726
    :cond_5
    goto :goto_5

    .line 727
    :cond_6
    if-eqz v3, :cond_7

    .line 728
    const/4 v3, 0x0

    goto :goto_4

    .line 730
    :cond_7
    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    :goto_5
    goto/16 :goto_0

    .line 736
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getErrorCodeFromException(Ljava/io/IOException;)I
    .locals 1

    .line 398
    instance-of v0, p0, Ljava/io/CharConversionException;

    if-eqz v0, :cond_0

    .line 399
    const/16 v0, -0x14

    return v0

    .line 400
    :cond_0
    instance-of v0, p0, Ljava/nio/charset/MalformedInputException;

    if-eqz v0, :cond_1

    .line 401
    const/16 v0, -0x15

    return v0

    .line 402
    :cond_1
    instance-of v0, p0, Ljava/nio/charset/UnmappableCharacterException;

    if-eqz v0, :cond_2

    .line 403
    const/16 v0, -0x16

    return v0

    .line 404
    :cond_2
    instance-of v0, p0, Lorg/apache/http/client/HttpResponseException;

    if-eqz v0, :cond_3

    .line 405
    const/16 v0, -0x17

    return v0

    .line 406
    :cond_3
    instance-of v0, p0, Ljava/nio/channels/ClosedChannelException;

    if-eqz v0, :cond_4

    .line 407
    const/16 v0, -0x18

    return v0

    .line 408
    :cond_4
    instance-of v0, p0, Lorg/apache/http/ConnectionClosedException;

    if-eqz v0, :cond_5

    .line 409
    const/16 v0, -0x19

    return v0

    .line 410
    :cond_5
    instance-of v0, p0, Ljava/io/EOFException;

    if-eqz v0, :cond_6

    .line 411
    const/16 v0, -0x1a

    return v0

    .line 412
    :cond_6
    instance-of v0, p0, Ljava/nio/channels/FileLockInterruptionException;

    if-eqz v0, :cond_7

    .line 413
    const/16 v0, -0x1b

    return v0

    .line 414
    :cond_7
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_8

    .line 415
    const/16 v0, -0x1c

    return v0

    .line 416
    :cond_8
    instance-of v0, p0, Ljava/net/HttpRetryException;

    if-eqz v0, :cond_9

    .line 417
    const/16 v0, -0x1d

    return v0

    .line 418
    :cond_9
    instance-of v0, p0, Lorg/apache/http/conn/ConnectTimeoutException;

    if-eqz v0, :cond_a

    .line 419
    const/4 v0, -0x7

    return v0

    .line 420
    :cond_a
    instance-of v0, p0, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_b

    .line 421
    const/4 v0, -0x8

    return v0

    .line 422
    :cond_b
    instance-of v0, p0, Ljava/util/InvalidPropertiesFormatException;

    if-eqz v0, :cond_c

    .line 423
    const/16 v0, -0x1e

    return v0

    .line 424
    :cond_c
    instance-of v0, p0, Lorg/apache/http/MalformedChunkCodingException;

    if-eqz v0, :cond_d

    .line 425
    const/16 v0, -0x1f

    return v0

    .line 426
    :cond_d
    instance-of v0, p0, Ljava/net/MalformedURLException;

    if-eqz v0, :cond_e

    .line 427
    const/4 v0, -0x3

    return v0

    .line 428
    :cond_e
    instance-of v0, p0, Lorg/apache/http/NoHttpResponseException;

    if-eqz v0, :cond_f

    .line 429
    const/16 v0, -0x20

    return v0

    .line 430
    :cond_f
    instance-of v0, p0, Ljava/io/InvalidClassException;

    if-eqz v0, :cond_10

    .line 431
    const/16 v0, -0x21

    return v0

    .line 432
    :cond_10
    instance-of v0, p0, Ljava/io/InvalidObjectException;

    if-eqz v0, :cond_11

    .line 433
    const/16 v0, -0x22

    return v0

    .line 434
    :cond_11
    instance-of v0, p0, Ljava/io/NotActiveException;

    if-eqz v0, :cond_12

    .line 435
    const/16 v0, -0x23

    return v0

    .line 436
    :cond_12
    instance-of v0, p0, Ljava/io/NotSerializableException;

    if-eqz v0, :cond_13

    .line 437
    const/16 v0, -0x24

    return v0

    .line 438
    :cond_13
    instance-of v0, p0, Ljava/io/OptionalDataException;

    if-eqz v0, :cond_14

    .line 439
    const/16 v0, -0x25

    return v0

    .line 440
    :cond_14
    instance-of v0, p0, Ljava/io/StreamCorruptedException;

    if-eqz v0, :cond_15

    .line 441
    const/16 v0, -0x26

    return v0

    .line 442
    :cond_15
    instance-of v0, p0, Ljava/io/WriteAbortedException;

    if-eqz v0, :cond_16

    .line 443
    const/16 v0, -0x27

    return v0

    .line 444
    :cond_16
    instance-of v0, p0, Ljava/net/ProtocolException;

    if-eqz v0, :cond_17

    .line 445
    const/16 v0, -0x28

    return v0

    .line 446
    :cond_17
    instance-of v0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_18

    .line 447
    const/16 v0, -0x29

    return v0

    .line 448
    :cond_18
    instance-of v0, p0, Ljavax/net/ssl/SSLKeyException;

    if-eqz v0, :cond_19

    .line 449
    const/16 v0, -0x2a

    return v0

    .line 450
    :cond_19
    instance-of v0, p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_1a

    .line 451
    const/16 v0, -0x2b

    return v0

    .line 452
    :cond_1a
    instance-of v0, p0, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v0, :cond_1b

    .line 453
    const/16 v0, -0x2c

    return v0

    .line 454
    :cond_1b
    instance-of v0, p0, Ljava/net/BindException;

    if-eqz v0, :cond_1c

    .line 455
    const/16 v0, -0x2d

    return v0

    .line 456
    :cond_1c
    instance-of v0, p0, Ljava/net/ConnectException;

    if-eqz v0, :cond_1d

    .line 457
    const/16 v0, -0x2e

    return v0

    .line 458
    :cond_1d
    instance-of v0, p0, Ljava/net/NoRouteToHostException;

    if-eqz v0, :cond_1e

    .line 459
    const/16 v0, -0x2f

    return v0

    .line 460
    :cond_1e
    instance-of v0, p0, Ljava/net/PortUnreachableException;

    if-eqz v0, :cond_1f

    .line 461
    const/16 v0, -0x30

    return v0

    .line 462
    :cond_1f
    instance-of v0, p0, Ljava/io/SyncFailedException;

    if-eqz v0, :cond_20

    .line 463
    const/16 v0, -0x31

    return v0

    .line 464
    :cond_20
    instance-of v0, p0, Ljava/io/UTFDataFormatException;

    if-eqz v0, :cond_21

    .line 465
    const/16 v0, -0x32

    return v0

    .line 466
    :cond_21
    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_22

    .line 467
    const/16 v0, -0x33

    return v0

    .line 468
    :cond_22
    instance-of v0, p0, Ljava/net/UnknownServiceException;

    if-eqz v0, :cond_23

    .line 469
    const/16 v0, -0x34

    return v0

    .line 470
    :cond_23
    instance-of v0, p0, Ljava/io/UnsupportedEncodingException;

    if-eqz v0, :cond_24

    .line 471
    const/16 v0, -0x35

    return v0

    .line 472
    :cond_24
    instance-of v0, p0, Ljava/util/zip/ZipException;

    if-eqz v0, :cond_25

    .line 473
    const/16 v0, -0x36

    return v0

    .line 475
    :cond_25
    const/4 v0, -0x2

    return v0
.end method

.method public static getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
    .locals 14

    .line 625
    new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 626
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v2

    const/16 v3, 0x50

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 635
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 638
    :try_start_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v5

    .line 639
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 640
    new-instance v6, Lcom/tencent/open/utils/HttpUtils$CustomSSLSocketFactory;

    invoke-direct {v6, v5}, Lcom/tencent/open/utils/HttpUtils$CustomSSLSocketFactory;-><init>(Ljava/security/KeyStore;)V

    .line 641
    sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v6, v0}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 643
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "https"

    const/16 v2, 0x1bb

    invoke-direct {v0, v1, v6, v2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 647
    goto :goto_0

    .line 644
    :catch_0
    move-exception v6

    .line 645
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "https"

    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v2

    const/16 v3, 0x1bb

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 648
    :goto_0
    goto :goto_1

    .line 649
    :cond_0
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "https"

    invoke-static {}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;

    move-result-object v2

    const/16 v3, 0x1bb

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 653
    :goto_1
    new-instance v5, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v5}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 655
    const/4 v6, 0x0

    .line 656
    if-eqz p0, :cond_1

    .line 657
    invoke-static {p0, p1}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v6

    .line 659
    :cond_1
    const/4 v7, 0x0

    .line 660
    const/4 v8, 0x0

    .line 661
    if-eqz v6, :cond_2

    .line 662
    const-string v0, "Common_HttpConnectionTimeout"

    invoke-virtual {v6, v0}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 663
    const-string v0, "Common_SocketConnectionTimeout"

    invoke-virtual {v6, v0}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 666
    :cond_2
    if-nez v7, :cond_3

    const/16 v0, 0x3a98

    goto :goto_2

    :cond_3
    move v0, v7

    :goto_2
    move v7, v0

    .line 667
    if-nez v8, :cond_4

    const/16 v0, 0x7530

    goto :goto_3

    :cond_4
    move v0, v8

    :goto_3
    move v8, v0

    .line 669
    invoke-static {v5, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 670
    invoke-static {v5, v8}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 673
    sget-object v0, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 674
    const-string v0, "UTF-8"

    invoke-static {v5, v0}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 676
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AndroidSDK_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 679
    invoke-static {v5, v9}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 681
    new-instance v10, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v10, v5, v4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 683
    new-instance v11, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v11, v10, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    .line 686
    invoke-static {p0}, Lcom/tencent/open/utils/HttpUtils;->getProxy(Landroid/content/Context;)Lcom/tencent/open/utils/HttpUtils$NetworkProxy;

    move-result-object v12

    .line 687
    if-eqz v12, :cond_5

    .line 688
    new-instance v13, Lorg/apache/http/HttpHost;

    iget-object v0, v12, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;->host:Ljava/lang/String;

    iget v1, v12, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;->port:I

    invoke-direct {v13, v0, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    .line 689
    invoke-interface {v11}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.route.default-proxy"

    invoke-interface {v0, v1, v13}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 692
    :cond_5
    return-object v11
.end method

.method public static getProxy(Landroid/content/Context;)Lcom/tencent/open/utils/HttpUtils$NetworkProxy;
    .locals 7

    .line 773
    if-nez p0, :cond_0

    .line 774
    const/4 v0, 0x0

    return-object v0

    .line 776
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 778
    if-nez v2, :cond_1

    .line 779
    const/4 v0, 0x0

    return-object v0

    .line 781
    :cond_1
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 782
    if-nez v3, :cond_2

    .line 783
    const/4 v0, 0x0

    return-object v0

    .line 786
    :cond_2
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    .line 787
    if-nez v4, :cond_3

    .line 788
    invoke-static {p0}, Lcom/tencent/open/utils/HttpUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 789
    invoke-static {p0}, Lcom/tencent/open/utils/HttpUtils;->a(Landroid/content/Context;)I

    move-result v6

    .line 790
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-ltz v6, :cond_3

    .line 791
    new-instance v0, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v6, v1}, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;-><init>(Ljava/lang/String;ILcom/tencent/open/utils/HttpUtils$1;)V

    return-object v0

    .line 794
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public static openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/open/utils/Util$Statistic;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;,
            Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;,
            Lcom/tencent/open/utils/HttpUtils$HttpStatusException;
        }
    .end annotation

    .line 486
    if-eqz p0, :cond_1

    .line 487
    const-string v0, "connectivity"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 489
    if-eqz v3, :cond_1

    .line 490
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    .line 491
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 493
    :cond_0
    new-instance v0, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;

    const-string v1, "network unavailable"

    invoke-direct {v0, v1}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 497
    :cond_1
    const/4 v3, 0x0

    .line 498
    if-eqz p3, :cond_2

    .line 499
    new-instance v3, Landroid/os/Bundle;

    move-object/from16 v0, p3

    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    .line 501
    :cond_2
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 503
    :goto_0
    const-string v4, ""

    .line 504
    const-string v0, "appid_for_getting_config"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 505
    const-string v0, "appid_for_getting_config"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 506
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v5, v1}, Lcom/tencent/open/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;

    move-result-object v6

    .line 507
    const/4 v7, 0x0

    .line 508
    const/4 v8, 0x0

    .line 509
    const-string v0, "GET"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 510
    invoke-static {v3}, Lcom/tencent/open/utils/HttpUtils;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v9

    .line 511
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v8, v0, 0x0

    .line 512
    sget-object v0, Lcom/tencent/open/utils/HttpUtils;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->openUrl2 before url ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    const-string v0, "?"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 514
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 516
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 518
    :goto_1
    sget-object v0, Lcom/tencent/open/utils/HttpUtils;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->openUrl2 encodedParam ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -- url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 520
    new-instance v7, Lorg/apache/http/client/methods/HttpGet;

    move-object/from16 v0, p1

    invoke-direct {v7, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 521
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-interface {v7, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    goto/16 :goto_4

    :cond_4
    const-string v0, "POST"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 523
    new-instance v9, Lorg/apache/http/client/methods/HttpPost;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 524
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 526
    invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 527
    invoke-virtual {v3, v12}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    .line 528
    instance-of v0, v13, [B

    if-eqz v0, :cond_5

    .line 529
    move-object v0, v13

    check-cast v0, [B

    check-cast v0, [B

    invoke-virtual {v10, v12, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 531
    :cond_5
    goto :goto_2

    .line 533
    :cond_6
    const-string v0, "method"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 534
    const-string v0, "method"

    move-object/from16 v1, p2

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    :cond_7
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 541
    const-string v0, "--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 542
    const-string v0, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    invoke-static {v3, v0}, Lcom/tencent/open/utils/HttpUtils;->encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 547
    invoke-virtual {v10}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 548
    invoke-virtual {v10}, Landroid/os/Bundle;->size()I

    move-result v12

    .line 549
    const/4 v13, -0x1

    .line 550
    const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 551
    invoke-virtual {v10}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 552
    add-int/lit8 v13, v13, 0x1

    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Disposition: form-data; name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"; filename=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 557
    const-string v0, "Content-Type: content/unknown\r\n\r\n"

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 558
    invoke-virtual {v10, v15}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v16

    .line 559
    if-eqz v16, :cond_8

    .line 560
    move-object/from16 v0, v16

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 562
    :cond_8
    add-int/lit8 v0, v12, -0x1

    if-ge v13, v0, :cond_9

    .line 563
    const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 566
    :cond_9
    goto :goto_3

    .line 569
    :cond_a
    const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 571
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    .line 572
    array-length v0, v12

    add-int/lit8 v8, v0, 0x0

    .line 573
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 574
    new-instance v13, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v13, v12}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 575
    invoke-virtual {v9, v13}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 576
    move-object v7, v9

    .line 579
    :cond_b
    :goto_4
    invoke-interface {v6, v7}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v9

    .line 580
    invoke-interface {v9}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v10

    .line 581
    invoke-interface {v10}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v11

    .line 583
    const/16 v0, 0xc8

    if-ne v11, v0, :cond_c

    .line 584
    invoke-static {v9}, Lcom/tencent/open/utils/HttpUtils;->a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    .line 587
    :cond_c
    new-instance v0, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http status code error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 590
    :goto_5
    new-instance v0, Lcom/tencent/open/utils/Util$Statistic;

    invoke-direct {v0, v4, v8}, Lcom/tencent/open/utils/Util$Statistic;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/json/JSONException;,
            Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;,
            Lcom/tencent/open/utils/HttpUtils$HttpStatusException;
        }
    .end annotation

    .line 194
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenApi request"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    move-object/from16 v9, p2

    .line 198
    move-object/from16 v10, p2

    .line 199
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v1

    const-string v2, "https://openmobile.qq.com/"

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v1

    const-string v2, "https://openmobile.qq.com/"

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 209
    :cond_0
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2}, Lcom/tencent/open/utils/HttpUtils;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V

    .line 210
    const/4 v11, 0x0

    .line 211
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 212
    const/4 v14, 0x0

    .line 213
    const-wide/16 v15, 0x0

    .line 214
    const-wide/16 v17, 0x0

    .line 216
    const/16 v19, 0x0

    .line 217
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Common_HttpRetryCount"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 219
    const-string v0, "OpenConfig_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "config 1:Common_HttpRetryCount            config_value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   appid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    if-nez v20, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    move/from16 v0, v20

    :goto_0
    move/from16 v20, v0

    .line 223
    const-string v0, "OpenConfig_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "config 1:Common_HttpRetryCount            result_value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   appid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    :cond_2
    add-int/lit8 v19, v19, 0x1

    .line 231
    move-object/from16 v0, p1

    move-object/from16 v1, p4

    move-object/from16 v2, p3

    :try_start_0
    invoke-static {v0, v9, v1, v2}, Lcom/tencent/open/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/open/utils/Util$Statistic;

    move-result-object v21

    .line 233
    move-object/from16 v0, v21

    iget-object v0, v0, Lcom/tencent/open/utils/Util$Statistic;->response:Ljava/lang/String;

    move-object/from16 v22, v0

    .line 234
    invoke-static/range {v22 .. v22}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_8

    move-result-object v0

    move-object v11, v0

    .line 236
    const-string v0, "ret"

    :try_start_1
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7

    move-result v14

    .line 240
    goto :goto_1

    .line 237
    :catch_0
    move-exception v23

    .line 239
    const/4 v14, -0x4

    .line 241
    :goto_1
    move-object/from16 v0, v21

    :try_start_2
    iget-wide v15, v0, Lcom/tencent/open/utils/Util$Statistic;->reqSize:J

    .line 242
    move-object/from16 v0, v21

    iget-wide v0, v0, Lcom/tencent/open/utils/Util$Statistic;->rspSize:J
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8

    move-wide/from16 v17, v0

    .line 243
    goto/16 :goto_4

    .line 245
    :catch_1
    move-exception v21

    .line 246
    invoke-virtual/range {v21 .. v21}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V

    .line 247
    const/4 v14, -0x7

    .line 248
    const-wide/16 v15, 0x0

    .line 249
    const-wide/16 v17, 0x0

    .line 250
    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_3

    .line 251
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 252
    goto/16 :goto_3

    .line 254
    :cond_3
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x7

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 255
    throw v21

    .line 257
    :catch_2
    move-exception v21

    .line 258
    invoke-virtual/range {v21 .. v21}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    .line 259
    const/4 v14, -0x8

    .line 260
    const-wide/16 v15, 0x0

    .line 261
    const-wide/16 v17, 0x0

    .line 263
    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_4

    .line 264
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 265
    goto/16 :goto_3

    .line 267
    :cond_4
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x8

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 268
    throw v21

    .line 272
    :catch_3
    move-exception v21

    .line 273
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->printStackTrace()V

    .line 274
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v22

    .line 277
    const-string v0, "http status code error:"

    const-string v1, ""

    move-object/from16 v2, v22

    :try_start_3
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v22

    .line 279
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    move-result v14

    .line 284
    goto :goto_2

    .line 280
    :catch_4
    move-exception v23

    .line 281
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Exception;->printStackTrace()V

    .line 283
    const/16 v14, -0x9

    .line 285
    :goto_2
    const-wide/16 v15, 0x0

    .line 286
    const-wide/16 v17, 0x0

    .line 287
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 288
    throw v21

    .line 289
    :catch_5
    move-exception v21

    .line 290
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;->printStackTrace()V

    .line 291
    throw v21

    .line 292
    :catch_6
    move-exception v21

    .line 293
    invoke-virtual/range {v21 .. v21}, Ljava/net/MalformedURLException;->printStackTrace()V

    .line 294
    const/4 v14, -0x3

    .line 295
    const-wide/16 v15, 0x0

    .line 296
    const-wide/16 v17, 0x0

    .line 297
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x3

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 298
    throw v21

    .line 299
    :catch_7
    move-exception v21

    .line 300
    invoke-virtual/range {v21 .. v21}, Ljava/io/IOException;->printStackTrace()V

    .line 302
    invoke-static/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils;->getErrorCodeFromException(Ljava/io/IOException;)I

    move-result v14

    .line 303
    const-wide/16 v15, 0x0

    .line 304
    const-wide/16 v17, 0x0

    .line 305
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 306
    throw v21

    .line 307
    :catch_8
    move-exception v21

    .line 308
    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONException;->printStackTrace()V

    .line 309
    const/4 v14, -0x4

    .line 310
    const-wide/16 v15, 0x0

    .line 311
    const-wide/16 v17, 0x0

    .line 312
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x4

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 313
    throw v21

    .line 315
    :goto_3
    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_2

    .line 316
    :goto_4
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 317
    return-object v11
.end method

.method public static requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V
    .locals 7

    .line 323
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenApi requestAsync"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    new-instance v0, Lcom/tencent/open/utils/HttpUtils$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/tencent/open/utils/HttpUtils$1;-><init>(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    invoke-virtual {v0}, Lcom/tencent/open/utils/HttpUtils$1;->start()V

    .line 377
    return-void
.end method

.method public static upload(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/json/JSONException;,
            Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;,
            Lcom/tencent/open/utils/HttpUtils$HttpStatusException;
        }
    .end annotation

    .line 868
    move-object/from16 v9, p2

    .line 869
    move-object/from16 v10, p2

    .line 870
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 874
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v1

    const-string v2, "https://openmobile.qq.com/"

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 876
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v1

    const-string v2, "https://openmobile.qq.com/"

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 880
    :cond_0
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2}, Lcom/tencent/open/utils/HttpUtils;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;)V

    .line 881
    const/4 v11, 0x0

    .line 882
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 883
    const/4 v14, 0x0

    .line 884
    const-wide/16 v15, 0x0

    .line 885
    const-wide/16 v17, 0x0

    .line 887
    const/16 v19, 0x0

    .line 888
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Common_HttpRetryCount"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 890
    const-string v0, "OpenConfig_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "config 1:Common_HttpRetryCount            config_value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   appid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 893
    if-nez v20, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    move/from16 v0, v20

    :goto_0
    move/from16 v20, v0

    .line 894
    const-string v0, "OpenConfig_test"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "config 1:Common_HttpRetryCount            result_value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, v20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   appid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "     url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    :cond_2
    add-int/lit8 v19, v19, 0x1

    .line 902
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    :try_start_0
    invoke-static {v0, v9, v1}, Lcom/tencent/open/utils/Util;->upload(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/open/utils/Util$Statistic;

    move-result-object v21

    .line 904
    move-object/from16 v0, v21

    iget-object v0, v0, Lcom/tencent/open/utils/Util$Statistic;->response:Ljava/lang/String;

    move-object/from16 v22, v0

    .line 905
    invoke-static/range {v22 .. v22}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_8

    move-result-object v0

    move-object v11, v0

    .line 907
    const-string v0, "ret"

    :try_start_1
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7

    move-result v14

    .line 911
    goto :goto_1

    .line 908
    :catch_0
    move-exception v23

    .line 910
    const/4 v14, -0x4

    .line 912
    :goto_1
    move-object/from16 v0, v21

    :try_start_2
    iget-wide v15, v0, Lcom/tencent/open/utils/Util$Statistic;->reqSize:J

    .line 913
    move-object/from16 v0, v21

    iget-wide v0, v0, Lcom/tencent/open/utils/Util$Statistic;->rspSize:J
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_8

    move-wide/from16 v17, v0

    .line 914
    goto/16 :goto_4

    .line 916
    :catch_1
    move-exception v21

    .line 917
    invoke-virtual/range {v21 .. v21}, Lorg/apache/http/conn/ConnectTimeoutException;->printStackTrace()V

    .line 918
    const/4 v14, -0x7

    .line 919
    const-wide/16 v15, 0x0

    .line 920
    const-wide/16 v17, 0x0

    .line 921
    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_3

    .line 922
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 923
    goto/16 :goto_3

    .line 925
    :cond_3
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x7

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 926
    throw v21

    .line 928
    :catch_2
    move-exception v21

    .line 929
    invoke-virtual/range {v21 .. v21}, Ljava/net/SocketTimeoutException;->printStackTrace()V

    .line 930
    const/4 v14, -0x8

    .line 931
    const-wide/16 v15, 0x0

    .line 932
    const-wide/16 v17, 0x0

    .line 934
    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_4

    .line 935
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    .line 936
    goto/16 :goto_3

    .line 938
    :cond_4
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x8

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 939
    throw v21

    .line 943
    :catch_3
    move-exception v21

    .line 944
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->printStackTrace()V

    .line 945
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v22

    .line 948
    const-string v0, "http status code error:"

    const-string v1, ""

    move-object/from16 v2, v22

    :try_start_3
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v22

    .line 950
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    move-result v14

    .line 955
    goto :goto_2

    .line 951
    :catch_4
    move-exception v23

    .line 952
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Exception;->printStackTrace()V

    .line 954
    const/16 v14, -0x9

    .line 956
    :goto_2
    const-wide/16 v15, 0x0

    .line 957
    const-wide/16 v17, 0x0

    .line 958
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 959
    throw v21

    .line 960
    :catch_5
    move-exception v21

    .line 961
    invoke-virtual/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;->printStackTrace()V

    .line 962
    throw v21

    .line 963
    :catch_6
    move-exception v21

    .line 964
    invoke-virtual/range {v21 .. v21}, Ljava/net/MalformedURLException;->printStackTrace()V

    .line 965
    const/4 v14, -0x3

    .line 966
    const-wide/16 v15, 0x0

    .line 967
    const-wide/16 v17, 0x0

    .line 968
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x3

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 969
    throw v21

    .line 970
    :catch_7
    move-exception v21

    .line 971
    invoke-virtual/range {v21 .. v21}, Ljava/io/IOException;->printStackTrace()V

    .line 973
    invoke-static/range {v21 .. v21}, Lcom/tencent/open/utils/HttpUtils;->getErrorCodeFromException(Ljava/io/IOException;)I

    move-result v14

    .line 974
    const-wide/16 v15, 0x0

    .line 975
    const-wide/16 v17, 0x0

    .line 976
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 977
    throw v21

    .line 978
    :catch_8
    move-exception v21

    .line 979
    invoke-virtual/range {v21 .. v21}, Lorg/json/JSONException;->printStackTrace()V

    .line 980
    const/4 v14, -0x4

    .line 981
    const-wide/16 v15, 0x0

    .line 982
    const-wide/16 v17, 0x0

    .line 983
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, -0x4

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 984
    throw v21

    .line 986
    :goto_3
    move/from16 v0, v19

    move/from16 v1, v20

    if-lt v0, v1, :cond_2

    .line 987
    :goto_4
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    move-object v1, v10

    move-wide v2, v12

    move-wide v4, v15

    move-wide/from16 v6, v17

    move v8, v14

    invoke-virtual/range {v0 .. v8}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJI)V

    .line 988
    return-object v11
.end method
