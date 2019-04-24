.class public Lcom/leisen/wallet/sdk/util/DataConvertUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "DataConvertUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bytesToHexString([B)Ljava/lang/String;
    .locals 6

    .line 55
    const-string v0, "DataConvertUtil"

    const-string v1, "enter bytesToHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    if-eqz p0, :cond_0

    array-length v0, p0

    if-gtz v0, :cond_1

    .line 58
    :cond_0
    const-string v0, "DataConvertUtil"

    const-string v1, "judge src is null or"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_1
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_3

    .line 62
    aget-byte v0, p0, v3

    and-int/lit16 v4, v0, 0xff

    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    .line 64
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 65
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    :cond_2
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 69
    :cond_3
    const-string v0, "DataConvertUtil"

    const-string v1, "exit bytesToHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static charToByte(C)B
    .locals 2

    .line 18
    const-string v0, "DataConvertUtil"

    const-string v1, "run charToByte"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public static hexStringToBytes(Ljava/lang/String;)[B
    .locals 7

    .line 31
    const-string v0, "DataConvertUtil"

    const-string v1, "enter hexStringToBytes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    :cond_0
    const-string v0, "DataConvertUtil"

    const-string v1, "judge paramHexString is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 39
    new-array v4, v2, [B

    .line 40
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    .line 41
    mul-int/lit8 v6, v5, 0x2

    .line 42
    aget-char v0, v3, v6

    invoke-static {v0}, Lcom/leisen/wallet/sdk/util/DataConvertUtil;->charToByte(C)B

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v6, 0x1

    aget-char v1, v3, v1

    invoke-static {v1}, Lcom/leisen/wallet/sdk/util/DataConvertUtil;->charToByte(C)B

    move-result v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 40
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 44
    :cond_2
    const-string v0, "DataConvertUtil"

    const-string v1, "exit hexStringToBytes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    return-object v4
.end method
