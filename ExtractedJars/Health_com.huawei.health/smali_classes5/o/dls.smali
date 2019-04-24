.class public Lo/dls;
.super Lo/dle$c;
.source "SourceFile"


# instance fields
.field private a:Lo/dlq;

.field private c:Landroid/content/Context;

.field private e:Lo/dlf;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Lo/dle$c;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dls;->a:Lo/dlq;

    .line 28
    iput-object p1, p0, Lo/dls;->c:Landroid/content/Context;

    .line 29
    iget-object v0, p0, Lo/dls;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    iput-object v0, p0, Lo/dls;->e:Lo/dlf;

    .line 30
    new-instance v0, Lo/dlq;

    invoke-direct {v0, p1}, Lo/dlq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dls;->a:Lo/dlq;

    .line 31
    return-void
.end method


# virtual methods
.method public c(ILo/dli;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 35
    const-string v0, "SMART_SmartInteractBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSmartMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    iget-object v0, p0, Lo/dls;->e:Lo/dlf;

    invoke-virtual {v0}, Lo/dlf;->d()V

    .line 37
    iget-object v0, p0, Lo/dls;->e:Lo/dlf;

    new-instance v1, Lo/dls$1;

    invoke-direct {v1, p0, p2}, Lo/dls$1;-><init>(Lo/dls;Lo/dli;)V

    invoke-virtual {v0, p1, v1}, Lo/dlf;->a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 63
    return-void
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 67
    const-string v0, "SMART_SmartInteractBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SmartBinder onTransact"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lo/dls;->a:Lo/dlq;

    invoke-virtual {v0}, Lo/dlq;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Landroid/os/RemoteException;

    const-string v1, "hw permission check failed"

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lo/dle$c;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0
.end method
