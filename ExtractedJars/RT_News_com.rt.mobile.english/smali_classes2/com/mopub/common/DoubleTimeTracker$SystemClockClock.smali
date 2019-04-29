.class Lcom/mopub/common/DoubleTimeTracker$SystemClockClock;
.super Ljava/lang/Object;
.source "DoubleTimeTracker.java"

# interfaces
.implements Lcom/mopub/common/DoubleTimeTracker$Clock;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/DoubleTimeTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SystemClockClock"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/DoubleTimeTracker$1;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/mopub/common/DoubleTimeTracker$SystemClockClock;-><init>()V

    return-void
.end method


# virtual methods
.method public elapsedRealTime()J
    .locals 2

    .line 74
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
