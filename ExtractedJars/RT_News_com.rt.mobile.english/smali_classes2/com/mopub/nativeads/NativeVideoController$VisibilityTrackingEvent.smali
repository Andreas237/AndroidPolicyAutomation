.class Lcom/mopub/nativeads/NativeVideoController$VisibilityTrackingEvent;
.super Ljava/lang/Object;
.source "NativeVideoController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/NativeVideoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "VisibilityTrackingEvent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/NativeVideoController$VisibilityTrackingEvent$OnTrackedStrategy;
    }
.end annotation


# instance fields
.field isTracked:Z

.field minimumPercentageVisible:I

.field strategy:Lcom/mopub/nativeads/NativeVideoController$VisibilityTrackingEvent$OnTrackedStrategy;

.field totalQualifiedPlayCounter:I

.field totalRequiredPlayTimeMs:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 473
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
