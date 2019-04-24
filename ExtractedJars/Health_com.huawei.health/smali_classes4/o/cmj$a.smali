.class Lo/cmj$a;
.super Lo/abd$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private b:Lo/cmo;

.field private c:Lo/cmq;


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 650
    iget-object v0, p0, Lo/cmj$a;->c:Lo/cmq;

    if-eqz v0, :cond_0

    .line 651
    iget-object v0, p0, Lo/cmj$a;->c:Lo/cmq;

    invoke-interface {v0, p1}, Lo/cmq;->a(Landroid/os/Bundle;)V

    .line 654
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 636
    iget-object v0, p0, Lo/cmj$a;->b:Lo/cmo;

    if-eqz v0, :cond_1

    .line 637
    if-eqz p1, :cond_0

    .line 638
    iget-object v0, p0, Lo/cmj$a;->b:Lo/cmo;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 640
    :cond_0
    iget-object v0, p0, Lo/cmj$a;->b:Lo/cmo;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 643
    :cond_1
    :goto_0
    return-void
.end method
