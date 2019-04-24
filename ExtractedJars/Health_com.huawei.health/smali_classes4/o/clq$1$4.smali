.class Lo/clq$1$4;
.super Lo/clb$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lo/clq$1;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/clq$1;Ljava/util/List;J)V
    .locals 0

    .line 473
    iput-object p1, p0, Lo/clq$1$4;->b:Lo/clq$1;

    iput-object p2, p0, Lo/clq$1$4;->a:Ljava/util/List;

    iput-wide p3, p0, Lo/clq$1$4;->e:J

    invoke-direct {p0}, Lo/clb$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 477
    iget-object v0, p0, Lo/clq$1$4;->b:Lo/clq$1;

    iget-object v0, v0, Lo/clq$1;->c:Lo/cly;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 478
    return-void

    .line 481
    :cond_0
    iget-object v0, p0, Lo/clq$1$4;->a:Ljava/util/List;

    invoke-static {p1, p3, v0}, Lo/cnm;->c(Ljava/util/List;ILjava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 482
    return-void

    .line 486
    :cond_1
    iget-object v0, p0, Lo/clq$1$4;->b:Lo/clq$1;

    iget-object v0, v0, Lo/clq$1;->c:Lo/cly;

    iget-object v1, p0, Lo/clq$1$4;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lo/clq$1$4;->a:Ljava/util/List;

    :goto_0
    invoke-interface {v0, v1, p2, p3}, Lo/cly;->onResult(Ljava/util/List;II)V

    .line 487
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aggregateHiHealthData errorCode is "

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

    iget-wide v4, p0, Lo/clq$1$4;->e:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    return-void
.end method
