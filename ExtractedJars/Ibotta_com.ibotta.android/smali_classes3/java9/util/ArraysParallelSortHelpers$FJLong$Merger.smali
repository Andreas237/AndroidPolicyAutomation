.class final Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;
.super Ljava9/util/concurrent/CountedCompleter;
.source "ArraysParallelSortHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ArraysParallelSortHelpers$FJLong;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Merger"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava9/util/concurrent/CountedCompleter<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field static final serialVersionUID:J = 0x21f3ddce4497ab4cL


# instance fields
.field final a:[J

.field final gran:I

.field final lbase:I

.field final lsize:I

.field final rbase:I

.field final rsize:I

.field final w:[J

.field final wbase:I


# direct methods
.method constructor <init>(Ljava9/util/concurrent/CountedCompleter;[J[JIIIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;[J[JIIIIII)V"
        }
    .end annotation

    .line 722
    invoke-direct {p0, p1}, Ljava9/util/concurrent/CountedCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 723
    iput-object p2, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->a:[J

    iput-object p3, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->w:[J

    .line 724
    iput p4, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->lbase:I

    iput p5, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->lsize:I

    .line 725
    iput p6, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->rbase:I

    iput p7, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->rsize:I

    .line 726
    iput p8, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->wbase:I

    iput p9, p0, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->gran:I

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 21

    move-object/from16 v10, p0

    .line 730
    iget-object v11, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->a:[J

    iget-object v12, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->w:[J

    .line 731
    iget v13, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->lbase:I

    iget v0, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->lsize:I

    iget v14, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->rbase:I

    .line 732
    iget v1, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->rsize:I

    iget v15, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->wbase:I

    iget v9, v10, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->gran:I

    if-eqz v11, :cond_b

    if-eqz v12, :cond_b

    if-ltz v13, :cond_b

    if-ltz v14, :cond_b

    if-ltz v15, :cond_b

    :goto_0
    const/4 v2, 0x0

    const/4 v8, 0x1

    if-lt v0, v1, :cond_3

    if-gt v0, v9, :cond_0

    goto :goto_2

    :cond_0
    ushr-int/lit8 v3, v0, 0x1

    add-int v4, v3, v13

    .line 740
    aget-wide v4, v11, v4

    move v6, v1

    :goto_1
    if-ge v2, v6, :cond_2

    add-int v7, v2, v6

    ushr-int/2addr v7, v8

    add-int v16, v7, v14

    .line 743
    aget-wide v16, v11, v16

    cmp-long v18, v4, v16

    if-gtz v18, :cond_1

    move v6, v7

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    move v2, v7

    goto :goto_1

    :cond_2
    move/from16 v16, v3

    move/from16 v17, v6

    goto :goto_7

    :cond_3
    if-gt v1, v9, :cond_8

    :goto_2
    add-int/2addr v0, v13

    add-int/2addr v1, v14

    :goto_3
    if-ge v13, v0, :cond_5

    if-ge v14, v1, :cond_5

    .line 774
    aget-wide v2, v11, v13

    aget-wide v4, v11, v14

    cmp-long v6, v2, v4

    if-gtz v6, :cond_4

    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v14, v14, 0x1

    move-wide v2, v4

    :goto_4
    add-int/lit8 v4, v15, 0x1

    .line 780
    aput-wide v2, v12, v15

    move v15, v4

    goto :goto_3

    :cond_5
    if-ge v14, v1, :cond_6

    sub-int/2addr v1, v14

    .line 783
    invoke-static {v11, v14, v12, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_6
    if-ge v13, v0, :cond_7

    sub-int/2addr v0, v13

    .line 785
    invoke-static {v11, v13, v12, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 786
    :cond_7
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->tryComplete()V

    return-void

    :cond_8
    ushr-int/lit8 v3, v1, 0x1

    add-int v4, v3, v14

    .line 753
    aget-wide v4, v11, v4

    move v6, v0

    :goto_6
    if-ge v2, v6, :cond_a

    add-int v7, v2, v6

    ushr-int/2addr v7, v8

    add-int v16, v7, v13

    .line 756
    aget-wide v16, v11, v16

    cmp-long v18, v4, v16

    if-gtz v18, :cond_9

    move v6, v7

    goto :goto_6

    :cond_9
    add-int/lit8 v7, v7, 0x1

    move v2, v7

    goto :goto_6

    :cond_a
    move/from16 v17, v3

    move/from16 v16, v6

    .line 762
    :goto_7
    new-instance v18, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;

    add-int v4, v13, v16

    sub-int v5, v0, v16

    add-int v6, v14, v17

    sub-int v7, v1, v17

    add-int v0, v15, v16

    add-int v19, v0, v17

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    move-object v2, v11

    move-object v3, v12

    move-object/from16 v20, v11

    const/4 v11, 0x1

    move/from16 v8, v19

    move/from16 v19, v9

    invoke-direct/range {v0 .. v9}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;-><init>(Ljava9/util/concurrent/CountedCompleter;[J[JIIIIII)V

    .line 767
    invoke-virtual {v10, v11}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->addToPendingCount(I)V

    .line 768
    invoke-virtual/range {v18 .. v18}, Ljava9/util/ArraysParallelSortHelpers$FJLong$Merger;->fork()Ljava9/util/concurrent/ForkJoinTask;

    move/from16 v0, v16

    move/from16 v1, v17

    move-object/from16 v11, v20

    goto/16 :goto_0

    .line 734
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
