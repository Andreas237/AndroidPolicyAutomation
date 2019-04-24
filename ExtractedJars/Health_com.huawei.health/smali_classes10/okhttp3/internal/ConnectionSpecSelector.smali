.class public final Lokhttp3/internal/ConnectionSpecSelector;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final connectionSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokhttp3/ConnectionSpec;>;"
        }
    .end annotation
.end field

.field private isFallback:Z

.field private isFallbackPossible:Z

.field private nextModeIndex:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/ConnectionSpec;>;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->nextModeIndex:I

    .line 45
    iput-object p1, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    .line 46
    return-void
.end method

.method private isFallbackPossible(Ljavax/net/ssl/SSLSocket;)Z
    .locals 2

    .line 134
    iget v1, p0, Lokhttp3/internal/ConnectionSpecSelector;->nextModeIndex:I

    :goto_0
    iget-object v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 135
    iget-object v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/ConnectionSpec;

    invoke-virtual {v0, p1}, Lokhttp3/ConnectionSpec;->isCompatible(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const/4 v0, 0x1

    return v0

    .line 134
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 139
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public configureSecureSocket(Ljavax/net/ssl/SSLSocket;)Lokhttp3/ConnectionSpec;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    const/4 v3, 0x0

    .line 56
    iget v4, p0, Lokhttp3/internal/ConnectionSpecSelector;->nextModeIndex:I

    iget-object v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 57
    iget-object v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lokhttp3/ConnectionSpec;

    .line 58
    invoke-virtual {v6, p1}, Lokhttp3/ConnectionSpec;->isCompatible(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    move-object v3, v6

    .line 60
    add-int/lit8 v0, v4, 0x1

    iput v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->nextModeIndex:I

    .line 61
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 65
    :cond_1
    :goto_1
    if-nez v3, :cond_2

    .line 69
    new-instance v0, Ljava/net/UnknownServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to find acceptable protocols. isFallback="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lokhttp3/internal/ConnectionSpecSelector;->isFallback:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", modes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/ConnectionSpecSelector;->connectionSpecs:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", supported protocols="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 72
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_2
    invoke-direct {p0, p1}, Lokhttp3/internal/ConnectionSpecSelector;->isFallbackPossible(Ljavax/net/ssl/SSLSocket;)Z

    move-result v0

    iput-boolean v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->isFallbackPossible:Z

    .line 77
    sget-object v0, Lokhttp3/internal/Internal;->instance:Lokhttp3/internal/Internal;

    iget-boolean v1, p0, Lokhttp3/internal/ConnectionSpecSelector;->isFallback:Z

    invoke-virtual {v0, v3, p1, v1}, Lokhttp3/internal/Internal;->apply(Lokhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V

    .line 79
    return-object v3
.end method

.method public connectionFailed(Ljava/io/IOException;)Z
    .locals 1

    .line 91
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->isFallback:Z

    .line 93
    iget-boolean v0, p0, Lokhttp3/internal/ConnectionSpecSelector;->isFallbackPossible:Z

    if-nez v0, :cond_0

    .line 94
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_0
    instance-of v0, p1, Ljava/net/ProtocolException;

    if-eqz v0, :cond_1

    .line 99
    const/4 v0, 0x0

    return v0

    .line 105
    :cond_1
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_2

    .line 106
    const/4 v0, 0x0

    return v0

    .line 111
    :cond_2
    instance-of v0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v0, :cond_3

    .line 114
    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/security/cert/CertificateException;

    if-eqz v0, :cond_3

    .line 115
    const/4 v0, 0x0

    return v0

    .line 118
    :cond_3
    instance-of v0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v0, :cond_4

    .line 120
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_4
    instance-of v0, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-nez v0, :cond_5

    instance-of v0, p1, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v0, :cond_6

    :cond_5
    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
