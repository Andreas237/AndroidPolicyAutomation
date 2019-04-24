.class public Lcom/usebutton/sdk/internal/events/ReportPolicy;
.super Ljava/lang/Object;
.source "ReportPolicy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;
    }
.end annotation


# static fields
.field private static final ABSOLUTE_CLOCK:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final IMPORTANT_EVENTS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Publisher<",
            "Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private final mStorage:Lcom/usebutton/sdk/internal/core/Storage;

.field private final mTimeGetter:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private mTimeOfLastReport:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 15
    new-instance v0, Lcom/usebutton/sdk/internal/events/ReportPolicy$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->ABSOLUTE_CLOCK:Lcom/usebutton/sdk/internal/functional/Getter;

    .line 22
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "btn:app-deeplink"

    const-string v2, "btn:button-tapped"

    const-string v3, "btn:app-install-success"

    const-string v4, "btn:app-install-referrer-received"

    const-string v5, "btn:deeplink-received"

    const-string v6, "btn:deferred-deeplink"

    const-string v7, "btn:referrer-changed"

    const-string v8, "btn:button-action-available"

    const-string v9, "btn:app-install-notification-action"

    const-string v10, "btn:app-install-notification-dismissed"

    const-string v11, "btn:inventory-button-item-selected"

    const-string v12, "btn:webview-open"

    const-string v13, "btn:webview-dismiss"

    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->IMPORTANT_EVENTS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/core/Storage;)V
    .locals 1

    .line 53
    sget-object v0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->ABSOLUTE_CLOCK:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;-><init>(Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/functional/Getter;)V

    return-void
.end method

.method constructor <init>(Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/functional/Getter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeOfLastReport:Ljava/lang/Long;

    .line 50
    new-instance v0, Lcom/usebutton/sdk/internal/util/Publisher;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/Publisher;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    .line 58
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    .line 59
    iput-object p2, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    return-void
.end method

.method private getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    if-nez v0, :cond_0

    .line 89
    invoke-static {}, Lcom/usebutton/sdk/internal/models/Configuration;->emptyConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v0
.end method

.method private publishShouldReport()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    new-instance v1, Lcom/usebutton/sdk/internal/events/ReportPolicy$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy$2;-><init>(Lcom/usebutton/sdk/internal/events/ReportPolicy;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Publisher;->perform(Lcom/usebutton/sdk/internal/util/Publisher$Action;)V

    return-void
.end method


# virtual methods
.method public getObservable()Lcom/usebutton/sdk/internal/functional/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/usebutton/sdk/internal/functional/Observable<",
            "Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;",
            ">;"
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    return-object v0
.end method

.method getTimeOfLastReport()J
    .locals 4

    .line 113
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeOfLastReport:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/core/Storage;->getTimeOfLastEventReport()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeOfLastReport:Ljava/lang/Long;

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeOfLastReport:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method onAppLaunch()V
    .locals 7

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 78
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getEventReportIntervalSeconds()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    .line 79
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->getTimeOfLastReport()J

    move-result-wide v4

    sub-long v4, v0, v4

    cmp-long v6, v4, v2

    if-gez v6, :cond_0

    return-void

    .line 82
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeOfLastReport:Ljava/lang/Long;

    .line 83
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->publishShouldReport()V

    return-void
.end method

.method onEvent(Ljava/lang/String;)V
    .locals 1

    .line 63
    sget-object v0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->IMPORTANT_EVENTS:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->publishShouldReport()V

    goto :goto_0

    :cond_0
    const-string v0, "btn:"

    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 68
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->publishShouldReport()V

    :cond_1
    :goto_0
    return-void
.end method

.method onEventsReported()V
    .locals 3

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/events/ReportPolicy;->mTimeGetter:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v1}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/core/Storage;->setTimeOfLastEventReport(J)V

    return-void
.end method

.method onOrder()V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/ReportPolicy;->publishShouldReport()V

    return-void
.end method
