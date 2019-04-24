.class public Lcom/newrelic/agent/android/NullAgentImpl;
.super Ljava/lang/Object;
.source "NullAgentImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/AgentImpl;


# static fields
.field public static final instance:Lcom/newrelic/agent/android/NullAgentImpl;


# instance fields
.field private responseBodyLimit:I

.field private sessionDurationMillis:Lcom/newrelic/agent/android/stats/TicToc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Lcom/newrelic/agent/android/NullAgentImpl;

    invoke-direct {v0}, Lcom/newrelic/agent/android/NullAgentImpl;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/NullAgentImpl;->instance:Lcom/newrelic/agent/android/NullAgentImpl;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x400

    .line 20
    iput v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->responseBodyLimit:I

    .line 21
    new-instance v0, Lcom/newrelic/agent/android/stats/TicToc;

    invoke-direct {v0}, Lcom/newrelic/agent/android/stats/TicToc;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->sessionDurationMillis:Lcom/newrelic/agent/android/stats/TicToc;

    return-void
.end method


# virtual methods
.method public addTransactionData(Lcom/newrelic/agent/android/api/common/TransactionData;)V
    .locals 0

    return-void
.end method

.method public disable()V
    .locals 0

    return-void
.end method

.method public getAndClearTransactionData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;"
        }
    .end annotation

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;
    .locals 5

    .line 130
    new-instance v0, Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    const-string v1, "null"

    const-string v2, "0.0"

    const-string v3, "null"

    const-string v4, "0"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getCatFacade()Lcom/newrelic/agent/android/connectivity/CatFacade;
    .locals 1

    .line 93
    new-instance v0, Lcom/newrelic/agent/android/connectivity/CatFacade;

    invoke-direct {v0}, Lcom/newrelic/agent/android/connectivity/CatFacade;-><init>()V

    return-object v0
.end method

.method public getCrossProcessId()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;
    .locals 2

    .line 112
    new-instance v0, Lcom/newrelic/agent/android/harvest/DeviceInformation;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;-><init>()V

    const-string v1, "Android"

    .line 113
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsName(Ljava/lang/String;)V

    const-string v1, "2.3"

    .line 114
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsVersion(Ljava/lang/String;)V

    const-string v1, "a.b.c"

    .line 115
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setOsBuild(Ljava/lang/String;)V

    const-string v1, "Fake"

    .line 116
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setManufacturer(Ljava/lang/String;)V

    const-string v1, "NullAgent"

    .line 117
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setModel(Ljava/lang/String;)V

    const-string v1, "AndroidAgent"

    .line 118
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentName(Ljava/lang/String;)V

    const-string v1, "2.123"

    .line 119
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setAgentVersion(Ljava/lang/String;)V

    const-string v1, "389C9738-A761-44DE-8A66-1668CFD67DA1"

    .line 120
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setDeviceId(Ljava/lang/String;)V

    const-string v1, "Fake Arch"

    .line 121
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setArchitecture(Ljava/lang/String;)V

    const-string v1, "1.7.0"

    .line 122
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setRunTime(Ljava/lang/String;)V

    const-string v1, "Fake Size"

    .line 123
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->setSize(Ljava/lang/String;)V

    return-object v0
.end method

.method public getEncoder()Lcom/newrelic/agent/android/util/Encoder;
    .locals 1

    .line 98
    new-instance v0, Lcom/newrelic/agent/android/NullAgentImpl$1;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/NullAgentImpl$1;-><init>(Lcom/newrelic/agent/android/NullAgentImpl;)V

    return-object v0
.end method

.method public getEnvironmentInformation()Lcom/newrelic/agent/android/harvest/EnvironmentInformation;
    .locals 8

    .line 135
    new-instance v7, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;

    const-string v4, "none"

    const-string v5, "none"

    const/4 v0, 0x2

    new-array v6, v0, [J

    fill-array-data v6, :array_0

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;-><init>(JILjava/lang/String;Ljava/lang/String;[J)V

    return-object v7

    :array_0
    .array-data 8
        0x0
        0x0
    .end array-data
.end method

.method public getNetworkCarrier()Ljava/lang/String;
    .locals 1

    const-string v0, "unknown"

    return-object v0
.end method

.method public getNetworkWanType()Ljava/lang/String;
    .locals 1

    const-string v0, "unknown"

    return-object v0
.end method

.method public getResponseBodyLimit()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->responseBodyLimit:I

    return v0
.end method

.method public getSessionDurationMillis()J
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->sessionDurationMillis:Lcom/newrelic/agent/android/stats/TicToc;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/TicToc;->peek()J

    move-result-wide v0

    return-wide v0
.end method

.method public getStackTraceLimit()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hasReachableNetworkConnection(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public isDisabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isInstantApp()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public mergeTransactionData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/newrelic/agent/android/api/common/TransactionData;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setLocation(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public setResponseBodyLimit(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/newrelic/agent/android/NullAgentImpl;->responseBodyLimit:I

    return-void
.end method

.method public start()V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->sessionDurationMillis:Lcom/newrelic/agent/android/stats/TicToc;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/TicToc;->tic()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/newrelic/agent/android/NullAgentImpl;->sessionDurationMillis:Lcom/newrelic/agent/android/stats/TicToc;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/stats/TicToc;->toc()J

    return-void
.end method

.method public updateSavedConnectInformation()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
