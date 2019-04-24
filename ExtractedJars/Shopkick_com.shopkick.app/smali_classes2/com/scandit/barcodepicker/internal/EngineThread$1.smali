.class Lcom/scandit/barcodepicker/internal/EngineThread$1;
.super Ljava/lang/Object;
.source "EngineThread.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/Scanner$ProcessingCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/EngineThread;->initializeReader(Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/EngineThread;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 0

    .line 675
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$1;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processingDone(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;)V
    .locals 3

    .line 678
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$1;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$1;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x2f

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
