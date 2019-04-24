.class Lo/clq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->b(Ljava/util/List;Lo/clx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lo/clx;

.field final synthetic e:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Ljava/util/List;Lo/clx;)V
    .locals 0

    .line 502
    iput-object p1, p0, Lo/clq$5;->e:Lo/clq;

    iput-object p2, p0, Lo/clq$5;->c:Ljava/util/List;

    iput-object p3, p0, Lo/clq$5;->d:Lo/clx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 506
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 507
    iget-object v0, p0, Lo/clq$5;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 509
    :try_start_0
    new-instance v10, Landroid/util/SparseArray;

    invoke-direct {v10}, Landroid/util/SparseArray;-><init>()V

    .line 510
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 511
    iget-object v0, p0, Lo/clq$5;->e:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$5;->c:Ljava/util/List;

    new-instance v2, Lo/clq$5$1;

    move-object v3, p0

    move-object v4, v11

    move-object v5, v10

    move-wide v6, v8

    invoke-direct/range {v2 .. v7}, Lo/clq$5$1;-><init>(Lo/clq$5;Ljava/util/List;Landroid/util/SparseArray;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->d(Ljava/util/List;Lo/cld;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 532
    goto :goto_0

    .line 528
    :catch_0
    move-exception v10

    .line 529
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget-object v0, p0, Lo/clq$5;->d:Lo/clx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 531
    iget-object v0, p0, Lo/clq$5;->d:Lo/clx;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/clx;->d(Landroid/util/SparseArray;II)V

    .line 533
    :cond_0
    :goto_0
    return-void
.end method
