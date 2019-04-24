.class public final Lcom/google/dexmaker/stock/ProxyBuilder;
.super Ljava/lang/Object;
.source "ProxyBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final FIELD_NAME_HANDLER:Ljava/lang/String; = "$__handler"

.field private static final FIELD_NAME_METHODS:Ljava/lang/String; = "$__methodArray"

.field private static final PRIMITIVE_TO_BOXED:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final PRIMITIVE_TO_UNBOX_METHOD:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/dexmaker/MethodId<",
            "**>;>;"
        }
    .end annotation
.end field

.field private static final PRIMITIVE_TYPE_TO_UNBOX_METHOD:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/dexmaker/TypeId<",
            "*>;",
            "Lcom/google/dexmaker/MethodId<",
            "**>;>;"
        }
    .end annotation
.end field

.field private static final generatedProxyClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final baseClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private constructorArgTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private constructorArgValues:[Ljava/lang/Object;

.field private dexCache:Ljava/io/File;

.field private handler:Ljava/lang/reflect/InvocationHandler;

.field private interfaces:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private parentClassLoader:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 126
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->generatedProxyClasses:Ljava/util/Map;

    .line 691
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    .line 692
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Byte;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Long;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Short;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Float;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Double;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 699
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Character;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TYPE_TO_UNBOX_METHOD:Ljava/util/Map;

    .line 705
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 706
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    .line 707
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v1

    const-string/jumbo v4, "valueOf"

    const/4 v5, 0x1

    .line 708
    new-array v5, v5, [Lcom/google/dexmaker/TypeId;

    aput-object v3, v5, v2

    invoke-virtual {v1, v1, v4, v5}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v1

    .line 709
    sget-object v2, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TYPE_TO_UNBOX_METHOD:Ljava/util/Map;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 722
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 723
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->BOOLEAN:Lcom/google/dexmaker/TypeId;

    const-string v5, "booleanValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Integer;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->INT:Lcom/google/dexmaker/TypeId;

    const-string v5, "intValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Byte;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->BYTE:Lcom/google/dexmaker/TypeId;

    const-string v5, "byteValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Long;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->LONG:Lcom/google/dexmaker/TypeId;

    const-string v5, "longValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Short;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->SHORT:Lcom/google/dexmaker/TypeId;

    const-string/jumbo v5, "shortValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Float;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->FLOAT:Lcom/google/dexmaker/TypeId;

    const-string v5, "floatValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Double;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->DOUBLE:Lcom/google/dexmaker/TypeId;

    const-string v5, "doubleValue"

    new-array v6, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v6}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Character;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    sget-object v4, Lcom/google/dexmaker/TypeId;->CHAR:Lcom/google/dexmaker/TypeId;

    const-string v5, "charValue"

    new-array v2, v2, [Lcom/google/dexmaker/TypeId;

    invoke-virtual {v3, v4, v5, v2}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    sput-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_UNBOX_METHOD:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    const-class v0, Lcom/google/dexmaker/stock/ProxyBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    iput-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->parentClassLoader:Ljava/lang/ClassLoader;

    const/4 v0, 0x0

    .line 133
    new-array v1, v0, [Ljava/lang/Class;

    iput-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgTypes:[Ljava/lang/Class;

    .line 134
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgValues:[Ljava/lang/Object;

    .line 135
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    .line 138
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    return-void
.end method

.method private static varargs asSet([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    .line 682
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private static boxIfRequired(Lcom/google/dexmaker/Code;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)Lcom/google/dexmaker/Local;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Code;",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/dexmaker/Local<",
            "*>;"
        }
    .end annotation

    .line 513
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TYPE_TO_UNBOX_METHOD:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->getType()Lcom/google/dexmaker/TypeId;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/MethodId;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const/4 v1, 0x1

    .line 517
    new-array v1, v1, [Lcom/google/dexmaker/Local;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, p2, v1}, Lcom/google/dexmaker/Code;->invokeStatic(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-object p2
.end method

.method public static varargs callSuper(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 523
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1}, Lcom/google/dexmaker/stock/ProxyBuilder;->superMethodName(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 527
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method private static check(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    .line 543
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static classArrayToTypeArray([Ljava/lang/Class;)[Lcom/google/dexmaker/TypeId;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)[",
            "Lcom/google/dexmaker/TypeId<",
            "*>;"
        }
    .end annotation

    .line 651
    array-length v0, p0

    new-array v0, v0, [Lcom/google/dexmaker/TypeId;

    const/4 v1, 0x0

    .line 652
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    .line 653
    aget-object v2, p0, v1

    invoke-static {v2}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static forClass(Ljava/lang/Class;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 142
    new-instance v0, Lcom/google/dexmaker/stock/ProxyBuilder;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/stock/ProxyBuilder;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method private static generateCodeForAllMethods(Lcom/google/dexmaker/DexMaker;Lcom/google/dexmaker/TypeId;[Ljava/lang/reflect/Method;Lcom/google/dexmaker/TypeId;)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "G:TT;>(",
            "Lcom/google/dexmaker/DexMaker;",
            "Lcom/google/dexmaker/TypeId<",
            "TG;>;[",
            "Ljava/lang/reflect/Method;",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 352
    const-class v3, Ljava/lang/reflect/InvocationHandler;

    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    .line 353
    const-class v4, [Ljava/lang/reflect/Method;

    invoke-static {v4}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v4

    const-string v5, "$__handler"

    .line 354
    invoke-virtual {v1, v3, v5}, Lcom/google/dexmaker/TypeId;->getField(Lcom/google/dexmaker/TypeId;Ljava/lang/String;)Lcom/google/dexmaker/FieldId;

    move-result-object v5

    const-string v6, "$__methodArray"

    .line 356
    invoke-virtual {v1, v4, v6}, Lcom/google/dexmaker/TypeId;->getField(Lcom/google/dexmaker/TypeId;Ljava/lang/String;)Lcom/google/dexmaker/FieldId;

    move-result-object v6

    .line 358
    const-class v7, Ljava/lang/reflect/Method;

    invoke-static {v7}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v7

    .line 359
    const-class v8, [Ljava/lang/Object;

    invoke-static {v8}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v8

    .line 360
    sget-object v9, Lcom/google/dexmaker/TypeId;->OBJECT:Lcom/google/dexmaker/TypeId;

    const-string v10, "invoke"

    const/4 v11, 0x3

    new-array v12, v11, [Lcom/google/dexmaker/TypeId;

    sget-object v13, Lcom/google/dexmaker/TypeId;->OBJECT:Lcom/google/dexmaker/TypeId;

    const/4 v14, 0x0

    aput-object v13, v12, v14

    const/4 v13, 0x1

    aput-object v7, v12, v13

    const/4 v15, 0x2

    aput-object v8, v12, v15

    invoke-virtual {v3, v9, v10, v12}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v9

    move v10, v14

    .line 362
    :goto_0
    array-length v12, v2

    if-ge v10, v12, :cond_7

    .line 406
    aget-object v12, v2, v10

    .line 407
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v15

    .line 408
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    .line 409
    array-length v11, v14

    new-array v11, v11, [Lcom/google/dexmaker/TypeId;

    const/4 v13, 0x0

    .line 410
    :goto_1
    array-length v2, v11

    if-ge v13, v2, :cond_0

    .line 411
    aget-object v2, v14, v13

    invoke-static {v2}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v2

    aput-object v2, v11, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 413
    :cond_0
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    .line 414
    invoke-static {v2}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v13

    move-object/from16 v17, v9

    move-object/from16 v16, v12

    move-object/from16 v12, p3

    .line 415
    invoke-virtual {v12, v13, v15, v11}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v9

    .line 416
    invoke-virtual {v1, v13, v15, v11}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v15

    const/4 v12, 0x1

    .line 417
    invoke-virtual {v0, v15, v12}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/MethodId;I)Lcom/google/dexmaker/Code;

    move-result-object v15

    .line 418
    invoke-virtual {v15, v1}, Lcom/google/dexmaker/Code;->getThis(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v12

    .line 419
    invoke-virtual {v15, v3}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v0

    .line 420
    sget-object v1, Lcom/google/dexmaker/TypeId;->OBJECT:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v15, v1}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v1

    move-object/from16 v18, v9

    .line 421
    sget-object v9, Lcom/google/dexmaker/TypeId;->INT:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v15, v9}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    move-object/from16 v19, v1

    .line 422
    invoke-virtual {v15, v8}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v1

    move-object/from16 v20, v8

    .line 423
    sget-object v8, Lcom/google/dexmaker/TypeId;->INT:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v15, v8}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v8

    move-object/from16 v21, v9

    .line 424
    sget-object v9, Lcom/google/dexmaker/TypeId;->OBJECT:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v15, v9}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    move-object/from16 v22, v9

    .line 425
    invoke-virtual {v15, v13}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    move-object/from16 v23, v9

    .line 426
    invoke-virtual {v15, v4}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    move-object/from16 v24, v4

    .line 427
    invoke-virtual {v15, v7}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v4

    move-object/from16 v25, v7

    .line 428
    sget-object v7, Lcom/google/dexmaker/TypeId;->INT:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v15, v7}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v7

    move-object/from16 v26, v0

    .line 429
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_BOXED:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    move-object/from16 v27, v2

    if-eqz v0, :cond_1

    .line 432
    invoke-static {v0}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v0

    invoke-virtual {v15, v0}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    .line 434
    :goto_2
    array-length v2, v14

    new-array v2, v2, [Lcom/google/dexmaker/Local;

    move-object/from16 v28, v14

    .line 435
    invoke-virtual {v15, v13}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v14

    move-object/from16 v29, v13

    .line 436
    invoke-virtual {v15, v3}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v13

    move-object/from16 v30, v3

    .line 438
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v7, v3}, Lcom/google/dexmaker/Code;->loadConstant(Lcom/google/dexmaker/Local;Ljava/lang/Object;)V

    .line 439
    invoke-virtual {v15, v6, v9}, Lcom/google/dexmaker/Code;->sget(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;)V

    .line 440
    invoke-virtual {v15, v4, v9, v7}, Lcom/google/dexmaker/Code;->aget(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 441
    array-length v3, v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v15, v8, v3}, Lcom/google/dexmaker/Code;->loadConstant(Lcom/google/dexmaker/Local;Ljava/lang/Object;)V

    .line 442
    invoke-virtual {v15, v1, v8}, Lcom/google/dexmaker/Code;->newArray(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    move-object/from16 v3, v26

    .line 443
    invoke-virtual {v15, v5, v3, v12}, Lcom/google/dexmaker/Code;->iget(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    const/4 v7, 0x0

    .line 446
    invoke-virtual {v15, v13, v7}, Lcom/google/dexmaker/Code;->loadConstant(Lcom/google/dexmaker/Local;Ljava/lang/Object;)V

    .line 447
    new-instance v7, Lcom/google/dexmaker/Label;

    invoke-direct {v7}, Lcom/google/dexmaker/Label;-><init>()V

    .line 448
    sget-object v8, Lcom/google/dexmaker/Comparison;->EQ:Lcom/google/dexmaker/Comparison;

    invoke-virtual {v15, v8, v7, v13, v3}, Lcom/google/dexmaker/Code;->compare(Lcom/google/dexmaker/Comparison;Lcom/google/dexmaker/Label;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    const/4 v8, 0x0

    .line 452
    :goto_3
    array-length v9, v11

    if-ge v8, v9, :cond_2

    .line 453
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v13, v21

    invoke-virtual {v15, v13, v9}, Lcom/google/dexmaker/Code;->loadConstant(Lcom/google/dexmaker/Local;Ljava/lang/Object;)V

    .line 454
    aget-object v9, v11, v8

    invoke-virtual {v15, v8, v9}, Lcom/google/dexmaker/Code;->getParameter(ILcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    move-object/from16 v21, v5

    move-object/from16 v5, v22

    .line 455
    invoke-static {v15, v9, v5}, Lcom/google/dexmaker/stock/ProxyBuilder;->boxIfRequired(Lcom/google/dexmaker/Code;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)Lcom/google/dexmaker/Local;

    move-result-object v9

    .line 456
    invoke-virtual {v15, v1, v13, v9}, Lcom/google/dexmaker/Code;->aput(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, v21

    move-object/from16 v21, v13

    goto :goto_3

    :cond_2
    move-object/from16 v21, v5

    const/4 v8, 0x3

    .line 458
    new-array v5, v8, [Lcom/google/dexmaker/Local;

    const/4 v9, 0x0

    aput-object v12, v5, v9

    const/4 v13, 0x1

    aput-object v4, v5, v13

    const/4 v4, 0x2

    aput-object v1, v5, v4

    move-object/from16 v1, v17

    move-object/from16 v13, v19

    invoke-virtual {v15, v1, v13, v3, v5}, Lcom/google/dexmaker/Code;->invokeInterface(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    move-object/from16 v5, v23

    move-object/from16 v3, v27

    .line 460
    invoke-static {v15, v3, v13, v5, v0}, Lcom/google/dexmaker/stock/ProxyBuilder;->generateCodeForReturnStatement(Lcom/google/dexmaker/Code;Ljava/lang/Class;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 466
    invoke-virtual {v15, v7}, Lcom/google/dexmaker/Code;->mark(Lcom/google/dexmaker/Label;)V

    move v0, v9

    .line 467
    :goto_4
    array-length v5, v2

    if-ge v0, v5, :cond_3

    .line 468
    aget-object v5, v11, v0

    invoke-virtual {v15, v0, v5}, Lcom/google/dexmaker/Code;->getParameter(ILcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v5

    aput-object v5, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 470
    :cond_3
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v0, v18

    const/4 v5, 0x0

    .line 471
    invoke-virtual {v15, v0, v5, v12, v2}, Lcom/google/dexmaker/Code;->invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    .line 472
    invoke-virtual {v15}, Lcom/google/dexmaker/Code;->returnVoid()V

    goto :goto_5

    :cond_4
    move-object/from16 v0, v18

    .line 474
    invoke-static {v0, v15, v12, v2, v14}, Lcom/google/dexmaker/stock/ProxyBuilder;->invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Code;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 475
    invoke-virtual {v15, v14}, Lcom/google/dexmaker/Code;->returnValue(Lcom/google/dexmaker/Local;)V

    .line 487
    :goto_5
    invoke-static/range {v16 .. v16}, Lcom/google/dexmaker/stock/ProxyBuilder;->superMethodName(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v7, v29

    move-object/from16 v5, p1

    invoke-virtual {v5, v7, v2, v11}, Lcom/google/dexmaker/TypeId;->getMethod(Lcom/google/dexmaker/TypeId;Ljava/lang/String;[Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v2

    move-object/from16 v12, p0

    const/4 v13, 0x1

    .line 489
    invoke-virtual {v12, v2, v13}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/MethodId;I)Lcom/google/dexmaker/Code;

    move-result-object v2

    .line 490
    invoke-virtual {v2, v5}, Lcom/google/dexmaker/Code;->getThis(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v14

    move-object/from16 v15, v28

    .line 491
    array-length v15, v15

    new-array v15, v15, [Lcom/google/dexmaker/Local;

    move v4, v9

    .line 492
    :goto_6
    array-length v8, v15

    if-ge v4, v8, :cond_5

    .line 493
    aget-object v8, v11, v4

    invoke-virtual {v2, v4, v8}, Lcom/google/dexmaker/Code;->getParameter(ILcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v8

    aput-object v8, v15, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 495
    :cond_5
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x0

    .line 496
    invoke-virtual {v2, v0, v3, v14, v15}, Lcom/google/dexmaker/Code;->invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    .line 497
    invoke-virtual {v2}, Lcom/google/dexmaker/Code;->returnVoid()V

    goto :goto_7

    .line 499
    :cond_6
    invoke-virtual {v2, v7}, Lcom/google/dexmaker/Code;->newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v3

    .line 500
    invoke-static {v0, v2, v14, v15, v3}, Lcom/google/dexmaker/stock/ProxyBuilder;->invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Code;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 501
    invoke-virtual {v2, v3}, Lcom/google/dexmaker/Code;->returnValue(Lcom/google/dexmaker/Local;)V

    :goto_7
    add-int/lit8 v10, v10, 0x1

    move v14, v9

    move-object v0, v12

    move-object/from16 v8, v20

    move-object/from16 v4, v24

    move-object/from16 v7, v25

    move-object/from16 v3, v30

    move-object/from16 v2, p2

    const/4 v11, 0x3

    const/4 v15, 0x2

    move-object v9, v1

    move-object v1, v5

    move-object/from16 v5, v21

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method private static generateCodeForReturnStatement(Lcom/google/dexmaker/Code;Ljava/lang/Class;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 1

    .line 668
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_UNBOX_METHOD:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 669
    invoke-virtual {p0, p4, p2}, Lcom/google/dexmaker/Code;->cast(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 670
    invoke-static {p1}, Lcom/google/dexmaker/stock/ProxyBuilder;->getUnboxMethodForPrimitive(Ljava/lang/Class;)Lcom/google/dexmaker/MethodId;

    move-result-object p1

    const/4 p2, 0x0

    .line 671
    new-array p2, p2, [Lcom/google/dexmaker/Local;

    invoke-virtual {p0, p1, p3, p4, p2}, Lcom/google/dexmaker/Code;->invokeVirtual(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    .line 672
    invoke-virtual {p0, p3}, Lcom/google/dexmaker/Code;->returnValue(Lcom/google/dexmaker/Local;)V

    goto :goto_0

    .line 673
    :cond_0
    sget-object p4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {p4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 674
    invoke-virtual {p0}, Lcom/google/dexmaker/Code;->returnVoid()V

    goto :goto_0

    .line 676
    :cond_1
    invoke-virtual {p0, p3, p2}, Lcom/google/dexmaker/Code;->cast(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V

    .line 677
    invoke-virtual {p0, p3}, Lcom/google/dexmaker/Code;->returnValue(Lcom/google/dexmaker/Local;)V

    :goto_0
    return-void
.end method

.method private static generateConstructorsAndFields(Lcom/google/dexmaker/DexMaker;Lcom/google/dexmaker/TypeId;Lcom/google/dexmaker/TypeId;Ljava/lang/Class;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "G:TT;>(",
            "Lcom/google/dexmaker/DexMaker;",
            "Lcom/google/dexmaker/TypeId<",
            "TG;>;",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 549
    const-class v0, Ljava/lang/reflect/InvocationHandler;

    invoke-static {v0}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v0

    .line 550
    const-class v1, [Ljava/lang/reflect/Method;

    invoke-static {v1}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v1

    const-string v2, "$__handler"

    .line 551
    invoke-virtual {p1, v0, v2}, Lcom/google/dexmaker/TypeId;->getField(Lcom/google/dexmaker/TypeId;Ljava/lang/String;)Lcom/google/dexmaker/FieldId;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    .line 553
    invoke-virtual {p0, v0, v3, v2}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/FieldId;ILjava/lang/Object;)V

    const-string v0, "$__methodArray"

    .line 554
    invoke-virtual {p1, v1, v0}, Lcom/google/dexmaker/TypeId;->getField(Lcom/google/dexmaker/TypeId;Ljava/lang/String;)Lcom/google/dexmaker/FieldId;

    move-result-object v0

    const/16 v1, 0xa

    .line 556
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/FieldId;ILjava/lang/Object;)V

    .line 557
    invoke-static {p3}, Lcom/google/dexmaker/stock/ProxyBuilder;->getConstructorsToOverwrite(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;

    move-result-object p3

    array-length v0, p3

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p3, v3

    .line 558
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v5

    const/16 v6, 0x10

    if-ne v5, v6, :cond_0

    goto :goto_2

    .line 561
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lcom/google/dexmaker/stock/ProxyBuilder;->classArrayToTypeArray([Ljava/lang/Class;)[Lcom/google/dexmaker/TypeId;

    move-result-object v4

    .line 562
    invoke-virtual {p1, v4}, Lcom/google/dexmaker/TypeId;->getConstructor([Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v5

    const/4 v6, 0x1

    .line 563
    invoke-virtual {p0, v5, v6}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/MethodId;I)Lcom/google/dexmaker/Code;

    move-result-object v5

    .line 564
    invoke-virtual {v5, p1}, Lcom/google/dexmaker/Code;->getThis(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v6

    .line 565
    array-length v7, v4

    new-array v7, v7, [Lcom/google/dexmaker/Local;

    move v8, v1

    .line 566
    :goto_1
    array-length v9, v7

    if-ge v8, v9, :cond_1

    .line 567
    aget-object v9, v4, v8

    invoke-virtual {v5, v8, v9}, Lcom/google/dexmaker/Code;->getParameter(ILcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v9

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 569
    :cond_1
    invoke-virtual {p2, v4}, Lcom/google/dexmaker/TypeId;->getConstructor([Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/MethodId;

    move-result-object v4

    .line 570
    invoke-virtual {v5, v4, v2, v6, v7}, Lcom/google/dexmaker/Code;->invokeDirect(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    .line 571
    invoke-virtual {v5}, Lcom/google/dexmaker/Code;->returnVoid()V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static getConstructorsToOverwrite(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)[",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation

    .line 580
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    check-cast p0, [Ljava/lang/reflect/Constructor;

    return-object p0
.end method

.method private getInterfacesAsTypeIds()[Lcom/google/dexmaker/TypeId;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lcom/google/dexmaker/TypeId<",
            "*>;"
        }
    .end annotation

    .line 584
    iget-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/dexmaker/TypeId;

    .line 586
    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    add-int/lit8 v4, v2, 0x1

    .line 587
    invoke-static {v3}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    aput-object v3, v0, v2

    move v2, v4

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
    .locals 2

    .line 324
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "$__handler"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 326
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/reflect/InvocationHandler;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 331
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p0

    .line 328
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Not a valid proxy instance"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static getMethodNameForProxyOf(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 647
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_Proxy"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private getMethodsToProxy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Class;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 616
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    .line 617
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x10

    if-eqz v5, :cond_0

    .line 621
    new-instance v5, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;

    invoke-direct {v5, v4}, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {p2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 624
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v5

    and-int/lit8 v5, v5, 0x8

    if-eqz v5, :cond_1

    goto :goto_1

    .line 628
    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "finalize"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 632
    :cond_2
    new-instance v5, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;

    invoke-direct {v5, v4}, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;-><init>(Ljava/lang/reflect/Method;)V

    .line 633
    invoke-interface {p2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 638
    :cond_3
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 641
    :cond_4
    invoke-virtual {p3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p3

    array-length v0, p3

    :goto_2
    if-ge v2, v0, :cond_5

    aget-object v1, p3, v2

    .line 642
    invoke-direct {p0, p1, p2, v1}, Lcom/google/dexmaker/stock/ProxyBuilder;->getMethodsToProxy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Class;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method private getMethodsToProxyRecursive()[Ljava/lang/reflect/Method;
    .locals 5

    .line 597
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 598
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 599
    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    :goto_0
    if-eqz v2, :cond_0

    .line 600
    invoke-direct {p0, v0, v1, v2}, Lcom/google/dexmaker/stock/ProxyBuilder;->getMethodsToProxy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Class;)V

    .line 599
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 602
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 603
    invoke-direct {p0, v0, v1, v3}, Lcom/google/dexmaker/stock/ProxyBuilder;->getMethodsToProxy(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Class;)V

    goto :goto_1

    .line 606
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    .line 608
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;

    add-int/lit8 v4, v2, 0x1

    .line 609
    invoke-static {v3}, Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;->access$000(Lcom/google/dexmaker/stock/ProxyBuilder$MethodSetEntry;)Ljava/lang/reflect/Method;

    move-result-object v3

    aput-object v3, v1, v2

    move v2, v4

    goto :goto_2

    :cond_2
    return-object v1
.end method

.method private static getUnboxMethodForPrimitive(Ljava/lang/Class;)Lcom/google/dexmaker/MethodId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/google/dexmaker/MethodId<",
            "**>;"
        }
    .end annotation

    .line 686
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->PRIMITIVE_TO_UNBOX_METHOD:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/MethodId;

    return-object p0
.end method

.method private static invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Code;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 0

    .line 509
    invoke-virtual {p1, p0, p4, p2, p3}, Lcom/google/dexmaker/Code;->invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public static isProxyClass(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    :try_start_0
    const-string v0, "$__handler"

    .line 343
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method private static launderCause(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/RuntimeException;
    .locals 1

    .line 276
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 278
    instance-of v0, p0, Ljava/lang/Error;

    if-nez v0, :cond_1

    .line 282
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    .line 283
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    .line 286
    :cond_0
    new-instance v0, Ljava/lang/reflect/UndeclaredThrowableException;

    invoke-direct {v0, p0}, Ljava/lang/reflect/UndeclaredThrowableException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 279
    :cond_1
    check-cast p0, Ljava/lang/Error;

    throw p0
.end method

.method private loadClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 272
    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method private static setHandlerInstanceField(Ljava/lang/Object;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    .line 291
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "$__handler"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 293
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 299
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catch_1
    move-exception p0

    .line 296
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method private static setMethodsStaticField(Ljava/lang/Class;[Ljava/lang/reflect/Method;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    :try_start_0
    const-string v0, "$__methodArray"

    .line 305
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v0, 0x1

    .line 306
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v0, 0x0

    .line 307
    invoke-virtual {p0, v0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 313
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catch_1
    move-exception p0

    .line 310
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method private static superMethodName(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 536
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 537
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "super$"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "$"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5f

    const/16 v2, 0x2e

    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x5b

    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x3b

    invoke-virtual {v0, v2, p0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public build()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->handler:Ljava/lang/reflect/InvocationHandler;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "handler == null"

    invoke-static {v0, v3}, Lcom/google/dexmaker/stock/ProxyBuilder;->check(ZLjava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgTypes:[Ljava/lang/Class;

    array-length v0, v0

    iget-object v3, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgValues:[Ljava/lang/Object;

    array-length v3, v3

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    const-string v0, "constructorArgValues.length != constructorArgTypes.length"

    invoke-static {v1, v0}, Lcom/google/dexmaker/stock/ProxyBuilder;->check(ZLjava/lang/String;)V

    .line 205
    invoke-virtual {p0}, Lcom/google/dexmaker/stock/ProxyBuilder;->buildProxyClass()Ljava/lang/Class;

    move-result-object v0

    .line 208
    :try_start_0
    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgTypes:[Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3

    .line 215
    :try_start_1
    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgValues:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 226
    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->handler:Ljava/lang/reflect/InvocationHandler;

    invoke-static {v0, v1}, Lcom/google/dexmaker/stock/ProxyBuilder;->setHandlerInstanceField(Ljava/lang/Object;Ljava/lang/reflect/InvocationHandler;)V

    return-object v0

    :catch_0
    move-exception v0

    .line 224
    invoke-static {v0}, Lcom/google/dexmaker/stock/ProxyBuilder;->launderCause(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 221
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catch_2
    move-exception v0

    .line 218
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    .line 210
    :catch_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No constructor for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with parameter types "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgTypes:[Ljava/lang/Class;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public buildProxyClass()Ljava/lang/Class;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 235
    sget-object v0, Lcom/google/dexmaker/stock/ProxyBuilder;->generatedProxyClasses:Ljava/util/Map;

    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->parentClassLoader:Ljava/lang/ClassLoader;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/stock/ProxyBuilder;->asSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 243
    :cond_0
    new-instance v0, Lcom/google/dexmaker/DexMaker;

    invoke-direct {v0}, Lcom/google/dexmaker/DexMaker;-><init>()V

    .line 244
    iget-object v1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/dexmaker/stock/ProxyBuilder;->getMethodNameForProxyOf(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    .line 245
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "L"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/String;)Lcom/google/dexmaker/TypeId;

    move-result-object v3

    .line 246
    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/dexmaker/TypeId;->get(Ljava/lang/Class;)Lcom/google/dexmaker/TypeId;

    move-result-object v6

    .line 247
    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-static {v0, v3, v6, v2}, Lcom/google/dexmaker/stock/ProxyBuilder;->generateConstructorsAndFields(Lcom/google/dexmaker/DexMaker;Lcom/google/dexmaker/TypeId;Lcom/google/dexmaker/TypeId;Ljava/lang/Class;)V

    .line 248
    invoke-direct {p0}, Lcom/google/dexmaker/stock/ProxyBuilder;->getMethodsToProxyRecursive()[Ljava/lang/reflect/Method;

    move-result-object v8

    .line 249
    invoke-static {v0, v3, v8, v6}, Lcom/google/dexmaker/stock/ProxyBuilder;->generateCodeForAllMethods(Lcom/google/dexmaker/DexMaker;Lcom/google/dexmaker/TypeId;[Ljava/lang/reflect/Method;Lcom/google/dexmaker/TypeId;)V

    .line 250
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".generated"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {p0}, Lcom/google/dexmaker/stock/ProxyBuilder;->getInterfacesAsTypeIds()[Lcom/google/dexmaker/TypeId;

    move-result-object v7

    move-object v2, v0

    invoke-virtual/range {v2 .. v7}, Lcom/google/dexmaker/DexMaker;->declare(Lcom/google/dexmaker/TypeId;Ljava/lang/String;ILcom/google/dexmaker/TypeId;[Lcom/google/dexmaker/TypeId;)V

    .line 252
    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->parentClassLoader:Ljava/lang/ClassLoader;

    iget-object v3, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->dexCache:Ljava/io/File;

    invoke-virtual {v0, v2, v3}, Lcom/google/dexmaker/DexMaker;->generateAndLoad(Ljava/lang/ClassLoader;Ljava/io/File;)Ljava/lang/ClassLoader;

    move-result-object v0

    .line 254
    :try_start_0
    invoke-direct {p0, v0, v1}, Lcom/google/dexmaker/stock/ProxyBuilder;->loadClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    invoke-static {v0, v8}, Lcom/google/dexmaker/stock/ProxyBuilder;->setMethodsStaticField(Ljava/lang/Class;[Ljava/lang/reflect/Method;)V

    .line 264
    sget-object v1, Lcom/google/dexmaker/stock/ProxyBuilder;->generatedProxyClasses:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :catch_0
    move-exception v0

    .line 261
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catch_1
    move-exception v0

    .line 257
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cannot proxy inaccessible class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->baseClass:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public varargs constructorArgTypes([Ljava/lang/Class;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 186
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgTypes:[Ljava/lang/Class;

    return-object p0
.end method

.method public varargs constructorArgValues([Ljava/lang/Object;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 181
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->constructorArgValues:[Ljava/lang/Object;

    return-object p0
.end method

.method public dexCache(Ljava/io/File;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 166
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->dexCache:Ljava/io/File;

    return-object p0
.end method

.method public handler(Ljava/lang/reflect/InvocationHandler;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/InvocationHandler;",
            ")",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 156
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->handler:Ljava/lang/reflect/InvocationHandler;

    return-object p0
.end method

.method public varargs implementing([Ljava/lang/Class;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 171
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 172
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 175
    iget-object v3, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->interfaces:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 173
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not an interface: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p0
.end method

.method public parentClassLoader(Ljava/lang/ClassLoader;)Lcom/google/dexmaker/stock/ProxyBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lcom/google/dexmaker/stock/ProxyBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 151
    iput-object p1, p0, Lcom/google/dexmaker/stock/ProxyBuilder;->parentClassLoader:Ljava/lang/ClassLoader;

    return-object p0
.end method
