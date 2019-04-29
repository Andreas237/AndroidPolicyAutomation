.class public Lcom/rt/mobile/english/ui/ChannelFragment;
.super Landroid/support/v4/app/Fragment;
.source "ChannelFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
.implements Lretrofit/Callback;
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;,
        Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;,
        Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/app/Fragment;",
        "Landroid/view/View$OnClickListener;",
        "Landroid/media/MediaPlayer$OnVideoSizeChangedListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/channels/ScheduleItem;",
        ">;>;>;",
        "Landroid/view/SurfaceHolder$Callback;"
    }
.end annotation


# static fields
.field private static final CONTROLS_HIDE_TIMEOUT:I = 0x9c4

.field private static final LIVE_EXTRA:Ljava/lang/String; = "live_extra"


# instance fields
.field Root_Frame:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090132
    .end annotation
.end field

.field bottomContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090034
    .end annotation
.end field

.field ccButton:Landroid/widget/Button;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090043
    .end annotation
.end field

.field private channel:Lcom/rt/mobile/english/data/channels/Channel;

.field private channelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

.field private channelHLSUrl:Ljava/lang/String;

.field private channelName:Ljava/lang/String;

.field private channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

.field channelsService:Lcom/rt/mobile/english/data/channels/ChannelsService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public isBuffering:Z

.field private isCanceled:Z

.field private landscapeOrientation:Z

.field listView:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900ca
    .end annotation
.end field

.field livePlaceHolder:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900d0
    .end annotation
.end field

.field mHolder:Landroid/view/SurfaceHolder;

.field noSchedule:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090108
    .end annotation
.end field

.field private onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

.field pauseIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09011a
    .end annotation
.end field

.field pb:Landroid/widget/ProgressBar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090126
    .end annotation
.end field

.field playerView:Lcom/google/android/exoplayer2/ui/PlayerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901a6
    .end annotation
.end field

.field private playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

.field private timer:Ljava/util/Timer;

.field private toolbarAndTabs:Landroid/view/View;

.field private toolbarIsHidden:Z

.field private uiHandler:Landroid/os/Handler;

.field videoFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901aa
    .end annotation
.end field

.field videoIcon:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901ab
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    .line 82
    iput-object p0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/ui/ChannelFragment;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelFragment:Lcom/rt/mobile/english/ui/ChannelFragment;

    return-object p0
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/ChannelFragment;)Lcom/rt/mobile/english/data/LivePlayerWrapper;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    return-object p0
.end method

.method static synthetic access$202(Lcom/rt/mobile/english/ui/ChannelFragment;Z)Z
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    return p1
.end method

.method static synthetic access$300(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hideControls()V

    return-void
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hidePause()V

    return-void
.end method

.method private attach(Landroid/content/Context;)V
    .locals 2

    .line 168
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 169
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    const-string v0, "main"

    invoke-static {p1, v0}, Lcom/rt/mobile/english/Utils;->findFragmentByTag(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/ChannelsFragment;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    .line 172
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "live_extra"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 173
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/channels/Channel;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    .line 174
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel;->getTitle()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelName:Ljava/lang/String;

    .line 176
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p1

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->FR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p1, v0, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->loadSchedule(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private hideControls()V
    .locals 4

    .line 743
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f01001c

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 744
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 745
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x10a0001

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    .line 746
    invoke-virtual {v2, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 747
    new-instance v3, Lcom/rt/mobile/english/ui/ChannelFragment$8;

    invoke-direct {v3, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$8;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 765
    iget-object v3, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 767
    iget-boolean v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    if-eqz v2, :cond_0

    .line 768
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 769
    iput-boolean v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

    if-eqz v0, :cond_1

    .line 772
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;->onActonBarHide()V

    :cond_1
    return-void
.end method

.method private hidePause()V
    .locals 3

    .line 671
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x10a0001

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 672
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 673
    new-instance v2, Lcom/rt/mobile/english/ui/ChannelFragment$6;

    invoke-direct {v2, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$6;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 690
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 691
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 692
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v2, 0x10a0000

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 693
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 694
    new-instance v1, Lcom/rt/mobile/english/ui/ChannelFragment$7;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$7;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 710
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private loadSchedule(Ljava/lang/String;)V
    .locals 1

    const-string v0, ""

    .line 275
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->noSchedule:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsService:Lcom/rt/mobile/english/data/channels/ChannelsService;

    invoke-interface {v0, p1, p0}, Lcom/rt/mobile/english/data/channels/ChannelsService;->listScheduleItems(Ljava/lang/String;Lretrofit/Callback;)V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/rt/mobile/english/ui/ChannelFragment;
    .locals 3

    .line 136
    new-instance v0, Lcom/rt/mobile/english/ui/ChannelFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/ChannelFragment;-><init>()V

    .line 138
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "live_extra"

    .line 139
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/ChannelFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private playUrl(Landroid/net/Uri;)V
    .locals 0

    return-void
.end method

.method private playVideo()V
    .locals 2

    .line 477
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 478
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelHLSUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->playStream(Landroid/net/Uri;)V

    .line 479
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 480
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoIcon:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 485
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 486
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 489
    :cond_0
    invoke-static {}, Lcom/comscore/analytics/comScore;->onUxActive()V

    return-void
.end method

.method private setLiveVideoOption()V
    .locals 0

    return-void
.end method

.method private showControls()V
    .locals 3

    .line 724
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f01001b

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 725
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 726
    iget-boolean v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    if-eqz v2, :cond_0

    .line 727
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 729
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v2, 0x10a0000

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 730
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 731
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 732
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 734
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->startHideTimer()V

    .line 735
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

    if-eqz v0, :cond_1

    .line 736
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;->onActonBarShow()V

    .line 739
    :cond_1
    iput-boolean v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    return-void
.end method

.method private showPause()V
    .locals 3

    .line 715
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/high16 v1, 0x10a0000

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 716
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 717
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 718
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private showToolbar()V
    .locals 3

    .line 662
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f01001b

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 663
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 664
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v1}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_0

    .line 665
    iget-boolean v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    if-nez v1, :cond_0

    .line 666
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private startHidePause()V
    .locals 4

    .line 803
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 804
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 806
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    .line 807
    new-instance v0, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$PauseHideTask;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    .line 808
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    const-wide/16 v2, 0x9c4

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private startHideTimer()V
    .locals 4

    .line 778
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 779
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 781
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    .line 782
    new-instance v0, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$ToolbarHideTask;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    .line 783
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->timer:Ljava/util/Timer;

    const-wide/16 v2, 0x9c4

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private stopPlaying()V
    .locals 3

    .line 442
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 443
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hidePause()V

    .line 444
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->pause()V

    .line 449
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 455
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 457
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->showToolbarNoAnimation()V

    .line 459
    invoke-static {}, Lcom/comscore/analytics/comScore;->onUxInactive()V

    return-void
.end method

.method private updateMetadata(Z)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    .line 876
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->listView:Landroid/widget/ListView;

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 877
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoFrame:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 878
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060025

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 879
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->isPlaying()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 880
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hideToolbar()V

    .line 883
    :cond_0
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    .line 885
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 887
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->mHolder:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_1

    .line 888
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v3, v3, 0x22b

    div-int/lit16 v3, v3, 0x3d4

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 892
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v3, v3, 0x22b

    div-int/lit16 v3, v3, 0x3d4

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 896
    :goto_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v3, v3, 0x22b

    div-int/lit16 v3, v3, 0x3d4

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 899
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    iget v1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v1, v1, 0x22b

    div-int/lit16 v1, v1, 0x3d4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 900
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    goto :goto_1

    .line 902
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->listView:Landroid/widget/ListView;

    invoke-virtual {p1, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 903
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoFrame:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p1, v1, v2, v1, v1}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    .line 904
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0600af

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 905
    iput-boolean v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    .line 906
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->isPlaying()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 907
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const v1, 0x7f01001b

    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 908
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 909
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    if-eqz v0, :cond_3

    .line 910
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 914
    :cond_3
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 917
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v3, v3, 0x22b

    div-int/lit16 v3, v3, 0x3d4

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 918
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    iget v1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/lit16 v1, v1, 0x22b

    div-int/lit16 v1, v1, 0x3d4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 919
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 1

    .line 300
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->noSchedule:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public hideToolbar()V
    .locals 4

    .line 359
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f01001c

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 360
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 361
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x10a0001

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    .line 362
    invoke-virtual {v2, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 363
    new-instance v3, Lcom/rt/mobile/english/ui/ChannelFragment$5;

    invoke-direct {v3, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$5;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 380
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/ChannelsFragment;->toolbar_and_tabs:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 381
    iput-boolean v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 305
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 306
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelsFragment:Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ChannelsFragment;->getToolBarAndTabs()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    .line 307
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {p1}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_0

    .line 309
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->showToolbarNoAnimation()V

    .line 312
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/16 v3, 0x400

    const/16 v4, 0x800

    if-ne p1, v0, :cond_3

    .line 313
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/view/Window;->clearFlags(I)V

    .line 314
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 317
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x10

    if-lt p1, v0, :cond_2

    .line 318
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_1

    .line 319
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x1006

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 321
    :cond_1
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 324
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 325
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 326
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 327
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 329
    invoke-direct {p0, v1}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    .line 330
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060025

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1

    .line 332
    :cond_3
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 333
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v4, v4}, Landroid/view/Window;->setFlags(II)V

    .line 336
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xe

    if-lt p1, v0, :cond_4

    .line 337
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 340
    :cond_4
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    .line 341
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 342
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 343
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x1

    .line 345
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    .line 346
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06007b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :goto_1
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2

    .line 153
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 155
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 156
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->attach(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    .line 162
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 164
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->attach(Landroid/content/Context;)V

    return-void
.end method

.method public onChromecastConnected()V
    .locals 2

    .line 124
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->playVideo()V

    .line 125
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoIcon:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->showPause()V

    return-void
.end method

.method public onChromecastDisconnect()V
    .locals 0

    .line 119
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->playVideo()V

    .line 120
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hidePause()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    .line 403
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->isCanceled:Z

    .line 404
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->isPlaying()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 405
    iget-boolean p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->landscapeOrientation:Z

    if-eqz p1, :cond_1

    .line 406
    iget-boolean p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarIsHidden:Z

    if-eqz p1, :cond_0

    .line 407
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->showControls()V

    goto :goto_0

    .line 409
    :cond_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->stopPlaying()V

    goto :goto_0

    .line 412
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 413
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->stopPlaying()V

    goto :goto_0

    .line 415
    :cond_2
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->showControls()V

    goto :goto_0

    .line 420
    :cond_3
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->playVideo()V

    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 829
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 831
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/16 v2, 0x400

    const/16 v3, 0x800

    const/4 v4, 0x2

    if-ne p1, v4, :cond_2

    .line 832
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->bottomContainer:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 834
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/Window;->clearFlags(I)V

    .line 835
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 838
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt p1, v2, :cond_1

    .line 839
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt p1, v2, :cond_0

    .line 840
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v2, 0x1006

    invoke-virtual {p1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 842
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 v2, 0x5

    invoke-virtual {p1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 845
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 846
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 847
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 848
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 850
    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    .line 851
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060025

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1

    .line 853
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel;->getClosedCaptioning()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 854
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->bottomContainer:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 856
    :cond_3
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 857
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 860
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt p1, v2, :cond_4

    .line 861
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 864
    :cond_4
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 v0, -0x2

    .line 865
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 866
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 867
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x1

    .line 869
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    .line 870
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06007b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 147
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const p3, 0x7f0c0051

    const/4 v0, 0x0

    .line 185
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 186
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    return-object p1
.end method

.method public onStop()V
    .locals 0

    .line 386
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 387
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->stopPlaying()V

    return-void
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 0

    .line 925
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Detecting method"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 192
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 194
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    const-string p2, "hls"

    invoke-virtual {p1, p2}, Lcom/rt/mobile/english/data/channels/Channel;->findAutoQualityStream(Ljava/lang/String;)Lcom/rt/mobile/english/data/channels/Channel$Stream;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 195
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    const-string p2, "hls"

    invoke-virtual {p1, p2}, Lcom/rt/mobile/english/data/channels/Channel;->findAutoQualityStream(Ljava/lang/String;)Lcom/rt/mobile/english/data/channels/Channel$Stream;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel$Stream;->getUrl()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelHLSUrl:Ljava/lang/String;

    goto :goto_0

    .line 197
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/channels/Channel;->getUrl()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channelHLSUrl:Ljava/lang/String;

    .line 200
    :goto_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->setLiveVideoOption()V

    .line 202
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoFrame:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoIcon:Landroid/widget/ImageView;

    new-instance p2, Lcom/rt/mobile/english/ui/ChannelFragment$1;

    invoke-direct {p2, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$1;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    new-instance p2, Lcom/rt/mobile/english/ui/ChannelFragment$2;

    invoke-direct {p2, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$2;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->bottomContainer:Landroid/view/View;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->channel:Lcom/rt/mobile/english/data/channels/Channel;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/channels/Channel;->getClosedCaptioning()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    const/16 p2, 0x8

    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 218
    new-instance p1, Lcom/rt/mobile/english/data/LivePlayerWrapper;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;-><init>(Lcom/google/android/exoplayer2/ui/PlayerView;Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    .line 219
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    new-instance p2, Lcom/rt/mobile/english/ui/ChannelFragment$3;

    invoke-direct {p2, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$3;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {p1, p2}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->setListener(Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;)V

    .line 243
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->ccButton:Landroid/widget/Button;

    new-instance p2, Lcom/rt/mobile/english/ui/ChannelFragment$4;

    invoke-direct {p2, p0}, Lcom/rt/mobile/english/ui/ChannelFragment$4;-><init>(Lcom/rt/mobile/english/ui/ChannelFragment;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public playChromecast()V
    .locals 0

    return-void
.end method

.method protected playStream(Landroid/net/Uri;)V
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->setHlsUri(Landroid/net/Uri;)V

    .line 532
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->play()V

    .line 569
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->playUrl(Landroid/net/Uri;)V

    return-void
.end method

.method public setOnActionBarHideListener(Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;)V
    .locals 0

    .line 658
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->onActionBarHideListener:Lcom/rt/mobile/english/ui/ChannelFragment$OnActionBarHideListener;

    return-void
.end method

.method public showToolbarNoAnimation()V
    .locals 2

    .line 351
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->cancel()V

    .line 354
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    :cond_0
    return-void
.end method

.method public stopPlayingOnScroll()V
    .locals 2

    .line 642
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    if-eqz v0, :cond_0

    .line 643
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerWrapper:Lcom/rt/mobile/english/data/LivePlayerWrapper;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->pause()V

    .line 645
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 646
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->isCanceled:Z

    .line 647
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 648
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->hidePause()V

    .line 649
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 653
    :cond_1
    invoke-static {}, Lcom/comscore/analytics/comScore;->onUxInactive()V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/ScheduleItem;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 285
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 286
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->listView:Landroid/widget/ListView;

    new-instance v1, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v1, v2, p1}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p2, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0

    .line 288
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->noSchedule:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 291
    :goto_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChannelFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    .line 292
    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    .line 294
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ChannelFragment;->updateMetadata(Z)V

    :goto_1
    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 64
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/ChannelFragment;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 511
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "surfaceChanged"

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method
