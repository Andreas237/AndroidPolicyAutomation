.class public Lcom/shopkick/app/util/ExecutorServiceUtils;
.super Ljava/lang/Object;
.source "ExecutorServiceUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static submitCallable(Ljava/util/concurrent/Callable;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    .locals 0

    .line 15
    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method
