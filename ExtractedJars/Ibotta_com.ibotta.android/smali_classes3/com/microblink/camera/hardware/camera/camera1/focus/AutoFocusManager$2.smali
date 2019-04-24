.class Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private setFocusMode(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_2

    if-eqz v2, :cond_2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const-string v3, "Setting focus mode to {}"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v0

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object p1, p1, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {p1, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const-string v2, "Setting new camera parameters failed!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void

    :catch_1
    move-exception p1

    const-string v1, "Failed to get camera parameters! Cannot set focus mode!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v0}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private toggleAutofocusMode()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mCamera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "macro"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "auto"

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->setFocusMode(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v1, "auto"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "macro"

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->setFocusMode(Ljava/lang/String;)V

    :cond_2
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to get camera parameters. Cannot toggle autofocus mode!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0, v0, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 6

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$100(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)[Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    :cond_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const/4 v0, 0x0

    iput-boolean v0, p2, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mAutofocusInProgress:Z

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$210(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const-string v1, "Autofocus request ended with {}. Request count: {}"

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v0

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {v4}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$200(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {p2, v1, v3}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/DeviceManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/microblink/camera/hardware/DeviceManager;->isFocusCallbackUntrusty()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const-string p2, "This is a device with untrusty focus. We will assume that focus has succeeded!"

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    :cond_1
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    iput-boolean p1, p2, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->mFocused:Z

    if-eqz p1, :cond_2

    const/16 p1, 0xbb8

    invoke-static {p2, p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;I)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1, v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;I)I

    goto :goto_0

    :cond_2
    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$600(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$508(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$500(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I

    move-result p1

    rem-int/2addr p1, v2

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->toggleAutofocusMode()V

    :cond_3
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$500(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusFailed()V

    :cond_4
    const/4 v0, 0x1

    :cond_5
    :goto_0
    if-eqz v0, :cond_6

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    const/16 p2, 0x1f4

    invoke-static {p1, p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;I)V

    :cond_6
    return-void
.end method
