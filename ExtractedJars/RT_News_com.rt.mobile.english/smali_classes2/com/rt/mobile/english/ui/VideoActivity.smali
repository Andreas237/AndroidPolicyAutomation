.class public Lcom/rt/mobile/english/ui/VideoActivity;
.super Landroid/app/Activity;
.source "VideoActivity.java"


# static fields
.field public static final RESULT_VIDEO_URL:Ljava/lang/String; = "video_url"


# instance fields
.field videoView:Landroid/widget/VideoView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901a8
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 47
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 52
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0027

    .line 53
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/VideoActivity;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 55
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x800

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 56
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 58
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xe

    if-lt p1, v0, :cond_0

    .line 59
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 62
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "video_url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 64
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 65
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    new-instance v0, Landroid/widget/MediaController;

    invoke-direct {v0, p0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V

    .line 66
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    invoke-virtual {p1}, Landroid/widget/VideoView;->start()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 42
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->suspend()V

    .line 36
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoActivity;->videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->resume()V

    .line 30
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method
