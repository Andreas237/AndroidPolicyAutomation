.class public Lo/djb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/HttpResponse;


# instance fields
.field private b:Lo/dje;

.field private d:Lorg/apache/http/HttpResponse;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djb;->b:Lo/dje;

    .line 29
    iput-object p1, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    .line 30
    new-instance v0, Lo/dje;

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dje;-><init>(Lorg/apache/http/HttpEntity;)V

    iput-object v0, p0, Lo/djb;->b:Lo/dje;

    .line 31
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/HttpResponse;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    return-void
.end method

.method public addHeader(Lorg/apache/http/Header;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->addHeader(Lorg/apache/http/Header;)V

    .line 98
    return-void
.end method

.method public containsHeader(Ljava/lang/String;)Z
    .locals 1

    .line 112
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->containsHeader(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public getAllHeaders()[Lorg/apache/http/Header;
    .locals 1

    .line 132
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getAllHeaders()[Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getEntity()Lorg/apache/http/HttpEntity;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/djb;->b:Lo/dje;

    return-object v0
.end method

.method public getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    .locals 1

    .line 122
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;
    .locals 1

    .line 117
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getLastHeader(Ljava/lang/String;)Lorg/apache/http/Header;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->getLastHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getLocale()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public getParams()Lorg/apache/http/params/HttpParams;
    .locals 1

    .line 157
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    return-object v0
.end method

.method public getProtocolVersion()Lorg/apache/http/ProtocolVersion;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getProtocolVersion()Lorg/apache/http/ProtocolVersion;

    move-result-object v0

    return-object v0
.end method

.method public getStatusLine()Lorg/apache/http/StatusLine;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    return-object v0
.end method

.method public headerIterator()Lorg/apache/http/HeaderIterator;
    .locals 1

    .line 152
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->headerIterator()Lorg/apache/http/HeaderIterator;

    move-result-object v0

    return-object v0
.end method

.method public headerIterator(Ljava/lang/String;)Lorg/apache/http/HeaderIterator;
    .locals 1

    .line 167
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->headerIterator(Ljava/lang/String;)Lorg/apache/http/HeaderIterator;

    move-result-object v0

    return-object v0
.end method

.method public removeHeader(Lorg/apache/http/Header;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->removeHeader(Lorg/apache/http/Header;)V

    .line 138
    return-void
.end method

.method public removeHeaders(Ljava/lang/String;)V
    .locals 1

    .line 142
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->removeHeaders(Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method public setEntity(Lorg/apache/http/HttpEntity;)V
    .locals 4

    .line 71
    const-string v0, "WrappedHttpResponse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter setEntity, new a WrappedHttpEntity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    new-instance v0, Lo/dje;

    invoke-direct {v0, p1}, Lo/dje;-><init>(Lorg/apache/http/HttpEntity;)V

    iput-object v0, p0, Lo/djb;->b:Lo/dje;

    .line 73
    return-void
.end method

.method public setHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 102
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/HttpResponse;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method public setHeader(Lorg/apache/http/Header;)V
    .locals 1

    .line 92
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setHeader(Lorg/apache/http/Header;)V

    .line 93
    return-void
.end method

.method public setHeaders([Lorg/apache/http/Header;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setHeaders([Lorg/apache/http/Header;)V

    .line 148
    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 1

    .line 82
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setLocale(Ljava/util/Locale;)V

    .line 83
    return-void
.end method

.method public setParams(Lorg/apache/http/params/HttpParams;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 163
    return-void
.end method

.method public setReasonPhrase(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setReasonPhrase(Ljava/lang/String;)V

    .line 61
    return-void
.end method

.method public setStatusCode(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setStatusCode(I)V

    .line 56
    return-void
.end method

.method public setStatusLine(Lorg/apache/http/ProtocolVersion;I)V
    .locals 1

    .line 40
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1, p2}, Lorg/apache/http/HttpResponse;->setStatusLine(Lorg/apache/http/ProtocolVersion;I)V

    .line 41
    return-void
.end method

.method public setStatusLine(Lorg/apache/http/ProtocolVersion;ILjava/lang/String;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1, p2, p3}, Lorg/apache/http/HttpResponse;->setStatusLine(Lorg/apache/http/ProtocolVersion;ILjava/lang/String;)V

    .line 51
    return-void
.end method

.method public setStatusLine(Lorg/apache/http/StatusLine;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lo/djb;->d:Lorg/apache/http/HttpResponse;

    invoke-interface {v0, p1}, Lorg/apache/http/HttpResponse;->setStatusLine(Lorg/apache/http/StatusLine;)V

    .line 36
    return-void
.end method
