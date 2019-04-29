.class Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;
.super Ljava/lang/Object;
.source "JCMediaManager.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# static fields
.field private static jcMediaManager:Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;


# instance fields
.field public currentVideoHeight:I

.field public currentVideoWidth:I

.field public mediaPlayer:Landroid/media/MediaPlayer;

.field private prev_uuid:Ljava/lang/String;

.field public uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    const-string v0, ""

    .line 25
    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->prev_uuid:Ljava/lang/String;

    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoWidth:I

    .line 27
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoHeight:I

    .line 37
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    return-void
.end method

.method public static intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;
    .locals 1

    .line 30
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->jcMediaManager:Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;-><init>()V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->jcMediaManager:Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    .line 33
    :cond_0
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->jcMediaManager:Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    return-object v0
.end method


# virtual methods
.method public backUpUuid()V
    .locals 1

    .line 91
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->prev_uuid:Ljava/lang/String;

    return-void
.end method

.method public clearWidthAndHeight()V
    .locals 1

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoWidth:I

    .line 108
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoHeight:I

    return-void
.end method

.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1

    .line 71
    new-instance p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {p1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v0, 0x595b8

    invoke-virtual {p1, v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object p1

    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    .line 73
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p2

    invoke-virtual {p2, p1}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 66
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595b7

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 61
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595b4

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 2

    .line 78
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595b9

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 0

    .line 101
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result p2

    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoWidth:I

    .line 102
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result p1

    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoHeight:I

    .line 103
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    new-instance p2, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {p2}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const p3, 0x595ba

    invoke-virtual {p2, p3}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object p2

    invoke-virtual {p1, p2}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public prepareToPlay(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 41
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 43
    :cond_0
    :try_start_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 44
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 45
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 46
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 47
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 48
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 49
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 50
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    .line 51
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 52
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 53
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 55
    invoke-static {p1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public revertUuid()V
    .locals 1

    .line 95
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->prev_uuid:Ljava/lang/String;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    const-string v0, ""

    .line 96
    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->prev_uuid:Ljava/lang/String;

    return-void
.end method

.method public setUuid(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    return-void
.end method
