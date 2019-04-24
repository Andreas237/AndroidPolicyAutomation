.class public Lorg/researchstack/backbone/ui/ViewVideoActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ViewVideoActivity.java"


# static fields
.field public static final KEY_RELATIVE_PATH:Ljava/lang/String; = "VideoViewActivity.URI"


# instance fields
.field private videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method public static newIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "relativeVideoPath"    # Ljava/lang/String;

    .prologue
    .line 24
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lorg/researchstack/backbone/ui/ViewVideoActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "VideoViewActivity.URI"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 32
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 33
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_activity_video_viewer:I

    invoke-super {p0, v0}, Landroid/support/v7/app/AppCompatActivity;->setContentView(I)V

    .line 35
    sget v0, Lorg/researchstack/backbone/R$id;->videoView:I

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/ViewVideoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lorg/researchstack/backbone/ui/views/AssetVideoView;

    iput-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .line 37
    new-instance v8, Landroid/widget/MediaController;

    const/4 v0, 0x0

    invoke-direct {v8, p0, v0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;Z)V

    .line 38
    .local v8, "mediaController":Landroid/widget/MediaController;
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v8, v0}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    .line 39
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0, v8}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->setMediaController(Landroid/widget/MediaController;)V

    .line 43
    :try_start_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewVideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "VideoViewActivity.URI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 44
    .local v9, "videoPath":Ljava/lang/String;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/ViewVideoActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v6

    .line 45
    .local v6, "afd":Landroid/content/res/AssetFileDescriptor;
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->setVideoDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 46
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    return-void

    .line 48
    .end local v6    # "afd":Landroid/content/res/AssetFileDescriptor;
    .end local v9    # "videoPath":Ljava/lang/String;
    :catch_0
    move-exception v7

    .line 50
    .local v7, "e":Ljava/io/IOException;
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 57
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    .line 58
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lorg/researchstack/backbone/ui/ViewVideoActivity;->videoView:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->pause()V

    .line 62
    :cond_0
    return-void
.end method
