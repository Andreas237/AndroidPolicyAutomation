.class final Lo/uu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lo/uv;)I
    .locals 9

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-virtual {p0}, Lo/uv;->c()[[B

    move-result-object v3

    .line 130
    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v4

    .line 131
    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v5

    .line 132
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 133
    aget-object v7, v3, v6

    .line 134
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v4, :cond_1

    .line 135
    aget-byte v0, v7, v8

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 134
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 132
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 140
    :cond_2
    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v0

    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v1

    mul-int v6, v0, v1

    .line 141
    mul-int/lit8 v0, v2, 0x2

    sub-int/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    div-int v7, v0, v6

    .line 142
    mul-int/lit8 v0, v7, 0xa

    return v0
.end method

.method static a(III)Z
    .locals 5

    .line 152
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 154
    :pswitch_0
    add-int v0, p2, p1

    and-int/lit8 v3, v0, 0x1

    .line 155
    goto :goto_1

    .line 157
    :pswitch_1
    and-int/lit8 v3, p2, 0x1

    .line 158
    goto :goto_1

    .line 160
    :pswitch_2
    rem-int/lit8 v3, p1, 0x3

    .line 161
    goto :goto_1

    .line 163
    :pswitch_3
    add-int v0, p2, p1

    rem-int/lit8 v3, v0, 0x3

    .line 164
    goto :goto_1

    .line 166
    :pswitch_4
    div-int/lit8 v0, p2, 0x2

    div-int/lit8 v1, p1, 0x3

    add-int/2addr v0, v1

    and-int/lit8 v3, v0, 0x1

    .line 167
    goto :goto_1

    .line 169
    :pswitch_5
    mul-int v4, p2, p1

    .line 170
    and-int/lit8 v0, v4, 0x1

    rem-int/lit8 v1, v4, 0x3

    add-int v3, v0, v1

    .line 171
    goto :goto_1

    .line 173
    :pswitch_6
    mul-int v4, p2, p1

    .line 174
    and-int/lit8 v0, v4, 0x1

    rem-int/lit8 v1, v4, 0x3

    add-int/2addr v0, v1

    and-int/lit8 v3, v0, 0x1

    .line 175
    goto :goto_1

    .line 177
    :pswitch_7
    mul-int v4, p2, p1

    .line 178
    rem-int/lit8 v0, v4, 0x3

    add-int v1, p2, p1

    and-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    and-int/lit8 v3, v0, 0x1

    .line 179
    goto :goto_1

    .line 181
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mask pattern: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :goto_1
    if-nez v3, :cond_0

    const/4 v0, 0x1

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static a([BII)Z
    .locals 3

    .line 106
    move v2, p1

    :goto_0
    if-ge v2, p2, :cond_1

    .line 107
    if-ltz v2, :cond_0

    array-length v0, p0

    if-ge v2, v0, :cond_0

    aget-byte v0, p0, v2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 108
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 111
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static b(Lo/uv;)I
    .locals 9

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-virtual {p0}, Lo/uv;->c()[[B

    move-result-object v3

    .line 73
    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v4

    .line 74
    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v5

    .line 75
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    .line 76
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v4, :cond_4

    .line 77
    aget-object v8, v3, v6

    .line 78
    add-int/lit8 v0, v7, 0x6

    if-ge v0, v4, :cond_1

    aget-byte v0, v8, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v7, 0x1

    aget-byte v0, v8, v0

    if-nez v0, :cond_1

    add-int/lit8 v0, v7, 0x2

    aget-byte v0, v8, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v7, 0x3

    aget-byte v0, v8, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v7, 0x4

    aget-byte v0, v8, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v7, 0x5

    aget-byte v0, v8, v0

    if-nez v0, :cond_1

    add-int/lit8 v0, v7, 0x6

    aget-byte v0, v8, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, v7, -0x4

    .line 86
    invoke-static {v8, v0, v7}, Lo/uu;->a([BII)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, v7, 0x7

    add-int/lit8 v1, v7, 0xb

    invoke-static {v8, v0, v1}, Lo/uu;->a([BII)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 89
    :cond_1
    add-int/lit8 v0, v6, 0x6

    if-ge v0, v5, :cond_3

    aget-object v0, v3, v6

    aget-byte v0, v0, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    add-int/lit8 v0, v6, 0x1

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    if-nez v0, :cond_3

    add-int/lit8 v0, v6, 0x2

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    add-int/lit8 v0, v6, 0x3

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    add-int/lit8 v0, v6, 0x4

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    add-int/lit8 v0, v6, 0x5

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    if-nez v0, :cond_3

    add-int/lit8 v0, v6, 0x6

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    add-int/lit8 v0, v6, -0x4

    .line 97
    invoke-static {v3, v7, v0, v6}, Lo/uu;->b([[BIII)Z

    move-result v0

    if-nez v0, :cond_2

    add-int/lit8 v0, v6, 0x7

    add-int/lit8 v1, v6, 0xb

    invoke-static {v3, v7, v0, v1}, Lo/uu;->b([[BIII)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 76
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 75
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 102
    :cond_5
    mul-int/lit8 v0, v2, 0x28

    return v0
.end method

.method private static b([[BIII)Z
    .locals 3

    .line 115
    move v2, p2

    :goto_0
    if-ge v2, p3, :cond_1

    .line 116
    if-ltz v2, :cond_0

    array-length v0, p0

    if-ge v2, v0, :cond_0

    aget-object v0, p0, v2

    aget-byte v0, v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 117
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 120
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static d(Lo/uv;)I
    .locals 9

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {p0}, Lo/uv;->c()[[B

    move-result-object v3

    .line 52
    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v4

    .line 53
    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v5

    .line 54
    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v0, v5, -0x1

    if-ge v6, v0, :cond_2

    .line 55
    const/4 v7, 0x0

    :goto_1
    add-int/lit8 v0, v4, -0x1

    if-ge v7, v0, :cond_1

    .line 56
    aget-object v0, v3, v6

    aget-byte v8, v0, v7

    .line 57
    aget-object v0, v3, v6

    add-int/lit8 v1, v7, 0x1

    aget-byte v0, v0, v1

    if-ne v8, v0, :cond_0

    add-int/lit8 v0, v6, 0x1

    aget-object v0, v3, v0

    aget-byte v0, v0, v7

    if-ne v8, v0, :cond_0

    add-int/lit8 v0, v6, 0x1

    aget-object v0, v3, v0

    add-int/lit8 v1, v7, 0x1

    aget-byte v0, v0, v1

    if-ne v8, v0, :cond_0

    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 55
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 54
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 62
    :cond_2
    mul-int/lit8 v0, v2, 0x3

    return v0
.end method

.method static e(Lo/uv;)I
    .locals 2

    .line 41
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/uu;->e(Lo/uv;Z)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lo/uu;->e(Lo/uv;Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private static e(Lo/uv;Z)I
    .locals 11

    .line 191
    const/4 v2, 0x0

    .line 192
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v3

    .line 193
    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lo/uv;->a()I

    move-result v4

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lo/uv;->e()I

    move-result v4

    .line 194
    :goto_1
    invoke-virtual {p0}, Lo/uv;->c()[[B

    move-result-object v5

    .line 195
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v3, :cond_7

    .line 196
    const/4 v7, 0x0

    .line 197
    const/4 v8, -0x1

    .line 198
    const/4 v9, 0x0

    :goto_3
    if-ge v9, v4, :cond_5

    .line 199
    if-eqz p1, :cond_2

    aget-object v0, v5, v6

    aget-byte v10, v0, v9

    goto :goto_4

    :cond_2
    aget-object v0, v5, v9

    aget-byte v10, v0, v6

    .line 200
    :goto_4
    if-ne v10, v8, :cond_3

    .line 201
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 203
    :cond_3
    const/4 v0, 0x5

    if-lt v7, v0, :cond_4

    .line 204
    add-int/lit8 v0, v7, -0x5

    add-int/lit8 v0, v0, 0x3

    add-int/2addr v2, v0

    .line 206
    :cond_4
    const/4 v7, 0x1

    .line 207
    move v8, v10

    .line 198
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 210
    :cond_5
    const/4 v0, 0x5

    if-lt v7, v0, :cond_6

    .line 211
    add-int/lit8 v0, v7, -0x5

    add-int/lit8 v0, v0, 0x3

    add-int/2addr v2, v0

    .line 195
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 214
    :cond_7
    return v2
.end method
