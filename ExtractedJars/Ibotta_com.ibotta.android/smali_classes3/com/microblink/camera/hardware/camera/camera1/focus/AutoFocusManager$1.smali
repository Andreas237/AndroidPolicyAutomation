.class Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$1;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/AutoFocusManager;->invalidateFocus()V

    return-void
.end method
