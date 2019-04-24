.class Lo/dja$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dja;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dja;


# direct methods
.method constructor <init>(Lo/dja;Landroid/os/Looper;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/dja$3;->a:Lo/dja;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 136
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 137
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 139
    :sswitch_0
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage remote control init!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :try_start_0
    iget-object v0, p0, Lo/dja$3;->a:Lo/dja;

    invoke-static {v0}, Lo/dja;->c(Lo/dja;)Lo/dju;

    move-result-object v0

    invoke-interface {v0}, Lo/dju;->e()V

    .line 142
    iget-object v0, p0, Lo/dja$3;->a:Lo/dja;

    invoke-static {v0}, Lo/dja;->c(Lo/dja;)Lo/dju;

    move-result-object v0

    iget-object v1, p0, Lo/dja$3;->a:Lo/dja;

    invoke-static {v1}, Lo/dja;->d(Lo/dja;)Lo/djq$b;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dju;->d(Lo/djq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    goto :goto_0

    .line 143
    :catch_0
    move-exception v4

    .line 144
    const-string v0, "MusicRemoteController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ControlMusic Remote Controller MSG_ACTION_REMOTE_CONTROL "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    .line 149
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
    .end sparse-switch
.end method
