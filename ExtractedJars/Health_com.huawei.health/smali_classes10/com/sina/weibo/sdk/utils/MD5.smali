.class public Lcom/sina/weibo/sdk/utils/MD5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final hexDigits:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/sina/weibo/sdk/utils/MD5;->hexDigits:[C

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

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static hexdigest(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 33
    const/4 v1, 0x0

    .line 36
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 39
    goto :goto_0

    .line 37
    :catch_0
    move-exception v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 40
    :goto_0
    return-object v1
.end method

.method public static hexdigest([B)Ljava/lang/String;
    .locals 11

    .line 44
    const/4 v4, 0x0

    .line 46
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5

    .line 47
    invoke-virtual {v5, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 48
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    .line 49
    const/16 v0, 0x20

    new-array v7, v0, [C

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v9, v0, :cond_0

    .line 52
    aget-byte v10, v6, v9

    .line 53
    move v0, v8

    add-int/lit8 v8, v8, 0x1

    sget-object v1, Lcom/sina/weibo/sdk/utils/MD5;->hexDigits:[C

    ushr-int/lit8 v2, v10, 0x4

    and-int/lit8 v2, v2, 0xf

    aget-char v1, v1, v2

    aput-char v1, v7, v0

    .line 54
    move v0, v8

    add-int/lit8 v8, v8, 0x1

    sget-object v1, Lcom/sina/weibo/sdk/utils/MD5;->hexDigits:[C

    and-int/lit8 v2, v10, 0xf

    aget-char v1, v1, v2

    aput-char v1, v7, v0

    .line 51
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 59
    goto :goto_1

    .line 57
    :catch_0
    move-exception v5

    .line 58
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 60
    :goto_1
    return-object v4
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    .line 64
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "c"

    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 65
    return-void
.end method
