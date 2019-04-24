.class public Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;
.super Landroid/support/design/widget/TabLayout$ViewPagerOnTabSelectedListener;
.source "HomeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/HomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TabSelectedListener"
.end annotation


# instance fields
.field private activityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/HomeActivity;",
            ">;"
        }
    .end annotation
.end field

.field private pagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

.field final synthetic this$0:Lcom/shopkick/app/activities/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/activities/HomeActivity;Lcom/shopkick/app/activities/HomeActivity;Landroid/support/v4/view/ViewPager;Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;)V
    .locals 0

    .line 837
    iput-object p1, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->this$0:Lcom/shopkick/app/activities/HomeActivity;

    .line 838
    invoke-direct {p0, p3}, Landroid/support/design/widget/TabLayout$ViewPagerOnTabSelectedListener;-><init>(Landroid/support/v4/view/ViewPager;)V

    .line 840
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->activityRef:Ljava/lang/ref/WeakReference;

    .line 841
    iput-object p4, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->pagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    return-void
.end method


# virtual methods
.method public onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 3

    .line 846
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->pagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 848
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 849
    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTitle(Ljava/lang/String;)V

    .line 850
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->pagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getTabBarItem(I)Lcom/shopkick/app/activities/TabBarItem;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/activities/TabBarItem;->tabContextName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTabContextName(Ljava/lang/String;)V

    .line 851
    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPosition(Ljava/lang/Integer;)V

    .line 853
    iget-object v1, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->pagerAdapter:Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/adapter/TabFragmentPagerAdapter;->getCurrentScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 854
    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 855
    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 859
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/HomeActivity$TabSelectedListener;->activityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/HomeActivity;

    if-eqz v0, :cond_2

    .line 861
    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/activities/HomeActivity;->access$400(Lcom/shopkick/app/activities/HomeActivity;I)V

    .line 865
    :cond_2
    invoke-super {p0, p1}, Landroid/support/design/widget/TabLayout$ViewPagerOnTabSelectedListener;->onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V

    return-void
.end method
