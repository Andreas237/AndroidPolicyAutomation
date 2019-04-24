.class Lo/clq$20$5;
.super Lo/cla$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq$20;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/clq$20;


# direct methods
.method constructor <init>(Lo/clq$20;)V
    .locals 0

    .line 1078
    iput-object p1, p0, Lo/clq$20$5;->a:Lo/clq$20;

    invoke-direct {p0}, Lo/cla$e;-><init>()V

    return-void
.end method


# virtual methods
.method public d(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1087
    iget-object v0, p0, Lo/clq$20$5;->a:Lo/clq$20;

    iget-object v0, v0, Lo/clq$20;->e:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1088
    iget-object v0, p0, Lo/clq$20$5;->a:Lo/clq$20;

    iget-object v0, v0, Lo/clq$20;->e:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1089
    :cond_0
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1081
    iget-object v0, p0, Lo/clq$20$5;->a:Lo/clq$20;

    iget-object v0, v0, Lo/clq$20;->e:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1082
    iget-object v0, p0, Lo/clq$20$5;->a:Lo/clq$20;

    iget-object v0, v0, Lo/clq$20;->e:Lo/clz;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/clz;->onSuccess(ILjava/lang/Object;)V

    .line 1083
    :cond_0
    return-void
.end method
