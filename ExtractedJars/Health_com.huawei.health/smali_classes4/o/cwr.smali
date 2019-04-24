.class public Lo/cwr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const-string v0, "context must not be null."

    invoke-static {p1, v0}, Lo/cwq;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    iput-object p1, p0, Lo/cwr;->a:Landroid/content/Context;

    .line 68
    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 138
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 141
    const/16 v0, 0x80

    :try_start_0
    invoke-virtual {v5, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    .line 142
    if-eqz v6, :cond_0

    iget-object v0, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 143
    const-string v0, "HsfSignValidator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "appInfo className"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " processName"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const-string v0, "HsfSignValidator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "appInfo.metaData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, "HsfSignValidator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ackageHsfSignature "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v4, "health-signature"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, v6, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "health-signature"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 150
    :cond_0
    goto :goto_0

    .line 148
    :catch_0
    move-exception v6

    .line 149
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get the application HSF signature."

    invoke-static {v0, v1, v6}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)Ljava/security/cert/Certificate;
    .locals 9

    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 184
    const/4 v3, 0x0

    .line 186
    const/16 v0, 0x40

    :try_start_0
    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 188
    if-eqz v4, :cond_0

    iget-object v0, v4, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    if-lez v0, :cond_0

    .line 189
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v5

    .line 190
    invoke-static {v5}, Lo/cwt;->b([B)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    .line 192
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v6

    .line 194
    invoke-virtual {v6, v3}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 204
    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 194
    return-object v7

    .line 204
    :cond_0
    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 205
    goto :goto_0

    .line 197
    :catch_0
    move-exception v4

    .line 198
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get application signature certificate."

    :try_start_1
    invoke-static {v0, v1, v4}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 205
    goto :goto_0

    .line 199
    :catch_1
    move-exception v4

    .line 200
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get application signature certificate."

    :try_start_2
    invoke-static {v0, v1, v4}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 205
    goto :goto_0

    .line 201
    :catch_2
    move-exception v4

    .line 202
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get application signature certificate."

    :try_start_3
    invoke-static {v0, v1, v4}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 204
    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 205
    goto :goto_0

    .line 204
    :catchall_0
    move-exception v8

    invoke-static {v3}, Lo/cwt;->c(Ljava/io/InputStream;)V

    .line 205
    throw v8

    .line 207
    :goto_0
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get application signature certificate."

    invoke-static {v0, v1}, Lo/cwy;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 161
    invoke-static {p0, p1}, Lo/cwr;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v5

    .line 163
    if-eqz v5, :cond_0

    .line 165
    const-string v0, "HsfSignValidator"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cert.getEncoded() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    invoke-static {v3}, Lo/cxc;->b([B)[B

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lo/cwu;->a([BZ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v0

    invoke-static {v0}, Lo/cxc;->b([B)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cwu;->a([BZ)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 167
    :catch_0
    move-exception v6

    .line 168
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to get application signature certificate fingerprint."

    invoke-static {v0, v1, v6}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Landroid/content/Context;)Ljava/security/PublicKey;
    .locals 2

    .line 128
    new-instance v1, Lo/cwv;

    invoke-direct {v1}, Lo/cwv;-><init>()V

    .line 129
    const-string v0, "publickey.txt"

    invoke-virtual {v1, v0}, Lo/cwv;->c(Ljava/lang/String;)Ljava/security/interfaces/RSAPublicKey;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Z
    .locals 8

    .line 77
    const-string v0, "packageName must not be empty."

    invoke-static {p1, v0}, Lo/cwq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    iget-object v0, p0, Lo/cwr;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cwr;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 81
    const-string v0, "HsfSignValidator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hsfSign = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    new-instance v0, Lo/cws;

    iget-object v1, p0, Lo/cwr;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cws;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Lo/cws;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_1
    iget-object v0, p0, Lo/cwr;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cwr;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 93
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_2
    iget-object v0, p0, Lo/cwr;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cwr;->e(Landroid/content/Context;)Ljava/security/PublicKey;

    move-result-object v6

    .line 99
    if-nez v6, :cond_3

    .line 100
    const/4 v0, 0x0

    return v0

    .line 105
    :cond_3
    const-string v0, "NONEwithRSA"

    :try_start_0
    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v7

    .line 107
    invoke-virtual {v7, v6}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 108
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/security/Signature;->update([B)V

    .line 109
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/security/Signature;->update([B)V

    .line 111
    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/security/Signature;->verify([B)Z
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 113
    :catch_0
    move-exception v7

    .line 114
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to verify application HSF-signature."

    invoke-static {v0, v1, v7}, Lo/cwy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    const-string v0, "HsfSignValidator"

    const-string v1, "Failed to verify application HSF-signature."

    invoke-static {v0, v1}, Lo/cwy;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const/4 v0, 0x0

    return v0
.end method
