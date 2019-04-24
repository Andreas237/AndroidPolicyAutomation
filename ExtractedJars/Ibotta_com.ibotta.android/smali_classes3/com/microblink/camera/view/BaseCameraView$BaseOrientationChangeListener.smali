.class public Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/orientation/OrientationChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/view/BaseCameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "BaseOrientationChangeListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/BaseCameraView;


# direct methods
.method protected constructor <init>(Lcom/microblink/camera/view/BaseCameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isFlipped(ILcom/microblink/camera/hardware/orientation/Orientation;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    return v1

    :sswitch_0
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p2, p1, :cond_0

    return v0

    :cond_0
    return v1

    :sswitch_1
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p2, p1, :cond_1

    return v0

    :cond_1
    return v1

    :sswitch_2
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_PORTRAIT_UPSIDE:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p2, p1, :cond_2

    return v0

    :cond_2
    return v1

    :sswitch_3
    sget-object p1, Lcom/microblink/camera/hardware/orientation/Orientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/camera/hardware/orientation/Orientation;

    if-ne p2, p1, :cond_3

    return v0

    :cond_3
    return v1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method private orientationToScreenOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)I
    .locals 1

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$2;->$SwitchMap$com$microblink$camera$hardware$orientation$Orientation:[I

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/orientation/Orientation;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, -0x1

    return p1

    :pswitch_0
    const/16 p1, 0x9

    return p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    :pswitch_2
    const/16 p1, 0x8

    return p1

    :pswitch_3
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private printOrientation(I)Ljava/lang/String;
    .locals 0

    sparse-switch p1, :sswitch_data_0

    const-string p1, "unknown"

    return-object p1

    :sswitch_0
    const-string p1, "reverse_portrait"

    return-object p1

    :sswitch_1
    const-string p1, "reverse_landscape"

    return-object p1

    :sswitch_2
    const-string p1, "portrait"

    return-object p1

    :sswitch_3
    const-string p1, "landscape"

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_2
        0x8 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public onOrientationChange(Lcom/microblink/camera/hardware/orientation/Orientation;)V
    .locals 6
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "Orientation changed to {}, host screen orientation is {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget v4, v0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-direct {p0, v4}, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->printOrientation(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v2, v5

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "is host activity on sensor: {}"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->isHostActivityOrientationOnSensor()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "is flipped: {}"

    new-array v2, v5, [Ljava/lang/Object;

    iget v4, v0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-direct {p0, v4, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->isFlipped(ILcom/microblink/camera/hardware/orientation/Orientation;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->isHostActivityOrientationOnSensor()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    invoke-direct {p0, v0, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->isFlipped(ILcom/microblink/camera/hardware/orientation/Orientation;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "Activity is flipped"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraViewState:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-direct {p0, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->orientationToScreenOrientation(Lcom/microblink/camera/hardware/orientation/Orientation;)I

    move-result v1

    iput v1, v0, Lcom/microblink/camera/view/BaseCameraView;->mHostScreenOrientation:I

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->changeConfigurationInternal(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/BaseCameraView;->onActivityFlip()V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mOnActivityFlipListener:Lcom/microblink/camera/view/OnActivityFlipListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mOnActivityFlipListener:Lcom/microblink/camera/view/OnActivityFlipListener;

    invoke-interface {v0}, Lcom/microblink/camera/view/OnActivityFlipListener;->onActivityFlip()V

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {v0, p1}, Lcom/microblink/camera/view/BaseCameraView;->isOrientationAllowed(Lcom/microblink/camera/hardware/orientation/Orientation;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    const-string v1, "{} orientation is allowed. Dispatching..."

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-static {v0, p1}, Lcom/microblink/camera/view/BaseCameraView;->access$702(Lcom/microblink/camera/view/BaseCameraView;Lcom/microblink/camera/hardware/orientation/Orientation;)Lcom/microblink/camera/hardware/orientation/Orientation;

    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-boolean p1, p1, Lcom/microblink/camera/view/BaseCameraView;->mRotateMeteringAreas:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseOrientationChangeListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-virtual {p1}, Lcom/microblink/camera/view/BaseCameraView;->setMeteringAreasToCamera()V

    :cond_1
    return-void
.end method
