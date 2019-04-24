.class Lretrofit/client/ApacheClient$GenericEntityHttpRequest;
.super Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
.source "ApacheClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/client/ApacheClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GenericEntityHttpRequest"
.end annotation


# instance fields
.field private final method:Ljava/lang/String;


# direct methods
.method constructor <init>(Lretrofit/client/Request;)V
    .locals 4

    .line 129
    invoke-direct {p0}, Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;-><init>()V

    .line 130
    invoke-virtual {p1}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;->method:Ljava/lang/String;

    .line 131
    invoke-virtual {p1}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p0, v0}, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;->setURI(Ljava/net/URI;)V

    .line 134
    invoke-virtual {p1}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/client/Header;

    .line 135
    new-instance v2, Lorg/apache/http/message/BasicHeader;

    invoke-virtual {v1}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;->addHeader(Lorg/apache/http/Header;)V

    goto :goto_0

    .line 139
    :cond_0
    new-instance v0, Lretrofit/client/ApacheClient$TypedOutputEntity;

    invoke-virtual {p1}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object p1

    invoke-direct {v0, p1}, Lretrofit/client/ApacheClient$TypedOutputEntity;-><init>(Lretrofit/mime/TypedOutput;)V

    invoke-virtual {p0, v0}, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;->setEntity(Lorg/apache/http/HttpEntity;)V

    return-void
.end method


# virtual methods
.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lretrofit/client/ApacheClient$GenericEntityHttpRequest;->method:Ljava/lang/String;

    return-object v0
.end method
