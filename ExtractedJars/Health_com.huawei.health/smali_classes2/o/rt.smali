.class public final Lo/rt;
.super Lo/rw;
.source "SourceFile"


# static fields
.field static final a:[I

.field private static final c:I

.field private static final d:[C


# instance fields
.field private final b:Z

.field private final e:Z

.field private final i:Ljava/lang/StringBuilder;

.field private final k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lo/rt;->d:[C

    .line 47
    const/16 v0, 0x2c

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/rt;->a:[I

    .line 55
    sget-object v0, Lo/rt;->a:[I

    const/16 v1, 0x27

    aget v0, v0, v1

    sput v0, Lo/rt;->c:I

    return-void

    :array_0
    .array-data 4
        0x34
        0x121
        0x61
        0x160
        0x31
        0x130
        0x70
        0x25
        0x124
        0x64
        0x109
        0x49
        0x148
        0x19
        0x118
        0x58
        0xd
        0x10c
        0x4c
        0x1c
        0x103
        0x43
        0x142
        0x13
        0x112
        0x52
        0x7
        0x106
        0x46
        0x16
        0x181
        0xc1
        0x1c0
        0x91
        0x190
        0xd0
        0x85
        0x184
        0xc4
        0x94
        0xa8
        0xa2
        0x8a
        0x2a
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/rt;-><init>(Z)V

    .line 68
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 78
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/rt;-><init>(ZZ)V

    .line 79
    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 2

    .line 91
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 92
    iput-boolean p1, p0, Lo/rt;->e:Z

    .line 93
    iput-boolean p2, p0, Lo/rt;->b:Z

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lo/rt;->i:Ljava/lang/StringBuilder;

    .line 95
    const/16 v0, 0x9

    new-array v0, v0, [I

    iput-object v0, p0, Lo/rt;->k:[I

    .line 96
    return-void
.end method

.method private static c(I)C
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 259
    const/4 v1, 0x0

    :goto_0
    sget-object v0, Lo/rt;->a:[I

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 260
    sget-object v0, Lo/rt;->a:[I

    aget v0, v0, v1

    if-ne v0, p0, :cond_0

    .line 261
    sget-object v0, Lo/rt;->d:[C

    aget-char v0, v0, v1

    return v0

    .line 259
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 264
    :cond_1
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private static d([I)I
    .locals 10

    .line 216
    array-length v2, p0

    .line 217
    const/4 v3, 0x0

    .line 220
    :cond_0
    const v5, 0x7fffffff

    .line 221
    move-object v6, p0

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget v9, v6, v8

    .line 222
    if-ge v9, v5, :cond_1

    if-le v9, v3, :cond_1

    .line 223
    move v5, v9

    .line 221
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 226
    :cond_2
    move v3, v5

    .line 227
    const/4 v4, 0x0

    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v2, :cond_4

    .line 231
    aget v9, p0, v8

    .line 232
    if-le v9, v3, :cond_3

    .line 233
    add-int/lit8 v0, v2, -0x1

    sub-int/2addr v0, v8

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v7, v0

    .line 234
    add-int/lit8 v4, v4, 0x1

    .line 235
    add-int/2addr v6, v9

    .line 230
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 238
    :cond_4
    const/4 v0, 0x3

    if-ne v4, v0, :cond_7

    .line 242
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v2, :cond_6

    if-lez v4, :cond_6

    .line 243
    aget v9, p0, v8

    .line 244
    if-le v9, v3, :cond_5

    .line 245
    add-int/lit8 v4, v4, -0x1

    .line 247
    mul-int/lit8 v0, v9, 0x2

    if-lt v0, v6, :cond_5

    .line 248
    const/4 v0, -0x1

    return v0

    .line 242
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 252
    :cond_6
    return v7

    .line 254
    :cond_7
    const/4 v0, 0x3

    if-gt v4, v0, :cond_0

    .line 255
    const/4 v0, -0x1

    return v0
.end method

.method private static d(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 268
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 270
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_8

    .line 271
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 272
    const/16 v0, 0x2b

    if-eq v4, v0, :cond_0

    const/16 v0, 0x24

    if-eq v4, v0, :cond_0

    const/16 v0, 0x25

    if-eq v4, v0, :cond_0

    const/16 v0, 0x2f

    if-ne v4, v0, :cond_7

    .line 273
    :cond_0
    add-int/lit8 v0, v3, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 274
    const/4 v6, 0x0

    .line 275
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 278
    :sswitch_0
    const/16 v0, 0x41

    if-lt v5, v0, :cond_1

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_1

    .line 279
    add-int/lit8 v0, v5, 0x20

    int-to-char v6, v0

    goto/16 :goto_1

    .line 281
    :cond_1
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 286
    :sswitch_1
    const/16 v0, 0x41

    if-lt v5, v0, :cond_2

    const/16 v0, 0x5a

    if-gt v5, v0, :cond_2

    .line 287
    add-int/lit8 v0, v5, -0x40

    int-to-char v6, v0

    goto :goto_1

    .line 289
    :cond_2
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 294
    :sswitch_2
    const/16 v0, 0x41

    if-lt v5, v0, :cond_3

    const/16 v0, 0x45

    if-gt v5, v0, :cond_3

    .line 295
    add-int/lit8 v0, v5, -0x26

    int-to-char v6, v0

    goto :goto_1

    .line 296
    :cond_3
    const/16 v0, 0x46

    if-lt v5, v0, :cond_4

    const/16 v0, 0x57

    if-gt v5, v0, :cond_4

    .line 297
    add-int/lit8 v0, v5, -0xb

    int-to-char v6, v0

    goto :goto_1

    .line 299
    :cond_4
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 304
    :sswitch_3
    const/16 v0, 0x41

    if-lt v5, v0, :cond_5

    const/16 v0, 0x4f

    if-gt v5, v0, :cond_5

    .line 305
    add-int/lit8 v0, v5, -0x20

    int-to-char v6, v0

    goto :goto_1

    .line 306
    :cond_5
    const/16 v0, 0x5a

    if-ne v5, v0, :cond_6

    .line 307
    const/16 v6, 0x3a

    goto :goto_1

    .line 309
    :cond_6
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 313
    :goto_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    add-int/lit8 v3, v3, 0x1

    .line 316
    goto :goto_2

    .line 317
    :cond_7
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 320
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x24 -> :sswitch_1
        0x25 -> :sswitch_2
        0x2b -> :sswitch_0
        0x2f -> :sswitch_3
    .end sparse-switch
.end method

.method private static e(Lo/qm;[I)[I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 180
    invoke-virtual {p0}, Lo/qm;->d()I

    move-result v3

    .line 181
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/qm;->a(I)I

    move-result v4

    .line 183
    const/4 v5, 0x0

    .line 184
    move v6, v4

    .line 185
    const/4 v7, 0x0

    .line 186
    array-length v8, p1

    .line 188
    move v9, v4

    :goto_0
    if-ge v9, v3, :cond_4

    .line 189
    invoke-virtual {p0, v9}, Lo/qm;->d(I)Z

    move-result v0

    xor-int/2addr v0, v7

    if-eqz v0, :cond_0

    .line 190
    aget v0, p1, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, v5

    goto :goto_2

    .line 192
    :cond_0
    add-int/lit8 v0, v8, -0x1

    if-ne v5, v0, :cond_2

    .line 194
    invoke-static {p1}, Lo/rt;->d([I)I

    move-result v0

    sget v1, Lo/rt;->c:I

    if-ne v0, v1, :cond_1

    sub-int v0, v9, v6

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v6, v0

    .line 195
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v6, v1}, Lo/qm;->a(IIZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v6, v0, v1

    const/4 v1, 0x1

    aput v9, v0, v1

    return-object v0

    .line 198
    :cond_1
    const/4 v0, 0x0

    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    add-int/2addr v0, v1

    add-int/2addr v6, v0

    .line 199
    add-int/lit8 v0, v8, -0x2

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 200
    add-int/lit8 v0, v8, -0x2

    const/4 v1, 0x0

    aput v1, p1, v0

    .line 201
    add-int/lit8 v0, v8, -0x1

    const/4 v1, 0x0

    aput v1, p1, v0

    .line 202
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 204
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 206
    :goto_1
    const/4 v0, 0x1

    aput v0, p1, v5

    .line 207
    if-nez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 188
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 210
    :cond_4
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 17
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

    .line 102
    move-object/from16 v0, p0

    iget-object v5, v0, Lo/rt;->k:[I

    .line 103
    const/4 v0, 0x0

    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([II)V

    .line 104
    move-object/from16 v0, p0

    iget-object v6, v0, Lo/rt;->i:Ljava/lang/StringBuilder;

    .line 105
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 107
    move-object/from16 v0, p2

    invoke-static {v0, v5}, Lo/rt;->e(Lo/qm;[I)[I

    move-result-object v7

    .line 109
    const/4 v0, 0x1

    aget v0, v7, v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lo/qm;->a(I)I

    move-result v8

    .line 110
    invoke-virtual/range {p2 .. p2}, Lo/qm;->d()I

    move-result v9

    .line 115
    :cond_0
    move-object/from16 v0, p2

    invoke-static {v0, v8, v5}, Lo/rt;->c(Lo/qm;I[I)V

    .line 116
    invoke-static {v5}, Lo/rt;->d([I)I

    move-result v12

    .line 117
    if-gez v12, :cond_1

    .line 118
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 120
    :cond_1
    invoke-static {v12}, Lo/rt;->c(I)C

    move-result v10

    .line 121
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 122
    move v11, v8

    .line 123
    move-object v13, v5

    array-length v14, v13

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_2

    aget v16, v13, v15

    .line 124
    add-int v8, v8, v16

    .line 123
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 127
    :cond_2
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lo/qm;->a(I)I

    move-result v8

    .line 128
    const/16 v0, 0x2a

    if-ne v10, v0, :cond_0

    .line 129
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 132
    const/4 v12, 0x0

    .line 133
    move-object v13, v5

    array-length v14, v13

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_3

    aget v16, v13, v15

    .line 134
    add-int v12, v12, v16

    .line 133
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 136
    :cond_3
    sub-int v0, v8, v11

    sub-int v13, v0, v12

    .line 139
    if-eq v8, v9, :cond_4

    mul-int/lit8 v0, v13, 0x2

    if-ge v0, v12, :cond_4

    .line 140
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 143
    :cond_4
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/rt;->e:Z

    if-eqz v0, :cond_7

    .line 144
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v14, v0, -0x1

    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x0

    :goto_2
    move/from16 v0, v16

    if-ge v0, v14, :cond_5

    .line 147
    const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%"

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/rt;->i:Ljava/lang/StringBuilder;

    move/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v15, v0

    .line 146
    add-int/lit8 v16, v16, 0x1

    goto :goto_2

    .line 149
    :cond_5
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    sget-object v1, Lo/rt;->d:[C

    rem-int/lit8 v2, v15, 0x2b

    aget-char v1, v1, v2

    if-eq v0, v1, :cond_6

    .line 150
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 152
    :cond_6
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 155
    :cond_7
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_8

    .line 157
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 161
    :cond_8
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/rt;->b:Z

    if-eqz v0, :cond_9

    .line 162
    invoke-static {v6}, Lo/rt;->d(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    goto :goto_3

    .line 164
    :cond_9
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 167
    :goto_3
    const/4 v0, 0x1

    aget v0, v7, v0

    const/4 v1, 0x0

    aget v1, v7, v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v15, v0, v1

    .line 168
    int-to-float v0, v11

    int-to-float v1, v12

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v16, v0, v1

    .line 169
    new-instance v0, Lo/or;

    const/4 v1, 0x2

    new-array v1, v1, [Lo/ou;

    new-instance v2, Lo/ou;

    move/from16 v3, p1

    int-to-float v3, v3

    invoke-direct {v2, v15, v3}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lo/ou;

    move/from16 v3, p1

    int-to-float v3, v3

    move/from16 v4, v16

    invoke-direct {v2, v4, v3}, Lo/ou;-><init>(FF)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/od;->d:Lo/od;

    const/4 v3, 0x0

    invoke-direct {v0, v14, v3, v1, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    return-object v0
.end method
