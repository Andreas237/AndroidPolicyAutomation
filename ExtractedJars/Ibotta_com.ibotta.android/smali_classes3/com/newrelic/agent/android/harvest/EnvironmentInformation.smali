.class public Lcom/newrelic/agent/android/harvest/EnvironmentInformation;
.super Ljava/lang/Object;
.source "EnvironmentInformation.java"


# instance fields
.field private diskAvailable:[J

.field private memoryUsage:J

.field private networkStatus:Ljava/lang/String;

.field private networkWanType:Ljava/lang/String;

.field private orientation:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JILjava/lang/String;Ljava/lang/String;[J)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->memoryUsage:J

    .line 18
    iput p3, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->orientation:I

    .line 19
    iput-object p4, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkStatus:Ljava/lang/String;

    .line 20
    iput-object p5, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkWanType:Ljava/lang/String;

    .line 21
    iput-object p6, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->diskAvailable:[J

    return-void
.end method


# virtual methods
.method public getDiskAvailable()[J
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->diskAvailable:[J

    return-object v0
.end method

.method public getMemoryUsage()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->memoryUsage:J

    return-wide v0
.end method

.method public getNetworkStatus()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkWanType()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkWanType:Ljava/lang/String;

    return-object v0
.end method

.method public getOrientation()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->orientation:I

    return v0
.end method

.method public setDiskAvailable([J)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->diskAvailable:[J

    return-void
.end method

.method public setMemoryUsage(J)V
    .locals 0

    .line 25
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->memoryUsage:J

    return-void
.end method

.method public setNetworkStatus(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkStatus:Ljava/lang/String;

    return-void
.end method

.method public setNetworkWanType(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->networkWanType:Ljava/lang/String;

    return-void
.end method

.method public setOrientation(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->orientation:I

    return-void
.end method
