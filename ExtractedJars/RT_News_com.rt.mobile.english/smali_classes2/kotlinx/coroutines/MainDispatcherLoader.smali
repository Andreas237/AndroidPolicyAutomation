.class final Lkotlinx/coroutines/MainDispatcherLoader;
.super Ljava/lang/Object;
.source "Dispatchers.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatchers.kt\nkotlinx/coroutines/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1630#2,13:134\n*E\n*S KotlinDebug\n*F\n+ 1 Dispatchers.kt\nkotlinx/coroutines/MainDispatcherLoader\n*L\n97#1,13:134\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlinx/coroutines/MainDispatcherLoader;",
        "",
        "()V",
        "dispatcher",
        "Lkotlinx/coroutines/MainCoroutineDispatcher;",
        "tryCreateDispatcher",
        "Lkotlinx/coroutines/internal/MainDispatcherFactory;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/MainDispatcherLoader;

.field public static final dispatcher:Lkotlinx/coroutines/MainCoroutineDispatcher;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 92
    new-instance v0, Lkotlinx/coroutines/MainDispatcherLoader;

    invoke-direct {v0}, Lkotlinx/coroutines/MainDispatcherLoader;-><init>()V

    sput-object v0, Lkotlinx/coroutines/MainDispatcherLoader;->INSTANCE:Lkotlinx/coroutines/MainDispatcherLoader;

    .line 95
    const-class v1, Lkotlinx/coroutines/internal/MainDispatcherFactory;

    .line 96
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v1

    const-string v2, "ServiceLoader.load(clz, clz.classLoader)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/Iterable;

    .line 134
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_1

    .line 136
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 137
    move-object v4, v2

    check-cast v4, Lkotlinx/coroutines/internal/MainDispatcherFactory;

    .line 97
    invoke-interface {v4}, Lkotlinx/coroutines/internal/MainDispatcherFactory;->getLoadPriority()I

    move-result v4

    .line 138
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 140
    move-object v6, v5

    check-cast v6, Lkotlinx/coroutines/internal/MainDispatcherFactory;

    .line 97
    invoke-interface {v6}, Lkotlinx/coroutines/internal/MainDispatcherFactory;->getLoadPriority()I

    move-result v6

    if-ge v4, v6, :cond_1

    move-object v2, v5

    move v4, v6

    goto :goto_0

    .line 146
    :cond_2
    :goto_1
    check-cast v2, Lkotlinx/coroutines/internal/MainDispatcherFactory;

    if-eqz v2, :cond_3

    .line 97
    invoke-direct {v0, v2}, Lkotlinx/coroutines/MainDispatcherLoader;->tryCreateDispatcher(Lkotlinx/coroutines/internal/MainDispatcherFactory;)Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance v0, Lkotlinx/coroutines/MissingMainCoroutineDispatcher;

    invoke-direct {v0, v3}, Lkotlinx/coroutines/MissingMainCoroutineDispatcher;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lkotlinx/coroutines/MainCoroutineDispatcher;

    :goto_2
    sput-object v0, Lkotlinx/coroutines/MainDispatcherLoader;->dispatcher:Lkotlinx/coroutines/MainCoroutineDispatcher;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final tryCreateDispatcher(Lkotlinx/coroutines/internal/MainDispatcherFactory;)Lkotlinx/coroutines/MainCoroutineDispatcher;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/MainDispatcherFactory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 106
    :try_start_0
    invoke-interface {p1}, Lkotlinx/coroutines/internal/MainDispatcherFactory;->createDispatcher()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 108
    new-instance v0, Lkotlinx/coroutines/MissingMainCoroutineDispatcher;

    invoke-direct {v0, p1}, Lkotlinx/coroutines/MissingMainCoroutineDispatcher;-><init>(Ljava/lang/Throwable;)V

    move-object p1, v0

    check-cast p1, Lkotlinx/coroutines/MainCoroutineDispatcher;

    :goto_0
    return-object p1
.end method
