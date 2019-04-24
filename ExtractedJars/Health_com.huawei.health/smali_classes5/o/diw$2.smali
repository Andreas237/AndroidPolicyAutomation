.class Lo/diw$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/diw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/diw;


# direct methods
.method constructor <init>(Lo/diw;Landroid/os/Looper;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lo/diw$2;->a:Lo/diw;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 274
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 275
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 277
    :sswitch_0
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage no music time out !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lo/diw$2;->a:Lo/diw;

    invoke-static {v0}, Lo/diw;->h(Lo/diw;)Landroid/media/session/MediaSessionManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 280
    iget-object v0, p0, Lo/diw$2;->a:Lo/diw;

    invoke-static {v0}, Lo/diw;->h(Lo/diw;)Landroid/media/session/MediaSessionManager;

    move-result-object v0

    iget-object v1, p0, Lo/diw$2;->a:Lo/diw;

    invoke-static {v1}, Lo/diw;->k(Lo/diw;)Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSessionManager;->removeOnActiveSessionsChangedListener(Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;)V

    .line 282
    :cond_0
    iget-object v0, p0, Lo/diw$2;->a:Lo/diw;

    invoke-virtual {v0}, Lo/diw;->c()V

    .line 283
    .line 286
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_0
    .end sparse-switch
.end method
