.class public Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;
.super Ljava/lang/Object;
.source "ConfigurationUpdatePolicy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "State"
.end annotation


# instance fields
.field private timeOfLastCheckInMs:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-wide p1, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->timeOfLastCheckInMs:J

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;)J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->timeOfLastCheckInMs:J

    return-wide v0
.end method


# virtual methods
.method public getTimeOfLastCheckInMs()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->timeOfLastCheckInMs:J

    return-wide v0
.end method

.method public setState(Lcom/usebutton/sdk/internal/util/TimeProvider;)V
    .locals 2

    .line 53
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy$State;->timeOfLastCheckInMs:J

    return-void
.end method
