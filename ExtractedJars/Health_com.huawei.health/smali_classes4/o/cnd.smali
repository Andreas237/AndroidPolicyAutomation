.class public Lo/cnd;
.super Lo/aay$e;
.source "SourceFile"


# instance fields
.field private e:Lo/cms;


# direct methods
.method public constructor <init>(Lo/cms;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lo/aay$e;-><init>()V

    .line 15
    iput-object p1, p0, Lo/cnd;->e:Lo/cms;

    .line 16
    return-void
.end method


# virtual methods
.method public c(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    invoke-interface {v0, p1}, Lo/cms;->a(Landroid/os/Bundle;)V

    .line 24
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    invoke-interface {v0, p1}, Lo/cms;->e(Landroid/os/Bundle;)V

    .line 32
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lo/cnd;->e:Lo/cms;

    invoke-interface {v0, p1}, Lo/cms;->d(Landroid/os/Bundle;)V

    .line 39
    :cond_0
    return-void
.end method
