.class public Lcom/rt/mobile/english/ui/VideoEpisodeFragment;
.super Landroid/support/v4/app/Fragment;
.source "VideoEpisodeFragment.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ValidFragment"
    }
.end annotation


# static fields
.field public static final ARGUMENT_EPISOD:Ljava/lang/String; = "episodes_string"


# instance fields
.field dateTextView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090063
    .end annotation
.end field

.field dateTimeFormatter:Ljava/text/DateFormat;

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private mMenu:Landroid/view/Menu;

.field networkImageView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900b5
    .end annotation
.end field

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field summaryTextView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09017a
    .end annotation
.end field

.field titleTextView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090191
    .end annotation
.end field

.field private toolbar:Landroid/support/v7/widget/Toolbar;

.field private toolbar_and_tabs:Landroid/view/View;

.field videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

.field private videoString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x3

    .line 67
    invoke-static {v0, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->dateTimeFormatter:Ljava/text/DateFormat;

    return-void
.end method


# virtual methods
.method public getMenu()Landroid/view/Menu;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->mMenu:Landroid/view/Menu;

    return-object v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 73
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 74
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 79
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 80
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->gson:Lcom/google/gson/Gson;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoString:Ljava/lang/String;

    const-class v1, Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p1, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/videos/VideoEpisode;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 3

    .line 118
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 119
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const-string p2, "share"

    const/4 v0, 0x1

    const v1, 0x7f090155

    const/4 v2, 0x0

    .line 120
    invoke-interface {p1, v0, v1, v2, p2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p2

    const v0, 0x7f0801c6

    .line 121
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p2

    const/16 v0, 0x9

    .line 122
    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 127
    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->mMenu:Landroid/view/Menu;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c005b

    const/4 v0, 0x0

    .line 90
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 91
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 93
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "episodes_string"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoString:Ljava/lang/String;

    .line 94
    iget-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->gson:Lcom/google/gson/Gson;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoString:Ljava/lang/String;

    const-class v0, Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p2, p3, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/videos/VideoEpisode;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    .line 95
    invoke-static {}, Lcom/nostra13/universalimageloader/core/ImageLoader;->getInstance()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object p2

    .line 96
    iget-object p3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getImage()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$1;-><init>(Lcom/rt/mobile/english/ui/VideoEpisodeFragment;)V

    invoke-virtual {p2, p3, v0}, Lcom/nostra13/universalimageloader/core/ImageLoader;->loadImage(Ljava/lang/String;Lcom/nostra13/universalimageloader/core/listener/ImageLoadingListener;)V

    .line 108
    iget-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->titleTextView:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getTitle()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->dateTextView:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getTime()Lorg/joda/time/DateTime;

    move-result-object p3

    invoke-static {p3}, Lcom/rt/mobile/english/Utils;->getStringTime(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    iget-object p2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->summaryTextView:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getSummary()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    .line 112
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->setHasOptionsMenu(Z)V

    return-object p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 142
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090155

    if-ne v0, v1, :cond_0

    .line 143
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getTitle()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/rt/mobile/english/Utils;->share(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    .line 146
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPlayButtonClick()V
    .locals 4
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f090120
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    if-nez v0, :cond_0

    return-void

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getVideo()Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 162
    sget-object v0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->Companion:Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    .line 163
    invoke-virtual {v2}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getVideo()Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    .line 164
    invoke-virtual {v3}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 162
    invoke-virtual {v0, v1, v2, v3}, Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;->run(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getVideo()Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->getYoutubeId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 172
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->videoEpisode:Lcom/rt/mobile/english/data/videos/VideoEpisode;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/videos/VideoEpisode;->getVideo()Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->getYoutubeId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2}, Lcom/google/android/youtube/player/YouTubeIntents;->createPlayVideoIntentWithOptions(Landroid/content/Context;Ljava/lang/String;ZZ)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->startActivity(Landroid/content/Intent;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 4

    .line 131
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const-string v0, "share"

    const/4 v1, 0x1

    const v2, 0x7f090155

    const/4 v3, 0x0

    .line 132
    invoke-interface {p1, v1, v2, v3, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    const v0, 0x7f0801c6

    .line 133
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object p1

    const/16 v0, 0x9

    .line 134
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    return-void
.end method
