.class public Lorg/jivesoftware/smack/util/stringencoder/Base32;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ALPHABET:Ljava/lang/String; = "ABCDEFGHIJKLMNOPQRSTUVWXYZ2345678"

.field private static final TAG:Ljava/lang/String; = "Base32"

.field private static final base32Stringencoder:Lorg/jivesoftware/smack/util/stringencoder/StringEncoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lorg/jivesoftware/smack/util/stringencoder/Base32$5;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/stringencoder/Base32$5;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base32;->base32Stringencoder:Lorg/jivesoftware/smack/util/stringencoder/StringEncoder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 61
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 64
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 68
    goto :goto_0

    .line 66
    :catch_0
    move-exception v5

    .line 67
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 69
    :goto_0
    const/4 v5, 0x0

    :goto_1
    array-length v0, v4

    if-ge v5, v0, :cond_1

    .line 70
    aget-byte v0, v4, v5

    int-to-char v6, v0

    .line 71
    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    invoke-static {v6}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v6

    .line 73
    int-to-byte v0, v6

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 69
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 77
    :cond_1
    :goto_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    .line 78
    const/16 v0, 0x38

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v5

    .line 82
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 83
    new-instance v6, Ljava/io/DataOutputStream;

    invoke-direct {v6, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 85
    const/4 v7, 0x0

    :goto_3
    array-length v0, v5

    div-int/lit8 v0, v0, 0x8

    if-ge v7, v0, :cond_8

    .line 86
    const/16 v0, 0x8

    new-array v8, v0, [S

    .line 87
    const/4 v0, 0x5

    new-array v9, v0, [I

    .line 89
    const/16 v10, 0x8

    .line 90
    const/4 v11, 0x0

    :goto_4
    const/16 v0, 0x8

    if-ge v11, v0, :cond_5

    .line 91
    mul-int/lit8 v0, v7, 0x8

    add-int/2addr v0, v11

    aget-byte v0, v5, v0

    int-to-char v12, v0

    .line 92
    const/16 v0, 0x38

    if-ne v12, v0, :cond_3

    .line 93
    goto :goto_5

    .line 94
    :cond_3
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZ2345678"

    mul-int/lit8 v1, v7, 0x8

    add-int/2addr v1, v11

    aget-byte v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    int-to-short v0, v0

    aput-short v0, v8, v11

    .line 95
    aget-short v0, v8, v11

    if-gez v0, :cond_4

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 97
    :cond_4
    add-int/lit8 v10, v10, -0x1

    .line 90
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 99
    :cond_5
    :goto_5
    invoke-static {v10}, Lorg/jivesoftware/smack/util/stringencoder/Base32;->paddingToLen(I)I

    move-result v11

    .line 100
    if-gez v11, :cond_6

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 104
    :cond_6
    const/4 v0, 0x0

    aget-short v0, v8, v0

    shl-int/lit8 v0, v0, 0x3

    const/4 v1, 0x1

    aget-short v1, v8, v1

    shr-int/lit8 v1, v1, 0x2

    or-int/2addr v0, v1

    const/4 v1, 0x0

    aput v0, v9, v1

    .line 106
    const/4 v0, 0x1

    aget-short v0, v8, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x6

    const/4 v1, 0x2

    aget-short v1, v8, v1

    shl-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aget-short v1, v8, v1

    shr-int/lit8 v1, v1, 0x4

    or-int/2addr v0, v1

    const/4 v1, 0x1

    aput v0, v9, v1

    .line 108
    const/4 v0, 0x3

    aget-short v0, v8, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    aget-short v1, v8, v1

    shr-int/lit8 v1, v1, 0x1

    and-int/lit8 v1, v1, 0xf

    or-int/2addr v0, v1

    const/4 v1, 0x2

    aput v0, v9, v1

    .line 110
    const/4 v0, 0x4

    aget-short v0, v8, v0

    shl-int/lit8 v0, v0, 0x7

    const/4 v1, 0x5

    aget-short v1, v8, v1

    shl-int/lit8 v1, v1, 0x2

    or-int/2addr v0, v1

    const/4 v1, 0x6

    aget-short v1, v8, v1

    shr-int/lit8 v1, v1, 0x3

    or-int/2addr v0, v1

    const/4 v1, 0x3

    aput v0, v9, v1

    .line 112
    const/4 v0, 0x6

    aget-short v0, v8, v0

    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x5

    const/4 v1, 0x7

    aget-short v1, v8, v1

    or-int/2addr v0, v1

    const/4 v1, 0x4

    aput v0, v9, v1

    .line 115
    const/4 v12, 0x0

    :goto_6
    if-ge v12, v11, :cond_7

    .line 116
    :try_start_1
    aget v0, v9, v12

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    invoke-virtual {v6, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 115
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    .line 119
    :cond_7
    goto :goto_7

    .line 117
    :catch_1
    move-exception v12

    .line 118
    const-string v0, "Base32"

    const-string v1, "writeByte throws a IOException"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :goto_7
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_3

    .line 124
    :cond_8
    :try_start_2
    new-instance v7, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v7, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    .line 128
    goto :goto_8

    .line 126
    :catch_2
    move-exception v8

    .line 127
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v8}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 129
    :goto_8
    return-object v7
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 135
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 139
    goto :goto_0

    .line 137
    :catch_0
    move-exception v4

    .line 138
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 140
    :goto_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 142
    const/4 v5, 0x0

    :goto_1
    array-length v0, v3

    add-int/lit8 v0, v0, 0x4

    div-int/lit8 v0, v0, 0x5

    if-ge v5, v0, :cond_3

    .line 143
    const/4 v0, 0x5

    new-array v6, v0, [S

    .line 144
    const/16 v0, 0x8

    new-array v7, v0, [I

    .line 146
    const/4 v8, 0x5

    .line 147
    const/4 v9, 0x0

    :goto_2
    const/4 v0, 0x5

    if-ge v9, v0, :cond_1

    .line 148
    mul-int/lit8 v0, v5, 0x5

    add-int/2addr v0, v9

    array-length v1, v3

    if-ge v0, v1, :cond_0

    .line 149
    mul-int/lit8 v0, v5, 0x5

    add-int/2addr v0, v9

    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    aput-short v0, v6, v9

    goto :goto_3

    .line 151
    :cond_0
    const/4 v0, 0x0

    aput-short v0, v6, v9

    .line 152
    add-int/lit8 v8, v8, -0x1

    .line 147
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 155
    :cond_1
    invoke-static {v8}, Lorg/jivesoftware/smack/util/stringencoder/Base32;->lenToPadding(I)I

    move-result v9

    .line 160
    const/4 v0, 0x0

    aget-short v0, v6, v0

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput v0, v7, v1

    .line 162
    const/4 v0, 0x0

    aget-short v0, v6, v0

    and-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    aget-short v1, v6, v1

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0x3

    or-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput v0, v7, v1

    .line 164
    const/4 v0, 0x1

    aget-short v0, v6, v0

    shr-int/lit8 v0, v0, 0x1

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput v0, v7, v1

    .line 166
    const/4 v0, 0x1

    aget-short v0, v6, v0

    and-int/lit8 v0, v0, 0x1

    shl-int/lit8 v0, v0, 0x4

    const/4 v1, 0x2

    aget-short v1, v6, v1

    shr-int/lit8 v1, v1, 0x4

    and-int/lit8 v1, v1, 0xf

    or-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput v0, v7, v1

    .line 168
    const/4 v0, 0x2

    aget-short v0, v6, v0

    and-int/lit8 v0, v0, 0xf

    shl-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aget-short v1, v6, v1

    shr-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x4

    aput v0, v7, v1

    .line 170
    const/4 v0, 0x3

    aget-short v0, v6, v0

    shr-int/lit8 v0, v0, 0x2

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    const/4 v1, 0x5

    aput v0, v7, v1

    .line 172
    const/4 v0, 0x3

    aget-short v0, v6, v0

    and-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x3

    const/4 v1, 0x4

    aget-short v1, v6, v1

    shr-int/lit8 v1, v1, 0x5

    and-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    int-to-byte v0, v0

    const/4 v1, 0x6

    aput v0, v7, v1

    .line 174
    const/4 v0, 0x4

    aget-short v0, v6, v0

    and-int/lit8 v0, v0, 0x1f

    int-to-byte v0, v0

    const/4 v1, 0x7

    aput v0, v7, v1

    .line 177
    const/4 v10, 0x0

    :goto_4
    array-length v0, v7

    rsub-int/lit8 v0, v9, 0x8

    if-ge v10, v0, :cond_2

    .line 178
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZ2345678"

    aget v1, v7, v10

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 179
    invoke-virtual {v4, v11}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 177
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 142
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 184
    :cond_3
    :try_start_1
    new-instance v5, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v5, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 188
    goto :goto_5

    .line 186
    :catch_1
    move-exception v6

    .line 187
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v6}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 189
    :goto_5
    return-object v5
.end method

.method public static getStringEncoder()Lorg/jivesoftware/smack/util/stringencoder/StringEncoder;
    .locals 1

    .line 57
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base32;->base32Stringencoder:Lorg/jivesoftware/smack/util/stringencoder/StringEncoder;

    return-object v0
.end method

.method private static lenToPadding(I)I
    .locals 1

    .line 193
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 195
    :pswitch_0
    const/4 v0, 0x6

    return v0

    .line 197
    :pswitch_1
    const/4 v0, 0x4

    return v0

    .line 199
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 201
    :pswitch_3
    const/4 v0, 0x1

    return v0

    .line 203
    :pswitch_4
    const/4 v0, 0x0

    return v0

    .line 205
    :goto_0
    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static paddingToLen(I)I
    .locals 1

    .line 210
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 212
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 214
    :pswitch_1
    const/4 v0, 0x2

    return v0

    .line 216
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 218
    :pswitch_3
    const/4 v0, 0x4

    return v0

    .line 220
    :pswitch_4
    const/4 v0, 0x5

    return v0

    .line 222
    :goto_0
    :pswitch_5
    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method
