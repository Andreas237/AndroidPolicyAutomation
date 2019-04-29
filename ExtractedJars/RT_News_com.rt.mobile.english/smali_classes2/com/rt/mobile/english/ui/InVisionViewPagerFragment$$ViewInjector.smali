.class public Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$$ViewInjector;
.super Ljava/lang/Object;
.source "InVisionViewPagerFragment$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'imageDescrView\'"

    const v1, 0x7f09011c

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageDescrView:Landroid/widget/TextView;

    const-string v0, "field \'imageCopyView\'"

    const v1, 0x7f09011b

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageCopyView:Landroid/widget/TextView;

    const-string v0, "field \'RootFrame\'"

    const v1, 0x7f090132

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->RootFrame:Landroid/widget/FrameLayout;

    const-string v0, "field \'Bloc_description\'"

    const v1, 0x7f09002e

    .line 16
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 17
    iput-object v0, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    const-string v0, "field \'imageView\'"

    const v1, 0x7f0900aa

    .line 18
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 19
    check-cast p0, Landroid/widget/ImageView;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageView:Landroid/widget/ImageView;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageDescrView:Landroid/widget/TextView;

    .line 24
    iput-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageCopyView:Landroid/widget/TextView;

    .line 25
    iput-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->RootFrame:Landroid/widget/FrameLayout;

    .line 26
    iput-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    .line 27
    iput-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageView:Landroid/widget/ImageView;

    return-void
.end method
