.class final Lo/ui;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final c:I


# direct methods
.method private constructor <init>(I[B)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput p1, p0, Lo/ui;->c:I

    .line 33
    iput-object p2, p0, Lo/ui;->a:[B

    .line 34
    return-void
.end method

.method static c([BLo/un;Lo/ul;)[Lo/ui;
    .locals 16

    .line 51
    move-object/from16 v0, p0

    array-length v0, v0

    invoke-virtual/range {p1 .. p1}, Lo/un;->c()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 52
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 57
    :cond_0
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/un;->b(Lo/ul;)Lo/un$b;

    move-result-object v3

    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-virtual {v3}, Lo/un$b;->d()[Lo/un$e;

    move-result-object v5

    .line 62
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 63
    invoke-virtual {v9}, Lo/un$e;->c()I

    move-result v0

    add-int/2addr v4, v0

    .line 62
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 67
    :cond_1
    new-array v6, v4, [Lo/ui;

    .line 68
    const/4 v7, 0x0

    .line 69
    move-object v8, v5

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    .line 70
    const/4 v12, 0x0

    :goto_2
    invoke-virtual {v11}, Lo/un$e;->c()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 71
    invoke-virtual {v11}, Lo/un$e;->b()I

    move-result v13

    .line 72
    invoke-virtual {v3}, Lo/un$b;->b()I

    move-result v0

    add-int v14, v0, v13

    .line 73
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    new-instance v1, Lo/ui;

    new-array v2, v14, [B

    invoke-direct {v1, v13, v2}, Lo/ui;-><init>(I[B)V

    aput-object v1, v6, v0

    .line 70
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 69
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 79
    :cond_3
    const/4 v0, 0x0

    aget-object v0, v6, v0

    iget-object v0, v0, Lo/ui;->a:[B

    array-length v8, v0

    .line 80
    array-length v0, v6

    add-int/lit8 v9, v0, -0x1

    .line 81
    :goto_3
    if-ltz v9, :cond_5

    .line 82
    aget-object v0, v6, v9

    iget-object v0, v0, Lo/ui;->a:[B

    array-length v10, v0

    .line 83
    if-ne v10, v8, :cond_4

    .line 84
    goto :goto_4

    .line 86
    :cond_4
    add-int/lit8 v9, v9, -0x1

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 90
    invoke-virtual {v3}, Lo/un$b;->b()I

    move-result v0

    sub-int v10, v8, v0

    .line 93
    const/4 v11, 0x0

    .line 94
    const/4 v12, 0x0

    :goto_5
    if-ge v12, v10, :cond_7

    .line 95
    const/4 v13, 0x0

    :goto_6
    if-ge v13, v7, :cond_6

    .line 96
    aget-object v0, v6, v13

    iget-object v0, v0, Lo/ui;->a:[B

    move v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v0, v12

    .line 95
    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    .line 94
    :cond_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 100
    :cond_7
    move v12, v9

    :goto_7
    if-ge v12, v7, :cond_8

    .line 101
    aget-object v0, v6, v12

    iget-object v0, v0, Lo/ui;->a:[B

    move v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v0, v10

    .line 100
    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    .line 104
    :cond_8
    const/4 v0, 0x0

    aget-object v0, v6, v0

    iget-object v0, v0, Lo/ui;->a:[B

    array-length v12, v0

    .line 105
    move v13, v10

    :goto_8
    if-ge v13, v12, :cond_b

    .line 106
    const/4 v14, 0x0

    :goto_9
    if-ge v14, v7, :cond_a

    .line 107
    if-ge v14, v9, :cond_9

    move v15, v13

    goto :goto_a

    :cond_9
    add-int/lit8 v15, v13, 0x1

    .line 108
    :goto_a
    aget-object v0, v6, v14

    iget-object v0, v0, Lo/ui;->a:[B

    move v1, v11

    add-int/lit8 v11, v11, 0x1

    aget-byte v1, p0, v1

    aput-byte v1, v0, v15

    .line 106
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    .line 105
    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    .line 111
    :cond_b
    return-object v6
.end method


# virtual methods
.method b()[B
    .locals 1

    .line 119
    iget-object v0, p0, Lo/ui;->a:[B

    return-object v0
.end method

.method d()I
    .locals 1

    .line 115
    iget v0, p0, Lo/ui;->c:I

    return v0
.end method
