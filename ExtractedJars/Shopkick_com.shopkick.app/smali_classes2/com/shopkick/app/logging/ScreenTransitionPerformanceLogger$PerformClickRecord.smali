.class Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;
.super Ljava/lang/Object;
.source "ScreenTransitionPerformanceLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PerformClickRecord"
.end annotation


# instance fields
.field private elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

.field private screenEnum:Ljava/lang/Integer;

.field private startTime:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$1;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    return-object p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)Ljava/lang/Integer;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->screenEnum:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->screenEnum:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;)J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->startTime:J

    return-wide v0
.end method

.method static synthetic access$302(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;J)J
    .locals 0

    .line 22
    iput-wide p1, p0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$PerformClickRecord;->startTime:J

    return-wide p1
.end method
