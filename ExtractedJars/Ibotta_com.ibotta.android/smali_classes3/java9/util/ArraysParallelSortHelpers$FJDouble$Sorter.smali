.class final Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;
.super Ljava9/util/concurrent/CountedCompleter;
.source "ArraysParallelSortHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ArraysParallelSortHelpers$FJDouble;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Sorter"
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
.field final a:[D

.field final base:I

.field final gran:I

.field final size:I

.field final w:[D

.field final wbase:I


# direct methods
.method constructor <init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/concurrent/CountedCompleter<",
            "*>;[D[DIIII)V"
        }
    .end annotation

    .line 910
    invoke-direct {p0, p1}, Ljava9/util/concurrent/CountedCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 911
    iput-object p2, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->a:[D

    iput-object p3, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->w:[D

    iput p4, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->base:I

    iput p5, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->size:I

    .line 912
    iput p6, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->wbase:I

    iput p7, p0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->gran:I

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 25

    move-object/from16 v0, p0

    .line 916
    iget-object v11, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->a:[D

    iget-object v12, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->w:[D

    .line 917
    iget v13, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->base:I

    iget v1, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->size:I

    iget v14, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->wbase:I

    iget v15, v0, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->gran:I

    move-object v7, v0

    move v10, v1

    :goto_0
    if-le v10, v15, :cond_0

    ushr-int/lit8 v16, v10, 0x1

    ushr-int/lit8 v17, v16, 0x1

    add-int v18, v16, v17

    .line 920
    new-instance v9, Ljava9/util/ArraysParallelSortHelpers$Relay;

    new-instance v8, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;

    add-int v19, v14, v16

    sub-int v20, v10, v16

    move-object v1, v8

    move-object v2, v7

    move-object v3, v12

    move-object v4, v11

    move v5, v14

    move/from16 v6, v16

    move/from16 v7, v19

    move-object v0, v8

    move/from16 v8, v20

    move/from16 v20, v14

    move-object v14, v9

    move v9, v13

    move/from16 v21, v10

    move v10, v15

    invoke-direct/range {v1 .. v10}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIIIII)V

    invoke-direct {v14, v0}, Ljava9/util/ArraysParallelSortHelpers$Relay;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 922
    new-instance v0, Ljava9/util/ArraysParallelSortHelpers$Relay;

    new-instance v10, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;

    add-int v22, v13, v16

    add-int v23, v13, v18

    sub-int v21, v21, v18

    move-object v1, v10

    move-object v2, v14

    move-object v3, v11

    move-object v4, v12

    move/from16 v5, v22

    move/from16 v6, v17

    move/from16 v7, v23

    move/from16 v8, v21

    move/from16 v9, v19

    move-object/from16 v24, v14

    move-object v14, v10

    move v10, v15

    invoke-direct/range {v1 .. v10}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIIIII)V

    invoke-direct {v0, v14}, Ljava9/util/ArraysParallelSortHelpers$Relay;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 924
    new-instance v9, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;

    add-int v7, v20, v18

    move-object v1, v9

    move-object v2, v0

    move/from16 v5, v23

    move/from16 v6, v21

    move v8, v15

    invoke-direct/range {v1 .. v8}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIII)V

    invoke-virtual {v9}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->fork()Ljava9/util/concurrent/ForkJoinTask;

    .line 925
    new-instance v9, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;

    move-object v1, v9

    move/from16 v5, v22

    move/from16 v6, v17

    move/from16 v7, v19

    invoke-direct/range {v1 .. v8}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIII)V

    invoke-virtual {v9}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->fork()Ljava9/util/concurrent/ForkJoinTask;

    .line 926
    new-instance v0, Ljava9/util/ArraysParallelSortHelpers$Relay;

    new-instance v14, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;

    add-int v18, v13, v17

    sub-int v16, v16, v17

    move-object v1, v14

    move-object/from16 v2, v24

    move v5, v13

    move/from16 v7, v18

    move/from16 v8, v16

    move/from16 v9, v20

    invoke-direct/range {v1 .. v10}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Merger;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIIIII)V

    invoke-direct {v0, v14}, Ljava9/util/ArraysParallelSortHelpers$Relay;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    .line 928
    new-instance v9, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;

    add-int v7, v20, v17

    move-object v1, v9

    move-object v2, v0

    move/from16 v5, v18

    move/from16 v6, v16

    move v8, v15

    invoke-direct/range {v1 .. v8}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;-><init>(Ljava9/util/concurrent/CountedCompleter;[D[DIIII)V

    invoke-virtual {v9}, Ljava9/util/ArraysParallelSortHelpers$FJDouble$Sorter;->fork()Ljava9/util/concurrent/ForkJoinTask;

    .line 929
    new-instance v7, Ljava9/util/ArraysParallelSortHelpers$EmptyCompleter;

    invoke-direct {v7, v0}, Ljava9/util/ArraysParallelSortHelpers$EmptyCompleter;-><init>(Ljava9/util/concurrent/CountedCompleter;)V

    move/from16 v10, v17

    move/from16 v14, v20

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_0
    move/from16 v21, v10

    move/from16 v20, v14

    add-int v10, v13, v21

    add-int/lit8 v3, v10, -0x1

    move-object v1, v11

    move v2, v13

    move-object v4, v12

    move/from16 v5, v20

    move/from16 v6, v21

    .line 932
    invoke-static/range {v1 .. v6}, Ljava9/util/DualPivotQuicksort;->sort([DII[DII)V

    .line 933
    invoke-virtual {v7}, Ljava9/util/concurrent/CountedCompleter;->tryComplete()V

    return-void
.end method
