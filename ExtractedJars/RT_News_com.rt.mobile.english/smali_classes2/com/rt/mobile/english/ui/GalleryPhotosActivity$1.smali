.class Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;
.super Ljava/lang/Object;
.source "GalleryPhotosActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/GalleryPhotosActivity;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;->this$0:Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;->this$0:Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->access$002(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;I)I

    .line 136
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;->this$0:Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->access$100(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/PagerFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 137
    instance-of v1, v0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    if-eqz v1, :cond_0

    .line 138
    check-cast v0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    .line 139
    invoke-static {}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->access$200()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 140
    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->hideDescription()V

    goto :goto_0

    .line 142
    :cond_1
    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->visiblyDescription()V

    goto :goto_0

    :cond_2
    return-void
.end method
