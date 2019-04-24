.class public Lcom/huawei/logupload/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"

.field private static b:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-string v0, "+Wy0+6EFY29lMbUZks2YmyQ0hV7/hGWwABZY0ENkZvfGAhrvOjWaqDuaFGhG5S+dz5pzxhsdFBC//HEhJQ6Ik1y8wYVedNyYllONrpkglxlsEqClqtx8zQKBgQDKc3XXKgaowiISI9go3kc4fmpnvj6dERrccm+M+XQ7opsRChuTR//bYkKPTMliQJg9TfLvP37EKU1D8pEaxsCe9dywaLHA+qS"

    sput-object v0, Lcom/huawei/logupload/c/h;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 20
    sget-object v0, Lcom/huawei/logupload/c/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 35
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 36
    goto :goto_0

    :catch_0
    move-exception v4

    .line 37
    const-string v0, "LogUpload Service"

    const-string v1, "\u521d\u59cb\u5316\u5931\u8d25\uff0cMessageDigest\u4e0d\u652f\u6301MD5Util\u3002"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 42
    :goto_0
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 43
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 44
    const/4 v5, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/security/MessageDigest;->update([BII)V

    .line 45
    :goto_1
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v5, v0

    if-gtz v0, :cond_0

    .line 48
    goto :goto_2

    :catch_1
    move-exception v4

    .line 49
    :try_start_2
    throw v4

    .line 50
    :catch_2
    move-exception v4

    .line 51
    const-string v0, "LogUpload Service"

    const-string v1, "MD5 Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    const-string v0, "LogUpload Service"

    invoke-static {v2, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    goto :goto_3

    .line 52
    :catchall_0
    move-exception v6

    .line 53
    const-string v0, "LogUpload Service"

    invoke-static {v2, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 54
    throw v6

    .line 53
    :goto_2
    const-string v0, "LogUpload Service"

    invoke-static {v2, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 56
    :goto_3
    if-eqz v3, :cond_1

    .line 57
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/h;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 60
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a([B)Ljava/lang/String;
    .locals 2

    .line 64
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/logupload/c/h;->a([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a([BII)Ljava/lang/String;
    .locals 4

    .line 68
    new-instance v1, Ljava/lang/StringBuffer;

    mul-int/lit8 v0, p2, 0x2

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 69
    add-int v2, p1, p2

    .line 70
    move v3, p1

    goto :goto_0

    .line 71
    :cond_0
    aget-byte v0, p0, v3

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/h;->a(BLjava/lang/StringBuffer;)V

    .line 70
    add-int/lit8 v3, v3, 0x1

    :goto_0
    if-lt v3, v2, :cond_0

    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(BLjava/lang/StringBuffer;)V
    .locals 5

    .line 80
    const/16 v2, 0x10

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    .line 80
    .line 81
    .line 83
    and-int/lit16 v0, p0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    aget-char v3, v2, v0

    .line 85
    and-int/lit8 v0, p0, 0xf

    aget-char v4, v2, v0

    .line 86
    invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 87
    invoke-virtual {p1, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 88
    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 24
    sput-object p0, Lcom/huawei/logupload/c/h;->b:Ljava/lang/String;

    .line 25
    return-void
.end method
