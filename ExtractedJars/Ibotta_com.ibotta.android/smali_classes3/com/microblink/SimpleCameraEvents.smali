.class Lcom/microblink/SimpleCameraEvents;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/view/CameraEventsListener;


# static fields
.field private static final TAG:Ljava/lang/String; = "SimpleCameraEvents"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutofocusFailed()V
    .locals 3

    const-string v0, "SimpleCameraEvents"

    const-string v1, "auto focus failed."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onAutofocusStarted([Landroid/graphics/Rect;)V
    .locals 2

    const-string p1, "SimpleCameraEvents"

    const-string v0, "auto focus started."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onAutofocusStopped([Landroid/graphics/Rect;)V
    .locals 2

    const-string p1, "SimpleCameraEvents"

    const-string v0, "auto focused stopped."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCameraPermissionDenied()V
    .locals 3

    const-string v0, "SimpleCameraEvents"

    const-string v1, "camera permission denied."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCameraPreviewStarted()V
    .locals 3

    const-string v0, "SimpleCameraEvents"

    const-string v1, "camera preview started."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCameraPreviewStopped()V
    .locals 3

    const-string v0, "SimpleCameraEvents"

    const-string v1, "camera preview stopped."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "SimpleCameraEvents"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
