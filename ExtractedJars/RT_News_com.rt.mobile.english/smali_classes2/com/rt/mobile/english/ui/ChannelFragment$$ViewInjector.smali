.class public Lcom/rt/mobile/english/ui/ChannelFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "ChannelFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/ChannelFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'playerView\'"

    const v1, 0x7f0901a6

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Lcom/google/android/exoplayer2/ui/PlayerView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    const-string v0, "field \'pauseIcon\'"

    const v1, 0x7f09011a

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    const-string v0, "field \'videoIcon\'"

    const v1, 0x7f0901ab

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->videoIcon:Landroid/widget/ImageView;

    const-string v0, "field \'pb\'"

    const v1, 0x7f090126

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    const-string v0, "field \'Root_Frame\'"

    const v1, 0x7f090132

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 19
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    const-string v0, "field \'listView\'"

    const v1, 0x7f0900ca

    .line 20
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->listView:Landroid/widget/ListView;

    const-string v0, "field \'videoFrame\'"

    const v1, 0x7f0901aa

    .line 22
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->videoFrame:Landroid/widget/FrameLayout;

    const-string v0, "field \'noSchedule\'"

    const v1, 0x7f090108

    .line 24
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 25
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->noSchedule:Landroid/widget/TextView;

    const-string v0, "field \'livePlaceHolder\'"

    const v1, 0x7f0900d0

    .line 26
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    const-string v0, "field \'ccButton\'"

    const v1, 0x7f090043

    .line 28
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 29
    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->ccButton:Landroid/widget/Button;

    const-string v0, "field \'bottomContainer\'"

    const v1, 0x7f090034

    .line 30
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 31
    iput-object p0, p1, Lcom/rt/mobile/english/ui/ChannelFragment;->bottomContainer:Landroid/view/View;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/ChannelFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    .line 36
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pauseIcon:Landroid/widget/ImageView;

    .line 37
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoIcon:Landroid/widget/ImageView;

    .line 38
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->pb:Landroid/widget/ProgressBar;

    .line 39
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->Root_Frame:Landroid/widget/LinearLayout;

    .line 40
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->listView:Landroid/widget/ListView;

    .line 41
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->videoFrame:Landroid/widget/FrameLayout;

    .line 42
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->noSchedule:Landroid/widget/TextView;

    .line 43
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->livePlaceHolder:Landroid/widget/ImageView;

    .line 44
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->ccButton:Landroid/widget/Button;

    .line 45
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ChannelFragment;->bottomContainer:Landroid/view/View;

    return-void
.end method
