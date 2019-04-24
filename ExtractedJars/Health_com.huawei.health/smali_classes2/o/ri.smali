.class final Lo/ri;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final e:I


# direct methods
.method private constructor <init>(I[B)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput p1, p0, Lo/ri;->e:I

    .line 33
    iput-object p2, p0, Lo/ri;->a:[B

    .line 34
    return-void
.end method

.method static b([BLo/rk;)[Lo/ri;
    .locals 19

    .line 49
    invoke-virtual/range {p1 .. p1}, Lo/rk;->k()Lo/rk$b;

    move-result-object v3

    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-virtual {v3}, Lo/rk$b;->d()[Lo/rk$a;

    move-result-object v5

    .line 54
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v9, v6, v8

    .line 55
    invoke-virtual {v9}, Lo/rk$a;->c()I

    move-result v0

    add-int/2addr v4, v0

    .line 54
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 59
    :cond_0
    new-array v6, v4, [Lo/ri;

    .line 60
    const/4 v7, 0x0

    .line 61
    move-object v8, v5

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    .line 62
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v11}, Lo/rk$a;->c()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 63
    invoke-virtual {v11}, Lo/rk$a;->e()I

    move-result v13

    .line 64
    invoke-virtual {v3}, Lo/rk$b;->c()I

    move-result v0

    add-int v14, v0, v13

    .line 65
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    new-instance v1, Lo/ri;

    new-array v2, v14, [B

    invoke-direct {v1, v13, v2}, Lo/ri;-><init>(I[B)V

    aput-object v1, v6, v0

    .line 62
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 61
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 72
    :cond_2
    const/4 v0, 0x0

    aget-object v0, v6, v0

    iget-object v0, v0, Lo/ri;->a:[B

    array-length v8, v0

    .line 75
    invoke-virtual {v3}, Lo/rk$b;->c()I

    move-result v0

    sub-int v9, v8, v0

    .line 76
    add-int/lit8 v10, v9, -0x1

    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    :goto_3
    if-ge v12, v10, :cond_4

    .line 81
    const/4 v13, 0x0

    :goto_4
    if-ge v13, v7, :cond_3

    .line 82
    aget-object v0, v6, v13

    iget-object v0, v0, Lo/ri;->a:[B

    move v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v0, v12

    .line 81
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 80
    :cond_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 87
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lo/rk;->b()I

    move-result v0

    const/16 v1, 0x18

    if-ne v0, v1, :cond_5

    const/4 v12, 0x1

    goto :goto_5

    :cond_5
    const/4 v12, 0x0

    .line 88
    :goto_5
    if-eqz v12, :cond_6

    const/16 v13, 0x8

    goto :goto_6

    :cond_6
    move v13, v7

    .line 89
    :goto_6
    const/4 v14, 0x0

    :goto_7
    if-ge v14, v13, :cond_7

    .line 90
    aget-object v0, v6, v14

    iget-object v0, v0, Lo/ri;->a:[B

    add-int/lit8 v1, v9, -0x1

    move v2, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v2, p0, v2

    aput-byte v2, v0, v1

    .line 89
    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    .line 94
    :cond_7
    const/4 v0, 0x0

    aget-object v0, v6, v0

    iget-object v0, v0, Lo/ri;->a:[B

    array-length v14, v0

    .line 95
    move v15, v9

    :goto_8
    if-ge v15, v14, :cond_b

    .line 96
    const/16 v16, 0x0

    :goto_9
    move/from16 v0, v16

    if-ge v0, v7, :cond_a

    .line 97
    if-eqz v12, :cond_8

    add-int/lit8 v0, v16, 0x8

    rem-int v17, v0, v7

    goto :goto_a

    :cond_8
    move/from16 v17, v16

    .line 98
    :goto_a
    if-eqz v12, :cond_9

    move/from16 v0, v17

    const/4 v1, 0x7

    if-le v0, v1, :cond_9

    add-int/lit8 v18, v15, -0x1

    goto :goto_b

    :cond_9
    move/from16 v18, v15

    .line 99
    :goto_b
    aget-object v0, v6, v17

    iget-object v0, v0, Lo/ri;->a:[B

    move v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v0, v18

    .line 96
    add-int/lit8 v16, v16, 0x1

    goto :goto_9

    .line 95
    :cond_a
    add-int/lit8 v15, v15, 0x1

    goto :goto_8

    .line 103
    :cond_b
    move-object/from16 v0, p0

    array-length v0, v0

    if-eq v11, v0, :cond_c

    .line 104
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 107
    :cond_c
    return-object v6
.end method


# virtual methods
.method c()[B
    .locals 1

    .line 115
    iget-object v0, p0, Lo/ri;->a:[B

    return-object v0
.end method

.method d()I
    .locals 1

    .line 111
    iget v0, p0, Lo/ri;->e:I

    return v0
.end method
