.class public Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v4/view/ViewPager;

.field private b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

.field private c:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private g:Landroid/view/View;

.field private h:Z

.field private k:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->h:Z

    return-void
.end method

.method private b()V
    .locals 4

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e:Ljava/util/List;

    .line 134
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    .line 136
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->c:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->c:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initFragment, is storeDemo version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_recommend:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->k:[Ljava/lang/String;

    .line 144
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 8

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->statusbar_panel:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 163
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 164
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 165
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStatusBarHeight null == arguments"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void

    .line 168
    :cond_0
    const-string v0, "statusBarHeight"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 169
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setStatusBarHeight statusBarHeight"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 171
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v7, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 172
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    goto :goto_0

    .line 174
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->d:Landroid/content/Context;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 175
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v7, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 176
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    :goto_0
    return-void
.end method

.method private e()V
    .locals 5

    .line 126
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 127
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v0, Lo/dae;->cg:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 129
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 130
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 5

    .line 110
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->discover_vp:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    .line 113
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b()V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/euw;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->k:[Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lo/euw;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e()V

    .line 118
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 159
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b()V

    .line 152
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 59
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 65
    const-string v0, "TimeEat_DiscoverFragment"

    const-string v1, "Enter onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_discover:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    .line 67
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->d:Landroid/content/Context;

    .line 68
    const-string v0, "TimeEat_DiscoverFragment"

    const-string v1, "Leave onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->c(Landroid/view/View;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .line 87
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 88
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->d:Landroid/content/Context;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->a:Landroid/support/v4/view/ViewPager;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e:Ljava/util/List;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->k:[Ljava/lang/String;

    .line 96
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 75
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 76
    const-string v0, "TimeEat_DiscoverFragment"

    const-string v1, "Enter onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->h:Z

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->getUserVisibleHint()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->setUserVisibleHint(Z)V

    .line 82
    :cond_0
    const-string v0, "TimeEat_DiscoverFragment"

    const-string v1, "Leave onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 4

    .line 100
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 102
    const-string v0, "UIDV_DiscoverFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",isFirst:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",mDiscoverView:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->g:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->e(Landroid/view/View;)V

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->h:Z

    .line 107
    :cond_0
    return-void
.end method
