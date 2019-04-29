.class public abstract Lio/streamroot/dna/core/context/bean/BeanStore;
.super Ljava/lang/Object;
.source "BeanStore.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBeanStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeanStore.kt\nio/streamroot/dna/core/context/bean/BeanStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n1#1,112:1\n241#2,2:113\n241#2,2:115\n1561#2,2:117\n241#2,2:121\n27#3,2:119\n*E\n*S KotlinDebug\n*F\n+ 1 BeanStore.kt\nio/streamroot/dna/core/context/bean/BeanStore\n*L\n35#1,2:113\n41#1,2:115\n69#1,2:117\n79#1,2:121\n79#1,2:119\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\u0017H\u0016J\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0019\u0010\u001a\u001a\u0002H\u001b\"\u0004\u0008\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\u0002H\u001b\"\u0004\u0008\u0000\u0010\u001b2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u0002H\u001b0!\u00a2\u0006\u0002\u0010\"J\u0019\u0010\u001f\u001a\u0002H\u001b\"\u0004\u0008\u0000\u0010\u001b2\u0006\u0010#\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ \u0010$\u001a\u0008\u0012\u0004\u0012\u0002H\u001b0%\"\u0004\u0008\u0000\u0010\u001b2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u0002H\u001b0!J!\u0010&\u001a\u0004\u0018\u0001H\u001b\"\u0004\u0008\u0000\u0010\u001b2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u0002H\u001b0!\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020(H\u0002J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020(J\u0016\u0010*\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020(R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0008j\u0008\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00050\u00050\u0012X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006-"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/bean/BeanStore;",
        "Ljava/lang/AutoCloseable;",
        "sessionInformation",
        "Lio/streamroot/dna/core/context/config/SessionInformation;",
        "context",
        "Landroid/content/Context;",
        "(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;)V",
        "beans",
        "Ljava/util/ArrayList;",
        "Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;",
        "Lkotlin/collections/ArrayList;",
        "getSessionInformation",
        "()Lio/streamroot/dna/core/context/config/SessionInformation;",
        "stateManager",
        "Lio/streamroot/dna/core/context/state/StateManager;",
        "getStateManager",
        "()Lio/streamroot/dna/core/context/state/StateManager;",
        "weakContext",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "getWeakContext",
        "()Ljava/lang/ref/WeakReference;",
        "close",
        "",
        "disableDna",
        "getAndroidContext",
        "getAndroidService",
        "T",
        "serviceName",
        "",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "getBean",
        "clazz",
        "Ljava/lang/Class;",
        "(Ljava/lang/Class;)Ljava/lang/Object;",
        "name",
        "getBeans",
        "",
        "getOptionalBean",
        "bean",
        "",
        "recycleBean",
        "registerBean",
        "newBean",
        "BeanDefinition",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final beans:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stateManager:Lio/streamroot/dna/core/context/state/StateManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final weakContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/context/config/SessionInformation;Landroid/content/Context;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/config/SessionInformation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionInformation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    .line 16
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->weakContext:Ljava/lang/ref/WeakReference;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    .line 19
    new-instance p1, Lio/streamroot/dna/core/context/state/StateManager;

    new-instance p2, Lio/streamroot/dna/core/context/bean/BeanStore$stateManager$1;

    move-object v0, p0

    check-cast v0, Lio/streamroot/dna/core/context/bean/BeanStore;

    invoke-direct {p2, v0}, Lio/streamroot/dna/core/context/bean/BeanStore$stateManager$1;-><init>(Lio/streamroot/dna/core/context/bean/BeanStore;)V

    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, p2}, Lio/streamroot/dna/core/context/state/StateManager;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    return-void
.end method

.method private final name(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bean::class.java.simpleName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->decapitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final recycleBean(Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x0

    .line 91
    :try_start_0
    instance-of v1, p1, Landroid/content/BroadcastReceiver;

    if-eqz v1, :cond_0

    .line 92
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, p1

    check-cast v2, Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :cond_0
    :try_start_1
    instance-of v1, p1, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_1

    .line 99
    move-object v1, p1

    check-cast v1, Ljava/lang/AutoCloseable;

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 102
    sget-object v2, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    const-string v4, "[DNA] Error when closing bean "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, p1, v0}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 95
    :try_start_2
    sget-object v2, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[DNA] Error when unregister broadcast receiver "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3, v4}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    :try_start_3
    instance-of v1, p1, Ljava/lang/AutoCloseable;

    if-eqz v1, :cond_1

    .line 99
    move-object v1, p1

    check-cast v1, Ljava/lang/AutoCloseable;

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v1

    .line 102
    sget-object v2, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    .line 98
    :goto_2
    :try_start_4
    instance-of v2, p1, Ljava/lang/AutoCloseable;

    if-eqz v2, :cond_2

    .line 99
    move-object v2, p1

    check-cast v2, Ljava/lang/AutoCloseable;

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    move-exception v2

    .line 102
    sget-object v3, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[DNA] Error when closing bean "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v3, v2, p1, v0}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_2
    :goto_3
    throw v1
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    .line 68
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    invoke-virtual {v0}, Lio/streamroot/dna/core/context/state/StateManager;->close()V

    .line 69
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 117
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    .line 69
    invoke-virtual {v1}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->recycleBean(Ljava/lang/Object;)V

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 71
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->weakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 67
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized disableDna()V
    .locals 5

    monitor-enter p0

    .line 76
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "beans.iterator()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 78
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/KAnnotatedElement;

    .line 120
    invoke-interface {v2}, Lkotlin/reflect/KAnnotatedElement;->getAnnotations()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 121
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/annotation/Annotation;

    .line 120
    instance-of v4, v4, Lio/streamroot/dna/core/context/bean/DnaBean;

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 122
    :goto_1
    check-cast v3, Lio/streamroot/dna/core/context/bean/DnaBean;

    if-eqz v3, :cond_0

    .line 81
    invoke-direct {p0, v1}, Lio/streamroot/dna/core/context/bean/BeanStore;->recycleBean(Ljava/lang/Object;)V

    .line 82
    invoke-interface {v3}, Lio/streamroot/dna/core/context/bean/DnaBean;->disposable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 87
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 75
    monitor-exit p0

    throw v0
.end method

.method public final getAndroidContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 21
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->weakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method public final getAndroidService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "serviceName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->weakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->getOptionalBean(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 30
    :cond_0
    new-instance v0, Lio/streamroot/dna/core/context/BeanNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Bean found for type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/streamroot/dna/core/context/BeanNotFoundException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final getBean(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 113
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    .line 35
    invoke-virtual {v3}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 114
    :goto_0
    check-cast v1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    return-object v2

    .line 36
    :cond_3
    new-instance v0, Lio/streamroot/dna/core/context/BeanNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Bean found for name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/streamroot/dna/core/context/BeanNotFoundException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final getBeans(Ljava/lang/Class;)Ljava/util/List;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 46
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 47
    new-instance v1, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$1;

    invoke-direct {v1, p1}, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$1;-><init>(Ljava/lang/Class;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 48
    new-instance v1, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;

    invoke-direct {v1, p1}, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;-><init>(Ljava/lang/Class;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getOptionalBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    .line 41
    invoke-virtual {v3}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 116
    :goto_0
    check-cast v1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object v2

    :cond_2
    return-object v2
.end method

.method public final getSessionInformation()Lio/streamroot/dna/core/context/config/SessionInformation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->sessionInformation:Lio/streamroot/dna/core/context/config/SessionInformation;

    return-object v0
.end method

.method public final getStateManager()Lio/streamroot/dna/core/context/state/StateManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->stateManager:Lio/streamroot/dna/core/context/state/StateManager;

    return-object v0
.end method

.method protected final getWeakContext()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->weakContext:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final declared-synchronized registerBean(Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "newBean"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->name(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore;->registerBean(Ljava/lang/String;Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized registerBean(Ljava/lang/String;Ljava/lang/Object;)Lio/streamroot/dna/core/context/bean/BeanStore;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newBean"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore;->beans:Ljava/util/ArrayList;

    new-instance v1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    invoke-direct {v1, p1, p2}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    instance-of p1, p2, Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p0}, Lio/streamroot/dna/core/context/bean/BeanStore;->getAndroidContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p2

    check-cast v0, Landroid/content/BroadcastReceiver;

    check-cast p2, Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;

    invoke-virtual {p2}, Lio/streamroot/dna/core/context/bean/BroadcastReceiverBean;->intentFilter()Landroid/content/IntentFilter;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    .line 56
    monitor-exit p0

    throw p1
.end method
