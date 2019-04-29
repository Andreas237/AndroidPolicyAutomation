.class public Lcom/rt/mobile/english/ui/DrawerFragment;
.super Landroid/support/v4/app/Fragment;
.source "DrawerFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;
    }
.end annotation


# instance fields
.field articlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090028
    .end annotation
.end field

.field private callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

.field private container:Landroid/view/View;

.field private drawerLayout:Landroid/support/v4/widget/DrawerLayout;

.field private drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

.field es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09007f
    .end annotation
.end field

.field fifaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09009d
    .end annotation
.end field

.field galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900a9
    .end annotation
.end field

.field items:Ljava/util/List;
    .annotation build Lbutterknife/InjectViews;
        value = {
            0x7f090028,
            0x7f090112,
            0x7f090110,
            0x7f090167,
            0x7f0900da,
            0x7f0900a9,
            0x7f0901ad,
            0x7f0900cb,
            0x7f090031,
            0x7f090074,
            0x7f090154,
            0x7f09007f,
            0x7f0901ae,
            0x7f0901af,
            0x7f0901b2,
            0x7f09010b,
            0x7f09009d
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900cb
    .end annotation
.end field

.field mediaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900da
    .end annotation
.end field

.field noticiasView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09010b
    .end annotation
.end field

.field opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090110
    .end annotation
.end field

.field otherArticlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090112
    .end annotation
.end field

.field selectableItems:Ljava/util/List;
    .annotation build Lbutterknife/InjectViews;
        value = {
            0x7f090028,
            0x7f090112,
            0x7f090110,
            0x7f090167,
            0x7f0900da,
            0x7f0900a9,
            0x7f0901ad,
            0x7f0900cb,
            0x7f090031,
            0x7f09007f,
            0x7f0901ae,
            0x7f0901af,
            0x7f0901b2,
            0x7f09010b,
            0x7f09009d
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090167
    .end annotation
.end field

.field videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901ad
    .end annotation
.end field

.field videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901ae
    .end annotation
.end field

.field videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901af
    .end annotation
.end field

.field viralView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0901b2
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/DrawerFragment;)Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    return-object p0
.end method

.method private selectItem(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 278
    invoke-direct {p0, p1, v0}, Lcom/rt/mobile/english/ui/DrawerFragment;->selectItem(Landroid/view/View;Landroid/os/Bundle;)V

    return-void
.end method

.method private selectItem(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 254
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->selectableItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 255
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 256
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 257
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    .line 262
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 264
    :cond_2
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    if-eqz v0, :cond_3

    .line 265
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->container:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V

    .line 269
    :cond_3
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    if-eqz v0, :cond_4

    .line 270
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    invoke-interface {v0, p1, p2}, Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;->onNavigationDrawerItemSelected(Landroid/view/View;Landroid/os/Bundle;)V

    .line 271
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    if-nez p1, :cond_4

    .line 272
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;->onNavigationDrawerClosed()V

    :cond_4
    return-void
.end method

.method private setListeners()V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 249
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public getDrawerLayout()Landroid/support/v4/widget/DrawerLayout;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    return-object v0
.end method

.method public getDrawerToggle()Landroid/support/v7/app/ActionBarDrawerToggle;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    return-object v0
.end method

.method public isDrawerOpen()Z
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->container:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 106
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 107
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setHasOptionsMenu(Z)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .line 302
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 304
    :try_start_0
    check-cast p1, Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 306
    :catch_0
    new-instance p1, Ljava/lang/ClassCastException;

    const-string v0, "Activity must implement NavigationDrawerCallbacks."

    invoke-direct {p1, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 336
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->selectItem(Landroid/view/View;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 323
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 324
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 112
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c0053

    .line 118
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 119
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 120
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->setListeners()V

    .line 121
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->articlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-direct {p0, p2}, Lcom/rt/mobile/english/ui/DrawerFragment;->selectItem(Landroid/view/View;)V

    .line 123
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->EN:Lcom/rt/mobile/english/Utils$EditionEnum;

    const/16 v1, 0x8

    if-ne p2, v0, :cond_0

    .line 124
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 125
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 128
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->AR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_1

    .line 129
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->otherArticlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 130
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->mediaItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 131
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 132
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 133
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 134
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 138
    :cond_1
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->FR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_2

    .line 139
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 140
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 141
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 143
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 144
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 145
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 148
    :cond_2
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->RU:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_3

    .line 149
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 151
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 152
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 153
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 154
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 155
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 156
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 157
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 160
    :cond_3
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object v0, Lcom/rt/mobile/english/Utils$EditionEnum;->ES:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, v0, :cond_4

    .line 161
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 162
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 163
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 164
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 165
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 166
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->viralView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 167
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->noticiasView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 170
    :cond_4
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object p2

    sget-object p3, Lcom/rt/mobile/english/Utils$EditionEnum;->DE:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne p2, p3, :cond_5

    .line 171
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->showsItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 172
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->galleriesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 173
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videosItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 174
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 175
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->opedgeView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 176
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->es_videos_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 177
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_online_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    .line 178
    iget-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->videos_rt_play_ItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {p2, v1}, Lcom/rt/mobile/english/ui/widget/DrawerItemView;->setVisibility(I)V

    :cond_5
    return-object p1
.end method

.method public onDetach()V
    .locals 1

    .line 312
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    .line 313
    iput-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->callbacks:Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 318
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 187
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    return-void
.end method

.method public openDrawer()V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V

    return-void
.end method

.method public setLive()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->liveItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/rt/mobile/english/ui/DrawerFragment;->selectItem(Landroid/view/View;Landroid/os/Bundle;)V

    .line 297
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/MainActivity;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/MainActivity;->openLive()V

    return-void
.end method

.method public setSelectedItem(Landroid/view/View;)V
    .locals 3

    .line 282
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->selectableItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 284
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 285
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    .line 290
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    :cond_2
    return-void
.end method

.method public setSelection(Landroid/net/Uri;)V
    .locals 3

    .line 346
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 350
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 353
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    return-void

    .line 357
    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "open_uri"

    .line 358
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 359
    invoke-direct {p0, v0, v1}, Lcom/rt/mobile/english/ui/DrawerFragment;->selectItem(Landroid/view/View;Landroid/os/Bundle;)V

    .line 361
    :cond_2
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/MainActivity;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/MainActivity;->onNavigationDrawerClosed()V

    return-void
.end method

.method public setUp(ILandroid/support/v4/widget/DrawerLayout;)V
    .locals 2

    .line 235
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->container:Landroid/view/View;

    .line 236
    iput-object p2, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    .line 237
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const v0, 0x7f0800b6

    const v1, 0x800003

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerShadow(II)V

    .line 239
    new-instance p1, Lcom/rt/mobile/english/Utils;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/Utils;-><init>(Landroid/content/Context;)V

    .line 240
    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "frLaunch"

    const/4 v1, 0x0

    .line 241
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    .line 242
    invoke-virtual {p2, v0}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(I)V

    .line 243
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "frLaunch"

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public setUpToggle(Landroid/support/v7/widget/Toolbar;)V
    .locals 8

    .line 199
    new-instance v7, Lcom/rt/mobile/english/ui/DrawerFragment$1;

    .line 200
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    const v5, 0x7f1000e2

    const v6, 0x7f1000e1

    move-object v0, v7

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/rt/mobile/english/ui/DrawerFragment$1;-><init>(Lcom/rt/mobile/english/ui/DrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V

    iput-object v7, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    .line 229
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->syncState()V

    .line 231
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerLayout:Landroid/support/v4/widget/DrawerLayout;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/DrawerFragment;->drawerToggle:Landroid/support/v7/app/ActionBarDrawerToggle;

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerListener(Landroid/support/v4/widget/DrawerLayout$DrawerListener;)V

    return-void
.end method
