.class public Lo/cnf;
.super Lo/abg$e;
.source "SourceFile"


# instance fields
.field private d:Lo/cmq;


# direct methods
.method public constructor <init>(Lo/cmq;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/abg$e;-><init>()V

    .line 20
    iput-object p1, p0, Lo/cnf;->d:Lo/cmq;

    .line 21
    return-void
.end method


# virtual methods
.method public b(Lo/cmq;)Z
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cnf;->d:Lo/cmq;

    if-ne v0, p1, :cond_0

    .line 26
    const/4 v0, 0x1

    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lo/cnf;->d:Lo/cmq;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lo/cnf;->d:Lo/cmq;

    invoke-interface {v0, p1}, Lo/cmq;->a(Landroid/os/Bundle;)V

    .line 40
    :cond_0
    return-void
.end method
