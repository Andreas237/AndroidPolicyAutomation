.class public Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;
.super Ljava/lang/Object;
.source "ConfigurationUpdatePolicy.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;
    }
.end annotation


# instance fields
.field private final checkIntervalMs:J

.field private final state:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

.field private final timeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/util/TimeProvider;ILcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->timeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    .line 15
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->checkIntervalMs:J

    .line 16
    iput-object p3, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->state:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    return-void
.end method


# virtual methods
.method public getState()Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->state:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    return-object v0
.end method

.method public setState()V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->state:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->timeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->setState(Lcom/usebutton/sdk/internal/util/TimeProvider;)V

    return-void
.end method

.method public shouldUpdate()Z
    .locals 5

    .line 23
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->state:Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->access$000(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->checkIntervalMs:J

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;->timeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    invoke-interface {v2}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
