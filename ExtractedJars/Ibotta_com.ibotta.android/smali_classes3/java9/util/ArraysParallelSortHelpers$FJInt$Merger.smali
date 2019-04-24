.class final Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;
.super Ljava9/util/concurrent/CountedCompleter;
.source "ArraysParallelSortHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ArraysParallelSortHelpers$FJInt;
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
.field final a:[I

.field final gran:I

.field final lbase:I

.field final lsize:I

.field final rbase:I

.field final rsize:I

.field final w:[I

.field final wbase:I


# direct methods
.method constructor <init>(Ljava9/util/concurrent/CountedCompleter;[I[IIIIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;[I[IIIIIII)V"
        }
    .end annotation

    .line 611
    invoke-direct {p0, p1}, Ljava9/util/concurrent/CountedCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 612
    iput-object p2, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->a:[I

    iput-object p3, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->w:[I

    .line 613
    iput p4, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->lbase:I

    iput p5, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->lsize:I

    .line 614
    iput p6, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->rbase:I

    iput p7, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->rsize:I

    .line 615
    iput p8, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->wbase:I

    iput p9, p0, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->gran:I

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 21

    move-object/from16 v10, p0

    .line 619
    iget-object v11, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->a:[I

    iget-object v12, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->w:[I

    .line 620
    iget v13, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->lbase:I

    iget v0, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->lsize:I

    iget v14, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->rbase:I

    .line 621
    iget v1, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->rsize:I

    iget v15, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->wbase:I

    iget v9, v10, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->gran:I

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

    .line 629
    aget v4, v11, v4

    move v5, v1

    :goto_1
    if-ge v2, v5, :cond_2

    add-int v6, v2, v5

    ushr-int/2addr v6, v8

    add-int v7, v6, v14

    .line 632
    aget v7, v11, v7

    if-gt v4, v7, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    move v2, v6

    goto :goto_1

    :cond_2
    move/from16 v16, v3

    move/from16 v17, v5

    goto :goto_7

    :cond_3
    if-gt v1, v9, :cond_8

    :goto_2
    add-int/2addr v0, v13

    add-int/2addr v1, v14

    :goto_3
    if-ge v13, v0, :cond_5

    if-ge v14, v1, :cond_5

    .line 663
    aget v2, v11, v13

    aget v3, v11, v14

    if-gt v2, v3, :cond_4

    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v14, v14, 0x1

    move v2, v3

    :goto_4
    add-int/lit8 v3, v15, 0x1

    .line 669
    aput v2, v12, v15

    move v15, v3

    goto :goto_3

    :cond_5
    if-ge v14, v1, :cond_6

    sub-int/2addr v1, v14

    .line 672
    invoke-static {v11, v14, v12, v15, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_5

    :cond_6
    if-ge v13, v0, :cond_7

    sub-int/2addr v0, v13

    .line 674
    invoke-static {v11, v13, v12, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 675
    :cond_7
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->tryComplete()V

    return-void

    :cond_8
    ushr-int/lit8 v3, v1, 0x1

    add-int v4, v3, v14

    .line 642
    aget v4, v11, v4

    move v5, v0

    :goto_6
    if-ge v2, v5, :cond_a

    add-int v6, v2, v5

    ushr-int/2addr v6, v8

    add-int v7, v6, v13

    .line 645
    aget v7, v11, v7

    if-gt v4, v7, :cond_9

    move v5, v6

    goto :goto_6

    :cond_9
    add-int/lit8 v6, v6, 0x1

    move v2, v6

    goto :goto_6

    :cond_a
    move/from16 v17, v3

    move/from16 v16, v5

    .line 651
    :goto_7
    new-instance v18, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;

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

    invoke-direct/range {v0 .. v9}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;-><init>(Ljava9/util/concurrent/CountedCompleter;[I[IIIIIII)V

    .line 656
    invoke-virtual {v10, v11}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->addToPendingCount(I)V

    .line 657
    invoke-virtual/range {v18 .. v18}, Ljava9/util/ArraysParallelSortHelpers$FJInt$Merger;->fork()Ljava9/util/concurrent/ForkJoinTask;

    move/from16 v0, v16

    move/from16 v1, v17

    move-object/from16 v11, v20

    goto/16 :goto_0

    .line 623
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
