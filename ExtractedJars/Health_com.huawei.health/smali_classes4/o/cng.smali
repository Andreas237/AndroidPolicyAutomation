.class public Lo/cng;
.super Lo/aay$e;
.source "SourceFile"


# instance fields
.field private d:Lo/cmo;


# direct methods
.method public constructor <init>(Lo/cmo;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lo/aay$e;-><init>()V

    .line 14
    iput-object p1, p0, Lo/cng;->d:Lo/cmo;

    .line 15
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

    .line 19
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    if-eqz v0, :cond_0

    .line 20
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    invoke-interface {v0, p1}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 22
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

    .line 26
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    invoke-interface {v0, p1}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 29
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

    .line 33
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lo/cng;->d:Lo/cmo;

    invoke-interface {v0, p1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 36
    :cond_0
    return-void
.end method
