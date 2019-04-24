.class public Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;
.super Ljava/lang/Object;
.source "AnalyticsControllerImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/analytics/AnalyticsController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;
    }
.end annotation


# static fields
.field protected static final MAX_ATTRIBUTES:I = 0x40

.field private static final NEW_RELIC_PREFIX:Ljava/lang/String; = "newRelic"

.field private static final NR_PREFIX:Ljava/lang/String; = "nr."

.field private static final initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private static final reservedNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private agentImpl:Lcom/newrelic/agent/android/AgentImpl;

.field private attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

.field private final eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

.field private final isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final listener:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;

.field private final systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end field

.field private final userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 32
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    invoke-direct {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 143
    new-instance v0, Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-direct {v0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    .line 144
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 145
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 146
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;-><init>(Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->listener:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 28
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method private addNewUserAttribute(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z
    .locals 4

    .line 1033
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    .line 1035
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 1036
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1037
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1038
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store attribute "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to attribute store."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 1045
    :cond_0
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Attribute limit exceeded: at most 64 are allowed."

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    .line 1046
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Currently defined attributes:"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 1047
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 1048
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\t"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->valueAsString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private clear()V
    .locals 2

    .line 709
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AnalyticsControllerImpl.clear - clearing out attributes and events"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 711
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 712
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 713
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->empty()V

    return-void
.end method

.method public static getInstance()Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;
    .locals 1

    .line 659
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    return-object v0
.end method

.method private getSystemAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
    .locals 3

    .line 685
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 686
    invoke-virtual {v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method private getUserAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
    .locals 3

    .line 698
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 699
    invoke-virtual {v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public static initialize(Lcom/newrelic/agent/android/AgentConfiguration;Lcom/newrelic/agent/android/AgentImpl;)V
    .locals 3

    .line 90
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AnalyticsControllerImpl.initialize invoked."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 93
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    sget-object p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p1, "AnalyticsControllerImpl has already been initialized.  Bypassing.."

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return-void

    .line 98
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    invoke-direct {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->clear()V

    .line 100
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "eventType"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "type"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "timestamp"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "category"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "accountId"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "appId"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "appName"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "uuid"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "sessionId"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "osName"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "osVersion"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "osMajorVersion"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "deviceManufacturer"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "deviceModel"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "memUsageMb"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "carrier"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "newRelicVersion"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "interactionDuration"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "install"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "upgradeFrom"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "platform"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "platformVersion"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "lastInteraction"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "osBuild"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "runTime"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "architecture"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    const-string v1, "appBuild"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    invoke-virtual {v0, p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reinitialize(Lcom/newrelic/agent/android/AgentConfiguration;Lcom/newrelic/agent/android/AgentImpl;)V

    .line 130
    sget-object p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    iget-object p0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->listener:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->addTraceListener(Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;)V

    .line 132
    sget-object p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p1, "Analytics Controller started."

    invoke-interface {p0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    return-void
.end method

.method private isAttributeNameValid(Ljava/lang/String;)Z
    .locals 4

    .line 720
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isNameValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 723
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isNameReserved(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 725
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attribute name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is reserved for internal use and will be ignored."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_0
    return v0
.end method

.method private isHttpError(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z
    .locals 4

    .line 1006
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getStatusCode()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x190

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isInitializedAndEnabled()Z
    .locals 3

    .line 1014
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 1015
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Analytics controller is not initialized!"

    invoke-interface {v0, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return v1

    .line 1019
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1020
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Analytics controller is not enabled!"

    invoke-interface {v0, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private isNameReserved(Ljava/lang/String;)Z
    .locals 4

    .line 757
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->reservedNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 758
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is in the reserved names list."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return v1

    :cond_0
    const-string v0, "newRelic"

    .line 762
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 763
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " starts with reserved prefix "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "newRelic"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return v1

    :cond_1
    const-string v0, "nr."

    .line 767
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 768
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " starts with reserved prefix "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "nr."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private isNameValid(Ljava/lang/String;)Z
    .locals 5

    const/16 v0, 0x100

    if-eqz p1, :cond_0

    const-string v1, ""

    .line 737
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    .line 740
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attribute name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is null, empty, or exceeds the maximum length of "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " characters."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    return v1
.end method

.method private isNetworkFailure(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z
    .locals 0

    .line 1002
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getErrorCode()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isStringValueValid(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/16 v0, 0x1000

    if-eqz p2, :cond_0

    const-string v1, ""

    .line 747
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    array-length p2, p2

    if-ge p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    .line 750
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attribute value for name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is null, empty, or exceeds the maximum length of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    return p2
.end method

.method private isSuccessfulRequest(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z
    .locals 1

    .line 1010
    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getStatusCode()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/HttpTransaction;->getStatusCode()I

    move-result p1

    const/16 v0, 0x190

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static shutdown()V
    .locals 3

    .line 136
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    iget-object v0, v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->listener:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$InteractionCompleteListener;

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->removeTraceListener(Lcom/newrelic/agent/android/tracing/TraceLifecycleAware;)V

    .line 137
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->instance:Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/EventManager;->shutdown()V

    .line 138
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    return-void
.end method


# virtual methods
.method public addAttributeUnchecked(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;Z)Z
    .locals 4

    .line 412
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttributeUnchecked - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    const-string v2, " (persistent)"

    goto :goto_0

    :cond_0
    const-string v2, " (transient)"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 414
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->initialized:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 415
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p2, "Analytics controller is not initialized!"

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return v1

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    .line 420
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string p2, "Analytics controller is not enabled!"

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return v1

    .line 424
    :cond_2
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v0

    .line 426
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isNameValid(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    .line 430
    :cond_3
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isStringAttribute()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 431
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isStringValueValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 436
    :cond_4
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSystemAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-nez v0, :cond_5

    .line 441
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 442
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 443
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p2, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p2

    if-nez p2, :cond_7

    .line 444
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store attribute "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to attribute store."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    .line 449
    :cond_5
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl$1;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getAttributeDataType()Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 457
    :pswitch_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getBooleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setBooleanValue(Z)V

    goto :goto_1

    .line 454
    :pswitch_1
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getDoubleValue()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setDoubleValue(D)V

    goto :goto_1

    .line 451
    :pswitch_2
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setStringValue(Ljava/lang/String;)V

    .line 461
    :goto_1
    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setPersistent(Z)V

    .line 463
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 464
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 465
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store attribute "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to attribute store."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    .line 469
    :cond_6
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->delete(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    :cond_7
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z
    .locals 6

    .line 611
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 615
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 618
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->agentImpl:Lcom/newrelic/agent/android/AgentImpl;

    invoke-interface {v1}, Lcom/newrelic/agent/android/AgentImpl;->getSessionDurationMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v3, v1

    if-nez v5, :cond_1

    .line 620
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Harvest instance is not running! Session duration will be invalid"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 622
    :cond_1
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "timeSinceLoad"

    long-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-direct {v3, v4, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 623
    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsEvent;->addAttributes(Ljava/util/Set;)V

    .line 626
    :goto_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result p1

    return p1
.end method

.method public addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)Z"
        }
    .end annotation

    .line 590
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.addEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": category="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", eventType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", eventAttributes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 592
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 596
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 598
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 599
    invoke-virtual {v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 600
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 604
    :cond_2
    invoke-static {p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsEventFactory;->createEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Lcom/newrelic/agent/android/analytics/AnalyticsEvent;

    move-result-object p1

    .line 606
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result p1

    return p1
.end method

.method addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;Z)Z"
        }
    .end annotation

    .line 558
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.addEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": category="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", eventType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", eventAttributes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 560
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 564
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p5, :cond_2

    .line 567
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 568
    invoke-virtual {p5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 569
    invoke-interface {v0, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 573
    :cond_2
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_3
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 574
    invoke-virtual {p5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isNameValid(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 575
    invoke-interface {v0, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 579
    :cond_4
    invoke-static {p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsEventFactory;->createEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Lcom/newrelic/agent/android/analytics/AnalyticsEvent;

    move-result-object p1

    .line 580
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Lcom/newrelic/agent/android/analytics/AnalyticsEvent;)Z

    move-result p1

    return p1
.end method

.method public addEvent(Ljava/lang/String;Ljava/util/Set;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;)Z"
        }
    .end annotation

    .line 585
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Mobile"

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
    .locals 5

    const/4 v0, 0x0

    .line 778
    :try_start_0
    instance-of v1, p2, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 779
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 780
    :cond_0
    instance-of v1, p2, Ljava/lang/Float;

    if-eqz v1, :cond_1

    .line 781
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    float-to-double v2, p2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 782
    :cond_1
    instance-of v1, p2, Ljava/lang/Double;

    if-eqz v1, :cond_2

    .line 783
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 784
    :cond_2
    instance-of v1, p2, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 785
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 786
    :cond_3
    instance-of v1, p2, Ljava/lang/Short;

    if-eqz v1, :cond_4

    .line 787
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Short;

    invoke-virtual {p2}, Ljava/lang/Short;->shortValue()S

    move-result p2

    int-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 788
    :cond_4
    instance-of v1, p2, Ljava/lang/Long;

    if-eqz v1, :cond_5

    .line 789
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 790
    :cond_5
    instance-of v1, p2, Ljava/math/BigDecimal;

    if-eqz v1, :cond_6

    .line 791
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p2}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 792
    :cond_6
    instance-of v1, p2, Ljava/math/BigInteger;

    if-eqz v1, :cond_7

    .line 793
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p2}, Ljava/math/BigInteger;->doubleValue()D

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    return-object v1

    .line 794
    :cond_7
    instance-of v1, p2, Ljava/lang/Boolean;

    if-eqz v1, :cond_8

    .line 795
    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {v1, p1, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Z)V

    return-object v1

    .line 797
    :cond_8
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported event attribute type for key ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p2

    .line 801
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error casting attribute [%s] to String or Float: "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 1

    .line 972
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 973
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    :cond_0
    return-void
.end method

.method createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 1

    .line 978
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 979
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    :cond_0
    return-void
.end method

.method createNetworkRequestEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 1

    .line 984
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 985
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createNetworkRequestEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    :cond_0
    return-void
.end method

.method public createNetworkRequestEvents(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V
    .locals 1

    .line 990
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 991
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isHttpError(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 992
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createHttpErrorEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    goto :goto_0

    .line 993
    :cond_0
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isNetworkFailure(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 994
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createNetworkFailureEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    goto :goto_0

    .line 995
    :cond_1
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isSuccessfulRequest(Lcom/newrelic/agent/android/harvest/HttpTransaction;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 996
    invoke-static {p1}, Lcom/newrelic/agent/android/analytics/NetworkEventController;->createNetworkRequestEvent(Lcom/newrelic/agent/android/harvest/HttpTransaction;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
    .locals 3

    .line 215
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.getAttribute - retrieving "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 217
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getUserAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-nez v0, :cond_0

    .line 219
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSystemAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getEventManager()Lcom/newrelic/agent/android/analytics/EventManager;
    .locals 1

    .line 651
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    return-object v0
.end method

.method public getMaxEventBufferTime()I
    .locals 1

    .line 646
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->getMaxEventBufferTime()I

    move-result v0

    return v0
.end method

.method public getMaxEventPoolSize()I
    .locals 1

    .line 631
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->getMaxEventPoolSize()I

    move-result v0

    return v0
.end method

.method public getSessionAttributeCount()I
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getSessionAttributes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 259
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSessionAttributeCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 261
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getSystemAttributes()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 262
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getUserAttributes()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 264
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getSystemAttributeCount()I
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    return v0
.end method

.method public getSystemAttributes()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 228
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 230
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 232
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v3, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getUserAttributeCount()I
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    const/16 v1, 0x40

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public getUserAttributes()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 241
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 243
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 245
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v3, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 248
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    const/16 v3, 0x40

    if-ne v2, v3, :cond_0

    .line 253
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public incrementAttribute(Ljava/lang/String;D)Z
    .locals 3

    .line 478
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.incrementAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 481
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->incrementAttribute(Ljava/lang/String;DZ)Z

    move-result p1

    return p1
.end method

.method public incrementAttribute(Ljava/lang/String;DZ)Z
    .locals 4

    .line 486
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.incrementAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    const-string v2, " (persistent)"

    goto :goto_0

    :cond_0
    const-string v2, " (transient)"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 488
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 492
    :cond_1
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 496
    :cond_2
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 498
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isDoubleAttribute()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 500
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getDoubleValue()D

    move-result-wide v2

    add-double/2addr v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setDoubleValue(D)V

    .line 501
    invoke-virtual {v0, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setPersistent(Z)V

    .line 503
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 504
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 505
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to store attribute "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " to attribute store."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    if-nez v0, :cond_5

    .line 512
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;DZ)V

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addNewUserAttribute(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    return p1

    .line 516
    :cond_5
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Cannot increment attribute "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": the attribute is already defined as a non-float value."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    return v1
.end method

.method public internalRecordEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 882
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.recordEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 884
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 888
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p3}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->isEventTypeValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 892
    :cond_1
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 895
    :try_start_0
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 896
    invoke-interface {p4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 897
    invoke-virtual {p0, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v2

    if-nez v2, :cond_2

    return v1

    .line 901
    :cond_2
    invoke-interface {v6, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p4

    .line 904
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v2, "Error occurred while recording event [%s]: "

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p4}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 907
    invoke-virtual/range {v2 .. v7}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;Z)Z

    move-result p1

    return p1
.end method

.method loadPersistentAttributes()V
    .locals 4

    .line 668
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AnalyticsControllerImpl.loadPersistentAttributes - loading userAttributes from the attribute store..."

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 671
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->fetchAll()Ljava/util/List;

    move-result-object v0

    .line 672
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AnalyticsControllerImpl.loadPersistentAttributes - found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " userAttributes in the attribute store..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 673
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v1

    .line 674
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 675
    iget-object v3, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/16 v3, 0x40

    if-gt v1, v3, :cond_0

    .line 676
    iget-object v3, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public recordBreadcrumb(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 850
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 854
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 856
    :try_start_0
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 857
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 858
    invoke-virtual {p0, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 860
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return v1

    :catch_0
    move-exception p2

    .line 866
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "Error occurred while recording event [%s]: "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 869
    :cond_2
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Breadcrumb:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "MobileBreadcrumb"

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method public recordCustomEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 813
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.recordCustomEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 815
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 819
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->isEventTypeReserved(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->isEventTypeValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 824
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 826
    :try_start_0
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v3, p1

    :goto_0
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 827
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 828
    invoke-virtual {p0, v4, v5}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 831
    invoke-virtual {v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "name"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 832
    invoke-virtual {v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 833
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    .line 834
    invoke-virtual {v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v3

    .line 837
    :cond_2
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_3
    return v1

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    move-object v3, p1

    .line 843
    :goto_1
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v4, "Error occurred while recording event [%s]: "

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 846
    :cond_4
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {p0, v3, p2, p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1

    :cond_5
    :goto_2
    return v1
.end method

.method public recordEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 918
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.recordEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 920
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 924
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p3}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->isEventTypeValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 928
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 931
    :try_start_0
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 932
    invoke-interface {p4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 933
    invoke-virtual {p0, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v3

    if-nez v3, :cond_2

    return v1

    .line 937
    :cond_2
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p4

    .line 940
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "Error occurred while recording event [%s]: "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p4}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 943
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method public recordEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 948
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.recordEvent - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " attributes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 950
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 954
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 956
    :try_start_0
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 957
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 958
    invoke-virtual {p0, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->createAttribute(Ljava/lang/String;Ljava/lang/Object;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v3

    if-nez v3, :cond_1

    return v1

    .line 962
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 965
    sget-object v2, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "Error occurred while recording event [%s]: "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 968
    :cond_2
    sget-object p2, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Mobile"

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addEvent(Ljava/lang/String;Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;Ljava/lang/String;Ljava/util/Set;)Z

    move-result p1

    return p1
.end method

.method reinitialize(Lcom/newrelic/agent/android/AgentConfiguration;Lcom/newrelic/agent/android/AgentImpl;)V
    .locals 8

    .line 150
    iput-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->agentImpl:Lcom/newrelic/agent/android/AgentImpl;

    .line 151
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->initialize()V

    .line 152
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getEnableAnalyticsEvents()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 153
    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getAnalyticAttributeStore()Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    .line 155
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->loadPersistentAttributes()V

    .line 170
    invoke-interface {p2}, Lcom/newrelic/agent/android/AgentImpl;->getDeviceInformation()Lcom/newrelic/agent/android/harvest/DeviceInformation;

    move-result-object v0

    .line 171
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsVersion()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    const-string v3, ""

    .line 174
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "[.:-]"

    .line 177
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 179
    array-length v3, v2

    if-lez v3, :cond_0

    const/4 v3, 0x0

    .line 180
    aget-object v2, v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 185
    :goto_0
    invoke-interface {p2}, Lcom/newrelic/agent/android/AgentImpl;->getEnvironmentInformation()Lcom/newrelic/agent/android/harvest/EnvironmentInformation;

    move-result-object v3

    .line 187
    iget-object v4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v6, "osName"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 188
    iget-object v4, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v5, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v6, "osVersion"

    invoke-direct {v5, v6, v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 189
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v4, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v5, "osBuild"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getOsBuild()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 190
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v4, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v5, "osMajorVersion"

    invoke-direct {v4, v5, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 191
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "deviceManufacturer"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getManufacturer()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 192
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "deviceModel"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getModel()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 193
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "uuid"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getDeviceId()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 194
    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v2, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v4, "carrier"

    invoke-interface {p2}, Lcom/newrelic/agent/android/AgentImpl;->getNetworkCarrier()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, v4, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 195
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "newRelicVersion"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getAgentVersion()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 196
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "memUsageMb"

    invoke-virtual {v3}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getMemoryUsage()J

    move-result-wide v3

    long-to-float v3, v3

    float-to-double v3, v3

    invoke-direct {v1, v2, v3, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;D)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 197
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "sessionId"

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getSessionID()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "platform"

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationPlatform()Lcom/newrelic/agent/android/ApplicationPlatform;

    move-result-object v3

    invoke-virtual {v3}, Lcom/newrelic/agent/android/ApplicationPlatform;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 199
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "platformVersion"

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getApplicationPlatformVersion()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 200
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "runTime"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getRunTime()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 201
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v2, "architecture"

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/DeviceInformation;->getArchitecture()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 203
    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getCustomBuildIdentifier()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 204
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v1, "appBuild"

    invoke-virtual {p1}, Lcom/newrelic/agent/android/AgentConfiguration;->getCustomBuildIdentifier()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 206
    :cond_1
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getApplicationInformation()Lcom/newrelic/agent/android/harvest/ApplicationInformation;

    move-result-object p1

    invoke-virtual {p1}, Lcom/newrelic/agent/android/harvest/ApplicationInformation;->getVersionCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 207
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    .line 208
    iget-object p2, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->systemAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    const-string v1, "appBuild"

    invoke-direct {v0, v1, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public removeAllAttributes()Z
    .locals 2

    .line 545
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "AnalyticsControllerImpl.removeAttributes - "

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 547
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 551
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->clear()V

    .line 552
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    return v1
.end method

.method public removeAttribute(Ljava/lang/String;)Z
    .locals 3

    .line 526
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.removeAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 528
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 532
    :cond_0
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 534
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->userAttributes:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 535
    invoke-virtual {p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 536
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->delete(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public setAttribute(Ljava/lang/String;D)Z
    .locals 3

    .line 325
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 328
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->setAttribute(Ljava/lang/String;DZ)Z

    move-result p1

    return p1
.end method

.method public setAttribute(Ljava/lang/String;DZ)Z
    .locals 3

    .line 333
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    const-string v2, " (persistent)"

    goto :goto_0

    :cond_0
    const-string v2, " (transient)"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 335
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 339
    :cond_1
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 343
    :cond_2
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-nez v0, :cond_3

    .line 347
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;DZ)V

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addNewUserAttribute(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    return p1

    .line 349
    :cond_3
    invoke-virtual {v0, p2, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setDoubleValue(D)V

    .line 350
    invoke-virtual {v0, p4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setPersistent(Z)V

    .line 351
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 352
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 353
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to store attribute "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " to attribute store."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    .line 357
    :cond_4
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->delete(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 284
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 287
    invoke-virtual {p0, p1, p2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->setAttribute(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public setAttribute(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 3

    .line 292
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_0

    const-string v2, " (persistent)"

    goto :goto_0

    :cond_0
    const-string v2, " (transient)"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 294
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 298
    :cond_1
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isStringValueValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 302
    :cond_2
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-nez v0, :cond_3

    .line 306
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v0, p1, p2, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addNewUserAttribute(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    return p1

    .line 308
    :cond_3
    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setStringValue(Ljava/lang/String;)V

    .line 309
    invoke-virtual {v0, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setPersistent(Z)V

    .line 310
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 311
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 312
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to store attribute "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " to attribute store."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    .line 316
    :cond_4
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->delete(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    :cond_5
    const/4 p1, 0x1

    return p1

    :cond_6
    :goto_1
    return v1
.end method

.method public setAttribute(Ljava/lang/String;Z)Z
    .locals 3

    .line 365
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 368
    invoke-virtual {p0, p1, p2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->setAttribute(Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method

.method public setAttribute(Ljava/lang/String;ZZ)Z
    .locals 3

    .line 373
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AnalyticsControllerImpl.setAttribute - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_0

    const-string v2, " (persistent)"

    goto :goto_0

    :cond_0
    const-string v2, " (transient)"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->verbose(Ljava/lang/String;)V

    .line 375
    invoke-direct {p0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isInitializedAndEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 379
    :cond_1
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isAttributeNameValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 383
    :cond_2
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->getAttribute(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    move-result-object v0

    if-nez v0, :cond_3

    .line 386
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-direct {v0, p1, p2, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;ZZ)V

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->addNewUserAttribute(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    return p1

    .line 388
    :cond_3
    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setBooleanValue(Z)V

    .line 389
    invoke-virtual {v0, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setPersistent(Z)V

    .line 390
    invoke-virtual {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 391
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->store(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 392
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to store attribute "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " to attribute store."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    return v1

    .line 396
    :cond_4
    iget-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->attributeStore:Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttributeStore;->delete(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1028
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->isEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public setMaxEventBufferTime(I)V
    .locals 1

    .line 641
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->setMaxEventBufferTime(I)V

    return-void
.end method

.method public setMaxEventPoolSize(I)V
    .locals 1

    .line 636
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticsControllerImpl;->eventManager:Lcom/newrelic/agent/android/analytics/EventManagerImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/analytics/EventManagerImpl;->setMaxEventPoolSize(I)V

    return-void
.end method
