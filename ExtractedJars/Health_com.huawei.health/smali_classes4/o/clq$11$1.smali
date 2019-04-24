.class Lo/clq$11$1;
.super Lo/cli$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$11;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq$11;

.field final synthetic b:J


# direct methods
.method constructor <init>(Lo/clq$11;J)V
    .locals 0

    .line 866
    iput-object p1, p0, Lo/clq$11$1;->a:Lo/clq$11;

    iput-wide p2, p0, Lo/clq$11$1;->b:J

    invoke-direct {p0}, Lo/cli$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 869
    iget-object v0, p0, Lo/clq$11$1;->a:Lo/clq$11;

    iget-object v0, v0, Lo/clq$11;->b:Lo/cmc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 870
    iget-object v0, p0, Lo/clq$11$1;->a:Lo/clq$11;

    iget-object v0, v0, Lo/clq$11;->b:Lo/cmc;

    invoke-interface {v0, p1}, Lo/cmc;->a(Ljava/util/List;)V

    .line 871
    :cond_0
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchPhoneDataClient cost time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lo/clq$11$1;->b:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    return-void
.end method
