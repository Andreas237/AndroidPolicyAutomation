.class Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;
.super Ljava/lang/Object;
.source "InVisionViewPagerFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 120
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 121
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->HideDescriptionAndToolbar(ZLandroid/view/View;)V

    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;->this$0:Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->HideDescriptionAndToolbar(ZLandroid/view/View;)V

    :goto_0
    return-void
.end method
