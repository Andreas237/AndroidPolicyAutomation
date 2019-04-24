.class public Lretrofit/client/ApacheClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/client/Client;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/client/ApacheClient$TypedOutputEntity;,
        Lretrofit/client/ApacheClient$GenericEntityHttpRequest;,
        Lretrofit/client/ApacheClient$GenericHttpRequest;
    }
.end annotation


# instance fields
.field private final client:Lorg/apache/http/client/HttpClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-static {}, Lretrofit/client/ApacheClient;->createDefaultClient()Lorg/apache/http/client/HttpClient;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/client/ApacheClient;-><init>(Lorg/apache/http/client/HttpClient;)V

    .line 57
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/client/HttpClient;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lretrofit/client/ApacheClient;->client:Lorg/apache/http/client/HttpClient;

    .line 61
    return-void
.end method

.method private static createDefaultClient()Lorg/apache/http/client/HttpClient;
    .locals 2

    .line 46
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 47
    const/16 v0, 0x3a98

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 48
    const/16 v0, 0x4e20

    invoke-static {v1, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 49
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    return-object v0
.end method

.method static createRequest(Lretrofit/client/Request;)Lorg/apache/http/client/methods/HttpUriRequest;
    .locals 1

    .line 75
    invoke-virtual {p0}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    new-instance v0, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;

    invoke-direct {v0, p0}, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;-><init>(Lretrofit/client/Request;)V

    return-object v0

    .line 78
    :cond_0
    new-instance v0, Lretrofit/client/ApacheClient$GenericHttpRequest;

    invoke-direct {v0, p0}, Lretrofit/client/ApacheClient$GenericHttpRequest;-><init>(Lretrofit/client/Request;)V

    return-object v0
.end method

.method static parseResponse(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Lretrofit/client/Response;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v6

    .line 83
    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v7

    .line 84
    invoke-interface {v6}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;

    move-result-object v8

    .line 86
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 87
    const-string v10, "application/octet-stream"

    .line 88
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_1

    aget-object v14, v11, v13

    .line 89
    invoke-interface {v14}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v15

    .line 90
    invoke-interface {v14}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v16

    .line 91
    const-string v0, "Content-Type"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    move-object/from16 v10, v16

    .line 94
    :cond_0
    new-instance v0, Lretrofit/client/Header;

    move-object/from16 v1, v16

    invoke-direct {v0, v15, v1}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 97
    :cond_1
    const/4 v11, 0x0

    .line 98
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v12

    .line 99
    if-eqz v12, :cond_2

    .line 100
    invoke-static {v12}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B

    move-result-object v13

    .line 101
    new-instance v11, Lretrofit/mime/TypedByteArray;

    invoke-direct {v11, v10, v13}, Lretrofit/mime/TypedByteArray;-><init>(Ljava/lang/String;[B)V

    .line 104
    :cond_2
    new-instance v0, Lretrofit/client/Response;

    move-object/from16 v1, p0

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V

    return-object v0
.end method


# virtual methods
.method protected execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 71
    invoke-interface {p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    invoke-static {p1}, Lretrofit/client/ApacheClient;->createRequest(Lretrofit/client/Request;)Lorg/apache/http/client/methods/HttpUriRequest;

    move-result-object v1

    .line 65
    iget-object v0, p0, Lretrofit/client/ApacheClient;->client:Lorg/apache/http/client/HttpClient;

    invoke-virtual {p0, v0, v1}, Lretrofit/client/ApacheClient;->execute(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v2

    .line 66
    invoke-virtual {p1}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lretrofit/client/ApacheClient;->parseResponse(Ljava/lang/String;Lorg/apache/http/HttpResponse;)Lretrofit/client/Response;

    move-result-object v0

    return-object v0
.end method
