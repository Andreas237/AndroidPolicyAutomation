.class Lo/cec$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cec;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cec;


# direct methods
.method constructor <init>(Lo/cec;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lo/cec$10;->c:Lo/cec;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 4

    .line 426
    const-string v0, "Track_MediaPlayerVoiceEng"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playSound release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    iget-object v0, p0, Lo/cec$10;->c:Lo/cec;

    invoke-static {v0}, Lo/cec;->e(Lo/cec;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 428
    iget-object v0, p0, Lo/cec$10;->c:Lo/cec;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cec;->a(Lo/cec;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;

    .line 429
    iget-object v0, p0, Lo/cec$10;->c:Lo/cec;

    invoke-static {v0}, Lo/cec;->g(Lo/cec;)I

    .line 430
    iget-object v0, p0, Lo/cec$10;->c:Lo/cec;

    invoke-static {v0}, Lo/cec;->h(Lo/cec;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lo/cec$10;->c:Lo/cec;

    invoke-static {v0}, Lo/cec;->h(Lo/cec;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 433
    :cond_0
    return-void
.end method
