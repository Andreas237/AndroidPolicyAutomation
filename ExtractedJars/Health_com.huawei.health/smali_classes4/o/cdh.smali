.class public Lo/cdh;
.super Lo/cdc;
.source "SourceFile"


# instance fields
.field private b:Lo/cde;

.field private c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 1

    .line 14
    invoke-direct {p0, p1}, Lo/cdc;-><init>(Lo/cdk;)V

    .line 15
    invoke-virtual {p0}, Lo/cdh;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->d()Lo/cde;

    move-result-object v0

    iput-object v0, p0, Lo/cdh;->b:Lo/cde;

    .line 16
    invoke-virtual {p0}, Lo/cdh;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->c()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lo/cdh;->e:Ljava/util/LinkedList;

    .line 17
    invoke-virtual {p0}, Lo/cdh;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lo/cdh;->c:Ljava/util/LinkedList;

    .line 18
    return-void
.end method

.method private a([D)D
    .locals 8

    .line 116
    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 117
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0

    .line 119
    :cond_0
    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    mul-double/2addr v0, v2

    const/4 v2, 0x1

    aget-wide v2, p1, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    const/4 v2, 0x2

    aget-wide v2, p1, v2

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    div-double v6, v0, v2

    .line 120
    return-wide v6
.end method

.method private c(Ljava/util/LinkedList;Ljava/util/LinkedList;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/LinkedList<Lo/cgn;>;Ljava/util/LinkedList<Lo/cgn;>;)V"
        }
    .end annotation

    .line 33
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedList;->size()I

    move-result v4

    .line 34
    const/4 v0, 0x3

    if-ge v4, v0, :cond_0

    .line 35
    return-void

    .line 38
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/LinkedList;->size()I

    move-result v5

    .line 39
    if-nez v5, :cond_1

    .line 40
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cgn;

    .line 41
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cgn;

    .line 42
    move-object/from16 v0, p1

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cgn;

    .line 44
    const/4 v0, 0x3

    new-array v9, v0, [D

    .line 45
    invoke-virtual {v6}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v9, v2

    .line 46
    invoke-virtual {v7}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v9, v2

    .line 47
    invoke-virtual {v8}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v9, v2

    .line 48
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lo/cdh;->a([D)D

    move-result-wide v10

    .line 49
    invoke-virtual {v6}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v9, v2

    .line 50
    invoke-virtual {v7}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v9, v2

    .line 51
    invoke-virtual {v8}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v9, v2

    .line 52
    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lo/cdh;->a([D)D

    move-result-wide v12

    .line 54
    new-instance v14, Lo/cgn;

    invoke-direct {v14, v6}, Lo/cgn;-><init>(Lo/cgn;)V

    .line 55
    invoke-virtual {v14, v10, v11}, Lo/cgn;->d(D)V

    .line 56
    invoke-virtual {v14, v12, v13}, Lo/cgn;->a(D)V

    .line 58
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 59
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/cgn;->c(Z)V

    .line 63
    :cond_1
    const/4 v6, 0x0

    :goto_0
    add-int/lit8 v0, v4, -0x1

    if-ge v6, v0, :cond_6

    .line 64
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cgn;

    .line 65
    invoke-virtual {v7}, Lo/cgn;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    goto/16 :goto_1

    .line 70
    :cond_2
    if-nez v6, :cond_3

    .line 71
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 72
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/cgn;->c(Z)V

    .line 73
    goto/16 :goto_1

    .line 76
    :cond_3
    add-int/lit8 v0, v6, -0x1

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cgn;

    .line 77
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cgn;

    .line 78
    add-int/lit8 v0, v6, 0x1

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/cgn;

    .line 80
    invoke-virtual {v10}, Lo/cgn;->c()J

    move-result-wide v0

    invoke-virtual {v9}, Lo/cgn;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/cdh;->b:Lo/cde;

    invoke-virtual {v2}, Lo/cde;->h()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 81
    invoke-virtual {v9}, Lo/cgn;->c()J

    move-result-wide v0

    invoke-virtual {v8}, Lo/cgn;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/cdh;->b:Lo/cde;

    invoke-virtual {v2}, Lo/cde;->h()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 88
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/cgn;->c(Z)V

    .line 89
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/cgn;->c(Z)V

    .line 90
    move-object/from16 v0, p2

    invoke-virtual {v0, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 92
    :cond_5
    const/4 v0, 0x3

    new-array v11, v0, [D

    .line 93
    invoke-virtual {v8}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v11, v2

    .line 94
    invoke-virtual {v9}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v11, v2

    .line 95
    invoke-virtual {v10}, Lo/cgn;->e()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v11, v2

    .line 96
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/cdh;->d([D)D

    move-result-wide v12

    .line 97
    invoke-virtual {v8}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v11, v2

    .line 98
    invoke-virtual {v9}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v11, v2

    .line 99
    invoke-virtual {v10}, Lo/cgn;->b()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v11, v2

    .line 100
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/cdh;->d([D)D

    move-result-wide v14

    .line 102
    new-instance v0, Lo/cgn;

    move-object v1, v7

    invoke-direct {v0, v1}, Lo/cgn;-><init>(Lo/cgn;)V

    move-object/from16 v16, v0

    .line 103
    move-object/from16 v0, v16

    invoke-virtual {v0, v12, v13}, Lo/cgn;->d(D)V

    .line 104
    move-object/from16 v0, v16

    invoke-virtual {v0, v14, v15}, Lo/cgn;->a(D)V

    .line 106
    move-object/from16 v0, p2

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 108
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/cgn;->c(Z)V

    .line 63
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 113
    :cond_6
    return-void
.end method

.method private d([D)D
    .locals 6

    .line 124
    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 125
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    return-wide v0

    .line 127
    :cond_0
    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const/4 v2, 0x1

    aget-wide v2, p1, v2

    add-double/2addr v0, v2

    const/4 v2, 0x2

    aget-wide v2, p1, v2

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double v4, v0, v2

    .line 128
    return-wide v4
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 3

    .line 22
    iget-object v0, p0, Lo/cdh;->e:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v2

    .line 23
    iget-object v0, p0, Lo/cdh;->b:Lo/cde;

    invoke-virtual {v0}, Lo/cde;->g()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 24
    const/4 v0, 0x0

    return v0

    .line 27
    :cond_0
    iget-object v0, p0, Lo/cdh;->e:Ljava/util/LinkedList;

    iget-object v1, p0, Lo/cdh;->c:Ljava/util/LinkedList;

    invoke-direct {p0, v0, v1}, Lo/cdh;->c(Ljava/util/LinkedList;Ljava/util/LinkedList;)V

    .line 29
    const/4 v0, 0x0

    return v0
.end method
