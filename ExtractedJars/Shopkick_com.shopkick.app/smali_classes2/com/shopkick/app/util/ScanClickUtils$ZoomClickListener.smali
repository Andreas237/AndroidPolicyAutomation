.class public Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ScanClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ZoomClickListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;
    }
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private largeImageSet:Z

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 306
    iput-boolean v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->largeImageSet:Z

    .line 312
    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->context:Landroid/content/Context;

    .line 313
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 314
    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 315
    iput-object p4, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;
    .locals 0

    .line 298
    iget-object p0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 0

    .line 298
    iget-object p0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Z)Z
    .locals 0

    .line 298
    iput-boolean p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->largeImageSet:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V
    .locals 0

    .line 298
    invoke-direct {p0, p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->setImagePostDelayed(Lcom/github/chrisbanes/photoview/PhotoView;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 298
    iget-object p0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method private setImagePostDelayed(Lcom/github/chrisbanes/photoview/PhotoView;)V
    .locals 5

    .line 377
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/github/chrisbanes/photoview/PhotoView;->getAttacher()Lcom/github/chrisbanes/photoview/PhotoViewAttacher;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->maxScanZoomScaleFactor:Ljava/lang/Double;

    .line 382
    invoke-virtual {v0}, Ljava/lang/Double;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    const/high16 v0, 0x40400000    # 3.0f

    :goto_0
    const/4 v1, 0x1

    .line 384
    invoke-virtual {p1, v1}, Lcom/github/chrisbanes/photoview/PhotoView;->setEnabled(Z)V

    .line 385
    invoke-virtual {p1, v0}, Lcom/github/chrisbanes/photoview/PhotoView;->setMaximumScale(F)V

    const/high16 v0, 0x3fc00000    # 1.5f

    .line 386
    invoke-virtual {p1, v0}, Lcom/github/chrisbanes/photoview/PhotoView;->setScale(F)V

    .line 387
    invoke-virtual {p1}, Lcom/github/chrisbanes/photoview/PhotoView;->getScale()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/github/chrisbanes/photoview/PhotoView;->setTag(Ljava/lang/Object;)V

    .line 388
    new-instance v2, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;

    invoke-direct {v2, p0, p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;-><init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V

    invoke-virtual {p1, v2}, Lcom/github/chrisbanes/photoview/PhotoView;->setOnScaleChangeListener(Lcom/github/chrisbanes/photoview/OnScaleChangedListener;)V

    .line 402
    new-instance v2, Landroid/animation/ValueAnimator;

    invoke-direct {v2}, Landroid/animation/ValueAnimator;-><init>()V

    const/4 v3, 0x2

    .line 403
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v3, v4

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setObjectValues([Ljava/lang/Object;)V

    const/16 v0, 0x12c

    int-to-long v0, v0

    .line 404
    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    const/16 v0, 0x1f4

    int-to-long v0, v0

    .line 405
    invoke-virtual {v2, v0, v1}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 406
    new-instance v0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$4;-><init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V

    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 413
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 319
    new-instance p1, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->context:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;-><init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    const v0, 0x7f0c019a

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->setContentView(I)V

    .line 322
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    const v0, 0x7f090545

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    const v0, 0x7f090403

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/chrisbanes/photoview/PhotoView;

    const/4 v0, 0x0

    .line 326
    invoke-virtual {p1, v0}, Lcom/github/chrisbanes/photoview/PhotoView;->setEnabled(Z)V

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    goto :goto_0

    .line 331
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    goto :goto_0

    .line 334
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    :goto_0
    if-nez v0, :cond_2

    return-void

    .line 340
    :cond_2
    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequests;->asBitmap()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$1;-><init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    .line 355
    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    .line 357
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    const v0, 0x7f09021d

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 358
    new-instance v0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$2;-><init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->dialog:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;

    invoke-virtual {p1}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$ProductZoomDialog;->show()V

    return-void
.end method
