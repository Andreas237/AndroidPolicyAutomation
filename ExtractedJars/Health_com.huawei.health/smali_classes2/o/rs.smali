.class public final Lo/rs;
.super Lo/rw;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final d:[C

.field private static final e:[I


# instance fields
.field private final b:Ljava/lang/StringBuilder;

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 41
    const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lo/rs;->d:[C

    .line 47
    const/16 v0, 0x30

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/rs;->e:[I

    .line 55
    sget-object v0, Lo/rs;->e:[I

    const/16 v1, 0x2f

    aget v0, v0, v1

    sput v0, Lo/rs;->a:I

    return-void

    :array_0
    .array-data 4
        0x114
        0x148
        0x144
        0x142
        0x128
        0x124
        0x122
        0x150
        0x112
        0x10a
        0x1a8
        0x1a4
        0x1a2
        0x194
        0x192
        0x18a
        0x168
        0x164
        0x162
        0x134
        0x11a
        0x158
        0x14c
        0x146
        0x12c
        0x116
        0x1b4
        0x1b2
        0x1ac
        0x1a6
        0x196
        0x19a
        0x16c
        0x166
        0x136
        0x13a
        0x12e
        0x1d4
        0x1d2
        0x1ca
        0x16e
        0x176
        0x1ae
        0x126
        0x1da
        0x1d6
        0x132
        0x15e
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 60
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lo/rs;->b:Ljava/lang/StringBuilder;

    .line 62
    const/4 v0, 0x6

    new-array v0, v0, [I

    iput-object v0, p0, Lo/rs;->c:[I

    .line 63
    return-void
.end method

.method private a(Lo/qm;)[I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 132
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 133
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/qm;->a(I)I

    move-result v4

    .line 135
    iget-object v0, p0, Lo/rs;->c:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 136
    iget-object v5, p0, Lo/rs;->c:[I

    .line 137
    move v6, v4

    .line 138
    const/4 v7, 0x0

    .line 139
    array-length v8, v5

    .line 141
    const/4 v9, 0x0

    .line 142
    move v10, v4

    :goto_0
    if-ge v10, v3, :cond_4

    .line 143
    invoke-virtual {p1, v10}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v7

    if-eqz v0, :cond_0

    .line 144
    aget v0, v5, v9

    add-int/lit8 v0, v0, 0x1

    aput v0, v5, v9

    goto :goto_2

    .line 146
    :cond_0
    add-int/lit8 v0, v8, -0x1

    if-ne v9, v0, :cond_2

    .line 147
    invoke-static {v5}, Lo/rs;->e([I)I

    move-result v0

    sget v1, Lo/rs;->a:I

    if-ne v0, v1, :cond_1

    .line 148
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v6, v0, v1

    const/4 v1, 0x1

    aput v10, v0, v1

    return-object v0

    .line 150
    :cond_1
    const/4 v0, 0x0

    aget v0, v5, v0

    const/4 v1, 0x1

    aget v1, v5, v1

    add-int/2addr v0, v1

    add-int/2addr v6, v0

    .line 151
    add-int/lit8 v0, v8, -0x2

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v5, v1, v5, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    add-int/lit8 v0, v8, -0x2

    const/4 v1, 0x0

    aput v1, v5, v0

    .line 153
    add-int/lit8 v0, v8, -0x1

    const/4 v1, 0x0

    aput v1, v5, v0

    .line 154
    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    .line 156
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 158
    :goto_1
    const/4 v0, 0x1

    aput v0, v5, v9

    .line 159
    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 142
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 162
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static c(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 198
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 199
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 200
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_b

    .line 201
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 202
    const/16 v0, 0x61

    if-lt v4, v0, :cond_a

    const/16 v0, 0x64

    if-gt v4, v0, :cond_a

    .line 203
    add-int/lit8 v0, v1, -0x1

    if-lt v3, v0, :cond_0

    .line 204
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 206
    :cond_0
    add-int/lit8 v0, v3, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 207
    const/4 v6, 0x0

    .line 208
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 211
    :pswitch_0
    const/16 v0, 0x41

    if-lt v5, v0, :cond_1

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_1

    .line 212
    add-int/lit8 v0, v5, 0x20

    int-to-char v6, v0

    goto/16 :goto_1

    .line 214
    :cond_1
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 219
    :pswitch_1
    const/16 v0, 0x41

    if-lt v5, v0, :cond_2

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_2

    .line 220
    add-int/lit8 v0, v5, -0x40

    int-to-char v6, v0

    goto/16 :goto_1

    .line 222
    :cond_2
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 226
    :pswitch_2
    const/16 v0, 0x41

    if-lt v5, v0, :cond_3

    const/16 v0, 0x45

    if-gt v5, v0, :cond_3

    .line 228
    add-int/lit8 v0, v5, -0x26

    int-to-char v6, v0

    goto/16 :goto_1

    .line 229
    :cond_3
    const/16 v0, 0x46

    if-lt v5, v0, :cond_4

    const/16 v0, 0x4a

    if-gt v5, v0, :cond_4

    .line 231
    add-int/lit8 v0, v5, -0xb

    int-to-char v6, v0

    goto :goto_1

    .line 232
    :cond_4
    const/16 v0, 0x4b

    if-lt v5, v0, :cond_5

    const/16 v0, 0x4f

    if-gt v5, v0, :cond_5

    .line 234
    add-int/lit8 v0, v5, 0x10

    int-to-char v6, v0

    goto :goto_1

    .line 235
    :cond_5
    const/16 v0, 0x50

    if-lt v5, v0, :cond_6

    const/16 v0, 0x53

    if-gt v5, v0, :cond_6

    .line 237
    add-int/lit8 v0, v5, 0x2b

    int-to-char v6, v0

    goto :goto_1

    .line 238
    :cond_6
    const/16 v0, 0x54

    if-lt v5, v0, :cond_7

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_7

    .line 240
    const/16 v6, 0x7f

    goto :goto_1

    .line 242
    :cond_7
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 247
    :pswitch_3
    const/16 v0, 0x41

    if-lt v5, v0, :cond_8

    const/16 v0, 0x4f

    if-gt v5, v0, :cond_8

    .line 248
    add-int/lit8 v0, v5, -0x20

    int-to-char v6, v0

    goto :goto_1

    .line 249
    :cond_8
    const/16 v0, 0x5a

    if-ne v5, v0, :cond_9

    .line 250
    const/16 v6, 0x3a

    goto :goto_1

    .line 252
    :cond_9
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 256
    :goto_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 258
    add-int/lit8 v3, v3, 0x1

    .line 259
    goto :goto_2

    .line 260
    :cond_a
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 200
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 263
    :cond_b
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private static e(I)C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 189
    const/4 v1, 0x0

    :goto_0
    sget-object v0, Lo/rs;->e:[I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 190
    sget-object v0, Lo/rs;->e:[I

    aget v0, v0, v1

    if-ne v0, p0, :cond_0

    .line 191
    sget-object v0, Lo/rs;->d:[C

    aget-char v0, v0, v1

    return v0

    .line 189
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 194
    :cond_1
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static e([I)I
    .locals 8

    .line 166
    array-length v2, p0

    .line 167
    const/4 v3, 0x0

    .line 168
    move-object v4, p0

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget v7, v4, v6

    .line 169
    add-int/2addr v3, v7

    .line 168
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 171
    :cond_0
    const/4 v4, 0x0

    .line 172
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    .line 173
    aget v0, p0, v5

    int-to-float v0, v0

    const/high16 v1, 0x41100000    # 9.0f

    mul-float/2addr v0, v1

    int-to-float v1, v3

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 174
    const/4 v0, 0x1

    if-lt v6, v0, :cond_1

    const/4 v0, 0x4

    if-le v6, v0, :cond_2

    .line 175
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 177
    :cond_2
    and-int/lit8 v0, v5, 0x1

    if-nez v0, :cond_4

    .line 178
    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_3

    .line 179
    shl-int/lit8 v0, v4, 0x1

    or-int/lit8 v4, v0, 0x1

    .line 178
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    goto :goto_3

    .line 182
    :cond_4
    shl-int/2addr v4, v6

    .line 172
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 185
    :cond_5
    return v4
.end method

.method private static e(Ljava/lang/CharSequence;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 267
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 268
    add-int/lit8 v0, v2, -0x2

    const/16 v1, 0x14

    invoke-static {p0, v0, v1}, Lo/rs;->e(Ljava/lang/CharSequence;II)V

    .line 269
    add-int/lit8 v0, v2, -0x1

    const/16 v1, 0xf

    invoke-static {p0, v0, v1}, Lo/rs;->e(Ljava/lang/CharSequence;II)V

    .line 270
    return-void
.end method

.method private static e(Ljava/lang/CharSequence;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 274
    const/4 v3, 0x1

    .line 275
    const/4 v4, 0x0

    .line 276
    add-int/lit8 v5, p1, -0x1

    :goto_0
    if-ltz v5, :cond_1

    .line 277
    const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*"

    invoke-interface {p0, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    mul-int/2addr v0, v3

    add-int/2addr v4, v0

    .line 278
    add-int/lit8 v3, v3, 0x1

    if-le v3, p2, :cond_0

    .line 279
    const/4 v3, 0x1

    .line 276
    :cond_0
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 282
    :cond_1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    sget-object v1, Lo/rs;->d:[C

    rem-int/lit8 v2, v4, 0x2f

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_2

    .line 283
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 285
    :cond_2
    return-void
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/oh;,
            Lo/of;
        }
    .end annotation

    .line 69
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/rs;->a(Lo/qm;)[I

    move-result-object v4

    .line 71
    const/4 v0, 0x1

    aget v0, v4, v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lo/qm;->a(I)I

    move-result v5

    .line 72
    invoke-virtual/range {p2 .. p2}, Lo/qm;->d()I

    move-result v6

    .line 74
    move-object/from16 v0, p0

    iget-object v7, v0, Lo/rs;->c:[I

    .line 75
    const/4 v0, 0x0

    invoke-static {v7, v0}, Ljava/util/Arrays;->fill([II)V

    .line 76
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/rs;->b:Ljava/lang/StringBuilder;

    .line 77
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 82
    :cond_0
    move-object/from16 v0, p2

    invoke-static {v0, v5, v7}, Lo/rs;->c(Lo/qm;I[I)V

    .line 83
    invoke-static {v7}, Lo/rs;->e([I)I

    move-result v11

    .line 84
    if-gez v11, :cond_1

    .line 85
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 87
    :cond_1
    invoke-static {v11}, Lo/rs;->e(I)C

    move-result v9

    .line 88
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    move v10, v5

    .line 90
    move-object v12, v7

    array-length v13, v12

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v13, :cond_2

    aget v15, v12, v14

    .line 91
    add-int/2addr v5, v15

    .line 90
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 94
    :cond_2
    move-object/from16 v0, p2

    invoke-virtual {v0, v5}, Lo/qm;->a(I)I

    move-result v5

    .line 95
    const/16 v0, 0x2a

    if-ne v9, v0, :cond_0

    .line 96
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 98
    const/4 v11, 0x0

    .line 99
    move-object v12, v7

    array-length v13, v12

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_3

    aget v15, v12, v14

    .line 100
    add-int/2addr v11, v15

    .line 99
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 104
    :cond_3
    if-eq v5, v6, :cond_4

    move-object/from16 v0, p2

    invoke-virtual {v0, v5}, Lo/qm;->d(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 105
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 108
    :cond_5
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_6

    .line 110
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 113
    :cond_6
    invoke-static {v8}, Lo/rs;->e(Ljava/lang/CharSequence;)V

    .line 115
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 117
    invoke-static {v8}, Lo/rs;->c(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    .line 119
    const/4 v0, 0x1

    aget v0, v4, v0

    const/4 v1, 0x0

    aget v1, v4, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v13, v0, v1

    .line 120
    int-to-float v0, v10

    int-to-float v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v14, v0, v1

    .line 121
    new-instance v0, Lo/or;

    const/4 v1, 0x2

    new-array v1, v1, [Lo/ou;

    new-instance v2, Lo/ou;

    move/from16 v3, p1

    int-to-float v3, v3

    invoke-direct {v2, v13, v3}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lo/ou;

    move/from16 v3, p1

    int-to-float v3, v3

    invoke-direct {v2, v14, v3}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->e:Lo/od;

    const/4 v3, 0x0

    invoke-direct {v0, v12, v3, v1, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0
.end method
