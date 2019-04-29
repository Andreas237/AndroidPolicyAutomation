.class public final Lcom/google/android/youtube/player/YouTubeStandalonePlayer;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Intent;Landroid/app/Activity;Ljava/lang/String;IZZ)Landroid/content/Intent;
    .locals 2

    invoke-static {p0, p1}, Lcom/google/android/youtube/player/YouTubeIntents;->a(Landroid/content/Intent;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "developer_key"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "autoplay"

    invoke-virtual {p2, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p2

    const-string p4, "lightbox_mode"

    invoke-virtual {p2, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p2

    const-string p4, "start_time_millis"

    invoke-virtual {p2, p4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p2

    const-string p3, "window_has_status_bar"

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public static createPlaylistIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->createPlaylistIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IIZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static createPlaylistIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IIZZ)Landroid/content/Intent;
    .locals 7

    if-nez p2, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The playlistId cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    if-nez p1, :cond_1

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The developerKey cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.youtube.api.StandalonePlayerActivity.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "playlist_id"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "current_index"

    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    move-object v2, p0

    move-object v3, p1

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->a(Landroid/content/Intent;Landroid/app/Activity;Ljava/lang/String;IZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static createVideoIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->createVideoIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static createVideoIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IZZ)Landroid/content/Intent;
    .locals 8

    if-nez p2, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The videoId cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    if-nez p1, :cond_1

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The developerKey cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.youtube.api.StandalonePlayerActivity.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "video_id"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    move-object v3, p0

    move-object v4, p1

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->a(Landroid/content/Intent;Landroid/app/Activity;Ljava/lang/String;IZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static createVideosIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;)Landroid/content/Intent;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->createVideosIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;IIZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static createVideosIntent(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;IIZZ)Landroid/content/Intent;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;IIZZ)",
            "Landroid/content/Intent;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The list of videoIds cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "The list of videoIds cannot be empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-nez p1, :cond_2

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "The developerKey cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.youtube.api.StandalonePlayerActivity.START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "video_ids"

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "current_index"

    invoke-virtual {p2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    move-object v2, p0

    move-object v3, p1

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/youtube/player/YouTubeStandalonePlayer;->a(Landroid/content/Intent;Landroid/app/Activity;Ljava/lang/String;IZZ)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getReturnedInitializationResult(Landroid/content/Intent;)Lcom/google/android/youtube/player/YouTubeInitializationResult;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "initialization_result"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_0
    invoke-static {p0}, Lcom/google/android/youtube/player/YouTubeInitializationResult;->valueOf(Ljava/lang/String;)Lcom/google/android/youtube/player/YouTubeInitializationResult;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object p0, Lcom/google/android/youtube/player/YouTubeInitializationResult;->UNKNOWN_ERROR:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    return-object p0

    :catch_1
    sget-object p0, Lcom/google/android/youtube/player/YouTubeInitializationResult;->UNKNOWN_ERROR:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    return-object p0
.end method
