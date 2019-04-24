.class public final Lo/tv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Lo/tx;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    sget-object v0, Lo/tx;->e:Lo/tx;

    iput-object v0, p0, Lo/tv;->d:Lo/tx;

    .line 36
    return-void
.end method

.method private a(Lo/ud;Lo/ud;[I)[I
    .locals 12

    .line 168
    invoke-virtual {p2}, Lo/ud;->d()I

    move-result v3

    .line 169
    new-array v4, v3, [I

    .line 170
    const/4 v5, 0x1

    :goto_0
    if-gt v5, v3, :cond_0

    .line 171
    sub-int v0, v3, v5

    iget-object v1, p0, Lo/tv;->d:Lo/tx;

    .line 172
    invoke-virtual {p2, v5}, Lo/ud;->d(I)I

    move-result v2

    invoke-virtual {v1, v5, v2}, Lo/tx;->e(II)I

    move-result v1

    aput v1, v4, v0

    .line 170
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 174
    :cond_0
    new-instance v5, Lo/ud;

    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-direct {v5, v0, v4}, Lo/ud;-><init>(Lo/tx;[I)V

    .line 177
    array-length v6, p3

    .line 178
    new-array v7, v6, [I

    .line 179
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_1

    .line 180
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    aget v1, p3, v8

    invoke-virtual {v0, v1}, Lo/tx;->a(I)I

    move-result v9

    .line 181
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {p1, v9}, Lo/ud;->a(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/tx;->c(II)I

    move-result v10

    .line 182
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v5, v9}, Lo/ud;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/tx;->a(I)I

    move-result v11

    .line 183
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v10, v11}, Lo/tx;->e(II)I

    move-result v0

    aput v0, v7, v8

    .line 179
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 185
    :cond_1
    return-object v7
.end method

.method private a(Lo/ud;Lo/ud;I)[Lo/ud;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 100
    invoke-virtual {p1}, Lo/ud;->d()I

    move-result v0

    invoke-virtual {p2}, Lo/ud;->d()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 101
    move-object v2, p1

    .line 102
    move-object p1, p2

    .line 103
    move-object p2, v2

    .line 106
    :cond_0
    move-object v2, p1

    .line 107
    move-object v3, p2

    .line 108
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->b()Lo/ud;

    move-result-object v4

    .line 109
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->d()Lo/ud;

    move-result-object v5

    .line 112
    :goto_0
    invoke-virtual {v3}, Lo/ud;->d()I

    move-result v0

    div-int/lit8 v1, p3, 0x2

    if-lt v0, v1, :cond_3

    .line 113
    move-object v6, v2

    .line 114
    move-object v7, v4

    .line 115
    move-object v2, v3

    .line 116
    move-object v4, v5

    .line 119
    invoke-virtual {v2}, Lo/ud;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 123
    :cond_1
    move-object v3, v6

    .line 124
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->b()Lo/ud;

    move-result-object v8

    .line 125
    invoke-virtual {v2}, Lo/ud;->d()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/ud;->d(I)I

    move-result v9

    .line 126
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v9}, Lo/tx;->a(I)I

    move-result v10

    .line 127
    :goto_1
    invoke-virtual {v3}, Lo/ud;->d()I

    move-result v0

    invoke-virtual {v2}, Lo/ud;->d()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-virtual {v3}, Lo/ud;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 128
    invoke-virtual {v3}, Lo/ud;->d()I

    move-result v0

    invoke-virtual {v2}, Lo/ud;->d()I

    move-result v1

    sub-int v11, v0, v1

    .line 129
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v3}, Lo/ud;->d()I

    move-result v1

    invoke-virtual {v3, v1}, Lo/ud;->d(I)I

    move-result v1

    invoke-virtual {v0, v1, v10}, Lo/tx;->e(II)I

    move-result v12

    .line 130
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v11, v12}, Lo/tx;->b(II)Lo/ud;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/ud;->e(Lo/ud;)Lo/ud;

    move-result-object v8

    .line 131
    invoke-virtual {v2, v11, v12}, Lo/ud;->b(II)Lo/ud;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/ud;->a(Lo/ud;)Lo/ud;

    move-result-object v3

    .line 132
    goto :goto_1

    .line 134
    :cond_2
    invoke-virtual {v8, v4}, Lo/ud;->c(Lo/ud;)Lo/ud;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/ud;->a(Lo/ud;)Lo/ud;

    move-result-object v0

    invoke-virtual {v0}, Lo/ud;->b()Lo/ud;

    move-result-object v5

    .line 135
    goto/16 :goto_0

    .line 137
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/ud;->d(I)I

    move-result v6

    .line 138
    if-nez v6, :cond_4

    .line 139
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 142
    :cond_4
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v6}, Lo/tx;->a(I)I

    move-result v7

    .line 143
    invoke-virtual {v5, v7}, Lo/ud;->b(I)Lo/ud;

    move-result-object v8

    .line 144
    invoke-virtual {v3, v7}, Lo/ud;->b(I)Lo/ud;

    move-result-object v9

    .line 145
    const/4 v0, 0x2

    new-array v0, v0, [Lo/ud;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    return-object v0
.end method

.method private b(Lo/ud;)[I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 150
    invoke-virtual {p1}, Lo/ud;->d()I

    move-result v1

    .line 151
    new-array v2, v1, [I

    .line 152
    const/4 v3, 0x0

    .line 153
    const/4 v4, 0x1

    :goto_0
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->e()I

    move-result v0

    if-ge v4, v0, :cond_1

    if-ge v3, v1, :cond_1

    .line 154
    invoke-virtual {p1, v4}, Lo/ud;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v4}, Lo/tx;->a(I)I

    move-result v0

    aput v0, v2, v3

    .line 156
    add-int/lit8 v3, v3, 0x1

    .line 153
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 159
    :cond_1
    if-eq v3, v1, :cond_2

    .line 160
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 162
    :cond_2
    return-object v2
.end method


# virtual methods
.method public d([II[I)I
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 49
    new-instance v5, Lo/ud;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    move-object/from16 v1, p1

    invoke-direct {v5, v0, v1}, Lo/ud;-><init>(Lo/tx;[I)V

    .line 50
    move/from16 v0, p2

    new-array v6, v0, [I

    .line 51
    const/4 v7, 0x0

    .line 52
    move/from16 v8, p2

    :goto_0
    if-lez v8, :cond_1

    .line 53
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0, v8}, Lo/tx;->d(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/ud;->a(I)I

    move-result v9

    .line 54
    sub-int v0, p2, v8

    aput v9, v6, v0

    .line 55
    if-eqz v9, :cond_0

    .line 56
    const/4 v7, 0x1

    .line 52
    :cond_0
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 60
    :cond_1
    if-nez v7, :cond_2

    .line 61
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->d()Lo/ud;

    move-result-object v8

    .line 65
    if-eqz p3, :cond_3

    .line 66
    move-object/from16 v9, p3

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_3

    aget v12, v9, v11

    .line 67
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    move-object/from16 v1, p1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, v12

    invoke-virtual {v0, v1}, Lo/tx;->d(I)I

    move-result v13

    .line 69
    new-instance v0, Lo/ud;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/tv;->d:Lo/tx;

    const/4 v2, 0x2

    new-array v2, v2, [I

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/tv;->d:Lo/tx;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v13}, Lo/tx;->c(II)I

    move-result v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const/4 v3, 0x1

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-direct {v0, v1, v2}, Lo/ud;-><init>(Lo/tx;[I)V

    move-object v14, v0

    .line 70
    invoke-virtual {v8, v14}, Lo/ud;->c(Lo/ud;)Lo/ud;

    move-result-object v8

    .line 66
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 74
    :cond_3
    new-instance v9, Lo/ud;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    invoke-direct {v9, v0, v6}, Lo/ud;-><init>(Lo/tx;[I)V

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    .line 78
    move/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/tx;->b(II)Lo/ud;

    move-result-object v0

    move-object/from16 v1, p0

    move/from16 v2, p2

    invoke-direct {v1, v0, v9, v2}, Lo/tv;->a(Lo/ud;Lo/ud;I)[Lo/ud;

    move-result-object v10

    .line 79
    const/4 v0, 0x0

    aget-object v11, v10, v0

    .line 80
    const/4 v0, 0x1

    aget-object v12, v10, v0

    .line 84
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/tv;->b(Lo/ud;)[I

    move-result-object v13

    .line 85
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v11, v13}, Lo/tv;->a(Lo/ud;Lo/ud;[I)[I

    move-result-object v14

    .line 87
    const/4 v15, 0x0

    :goto_2
    array-length v0, v13

    if-ge v15, v0, :cond_5

    .line 88
    move-object/from16 v0, p1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/tv;->d:Lo/tx;

    aget v2, v13, v15

    invoke-virtual {v1, v2}, Lo/tx;->e(I)I

    move-result v1

    sub-int v16, v0, v1

    .line 89
    if-gez v16, :cond_4

    .line 90
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 92
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/tv;->d:Lo/tx;

    aget v1, p1, v16

    aget v2, v14, v15

    invoke-virtual {v0, v1, v2}, Lo/tx;->c(II)I

    move-result v0

    aput v0, p1, v16

    .line 87
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 94
    :cond_5
    array-length v0, v13

    return v0
.end method
