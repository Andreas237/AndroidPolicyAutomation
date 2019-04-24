.class Lcom/scandit/barcodepicker/internal/FocusEvent;
.super Lcom/scandit/recognition/NativeHandle;
.source "FocusEvent.java"


# static fields
.field public static final TRIGGER_AT_POINT:I

.field public static final TRIGGER_CONTINUOUS:I

.field public static final TRIGGER_NONE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_TRIGGER_NONE_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_NONE:I

    .line 19
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_TRIGGER_AT_POINT_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_AT_POINT:I

    .line 20
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_FOCUS_TRIGGER_CONTINUOUS_get()I

    move-result v0

    sput v0, Lcom/scandit/barcodepicker/internal/FocusEvent;->TRIGGER_CONTINUOUS:I

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 23
    invoke-static {}, Lcom/scandit/recognition/Native;->new_ScFocusEvent()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method

.method constructor <init>(J)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method

.method static getRect(J)Lcom/scandit/base/camera/SbFocusEvent$Area;
    .locals 4

    .line 44
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->ScFocusEvent_rect_get(J)J

    move-result-wide p0

    .line 45
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->ScRectangleF_position_get(J)J

    move-result-wide v0

    .line 46
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScPointF_x_get(J)F

    move-result v2

    .line 47
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScPointF_y_get(J)F

    move-result v0

    .line 48
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->ScRectangleF_size_get(J)J

    move-result-wide p0

    .line 49
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->ScSizeF_width_get(J)F

    move-result v1

    .line 50
    invoke-static {p0, p1}, Lcom/scandit/recognition/Native;->ScSizeF_height_get(J)F

    move-result p0

    const/4 p1, 0x0

    cmpl-float v3, v1, p1

    if-eqz v3, :cond_1

    cmpl-float p1, p0, p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Lcom/scandit/base/camera/SbFocusEvent$Area;

    invoke-direct {p1, v2, v0, v1, p0}, Lcom/scandit/base/camera/SbFocusEvent$Area;-><init>(FFFF)V

    return-object p1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method getRange()I
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusEvent;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusEvent_range_get(J)I

    move-result v0

    return v0
.end method

.method getTrigger()I
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/scandit/barcodepicker/internal/FocusEvent;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->ScFocusEvent_trigger_get(J)I

    move-result v0

    return v0
.end method

.method protected release(J)V
    .locals 0

    .line 31
    iget-wide p1, p0, Lcom/scandit/barcodepicker/internal/FocusEvent;->mNative:J

    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->delete_ScFocusEvent(J)V

    return-void
.end method
