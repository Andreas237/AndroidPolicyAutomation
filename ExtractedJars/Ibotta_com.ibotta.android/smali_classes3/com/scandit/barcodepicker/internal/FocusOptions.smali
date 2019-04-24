.class Lcom/scandit/barcodepicker/internal/FocusOptions;
.super Lcom/scandit/recognition/NativeHandle;
.source "FocusOptions.java"


# static fields
.field public static final RANGE_FAR:I

.field public static final RANGE_FULL:I

.field public static final RANGE_NEAR:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_RANGE_NEAR_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_NEAR:I

    .line 19
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_RANGE_FAR_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FAR:I

    .line 20
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_RANGE_FULL_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FULL:I

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 22
    invoke-static {}, Lcom/scandit/recognition/Native;->new_ScFocusOptions()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getAutoFocusTriggerInterval()F
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_auto_focus_trigger_interval_get(J)F

    move-result v0

    return v0
.end method

.method getFocusAtPoint()Z
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_focus_at_point_get(J)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method getPrimaryRange()I
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_primary_range_get(J)I

    move-result v0

    return v0
.end method

.method getRequiresInitialFocus()Z
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_requires_initial_manual_focus_get(J)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method getSecondaryRange()I
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_secondary_range_get(J)I

    move-result v0

    return v0
.end method

.method getSupportedFocusModes()I
    .locals 2

    .line 46
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusOptions_supported_focus_modes_get(J)I

    move-result v0

    return v0
.end method

.method protected release(J)V
    .locals 0

    .line 67
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->delete_ScFocusOptions(J)V

    return-void
.end method

.method public setAutoFocusTriggerInterval(F)V
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_auto_focus_trigger_interval_set(JF)V

    return-void
.end method

.method setFocusAtPoint(Z)V
    .locals 2

    .line 26
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_focus_at_point_set(JI)V

    return-void
.end method

.method setPrimaryRange(I)V
    .locals 2

    .line 50
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_primary_range_set(JI)V

    return-void
.end method

.method setRequiresInitialFocus(Z)V
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_requires_initial_manual_focus_set(JI)V

    return-void
.end method

.method setSecondaryRange(I)V
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_secondary_range_set(JI)V

    return-void
.end method

.method setSupportedFocusModes(I)V
    .locals 2

    .line 42
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusOptions;->mNative:J

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->ScFocusOptions_supported_focus_modes_set(JI)V

    return-void
.end method
