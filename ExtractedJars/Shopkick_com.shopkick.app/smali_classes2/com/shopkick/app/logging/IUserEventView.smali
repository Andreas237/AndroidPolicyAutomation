.class public interface abstract Lcom/shopkick/app/logging/IUserEventView;
.super Ljava/lang/Object;
.source "IUserEventView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;
    }
.end annotation


# static fields
.field public static final BG_IMAGE_CONSTRAINT_KEY:Ljava/lang/String; = "BgImageConstraintKey"

.field public static final IMAGE_CONSTRAINT_KEY:Ljava/lang/String; = "ImageConstraintKey"

.field public static final VIEW_VISIBLE_CONSTRAINT_KEY:Ljava/lang/String; = "ViewVisibleConstraintKey"


# virtual methods
.method public abstract addImpressionConstraintKey(Ljava/lang/String;)V
.end method

.method public abstract removeImpressionConstraintKey(Ljava/lang/String;)V
.end method

.method public abstract setRepeatableLogActions(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
.end method

.method public abstract setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V
.end method

.method public abstract stopMoatTracking()V
.end method

.method public abstract triggerEvent()V
.end method
