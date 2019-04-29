.class public Lcom/rt/mobile/english/ui/GalleryPhotosActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "GalleryPhotosActivity.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/PagerFragment$Adapter;
.implements Lcom/rt/mobile/english/ui/PagerFragment$Listener;
.implements Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/app/AppCompatActivity;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Adapter;",
        "Lcom/rt/mobile/english/ui/PagerFragment$Listener;",
        "Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/galleries/GalleryPhoto;",
        ">;>;>;"
    }
.end annotation


# static fields
.field private static hideDescriptionAndToolbar:Z = false


# instance fields
.field contents:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090058
    .end annotation
.end field

.field galleriesService:Lcom/rt/mobile/english/data/galleries/GalleriesService;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private gallery:Lcom/rt/mobile/english/data/galleries/Gallery;

.field private galleryPhotos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field gson:Lcom/google/gson/Gson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090027
    .end annotation
.end field

.field private position:I

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field private viewPager:Lcom/rt/mobile/english/ui/PagerFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    const/4 v0, 0x0

    .line 43
    iput v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->position:I

    return-void
.end method

.method static synthetic access$002(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;I)I
    .locals 0

    .line 38
    iput p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->position:I

    return p1
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;)Lcom/rt/mobile/english/ui/PagerFragment;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->viewPager:Lcom/rt/mobile/english/ui/PagerFragment;

    return-object p0
.end method

.method static synthetic access$200()Z
    .locals 1

    .line 38
    sget-boolean v0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->hideDescriptionAndToolbar:Z

    return v0
.end method


# virtual methods
.method public HideDescriptionAndToolbar(ZLandroid/view/View;)V
    .locals 3

    .line 186
    sput-boolean p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->hideDescriptionAndToolbar:Z

    const/16 v0, 0x400

    const/16 v1, 0x800

    if-eqz p1, :cond_1

    .line 188
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 189
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 190
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 191
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 194
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x10

    if-lt p1, p2, :cond_2

    .line 195
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x13

    if-lt p1, p2, :cond_0

    .line 196
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x1006

    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 198
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 202
    sput-boolean p1, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->hideDescriptionAndToolbar:Z

    .line 203
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 204
    iget-object p2, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/Toolbar;->setVisibility(I)V

    .line 205
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 206
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2, v1, v1}, Landroid/view/Window;->setFlags(II)V

    .line 209
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0xe

    if-lt p2, v0, :cond_2

    .line 210
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public failure(Lretrofit/RetrofitError;)V
    .locals 2

    .line 181
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Load gallery photos error"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 182
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onError()V

    return-void
.end method

.method public getFragment(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->newInstance(Ljava/lang/String;I)Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    move-result-object p1

    return-object p1
.end method

.method public getInitialPosition()I
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->viewPager:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060076

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->setPagerBackground(I)V

    .line 111
    iget v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->position:I

    return v0
.end method

.method public getPageCount()I
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 2

    .line 124
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onAttach"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    iput-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->viewPager:Lcom/rt/mobile/english/ui/PagerFragment;

    .line 126
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setAdapter(Lcom/rt/mobile/english/ui/PagerFragment$Adapter;)V

    .line 127
    new-instance v0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity$1;-><init>(Lcom/rt/mobile/english/ui/GalleryPhotosActivity;)V

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/PagerFragment;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    const v0, 0x7f0c0021

    .line 65
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 68
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 69
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 71
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0, p0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setOnRetryListener(Lcom/rt/mobile/english/ui/widget/LoadingView$OnRetryListener;)V

    .line 72
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "gallery_string"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/rt/mobile/english/data/galleries/Gallery;

    invoke-virtual {v0, v2, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/galleries/Gallery;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->gallery:Lcom/rt/mobile/english/data/galleries/Gallery;

    .line 74
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v2, 0x7f100040

    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 76
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setHomeButtonEnabled(Z)V

    if-eqz p1, :cond_0

    const-string v0, "position"

    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->position:I

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const v0, 0x7f090058

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 82
    invoke-static {v1, v2}, Lcom/rt/mobile/english/ui/PagerFragment;->newInstance(ZLjava/lang/String;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 85
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->reloadData()V

    .line 87
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    const v0, 0x7f100029

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onDetach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 0

    return-void
.end method

.method public onRetryClicked()V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoadingStart()V

    .line 163
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->reloadData()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 96
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "position"

    .line 97
    iget v1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->position:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public reloadData()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleriesService:Lcom/rt/mobile/english/data/galleries/GalleriesService;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->gallery:Lcom/rt/mobile/english/data/galleries/Gallery;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/galleries/Gallery;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/rt/mobile/english/data/galleries/GalleriesService;->listGalleryPhotos(Ljava/lang/String;Lretrofit/Callback;)V

    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/galleries/GalleryPhoto;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 168
    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;

    .line 169
    iget-object v0, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->galleryPhotos:Ljava/util/List;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v1, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 172
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->viewPager:Lcom/rt/mobile/english/ui/PagerFragment;

    if-eqz p1, :cond_1

    .line 173
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->viewPager:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/PagerFragment;->notifyDataSetChanged()V

    .line 176
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->loadingView:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V

    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 38
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/GalleryPhotosActivity;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
