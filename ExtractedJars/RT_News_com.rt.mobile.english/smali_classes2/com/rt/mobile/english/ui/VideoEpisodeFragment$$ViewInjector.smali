.class public Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "VideoEpisodeFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/VideoEpisodeFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'titleTextView\'"

    const v1, 0x7f090191

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->titleTextView:Landroid/widget/TextView;

    const-string v0, "field \'dateTextView\'"

    const v1, 0x7f090063

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->dateTextView:Landroid/widget/TextView;

    const-string v0, "field \'networkImageView\'"

    const v1, 0x7f0900b5

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->networkImageView:Landroid/widget/ImageView;

    const-string v0, "field \'summaryTextView\'"

    const v1, 0x7f09017a

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->summaryTextView:Landroid/widget/TextView;

    const-string v0, "method \'onPlayButtonClick\'"

    const v1, 0x7f090120

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 19
    new-instance p2, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector$1;

    invoke-direct {p2, p1}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector$1;-><init>(Lcom/rt/mobile/english/ui/VideoEpisodeFragment;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/VideoEpisodeFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->titleTextView:Landroid/widget/TextView;

    .line 31
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->dateTextView:Landroid/widget/TextView;

    .line 32
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->networkImageView:Landroid/widget/ImageView;

    .line 33
    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->summaryTextView:Landroid/widget/TextView;

    return-void
.end method
