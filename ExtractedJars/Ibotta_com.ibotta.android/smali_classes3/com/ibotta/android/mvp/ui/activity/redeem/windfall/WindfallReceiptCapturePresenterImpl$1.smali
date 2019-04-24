.class synthetic Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;
.super Ljava/lang/Object;
.source "WindfallReceiptCapturePresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 283
    invoke-static {}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->values()[Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CANCEL:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenterImpl$1;->$SwitchMap$com$ibotta$android$view$camera$ReceiptCaptureButtonsView$ReceiptCaptureButton:[I

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-void
.end method
