.class public Lcom/ibotta/android/service/api/ConsumerFactory;
.super Ljava/lang/Object;
.source "ConsumerFactory.java"


# instance fields
.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final consumeCondition:Ljava/util/concurrent/locks/Condition;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

.field private final logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

.field private final prodConLock:Ljava/util/concurrent/locks/Lock;

.field private final serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->prodConLock:Ljava/util/concurrent/locks/Lock;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 37
    iput-object p6, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    .line 38
    iput-object p7, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    .line 39
    iput-object p8, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    return-void
.end method


# virtual methods
.method public createConsumer(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/Consumer$ConsumerListener;)Lcom/ibotta/android/service/api/Consumer;
    .locals 12

    .line 43
    new-instance v11, Lcom/ibotta/android/service/api/Consumer;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->prodConLock:Ljava/util/concurrent/locks/Lock;

    iget-object v2, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    iget-object v4, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    iget-object v5, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    iget-object v6, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    iget-object v7, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->logOutManager:Lcom/ibotta/android/state/user/LogOutManager;

    iget-object v8, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->globalEventManager:Lcom/ibotta/android/state/GlobalEventManager;

    iget-object v9, p0, Lcom/ibotta/android/service/api/ConsumerFactory;->serverUpgradeState:Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;

    move-object v0, v11

    move-object v3, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/ibotta/android/service/api/Consumer;-><init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/user/LogOutManager;Lcom/ibotta/android/state/GlobalEventManager;Lcom/ibotta/android/state/app/upgrade/ServerUpgradeState;Lcom/ibotta/android/service/api/Consumer$ConsumerListener;)V

    return-object v11
.end method
