.class final Lcom/google/android/youtube/player/YouTubePlayerView$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/youtube/player/internal/t$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/youtube/player/YouTubePlayerView;->a(Landroid/app/Activity;Lcom/google/android/youtube/player/YouTubePlayer$Provider;Ljava/lang/String;Lcom/google/android/youtube/player/YouTubePlayer$OnInitializedListener;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/youtube/player/YouTubePlayerView;


# direct methods
.method constructor <init>(Lcom/google/android/youtube/player/YouTubePlayerView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/youtube/player/YouTubePlayerView$2;->a:Lcom/google/android/youtube/player/YouTubePlayerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/youtube/player/YouTubeInitializationResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/youtube/player/YouTubePlayerView$2;->a:Lcom/google/android/youtube/player/YouTubePlayerView;

    invoke-static {v0, p1}, Lcom/google/android/youtube/player/YouTubePlayerView;->a(Lcom/google/android/youtube/player/YouTubePlayerView;Lcom/google/android/youtube/player/YouTubeInitializationResult;)V

    iget-object p1, p0, Lcom/google/android/youtube/player/YouTubePlayerView$2;->a:Lcom/google/android/youtube/player/YouTubePlayerView;

    invoke-static {p1}, Lcom/google/android/youtube/player/YouTubePlayerView;->b(Lcom/google/android/youtube/player/YouTubePlayerView;)Lcom/google/android/youtube/player/internal/b;

    return-void
.end method
