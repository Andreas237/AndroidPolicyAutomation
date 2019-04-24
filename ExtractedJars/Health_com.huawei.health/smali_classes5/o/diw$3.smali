.class Lo/diw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/session/MediaSessionManager$OnActiveSessionsChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/diw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/diw;


# direct methods
.method constructor <init>(Lo/diw;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActiveSessionsChanged(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/media/session/MediaController;>;)V"
        }
    .end annotation

    .line 227
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActiveSessionsChanged   size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 229
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActiveSessionsChanged  null != mControllerTest "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 233
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->f(Lo/diw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 234
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/diw;->b(Lo/diw;Z)Z

    .line 236
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->g(Lo/diw;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaController;

    invoke-virtual {v1}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 238
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    iget-object v1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v1}, Lo/diw;->i(Lo/diw;)Landroid/media/session/MediaController$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 239
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaController;

    invoke-static {v0, v1}, Lo/diw;->a(Lo/diw;Landroid/media/session/MediaController;)Landroid/media/session/MediaController;

    .line 240
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    iget-object v1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v1}, Lo/diw;->i(Lo/diw;)Landroid/media/session/MediaController$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;)V

    .line 241
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    iget-object v1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v1}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/diw;->e(Lo/diw;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 245
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    invoke-interface {v0}, Lo/dir$e;->d()V

    goto/16 :goto_0

    .line 250
    :cond_0
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/diw;->e(Lo/diw;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->f(Lo/diw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 252
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->f(Lo/diw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x14

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 253
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/diw;->b(Lo/diw;Z)Z

    .line 254
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 255
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->e(Lo/diw;)Lo/dir$e;

    move-result-object v0

    invoke-interface {v0}, Lo/dir$e;->d()V

    goto :goto_0

    .line 258
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 260
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActiveSessionsChanged  null == mControllerTest "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaController;

    invoke-static {v0, v1}, Lo/diw;->a(Lo/diw;Landroid/media/session/MediaController;)Landroid/media/session/MediaController;

    .line 262
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v0}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v0

    iget-object v1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v1}, Lo/diw;->i(Lo/diw;)Landroid/media/session/MediaController$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;)V

    .line 263
    iget-object v0, p0, Lo/diw$3;->d:Lo/diw;

    iget-object v1, p0, Lo/diw$3;->d:Lo/diw;

    invoke-static {v1}, Lo/diw;->d(Lo/diw;)Landroid/media/session/MediaController;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/diw;->e(Lo/diw;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    const-string v0, "MusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActiveSessionsChanged   packagename:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/session/MediaController;

    invoke-virtual {v3}, Landroid/media/session/MediaController;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :cond_2
    :goto_0
    return-void
.end method
