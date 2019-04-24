.class abstract Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "DelegatingHttpsURLConnection.java"


# instance fields
.field private final delegate:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 44
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    .line 45
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    return-void
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public connect()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->connected:Z

    .line 89
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    return-void
.end method

.method public disconnect()V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 1

    .line 59
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {v0}, Lcom/squareup/okhttp/Handshake;->cipherSuite()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDate()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getExpiration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/HttpURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
.end method

.method public getIfModifiedSince()J
    .locals 2

    .line 206
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getIfModifiedSince()J

    move-result-wide v0

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 210
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getLastModified()J

    move-result-wide v0

    return-wide v0
.end method

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 3

    .line 64
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 66
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/Handshake;->localCertificates()Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/security/cert/Certificate;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [Ljava/security/cert/Certificate;

    :cond_1
    return-object v1
.end method

.method public getLocalPrincipal()Ljava/security/Principal;
    .locals 1

    .line 83
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0}, Lcom/squareup/okhttp/Handshake;->localPrincipal()Ljava/security/Principal;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method public getPeerPrincipal()Ljava/security/Principal;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 78
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/squareup/okhttp/Handshake;->peerPrincipal()Ljava/security/Principal;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 278
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    return v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 71
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 73
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/Handshake;->peerCertificates()Ljava/util/List;

    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/security/cert/Certificate;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [Ljava/security/cert/Certificate;

    :cond_1
    return-object v1
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method protected abstract handshake()Lcom/squareup/okhttp/Handshake;
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setAllowUserInteraction(Z)V

    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDefaultUseCaches(Z)V

    return-void
.end method

.method public setDoInput(Z)V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1

    .line 286
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    return-void
.end method

.method public abstract setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
.end method

.method public setIfModifiedSince(J)V
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setIfModifiedSince(J)V

    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    return-void
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
.end method

.method public setUseCaches(Z)V
    .locals 1

    .line 262
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;->delegate:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    move-result v0

    return v0
.end method
