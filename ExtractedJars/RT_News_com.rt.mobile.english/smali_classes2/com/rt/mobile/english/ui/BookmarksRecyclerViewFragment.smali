.class public Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "BookmarksRecyclerViewFragment.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;
    }
.end annotation


# static fields
.field public static final ARGUMENT_SECTION_ID:Ljava/lang/String; = "section_id"

.field public static final ARGUMENT_SECTION_TITLE:Ljava/lang/String; = "section_title"

.field private static final ITEM_COLUMN:Ljava/lang/String; = "item"


# instance fields
.field ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

.field ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

.field articles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;"
        }
    .end annotation
.end field

.field private canHideToolbar:Z

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

.field no_bookmarks:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090106
    .end annotation
.end field

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field recyclerView:Landroid/support/v7/widget/RecyclerView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09012c
    .end annotation
.end field

.field sectionId:Ljava/lang/String;

.field sectionTitle:Ljava/lang/String;

.field selectedPosition:I

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field toolbar_and_tabs:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090197
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->canHideToolbar:Z

    return-void
.end method

.method static synthetic access$002(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Z)Z
    .locals 0

    .line 65
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->canHideToolbar:Z

    return p1
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->updateVisual()V

    return-void
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;ILjava/util/List;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->onArticleClicked(ILjava/util/List;)V

    return-void
.end method

.method private onArticleClicked(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 254
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/articles/Article;

    .line 255
    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 257
    :cond_0
    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/rt/mobile/english/ui/BookmarkActivity;

    invoke-direct {p2, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "articles_string"

    .line 258
    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const-string v0, "initial_position"

    .line 259
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private updateVisual()V
    .locals 6

    .line 265
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f10011d

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070051

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 267
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070052

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 268
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 269
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    .line 266
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 271
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    goto :goto_0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070053

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 274
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    const/4 v3, 0x0

    .line 273
    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 276
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    :goto_0
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 135
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 136
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecoration;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    .line 137
    new-instance p1, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/SpacingItemDecorationList;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    .line 138
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f10011d

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 139
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 143
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f100024

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .line 115
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 116
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 118
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "section_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->sectionId:Ljava/lang/String;

    .line 119
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "section_title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->sectionTitle:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 299
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 300
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    .line 301
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->updateVisual()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 100
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 101
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object p1

    if-nez p1, :cond_0

    .line 102
    new-instance p1, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/rt/mobile/english/ui/DatabaseManager;->initializeInstance(Landroid/database/sqlite/SQLiteOpenHelper;)V

    .line 104
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c004f

    const/4 v0, 0x0

    .line 218
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 219
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 220
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/ui/MainActivity;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p3}, Lcom/rt/mobile/english/ui/MainActivity;->setToolbar(Landroid/support/v7/widget/Toolbar;)V

    .line 221
    iget-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p3

    invoke-virtual {p3}, Landroid/support/v4/app/FragmentActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 222
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->setRecyclerViewLayoutManager()V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 109
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 110
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getDefaultSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 125
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 249
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 282
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f100112

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 283
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->reloadData()V

    .line 285
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    const p2, 0x7f10011d

    invoke-virtual {p0, p2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 286
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 287
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    goto :goto_0

    .line 289
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecoration:Lcom/rt/mobile/english/ui/SpacingItemDecoration;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 290
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->ItemDecorationList:Lcom/rt/mobile/english/ui/SpacingItemDecorationList;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 293
    :goto_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->updateVisual()V

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 148
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 149
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->reloadData()V

    .line 150
    :goto_0
    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 151
    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    goto :goto_0

    .line 153
    :cond_0
    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    if-lez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    :cond_1
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 160
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 161
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 162
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    .line 163
    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 164
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 165
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 130
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    return-void
.end method

.method public reloadData()V
    .locals 9

    .line 170
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reloadData() selectedPosition = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->selectedPosition:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 175
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->openDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "bookmarks"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 176
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 177
    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 178
    invoke-interface {v0}, Landroid/database/Cursor;->moveToLast()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "item"

    .line 180
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 181
    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->gson:Lcom/google/gson/Gson;

    const-class v4, Lcom/rt/mobile/english/data/articles/Article;

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    invoke-interface {v0}, Landroid/database/Cursor;->moveToPrevious()Z

    move-result v1

    if-nez v1, :cond_1

    .line 185
    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 186
    invoke-static {}, Lcom/rt/mobile/english/ui/DatabaseManager;->getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    .line 188
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 189
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->no_bookmarks:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 191
    :cond_3
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->no_bookmarks:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 193
    :goto_0
    new-instance v0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->articles:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;-><init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Ljava/util/List;)V

    .line 194
    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 195
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$1;-><init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v7/widget/RecyclerView;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public setRecyclerViewLayoutManager()V
    .locals 5

    .line 230
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 232
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 234
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 235
    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 238
    :cond_1
    :goto_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f10011d

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 239
    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0a0005

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    goto :goto_1

    .line 241
    :cond_2
    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    .line 243
    :goto_1
    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->layoutManager:Landroid/support/v7/widget/RecyclerView$LayoutManager;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 244
    iget-object v1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method
