.class final Lio/sentry/jvmti/FrameCache$1;
.super Ljava/lang/ThreadLocal;
.source "FrameCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/jvmti/FrameCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

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


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lio/sentry/jvmti/FrameCache$1;->initialValue()Ljava/util/WeakHashMap;

    move-result-object v0

    return-object v0
.end method

.method protected initialValue()Ljava/util/WeakHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Throwable;",
            "[",
            "Lio/sentry/jvmti/Frame;",
            ">;"
        }
    .end annotation

    .line 16
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    return-object v0
.end method
