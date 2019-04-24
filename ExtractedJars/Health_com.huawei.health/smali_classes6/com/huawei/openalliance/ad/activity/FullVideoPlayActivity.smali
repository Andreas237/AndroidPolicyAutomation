.class public Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;
.super Landroid/app/Activity;

# interfaces
.implements Lcom/huawei/openalliance/ad/activity/a/a;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

.field private c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field private d:Lcom/huawei/openalliance/ad/views/VideoView;

.field private e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

.field private f:Lcom/huawei/openalliance/ad/views/i;

.field private g:Lcom/huawei/openalliance/ad/j/a/a;

.field private h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

.field private i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

.field private j:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

.field private k:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

.field private l:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

.field private m:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

.field private n:Lcom/huawei/openalliance/ad/media/listener/a;

.field private o:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

.field private p:Lcom/huawei/openalliance/ad/views/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$2;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->k:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$3;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->l:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$4;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->m:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$5;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->n:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$6;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->o:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$7;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->p:Lcom/huawei/openalliance/ad/views/i$a;

    return-void
.end method

.method private a(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setPlayProgress(I)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a(IZ)V

    return-void
.end method

.method private a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/i;->e(Z)V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-object v0
.end method

.method private c()V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "loadVideo"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/c/a;->a()Landroid/util/Pair;

    move-result-object v2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v2, :cond_1

    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    :cond_0
    iget-object v0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->finish()V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->j:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    new-instance v1, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setScreenOnWhilePlaying(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAutoScaleResizeLayoutOnVideoSizeChange(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->setTitleText(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/views/i;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    return-object v0
.end method

.method private d()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getSoundSwitch()Ljava/lang/String;

    move-result-object v0

    const-string v1, "y"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    if-nez v5, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoFileSize()I

    move-result v6

    if-lez v6, :cond_2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_consume_data_to_play_video:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoFileSize()I

    move-result v3

    int-to-long v3, v3

    invoke-static {p0, v3, v4}, Lcom/huawei/openalliance/ad/utils/i;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_consume_data_to_play_video_no_data_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->setNonWifiAlertMsg(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private e()V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "checkAndPlayVideo"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g:Lcom/huawei/openalliance/ad/j/a/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getPlayProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g:Lcom/huawei/openalliance/ad/j/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/a;->a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isNeedContinueAutoPlay()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getImageInfos()Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v3, v0, v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setRatio(Ljava/lang/Float;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-virtual {v0, v3}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->setPreviewImageRatio(F)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g:Lcom/huawei/openalliance/ad/j/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/a;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    :cond_2
    return-void
.end method

.method private g()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isNeedContinueAutoPlay()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private h()V
    .locals 3

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_root_rl:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v0, v2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g:Lcom/huawei/openalliance/ad/j/a/a;

    return-void
.end method

.method private i()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->finish()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x1006

    invoke-virtual {v2, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onPreviewImageLoaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/views/i;->a(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;Z)V
    .locals 5

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onCheckVideoHashResult success: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isNeedContinueAutoPlay()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->c()V

    :cond_0
    return-void
.end method

.method public finish()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "finish"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->m:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->l:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->n:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getMediaPlayerAgent()Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    new-instance v1, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setPlayProgress(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->b:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setBackFromFullScreen(Z)V

    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/c/a;->a()Landroid/util/Pair;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a()V

    sget v0, Lcom/huawei/openalliance/ad/R$layout;->hiad_native_full_video_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->setContentView(I)V

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_video_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/VideoView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_native_video_ctrl_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->finish()V

    return-void

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/i;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    new-instance v0, Lcom/huawei/openalliance/ad/j/b;

    invoke-direct {v0, p0, p0}, Lcom/huawei/openalliance/ad/j/b;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/activity/a/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->g:Lcom/huawei/openalliance/ad/j/a/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->p:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/i$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->m:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->l:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->n:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->o:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->e:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->k:Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel;->setListener(Lcom/huawei/openalliance/ad/views/FullScreenVideoControlPanel$a;)V

    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/a;->b()Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->j:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setScreenOnWhilePlaying(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->m:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->l:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->n:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->i:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getMediaPlayerAgent()Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    new-instance v1, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->destroyView()V

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->h()V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onNewIntent"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->c()V

    return-void
.end method

.method protected onPause()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onPause"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->f()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->e()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onResume"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->f:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->g()V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    sget-object v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->a:Ljava/lang/String;

    const-string v1, "onStart"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$1;-><init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
