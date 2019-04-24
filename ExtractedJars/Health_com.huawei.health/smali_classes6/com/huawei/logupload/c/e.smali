.class public Lcom/huawei/logupload/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "HmacSHA1"

.field private static final b:Ljava/lang/String; = "Ye6aU0"

.field private static c:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-string v0, "G5qeP1iA8kCp6G3n5iEMUi71phti4PmJYWqxI/Z7xZHHhEQvWJBlLiJD+uhofu7KHojIrz5LdhRffJJ1TwzIGwQKBgQD3KOiKVVoAQHMoqwpBoXG2JfRf1l6vvUY2ylnI261GkEKg2TacEnETTgSHPaBBqqZiP4p7mbVzvVuTsI5xDv/14gMQGLtdk2S7imWinUaGIfy9ybSj9D1ZHEIoA/lJaSsOZ5UXfH8wbw7oqEVat3GFNlDwsqKlziLcZULldr/G+QKBgQCdngbPtAfjp4HxT0I4Fju/jykD+3nBQMn7XeHrJB40+1kYtx+yR06W+eD"

    sput-object v0, Lcom/huawei/logupload/c/e;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 20
    sget-object v0, Lcom/huawei/logupload/c/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method private static a(B)Ljava/lang/String;
    .locals 5

    .line 51
    const/16 v2, 0x10

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x2

    new-array v3, v0, [C

    .line 54
    ushr-int/lit8 v0, p0, 0x4

    and-int/lit8 v0, v0, 0xf

    aget-char v0, v2, v0

    const/4 v1, 0x0

    aput-char v0, v3, v1

    .line 55
    and-int/lit8 v0, p0, 0xf

    aget-char v0, v2, v0

    const/4 v1, 0x1

    aput-char v0, v3, v1

    .line 56
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([C)V

    .line 57
    return-object v4

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
    sput-object p0, Lcom/huawei/logupload/c/e;->c:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 5

    .line 33
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 34
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HmacSHA1"

    invoke-direct {v2, v1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 35
    const-string v0, "HmacSHA1"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v3

    .line 36
    invoke-virtual {v3, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 37
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v4

    .line 38
    return-object v4
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 29
    const-string v0, "Ye6aU0"

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 42
    invoke-static {p0, p1}, Lcom/huawei/logupload/c/e;->a(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    move-object v6, v1

    array-length v5, v1

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    aget-byte v3, v6, v4

    .line 45
    invoke-static {v3}, Lcom/huawei/logupload/c/e;->a(B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    add-int/lit8 v4, v4, 0x1

    :goto_0
    if-lt v4, v5, :cond_0

    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
