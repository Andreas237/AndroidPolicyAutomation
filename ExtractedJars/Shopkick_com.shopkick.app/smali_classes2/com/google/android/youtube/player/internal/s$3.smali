.class final Lcom/google/android/youtube/player/internal/s$3;
.super Lcom/google/android/youtube/player/internal/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/youtube/player/internal/s;->setPlayerStateChangeListener(Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

.field final synthetic b:Lcom/google/android/youtube/player/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/youtube/player/internal/s;Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/youtube/player/internal/s$3;->b:Lcom/google/android/youtube/player/internal/s;

    iput-object p2, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-direct {p0}, Lcom/google/android/youtube/player/internal/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onLoading()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0, p1}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onLoaded(Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onAdStarted()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, Lcom/google/android/youtube/player/YouTubePlayer$ErrorReason;->valueOf(Ljava/lang/String;)Lcom/google/android/youtube/player/YouTubePlayer$ErrorReason;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Lcom/google/android/youtube/player/YouTubePlayer$ErrorReason;->UNKNOWN:Lcom/google/android/youtube/player/YouTubePlayer$ErrorReason;

    :goto_0
    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0, p1}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onError(Lcom/google/android/youtube/player/YouTubePlayer$ErrorReason;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onVideoStarted()V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/s$3;->a:Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;

    invoke-interface {v0}, Lcom/google/android/youtube/player/YouTubePlayer$PlayerStateChangeListener;->onVideoEnded()V

    return-void
.end method
