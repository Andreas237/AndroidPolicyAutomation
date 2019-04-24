.class Lo/clq$23$4;
.super Lo/clf$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$23;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/clq$23;


# direct methods
.method constructor <init>(Lo/clq$23;)V
    .locals 0

    .line 1407
    iput-object p1, p0, Lo/clq$23$4;->c:Lo/clq$23;

    invoke-direct {p0}, Lo/clf$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1411
    iget-object v0, p0, Lo/clq$23$4;->c:Lo/clq$23;

    iget-object v0, v0, Lo/clq$23;->a:Lo/cmb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1412
    return-void

    .line 1414
    :cond_0
    iget-object v0, p0, Lo/clq$23$4;->c:Lo/clq$23;

    iget-object v0, v0, Lo/clq$23;->a:Lo/cmb;

    invoke-interface {v0, p1}, Lo/cmb;->b(Ljava/util/List;)V

    .line 1415
    return-void
.end method
