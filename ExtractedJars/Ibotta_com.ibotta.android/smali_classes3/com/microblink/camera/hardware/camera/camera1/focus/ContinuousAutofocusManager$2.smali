.class Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$AutoFocusMoveCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocusMoving(ZLandroid/hardware/Camera;)V
    .locals 5

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    const-string v0, "Autofocus move callback start: {}"

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p2, v0, v2}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p2, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$102(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p2, v4}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$102(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    :goto_0
    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)[Landroid/graphics/Rect;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStarted([Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1, v4}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$300(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)Lcom/microblink/camera/hardware/camera/AutofocusListener;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p2}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$400(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;)[Landroid/graphics/Rect;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/microblink/camera/hardware/camera/AutofocusListener;->onAutofocusStopped([Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;

    invoke-static {p1, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;->access$502(Lcom/microblink/camera/hardware/camera/camera1/focus/ContinuousAutofocusManager;Z)Z

    :cond_2
    return-void
.end method
