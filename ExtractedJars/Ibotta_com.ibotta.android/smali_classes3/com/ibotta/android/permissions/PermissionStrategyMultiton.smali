.class public Lcom/ibotta/android/permissions/PermissionStrategyMultiton;
.super Ljava/lang/Object;
.source "PermissionStrategyMultiton.java"


# static fields
.field private static final RULE_DEFAULT_SESSIONS:S = 0x3s

.field private static final RULE_DEFAULT_TIME:J


# instance fields
.field private final LOCK:Ljava/util/concurrent/locks/Lock;

.field private final permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

.field private final strategies:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/permissions/Permission;",
            "Lcom/ibotta/android/permissions/PermissionStrategy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 22
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->RULE_DEFAULT_TIME:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->LOCK:Ljava/util/concurrent/locks/Lock;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->strategies:Ljava/util/Map;

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    return-void
.end method

.method private buildDefaultLocationRuleSet()Lcom/ibotta/android/permissions/RuleSet;
    .locals 6

    .line 72
    new-instance v0, Lcom/ibotta/android/permissions/RuleSet;

    invoke-direct {v0}, Lcom/ibotta/android/permissions/RuleSet;-><init>()V

    .line 74
    new-instance v1, Lcom/ibotta/android/permissions/Rule;

    invoke-direct {v1}, Lcom/ibotta/android/permissions/Rule;-><init>()V

    .line 75
    sget-object v2, Lcom/ibotta/android/state/app/permissions/Area;->HOME:Lcom/ibotta/android/state/app/permissions/Area;

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/permissions/Area;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/permissions/Rule;->setArea(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 76
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/permissions/Rule;->setSessions(Ljava/lang/Short;)V

    const-wide/16 v2, 0x0

    .line 77
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/permissions/Rule;->setTime(Ljava/lang/Long;)V

    const-string v2, "1"

    .line 78
    invoke-virtual {v1, v2}, Lcom/ibotta/android/permissions/Rule;->setCopyKey(Ljava/lang/String;)V

    .line 80
    new-instance v2, Lcom/ibotta/android/permissions/Rule;

    invoke-direct {v2}, Lcom/ibotta/android/permissions/Rule;-><init>()V

    .line 81
    sget-object v3, Lcom/ibotta/android/state/app/permissions/Area;->HOME:Lcom/ibotta/android/state/app/permissions/Area;

    invoke-virtual {v3}, Lcom/ibotta/android/state/app/permissions/Area;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/permissions/Rule;->setArea(Ljava/lang/String;)V

    const/4 v3, 0x3

    .line 82
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/permissions/Rule;->setSessions(Ljava/lang/Short;)V

    .line 83
    sget-wide v3, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->RULE_DEFAULT_TIME:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/permissions/Rule;->setTime(Ljava/lang/Long;)V

    const-string v3, "1"

    .line 84
    invoke-virtual {v2, v3}, Lcom/ibotta/android/permissions/Rule;->setCopyKey(Ljava/lang/String;)V

    .line 86
    new-instance v3, Lcom/ibotta/android/permissions/Copy;

    invoke-direct {v3}, Lcom/ibotta/android/permissions/Copy;-><init>()V

    .line 87
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v4

    const v5, 0x7f110248

    invoke-virtual {v4, v5}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/permissions/Copy;->setTitle(Ljava/lang/String;)V

    .line 88
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v4

    const v5, 0x7f110247

    invoke-virtual {v4, v5}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/permissions/Copy;->setBody(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v0}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    invoke-virtual {v0}, Lcom/ibotta/android/permissions/RuleSet;->getRules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    invoke-virtual {v0}, Lcom/ibotta/android/permissions/RuleSet;->getCopy()Ljava/util/Map;

    move-result-object v1

    const-string v2, "1"

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private buildDefaultRuleSet(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/RuleSet;
    .locals 2

    .line 60
    new-instance v0, Lcom/ibotta/android/permissions/RuleSet;

    invoke-direct {v0}, Lcom/ibotta/android/permissions/RuleSet;-><init>()V

    .line 62
    sget-object v1, Lcom/ibotta/android/permissions/PermissionStrategyMultiton$1;->$SwitchMap$com$ibotta$android$permissions$Permission:[I

    invoke-virtual {p1}, Lcom/ibotta/android/permissions/Permission;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->buildDefaultLocationRuleSet()Lcom/ibotta/android/permissions/RuleSet;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public getInstance(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/PermissionStrategy;
    .locals 4

    if-nez p1, :cond_0

    .line 34
    sget-object p1, Lcom/ibotta/android/permissions/NoOpPermissionStrategy;->INSTANCE:Lcom/ibotta/android/permissions/NoOpPermissionStrategy;

    return-object p1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->LOCK:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 40
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->strategies:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/PermissionStrategy;

    if-nez v0, :cond_1

    const-string v0, "Using default rule set."

    const/4 v1, 0x0

    .line 44
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->buildDefaultRuleSet(Lcom/ibotta/android/permissions/Permission;)Lcom/ibotta/android/permissions/RuleSet;

    move-result-object v0

    .line 47
    new-instance v1, Lcom/ibotta/android/permissions/PermissionStrategyImpl;

    new-instance v2, Lcom/ibotta/android/permissions/CriteriaStoreImpl;

    invoke-direct {v2, p1}, Lcom/ibotta/android/permissions/CriteriaStoreImpl;-><init>(Lcom/ibotta/android/permissions/Permission;)V

    iget-object v3, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    invoke-direct {v1, p1, v0, v2, v3}, Lcom/ibotta/android/permissions/PermissionStrategyImpl;-><init>(Lcom/ibotta/android/permissions/Permission;Lcom/ibotta/android/permissions/RuleSet;Lcom/ibotta/android/permissions/CriteriaStore;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->strategies:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v1

    .line 53
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->LOCK:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/permissions/PermissionStrategyMultiton;->LOCK:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
