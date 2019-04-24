.class public final Lo/qt;
.super Lo/qs;
.source "SourceFile"


# instance fields
.field private c:Lo/qr;


# direct methods
.method public constructor <init>(Lo/om;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/qs;-><init>(Lo/om;)V

    .line 54
    return-void
.end method

.method private static c(III)I
    .locals 1

    .line 134
    if-ge p0, p1, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    if-le p0, p2, :cond_1

    move v0, p2

    goto :goto_0

    :cond_1
    move v0, p0

    :goto_0
    return v0
.end method

.method private static d([BIIIILo/qr;)V
    .locals 5

    .line 146
    const/4 v2, 0x0

    mul-int v0, p2, p4

    add-int v3, v0, p1

    :goto_0
    const/16 v0, 0x8

    if-ge v2, v0, :cond_2

    .line 147
    const/4 v4, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v4, v0, :cond_1

    .line 149
    add-int v0, v3, v4

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    if-gt v0, p3, :cond_0

    .line 150
    add-int v0, p1, v4

    add-int v1, p2, v2

    invoke-virtual {p5, v0, v1}, Lo/qr;->a(II)V

    .line 147
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 146
    :cond_1
    add-int/lit8 v2, v2, 0x1

    add-int/2addr v3, p4

    goto :goto_0

    .line 154
    :cond_2
    return-void
.end method

.method private static d([BIIII[[ILo/qr;)V
    .locals 17

    .line 108
    const/4 v6, 0x0

    :goto_0
    move/from16 v0, p2

    if-ge v6, v0, :cond_4

    .line 109
    shl-int/lit8 v7, v6, 0x3

    .line 110
    add-int/lit8 v8, p4, -0x8

    .line 111
    if-le v7, v8, :cond_0

    .line 112
    move v7, v8

    .line 114
    :cond_0
    const/4 v9, 0x0

    :goto_1
    move/from16 v0, p1

    if-ge v9, v0, :cond_3

    .line 115
    shl-int/lit8 v10, v9, 0x3

    .line 116
    add-int/lit8 v11, p3, -0x8

    .line 117
    if-le v10, v11, :cond_1

    .line 118
    move v10, v11

    .line 120
    :cond_1
    add-int/lit8 v0, p1, -0x3

    const/4 v1, 0x2

    invoke-static {v9, v1, v0}, Lo/qt;->c(III)I

    move-result v12

    .line 121
    add-int/lit8 v0, p2, -0x3

    const/4 v1, 0x2

    invoke-static {v6, v1, v0}, Lo/qt;->c(III)I

    move-result v13

    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, -0x2

    :goto_2
    const/4 v0, 0x2

    if-gt v15, v0, :cond_2

    .line 124
    add-int v0, v13, v15

    aget-object v16, p5, v0

    .line 125
    add-int/lit8 v0, v12, -0x2

    aget v0, v16, v0

    add-int/lit8 v1, v12, -0x1

    aget v1, v16, v1

    add-int/2addr v0, v1

    aget v1, v16, v12

    add-int/2addr v0, v1

    add-int/lit8 v1, v12, 0x1

    aget v1, v16, v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v12, 0x2

    aget v1, v16, v1

    add-int/2addr v0, v1

    add-int/2addr v14, v0

    .line 123
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 127
    :cond_2
    div-int/lit8 v15, v14, 0x19

    .line 128
    move-object/from16 v0, p0

    move v1, v10

    move v2, v7

    move v3, v15

    move/from16 v4, p3

    move-object/from16 v5, p6

    invoke-static/range {v0 .. v5}, Lo/qt;->d([BIIIILo/qr;)V

    .line 114
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 108
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 131
    :cond_4
    return-void
.end method

.method private static d([BIIII)[[I
    .locals 18

    .line 166
    move/from16 v0, p2

    move/from16 v1, p1

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    .line 167
    const/4 v5, 0x0

    :goto_0
    move/from16 v0, p2

    if-ge v5, v0, :cond_a

    .line 168
    shl-int/lit8 v6, v5, 0x3

    .line 169
    add-int/lit8 v7, p4, -0x8

    .line 170
    if-le v6, v7, :cond_0

    .line 171
    move v6, v7

    .line 173
    :cond_0
    const/4 v8, 0x0

    :goto_1
    move/from16 v0, p1

    if-ge v8, v0, :cond_9

    .line 174
    shl-int/lit8 v9, v8, 0x3

    .line 175
    add-int/lit8 v10, p3, -0x8

    .line 176
    if-le v9, v10, :cond_1

    .line 177
    move v9, v10

    .line 179
    :cond_1
    const/4 v11, 0x0

    .line 180
    const/16 v12, 0xff

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    mul-int v0, v6, p3

    add-int v15, v0, v9

    :goto_2
    const/16 v0, 0x8

    if-ge v14, v0, :cond_7

    .line 183
    const/16 v16, 0x0

    :goto_3
    move/from16 v0, v16

    const/16 v1, 0x8

    if-ge v0, v1, :cond_4

    .line 184
    add-int v0, v15, v16

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v17, v1

    .line 185
    add-int v11, v11, v17

    .line 187
    move/from16 v0, v17

    if-ge v0, v12, :cond_2

    .line 188
    move/from16 v12, v17

    .line 190
    :cond_2
    move/from16 v0, v17

    if-le v0, v13, :cond_3

    .line 191
    move/from16 v13, v17

    .line 183
    :cond_3
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 195
    :cond_4
    sub-int v0, v13, v12

    const/16 v1, 0x18

    if-le v0, v1, :cond_6

    .line 197
    add-int/lit8 v14, v14, 0x1

    add-int v15, v15, p3

    :goto_4
    const/16 v0, 0x8

    if-ge v14, v0, :cond_6

    .line 198
    const/16 v16, 0x0

    :goto_5
    move/from16 v0, v16

    const/16 v1, 0x8

    if-ge v0, v1, :cond_5

    .line 199
    add-int v0, v15, v16

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    add-int/2addr v11, v0

    .line 198
    add-int/lit8 v16, v16, 0x1

    goto :goto_5

    .line 197
    :cond_5
    add-int/lit8 v14, v14, 0x1

    add-int v15, v15, p3

    goto :goto_4

    .line 182
    :cond_6
    add-int/lit8 v14, v14, 0x1

    add-int v15, v15, p3

    goto/16 :goto_2

    .line 206
    :cond_7
    shr-int/lit8 v14, v11, 0x6

    .line 207
    sub-int v0, v13, v12

    const/16 v1, 0x18

    if-gt v0, v1, :cond_8

    .line 214
    div-int/lit8 v14, v12, 0x2

    .line 216
    if-lez v5, :cond_8

    if-lez v8, :cond_8

    .line 224
    add-int/lit8 v0, v5, -0x1

    aget-object v0, v4, v0

    aget v0, v0, v8

    aget-object v1, v4, v5

    add-int/lit8 v2, v8, -0x1

    aget v1, v1, v2

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    add-int/lit8 v1, v5, -0x1

    aget-object v1, v4, v1

    add-int/lit8 v2, v8, -0x1

    aget v1, v1, v2

    add-int/2addr v0, v1

    div-int/lit8 v15, v0, 0x4

    .line 226
    if-ge v12, v15, :cond_8

    .line 227
    move v14, v15

    .line 231
    :cond_8
    aget-object v0, v4, v5

    aput v14, v0, v8

    .line 173
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 167
    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 234
    :cond_a
    return-object v4
.end method


# virtual methods
.method public b()Lo/qr;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/qt;->c:Lo/qr;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/qt;->c:Lo/qr;

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {p0}, Lo/qt;->a()Lo/om;

    move-result-object v7

    .line 67
    invoke-virtual {v7}, Lo/om;->getWidth()I

    move-result v8

    .line 68
    invoke-virtual {v7}, Lo/om;->getHeight()I

    move-result v9

    .line 69
    const/16 v0, 0x28

    if-lt v8, v0, :cond_3

    const/16 v0, 0x28

    if-lt v9, v0, :cond_3

    .line 70
    invoke-virtual {v7}, Lo/om;->getMatrix()[B

    move-result-object v10

    .line 71
    shr-int/lit8 v11, v8, 0x3

    .line 72
    and-int/lit8 v0, v8, 0x7

    if-eqz v0, :cond_1

    .line 73
    add-int/lit8 v11, v11, 0x1

    .line 75
    :cond_1
    shr-int/lit8 v12, v9, 0x3

    .line 76
    and-int/lit8 v0, v9, 0x7

    if-eqz v0, :cond_2

    .line 77
    add-int/lit8 v12, v12, 0x1

    .line 79
    :cond_2
    invoke-static {v10, v11, v12, v8, v9}, Lo/qt;->d([BIIII)[[I

    move-result-object v13

    .line 81
    new-instance v14, Lo/qr;

    invoke-direct {v14, v8, v9}, Lo/qr;-><init>(II)V

    .line 82
    move-object v0, v10

    move v1, v11

    move v2, v12

    move v3, v8

    move v4, v9

    move-object v5, v13

    move-object v6, v14

    invoke-static/range {v0 .. v6}, Lo/qt;->d([BIIII[[ILo/qr;)V

    .line 83
    iput-object v14, p0, Lo/qt;->c:Lo/qr;

    .line 84
    goto :goto_0

    .line 86
    :cond_3
    invoke-super {p0}, Lo/qs;->b()Lo/qr;

    move-result-object v0

    iput-object v0, p0, Lo/qt;->c:Lo/qr;

    .line 88
    :goto_0
    iget-object v0, p0, Lo/qt;->c:Lo/qr;

    return-object v0
.end method

.method public d(Lo/om;)Lo/ob;
    .locals 1

    .line 93
    new-instance v0, Lo/qt;

    invoke-direct {v0, p1}, Lo/qt;-><init>(Lo/om;)V

    return-object v0
.end method
