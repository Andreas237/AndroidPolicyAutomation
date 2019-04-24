.class Lcom/scandit/barcodepicker/internal/FocusStateMachine;
.super Lcom/scandit/recognition/NativeHandle;
.source "FocusStateMachine.java"


# instance fields
.field private mHotSpot:Landroid/graphics/PointF;

.field private mManualFocusPoint:Z


# direct methods
.method public constructor <init>(Lcom/scandit/barcodepicker/internal/FocusOptions;)V
    .locals 2

    .line 23
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/FocusOptions;->getHandle()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_new(J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mManualFocusPoint:Z

    .line 21
    new-instance p1, Landroid/graphics/PointF;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-direct {p1, v0, v0}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mHotSpot:Landroid/graphics/PointF;

    return-void
.end method

.method private generateFocusEvent(Lcom/scandit/base/camera/SbFocusEvent$Area;IIZ)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v0}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    if-nez p1, :cond_0

    .line 55
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-object v0

    .line 59
    :cond_0
    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    if-eqz p4, :cond_1

    .line 60
    sget p1, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_NEAR:I

    if-ne p2, p1, :cond_1

    .line 61
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->MACRO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    goto :goto_0

    .line 62
    :cond_1
    sget p1, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FAR:I

    if-ne p2, p1, :cond_2

    .line 63
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->INFINITY:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    goto :goto_0

    .line 67
    :cond_2
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->AUTO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    .line 70
    :goto_0
    sget p1, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_NONE:I

    const/4 p2, 0x0

    if-ne p3, p1, :cond_3

    .line 71
    iput-boolean p2, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    .line 72
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    goto :goto_1

    .line 73
    :cond_3
    sget p1, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_AT_POINT:I

    if-ne p3, p1, :cond_4

    const/4 p1, 0x1

    .line 74
    iput-boolean p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    goto :goto_1

    .line 75
    :cond_4
    sget p1, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_CONTINUOUS:I

    if-ne p3, p1, :cond_5

    .line 76
    iput-boolean p2, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    .line 77
    sget-object p1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->CONTINUOUS:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    :cond_5
    :goto_1
    return-object v0
.end method


# virtual methods
.method public manualFocusAtPoint(FF)V
    .locals 2

    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mManualFocusPoint:Z

    .line 84
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_manual_focus_at_xy(JFF)V

    return-void
.end method

.method protected release(J)V
    .locals 0

    .line 28
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_release(J)V

    return-void
.end method

.method public reset()V
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_reset(J)V

    return-void
.end method

.method public setFocusRange(II)V
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mNative:J

    invoke-static {v0, v1, p1, p2}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_set_focus_range(JII)V

    return-void
.end method

.method public setHotSpot(FF)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mHotSpot:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public update(Z)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 6

    .line 35
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_focus_state_machine_update(J)J

    move-result-wide v0

    .line 36
    invoke-static {v0, v1}, Lcom/scandit/barcodepicker/internal/FocusEvent;->getRect(J)Lcom/scandit/base/camera/SbFocusEvent$Area;

    move-result-object v2

    .line 37
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusEvent_trigger_get(J)I

    move-result v3

    .line 38
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusEvent_range_get(J)I

    move-result v4

    .line 39
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScFocusEvent(J)V

    .line 40
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mManualFocusPoint:Z

    if-nez v0, :cond_0

    .line 41
    new-instance v2, Lcom/scandit/base/camera/SbFocusEvent$Area;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mHotSpot:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    const/high16 v1, 0x3e000000    # 0.125f

    sub-float/2addr v0, v1

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mHotSpot:Landroid/graphics/PointF;

    iget v5, v5, Landroid/graphics/PointF;->y:F

    sub-float/2addr v5, v1

    const/high16 v1, 0x3e800000    # 0.25f

    invoke-direct {v2, v0, v5, v1, v1}, Lcom/scandit/base/camera/SbFocusEvent$Area;-><init>(FFFF)V

    .line 43
    :cond_0
    invoke-direct {p0, v2, v4, v3, p1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->generateFocusEvent(Lcom/scandit/base/camera/SbFocusEvent$Area;IIZ)Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object p1

    .line 45
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mManualFocusPoint:Z

    iput-boolean v0, p1, Lcom/scandit/base/camera/SbFocusEvent;->manualFocusPoint:Z

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->mManualFocusPoint:Z

    return-object p1
.end method
