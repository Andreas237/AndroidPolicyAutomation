.class Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;
.super Ljava/lang/Object;
.source "GalleryActivity.java"

# interfaces
.implements Landroid/support/design/widget/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->initTabSelector()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    return-void
.end method

.method public onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method

.method public onTabUnselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;->setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method
