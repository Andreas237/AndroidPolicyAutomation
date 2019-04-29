.class public Lio/sentry/context/ThreadLocalContextManager;
.super Ljava/lang/Object;
.source "ThreadLocalContextManager.java"

# interfaces
.implements Lio/sentry/context/ContextManager;


# instance fields
.field private final context:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lio/sentry/context/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lio/sentry/context/ThreadLocalContextManager$1;

    invoke-direct {v0, p0}, Lio/sentry/context/ThreadLocalContextManager$1;-><init>(Lio/sentry/context/ThreadLocalContextManager;)V

    iput-object v0, p0, Lio/sentry/context/ThreadLocalContextManager;->context:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 26
    iget-object v0, p0, Lio/sentry/context/ThreadLocalContextManager;->context:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    return-void
.end method

.method public getContext()Lio/sentry/context/Context;
    .locals 1

    .line 21
    iget-object v0, p0, Lio/sentry/context/ThreadLocalContextManager;->context:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/context/Context;

    return-object v0
.end method
