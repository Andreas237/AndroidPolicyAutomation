.class public Lcom/ibotta/android/service/api/ProducerFactory;
.super Ljava/lang/Object;
.source "ProducerFactory.java"


# instance fields
.field private final asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final consumeCondition:Ljava/util/concurrent/locks/Condition;

.field private final execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

.field private final prodConLock:Ljava/util/concurrent/locks/Lock;

.field private final produceCondition:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/service/api/ProducerFactory;->prodConLock:Ljava/util/concurrent/locks/Lock;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/service/api/ProducerFactory;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/service/api/ProducerFactory;->produceCondition:Ljava/util/concurrent/locks/Condition;

    .line 27
    iput-object p4, p0, Lcom/ibotta/android/service/api/ProducerFactory;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    .line 28
    iput-object p5, p0, Lcom/ibotta/android/service/api/ProducerFactory;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    .line 29
    iput-object p6, p0, Lcom/ibotta/android/service/api/ProducerFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public createProducer(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/Consumer;)Lcom/ibotta/android/service/api/Producer;
    .locals 10

    .line 33
    new-instance v9, Lcom/ibotta/android/service/api/Producer;

    iget-object v1, p0, Lcom/ibotta/android/service/api/ProducerFactory;->prodConLock:Ljava/util/concurrent/locks/Lock;

    iget-object v2, p0, Lcom/ibotta/android/service/api/ProducerFactory;->produceCondition:Ljava/util/concurrent/locks/Condition;

    iget-object v3, p0, Lcom/ibotta/android/service/api/ProducerFactory;->consumeCondition:Ljava/util/concurrent/locks/Condition;

    iget-object v5, p0, Lcom/ibotta/android/service/api/ProducerFactory;->execServiceMgr:Lcom/ibotta/android/service/api/ExecServiceManager;

    iget-object v6, p0, Lcom/ibotta/android/service/api/ProducerFactory;->asyncGroupMgr:Lcom/ibotta/android/service/api/AsyncGroupManager;

    iget-object v7, p0, Lcom/ibotta/android/service/api/ProducerFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    move-object v0, v9

    move-object v4, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/service/api/Producer;-><init>(Ljava/util/concurrent/locks/Lock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/android/service/api/ExecServiceManager;Lcom/ibotta/android/service/api/AsyncGroupManager;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;)V

    return-object v9
.end method
