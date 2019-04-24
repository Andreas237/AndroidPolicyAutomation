.class public Lcom/rits/cloning/Cloner;
.super Ljava/lang/Object;
.source "Cloner.java"


# instance fields
.field private cloneAnonymousParent:Z

.field private cloneSynthetics:Z

.field private cloningEnabled:Z

.field private dumpClonedClasses:Z

.field private final fastCloners:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/rits/cloning/IFastCloner;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;>;"
        }
    .end annotation
.end field

.field private final ignored:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final ignoredInstanceOf:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final ignoredInstances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final immutables:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final instantiationStrategy:Lcom/rits/cloning/IInstantiationStrategy;

.field private final nullInstead:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private nullTransient:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    .line 39
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstanceOf:Ljava/util/Set;

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->nullInstead:Ljava/util/Set;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    .line 42
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstances:Ljava/util/Map;

    .line 43
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    const/4 v1, 0x1

    .line 45
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    .line 46
    iput-boolean v0, p0, Lcom/rits/cloning/Cloner;->nullTransient:Z

    .line 47
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloneSynthetics:Z

    .line 374
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->immutables:Ljava/util/concurrent/ConcurrentHashMap;

    .line 375
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloneAnonymousParent:Z

    .line 51
    invoke-static {}, Lcom/rits/cloning/ObjenesisInstantiationStrategy;->getInstance()Lcom/rits/cloning/ObjenesisInstantiationStrategy;

    move-result-object v0

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->instantiationStrategy:Lcom/rits/cloning/IInstantiationStrategy;

    .line 52
    invoke-direct {p0}, Lcom/rits/cloning/Cloner;->init()V

    return-void
.end method

.method public constructor <init>(Lcom/rits/cloning/IInstantiationStrategy;)V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    .line 39
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstanceOf:Ljava/util/Set;

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->nullInstead:Ljava/util/Set;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    .line 42
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstances:Ljava/util/Map;

    .line 43
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    .line 44
    iput-boolean v0, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    const/4 v1, 0x1

    .line 45
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    .line 46
    iput-boolean v0, p0, Lcom/rits/cloning/Cloner;->nullTransient:Z

    .line 47
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloneSynthetics:Z

    .line 374
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/Cloner;->immutables:Ljava/util/concurrent/ConcurrentHashMap;

    .line 375
    iput-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloneAnonymousParent:Z

    .line 57
    iput-object p1, p0, Lcom/rits/cloning/Cloner;->instantiationStrategy:Lcom/rits/cloning/IInstantiationStrategy;

    .line 58
    invoke-direct {p0}, Lcom/rits/cloning/Cloner;->init()V

    return-void
.end method

.method private addAll(Ljava/util/List;[Ljava/lang/reflect/Field;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;[",
            "Ljava/lang/reflect/Field;",
            ")V"
        }
    .end annotation

    .line 588
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    .line 590
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    .line 592
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 594
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private init()V
    .locals 0

    .line 85
    invoke-virtual {p0}, Lcom/rits/cloning/Cloner;->registerKnownJdkImmutableClasses()V

    .line 86
    invoke-virtual {p0}, Lcom/rits/cloning/Cloner;->registerKnownConstants()V

    .line 87
    invoke-virtual {p0}, Lcom/rits/cloning/Cloner;->registerFastCloners()V

    return-void
.end method

.method private isAnonymousParent(Ljava/lang/reflect/Field;)Z
    .locals 1

    const-string/jumbo v0, "this$0"

    .line 532
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private isImmutable(Ljava/lang/Class;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 401
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->immutables:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_6

    invoke-virtual {p0, p1}, Lcom/rits/cloning/Cloner;->considerImmutable(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 403
    :cond_0
    invoke-virtual {p0}, Lcom/rits/cloning/Cloner;->getImmutableAnnotation()Ljava/lang/Class;

    move-result-object v0

    .line 404
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v2, v5

    .line 406
    invoke-interface {v6}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v6

    if-ne v6, v0, :cond_1

    .line 408
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->immutables:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 412
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_5

    .line 413
    const-class v2, Ljava/lang/Object;

    if-eq v0, v2, :cond_5

    .line 415
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v2

    array-length v3, v2

    move v5, v4

    :goto_2
    if-ge v5, v3, :cond_4

    aget-object v6, v2, v5

    .line 417
    invoke-interface {v6}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Lcom/rits/cloning/Immutable;

    if-ne v7, v8, :cond_3

    .line 419
    check-cast v6, Lcom/rits/cloning/Immutable;

    .line 420
    invoke-interface {v6}, Lcom/rits/cloning/Immutable;->subClass()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 422
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->immutables:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 427
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_5
    return v4

    :cond_6
    :goto_3
    return v1
.end method


# virtual methods
.method protected allFields(Ljava/lang/Class;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation

    .line 603
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    .line 606
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 607
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 608
    invoke-direct {p0, v0, v1}, Lcom/rits/cloning/Cloner;->addAll(Ljava/util/List;[Ljava/lang/reflect/Field;)V

    move-object v1, p1

    .line 610
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    if-eqz v1, :cond_0

    .line 612
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/rits/cloning/Cloner;->addAll(Ljava/util/List;[Ljava/lang/reflect/Field;)V

    goto :goto_0

    .line 614
    :cond_0
    iget-object v1, p0, Lcom/rits/cloning/Cloner;->fieldsCache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-ne p1, p0, :cond_1

    return-object v0

    .line 441
    :cond_1
    iget-object v1, p0, Lcom/rits/cloning/Cloner;->ignoredInstances:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p1

    .line 442
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 443
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_3

    return-object p1

    .line 445
    :cond_3
    iget-object v2, p0, Lcom/rits/cloning/Cloner;->nullInstead:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v0

    .line 446
    :cond_4
    iget-object v2, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object p1

    .line 447
    :cond_5
    iget-object v2, p0, Lcom/rits/cloning/Cloner;->ignoredInstanceOf:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 449
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_6

    return-object p1

    .line 451
    :cond_7
    invoke-direct {p0, v1}, Lcom/rits/cloning/Cloner;->isImmutable(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_8

    return-object p1

    .line 452
    :cond_8
    instance-of v2, p1, Lcom/rits/cloning/IFreezable;

    if-eqz v2, :cond_9

    .line 454
    move-object v2, p1

    check-cast v2, Lcom/rits/cloning/IFreezable;

    .line 455
    invoke-interface {v2}, Lcom/rits/cloning/IFreezable;->isFrozen()Z

    move-result v2

    if-eqz v2, :cond_9

    return-object p1

    :cond_9
    if-eqz p2, :cond_a

    .line 457
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_a
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_b

    return-object v2

    .line 460
    :cond_b
    invoke-virtual {p0, p1, p2}, Lcom/rits/cloning/Cloner;->fastClone(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_d

    if-eqz p2, :cond_c

    .line 465
    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    return-object v2

    .line 470
    :cond_d
    iget-boolean v2, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    if-eqz v2, :cond_e

    .line 472
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "clone>"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 474
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_12

    .line 476
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 477
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    if-eqz p2, :cond_f

    .line 480
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    :goto_1
    if-ge v3, v0, :cond_11

    .line 484
    invoke-static {p1, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    if-eqz p2, :cond_10

    .line 485
    invoke-virtual {p0, v2, p2}, Lcom/rits/cloning/Cloner;->cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    .line 486
    :cond_10
    invoke-static {v1, v3, v2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_11
    return-object v1

    .line 491
    :cond_12
    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-eqz p2, :cond_13

    .line 494
    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    :cond_13
    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->allFields(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 497
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Field;

    .line 499
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    .line 500
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v6

    if-nez v6, :cond_14

    .line 502
    iget-boolean v6, p0, Lcom/rits/cloning/Cloner;->nullTransient:Z

    if-eqz v6, :cond_15

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v5

    if-eqz v5, :cond_15

    .line 505
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    .line 506
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-nez v5, :cond_14

    .line 508
    invoke-virtual {v4, v2, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    .line 512
    :cond_15
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 513
    iget-boolean v6, p0, Lcom/rits/cloning/Cloner;->cloneSynthetics:Z

    if-nez v6, :cond_16

    if-nez v6, :cond_17

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v6

    if-nez v6, :cond_17

    :cond_16
    iget-boolean v6, p0, Lcom/rits/cloning/Cloner;->cloneAnonymousParent:Z

    if-nez v6, :cond_18

    if-nez v6, :cond_17

    invoke-direct {p0, v4}, Lcom/rits/cloning/Cloner;->isAnonymousParent(Ljava/lang/reflect/Field;)Z

    move-result v6

    if-nez v6, :cond_17

    goto :goto_3

    :cond_17
    move v6, v3

    goto :goto_4

    :cond_18
    :goto_3
    const/4 v6, 0x1

    :goto_4
    if-eqz p2, :cond_19

    if-eqz v6, :cond_19

    .line 514
    invoke-virtual {p0, v5, p2}, Lcom/rits/cloning/Cloner;->cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_5

    :cond_19
    move-object v6, v5

    .line 515
    :goto_5
    invoke-virtual {v4, v2, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 516
    iget-boolean v7, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    if-eqz v7, :cond_14

    if-eq v6, v5, :cond_14

    .line 518
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "cloned field>"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "  -- of class "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1a
    return-object v2
.end method

.method protected considerImmutable(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public copyPropertiesOfInheritedClass(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E:TT;>(TT;TE;)V"
        }
    .end annotation

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    .line 545
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 546
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 547
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 549
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 550
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 553
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    .line 554
    invoke-static {p2, v1, v2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 549
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "can\'t copy from array to non-array class "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 558
    :cond_2
    invoke-virtual {p0, v0}, Lcom/rits/cloning/Cloner;->allFields(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    .line 559
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->allFields(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 560
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 562
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 566
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    .line 567
    invoke-virtual {v2, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 568
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 570
    invoke-virtual {v2, p2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 577
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 574
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    return-void

    .line 544
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "dest can\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 543
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "src can\'t be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public deepClone(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 315
    :cond_0
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    if-nez v0, :cond_1

    return-object p1

    .line 316
    :cond_1
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    if-eqz v0, :cond_2

    .line 318
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "start>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 320
    :cond_2
    new-instance v0, Ljava/util/IdentityHashMap;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 323
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/rits/cloning/Cloner;->cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 326
    new-instance v1, Lcom/rits/cloning/CloningException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error during cloning of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/rits/cloning/CloningException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public varargs deepCloneDontCloneInstances(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 333
    :cond_0
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    if-nez v0, :cond_1

    return-object p1

    .line 334
    :cond_1
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    if-eqz v0, :cond_2

    .line 336
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "start>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 338
    :cond_2
    new-instance v0, Ljava/util/IdentityHashMap;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 339
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    .line 341
    invoke-interface {v0, v3, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 345
    :cond_3
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/rits/cloning/Cloner;->cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    .line 348
    new-instance v0, Lcom/rits/cloning/CloningException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error during cloning of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/rits/cloning/CloningException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public varargs dontClone([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 216
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 218
    iget-object v3, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public varargs dontCloneInstanceOf([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 224
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 226
    iget-object v3, p0, Lcom/rits/cloning/Cloner;->ignoredInstanceOf:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected fastClone(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rits/cloning/IFastCloner;

    if-eqz v0, :cond_0

    .line 108
    invoke-interface {v0, p1, p0, p2}, Lcom/rits/cloning/IFastCloner;->clone(Ljava/lang/Object;Lcom/rits/cloning/Cloner;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public fastCloneOrNewInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 295
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/rits/cloning/Cloner;->fastClone(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-object v0

    .line 301
    :cond_0
    invoke-virtual {p0, p1}, Lcom/rits/cloning/Cloner;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 299
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method protected getImmutableAnnotation()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 390
    const-class v0, Lcom/rits/cloning/Immutable;

    return-object v0
.end method

.method public isCloneAnonymousParent()Z
    .locals 1

    .line 654
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->cloneAnonymousParent:Z

    return v0
.end method

.method public isCloningEnabled()Z
    .locals 1

    .line 636
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    return v0
.end method

.method public isDumpClonedClasses()Z
    .locals 1

    .line 621
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    return v0
.end method

.method public isNullTransient()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/rits/cloning/Cloner;->nullTransient:Z

    return v0
.end method

.method protected newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 287
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->instantiationStrategy:Lcom/rits/cloning/IInstantiationStrategy;

    invoke-interface {v0, p1}, Lcom/rits/cloning/IInstantiationStrategy;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public varargs nullInsteadOfClone([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 237
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 239
    iget-object v3, p0, Lcom/rits/cloning/Cloner;->nullInstead:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public registerConstant(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 121
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 p2, 0x1

    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 124
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstances:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 136
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 133
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 130
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_3
    move-exception p1

    .line 127
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public registerConstant(Ljava/lang/Object;)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->ignoredInstances:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public registerFastCloner(Ljava/lang/Class;Lcom/rits/cloning/IFastCloner;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/rits/cloning/IFastCloner;",
            ")V"
        }
    .end annotation

    .line 274
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 274
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already fast-cloned!"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method protected registerFastCloners()V
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/GregorianCalendar;

    new-instance v2, Lcom/rits/cloning/FastClonerCalendar;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerCalendar;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/ArrayList;

    new-instance v2, Lcom/rits/cloning/FastClonerArrayList;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/LinkedList;

    new-instance v2, Lcom/rits/cloning/FastClonerLinkedList;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerLinkedList;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/HashSet;

    new-instance v2, Lcom/rits/cloning/FastClonerHashSet;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerHashSet;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/HashMap;

    new-instance v2, Lcom/rits/cloning/FastClonerHashMap;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerHashMap;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/TreeMap;

    new-instance v2, Lcom/rits/cloning/FastClonerTreeMap;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerTreeMap;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->fastCloners:Ljava/util/Map;

    const-class v1, Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Lcom/rits/cloning/FastClonerConcurrentHashMap;

    invoke-direct {v2}, Lcom/rits/cloning/FastClonerConcurrentHashMap;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public varargs registerImmutable([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 258
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 260
    iget-object v3, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected registerKnownConstants()V
    .locals 3

    const/4 v0, 0x4

    .line 169
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/util/TreeSet;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/util/HashSet;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, Ljava/util/TreeMap;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/rits/cloning/Cloner;->registerStaticFields([Ljava/lang/Class;)V

    return-void
.end method

.method protected registerKnownJdkImmutableClasses()V
    .locals 4

    const/4 v0, 0x1

    .line 146
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 147
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Integer;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 148
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Long;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 149
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Boolean;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 150
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Class;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 151
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Float;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 152
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Double;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 153
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Character;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 154
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Byte;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 155
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Short;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 156
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/lang/Void;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 158
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/math/BigDecimal;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 159
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/math/BigInteger;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 160
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/net/URI;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 161
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/net/URL;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 162
    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Ljava/util/UUID;

    aput-object v2, v1, v3

    invoke-virtual {p0, v1}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    .line 163
    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/util/regex/Pattern;

    aput-object v1, v0, v3

    invoke-virtual {p0, v0}, Lcom/rits/cloning/Cloner;->registerImmutable([Ljava/lang/Class;)V

    return-void
.end method

.method public varargs registerStaticFields([Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 183
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 185
    invoke-virtual {p0, v2}, Lcom/rits/cloning/Cloner;->allFields(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 186
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Field;

    .line 188
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    .line 189
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-nez v5, :cond_0

    .line 192
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v2, v4}, Lcom/rits/cloning/Cloner;->registerConstant(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setCloneAnonymousParent(Z)V
    .locals 0

    .line 649
    iput-boolean p1, p0, Lcom/rits/cloning/Cloner;->cloneAnonymousParent:Z

    return-void
.end method

.method public setCloneSynthetics(Z)V
    .locals 0

    .line 80
    iput-boolean p1, p0, Lcom/rits/cloning/Cloner;->cloneSynthetics:Z

    return-void
.end method

.method public setCloningEnabled(Z)V
    .locals 0

    .line 641
    iput-boolean p1, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    return-void
.end method

.method public setDumpClonedClasses(Z)V
    .locals 0

    .line 631
    iput-boolean p1, p0, Lcom/rits/cloning/Cloner;->dumpClonedClasses:Z

    return-void
.end method

.method public setExtraImmutables(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->ignored:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setExtraNullInsteadOfClone(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 248
    iget-object v0, p0, Lcom/rits/cloning/Cloner;->nullInstead:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setExtraStaticFields(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 204
    invoke-interface {p1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lcom/rits/cloning/Cloner;->registerStaticFields([Ljava/lang/Class;)V

    return-void
.end method

.method public setNullTransient(Z)V
    .locals 0

    .line 75
    iput-boolean p1, p0, Lcom/rits/cloning/Cloner;->nullTransient:Z

    return-void
.end method

.method public shallowClone(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 363
    :cond_0
    iget-boolean v1, p0, Lcom/rits/cloning/Cloner;->cloningEnabled:Z

    if-nez v1, :cond_1

    return-object p1

    .line 366
    :cond_1
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/rits/cloning/Cloner;->cloneInternal(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 369
    new-instance v1, Lcom/rits/cloning/CloningException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error during cloning of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/rits/cloning/CloningException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
