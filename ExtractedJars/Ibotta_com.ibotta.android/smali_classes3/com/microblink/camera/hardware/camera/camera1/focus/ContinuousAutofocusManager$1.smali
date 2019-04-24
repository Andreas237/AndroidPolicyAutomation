.class Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 6

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    const-string v1, "Full autofocus cycle completed with success: {}"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v3}, Lcom/microblink/internal/Logger;->v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0, v5}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$002(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0, v5}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$102(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$200(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/DeviceManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$200(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/DeviceManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceManager;->isFocusCallbackUntrusty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    const-string v0, "This is a device with untrusty focus. We will assume that focus has succeeded!"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    :cond_0
    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)[Landroid/graphics/Rect;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {v0, p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusFailed()V

    :cond_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$600(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Landroid/hardware/Camera;

    move-result-object p1

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    const-string v0, "continuous-picture"

    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    const-string v0, "Failed to transfer camera back into continuous autofocus mode! This is a device issue!"

    new-array v1, v5, [Ljava/lang/Object;

    invoke-static {p2, p1, v0, v1}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
