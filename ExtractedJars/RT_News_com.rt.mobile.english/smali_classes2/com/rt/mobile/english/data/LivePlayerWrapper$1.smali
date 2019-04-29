.class Lcom/rt/mobile/english/data/LivePlayerWrapper$1;
.super Ljava/lang/Object;
.source "LivePlayerWrapper.java"

# interfaces
.implements Lcom/google/android/exoplayer2/Player$EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/LivePlayerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadingChanged(Z)V
    .locals 1

    .line 255
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;->loadingChanged(Ljava/lang/Boolean;)V

    :cond_0
    return-void
.end method

.method public onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 0

    return-void
.end method

.method public onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 0

    return-void
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$200(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;->stateChanged(ILjava/lang/Boolean;)V

    :cond_1
    return-void
.end method

.method public onPositionDiscontinuity(I)V
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;->this$0:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-static {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;->onPlayerError(I)V

    :cond_0
    return-void
.end method

.method public onRepeatModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onSeekProcessed()V
    .locals 0

    return-void
.end method

.method public onShuffleModeEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    return-void
.end method
