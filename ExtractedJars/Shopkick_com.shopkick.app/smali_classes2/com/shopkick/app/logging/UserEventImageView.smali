.class public Lcom/shopkick/app/logging/UserEventImageView;
.super Lcom/shopkick/app/widget/ForegroundImageView;
.source "UserEventImageView.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventView;


# instance fields
.field private core:Lcom/shopkick/app/logging/UserEventViewCore;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/logging/UserEventImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/widget/ForegroundImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance p1, Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-direct {p1, p0}, Lcom/shopkick/app/logging/UserEventViewCore;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    return-void
.end method


# virtual methods
.method public addImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatTouch()V

    .line 118
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/ForegroundImageView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->recordPotentialScreenTransitionPerformClick()V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->tryTriggeringEvent()V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatClick()V

    .line 112
    invoke-super {p0}, Lcom/shopkick/app/widget/ForegroundImageView;->performClick()Z

    move-result v0

    return v0
.end method

.method public removeImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 74
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 75
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 76
    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v0, :cond_1

    if-eqz v1, :cond_2

    :cond_1
    if-eq p1, v1, :cond_4

    :cond_2
    if-eqz p1, :cond_3

    .line 87
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/ForegroundImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {p0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 98
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz p1, :cond_0

    if-eq p1, v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    if-eqz v0, :cond_0

    const-string v1, "ImageConstraintKey"

    .line 101
    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

    .line 104
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/widget/ForegroundImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setRepeatableLogActions(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method public setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/logging/UserEventViewCore;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/shopkick/app/logging/UserEventViewCore;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method

.method public stopMoatTracking()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->stopMoatTracking()V

    return-void
.end method

.method public triggerEvent()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventImageView;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerEvent()V

    return-void
.end method
