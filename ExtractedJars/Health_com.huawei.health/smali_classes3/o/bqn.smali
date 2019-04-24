.class final Lo/bqn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field static final d:Lo/bqn;

.field private static final e:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Lo/bqn;

    invoke-direct {v0}, Lo/bqn;-><init>()V

    sput-object v0, Lo/bqn;->d:Lo/bqn;

    .line 34
    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/bqn;->e:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method

.method private static a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/security/cert/X509Certificate;I)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 200
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 203
    :try_start_0
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v3

    .line 204
    if-nez v3, :cond_0

    .line 206
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 209
    :cond_0
    :try_start_1
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 211
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 212
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 214
    goto :goto_0

    .line 218
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 219
    if-nez v7, :cond_3

    .line 221
    goto :goto_0

    .line 225
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_4

    .line 227
    const/4 v0, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 228
    if-eqz v8, :cond_4

    .line 230
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_1 .. :try_end_1} :catch_0

    .line 233
    :cond_4
    goto :goto_0

    .line 235
    :cond_5
    return-object v2

    .line 237
    :catch_0
    move-exception v3

    .line 239
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 4

    .line 103
    const/4 v0, 0x7

    invoke-static {p2, v0}, Lo/bqn;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v1

    .line 104
    const/4 v2, 0x0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    .line 106
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 111
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 1

    .line 119
    sget-object v0, Lo/bqn;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 1

    .line 48
    invoke-static {p1}, Lo/bqn;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-direct {p0, p1, p2}, Lo/bqn;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v0

    goto :goto_0

    .line 50
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bqn;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result v0

    .line 48
    :goto_0
    return v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 132
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ".."

    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 139
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ".."

    .line 140
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 147
    :cond_3
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 151
    :cond_4
    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 157
    :cond_5
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    .line 159
    const-string v0, "*"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 162
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 165
    :cond_6
    const-string v0, "*."

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x2a

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 167
    :cond_7
    const/4 v0, 0x0

    return v0

    .line 170
    :cond_8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_9

    .line 173
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_9
    const-string v0, "*."

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 178
    const/4 v0, 0x0

    return v0

    .line 181
    :cond_a
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 182
    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 184
    const/4 v0, 0x0

    return v0

    .line 187
    :cond_b
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v3, v0, v1

    .line 188
    if-lez v3, :cond_c

    add-int/lit8 v0, v3, -0x1

    .line 189
    const/16 v1, 0x2e

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    .line 191
    const/4 v0, 0x0

    return v0

    .line 194
    :cond_c
    const/4 v0, 0x1

    return v0
.end method

.method private e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 6

    .line 73
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v0, 0x2

    invoke-static {p2, v0}, Lo/bqn;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v3

    .line 76
    const/4 v4, 0x0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_1

    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lo/bqn;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_1
    if-nez v2, :cond_2

    .line 87
    invoke-virtual {p2}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v4

    .line 88
    new-instance v0, Lo/bqj;

    invoke-direct {v0, v4}, Lo/bqj;-><init>(Ljavax/security/auth/x500/X500Principal;)V

    const-string v1, "cn"

    invoke-virtual {v0, v1}, Lo/bqj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 89
    if-eqz v5, :cond_2

    .line 91
    invoke-direct {p0, p1, v5}, Lo/bqn;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 95
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 3

    .line 58
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v2

    .line 59
    const/4 v0, 0x0

    aget-object v0, v2, v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-direct {p0, p1, v0}, Lo/bqn;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 61
    :catch_0
    move-exception v2

    .line 63
    const-string v0, "SafeHostnameVerifier"

    const-string v1, "verify exception: SSLException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x0

    return v0
.end method
