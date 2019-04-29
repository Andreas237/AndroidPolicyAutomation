.class public Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$$ViewInjector;
.super Ljava/lang/Object;
.source "GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'textView\'"

    const v1, 0x7f090191

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    const-string v0, "field \'imageView\'"

    const v1, 0x7f0900b5

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 13
    check-cast p0, Landroid/widget/ImageView;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;)V
    .locals 1

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    .line 18
    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment$GalleriesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    return-void
.end method
