.class public Lcom/huawei/phoneserviceuni/common/e/a/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "SHA-256"

.field private static final b:Ljava/lang/String; = "UTF-8"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 43
    if-nez p0, :cond_0

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a/b/b;->b(Ljava/lang/String;)[B

    move-result-object v1

    .line 47
    if-eqz v1, :cond_1

    array-length v0, v1

    if-nez v0, :cond_2

    .line 48
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_2
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;)[B
    .locals 4

    .line 22
    const/4 v2, 0x0

    .line 24
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 29
    goto :goto_0

    .line 25
    :catch_0
    move-exception v3

    .line 26
    const-string v0, "SHAUtils"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    goto :goto_0

    .line 27
    :catch_1
    move-exception v3

    .line 28
    const-string v0, "SHAUtils"

    const-string v1, "NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :goto_0
    return-object v2
.end method
