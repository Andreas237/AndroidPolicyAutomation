.class public final Lcom/huawei/wallet/utils/crypto/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[B

.field private static final e:[C


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 31
    const/16 v0, 0x40

    new-array v0, v0, [C

    sput-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    .line 45
    const/16 v0, 0x80

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    .line 49
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x80

    if-ge v3, v0, :cond_0

    .line 51
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    const/4 v1, -0x1

    aput-byte v1, v0, v3

    .line 49
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 53
    :cond_0
    const/16 v3, 0x5a

    :goto_1
    const/16 v0, 0x41

    if-lt v3, v0, :cond_1

    .line 55
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    add-int/lit8 v1, v3, -0x41

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 53
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    .line 57
    :cond_1
    const/16 v3, 0x7a

    :goto_2
    const/16 v0, 0x61

    if-lt v3, v0, :cond_2

    .line 59
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    add-int/lit8 v1, v3, -0x61

    add-int/lit8 v1, v1, 0x1a

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 57
    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 62
    :cond_2
    const/16 v3, 0x39

    :goto_3
    const/16 v0, 0x30

    if-lt v3, v0, :cond_3

    .line 64
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    add-int/lit8 v1, v3, -0x30

    add-int/lit8 v1, v1, 0x34

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 62
    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 67
    :cond_3
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    const/16 v1, 0x3e

    const/16 v2, 0x2b

    aput-byte v1, v0, v2

    .line 68
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    const/16 v1, 0x3f

    const/16 v2, 0x2f

    aput-byte v1, v0, v2

    .line 70
    const/4 v3, 0x0

    :goto_4
    const/16 v0, 0x19

    if-gt v3, v0, :cond_4

    .line 72
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    add-int/lit8 v1, v3, 0x41

    int-to-char v1, v1

    aput-char v1, v0, v3

    .line 70
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 75
    :cond_4
    const/16 v3, 0x1a

    const/4 v4, 0x0

    :goto_5
    const/16 v0, 0x33

    if-gt v3, v0, :cond_5

    .line 77
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    add-int/lit8 v1, v4, 0x61

    int-to-char v1, v1

    aput-char v1, v0, v3

    .line 75
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 80
    :cond_5
    const/16 v3, 0x34

    const/4 v4, 0x0

    :goto_6
    const/16 v0, 0x3d

    if-gt v3, v0, :cond_6

    .line 82
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    add-int/lit8 v1, v4, 0x30

    int-to-char v1, v1

    aput-char v1, v0, v3

    .line 80
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 84
    :cond_6
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    const/16 v1, 0x2b

    const/16 v2, 0x3e

    aput-char v1, v0, v2

    .line 85
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->e:[C

    const/16 v1, 0x2f

    const/16 v2, 0x3f

    aput-char v1, v0, v2

    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c([C)I
    .locals 5

    .line 242
    const-string v0, "Base64"

    const-string v1, "enter removeWhiteSpace"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    if-nez p0, :cond_0

    .line 245
    const-string v0, "Base64"

    const-string v1, "judge data is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    const/4 v0, 0x0

    return v0

    .line 250
    :cond_0
    const/4 v2, 0x0

    .line 251
    array-length v3, p0

    .line 252
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 254
    aget-char v0, p0, v4

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->c(C)Z

    move-result v0

    if-nez v0, :cond_1

    .line 256
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-char v1, p0, v4

    aput-char v1, p0, v0

    .line 252
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 259
    :cond_2
    const-string v0, "Base64"

    const-string v1, "exit removeWhiteSpace"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    return v2
.end method

.method private static c(C)Z
    .locals 2

    .line 230
    const-string v0, "Base64"

    const-string v1, "enter isWhiteSpace"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    const/16 v0, 0x20

    if-eq p0, v0, :cond_0

    const/16 v0, 0xd

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa

    if-eq p0, v0, :cond_0

    const/16 v0, 0x9

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Ljava/lang/String;)[B
    .locals 23

    .line 100
    const-string v0, "Base64"

    const-string v1, "enter decode"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    if-nez p0, :cond_0

    .line 103
    const-string v0, "Base64"

    const-string v1, "encoded == null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 107
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 109
    invoke-static {v4}, Lcom/huawei/wallet/utils/crypto/Base64;->c([C)I

    move-result v5

    .line 111
    rem-int/lit8 v0, v5, 0x4

    if-eqz v0, :cond_1

    .line 113
    const-string v0, "Base64"

    const-string v1, "len ramainder FOUR_BYTE not zero"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 117
    :cond_1
    div-int/lit8 v6, v5, 0x4

    .line 119
    if-nez v6, :cond_2

    .line 121
    const-string v0, "Base64"

    const-string v1, "numberQuadruple is zero"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 125
    :cond_2
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 129
    const/16 v16, 0x0

    .line 130
    const/16 v17, 0x0

    .line 131
    const/16 v18, 0x0

    .line 132
    mul-int/lit8 v0, v6, 0x3

    new-array v7, v0, [B

    .line 134
    const/16 v19, 0x0

    .line 135
    const-string v0, "Base64"

    const-string v1, "next again Loop,size numberQuadruple"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    :goto_0
    add-int/lit8 v0, v6, -0x1

    move/from16 v1, v16

    if-ge v1, v0, :cond_6

    .line 138
    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v12, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-eqz v0, :cond_3

    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v13, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-eqz v0, :cond_3

    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v14, v0

    .line 139
    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-eqz v0, :cond_3

    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v15, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/16 v19, 0x1

    goto :goto_1

    :cond_4
    const/16 v19, 0x0

    .line 140
    :goto_1
    if-eqz v19, :cond_5

    .line 142
    const-string v0, "Base64"

    const-string v1, "judge condition"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 146
    :cond_5
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v8, v0, v12

    .line 147
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v9, v0, v13

    .line 148
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v10, v0, v14

    .line 149
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v11, v0, v15

    .line 151
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    shl-int/lit8 v1, v8, 0x2

    shr-int/lit8 v2, v9, 0x4

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 152
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    and-int/lit8 v1, v9, 0xf

    shl-int/lit8 v1, v1, 0x4

    shr-int/lit8 v2, v10, 0x2

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 153
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    shl-int/lit8 v1, v10, 0x6

    or-int/2addr v1, v11

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 136
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_0

    .line 155
    :cond_6
    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v12, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-eqz v0, :cond_7

    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v0, v4, v0

    move v13, v0

    invoke-static {v0}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    const/16 v19, 0x1

    goto :goto_2

    :cond_8
    const/16 v19, 0x0

    .line 156
    :goto_2
    if-eqz v19, :cond_9

    .line 158
    const-string v0, "Base64"

    const-string v1, "judge condition"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 162
    :cond_9
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v8, v0, v12

    .line 163
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v9, v0, v13

    .line 165
    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v14, v4, v0

    .line 166
    move/from16 v0, v18

    add-int/lit8 v18, v18, 0x1

    aget-char v15, v4, v0

    .line 167
    invoke-static {v14}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {v15}, Lcom/huawei/wallet/utils/crypto/Base64;->d(C)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    const/16 v19, 0x1

    goto :goto_3

    :cond_b
    const/16 v19, 0x0

    .line 169
    :goto_3
    if-eqz v19, :cond_12

    .line 171
    const-string v0, "Base64"

    const-string v1, "judge condition"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    invoke-static {v14}, Lcom/huawei/wallet/utils/crypto/Base64;->e(C)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {v15}, Lcom/huawei/wallet/utils/crypto/Base64;->e(C)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v20, 0x1

    goto :goto_4

    :cond_c
    const/16 v20, 0x0

    .line 173
    :goto_4
    invoke-static {v14}, Lcom/huawei/wallet/utils/crypto/Base64;->e(C)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {v15}, Lcom/huawei/wallet/utils/crypto/Base64;->e(C)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v21, 0x1

    goto :goto_5

    :cond_d
    const/16 v21, 0x0

    .line 174
    :goto_5
    if-eqz v20, :cond_f

    .line 176
    const-string v0, "Base64"

    const-string v1, "judge isPad3And4"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    and-int/lit8 v0, v9, 0xf

    if-eqz v0, :cond_e

    .line 179
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 181
    :cond_e
    mul-int/lit8 v0, v16, 0x3

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [B

    move-object/from16 v22, v1

    .line 182
    mul-int/lit8 v0, v16, 0x3

    const/4 v1, 0x0

    move-object/from16 v2, v22

    const/4 v3, 0x0

    invoke-static {v7, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 183
    shl-int/lit8 v0, v8, 0x2

    shr-int/lit8 v1, v9, 0x4

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v22, v17

    .line 184
    return-object v22

    .line 186
    :cond_f
    if-eqz v21, :cond_11

    .line 188
    const-string v0, "Base64"

    const-string v1, "judge isPad3And4"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v10, v0, v14

    .line 190
    and-int/lit8 v0, v10, 0x3

    if-eqz v0, :cond_10

    .line 192
    const-string v0, "Base64"

    const-string v1, "judge else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 195
    :cond_10
    mul-int/lit8 v0, v16, 0x3

    add-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    move-object/from16 v22, v1

    .line 196
    mul-int/lit8 v0, v16, 0x3

    const/4 v1, 0x0

    move-object/from16 v2, v22

    const/4 v3, 0x0

    invoke-static {v7, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 197
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    shl-int/lit8 v1, v8, 0x2

    shr-int/lit8 v2, v9, 0x4

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v22, v0

    .line 198
    and-int/lit8 v0, v9, 0xf

    shl-int/lit8 v0, v0, 0x4

    shr-int/lit8 v1, v10, 0x2

    and-int/lit8 v1, v1, 0xf

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v22, v17

    .line 199
    return-object v22

    .line 203
    :cond_11
    const-string v0, "Base64"

    const-string v1, "judge else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 209
    :cond_12
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v10, v0, v14

    .line 210
    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v11, v0, v15

    .line 211
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    shl-int/lit8 v1, v8, 0x2

    shr-int/lit8 v2, v9, 0x4

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 212
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    and-int/lit8 v1, v9, 0xf

    shl-int/lit8 v1, v1, 0x4

    shr-int/lit8 v2, v10, 0x2

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 213
    move/from16 v0, v17

    add-int/lit8 v17, v17, 0x1

    shl-int/lit8 v1, v10, 0x6

    or-int/2addr v1, v11

    int-to-byte v1, v1

    aput-byte v1, v7, v0

    .line 216
    const-string v0, "Base64"

    const-string v1, "exit encode"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    return-object v7
.end method

.method private static d(C)Z
    .locals 2

    .line 223
    const-string v0, "Base64"

    const-string v1, "enter isBooleanData"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    const/16 v0, 0x80

    if-ge p0, v0, :cond_0

    sget-object v0, Lcom/huawei/wallet/utils/crypto/Base64;->d:[B

    aget-byte v0, v0, p0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static e(C)Z
    .locals 2

    .line 265
    const-string v0, "Base64"

    const-string v1, "enter isPad"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    const/16 v0, 0x3d

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
