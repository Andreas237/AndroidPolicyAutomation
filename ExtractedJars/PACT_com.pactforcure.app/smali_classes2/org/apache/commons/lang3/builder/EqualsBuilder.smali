.class public Lorg/apache/commons/lang3/builder/EqualsBuilder;
.super Ljava/lang/Object;
.source "EqualsBuilder.java"

# interfaces
.implements Lorg/apache/commons/lang3/builder/Builder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/apache/commons/lang3/builder/Builder",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final REGISTRY:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/Set",
            "<",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            ">;>;>;"
        }
    .end annotation
.end field


# instance fields
.field private isEquals:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 92
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->REGISTRY:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    .line 224
    return-void
.end method

.method static getRegisterPair(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;
    .locals 3
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 135
    new-instance v0, Lorg/apache/commons/lang3/builder/IDKey;

    invoke-direct {v0, p0}, Lorg/apache/commons/lang3/builder/IDKey;-><init>(Ljava/lang/Object;)V

    .line 136
    .local v0, "left":Lorg/apache/commons/lang3/builder/IDKey;
    new-instance v1, Lorg/apache/commons/lang3/builder/IDKey;

    invoke-direct {v1, p1}, Lorg/apache/commons/lang3/builder/IDKey;-><init>(Ljava/lang/Object;)V

    .line 137
    .local v1, "right":Lorg/apache/commons/lang3/builder/IDKey;
    invoke-static {v0, v1}, Lorg/apache/commons/lang3/tuple/Pair;->of(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;

    move-result-object v2

    return-object v2
.end method

.method static getRegistry()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            "Lorg/apache/commons/lang3/builder/IDKey;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 121
    sget-object v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->REGISTRY:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method static isRegistered(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 5
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;

    .prologue
    .line 154
    invoke-static {}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegistry()Ljava/util/Set;

    move-result-object v1

    .line 155
    .local v1, "registry":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;>;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegisterPair(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;

    move-result-object v0

    .line 156
    .local v0, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    invoke-virtual {v0}, Lorg/apache/commons/lang3/tuple/Pair;->getLeft()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lorg/apache/commons/lang3/tuple/Pair;->getRight()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/apache/commons/lang3/tuple/Pair;->of(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;

    move-result-object v2

    .line 158
    .local v2, "swappedPair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    const/4 v3, 0x1

    :goto_0
    return v3

    :cond_1
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private static reflectionAppend(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lorg/apache/commons/lang3/builder/EqualsBuilder;Z[Ljava/lang/String;)V
    .locals 6
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .param p3, "builder"    # Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .param p4, "useTransients"    # Z
    .param p5, "excludeFields"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class",
            "<*>;",
            "Lorg/apache/commons/lang3/builder/EqualsBuilder;",
            "Z[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 392
    .local p2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isRegistered(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 418
    :goto_0
    return-void

    .line 397
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->register(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 398
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 399
    .local v2, "fields":[Ljava/lang/reflect/Field;
    const/4 v4, 0x1

    invoke-static {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible([Ljava/lang/reflect/AccessibleObject;Z)V

    .line 400
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    array-length v4, v2

    if-ge v3, v4, :cond_3

    iget-boolean v4, p3, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v4, :cond_3

    .line 401
    aget-object v1, v2, v3

    .line 402
    .local v1, "f":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p5, v4}, Lorg/apache/commons/lang3/ArrayUtils;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x24

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    if-nez p4, :cond_1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    if-nez v4, :cond_2

    .line 407
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p3, v4, v5}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 400
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 408
    :catch_0
    move-exception v0

    .line 411
    .local v0, "e":Ljava/lang/IllegalAccessException;
    :try_start_2
    new-instance v4, Ljava/lang/InternalError;

    const-string v5, "Unexpected IllegalAccessException"

    invoke-direct {v4, v5}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 416
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    .end local v1    # "f":Ljava/lang/reflect/Field;
    .end local v2    # "fields":[Ljava/lang/reflect/Field;
    .end local v3    # "i":I
    :catchall_0
    move-exception v4

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->unregister(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v4

    .restart local v2    # "fields":[Ljava/lang/reflect/Field;
    .restart local v3    # "i":I
    :cond_3
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->unregister(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Collection;)Z
    .locals 1
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 248
    .local p2, "excludeFields":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-static {p2}, Lorg/apache/commons/lang3/builder/ReflectionToStringBuilder;->toNoNullStringArray(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 2
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .param p2, "testTransients"    # Z

    .prologue
    .line 295
    const/4 v0, 0x0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p0, p1, p2, v0, v1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Class;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static varargs reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Class;[Ljava/lang/String;)Z
    .locals 10
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .param p2, "testTransients"    # Z
    .param p4, "excludeFields"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Z",
            "Ljava/lang/Class",
            "<*>;[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p3, "reflectUpToClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v9, 0x0

    .line 326
    if-ne p0, p1, :cond_0

    .line 327
    const/4 v0, 0x1

    .line 370
    :goto_0
    return v0

    .line 329
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    :cond_1
    move v0, v9

    .line 330
    goto :goto_0

    .line 336
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    .line 337
    .local v7, "lhsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    .line 339
    .local v8, "rhsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 340
    move-object v2, v7

    .line 341
    .local v2, "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v8, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 343
    move-object v2, v8

    .line 355
    :cond_3
    :goto_1
    new-instance v3, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    .local v3, "equalsBuilder":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move-object v5, p4

    .line 357
    :try_start_0
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->reflectionAppend(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lorg/apache/commons/lang3/builder/EqualsBuilder;Z[Ljava/lang/String;)V

    .line 358
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_6

    if-eq v2, p3, :cond_6

    .line 359
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move-object v5, p4

    .line 360
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->reflectionAppend(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lorg/apache/commons/lang3/builder/EqualsBuilder;Z[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 362
    :catch_0
    move-exception v6

    .local v6, "e":Ljava/lang/IllegalArgumentException;
    move v0, v9

    .line 368
    goto :goto_0

    .line 345
    .end local v2    # "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v3    # "equalsBuilder":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .end local v6    # "e":Ljava/lang/IllegalArgumentException;
    :cond_4
    invoke-virtual {v8, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 346
    move-object v2, v8

    .line 347
    .restart local v2    # "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 349
    move-object v2, v7

    goto :goto_1

    .end local v2    # "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_5
    move v0, v9

    .line 353
    goto :goto_0

    .line 370
    .restart local v2    # "testClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v3    # "equalsBuilder":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :cond_6
    invoke-virtual {v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result v0

    goto :goto_0
.end method

.method public static varargs reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)Z
    .locals 2
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;
    .param p2, "excludeFields"    # [Ljava/lang/String;

    .prologue
    .line 271
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->reflectionEquals(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Class;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static register(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;

    .prologue
    .line 172
    const-class v3, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    monitor-enter v3

    .line 173
    :try_start_0
    invoke-static {}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegistry()Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_0

    .line 174
    sget-object v2, Lorg/apache/commons/lang3/builder/EqualsBuilder;->REGISTRY:Ljava/lang/ThreadLocal;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 176
    :cond_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    invoke-static {}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegistry()Ljava/util/Set;

    move-result-object v1

    .line 179
    .local v1, "registry":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;>;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegisterPair(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;

    move-result-object v0

    .line 180
    .local v0, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 181
    return-void

    .line 176
    .end local v0    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    .end local v1    # "registry":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;>;"
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2
.end method

.method static unregister(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4
    .param p0, "lhs"    # Ljava/lang/Object;
    .param p1, "rhs"    # Ljava/lang/Object;

    .prologue
    .line 196
    invoke-static {}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegistry()Ljava/util/Set;

    move-result-object v1

    .line 197
    .local v1, "registry":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;>;"
    if-eqz v1, :cond_1

    .line 198
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegisterPair(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/tuple/Pair;

    move-result-object v0

    .line 199
    .local v0, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 200
    const-class v3, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    monitor-enter v3

    .line 202
    :try_start_0
    invoke-static {}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->getRegistry()Ljava/util/Set;

    move-result-object v1

    .line 203
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 204
    sget-object v2, Lorg/apache/commons/lang3/builder/EqualsBuilder;->REGISTRY:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 206
    :cond_0
    monitor-exit v3

    .line 208
    .end local v0    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    :cond_1
    return-void

    .line 206
    .restart local v0    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Lorg/apache/commons/lang3/builder/IDKey;Lorg/apache/commons/lang3/builder/IDKey;>;"
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method


# virtual methods
.method public append(BB)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # B
    .param p2, "rhs"    # B

    .prologue
    .line 563
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 567
    :goto_0
    return-object p0

    .line 566
    :cond_0
    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append(CC)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # C
    .param p2, "rhs"    # C

    .prologue
    .line 548
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 552
    :goto_0
    return-object p0

    .line 551
    :cond_0
    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append(DD)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 5
    .param p1, "lhs"    # D
    .param p3, "rhs"    # D

    .prologue
    .line 584
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 587
    .end local p0    # "this":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :goto_0
    return-object p0

    .restart local p0    # "this":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {p3, p4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(JJ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p0

    goto :goto_0
.end method

.method public append(FF)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 2
    .param p1, "lhs"    # F
    .param p2, "rhs"    # F

    .prologue
    .line 604
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 607
    .end local p0    # "this":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :goto_0
    return-object p0

    .restart local p0    # "this":Lorg/apache/commons/lang3/builder/EqualsBuilder;
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p0

    goto :goto_0
.end method

.method public append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # I
    .param p2, "rhs"    # I

    .prologue
    .line 518
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 522
    :goto_0
    return-object p0

    .line 521
    :cond_0
    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append(JJ)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # J
    .param p3, "rhs"    # J

    .prologue
    .line 503
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 507
    :goto_0
    return-object p0

    .line 506
    :cond_0
    cmp-long v0, p1, p3

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # Ljava/lang/Object;
    .param p2, "rhs"    # Ljava/lang/Object;

    .prologue
    const/4 v3, 0x0

    .line 448
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 488
    .end local p1    # "lhs":Ljava/lang/Object;
    .end local p2    # "rhs":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-object p0

    .line 451
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_1
    if-eq p1, p2, :cond_0

    .line 454
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 455
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 458
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 459
    .local v0, "lhsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_4

    .line 461
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    .line 462
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_5

    .line 464
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 468
    :cond_5
    instance-of v1, p1, [J

    if-eqz v1, :cond_6

    .line 469
    check-cast p1, [J

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [J

    check-cast p2, [J

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [J

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([J[J)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto :goto_0

    .line 470
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_6
    instance-of v1, p1, [I

    if-eqz v1, :cond_7

    .line 471
    check-cast p1, [I

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [I

    check-cast p2, [I

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [I

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([I[I)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto :goto_0

    .line 472
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_7
    instance-of v1, p1, [S

    if-eqz v1, :cond_8

    .line 473
    check-cast p1, [S

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [S

    check-cast p2, [S

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [S

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([S[S)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto :goto_0

    .line 474
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_8
    instance-of v1, p1, [C

    if-eqz v1, :cond_9

    .line 475
    check-cast p1, [C

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [C

    check-cast p2, [C

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [C

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([C[C)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto :goto_0

    .line 476
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_9
    instance-of v1, p1, [B

    if-eqz v1, :cond_a

    .line 477
    check-cast p1, [B

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [B

    check-cast p2, [B

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [B

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([B[B)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto :goto_0

    .line 478
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_a
    instance-of v1, p1, [D

    if-eqz v1, :cond_b

    .line 479
    check-cast p1, [D

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [D

    check-cast p2, [D

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [D

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([D[D)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto/16 :goto_0

    .line 480
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_b
    instance-of v1, p1, [F

    if-eqz v1, :cond_c

    .line 481
    check-cast p1, [F

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [F

    check-cast p2, [F

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [F

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([F[F)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto/16 :goto_0

    .line 482
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_c
    instance-of v1, p1, [Z

    if-eqz v1, :cond_d

    .line 483
    check-cast p1, [Z

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [Z

    check-cast p2, [Z

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [Z

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([Z[Z)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto/16 :goto_0

    .line 486
    .restart local p1    # "lhs":Ljava/lang/Object;
    .restart local p2    # "rhs":Ljava/lang/Object;
    :cond_d
    check-cast p1, [Ljava/lang/Object;

    .end local p1    # "lhs":Ljava/lang/Object;
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    .end local p2    # "rhs":Ljava/lang/Object;
    check-cast p2, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append([Ljava/lang/Object;[Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    goto/16 :goto_0
.end method

.method public append(SS)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # S
    .param p2, "rhs"    # S

    .prologue
    .line 533
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 537
    :goto_0
    return-object p0

    .line 536
    :cond_0
    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append(ZZ)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "lhs"    # Z
    .param p2, "rhs"    # Z

    .prologue
    .line 618
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 622
    :goto_0
    return-object p0

    .line 621
    :cond_0
    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public append([B[B)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [B
    .param p2, "rhs"    # [B

    .prologue
    const/4 v3, 0x0

    .line 791
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 808
    :cond_0
    :goto_0
    return-object p0

    .line 794
    :cond_1
    if-eq p1, p2, :cond_0

    .line 797
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 798
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 801
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 802
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 805
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 806
    aget-byte v1, p1, v0

    aget-byte v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(BB)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 805
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([C[C)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [C
    .param p2, "rhs"    # [C

    .prologue
    const/4 v3, 0x0

    .line 760
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 777
    :cond_0
    :goto_0
    return-object p0

    .line 763
    :cond_1
    if-eq p1, p2, :cond_0

    .line 766
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 767
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 770
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 771
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 774
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 775
    aget-char v1, p1, v0

    aget-char v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(CC)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 774
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([D[D)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 6
    .param p1, "lhs"    # [D
    .param p2, "rhs"    # [D

    .prologue
    const/4 v3, 0x0

    .line 822
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 839
    :cond_0
    :goto_0
    return-object p0

    .line 825
    :cond_1
    if-eq p1, p2, :cond_0

    .line 828
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 829
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 832
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 833
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 836
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 837
    aget-wide v2, p1, v0

    aget-wide v4, p2, v0

    invoke-virtual {p0, v2, v3, v4, v5}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(DD)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 836
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([F[F)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [F
    .param p2, "rhs"    # [F

    .prologue
    const/4 v3, 0x0

    .line 853
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 870
    :cond_0
    :goto_0
    return-object p0

    .line 856
    :cond_1
    if-eq p1, p2, :cond_0

    .line 859
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 860
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 863
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 864
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 867
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 868
    aget v1, p1, v0

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(FF)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 867
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([I[I)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [I
    .param p2, "rhs"    # [I

    .prologue
    const/4 v3, 0x0

    .line 698
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 715
    :cond_0
    :goto_0
    return-object p0

    .line 701
    :cond_1
    if-eq p1, p2, :cond_0

    .line 704
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 705
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 708
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 709
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 712
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 713
    aget v1, p1, v0

    aget v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 712
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([J[J)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 6
    .param p1, "lhs"    # [J
    .param p2, "rhs"    # [J

    .prologue
    const/4 v3, 0x0

    .line 667
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 684
    :cond_0
    :goto_0
    return-object p0

    .line 670
    :cond_1
    if-eq p1, p2, :cond_0

    .line 673
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 674
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 677
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 678
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 681
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 682
    aget-wide v2, p1, v0

    aget-wide v4, p2, v0

    invoke-virtual {p0, v2, v3, v4, v5}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(JJ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 681
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([Ljava/lang/Object;[Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [Ljava/lang/Object;
    .param p2, "rhs"    # [Ljava/lang/Object;

    .prologue
    const/4 v3, 0x0

    .line 636
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 653
    :cond_0
    :goto_0
    return-object p0

    .line 639
    :cond_1
    if-eq p1, p2, :cond_0

    .line 642
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 643
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 646
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 647
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 650
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 651
    aget-object v1, p1, v0

    aget-object v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 650
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([S[S)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [S
    .param p2, "rhs"    # [S

    .prologue
    const/4 v3, 0x0

    .line 729
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 746
    :cond_0
    :goto_0
    return-object p0

    .line 732
    :cond_1
    if-eq p1, p2, :cond_0

    .line 735
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 736
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 739
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 740
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 743
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 744
    aget-short v1, p1, v0

    aget-short v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(SS)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 743
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public append([Z[Z)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 4
    .param p1, "lhs"    # [Z
    .param p2, "rhs"    # [Z

    .prologue
    const/4 v3, 0x0

    .line 884
    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v1, :cond_1

    .line 901
    :cond_0
    :goto_0
    return-object p0

    .line 887
    :cond_1
    if-eq p1, p2, :cond_0

    .line 890
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    .line 891
    :cond_2
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 894
    :cond_3
    array-length v1, p1

    array-length v2, p2

    if-eq v1, v2, :cond_4

    .line 895
    invoke-virtual {p0, v3}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->setEquals(Z)V

    goto :goto_0

    .line 898
    :cond_4
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-boolean v1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-eqz v1, :cond_0

    .line 899
    aget-boolean v1, p1, v0

    aget-boolean v2, p2, v0

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(ZZ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    .line 898
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public appendSuper(Z)Lorg/apache/commons/lang3/builder/EqualsBuilder;
    .locals 1
    .param p1, "superEquals"    # Z

    .prologue
    .line 430
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    if-nez v0, :cond_0

    .line 434
    :goto_0
    return-object p0

    .line 433
    :cond_0
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    goto :goto_0
.end method

.method public build()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 924
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->build()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public isEquals()Z
    .locals 1

    .prologue
    .line 911
    iget-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    return v0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 942
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    .line 943
    return-void
.end method

.method protected setEquals(Z)V
    .locals 0
    .param p1, "isEquals"    # Z

    .prologue
    .line 934
    iput-boolean p1, p0, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals:Z

    .line 935
    return-void
.end method
