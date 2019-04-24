.class public final Lo/bck;
.super Lo/ecu;
.source "SourceFile"


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1}, Lo/ecu;-><init>(Landroid/content/Context;)V

    .line 28
    return-void
.end method

.method public static a()Lo/ecu;
    .locals 6

    .line 37
    const/4 v4, 0x0

    .line 40
    :try_start_0
    new-instance v0, Lo/bck;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bck;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v4, v0

    .line 61
    goto :goto_0

    .line 42
    :catch_0
    move-exception v5

    .line 44
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager IOException."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 46
    :catch_1
    move-exception v5

    .line 48
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager NoSuchAlgorithmException."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 50
    :catch_2
    move-exception v5

    .line 52
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager CertificateException."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 54
    :catch_3
    move-exception v5

    .line 56
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager KeyStoreException."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    goto :goto_0

    .line 58
    :catch_4
    move-exception v5

    .line 60
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager IllegalAccessException."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    :goto_0
    if-nez v4, :cond_0

    .line 65
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrustManager not found."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_0
    return-object v4
.end method

.method private c([Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;
    .locals 3

    .line 108
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 110
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/security/cert/X509Certificate;

    .line 111
    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 112
    invoke-static {}, Lorg/jivesoftware/smack/tcp/GetGeoTrustCer;->get()Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 113
    return-object v2

    .line 115
    :cond_0
    return-object p1
.end method


# virtual methods
.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 73
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkServerTrusted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager checkServerCertificate."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-super {p0, p1, p2}, Lo/ecu;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 87
    :catch_0
    move-exception v4

    .line 89
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 92
    const-string v0, "XMPPTrustManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "XMPPTrustManager checkGeoTrustCertificate."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-direct {p0, p1}, Lo/bck;->c([Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-super {p0, v0, p2}, Lo/ecu;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    goto :goto_0

    .line 98
    :cond_0
    throw v4

    .line 101
    :goto_0
    return-void
.end method
