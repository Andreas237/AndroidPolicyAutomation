.class public final Lio/sentry/jvmti/FrameCache;
.super Ljava/lang/Object;
.source "FrameCache.java"


# static fields
.field private static appPackages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static cache:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Throwable;",
            "[",
            "Lio/sentry/jvmti/Frame;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lio/sentry/jvmti/FrameCache;->appPackages:Ljava/util/Set;

    .line 12
    new-instance v0, Lio/sentry/jvmti/FrameCache$1;

    invoke-direct {v0}, Lio/sentry/jvmti/FrameCache$1;-><init>()V

    sput-object v0, Lio/sentry/jvmti/FrameCache;->cache:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add(Ljava/lang/Throwable;[Lio/sentry/jvmti/Frame;)V
    .locals 1

    .line 34
    sget-object v0, Lio/sentry/jvmti/FrameCache;->cache:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 35
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static addAppPackage(Ljava/lang/String;)V
    .locals 1

    .line 97
    sget-object v0, Lio/sentry/jvmti/FrameCache;->appPackages:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static get(Ljava/lang/Throwable;)[Lio/sentry/jvmti/Frame;
    .locals 1

    .line 45
    sget-object v0, Lio/sentry/jvmti/FrameCache;->cache:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 46
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lio/sentry/jvmti/Frame;

    return-object p0
.end method

.method public static shouldCacheThrowable(Ljava/lang/Throwable;I)Z
    .locals 6

    .line 60
    sget-object v0, Lio/sentry/jvmti/FrameCache;->appPackages:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 68
    :cond_0
    sget-object v0, Lio/sentry/jvmti/FrameCache;->cache:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 69
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/jvmti/Frame;

    if-eqz v0, :cond_1

    .line 70
    array-length v0, v0

    if-gt p1, v0, :cond_1

    return v1

    .line 75
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length p1, p0

    move v0, v1

    :goto_0
    if-ge v0, p1, :cond_4

    aget-object v2, p0, v0

    .line 76
    sget-object v3, Lio/sentry/jvmti/FrameCache;->appPackages:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 77
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return v1
.end method
