.class public Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector;
.super Ljava/lang/Object;
.source "LoadingView$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/widget/LoadingView;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'errorLayout\'"

    const v1, 0x7f09007e

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/widget/LoadingView;->errorLayout:Landroid/widget/LinearLayout;

    const-string v0, "field \'retryButton\' and method \'retry\'"

    const v1, 0x7f09012d

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    move-object v1, v0

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/rt/mobile/english/ui/widget/LoadingView;->retryButton:Landroid/widget/Button;

    .line 14
    new-instance v1, Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector$1;

    invoke-direct {v1, p1}, Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector$1;-><init>(Lcom/rt/mobile/english/ui/widget/LoadingView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v0, "field \'progressBar\'"

    const v1, 0x7f090126

    .line 22
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 23
    check-cast p0, Landroid/widget/FrameLayout;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/widget/LoadingView;->progressBar:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/widget/LoadingView;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->errorLayout:Landroid/widget/LinearLayout;

    .line 28
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->retryButton:Landroid/widget/Button;

    .line 29
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/LoadingView;->progressBar:Landroid/widget/FrameLayout;

    return-void
.end method
