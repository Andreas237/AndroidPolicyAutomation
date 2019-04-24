.class Lo/clq$5$1;
.super Lo/cld$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:J

.field final synthetic d:Lo/clq$5;

.field final synthetic e:Landroid/util/SparseArray;


# direct methods
.method constructor <init>(Lo/clq$5;Ljava/util/List;Landroid/util/SparseArray;J)V
    .locals 0

    .line 511
    iput-object p1, p0, Lo/clq$5$1;->d:Lo/clq$5;

    iput-object p2, p0, Lo/clq$5$1;->a:Ljava/util/List;

    iput-object p3, p0, Lo/clq$5$1;->e:Landroid/util/SparseArray;

    iput-wide p4, p0, Lo/clq$5$1;->c:J

    invoke-direct {p0}, Lo/cld$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 515
    iget-object v0, p0, Lo/clq$5$1;->d:Lo/clq$5;

    iget-object v0, v0, Lo/clq$5;->d:Lo/clx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 516
    return-void

    .line 519
    :cond_0
    iget-object v0, p0, Lo/clq$5$1;->a:Ljava/util/List;

    iget-object v1, p0, Lo/clq$5$1;->e:Landroid/util/SparseArray;

    invoke-static {p1, p2, p3, v0, v1}, Lo/cnm;->c(Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 520
    return-void

    .line 524
    :cond_1
    iget-object v0, p0, Lo/clq$5$1;->d:Lo/clq$5;

    iget-object v0, v0, Lo/clq$5;->d:Lo/clx;

    iget-object v1, p0, Lo/clq$5$1;->e:Landroid/util/SparseArray;

    invoke-interface {v0, v1, p2, p3}, Lo/clx;->d(Landroid/util/SparseArray;II)V

    .line 525
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthDataEx errorCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cost time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$5$1;->c:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    return-void
.end method
