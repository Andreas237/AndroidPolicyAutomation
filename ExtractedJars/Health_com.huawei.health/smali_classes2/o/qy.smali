.class public final Lo/qy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;

.field private static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/qy;->c:Ljava/lang/String;

    .line 38
    const-string v0, "SJIS"

    sget-object v1, Lo/qy;->c:Ljava/lang/String;

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EUC_JP"

    sget-object v1, Lo/qy;->c:Ljava/lang/String;

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/qy;->d:Z

    .line 38
    return-void
.end method

.method public static e([BLjava/util/Map;)Ljava/lang/String;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BLjava/util/Map<Lo/og;*>;)Ljava/lang/String;"
        }
    .end annotation

    .line 52
    if-eqz p1, :cond_0

    .line 53
    sget-object v0, Lo/og;->e:Lo/og;

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 54
    if-eqz v2, :cond_0

    .line 55
    return-object v2

    .line 60
    :cond_0
    move-object/from16 v0, p0

    array-length v2, v0

    .line 61
    const/4 v3, 0x1

    .line 62
    const/4 v4, 0x1

    .line 63
    const/4 v5, 0x1

    .line 64
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    const/4 v14, 0x0

    .line 76
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 81
    move-object/from16 v0, p0

    array-length v0, v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, -0x11

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    aget-byte v0, p0, v0

    const/16 v1, -0x45

    if-ne v0, v1, :cond_1

    const/4 v0, 0x2

    aget-byte v0, p0, v0

    const/16 v1, -0x41

    if-ne v0, v1, :cond_1

    const/16 v17, 0x1

    goto :goto_0

    :cond_1
    const/16 v17, 0x0

    .line 86
    :goto_0
    const/16 v18, 0x0

    .line 87
    :goto_1
    move/from16 v0, v18

    if-ge v0, v2, :cond_15

    if-nez v3, :cond_2

    if-nez v4, :cond_2

    if-eqz v5, :cond_15

    .line 90
    :cond_2
    aget-byte v0, p0, v18

    and-int/lit16 v1, v0, 0xff

    move/from16 v19, v1

    .line 93
    if-eqz v5, :cond_9

    .line 94
    if-lez v6, :cond_4

    .line 95
    move/from16 v0, v19

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_3

    .line 96
    const/4 v5, 0x0

    goto :goto_2

    .line 98
    :cond_3
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 100
    :cond_4
    move/from16 v0, v19

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_9

    .line 101
    and-int/lit8 v0, v19, 0x40

    if-nez v0, :cond_5

    .line 102
    const/4 v5, 0x0

    goto :goto_2

    .line 104
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 105
    and-int/lit8 v0, v19, 0x20

    if-nez v0, :cond_6

    .line 106
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 108
    :cond_6
    add-int/lit8 v6, v6, 0x1

    .line 109
    and-int/lit8 v0, v19, 0x10

    if-nez v0, :cond_7

    .line 110
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 112
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 113
    and-int/lit8 v0, v19, 0x8

    if-nez v0, :cond_8

    .line 114
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 116
    :cond_8
    const/4 v5, 0x0

    .line 127
    :cond_9
    :goto_2
    if-eqz v3, :cond_c

    .line 128
    move/from16 v0, v19

    const/16 v1, 0x7f

    if-le v0, v1, :cond_a

    move/from16 v0, v19

    const/16 v1, 0xa0

    if-ge v0, v1, :cond_a

    .line 129
    const/4 v3, 0x0

    goto :goto_3

    .line 130
    :cond_a
    move/from16 v0, v19

    const/16 v1, 0x9f

    if-le v0, v1, :cond_c

    .line 131
    move/from16 v0, v19

    const/16 v1, 0xc0

    if-lt v0, v1, :cond_b

    move/from16 v0, v19

    const/16 v1, 0xd7

    if-eq v0, v1, :cond_b

    move/from16 v0, v19

    const/16 v1, 0xf7

    if-ne v0, v1, :cond_c

    .line 132
    :cond_b
    add-int/lit8 v16, v16, 0x1

    .line 142
    :cond_c
    :goto_3
    if-eqz v4, :cond_14

    .line 143
    if-lez v10, :cond_f

    .line 144
    move/from16 v0, v19

    const/16 v1, 0x40

    if-lt v0, v1, :cond_d

    move/from16 v0, v19

    const/16 v1, 0x7f

    if-eq v0, v1, :cond_d

    move/from16 v0, v19

    const/16 v1, 0xfc

    if-le v0, v1, :cond_e

    .line 145
    :cond_d
    const/4 v4, 0x0

    goto :goto_4

    .line 147
    :cond_e
    add-int/lit8 v10, v10, -0x1

    goto :goto_4

    .line 149
    :cond_f
    move/from16 v0, v19

    const/16 v1, 0x80

    if-eq v0, v1, :cond_10

    move/from16 v0, v19

    const/16 v1, 0xa0

    if-eq v0, v1, :cond_10

    move/from16 v0, v19

    const/16 v1, 0xef

    if-le v0, v1, :cond_11

    .line 150
    :cond_10
    const/4 v4, 0x0

    goto :goto_4

    .line 151
    :cond_11
    move/from16 v0, v19

    const/16 v1, 0xa0

    if-le v0, v1, :cond_12

    move/from16 v0, v19

    const/16 v1, 0xe0

    if-ge v0, v1, :cond_12

    .line 152
    add-int/lit8 v11, v11, 0x1

    .line 153
    const/4 v13, 0x0

    .line 154
    add-int/lit8 v12, v12, 0x1

    .line 155
    if-le v12, v14, :cond_14

    .line 156
    move v14, v12

    goto :goto_4

    .line 158
    :cond_12
    move/from16 v0, v19

    const/16 v1, 0x7f

    if-le v0, v1, :cond_13

    .line 159
    add-int/lit8 v10, v10, 0x1

    .line 161
    const/4 v12, 0x0

    .line 162
    add-int/lit8 v13, v13, 0x1

    .line 163
    if-le v13, v15, :cond_14

    .line 164
    move v15, v13

    goto :goto_4

    .line 168
    :cond_13
    const/4 v12, 0x0

    .line 169
    const/4 v13, 0x0

    .line 88
    :cond_14
    :goto_4
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_1

    .line 174
    :cond_15
    if-eqz v5, :cond_16

    if-lez v6, :cond_16

    .line 175
    const/4 v5, 0x0

    .line 177
    :cond_16
    if-eqz v4, :cond_17

    if-lez v10, :cond_17

    .line 178
    const/4 v4, 0x0

    .line 182
    :cond_17
    if-eqz v5, :cond_19

    if-nez v17, :cond_18

    add-int v0, v7, v8

    add-int/2addr v0, v9

    if-lez v0, :cond_19

    .line 183
    :cond_18
    const-string v0, "UTF8"

    return-object v0

    .line 186
    :cond_19
    if-eqz v4, :cond_1b

    sget-boolean v0, Lo/qy;->d:Z

    if-nez v0, :cond_1a

    const/4 v0, 0x3

    if-ge v14, v0, :cond_1a

    const/4 v0, 0x3

    if-lt v15, v0, :cond_1b

    .line 187
    :cond_1a
    const-string v0, "SJIS"

    return-object v0

    .line 194
    :cond_1b
    if-eqz v3, :cond_1f

    if-eqz v4, :cond_1f

    .line 195
    const/4 v0, 0x2

    if-ne v14, v0, :cond_1c

    const/4 v0, 0x2

    if-eq v11, v0, :cond_1d

    :cond_1c
    mul-int/lit8 v0, v16, 0xa

    if-lt v0, v2, :cond_1e

    :cond_1d
    const-string v0, "SJIS"

    goto :goto_5

    :cond_1e
    const-string v0, "ISO8859_1"

    :goto_5
    return-object v0

    .line 200
    :cond_1f
    if-eqz v3, :cond_20

    .line 201
    const-string v0, "ISO8859_1"

    return-object v0

    .line 203
    :cond_20
    if-eqz v4, :cond_21

    .line 204
    const-string v0, "SJIS"

    return-object v0

    .line 206
    :cond_21
    if-eqz v5, :cond_22

    .line 207
    const-string v0, "UTF8"

    return-object v0

    .line 210
    :cond_22
    sget-object v0, Lo/qy;->c:Ljava/lang/String;

    return-object v0
.end method
