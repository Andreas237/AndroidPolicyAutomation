.class public final Lokhttp3/CertificatePinner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/CertificatePinner$Builder;,
        Lokhttp3/CertificatePinner$Pin;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lokhttp3/CertificatePinner;


# instance fields
.field private final pins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokhttp3/CertificatePinner$Pin;>;"
        }
    .end annotation
.end field

.field private final trustRootIndex:Lokhttp3/internal/tls/TrustRootIndex;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 125
    new-instance v0, Lokhttp3/CertificatePinner$Builder;

    invoke-direct {v0}, Lokhttp3/CertificatePinner$Builder;-><init>()V

    invoke-virtual {v0}, Lokhttp3/CertificatePinner$Builder;->build()Lokhttp3/CertificatePinner;

    move-result-object v0

    sput-object v0, Lokhttp3/CertificatePinner;->DEFAULT:Lokhttp3/CertificatePinner;

    return-void
.end method

.method private constructor <init>(Lokhttp3/CertificatePinner$Builder;)V
    .locals 1

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    invoke-static {p1}, Lokhttp3/CertificatePinner$Builder;->access$000(Lokhttp3/CertificatePinner$Builder;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/CertificatePinner;->pins:Ljava/util/List;

    .line 132
    invoke-static {p1}, Lokhttp3/CertificatePinner$Builder;->access$100(Lokhttp3/CertificatePinner$Builder;)Lokhttp3/internal/tls/TrustRootIndex;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/CertificatePinner;->trustRootIndex:Lokhttp3/internal/tls/TrustRootIndex;

    .line 133
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/CertificatePinner$Builder;Lokhttp3/CertificatePinner$1;)V
    .locals 0

    .line 124
    invoke-direct {p0, p1}, Lokhttp3/CertificatePinner;-><init>(Lokhttp3/CertificatePinner$Builder;)V

    return-void
.end method

.method static synthetic access$200(Lokhttp3/CertificatePinner;)Ljava/util/List;
    .locals 1

    .line 124
    iget-object v0, p0, Lokhttp3/CertificatePinner;->pins:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$300(Lokhttp3/CertificatePinner;)Lokhttp3/internal/tls/TrustRootIndex;
    .locals 1

    .line 124
    iget-object v0, p0, Lokhttp3/CertificatePinner;->trustRootIndex:Lokhttp3/internal/tls/TrustRootIndex;

    return-object v0
.end method

.method public static pin(Ljava/security/cert/Certificate;)Ljava/lang/String;
    .locals 2

    .line 222
    instance-of v0, p0, Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 223
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Certificate pinning requires X509 certificates"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 225
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sha256/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-static {v1}, Lokhttp3/CertificatePinner;->sha256(Ljava/security/cert/X509Certificate;)Lokio/ByteString;

    move-result-object v1

    invoke-virtual {v1}, Lokio/ByteString;->base64()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static sha1(Ljava/security/cert/X509Certificate;)Lokio/ByteString;
    .locals 1

    .line 229
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->sha1(Lokio/ByteString;)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method

.method static sha256(Ljava/security/cert/X509Certificate;)Lokio/ByteString;
    .locals 1

    .line 233
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->sha256(Lokio/ByteString;)Lokio/ByteString;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public check(Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/security/cert/Certificate;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 145
    invoke-virtual {p0, p1}, Lokhttp3/CertificatePinner;->findMatchingPins(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 146
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Lokhttp3/CertificatePinner;->trustRootIndex:Lokhttp3/internal/tls/TrustRootIndex;

    if-eqz v0, :cond_1

    .line 149
    new-instance v0, Lokhttp3/internal/tls/CertificateChainCleaner;

    iget-object v1, p0, Lokhttp3/CertificatePinner;->trustRootIndex:Lokhttp3/internal/tls/TrustRootIndex;

    invoke-direct {v0, v1}, Lokhttp3/internal/tls/CertificateChainCleaner;-><init>(Lokhttp3/internal/tls/TrustRootIndex;)V

    invoke-virtual {v0, p2}, Lokhttp3/internal/tls/CertificateChainCleaner;->clean(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 152
    :cond_1
    const/4 v3, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_8

    .line 153
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 156
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    :goto_1
    if-ge v8, v9, :cond_7

    .line 160
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lokhttp3/CertificatePinner$Pin;

    .line 161
    iget-object v0, v10, Lokhttp3/CertificatePinner$Pin;->hashAlgorithm:Ljava/lang/String;

    const-string v1, "sha256/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    if-nez v7, :cond_2

    invoke-static {v5}, Lokhttp3/CertificatePinner;->sha256(Ljava/security/cert/X509Certificate;)Lokio/ByteString;

    move-result-object v7

    .line 163
    :cond_2
    iget-object v0, v10, Lokhttp3/CertificatePinner$Pin;->hash:Lokio/ByteString;

    invoke-virtual {v0, v7}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return-void

    .line 164
    :cond_3
    iget-object v0, v10, Lokhttp3/CertificatePinner$Pin;->hashAlgorithm:Ljava/lang/String;

    const-string v1, "sha1/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 165
    if-nez v6, :cond_4

    invoke-static {v5}, Lokhttp3/CertificatePinner;->sha1(Ljava/security/cert/X509Certificate;)Lokio/ByteString;

    move-result-object v6

    .line 166
    :cond_4
    iget-object v0, v10, Lokhttp3/CertificatePinner$Pin;->hash:Lokio/ByteString;

    invoke-virtual {v0, v6}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return-void

    .line 168
    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 159
    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 152
    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 174
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Certificate pinning failure!"

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n  Peer certificate chain:"

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 177
    const/4 v4, 0x0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_9

    .line 178
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/security/cert/X509Certificate;

    .line 179
    const-string v0, "\n    "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Lokhttp3/CertificatePinner;->pin(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 182
    :cond_9
    const-string v0, "\n  Pinned certificates for "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    const/4 v4, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_3
    if-ge v4, v5, :cond_a

    .line 184
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lokhttp3/CertificatePinner$Pin;

    .line 185
    const-string v0, "\n    "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 187
    :cond_a
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public varargs check(Ljava/lang/String;[Ljava/security/cert/Certificate;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 193
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lokhttp3/CertificatePinner;->check(Ljava/lang/String;Ljava/util/List;)V

    .line 194
    return-void
.end method

.method findMatchingPins(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lokhttp3/CertificatePinner$Pin;>;"
        }
    .end annotation

    .line 201
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 202
    iget-object v0, p0, Lokhttp3/CertificatePinner;->pins:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lokhttp3/CertificatePinner$Pin;

    .line 203
    invoke-virtual {v3, p1}, Lokhttp3/CertificatePinner$Pin;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 205
    :cond_0
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_1
    goto :goto_0

    .line 208
    :cond_2
    return-object v1
.end method

.method newBuilder()Lokhttp3/CertificatePinner$Builder;
    .locals 1

    .line 212
    new-instance v0, Lokhttp3/CertificatePinner$Builder;

    invoke-direct {v0, p0}, Lokhttp3/CertificatePinner$Builder;-><init>(Lokhttp3/CertificatePinner;)V

    return-object v0
.end method
