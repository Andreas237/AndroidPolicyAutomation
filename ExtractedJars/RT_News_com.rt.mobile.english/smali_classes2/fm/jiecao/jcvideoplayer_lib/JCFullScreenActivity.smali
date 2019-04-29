.class public Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;
.super Landroid/app/Activity;
.source "JCFullScreenActivity.java"


# static fields
.field public static STATE:I = -0x1

.field public static TITLE:Ljava/lang/String; = null

.field public static URL:Ljava/lang/String; = null

.field public static manualQuit:Z = false

.field protected static skin:Lfm/jiecao/jcvideoplayer_lib/Skin; = null

.field static start:Z = false


# instance fields
.field jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static toActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 40
    sput v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->STATE:I

    .line 41
    sput-object p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->URL:Ljava/lang/String;

    .line 42
    sput-object p2, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->TITLE:Ljava/lang/String;

    const/4 p1, 0x1

    .line 43
    sput-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->start:Z

    .line 44
    new-instance p1, Landroid/content/Intent;

    const-class p2, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static toActivityFromNormal(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 23
    sput p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->STATE:I

    .line 24
    sput-object p2, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->URL:Ljava/lang/String;

    .line 25
    sput-object p3, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->TITLE:Ljava/lang/String;

    const/4 p1, 0x0

    .line 26
    sput-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->start:Z

    .line 27
    new-instance p1, Landroid/content/Intent;

    const-class p2, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 91
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->quitFullScreen()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 61
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 62
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->requestWindowFeature(I)Z

    .line 63
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    const/4 p1, 0x0

    .line 64
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->setRequestedOrientation(I)V

    .line 65
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1002

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 67
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$layout;->activity_fullscreen:I

    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->setContentView(I)V

    .line 69
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->jcvideoplayer:I

    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    iput-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    .line 70
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    if-eqz v0, :cond_0

    .line 71
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v2, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->titleColor:I

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v3, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->timeColor:I

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v4, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->seekDrawable:I

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v5, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->bottomControlBackground:I

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v6, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->enlargRecId:I

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    iget v7, v0, Lfm/jiecao/jcvideoplayer_lib/Skin;->shrinkRecId:I

    invoke-virtual/range {v1 .. v7}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setSkin(IIIIII)V

    .line 74
    :cond_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->URL:Ljava/lang/String;

    sget-object v2, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->TITLE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUpForFullscreen(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    sget v1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->STATE:I

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    .line 76
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->setUuid(Ljava/lang/String;)V

    .line 77
    sput-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->manualQuit:Z

    .line 78
    sget-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->start:Z

    if-eqz p1, :cond_1

    .line 79
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->performClick()Z

    :cond_1
    return-void
.end method

.method public onEventMainThread(Lfm/jiecao/jcvideoplayer_lib/VideoEvents;)V
    .locals 2

    .line 84
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v1, 0x595b6

    if-eq v0, v1, :cond_0

    iget p1, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v0, 0x595b7

    if-ne p1, v0, :cond_1

    .line 85
    :cond_0
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->finish()V

    :cond_1
    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 96
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 97
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->manualQuit:Z

    if-nez v0, :cond_0

    .line 98
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->jcVideoPlayer:Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;

    const/4 v0, 0x0

    sput-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isClickFullscreen:Z

    .line 99
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->releaseAllVideos()V

    .line 100
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->finish()V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 106
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 107
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->register(Ljava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 112
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 113
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->unregister(Ljava/lang/Object;)V

    return-void
.end method
