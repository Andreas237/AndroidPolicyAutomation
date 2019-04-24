.class public Lorg/greenrobot/eventbus/meta/SimpleSubscriberInfo;
.super Lorg/greenrobot/eventbus/meta/AbstractSubscriberInfo;
.source "SimpleSubscriberInfo.java"


# instance fields
.field private final methodInfos:[Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Z[Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;)V
    .locals 1
    .param p1, "subscriberClass"    # Ljava/lang/Class;
    .param p2, "shouldCheckSuperclass"    # Z
    .param p3, "methodInfos"    # [Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lorg/greenrobot/eventbus/meta/AbstractSubscriberInfo;-><init>(Ljava/lang/Class;Ljava/lang/Class;Z)V

    .line 29
    iput-object p3, p0, Lorg/greenrobot/eventbus/meta/SimpleSubscriberInfo;->methodInfos:[Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;

    .line 30
    return-void
.end method


# virtual methods
.method public declared-synchronized getSubscriberMethods()[Lorg/greenrobot/eventbus/SubscriberMethod;
    .locals 10

    .prologue
    .line 34
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/greenrobot/eventbus/meta/SimpleSubscriberInfo;->methodInfos:[Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;

    array-length v8, v0

    .line 35
    .local v8, "length":I
    new-array v9, v8, [Lorg/greenrobot/eventbus/SubscriberMethod;

    .line 36
    .local v9, "methods":[Lorg/greenrobot/eventbus/SubscriberMethod;
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    if-ge v6, v8, :cond_0

    .line 37
    iget-object v0, p0, Lorg/greenrobot/eventbus/meta/SimpleSubscriberInfo;->methodInfos:[Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;

    aget-object v7, v0, v6

    .line 38
    .local v7, "info":Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;
    iget-object v1, v7, Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;->methodName:Ljava/lang/String;

    iget-object v2, v7, Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;->eventType:Ljava/lang/Class;

    iget-object v3, v7, Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;->threadMode:Lorg/greenrobot/eventbus/ThreadMode;

    iget v4, v7, Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;->priority:I

    iget-boolean v5, v7, Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;->sticky:Z

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lorg/greenrobot/eventbus/meta/SimpleSubscriberInfo;->createSubscriberMethod(Ljava/lang/String;Ljava/lang/Class;Lorg/greenrobot/eventbus/ThreadMode;IZ)Lorg/greenrobot/eventbus/SubscriberMethod;

    move-result-object v0

    aput-object v0, v9, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 41
    .end local v7    # "info":Lorg/greenrobot/eventbus/meta/SubscriberMethodInfo;
    :cond_0
    monitor-exit p0

    return-object v9

    .line 34
    .end local v6    # "i":I
    .end local v8    # "length":I
    .end local v9    # "methods":[Lorg/greenrobot/eventbus/SubscriberMethod;
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
