.class public Lo/diy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public c:Lorg/apache/http/client/HttpClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    .line 37
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    iput-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    .line 38
    return-void
.end method

.method public constructor <init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    .line 43
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0, p1, p2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    iput-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    .line 44
    return-void
.end method

.method private c(Lorg/apache/http/HttpRequest;)J
    .locals 17

    .line 52
    const-wide/16 v4, 0x0

    .line 55
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpRequest;->getRequestLine()Lorg/apache/http/RequestLine;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 56
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v7, v0

    .line 57
    add-long/2addr v4, v7

    .line 64
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpRequest;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v9

    .line 65
    move-object v10, v9

    array-length v11, v10

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v11, :cond_0

    aget-object v13, v10, v12

    .line 67
    invoke-interface {v13}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v4, v0

    .line 68
    invoke-interface {v13}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v4, v0

    .line 69
    const-wide/16 v0, 0x1

    add-long/2addr v4, v0

    .line 65
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 74
    :cond_0
    invoke-interface/range {p1 .. p1}, Lorg/apache/http/HttpRequest;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v10

    .line 80
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    .line 82
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12

    .line 84
    const/4 v13, 0x0

    :goto_1
    array-length v0, v12

    if-ge v13, v0, :cond_2

    .line 86
    aget-object v0, v12, v13

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 90
    :try_start_0
    aget-object v0, v12, v13

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 91
    aget-object v0, v12, v13

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    move-object v14, v0

    check-cast v14, Ljava/util/HashMap;

    .line 92
    invoke-virtual {v14}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 93
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/Map$Entry;

    .line 95
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v4

    move-wide v4, v0

    .line 96
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v4

    move-wide v4, v0

    .line 97
    const-wide/16 v0, 0x1

    add-long/2addr v0, v4

    move-wide v4, v0

    .line 99
    goto :goto_2

    .line 103
    :cond_1
    goto :goto_3

    .line 101
    :catch_0
    move-exception v14

    .line 102
    const-string v0, "LimitedHttpClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v14}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_3
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 106
    :cond_2
    move-object/from16 v0, p1

    instance-of v0, v0, Lorg/apache/http/client/methods/HttpPost;

    if-eqz v0, :cond_3

    .line 108
    move-object/from16 v13, p1

    check-cast v13, Lorg/apache/http/client/methods/HttpPost;

    .line 109
    invoke-virtual {v13}, Lorg/apache/http/client/methods/HttpPost;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v14

    .line 111
    add-long/2addr v4, v14

    .line 115
    :cond_3
    return-wide v4
.end method

.method private d(Lorg/apache/http/HttpResponse;)J
    .locals 11

    .line 119
    const/4 v2, 0x0

    .line 121
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 122
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v4, v0

    .line 123
    const-wide/16 v0, 0x0

    add-long/2addr v0, v4

    long-to-int v2, v0

    .line 126
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v6

    .line 129
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_0

    aget-object v10, v7, v9

    .line 131
    invoke-interface {v10}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 132
    invoke-interface {v10}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 129
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 145
    :cond_0
    int-to-long v0, v2

    return-wide v0
.end method


# virtual methods
.method public a()Lorg/apache/http/conn/ClientConnectionManager;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    return-object v0
.end method

.method public b(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 173
    invoke-direct {p0, p2}, Lo/diy;->c(Lorg/apache/http/HttpRequest;)J

    move-result-wide v2

    .line 175
    invoke-static {v2, v3}, Lo/djf;->d(J)V

    .line 177
    invoke-static {}, Lo/djf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Moblie Over flow!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_0
    iget-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/HttpHost;Lorg/apache/http/HttpRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v4

    .line 188
    invoke-direct {p0, v4}, Lo/diy;->d(Lorg/apache/http/HttpResponse;)J

    move-result-wide v5

    .line 189
    invoke-static {v5, v6}, Lo/djf;->e(J)V

    .line 191
    new-instance v7, Lo/djb;

    invoke-direct {v7, v4}, Lo/djb;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 192
    return-object v7
.end method

.method public d()Lorg/apache/http/params/HttpParams;
    .locals 1

    .line 200
    iget-object v0, p0, Lo/diy;->c:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    return-object v0
.end method
