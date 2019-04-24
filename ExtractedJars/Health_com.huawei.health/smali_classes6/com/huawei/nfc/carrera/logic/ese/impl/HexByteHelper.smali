.class public Lcom/huawei/nfc/carrera/logic/ese/impl/HexByteHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "HexByteHelper"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static byteArrayToHexString([B)Ljava/lang/String;
    .locals 6

    .line 62
    const-string v0, "HexByteHelper"

    const-string v1, "enter byteArrayToHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    const/16 v2, 0x10

    new-array v2, v2, [C

    fill-array-data v2, :array_0

    .line 65
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [C

    .line 66
    const-string v0, "HexByteHelper"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v5, v0, :cond_0

    .line 70
    aget-byte v0, p0, v5

    and-int/lit16 v4, v0, 0xff

    .line 71
    mul-int/lit8 v0, v5, 0x2

    ushr-int/lit8 v1, v4, 0x4

    aget-char v1, v2, v1

    aput-char v1, v3, v0

    .line 72
    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v1, v4, 0xf

    aget-char v1, v2, v1

    aput-char v1, v3, v0

    .line 68
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "HexByteHelper"

    const-string v1, "exit byteArrayToHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0

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

.method static decimalStringToDecimalInteger(Ljava/lang/String;)I
    .locals 4

    .line 114
    const/4 v2, 0x0

    .line 115
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 119
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 124
    goto :goto_0

    .line 121
    :catch_0
    move-exception v3

    .line 123
    const-string v0, "decimalStringToDecimalInteger format exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 127
    :cond_0
    :goto_0
    return v2
.end method

.method static hexStringToByteArray(Ljava/lang/String;)[B
    .locals 7

    .line 41
    const-string v0, "HexByteHelper"

    const-string v1, "enter hexStringToByteArray"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 43
    div-int/lit8 v0, v4, 0x2

    new-array v5, v0, [B

    .line 44
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 46
    div-int/lit8 v0, v6, 0x2

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Character;->digit(CI)I

    move-result v1

    shl-int/lit8 v1, v1, 0x4

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Character;->digit(CI)I

    move-result v2

    add-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v5, v0

    .line 44
    add-int/lit8 v6, v6, 0x2

    goto :goto_0

    .line 48
    :cond_0
    const-string v0, "HexByteHelper"

    const-string v1, "exit hexStringToByteArray"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    return-object v5
.end method

.method static hexStringToDecimalInteger(Ljava/lang/String;)I
    .locals 4

    .line 89
    const/4 v2, 0x0

    .line 90
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const/16 v0, 0x10

    :try_start_0
    invoke-static {p0, v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 99
    goto :goto_0

    .line 96
    :catch_0
    move-exception v3

    .line 98
    const-string v0, "hexStringToDecimalInteger format exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 102
    :cond_0
    :goto_0
    return v2
.end method

.method static integerToHexStr(I)Ljava/lang/String;
    .locals 3

    .line 139
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    .line 140
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 145
    :cond_0
    return-object v2
.end method
