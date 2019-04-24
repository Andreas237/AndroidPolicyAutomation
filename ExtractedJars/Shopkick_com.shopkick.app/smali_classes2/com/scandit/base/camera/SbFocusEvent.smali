.class public Lcom/scandit/base/camera/SbFocusEvent;
.super Ljava/lang/Object;
.source "SbFocusEvent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/SbFocusEvent$Area;,
        Lcom/scandit/base/camera/SbFocusEvent$FocusMode;
    }
.end annotation


# instance fields
.field public area:Lcom/scandit/base/camera/SbFocusEvent$Area;

.field public focusDistance:F

.field public manualFocusPoint:Z

.field public mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

.field public trigger:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    const/4 v0, 0x0

    .line 146
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbFocusEvent;->manualFocusPoint:Z

    .line 150
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    .line 152
    sget-object v0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->CONTINUOUS:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object v0, p0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    return-void
.end method

.method public static createFixedFocus(F)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 1

    .line 161
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v0}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    .line 162
    iput p0, v0, Lcom/scandit/base/camera/SbFocusEvent;->focusDistance:F

    .line 163
    sget-object p0, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->FIXED_DISTANCE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object p0, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const/4 p0, 0x0

    .line 164
    iput-object p0, v0, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    const/4 p0, 0x0

    .line 165
    iput-boolean p0, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    return-object v0
.end method

.method public static createFocusTrigger(Lcom/scandit/base/camera/SbFocusEvent$Area;)Lcom/scandit/base/camera/SbFocusEvent;
    .locals 2

    .line 171
    new-instance v0, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v0}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    .line 172
    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->AUTO:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iput-object v1, v0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    const/4 v1, 0x1

    .line 173
    iput-boolean v1, v0, Lcom/scandit/base/camera/SbFocusEvent;->trigger:Z

    .line 174
    iput-object p0, v0, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 186
    :cond_0
    instance-of v1, p1, Lcom/scandit/base/camera/SbFocusEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 190
    :cond_1
    check-cast p1, Lcom/scandit/base/camera/SbFocusEvent;

    .line 192
    iget-object v1, p1, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    iget-object v3, p0, Lcom/scandit/base/camera/SbFocusEvent;->mode:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    if-eq v1, v3, :cond_2

    return v2

    .line 196
    :cond_2
    sget-object v1, Lcom/scandit/base/camera/SbFocusEvent$FocusMode;->FIXED_DISTANCE:Lcom/scandit/base/camera/SbFocusEvent$FocusMode;

    if-ne v3, v1, :cond_3

    iget p1, p1, Lcom/scandit/base/camera/SbFocusEvent;->focusDistance:F

    iget v1, p0, Lcom/scandit/base/camera/SbFocusEvent;->focusDistance:F

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hasArea()Z
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/scandit/base/camera/SbFocusEvent;->area:Lcom/scandit/base/camera/SbFocusEvent$Area;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 205
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
