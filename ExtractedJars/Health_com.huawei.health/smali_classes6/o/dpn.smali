.class public Lo/dpn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/dpn;


# instance fields
.field private c:Ljava/security/MessageDigest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    sput-object v0, Lo/dpn;->b:Lo/dpn;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpn;->c:Ljava/security/MessageDigest;

    .line 33
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Lo/dpn;->c:Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    goto :goto_0

    .line 34
    :catch_0
    move-exception v1

    .line 37
    :goto_0
    return-void
.end method

.method private static b([BII)Ljava/lang/String;
    .locals 6

    .line 99
    const/16 v2, 0x10

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    move v4, p1

    :goto_0
    add-int v0, p1, p2

    if-ge v4, v0, :cond_0

    .line 104
    aget-byte v5, p0, v4

    .line 105
    ushr-int/lit8 v0, v5, 0x4

    and-int/lit8 v0, v0, 0xf

    aget-char v0, v2, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    and-int/lit8 v0, v5, 0xf

    aget-char v0, v2, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

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
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .line 74
    const/4 v2, 0x0

    .line 76
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    .line 77
    const/16 v0, 0x1000

    new-array v3, v0, [B

    .line 79
    :goto_0
    invoke-virtual {v2, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v4, v0

    if-lez v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/dpn;->c:Ljava/security/MessageDigest;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1, v4}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 89
    :cond_0
    if-eqz v2, :cond_1

    .line 90
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    :cond_1
    goto :goto_2

    .line 92
    :catch_0
    move-exception v3

    .line 95
    goto :goto_2

    .line 83
    :catch_1
    move-exception v3

    .line 89
    if-eqz v2, :cond_2

    .line 90
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 94
    :cond_2
    goto :goto_2

    .line 92
    :catch_2
    move-exception v3

    .line 95
    goto :goto_2

    .line 85
    :catch_3
    move-exception v3

    .line 89
    if-eqz v2, :cond_3

    .line 90
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 94
    :cond_3
    goto :goto_2

    .line 92
    :catch_4
    move-exception v3

    .line 95
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v5

    .line 89
    if-eqz v2, :cond_4

    .line 90
    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 94
    :cond_4
    goto :goto_1

    .line 92
    :catch_5
    move-exception v6

    .line 95
    :goto_1
    throw v5

    .line 96
    :goto_2
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {}, Lo/dpn;->d()Lo/dpn;

    move-result-object v3

    .line 43
    if-nez p0, :cond_0

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    invoke-direct {v3, p0}, Lo/dpn;->b(Ljava/lang/String;)V

    .line 47
    iget-object v0, v3, Lo/dpn;->c:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 48
    iget-object v0, v3, Lo/dpn;->c:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 49
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0}, Lo/dpn;->b([BII)Ljava/lang/String;

    move-result-object v2

    .line 50
    return-object v2
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 54
    const/4 v2, 0x0

    .line 56
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 57
    if-nez p0, :cond_0

    .line 58
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_0
    const-string v0, "UTF-8"

    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 61
    invoke-virtual {v3}, Ljava/security/MessageDigest;->reset()V

    .line 62
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0}, Lo/dpn;->b([BII)Ljava/lang/String;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 68
    goto :goto_0

    .line 64
    :catch_0
    move-exception v3

    .line 68
    goto :goto_0

    .line 66
    :catch_1
    move-exception v3

    .line 70
    :goto_0
    return-object v2
.end method

.method private static d()Lo/dpn;
    .locals 1

    .line 24
    sget-object v0, Lo/dpn;->b:Lo/dpn;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Lo/dpn;

    invoke-direct {v0}, Lo/dpn;-><init>()V

    sput-object v0, Lo/dpn;->b:Lo/dpn;

    .line 27
    :cond_0
    sget-object v0, Lo/dpn;->b:Lo/dpn;

    return-object v0
.end method
