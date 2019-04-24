.class Lo/cgh$4;
.super Landroid/support/v4/media/session/MediaControllerCompat$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgh;


# direct methods
.method constructor <init>(Lo/cgh;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cgh$4;->c:Lo/cgh;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 4

    .line 47
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMetadataChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iget-object v0, p0, Lo/cgh$4;->c:Lo/cgh;

    invoke-static {v0, p1}, Lo/cgh;->b(Lo/cgh;Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 49
    return-void
.end method

.method public onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 4

    .line 53
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPlaybackStateChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lo/cgh$4;->c:Lo/cgh;

    invoke-static {v0, p1}, Lo/cgh;->e(Lo/cgh;Landroid/support/v4/media/session/PlaybackStateCompat;)V

    .line 55
    return-void
.end method

.method public onSessionDestroyed()V
    .locals 4

    .line 59
    const-string v0, "Track_SportMusicController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSessionDestroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-super {p0}, Landroid/support/v4/media/session/MediaControllerCompat$Callback;->onSessionDestroyed()V

    .line 61
    iget-object v0, p0, Lo/cgh$4;->c:Lo/cgh;

    invoke-static {v0}, Lo/cgh;->c(Lo/cgh;)V

    .line 62
    iget-object v0, p0, Lo/cgh$4;->c:Lo/cgh;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgh;->a(Lo/cgh;Landroid/support/v4/media/session/MediaControllerCompat;)Landroid/support/v4/media/session/MediaControllerCompat;

    .line 63
    return-void
.end method
