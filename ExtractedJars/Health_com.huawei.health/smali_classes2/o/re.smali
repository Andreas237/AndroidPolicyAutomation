.class public final Lo/re;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/qx;


# direct methods
.method public constructor <init>(Lo/qx;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lo/re;->a:Lo/qx;

    .line 47
    return-void
.end method

.method private a(Lo/qz;[I)[I
    .locals 11

    .line 165
    array-length v3, p2

    .line 166
    new-array v4, v3, [I

    .line 167
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_4

    .line 168
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    aget v1, p2, v5

    invoke-virtual {v0, v1}, Lo/qx;->b(I)I

    move-result v6

    .line 169
    const/4 v7, 0x1

    .line 170
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v3, :cond_2

    .line 171
    if-eq v5, v8, :cond_1

    .line 176
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    aget v1, p2, v8

    invoke-virtual {v0, v1, v6}, Lo/qx;->a(II)I

    move-result v9

    .line 177
    and-int/lit8 v0, v9, 0x1

    if-nez v0, :cond_0

    or-int/lit8 v10, v9, 0x1

    goto :goto_2

    :cond_0
    and-int/lit8 v10, v9, -0x2

    .line 178
    :goto_2
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0, v7, v10}, Lo/qx;->a(II)I

    move-result v7

    .line 170
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 181
    :cond_2
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {p1, v6}, Lo/qz;->c(I)I

    move-result v1

    iget-object v2, p0, Lo/re;->a:Lo/qx;

    .line 182
    invoke-virtual {v2, v7}, Lo/qx;->b(I)I

    move-result v2

    .line 181
    invoke-virtual {v0, v1, v2}, Lo/qx;->a(II)I

    move-result v0

    aput v0, v4, v5

    .line 183
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->c()I

    move-result v0

    if-eqz v0, :cond_3

    .line 184
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    aget v1, v4, v5

    invoke-virtual {v0, v1, v6}, Lo/qx;->a(II)I

    move-result v0

    aput v0, v4, v5

    .line 167
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 187
    :cond_4
    return-object v4
.end method

.method private c(Lo/qz;Lo/qz;I)[Lo/qz;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/rf;
        }
    .end annotation

    .line 91
    invoke-virtual {p1}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {p2}, Lo/qz;->e()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 92
    move-object v2, p1

    .line 93
    move-object p1, p2

    .line 94
    move-object p2, v2

    .line 97
    :cond_0
    move-object v2, p1

    .line 98
    move-object v3, p2

    .line 99
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v4

    .line 100
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->b()Lo/qz;

    move-result-object v5

    .line 103
    :goto_0
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    div-int/lit8 v1, p3, 0x2

    if-lt v0, v1, :cond_4

    .line 104
    move-object v6, v2

    .line 105
    move-object v7, v4

    .line 106
    move-object v2, v3

    .line 107
    move-object v4, v5

    .line 110
    invoke-virtual {v2}, Lo/qz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    new-instance v0, Lo/rf;

    const-string v1, "r_{i-1} was zero"

    invoke-direct {v0, v1}, Lo/rf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_1
    move-object v3, v6

    .line 115
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v8

    .line 116
    invoke-virtual {v2}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/qz;->e(I)I

    move-result v9

    .line 117
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0, v9}, Lo/qx;->b(I)I

    move-result v10

    .line 118
    :goto_1
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {v2}, Lo/qz;->e()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-virtual {v3}, Lo/qz;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 119
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {v2}, Lo/qz;->e()I

    move-result v1

    sub-int v11, v0, v1

    .line 120
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v1

    invoke-virtual {v3, v1}, Lo/qz;->e(I)I

    move-result v1

    invoke-virtual {v0, v1, v10}, Lo/qx;->a(II)I

    move-result v12

    .line 121
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0, v11, v12}, Lo/qx;->d(II)Lo/qz;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/qz;->d(Lo/qz;)Lo/qz;

    move-result-object v8

    .line 122
    invoke-virtual {v2, v11, v12}, Lo/qz;->d(II)Lo/qz;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/qz;->d(Lo/qz;)Lo/qz;

    move-result-object v3

    .line 123
    goto :goto_1

    .line 125
    :cond_2
    invoke-virtual {v8, v4}, Lo/qz;->c(Lo/qz;)Lo/qz;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/qz;->d(Lo/qz;)Lo/qz;

    move-result-object v5

    .line 127
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {v2}, Lo/qz;->e()I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 128
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Division algorithm failed to reduce polynomial?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_3
    goto/16 :goto_0

    .line 132
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/qz;->e(I)I

    move-result v6

    .line 133
    if-nez v6, :cond_5

    .line 134
    new-instance v0, Lo/rf;

    const-string v1, "sigmaTilde(0) was zero"

    invoke-direct {v0, v1}, Lo/rf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_5
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0, v6}, Lo/qx;->b(I)I

    move-result v7

    .line 138
    invoke-virtual {v5, v7}, Lo/qz;->a(I)Lo/qz;

    move-result-object v8

    .line 139
    invoke-virtual {v3, v7}, Lo/qz;->a(I)Lo/qz;

    move-result-object v9

    .line 140
    const/4 v0, 0x2

    new-array v0, v0, [Lo/qz;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    return-object v0
.end method

.method private d(Lo/qz;)[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/rf;
        }
    .end annotation

    .line 145
    invoke-virtual {p1}, Lo/qz;->e()I

    move-result v3

    .line 146
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 147
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lo/qz;->e(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    return-object v0

    .line 149
    :cond_0
    new-array v4, v3, [I

    .line 150
    const/4 v5, 0x0

    .line 151
    const/4 v6, 0x1

    :goto_0
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->a()I

    move-result v0

    if-ge v6, v0, :cond_2

    if-ge v5, v3, :cond_2

    .line 152
    invoke-virtual {p1, v6}, Lo/qz;->c(I)I

    move-result v0

    if-nez v0, :cond_1

    .line 153
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v0, v6}, Lo/qx;->b(I)I

    move-result v0

    aput v0, v4, v5

    .line 154
    add-int/lit8 v5, v5, 0x1

    .line 151
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 157
    :cond_2
    if-eq v5, v3, :cond_3

    .line 158
    new-instance v0, Lo/rf;

    const-string v1, "Error locator degree does not match number of roots"

    invoke-direct {v0, v1}, Lo/rf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 160
    :cond_3
    return-object v4
.end method


# virtual methods
.method public c([II)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/rf;
        }
    .end annotation

    .line 59
    new-instance v3, Lo/qz;

    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-direct {v3, v0, p1}, Lo/qz;-><init>(Lo/qx;[I)V

    .line 60
    move/from16 v0, p2

    new-array v4, v0, [I

    .line 61
    const/4 v5, 0x1

    .line 62
    const/4 v6, 0x0

    :goto_0
    move/from16 v0, p2

    if-ge v6, v0, :cond_1

    .line 63
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    iget-object v1, p0, Lo/re;->a:Lo/qx;

    invoke-virtual {v1}, Lo/qx;->c()I

    move-result v1

    add-int/2addr v1, v6

    invoke-virtual {v0, v1}, Lo/qx;->a(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/qz;->c(I)I

    move-result v7

    .line 64
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v6

    aput v7, v4, v0

    .line 65
    if-eqz v7, :cond_0

    .line 66
    const/4 v5, 0x0

    .line 62
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 69
    :cond_1
    if-eqz v5, :cond_2

    .line 70
    return-void

    .line 72
    :cond_2
    new-instance v6, Lo/qz;

    iget-object v0, p0, Lo/re;->a:Lo/qx;

    invoke-direct {v6, v0, v4}, Lo/qz;-><init>(Lo/qx;[I)V

    .line 73
    iget-object v0, p0, Lo/re;->a:Lo/qx;

    .line 74
    move/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/qx;->d(II)Lo/qz;

    move-result-object v0

    move/from16 v1, p2

    invoke-direct {p0, v0, v6, v1}, Lo/re;->c(Lo/qz;Lo/qz;I)[Lo/qz;

    move-result-object v7

    .line 75
    const/4 v0, 0x0

    aget-object v8, v7, v0

    .line 76
    const/4 v0, 0x1

    aget-object v9, v7, v0

    .line 77
    invoke-direct {p0, v8}, Lo/re;->d(Lo/qz;)[I

    move-result-object v10

    .line 78
    invoke-direct {p0, v9, v10}, Lo/re;->a(Lo/qz;[I)[I

    move-result-object v11

    .line 79
    const/4 v12, 0x0

    :goto_1
    array-length v0, v10

    if-ge v12, v0, :cond_4

    .line 80
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lo/re;->a:Lo/qx;

    aget v2, v10, v12

    invoke-virtual {v1, v2}, Lo/qx;->c(I)I

    move-result v1

    sub-int v13, v0, v1

    .line 81
    if-gez v13, :cond_3

    .line 82
    new-instance v0, Lo/rf;

    const-string v1, "Bad error location"

    invoke-direct {v0, v1}, Lo/rf;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_3
    aget v0, p1, v13

    aget v1, v11, v12

    invoke-static {v0, v1}, Lo/qx;->e(II)I

    move-result v0

    aput v0, p1, v13

    .line 79
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 86
    :cond_4
    return-void
.end method
