.class public Lcom/rt/mobile/english/ui/GalleryPhotosActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "GalleryPhotosActivity$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/GalleryPhotosActivity;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 11
    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'loadingView\'"

    const v1, 0x7f090027

    .line 12
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 13
    check-cast v0, Lcom/rt/mobile/english/ui/widget/LoadingView;

    iput-object v0, p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const-string v0, "field \'contents\'"

    const v1, 0x7f090058

    .line 14
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 15
    check-cast p0, Landroid/widget/FrameLayout;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->contents:Landroid/widget/FrameLayout;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 20
    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    .line 21
    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->contents:Landroid/widget/FrameLayout;

    return-void
.end method
