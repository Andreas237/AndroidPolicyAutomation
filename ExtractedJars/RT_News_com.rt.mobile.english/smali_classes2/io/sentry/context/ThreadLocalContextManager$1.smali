.class Lio/sentry/context/ThreadLocalContextManager$1;
.super Ljava/lang/ThreadLocal;
.source "ThreadLocalContextManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/context/ThreadLocalContextManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lio/sentry/context/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/sentry/context/ThreadLocalContextManager;


# direct methods
.method constructor <init>(Lio/sentry/context/ThreadLocalContextManager;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lio/sentry/context/ThreadLocalContextManager$1;->this$0:Lio/sentry/context/ThreadLocalContextManager;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected initialValue()Lio/sentry/context/Context;
    .locals 1

    .line 10
    new-instance v0, Lio/sentry/context/Context;

    invoke-direct {v0}, Lio/sentry/context/Context;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lio/sentry/context/ThreadLocalContextManager$1;->initialValue()Lio/sentry/context/Context;

    move-result-object v0

    return-object v0
.end method
