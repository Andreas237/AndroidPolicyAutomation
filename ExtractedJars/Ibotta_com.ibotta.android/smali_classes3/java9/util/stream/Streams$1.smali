.class final Ljava9/util/stream/Streams$1;
.super Ljava/lang/Object;
.source "Streams.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljava9/util/stream/Streams;->composeWithExceptions(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$a:Ljava/lang/Runnable;

.field final synthetic val$b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    .line 839
    iput-object p1, p0, Ljava9/util/stream/Streams$1;->val$a:Ljava/lang/Runnable;

    iput-object p2, p0, Ljava9/util/stream/Streams$1;->val$b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 843
    :try_start_0
    iget-object v0, p0, Ljava9/util/stream/Streams$1;->val$a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 859
    iget-object v0, p0, Ljava9/util/stream/Streams$1;->val$b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :catch_0
    move-exception v0

    .line 847
    :try_start_1
    iget-object v1, p0, Ljava9/util/stream/Streams$1;->val$b:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    .line 851
    :catch_1
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-nez v1, :cond_1

    .line 853
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_0

    .line 854
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 856
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 852
    :cond_1
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0
.end method
