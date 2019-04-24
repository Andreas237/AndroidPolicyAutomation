.class final Lo/tt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/tm;

.field private final b:I

.field private final d:[Lo/tr;

.field private e:Lo/tq;


# direct methods
.method constructor <init>(Lo/tm;Lo/tq;)V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lo/tt;->a:Lo/tm;

    .line 37
    invoke-virtual {p1}, Lo/tm;->e()I

    move-result v0

    iput v0, p0, Lo/tt;->b:I

    .line 38
    iput-object p2, p0, Lo/tt;->e:Lo/tq;

    .line 39
    iget v0, p0, Lo/tt;->b:I

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lo/tr;

    iput-object v0, p0, Lo/tt;->d:[Lo/tr;

    .line 40
    return-void
.end method

.method private a(Lo/tr;)V
    .locals 2

    .line 55
    if-eqz p1, :cond_0

    .line 56
    move-object v0, p1

    check-cast v0, Lo/ty;

    iget-object v1, p0, Lo/tt;->a:Lo/tm;

    .line 57
    invoke-virtual {v0, v1}, Lo/ty;->e(Lo/tm;)I

    .line 59
    :cond_0
    return-void
.end method

.method private static a(Lo/tp;Lo/tp;)Z
    .locals 2

    .line 230
    if-nez p1, :cond_0

    .line 231
    const/4 v0, 0x0

    return v0

    .line 233
    :cond_0
    invoke-virtual {p1}, Lo/tp;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lo/tp;->i()I

    move-result v0

    invoke-virtual {p0}, Lo/tp;->i()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 234
    invoke-virtual {p1}, Lo/tp;->g()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/tp;->b(I)V

    .line 235
    const/4 v0, 0x1

    return v0

    .line 237
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static b(IILo/tp;)I
    .locals 1

    .line 172
    if-nez p2, :cond_0

    .line 173
    return p1

    .line 175
    :cond_0
    invoke-virtual {p2}, Lo/tp;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 176
    invoke-virtual {p2, p0}, Lo/tp;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 177
    invoke-virtual {p2, p0}, Lo/tp;->b(I)V

    .line 178
    const/4 p1, 0x0

    goto :goto_0

    .line 180
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 183
    :cond_2
    :goto_0
    return p1
.end method

.method private c(II[Lo/tp;)V
    .locals 10

    .line 187
    aget-object v2, p3, p2

    .line 188
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    add-int/lit8 v1, p1, -0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v3

    .line 189
    move-object v4, v3

    .line 190
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    add-int/lit8 v1, p1, 0x1

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    add-int/lit8 v1, p1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v4

    .line 194
    :cond_0
    const/16 v0, 0xe

    new-array v5, v0, [Lo/tp;

    .line 196
    aget-object v0, v3, p2

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 197
    aget-object v0, v4, p2

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 199
    if-lez p2, :cond_1

    .line 200
    add-int/lit8 v0, p2, -0x1

    aget-object v0, p3, v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 201
    add-int/lit8 v0, p2, -0x1

    aget-object v0, v3, v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    .line 202
    add-int/lit8 v0, p2, -0x1

    aget-object v0, v4, v0

    const/4 v1, 0x5

    aput-object v0, v5, v1

    .line 204
    :cond_1
    const/4 v0, 0x1

    if-le p2, v0, :cond_2

    .line 205
    add-int/lit8 v0, p2, -0x2

    aget-object v0, p3, v0

    const/16 v1, 0x8

    aput-object v0, v5, v1

    .line 206
    add-int/lit8 v0, p2, -0x2

    aget-object v0, v3, v0

    const/16 v1, 0xa

    aput-object v0, v5, v1

    .line 207
    add-int/lit8 v0, p2, -0x2

    aget-object v0, v4, v0

    const/16 v1, 0xb

    aput-object v0, v5, v1

    .line 209
    :cond_2
    array-length v0, p3

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_3

    .line 210
    add-int/lit8 v0, p2, 0x1

    aget-object v0, p3, v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 211
    add-int/lit8 v0, p2, 0x1

    aget-object v0, v3, v0

    const/4 v1, 0x6

    aput-object v0, v5, v1

    .line 212
    add-int/lit8 v0, p2, 0x1

    aget-object v0, v4, v0

    const/4 v1, 0x7

    aput-object v0, v5, v1

    .line 214
    :cond_3
    array-length v0, p3

    add-int/lit8 v0, v0, -0x2

    if-ge p2, v0, :cond_4

    .line 215
    add-int/lit8 v0, p2, 0x2

    aget-object v0, p3, v0

    const/16 v1, 0x9

    aput-object v0, v5, v1

    .line 216
    add-int/lit8 v0, p2, 0x2

    aget-object v0, v3, v0

    const/16 v1, 0xc

    aput-object v0, v5, v1

    .line 217
    add-int/lit8 v0, p2, 0x2

    aget-object v0, v4, v0

    const/16 v1, 0xd

    aput-object v0, v5, v1

    .line 219
    :cond_4
    move-object v6, v5

    array-length v7, v6

    const/16 v7, 0xe

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_6

    aget-object v9, v6, v8

    .line 220
    invoke-static {v2, v9}, Lo/tt;->a(Lo/tp;Lo/tp;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 221
    return-void

    .line 219
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 224
    :cond_6
    return-void
.end method

.method private f()I
    .locals 9

    .line 147
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    .line 148
    const/4 v0, 0x0

    return v0

    .line 150
    :cond_0
    const/4 v2, 0x0

    .line 151
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v3

    .line 152
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_4

    .line 153
    aget-object v0, v3, v4

    if-nez v0, :cond_1

    .line 154
    goto :goto_2

    .line 156
    :cond_1
    aget-object v0, v3, v4

    invoke-virtual {v0}, Lo/tp;->g()I

    move-result v5

    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x1

    :goto_1
    iget v0, p0, Lo/tt;->b:I

    add-int/lit8 v0, v0, 0x1

    if-ge v7, v0, :cond_3

    const/4 v0, 0x2

    if-ge v6, v0, :cond_3

    .line 159
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    aget-object v8, v0, v4

    .line 160
    if-eqz v8, :cond_2

    .line 161
    invoke-static {v5, v6, v8}, Lo/tt;->b(IILo/tp;)I

    move-result v6

    .line 162
    invoke-virtual {v8}, Lo/tp;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 163
    add-int/lit8 v2, v2, 0x1

    .line 158
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 152
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 168
    :cond_4
    return v2
.end method

.method private g()I
    .locals 2

    .line 88
    invoke-direct {p0}, Lo/tt;->h()V

    .line 93
    invoke-direct {p0}, Lo/tt;->f()I

    move-result v1

    .line 94
    invoke-direct {p0}, Lo/tt;->i()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method private h()V
    .locals 8

    .line 98
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    if-nez v0, :cond_1

    .line 99
    :cond_0
    return-void

    .line 101
    :cond_1
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v3

    .line 102
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v4

    .line 103
    const/4 v5, 0x0

    :goto_0
    array-length v0, v3

    if-ge v5, v0, :cond_5

    .line 104
    aget-object v0, v3, v5

    if-eqz v0, :cond_4

    aget-object v0, v4, v5

    if-eqz v0, :cond_4

    aget-object v0, v3, v5

    .line 106
    invoke-virtual {v0}, Lo/tp;->g()I

    move-result v0

    aget-object v1, v4, v5

    invoke-virtual {v1}, Lo/tp;->g()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 107
    const/4 v6, 0x1

    :goto_1
    iget v0, p0, Lo/tt;->b:I

    if-gt v6, v0, :cond_4

    .line 108
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    aget-object v7, v0, v5

    .line 109
    if-nez v7, :cond_2

    .line 110
    goto :goto_2

    .line 112
    :cond_2
    aget-object v0, v3, v5

    invoke-virtual {v0}, Lo/tp;->g()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/tp;->b(I)V

    .line 113
    invoke-virtual {v7}, Lo/tp;->c()Z

    move-result v0

    if-nez v0, :cond_3

    .line 114
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v6

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v1, v0, v5

    .line 107
    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 103
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 119
    :cond_5
    return-void
.end method

.method private i()I
    .locals 10

    .line 122
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    .line 123
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_0
    const/4 v3, 0x0

    .line 126
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v4

    .line 127
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_4

    .line 128
    aget-object v0, v4, v5

    if-nez v0, :cond_1

    .line 129
    goto :goto_2

    .line 131
    :cond_1
    aget-object v0, v4, v5

    invoke-virtual {v0}, Lo/tp;->g()I

    move-result v6

    .line 132
    const/4 v7, 0x0

    .line 133
    iget v0, p0, Lo/tt;->b:I

    add-int/lit8 v8, v0, 0x1

    :goto_1
    if-lez v8, :cond_3

    const/4 v0, 0x2

    if-ge v7, v0, :cond_3

    .line 134
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v8

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    aget-object v9, v0, v5

    .line 135
    if-eqz v9, :cond_2

    .line 136
    invoke-static {v6, v7, v9}, Lo/tt;->b(IILo/tp;)I

    move-result v7

    .line 137
    invoke-virtual {v9}, Lo/tp;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 138
    add-int/lit8 v3, v3, 0x1

    .line 133
    :cond_2
    add-int/lit8 v8, v8, -0x1

    goto :goto_1

    .line 127
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 143
    :cond_4
    return v3
.end method

.method private k()I
    .locals 6

    .line 69
    invoke-direct {p0}, Lo/tt;->g()I

    move-result v2

    .line 70
    if-nez v2, :cond_0

    .line 71
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    const/4 v3, 0x1

    :goto_0
    iget v0, p0, Lo/tt;->b:I

    add-int/lit8 v0, v0, 0x1

    if-ge v3, v0, :cond_4

    .line 74
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v4

    .line 75
    const/4 v5, 0x0

    :goto_1
    array-length v0, v4

    if-ge v5, v0, :cond_3

    .line 76
    aget-object v0, v4, v5

    if-nez v0, :cond_1

    .line 77
    goto :goto_2

    .line 79
    :cond_1
    aget-object v0, v4, v5

    invoke-virtual {v0}, Lo/tp;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 80
    invoke-direct {p0, v3, v5, v4}, Lo/tt;->c(II[Lo/tp;)V

    .line 75
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 73
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 84
    :cond_4
    return v2
.end method


# virtual methods
.method a()I
    .locals 1

    .line 245
    iget-object v0, p0, Lo/tt;->a:Lo/tm;

    invoke-virtual {v0}, Lo/tm;->a()I

    move-result v0

    return v0
.end method

.method a(I)Lo/tr;
    .locals 1

    .line 265
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public a(Lo/tq;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/tt;->e:Lo/tq;

    .line 254
    return-void
.end method

.method b()[Lo/tr;
    .locals 5

    .line 43
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lo/tt;->a(Lo/tr;)V

    .line 44
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lo/tt;->a(Lo/tr;)V

    .line 45
    const/16 v3, 0x3a0

    .line 48
    :cond_0
    move v4, v3

    .line 49
    invoke-direct {p0}, Lo/tt;->k()I

    move-result v3

    .line 50
    if-lez v3, :cond_1

    if-lt v3, v4, :cond_0

    .line 51
    :cond_1
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    return-object v0
.end method

.method c()I
    .locals 1

    .line 249
    iget-object v0, p0, Lo/tt;->a:Lo/tm;

    invoke-virtual {v0}, Lo/tm;->c()I

    move-result v0

    return v0
.end method

.method d()I
    .locals 1

    .line 241
    iget v0, p0, Lo/tt;->b:I

    return v0
.end method

.method e()Lo/tq;
    .locals 1

    .line 257
    iget-object v0, p0, Lo/tt;->e:Lo/tq;

    return-object v0
.end method

.method e(ILo/tr;)V
    .locals 1

    .line 261
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aput-object p2, v0, p1

    .line 262
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 270
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    const/4 v1, 0x0

    aget-object v4, v0, v1

    .line 271
    if-nez v4, :cond_0

    .line 272
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    iget v1, p0, Lo/tt;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-object v4, v0, v1

    .line 274
    :cond_0
    new-instance v5, Ljava/util/Formatter;

    invoke-direct {v5}, Ljava/util/Formatter;-><init>()V

    .line 275
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    array-length v0, v0

    if-ge v6, v0, :cond_4

    .line 276
    const-string v0, "CW %3d:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 277
    const/4 v7, 0x0

    :goto_1
    iget v0, p0, Lo/tt;->b:I

    add-int/lit8 v0, v0, 0x2

    if-ge v7, v0, :cond_3

    .line 278
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v7

    if-nez v0, :cond_1

    .line 279
    const-string v0, "    |   "

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 280
    goto :goto_2

    .line 282
    :cond_1
    iget-object v0, p0, Lo/tt;->d:[Lo/tr;

    aget-object v0, v0, v7

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v0

    aget-object v8, v0, v6

    .line 283
    if-nez v8, :cond_2

    .line 284
    const-string v0, "    |   "

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 285
    goto :goto_2

    .line 287
    :cond_2
    const-string v0, " %3d|%3d"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lo/tp;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/tp;->h()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 277
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 289
    :cond_3
    const-string v0, "%n"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 275
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 291
    :cond_4
    invoke-virtual {v5}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v6

    .line 292
    invoke-virtual {v5}, Ljava/util/Formatter;->close()V

    .line 293
    return-object v6
.end method
