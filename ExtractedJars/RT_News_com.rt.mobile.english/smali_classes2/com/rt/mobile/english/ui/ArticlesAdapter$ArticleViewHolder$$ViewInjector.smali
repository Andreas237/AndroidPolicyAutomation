.class public Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$$ViewInjector;
.super Ljava/lang/Object;
.source "ArticlesAdapter$ArticleViewHolder$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;Ljava/lang/Object;)V
    .locals 1

    const v0, 0x7f090191

    .line 10
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->textView:Landroid/widget/TextView;

    const v0, 0x7f0900b5

    .line 12
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->imageView:Landroid/widget/ImageView;

    const v0, 0x7f090190

    .line 14
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->timeView:Landroid/widget/TextView;

    const v0, 0x7f090121

    .line 16
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->PlayIcon:Landroid/widget/ImageView;

    const v0, 0x7f090195

    .line 18
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 19
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->titleView:Landroid/widget/TextView;

    const v0, 0x7f09011f

    .line 20
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 21
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pipeView:Landroid/widget/TextView;

    const v0, 0x7f09017a

    .line 22
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->summaryView:Landroid/widget/TextView;

    const v0, 0x7f09011d

    .line 24
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object p0

    .line 25
    check-cast p0, Landroid/widget/FrameLayout;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pictureFrame:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;)V
    .locals 1

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->textView:Landroid/widget/TextView;

    .line 30
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->imageView:Landroid/widget/ImageView;

    .line 31
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->timeView:Landroid/widget/TextView;

    .line 32
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->PlayIcon:Landroid/widget/ImageView;

    .line 33
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->titleView:Landroid/widget/TextView;

    .line 34
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pipeView:Landroid/widget/TextView;

    .line 35
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->summaryView:Landroid/widget/TextView;

    .line 36
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pictureFrame:Landroid/widget/FrameLayout;

    return-void
.end method
