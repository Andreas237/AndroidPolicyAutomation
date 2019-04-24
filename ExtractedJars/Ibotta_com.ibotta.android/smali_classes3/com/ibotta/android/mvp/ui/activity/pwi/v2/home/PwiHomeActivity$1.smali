.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$1;
.super Ljava/lang/Object;
.source "PwiHomeActivity.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->initViewPagerTracking()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

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
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onViewPagerChanged(I)V

    return-void
.end method
