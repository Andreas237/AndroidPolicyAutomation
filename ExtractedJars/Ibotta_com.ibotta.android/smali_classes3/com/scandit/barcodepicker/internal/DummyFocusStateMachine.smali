.class public Lcom/scandit/barcodepicker/internal/DummyFocusStateMachine;
.super Lcom/scandit/barcodepicker/internal/FocusStateMachine;
.source "DummyFocusStateMachine.java"


# direct methods
.method public constructor <init>(Lcom/scandit/barcodepicker/internal/FocusOptions;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;-><init>(Lcom/scandit/barcodepicker/internal/FocusOptions;)V

    return-void
.end method

.method public static getNoOpFocusEvent()Lcom/scandit/base/camera/SbFocusEvent;
    .locals 2

    .line 17
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v0}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    .line 18
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v0}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    const/4 v1, 0x0

    .line 19
    iput-boolean v1, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    .line 20
    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->IGNORE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object v1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic manualFocusAtPoint(FF)V
    .locals 0

    .line 11
    invoke-super {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->manualFocusAtPoint(FF)V

    return-void
.end method

.method protected release(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 11
    invoke-super {p0}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->reset()V

    return-void
.end method

.method public bridge synthetic setFocusRange(II)V
    .locals 0

    .line 11
    invoke-super {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->setFocusRange(II)V

    return-void
.end method

.method public bridge synthetic setHotSpot(FF)V
    .locals 0

    .line 11
    invoke-super {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->setHotSpot(FF)V

    return-void
.end method

.method public update(Z)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 0

    .line 30
    invoke-static {}, Lcom/scandit/barcodepicker/internal/DummyFocusStateMachine;->getNoOpFocusEvent()Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object p1

    return-object p1
.end method
