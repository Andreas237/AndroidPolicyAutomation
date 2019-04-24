.class Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;
.super Ljava/lang/Object;
.source "WindfallReceiptCaptureActivity.java"

# interfaces
.implements Lcom/microblink/CameraCaptureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->capturePhoto()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptured(Lcom/microblink/BitmapResult;)V
    .locals 1
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;Lcom/microblink/BitmapResult;)V

    return-void
.end method

.method public onException(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onCameraFrameError"

    const/4 v1, 0x0

    .line 302
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCaptureActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/windfall/WindfallReceiptCapturePresenter;->onCameraFrameFailed()V

    return-void
.end method
