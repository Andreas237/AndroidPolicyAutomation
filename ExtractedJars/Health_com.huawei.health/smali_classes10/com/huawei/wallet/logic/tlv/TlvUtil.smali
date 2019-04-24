.class public Lcom/huawei/wallet/logic/tlv/TlvUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[B

.field private static final e:[C


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 11
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->e:[C

    .line 15
    const/16 v0, 0x80

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    .line 19
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0xa

    if-ge v3, v0, :cond_0

    .line 21
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    add-int/lit8 v1, v3, 0x41

    add-int/lit8 v2, v3, 0xa

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 22
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    add-int/lit8 v1, v3, 0x30

    int-to-byte v2, v3

    aput-byte v2, v0, v1

    .line 23
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    add-int/lit8 v1, v3, 0x61

    add-int/lit8 v2, v3, 0xa

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 19
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BII)Ljava/lang/String;
    .locals 8

    .line 174
    mul-int/lit8 v0, p2, 0x2

    new-array v4, v0, [C

    .line 176
    const-string v0, "TlvUtil"

    const-string v1, "enter"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    move v5, p1

    const/4 v6, 0x0

    :goto_0
    add-int v0, p1, p2

    if-ge v5, v0, :cond_0

    .line 180
    aget-byte v7, p0, v5

    .line 181
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    sget-object v1, Lcom/huawei/wallet/logic/tlv/TlvUtil;->e:[C

    and-int/lit16 v2, v7, 0xf0

    ushr-int/lit8 v2, v2, 0x4

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 182
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    sget-object v1, Lcom/huawei/wallet/logic/tlv/TlvUtil;->e:[C

    and-int/lit8 v2, v7, 0xf

    aget-char v1, v1, v2

    aput-char v1, v4, v0

    .line 178
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 184
    :cond_0
    const-string v0, "TlvUtil"

    const-string v1, "exit toHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 9

    .line 29
    const-string v0, "TlvUtil"

    const-string v1, "enter parseHex"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    const-string v0, "\n"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 31
    array-length v0, v3

    div-int/lit8 v0, v0, 0x2

    new-array v4, v0, [B

    .line 33
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v6, v0, :cond_0

    .line 35
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-char v1, v3, v1

    and-int/lit8 v1, v1, 0x7f

    aget-byte v7, v0, v1

    .line 36
    sget-object v0, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d:[B

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    aget-char v1, v3, v1

    and-int/lit8 v1, v1, 0x7f

    aget-byte v8, v0, v1

    .line 37
    shl-int/lit8 v0, v7, 0x4

    add-int/2addr v0, v8

    int-to-byte v0, v0

    aput-byte v0, v4, v6

    .line 33
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 39
    :cond_0
    const-string v0, "TlvUtil"

    const-string v1, "exit parseHex"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    return-object v4
.end method

.method public static a([B)[B
    .locals 3

    .line 150
    array-length v0, p0

    add-int/lit8 v0, v0, 0x6

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 151
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 152
    const/16 v1, -0x5c

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 153
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 154
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v1, p0

    int-to-byte v1, v1

    .line 155
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 156
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 157
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)[B
    .locals 7

    .line 94
    const-string v0, "TlvUtil"

    const-string v1, "enter hexStringToBytes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    const-string v0, "TlvUtil"

    const-string v1, "judge hexString is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 100
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v2, v0, 0x2

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 103
    new-array v4, v2, [B

    .line 104
    const-string v0, "TlvUtil"

    const-string v1, "next again Loop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    .line 107
    mul-int/lit8 v6, v5, 0x2

    .line 108
    aget-char v0, v3, v6

    invoke-static {v0}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d(C)B

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    add-int/lit8 v1, v6, 0x1

    aget-char v1, v3, v1

    invoke-static {v1}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d(C)B

    move-result v1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 105
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 110
    :cond_2
    const-string v0, "TlvUtil"

    const-string v1, "exit hexStringToBytes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    return-object v4
.end method

.method private static d(C)B
    .locals 1

    .line 136
    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public static d([B)Ljava/lang/String;
    .locals 2

    .line 168
    const-string v0, "TlvUtil"

    const-string v1, "enter toHexString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->a([BII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
