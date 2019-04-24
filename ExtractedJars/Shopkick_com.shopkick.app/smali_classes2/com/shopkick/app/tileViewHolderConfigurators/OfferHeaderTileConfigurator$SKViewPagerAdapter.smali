.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "OfferHeaderTileConfigurator.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SKViewPagerAdapter"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private imageUrlLoggingMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private imageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isPinchZoomEnabled:Z

.field private loadingSpinner:Landroid/view/View;

.field private pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

.field private productFamilyId:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

.field private viewIds:Landroid/util/SparseIntArray;

.field private viewPagerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/widget/SKViewPager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;Lcom/shopkick/app/widget/SKViewPager;)V
    .locals 1

    .line 263
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    const/4 p1, 0x1

    .line 255
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->isPinchZoomEnabled:Z

    .line 257
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    .line 258
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrlLoggingMap:Ljava/util/HashMap;

    .line 259
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->viewIds:Landroid/util/SparseIntArray;

    .line 264
    invoke-virtual {p2}, Lcom/shopkick/app/widget/SKViewPager;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->context:Landroid/content/Context;

    .line 265
    new-instance p1, Lcom/shopkick/app/widget/PageIndicator;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->context:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/shopkick/app/widget/PageIndicator;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    .line 266
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->viewPagerRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)Landroid/view/View;
    .locals 0

    .line 250
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->loadingSpinner:Landroid/view/View;

    return-object p0
.end method


# virtual methods
.method public destroy()V
    .locals 0

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 377
    check-cast p3, Landroid/view/View;

    .line 378
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->getViewId(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 380
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 382
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 385
    :cond_0
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 386
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->viewIds:Landroid/util/SparseIntArray;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    rem-int/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/util/SparseIntArray;->delete(I)V

    return-void
.end method

.method public getCount()I
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    return v0
.end method

.method public getImageLogged(Ljava/lang/String;)Z
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrlLoggingMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrlLoggingMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getPageIndicator()Lcom/shopkick/app/widget/PageIndicator;
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    return-object v0
.end method

.method public getViewId(I)I
    .locals 1

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->viewIds:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 8

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int v7, p2, v0

    .line 311
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    if-gez v7, :cond_0

    goto/16 :goto_1

    .line 313
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    invoke-static {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    .line 314
    invoke-static {p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;)Lcom/shopkick/app/application/ClientFlagsManager;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->floatValue()F

    move-result p2

    goto :goto_0

    :cond_1
    const/high16 p2, 0x40400000    # 3.0f

    .line 316
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 318
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    .line 319
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->viewIds:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v7, v1}, Landroid/util/SparseIntArray;->put(II)V

    const v2, 0x7f0c015b

    const/4 v3, 0x0

    .line 321
    invoke-virtual {v0, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/github/chrisbanes/photoview/PhotoView;

    .line 322
    invoke-virtual {v0, v1}, Lcom/github/chrisbanes/photoview/PhotoView;->setId(I)V

    .line 323
    iget-boolean v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->isPinchZoomEnabled:Z

    invoke-virtual {v0, v1}, Lcom/github/chrisbanes/photoview/PhotoView;->setEnabled(Z)V

    .line 325
    iget-boolean v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->isPinchZoomEnabled:Z

    if-eqz v1, :cond_2

    .line 326
    invoke-virtual {v0, p2}, Lcom/github/chrisbanes/photoview/PhotoView;->setMaximumScale(F)V

    .line 327
    new-instance p2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)V

    invoke-virtual {v0, p2}, Lcom/github/chrisbanes/photoview/PhotoView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 337
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    .line 341
    new-instance p1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$2;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)V

    .line 351
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p2

    invoke-virtual {p2, v5}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 354
    invoke-virtual {p0, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->getImageLogged(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 355
    new-instance p1, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->productFamilyId:Ljava/lang/String;

    move-object v1, p1

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;Lcom/github/chrisbanes/photoview/PhotoView;Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, p1}, Lcom/github/chrisbanes/photoview/PhotoView;->setOnScaleChangeListener(Lcom/github/chrisbanes/photoview/OnScaleChangedListener;)V

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    return-void
.end method

.method public setImageLogged(Ljava/lang/String;)V
    .locals 2

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrlLoggingMap:Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setImageUrlList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 287
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->imageUrlLoggingMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 288
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setLoadingSpinner(Landroid/view/View;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->loadingSpinner:Landroid/view/View;

    return-void
.end method

.method public setPinchZoomEnabled(Z)V
    .locals 0

    .line 281
    iput-boolean p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->isPinchZoomEnabled:Z

    return-void
.end method

.method public setProductFamilyId(Ljava/lang/String;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->productFamilyId:Ljava/lang/String;

    return-void
.end method
