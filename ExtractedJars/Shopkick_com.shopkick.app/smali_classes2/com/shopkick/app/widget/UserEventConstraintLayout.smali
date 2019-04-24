.class public Lcom/shopkick/app/widget/UserEventConstraintLayout;
.super Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;
.source "UserEventConstraintLayout.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventView;


# instance fields
.field private core:Lcom/shopkick/app/logging/UserEventViewCore;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/widget/UserEventConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/widget/UserEventConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    new-instance p1, Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-direct {p1, p0}, Lcom/shopkick/app/logging/UserEventViewCore;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    return-void
.end method


# virtual methods
.method public addImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatTouch()V

    .line 69
    invoke-super {p0, p1}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->recordPotentialScreenTransitionPerformClick()V

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->tryTriggeringEvent()V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerMoatClick()V

    .line 63
    invoke-super {p0}, Lcom/shopkick/app/view/foreground/ForegroundConstraintLayout;->performClick()Z

    move-result v0

    return v0
.end method

.method public removeImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->removeImpressionConstraintKey(Ljava/lang/String;)V

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

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method public setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3}, Lcom/shopkick/app/logging/UserEventViewCore;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method public setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/shopkick/app/logging/UserEventViewCore;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    return-void
.end method

.method public stopMoatTracking()V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->stopMoatTracking()V

    return-void
.end method

.method public triggerEvent()V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/widget/UserEventConstraintLayout;->core:Lcom/shopkick/app/logging/UserEventViewCore;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerEvent()V

    return-void
.end method
