.class public Lcom/microblink/CameraScanActivity;
.super Landroid/support/v7/app/AppCompatActivity;

# interfaces
.implements Lcom/microblink/CameraRecognizerCallback;
.implements Lcom/microblink/internal/view/presenter/CameraScanContract$View;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final BITMAP_ROTATION_COMPLETED:I = 0x3e8

.field private static final PROGRESS_BAR_DELAY:J = 0x190L

.field private static final TAG:Ljava/lang/String; = "CameraScanActivity"


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private callback:Lcom/microblink/CameraRecognizerCallback;

.field private cameraButton:Landroid/widget/ImageButton;

.field private cancelBtn:Landroid/widget/TextView;

.field private captureShutter:Landroid/widget/FrameLayout;

.field private capturedBitmap:Landroid/graphics/Bitmap;

.field private capturedFrameOverlay:Landroid/widget/FrameLayout;

.field private capturedImageView:Landroid/widget/ImageView;

.field private capturedResult:Lcom/microblink/BitmapResult;

.field private confirmedImageView:Landroid/widget/ImageView;

.field private doneBtn:Landroid/widget/TextView;

.field private dynamicViewPort:Lcom/microblink/DynamicViewPort;

.field private framesCaptured:Landroid/widget/TextView;

.field private final handler:Landroid/os/Handler;

.field private hintView:Landroid/widget/TextView;

.field private moveCloserView:Landroid/widget/TextView;

.field private presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

.field private progressBar:Landroid/widget/ProgressBar;

.field private recognizerView:Lcom/microblink/RecognizerView;

.field private scanRegion:Landroid/graphics/RectF;

.field private tipView:Landroid/widget/TextView;

.field private torchButton:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/microblink/CameraScanActivity$1;

    invoke-direct {v2, p0}, Lcom/microblink/CameraScanActivity$1;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/CameraScanActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->progressBar:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/CameraScanActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/CameraScanActivity;->animateShutter()V

    return-void
.end method

.method static synthetic access$1000(Lcom/microblink/CameraScanActivity;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/microblink/CameraScanActivity;Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/microblink/CameraScanActivity;->removeOnGlobalLayoutListener(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/microblink/CameraScanActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->moveCloserView:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$1302(Lcom/microblink/CameraScanActivity;Lcom/microblink/BitmapResult;)Lcom/microblink/BitmapResult;
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->capturedResult:Lcom/microblink/BitmapResult;

    return-object p1
.end method

.method static synthetic access$1400(Lcom/microblink/CameraScanActivity;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/CameraScanActivity;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->capturedBitmap:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method static synthetic access$202(Lcom/microblink/CameraScanActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->capturedBitmap:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic access$300(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->capturedImageView:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/CameraScanActivity;)Lcom/microblink/DynamicViewPort;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/CameraScanActivity;)Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    return-object p0
.end method

.method static synthetic access$600(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageButton;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    return-object p0
.end method

.method static synthetic access$700(Lcom/microblink/CameraScanActivity;Landroid/content/Context;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/microblink/CameraScanActivity;->setBackground(Landroid/content/Context;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic access$800(Lcom/microblink/CameraScanActivity;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->confirmedImageView:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$900(Lcom/microblink/CameraScanActivity;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Lcom/microblink/CameraScanActivity;->capturedFrameOverlay:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method private animateShutter()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->captureShutter:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x106000c

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->captureShutter:Landroid/widget/FrameLayout;

    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private removeOnGlobalLayoutListener(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private setBackground(Landroid/content/Context;Landroid/view/View;I)V
    .locals 2
    .param p3    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-static {p1, p3}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    invoke-static {p1, p3}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public cancelScan()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->cancelBtn:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    :try_start_0
    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->terminate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "CameraScanActivity"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, v1}, Lcom/microblink/CameraScanActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->finish()V

    return-void
.end method

.method public captureFrame()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    new-instance v1, Lcom/microblink/CameraScanActivity$11;

    invoke-direct {v1, p0}, Lcom/microblink/CameraScanActivity$11;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-virtual {v0, v1}, Lcom/microblink/RecognizerView;->takePicture(Lcom/microblink/CameraCaptureListener;)V

    return-void
.end method

.method public confirmPhoto(Z)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedResult:Lcom/microblink/BitmapResult;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    sget v1, Lcom/microblink/library/R$color;->see_through_black:I

    invoke-virtual {v0, v1}, Lcom/microblink/DynamicViewPort;->setBackgroundColorViewPort(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->confirmedImageView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->confirmedImageView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->capturedImageView:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedImageView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0x2ee

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Lcom/microblink/CameraScanActivity$12;

    invoke-direct {v0, p0}, Lcom/microblink/CameraScanActivity$12;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    sget v0, Lcom/microblink/library/R$drawable;->camera_button_selector:I

    invoke-direct {p0, p0, p1, v0}, Lcom/microblink/CameraScanActivity;->setBackground(Landroid/content/Context;Landroid/view/View;I)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedResult:Lcom/microblink/BitmapResult;

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->confirmPicture(Lcom/microblink/BitmapResult;)V

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    invoke-interface {p1}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onPhotoConfirmed()V

    :cond_1
    return-void
.end method

.method public disableDoneButton()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    return-void
.end method

.method public discardCapturedFrame()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    sget v1, Lcom/microblink/library/R$color;->see_through_black:I

    invoke-virtual {v0, v1}, Lcom/microblink/DynamicViewPort;->setBackgroundColorViewPort(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    sget v1, Lcom/microblink/library/R$drawable;->camera_button_selector:I

    invoke-direct {p0, p0, v0, v1}, Lcom/microblink/CameraScanActivity;->setBackground(Landroid/content/Context;Landroid/view/View;I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public displayDoneButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public displayHint(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->hintView:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public displayTip(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->tipView:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public displayTorch(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->torchButton:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void
.end method

.method public enableDoneButton()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    return-void
.end method

.method public finishScan()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->cancelBtn:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->moveCloserView:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->finishedScanning()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/microblink/RecognizerView;->changeConfiguration(Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method public onConfirmPicture(Ljava/io/File;)V
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onConfirmPicture(Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "CameraScanActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/CameraScanActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "CameraScanActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "CameraScanActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "fullScreenExtra"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "keepScreenOnExtra"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v3}, Lcom/microblink/CameraScanActivity;->requestWindowFeature(I)Z

    const/16 p1, 0x400

    invoke-virtual {v2, p1, p1}, Landroid/view/Window;->setFlags(II)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt p1, v4, :cond_0

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v2, 0xf06

    invoke-virtual {p1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x80

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_1
    sget p1, Lcom/microblink/library/R$layout;->activity_camera_scan:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->setContentView(I)V

    sget p1, Lcom/microblink/library/R$id;->recognizer:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/microblink/RecognizerView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    sget p1, Lcom/microblink/library/R$id;->camera_button:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    sget p1, Lcom/microblink/library/R$id;->torch_button:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->torchButton:Landroid/widget/ImageButton;

    sget p1, Lcom/microblink/library/R$id;->captured_frame_shutter:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->captureShutter:Landroid/widget/FrameLayout;

    sget p1, Lcom/microblink/library/R$id;->frames_captured:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->framesCaptured:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->cancel:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->cancelBtn:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->done:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->camera_capture_hint:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->hintView:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->camera_capture_tip:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->tipView:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->move_closer_label:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->moveCloserView:Landroid/widget/TextView;

    sget p1, Lcom/microblink/library/R$id;->progress_bar:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->progressBar:Landroid/widget/ProgressBar;

    sget p1, Lcom/microblink/library/R$id;->dynamic_view_port:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/microblink/DynamicViewPort;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    sget p1, Lcom/microblink/library/R$id;->captured_frame_overlay:I

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->capturedFrameOverlay:Landroid/widget/FrameLayout;

    new-instance p1, Lcom/microblink/internal/view/presenter/CameraScanPresenter;

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/microblink/internal/view/presenter/CameraScanPresenter;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    new-instance v0, Lcom/microblink/CameraScanActivity$2;

    invoke-direct {v0, p0}, Lcom/microblink/CameraScanActivity$2;-><init>(Lcom/microblink/CameraScanActivity;)V

    instance-of v2, p1, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->cancelBtn:Landroid/widget/TextView;

    new-instance v0, Lcom/microblink/CameraScanActivity$3;

    invoke-direct {v0, p0}, Lcom/microblink/CameraScanActivity$3;-><init>(Lcom/microblink/CameraScanActivity;)V

    instance-of v2, p1, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    new-instance v0, Lcom/microblink/CameraScanActivity$4;

    invoke-direct {v0, p0}, Lcom/microblink/CameraScanActivity$4;-><init>(Lcom/microblink/CameraScanActivity;)V

    instance-of v2, p1, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_4
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_3
    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->torchButton:Landroid/widget/ImageButton;

    new-instance v0, Lcom/microblink/CameraScanActivity$5;

    invoke-direct {v0, p0}, Lcom/microblink/CameraScanActivity$5;-><init>(Lcom/microblink/CameraScanActivity;)V

    instance-of v2, p1, Landroid/view/View;

    if-nez v2, :cond_5

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_5
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_4
    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "cameraRecognizerCallbackExtra"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/microblink/CameraRecognizerCallback;

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "enhancedAutoFocusExtra"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/microblink/RecognizerView;->enableEnhancedAutofocus(Z)V

    invoke-static {}, Lcom/microblink/ReceiptSdk;->isInitialized()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "licenseKeyExtra"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lcom/microblink/CameraScanActivity$6;

    invoke-direct {v2, p0}, Lcom/microblink/CameraScanActivity$6;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-static {v0, p1, v2}, Lcom/microblink/ReceiptSdk;->sdkInitialize(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/InitializeCallback;)V

    :cond_6
    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "bundleExtra"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "scanOptionsExtra"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/microblink/ScanOptions;

    if-nez p1, :cond_7

    invoke-static {}, Lcom/microblink/ScanOptions;->newBuilder()Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    sget-object v0, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    invoke-virtual {p1, v0}, Lcom/microblink/ScanOptions$Builder;->retailer(Lcom/microblink/Retailer;)Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->newBuilder()Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    sget-object v2, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_720p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0, v2}, Lcom/microblink/FrameCharacteristics$Builder;->videoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics$Builder;->build()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics(Lcom/microblink/FrameCharacteristics;)Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    new-instance v0, Lcom/microblink/EdgeDetectionConfiguration;

    invoke-direct {v0}, Lcom/microblink/EdgeDetectionConfiguration;-><init>()V

    invoke-virtual {p1, v0}, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration(Lcom/microblink/EdgeDetectionConfiguration;)Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/microblink/ScanOptions$Builder;->build()Lcom/microblink/ScanOptions;

    move-result-object p1

    :cond_7
    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "viewPortExtra"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/microblink/RecognizerCompatibility;->defaultRegionOfInterest()Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    :cond_8
    :try_start_1
    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    iget-object v2, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v0, v2}, Lcom/microblink/RecognizerView;->scanRegion(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    iget-object v2, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v4, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget-object v5, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    iget-object v6, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-virtual {v0, v2, v4, v5, v6}, Lcom/microblink/DynamicViewPort;->setViewPort(FFFF)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    new-array v2, v3, [Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    aput-object v4, v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/microblink/RecognizerView;->setMeteringAreas([Landroid/graphics/RectF;Z)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    invoke-static {}, Lcom/microblink/RecognizerCompatibility;->defaultRegionOfInterest()Landroid/graphics/RectF;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    iget-object v2, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v0, v2}, Lcom/microblink/RecognizerView;->scanRegion(Landroid/graphics/RectF;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->dynamicViewPort:Lcom/microblink/DynamicViewPort;

    iget-object v2, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v4, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->top:F

    iget-object v5, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v5

    iget-object v6, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-virtual {v0, v2, v4, v5, v6}, Lcom/microblink/DynamicViewPort;->setViewPort(FFFF)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    new-array v2, v3, [Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/microblink/CameraScanActivity;->scanRegion:Landroid/graphics/RectF;

    aput-object v4, v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/microblink/RecognizerView;->setMeteringAreas([Landroid/graphics/RectF;Z)V

    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/microblink/library/R$string;->invalid_scan_region:I

    invoke-virtual {p0, v1}, Lcom/microblink/CameraScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/microblink/library/R$string;->invalid_scan_region_message:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(I)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/microblink/CameraScanActivity$7;

    invoke-direct {v2, p0}, Lcom/microblink/CameraScanActivity$7;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->show()Landroid/support/v7/app/AlertDialog;

    :goto_5
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedImageView:Landroid/widget/ImageView;

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/microblink/CameraScanActivity;->confirmedImageView:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->capturedFrameOverlay:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/microblink/CameraScanActivity$8;

    invoke-direct {v1, p0}, Lcom/microblink/CameraScanActivity$8;-><init>(Lcom/microblink/CameraScanActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->moveCloserView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "moveCloserMessage"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "moveCloserMessage"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_9
    sget v1, Lcom/microblink/library/R$string;->camera_scanning_move_closer:I

    invoke-virtual {p0, v1}, Lcom/microblink/CameraScanActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v1, v0}, Lcom/microblink/RecognizerView;->setVideoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    invoke-virtual {v0, v1}, Lcom/microblink/RecognizerView;->setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p0}, Lcom/microblink/RecognizerView;->recognizerCallback(Lcom/microblink/CameraRecognizerCallback;)V

    :try_start_2
    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p1}, Lcom/microblink/RecognizerView;->initialize(Lcom/microblink/ScanOptions;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->finish()V

    :goto_7
    iget-object p1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {p1}, Lcom/microblink/RecognizerView;->create()V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->destroy()V

    :cond_0
    return-void
.end method

.method public onException(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onException(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->pause()V

    :cond_0
    return-void
.end method

.method public onPermissionDenied()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/CameraRecognizerCallback;->onPermissionDenied()V

    :cond_0
    return-void
.end method

.method public onPreviewStarted()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    iget-object v1, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v1}, Lcom/microblink/RecognizerView;->isCameraTorchSupported()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onTorchAvailable(Z)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/CameraRecognizerCallback;->onPreviewStarted()V

    :cond_0
    return-void
.end method

.method public onPreviewStopped()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/CameraRecognizerCallback;->onPreviewStopped()V

    :cond_0
    return-void
.end method

.method public onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 4
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/microblink/CameraScanActivity$9;

    invoke-direct {v1, p0, p1, p2}, Lcom/microblink/CameraScanActivity$9;-><init>(Lcom/microblink/CameraScanActivity;Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerDone(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V

    :cond_0
    return-void
.end method

.method public onRecognizerException(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/microblink/CameraScanActivity;->finish()V

    return-void
.end method

.method public onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V
    .locals 3
    .param p1    # Lcom/microblink/RecognizerResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    instance-of v0, p1, Lcom/microblink/EdgeDetectionResult;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/microblink/EdgeDetectionResult;

    iget-object v1, p0, Lcom/microblink/CameraScanActivity;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/microblink/CameraScanActivity$10;

    invoke-direct {v2, p0, v0}, Lcom/microblink/CameraScanActivity$10;-><init>(Lcom/microblink/CameraScanActivity;Lcom/microblink/EdgeDetectionResult;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->callback:Lcom/microblink/CameraRecognizerCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/microblink/CameraRecognizerCallback;->onRecognizerResultsChanged(Lcom/microblink/RecognizerResult;)V

    :cond_1
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->resume()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    invoke-interface {v0, p0}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onViewAttached(Lcom/microblink/internal/view/View;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->start()V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    invoke-interface {v0}, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;->onViewDetached()V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/RecognizerView;->stop()V

    :cond_0
    return-void
.end method

.method public setCancelButtonText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->cancelBtn:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCapturedFrameCount(I)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->framesCaptured:Landroid/widget/TextView;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "%d"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setDoneButtonText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->doneBtn:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setEnableCaptureFrameBtn(Z)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->cameraButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    return-void
.end method

.method public setHintMsg(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->hintView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic setPresenter(Lcom/microblink/internal/view/Presenter;)V
    .locals 0

    check-cast p1, Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    invoke-virtual {p0, p1}, Lcom/microblink/CameraScanActivity;->setPresenter(Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;)V

    return-void
.end method

.method public setPresenter(Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity;->presenter:Lcom/microblink/internal/view/presenter/CameraScanContract$Presenter;

    return-void
.end method

.method public setTipMsg(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->tipView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public toggleTorch(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .locals 1
    .param p2    # Lcom/microblink/camera/hardware/SuccessCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/CameraScanActivity;->recognizerView:Lcom/microblink/RecognizerView;

    invoke-virtual {v0, p1, p2}, Lcom/microblink/RecognizerView;->setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V

    return-void
.end method
