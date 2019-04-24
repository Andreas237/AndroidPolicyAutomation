.class public abstract Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;,
        Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;,
        Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$ButtonLightCheckChangedListener;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/CheckBox;

.field public b:Lexocr/base/ExBaseCardInfo;

.field protected c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

.field public d:Ljava/lang/String;

.field protected e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

.field private g:Landroid/view/SurfaceView;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    return-void
.end method

.method private c(ILandroid/content/Intent;)V
    .locals 3

    .line 431
    invoke-virtual {p0, p1, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->setResult(ILandroid/content/Intent;)V

    .line 432
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->c()V

    .line 434
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->b:Lcom/huawei/wallet/logic/event/IEventType;

    invoke-virtual {v0, v1, v2, p2}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 436
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->b(Ljava/lang/String;)V

    .line 437
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->finish()V

    .line 438
    return-void
.end method

.method private c(Landroid/view/SurfaceHolder;)V
    .locals 5

    .line 463
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 464
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b(Landroid/view/SurfaceHolder;Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 467
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_disable_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d(Ljava/lang/String;)V

    .line 468
    return-void

    .line 470
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    if-nez v0, :cond_1

    .line 472
    invoke-virtual {p0, p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    goto :goto_0

    .line 476
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->e()V

    .line 478
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->b()V

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "init camera : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 480
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 521
    invoke-static {p0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v2

    .line 522
    invoke-interface {v2, p1}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 523
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    invoke-interface {v2, v0, v1}, Lo/yr;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 532
    invoke-interface {v2}, Lo/yr;->show()V

    .line 533
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public abstract a(Ljava/lang/Object;J)V
.end method

.method protected b()V
    .locals 12

    .line 489
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 491
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 492
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getWidth()I

    move-result v7

    .line 493
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->getHeight()I

    move-result v8

    .line 494
    if-gt v7, v8, :cond_0

    .line 496
    iput v7, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 497
    move v8, v7

    goto :goto_0

    .line 501
    :cond_0
    iput v8, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 502
    move v7, v8

    .line 504
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0, v6}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 505
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v9, v0, Landroid/graphics/Point;->x:I

    .line 506
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v10, v0, Landroid/graphics/Point;->y:I

    .line 508
    const/4 v11, 0x0

    .line 509
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    move v1, v9

    move v2, v10

    move v3, v7

    move v4, v8

    move v5, v11

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setGuideFrame(IIIII)V

    .line 511
    :cond_1
    return-void
.end method

.method public abstract c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
.end method

.method protected c()V
    .locals 6

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k:Z

    .line 186
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a()V

    .line 187
    sget v0, Lcom/huawei/base/R$id;->btn_light:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    .line 188
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.camera.flash"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 193
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$ButtonLightCheckChangedListener;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$ButtonLightCheckChangedListener;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 194
    sget v0, Lcom/huawei/base/R$id;->preview_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g:Landroid/view/SurfaceView;

    .line 195
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g:Landroid/view/SurfaceView;

    invoke-direct {v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$SurfaceViewPreDrawListener;-><init>(Landroid/view/SurfaceView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 196
    sget v0, Lcom/huawei/base/R$id;->overlayview:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    .line 197
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 198
    if-eqz v3, :cond_2

    .line 200
    const-string v0, "exocr.bankcard.guideColor"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 201
    if-eqz v4, :cond_1

    .line 204
    const/high16 v0, -0x1000000

    or-int v5, v4, v0

    .line 205
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0, v5}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setGuideColor(I)V

    .line 206
    goto :goto_0

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/base/R$color;->brandcolor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setGuideColor(I)V

    .line 215
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    new-instance v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    invoke-direct {v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity$OverlayViewEventListener;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->d(Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView$IEventListener;)V

    .line 216
    return-void
.end method

.method public abstract d()Landroid/os/Handler;
.end method

.method protected final d(I)V
    .locals 0

    .line 154
    return-void
.end method

.method protected e()Z
    .locals 1

    .line 573
    const/4 v0, 0x0

    return v0
.end method

.method protected g()V
    .locals 3

    .line 306
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g:Landroid/view/SurfaceView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 308
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    .line 309
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k:Z

    if-nez v0, :cond_0

    .line 311
    invoke-interface {v2, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 312
    const/4 v0, 0x3

    invoke-interface {v2, v0}, Landroid/view/SurfaceHolder;->setType(I)V

    goto :goto_0

    .line 316
    :cond_0
    invoke-direct {p0, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c(Landroid/view/SurfaceHolder;)V

    .line 319
    :cond_1
    :goto_0
    return-void
.end method

.method protected h()V
    .locals 4

    .line 141
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->e:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 143
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->b(Ljava/lang/String;)V

    .line 144
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->c()V

    .line 145
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->finish()V

    .line 146
    return-void
.end method

.method public i()V
    .locals 4

    .line 447
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->setResult(I)V

    .line 449
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->a:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 451
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->b(Ljava/lang/String;)V

    .line 452
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->finish()V

    .line 453
    return-void
.end method

.method public k()Z
    .locals 1

    .line 376
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k()Z

    move-result v0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 406
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 408
    const v0, 0xca8d11

    if-eq p2, v0, :cond_0

    const v0, 0xca8d12

    if-ne p2, v0, :cond_1

    .line 410
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c(ILandroid/content/Intent;)V

    goto :goto_0

    .line 415
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 417
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->setScannerAlpha(I)V

    .line 420
    :cond_2
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 393
    const-string v0, "onBackPressed()"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 395
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->e:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 398
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->b(Ljava/lang/String;)V

    .line 399
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->c()V

    .line 400
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 401
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 334
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 336
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h()V

    .line 337
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c()V

    .line 338
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g()V

    .line 339
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 93
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-static {p0}, Lcom/huawei/wallet/utils/UIUtil;->c(Landroid/app/Activity;)V

    .line 98
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a(Landroid/content/Context;)V

    .line 100
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c()V

    .line 101
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 364
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 365
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d()V

    .line 366
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 126
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_0

    .line 128
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->h()V

    .line 130
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 2

    .line 344
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 345
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 351
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseOverlayView;->e()V

    .line 353
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    if-eqz v0, :cond_2

    .line 355
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b()V

    .line 356
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;

    .line 359
    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 296
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 297
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->g()V

    .line 298
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .line 324
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onWindowFocusChanged(Z)V

    .line 325
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 327
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a:Landroid/widget/CheckBox;

    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 329
    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 550
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->b()V

    .line 551
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 538
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k:Z

    if-nez v0, :cond_0

    .line 541
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k:Z

    .line 542
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->c(Landroid/view/SurfaceHolder;)V

    .line 544
    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 556
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->k:Z

    .line 557
    return-void
.end method
