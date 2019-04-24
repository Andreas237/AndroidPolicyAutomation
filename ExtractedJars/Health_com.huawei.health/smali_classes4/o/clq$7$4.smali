.class Lo/clq$7$4;
.super Lo/clj$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$7;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroid/util/SparseArray;

.field final synthetic d:Lo/clq$7;


# direct methods
.method constructor <init>(Lo/clq$7;Ljava/util/List;Landroid/util/SparseArray;J)V
    .locals 0

    .line 621
    iput-object p1, p0, Lo/clq$7$4;->d:Lo/clq$7;

    iput-object p2, p0, Lo/clq$7$4;->b:Ljava/util/List;

    iput-object p3, p0, Lo/clq$7$4;->c:Landroid/util/SparseArray;

    iput-wide p4, p0, Lo/clq$7$4;->a:J

    invoke-direct {p0}, Lo/clj$d;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 625
    iget-object v0, p0, Lo/clq$7$4;->d:Lo/clq$7;

    iget-object v0, v0, Lo/clq$7;->e:Lo/cmd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 626
    return-void

    .line 629
    :cond_0
    invoke-static {}, Lo/clq;->b()Landroid/content/Context;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move v3, p3

    iget-object v4, p0, Lo/clq$7$4;->b:Ljava/util/List;

    iget-object v5, p0, Lo/clq$7$4;->c:Landroid/util/SparseArray;

    invoke-static/range {v0 .. v5}, Lo/cnm;->e(Landroid/content/Context;Ljava/util/List;IILjava/util/List;Landroid/util/SparseArray;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 630
    return-void

    .line 633
    :cond_1
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData option = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/clq$7$4;->d:Lo/clq$7;

    iget-object v2, v2, Lo/clq$7;->c:Lcom/huawei/hihealth/HiDataReadOption;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "errorCode is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", totalTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$7$4;->a:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    iget-object v0, p0, Lo/clq$7$4;->d:Lo/clq$7;

    iget-object v0, v0, Lo/clq$7;->e:Lo/cmd;

    iget-object v1, p0, Lo/clq$7$4;->c:Landroid/util/SparseArray;

    invoke-interface {v0, v1, p2, p3}, Lo/cmd;->d(Ljava/lang/Object;II)V

    .line 635
    return-void
.end method
