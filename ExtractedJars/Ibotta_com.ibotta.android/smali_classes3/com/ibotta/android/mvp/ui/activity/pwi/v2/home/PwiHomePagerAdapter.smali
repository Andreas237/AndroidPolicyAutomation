.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "PwiHomePagerAdapter.java"


# instance fields
.field private final viewComponentMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
            "Lcom/ibotta/android/views/components/ViewComponent;",
            ">;"
        }
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/components/ViewEvents;

.field private final viewStateMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewStateMap:Ljava/util/Map;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewComponentMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 62
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object p3

    aget-object p2, p3, p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 94
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 95
    move-object v1, p1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object v2

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x2

    return p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 67
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 39
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object v0

    aget-object p2, v0, p2

    .line 41
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 42
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->getLayoutResId()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 44
    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/views/components/ViewComponent;

    .line 45
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/views/components/ViewState;

    if-eqz v2, :cond_0

    .line 48
    invoke-interface {v1, v2}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    .line 51
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewEvents:Lcom/ibotta/android/views/components/ViewEvents;

    invoke-interface {v1, v2}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 52
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewComponentMap:Ljava/util/Map;

    invoke-interface {v2, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public updateViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewEvents:Lcom/ibotta/android/views/components/ViewEvents;

    return-void
.end method

.method public updateViewState(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;)V"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewStateMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewComponentMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->notifyDataSetChanged()V

    goto :goto_2

    .line 79
    :cond_0
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 81
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->viewComponentMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/views/components/ViewComponent;

    .line 82
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/views/components/ViewState;

    if-eqz v4, :cond_1

    if-eqz v3, :cond_1

    .line 84
    invoke-interface {v4, v3}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->notifyDataSetChanged()V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
