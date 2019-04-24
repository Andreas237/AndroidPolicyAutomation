.class final Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;
.super Ljava/lang/Object;
.source "EngineThread.java"

# interfaces
.implements Lcom/scandit/base/camera/SbCameraListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/EngineThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CameraEventListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/EngineThread;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 0

    .line 832
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineThread$1;)V
    .locals 0

    .line 832
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V

    return-void
.end method


# virtual methods
.method public didCloseCamera(Lcom/scandit/base/camera/SbICamera;)V
    .locals 0

    return-void
.end method

.method public didFail(Ljava/lang/String;)V
    .locals 0

    .line 893
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1400(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 894
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1400(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    move-result-object p1

    invoke-interface {p1}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onNoCameraAccess()V

    :cond_0
    return-void
.end method

.method public didInitializeCamera(Lcom/scandit/base/camera/SbICamera;Lcom/scandit/base/camera/SbICamera$CameraFacing;II)V
    .locals 2

    .line 836
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$400(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setPreviewSize(II)V

    .line 837
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$500(Lcom/scandit/barcodepicker/internal/EngineThread;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-eqz p1, :cond_0

    .line 839
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$600(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/content/Context;)V

    .line 841
    :cond_0
    sget-object p1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne p2, p1, :cond_1

    .line 842
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$700(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/recognition/RecognitionContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide p1

    .line 843
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FACING_DIRECTION_FRONT_get()I

    move-result p3

    .line 842
    invoke-static {p1, p2, p3}, Lcom/scandit/recognition/Native;->sc_recognition_context_report_camera_facing_direction(JI)V

    goto :goto_0

    .line 845
    :cond_1
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$700(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/recognition/RecognitionContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide p1

    .line 846
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FACING_DIRECTION_BACK_get()I

    move-result p3

    .line 845
    invoke-static {p1, p2, p3}, Lcom/scandit/recognition/Native;->sc_recognition_context_report_camera_facing_direction(JI)V

    .line 848
    :goto_0
    new-instance p1, Lcom/scandit/barcodepicker/internal/FocusOptions;

    invoke-direct {p1}, Lcom/scandit/barcodepicker/internal/FocusOptions;-><init>()V

    const/4 p2, 0x1

    .line 849
    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setFocusAtPoint(Z)V

    .line 851
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string p4, "initial_focus_required"

    invoke-virtual {p3, p4}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    const/4 p4, 0x0

    if-ltz p3, :cond_3

    if-ne p3, p2, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    .line 853
    :goto_1
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setRequiresInitialFocus(Z)V

    goto :goto_2

    .line 855
    :cond_3
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/profiles/DeviceProfile;

    move-result-object p3

    invoke-virtual {p3}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isInitialFocusRequired()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setRequiresInitialFocus(Z)V

    .line 858
    :goto_2
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;

    move-result-object p3

    invoke-virtual {p3}, Lcom/scandit/base/camera/SbICamera;->getSupportedFocusBitMask()I

    move-result p3

    .line 859
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v0

    .line 860
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_AUTO_get()I

    move-result v1

    and-int/2addr v1, p3

    if-eqz v1, :cond_4

    .line 861
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_AUTO_get()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setFocusMode(I)V

    goto :goto_3

    .line 862
    :cond_4
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_MANUAL_get()I

    move-result v1

    and-int/2addr v1, p3

    if-eqz v1, :cond_5

    .line 863
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_MANUAL_get()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setFocusMode(I)V

    goto :goto_3

    .line 865
    :cond_5
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_FIXED_get()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setFocusMode(I)V

    .line 867
    :goto_3
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1102(Lcom/scandit/barcodepicker/internal/EngineThread;Z)Z

    .line 868
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setSupportedFocusModes(I)V

    .line 869
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string v0, "focus_trigger_interval"

    invoke-virtual {p3, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    if-lez p3, :cond_6

    .line 870
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 871
    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string v0, "focus_trigger_interval"

    invoke-virtual {p3, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    int-to-float p3, p3

    const v0, 0x3a83126f    # 0.001f

    mul-float p3, p3, v0

    .line 870
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setAutoFocusTriggerInterval(F)V

    goto :goto_4

    :cond_6
    const/high16 p3, 0x3f800000    # 1.0f

    .line 873
    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/FocusOptions;->setAutoFocusTriggerInterval(F)V

    .line 876
    :goto_4
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string v0, "focusStateMachineEnabled"

    invoke-virtual {p3, v0}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    if-nez p3, :cond_7

    .line 877
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    new-instance v0, Lcom/scandit/barcodepicker/internal/DummyFocusStateMachine;

    invoke-direct {v0, p1}, Lcom/scandit/barcodepicker/internal/DummyFocusStateMachine;-><init>(Lcom/scandit/barcodepicker/internal/FocusOptions;)V

    invoke-static {p3, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1202(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/FocusStateMachine;)Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    goto :goto_5

    .line 879
    :cond_7
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    new-instance v0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    invoke-direct {v0, p1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;-><init>(Lcom/scandit/barcodepicker/internal/FocusOptions;)V

    invoke-static {p3, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1202(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/FocusStateMachine;)Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    .line 881
    :goto_5
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1300(Lcom/scandit/barcodepicker/internal/EngineThread;)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->setWorkingRange(I)V

    .line 882
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1200(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    move-result-object p1

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;

    move-result-object p3

    invoke-virtual {p3}, Lcom/scandit/base/camera/SbICamera;->hasMacroMode()Z

    move-result p3

    if-eqz p3, :cond_8

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 883
    invoke-static {p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/profiles/DeviceProfile;

    move-result-object p3

    invoke-virtual {p3}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isMacroDisabled()Z

    move-result p3

    if-nez p3, :cond_8

    goto :goto_6

    :cond_8
    const/4 p2, 0x0

    .line 882
    :goto_6
    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->update(Z)Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object p1

    .line 884
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/scandit/base/camera/SbICamera;->handleAutoFocusEvent(Lcom/scandit/base/camera/SbFocusEvent;)V

    return-void
.end method
