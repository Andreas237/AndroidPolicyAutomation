.class public Lnet/toddm/comm/tests/TestDefaultPriorityManagmentProvider;
.super Ljunit/framework/TestCase;
.source "TestDefaultPriorityManagmentProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method


# virtual methods
.method public testPriorityComparator()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 84
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 85
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v0

    .line 86
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://www.toddm.net/"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 87
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v10

    .line 88
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/status/200"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v1

    .line 89
    invoke-interface {v1}, Lnet/toddm/comm/Work;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v11

    .line 90
    new-instance v2, Ljava/net/URI;

    const-string v1, "http://httpbin.org/status/201"

    invoke-direct {v2, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v1, v0

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 91
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v0

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnet/toddm/comm/Priority;

    invoke-virtual {v3}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v3

    invoke-static {v0, v3}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 100
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/toddm/comm/Priority;

    invoke-virtual {v4}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v4

    invoke-static {v0, v4}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 101
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/toddm/comm/Priority;

    invoke-virtual {v5}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v5

    invoke-static {v0, v5}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 104
    new-instance v0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;

    new-instance v5, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v5}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-direct {v0, v5}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    .line 105
    invoke-virtual {v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->getPriorityComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 107
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/toddm/comm/Priority;

    invoke-virtual {v2}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v2

    invoke-static {v0, v2}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 108
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/toddm/comm/Priority;

    invoke-virtual {v2}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v2

    invoke-static {v0, v2}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 109
    sget-object v0, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v0}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/toddm/comm/Priority;

    invoke-virtual {v1}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v1

    invoke-static {v0, v1}, Ljunit/framework/Assert;->assertEquals(II)V

    return-void
.end method

.method public testPromotePriority()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 40
    new-instance v0, Lnet/toddm/comm/CommManager$Builder;

    invoke-direct {v0}, Lnet/toddm/comm/CommManager$Builder;-><init>()V

    const-string v1, "TEST"

    .line 41
    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    new-instance v1, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v1}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-virtual {v0, v1}, Lnet/toddm/comm/CommManager$Builder;->setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/CommManager$Builder;->create()Lnet/toddm/comm/CommManager;

    move-result-object v1

    .line 42
    new-instance v2, Ljava/net/URI;

    const-string v0, "http://www.toddm.net/"

    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v3, Lnet/toddm/comm/Request$RequestMethod;->GET:Lnet/toddm/comm/Request$RequestMethod;

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v9}, Lnet/toddm/comm/CommManager;->enqueueWork(Ljava/net/URI;Lnet/toddm/comm/Request$RequestMethod;[BLjava/util/Map;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lnet/toddm/comm/Work;

    move-result-object v0

    .line 45
    invoke-interface {v0}, Lnet/toddm/comm/Work;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object v0

    .line 48
    new-instance v1, Lnet/toddm/comm/DefaultPriorityManagmentProvider;

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    invoke-direct {v1, v2}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    .line 49
    sget-object v2, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v2}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v2

    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v3

    invoke-static {v2, v3}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 50
    invoke-virtual {v1, v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->promotePriority(Lnet/toddm/comm/Priority;)V

    .line 51
    sget-object v2, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v2}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v2

    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v3

    invoke-static {v2, v3}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 54
    const-class v2, Lnet/toddm/comm/DefaultPriorityManagmentProvider;

    const-string v3, "_PromotionIntervalInMilliseconds"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 56
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const/16 v7, 0xa

    .line 57
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v4, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v7, 0xb

    .line 60
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 61
    invoke-virtual {v1, v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->promotePriority(Lnet/toddm/comm/Priority;)V

    .line 62
    sget-object v9, Lnet/toddm/comm/Priority$StartingPriority;->LOW:Lnet/toddm/comm/Priority$StartingPriority;

    invoke-virtual {v9}, Lnet/toddm/comm/Priority$StartingPriority;->getPriorityValue()I

    move-result v9

    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v10

    if-le v9, v10, :cond_0

    move v9, v3

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    invoke-static {v9}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 64
    :goto_1
    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v9

    if-gt v9, v3, :cond_1

    .line 72
    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v9

    invoke-static {v3, v9}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 73
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 74
    invoke-virtual {v1, v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->promotePriority(Lnet/toddm/comm/Priority;)V

    .line 75
    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v0

    invoke-static {v3, v0}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 78
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 65
    :cond_1
    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v9

    .line 66
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 67
    invoke-virtual {v1, v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->promotePriority(Lnet/toddm/comm/Priority;)V

    sub-int/2addr v9, v3

    .line 68
    invoke-virtual {v0}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v10

    invoke-static {v9, v10}, Ljunit/framework/Assert;->assertEquals(II)V

    goto :goto_1
.end method
