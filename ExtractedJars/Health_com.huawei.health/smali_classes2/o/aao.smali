.class public Lo/aao;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 39
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v5

    .line 43
    const-string v0, "encrypt UnsupportedEncodingException:"

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 48
    :goto_0
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    const-string p1, "SHA-256"

    .line 53
    :cond_0
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 54
    invoke-virtual {v2, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 56
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lo/aao;->d([B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v3

    .line 57
    goto :goto_1

    .line 58
    :catch_1
    move-exception v5

    .line 60
    const-string v0, "encrypt NoSuchAlgorithmException: "

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lo/aap;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 63
    :goto_1
    return-object v3
.end method

.method private static d([B)Ljava/lang/String;
    .locals 5

    .line 68
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    goto :goto_0

    .line 72
    :cond_0
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 75
    const-string v0, "0"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 77
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    add-int/lit8 v4, v4, 0x1

    :goto_0
    array-length v0, p0

    if-lt v4, v0, :cond_0

    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
