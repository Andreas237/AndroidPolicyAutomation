.class public Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$$ViewInjector;
.super Ljava/lang/Object;
.source "BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'textView\'"

    const v1, 0x7f090191

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    const-string v0, "field \'imageView\'"

    const v1, 0x7f0900b5

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    const-string v0, "field \'timeView\'"

    const v1, 0x7f090190

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->timeView:Landroid/widget/TextView;

    const v0, 0x7f090121

    .line 16
    invoke-virtual {p0, p2, v0}, Lbutterknife/ButterKnife$Finder;->findOptionalView(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object p0

    .line 17
    check-cast p0, Landroid/widget/ImageView;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->PlayIcon:Landroid/widget/ImageView;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    .line 22
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    .line 23
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->timeView:Landroid/widget/TextView;

    .line 24
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->PlayIcon:Landroid/widget/ImageView;

    return-void
.end method
