.class public Lcom/rt/mobile/english/ui/PagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "PagerFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;,
        Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;,
        Lcom/rt/mobile/english/ui/PagerFragment$Adapter;,
        Lcom/rt/mobile/english/ui/PagerFragment$Listener;
    }
.end annotation


# static fields
.field private static final LISTENER_FRAGMENT_TAG:Ljava/lang/String; = "listener_fragment_tag"

.field public static final TABS_VISIBILITY:Ljava/lang/String; = "tabs_visibility"


# instance fields
.field private isInitiate:Z

.field private isTabsVisible:Z

.field private listenerFragmentTag:Ljava/lang/String;

.field private mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

.field private mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

.field private mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

.field private mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

.field private mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

.field private mTabsAdapter:Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

.field private pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mTabsAdapter:Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

    return-object p0
.end method

.method private initPager()V
    .locals 3

    .line 167
    new-instance v0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;-><init>(Lcom/rt/mobile/english/ui/PagerFragment;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    .line 168
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 169
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0700b4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setPageMargin(I)V

    .line 170
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setOffscreenPageLimit(I)V

    .line 171
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    invoke-interface {v2}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getPageCount()I

    move-result v2

    sub-int/2addr v2, v1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    invoke-interface {v1}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getInitialPosition()I

    move-result v1

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setCurrentItem(I)V

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    invoke-interface {v1}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getInitialPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setCurrentItem(I)V

    .line 177
    :goto_0
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->isTabsVisible:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    if-eqz v0, :cond_1

    .line 178
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 179
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    goto :goto_1

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 184
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 185
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    const-string v1, "in_vision_split_fragment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060076

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->setPagerBackground(I)V

    goto :goto_2

    .line 188
    :cond_2
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x106000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->setPagerBackground(I)V

    :cond_3
    :goto_2
    return-void
.end method

.method public static newInstance(ZLjava/lang/String;)Lcom/rt/mobile/english/ui/PagerFragment;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 86
    new-instance v0, Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/PagerFragment;-><init>()V

    .line 87
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "tabs_visibility"

    .line 88
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz p1, :cond_0

    const-string p0, "listener_fragment_tag"

    .line 90
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_0
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getFragmentAtPosition(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0, v1, p1}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/support/v4/app/Fragment;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getPager()Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    return-object v0
.end method

.method public notifyDataSetChanged()V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->notifyDataSetChanged()V

    .line 100
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPagerAdapter:Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setCurrentItem(I)V

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->isTabsVisible:Z

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    :cond_1
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2

    .line 111
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 113
    iget-boolean p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->isInitiate:Z

    if-eqz p1, :cond_0

    return-void

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 116
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "tabs_visibility"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->isTabsVisible:Z

    .line 117
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "listener_fragment_tag"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    .line 120
    :cond_1
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "listenerFragmentTag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    :try_start_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 123
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->listenerFragmentTag:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/rt/mobile/english/Utils;->findFragmentByTag(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    goto :goto_0

    .line 125
    :cond_2
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 126
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    goto :goto_0

    .line 128
    :cond_3
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    invoke-interface {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment$Listener;->onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V

    const/4 p1, 0x1

    .line 136
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->isInitiate:Z

    return-void

    .line 132
    :catch_0
    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "Parent fragment or activity must implement PagerFragment.Listener"

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const p3, 0x7f0c0056

    const/4 v0, 0x0

    .line 201
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDetach()V
    .locals 1

    .line 206
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 207
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mListener:Lcom/rt/mobile/english/ui/PagerFragment$Listener;

    invoke-interface {v0, p0}, Lcom/rt/mobile/english/ui/PagerFragment$Listener;->onDetach(Lcom/rt/mobile/english/ui/PagerFragment;)V

    :cond_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 214
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const p2, 0x7f090114

    .line 215
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    .line 217
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/PagerFragment;->initPager()V

    return-void
.end method

.method public setAdapter(Lcom/rt/mobile/english/ui/PagerFragment$Adapter;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mAdapter:Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->pageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public setPagerBackground(I)V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mPager:Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/widget/ViewPagerUnbugged;->setBackgroundColor(I)V

    return-void
.end method

.method public setSlidingTabLayout(Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mSlidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

    return-void
.end method

.method public setTabsAdapter(Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment;->mTabsAdapter:Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

    return-void
.end method
