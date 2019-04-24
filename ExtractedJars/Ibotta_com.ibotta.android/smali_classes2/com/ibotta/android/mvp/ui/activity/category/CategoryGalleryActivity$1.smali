.class Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;
.super Ljava/lang/Object;
.source "CategoryGalleryActivity.java"

# interfaces
.implements Landroid/support/design/widget/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->initTabSelector()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

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

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->setTabVisible(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method

.method public onTabUnselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;)Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter;->setTabHidden(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method
