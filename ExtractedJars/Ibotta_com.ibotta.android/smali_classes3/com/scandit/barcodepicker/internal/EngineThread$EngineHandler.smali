.class final Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;
.super Landroid/os/Handler;
.source "EngineThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/EngineThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "EngineHandler"
.end annotation


# static fields
.field static final ADD_APPLY_SETTINGS_COMPLETION_HANDLER:I = 0x33

.field static final ADD_CAMERA_LISTENER:I = 0x22

.field static final ADD_EXTERNAL_PROCESSING_LISTENER:I = 0x29

.field static final ADD_ON_SCAN_LISTENER:I = 0x1e

.field static final ADD_PROCESSING_LISTENER:I = 0x2b

.field static final ADD_PROPERTY_CHANGE_LISTENER:I = 0x31

.field static final ADD_TEXT_RECOGNITION_LISTENER:I = 0x35

.field static final AUTO_FOCUS_AT_POINT:I = 0x16

.field static final AWAIT_CAMERA_STOP:I = 0x2e

.field static final CHANGE_SCAN_STATE:I = 0x4

.field static final CHECK_ORIENTATION:I = 0x20

.field static final INITIALIZE:I = 0x0

.field static final PROCESSING_DONE:I = 0x2f

.field static final PROCESS_FRAME:I = 0x3

.field static final READD_PENDING_CALLBACK_BUFFERS:I = 0x1b

.field static final REMOVE_EXTERNAL_PROCESSING_LISTENER:I = 0x2a

.field static final REMOVE_ON_SCAN_LISTENER:I = 0x26

.field static final REMOVE_PROCESSING_LISTENER:I = 0x2c

.field static final REMOVE_PROPERTY_CHANGE_LISTENER:I = 0x32

.field static final REMOVE_TEXT_RECOGNITION_LISTENER:I = 0x34

.field static final RESET_ENGINE:I = 0x1c

.field static final SET_CAMERA_FACING_DIRECTION:I = 0x10

.field static final SET_PREVIEW_ROTATION:I = 0x2

.field static final SET_PREVIEW_SURFACE:I = 0x1

.field static final SET_RECOGNITION_MODE:I = 0x30

.field static final SET_SCAN_SETTINGS:I = 0x24

.field static final SET_SCAN_STATE_UPDATE_CALLBACK:I = 0x23

.field static final SET_ZOOM_ABSOLUTE:I = 0x19

.field static final SET_ZOOM_RELATIVE:I = 0x18

.field static final SWITCH_TORCH:I = 0x17


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/EngineThread;


# direct methods
.method public constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/os/Looper;)V
    .locals 0

    .line 931
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 932
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 937
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_4

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_3

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/16 v1, 0x26

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    packed-switch v0, :pswitch_data_4

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_5

    goto/16 :goto_0

    .line 1038
    :pswitch_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->add(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1035
    :pswitch_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->remove(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1032
    :pswitch_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3400(Lcom/scandit/barcodepicker/internal/EngineThread;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1029
    :pswitch_3
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3300(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/PropertyChangeListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->remove(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1026
    :pswitch_4
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3300(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/PropertyChangeListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->add(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1023
    :pswitch_5
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3200(Lcom/scandit/barcodepicker/internal/EngineThread;I)V

    goto/16 :goto_0

    .line 1020
    :pswitch_6
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;

    invoke-virtual {v0, p1, v1, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->finishedProcessingFrame(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;Lcom/scandit/recognition/ContextStatusException;)V

    goto/16 :goto_0

    .line 1006
    :pswitch_7
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3100(Lcom/scandit/barcodepicker/internal/EngineThread;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1007
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x2e

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v1, 0x32

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_0

    .line 1013
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    const/4 v2, 0x3

    invoke-static {v0, v2, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1800(Lcom/scandit/barcodepicker/internal/EngineThread;ILjava/lang/Runnable;)V

    .line 1015
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CyclicBarrier;

    invoke-virtual {p1}, Ljava/util/concurrent/CyclicBarrier;->await()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1002
    :pswitch_8
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->remove(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 999
    :pswitch_9
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$3000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->add(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 996
    :pswitch_a
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->remove(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 993
    :pswitch_b
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->add(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 984
    :pswitch_c
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/ScanSettings;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2700(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/ScanSettings;)V

    goto/16 :goto_0

    .line 990
    :pswitch_d
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2800(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V

    goto/16 :goto_0

    .line 981
    :pswitch_e
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/base/camera/SbCameraListener;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->addListener(Lcom/scandit/base/camera/SbCameraListener;)V

    goto/16 :goto_0

    .line 972
    :pswitch_f
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2400(Lcom/scandit/barcodepicker/internal/EngineThread;)V

    goto/16 :goto_0

    .line 969
    :pswitch_10
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbICamera;->resetCallbackBuffers()V

    goto/16 :goto_0

    .line 966
    :pswitch_11
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2300(Lcom/scandit/barcodepicker/internal/EngineThread;I)V

    goto/16 :goto_0

    .line 963
    :pswitch_12
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2200(Lcom/scandit/barcodepicker/internal/EngineThread;F)V

    goto/16 :goto_0

    .line 960
    :pswitch_13
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2100(Lcom/scandit/barcodepicker/internal/EngineThread;Z)V

    goto/16 :goto_0

    .line 957
    :pswitch_14
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/PointF;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2000(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/graphics/PointF;)V

    goto :goto_0

    .line 951
    :pswitch_15
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Runnable;

    invoke-static {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1800(Lcom/scandit/barcodepicker/internal/EngineThread;ILjava/lang/Runnable;)V

    goto :goto_0

    .line 948
    :pswitch_16
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1700(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;)V

    goto :goto_0

    .line 945
    :pswitch_17
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$600(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/content/Context;)V

    goto :goto_0

    .line 942
    :pswitch_18
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/base/camera/SbIVideoPreview;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1600(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/SbIVideoPreview;)V

    goto :goto_0

    .line 939
    :pswitch_19
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1500(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V

    goto :goto_0

    .line 987
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/OnScanListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->remove(Ljava/lang/Object;)V

    goto :goto_0

    .line 978
    :cond_2
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2600(Lcom/scandit/barcodepicker/internal/EngineThread;)V

    goto :goto_0

    .line 975
    :cond_3
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$2500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;

    move-result-object v0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/scandit/barcodepicker/OnScanListener;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/ListenerList;->add(Ljava/lang/Object;)V

    goto :goto_0

    .line 954
    :cond_4
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1900(Lcom/scandit/barcodepicker/internal/EngineThread;I)V

    :catch_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1b
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x22
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x29
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2e
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
