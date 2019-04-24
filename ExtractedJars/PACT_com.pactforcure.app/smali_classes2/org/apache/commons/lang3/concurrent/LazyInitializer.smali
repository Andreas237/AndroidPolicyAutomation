.class public abstract Lorg/apache/commons/lang3/concurrent/LazyInitializer;
.super Ljava/lang/Object;
.source "LazyInitializer.java"

# interfaces
.implements Lorg/apache/commons/lang3/concurrent/ConcurrentInitializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/apache/commons/lang3/concurrent/ConcurrentInitializer",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private volatile object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 79
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/LazyInitializer;, "Lorg/apache/commons/lang3/concurrent/LazyInitializer<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/lang3/concurrent/ConcurrentException;
        }
    .end annotation

    .prologue
    .line 94
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/LazyInitializer;, "Lorg/apache/commons/lang3/concurrent/LazyInitializer<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/LazyInitializer;->object:Ljava/lang/Object;

    .line 96
    .local v0, "result":Ljava/lang/Object;, "TT;"
    if-nez v0, :cond_1

    .line 97
    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/LazyInitializer;->object:Ljava/lang/Object;

    .line 99
    if-nez v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/LazyInitializer;->initialize()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/LazyInitializer;->object:Ljava/lang/Object;

    .line 102
    :cond_0
    monitor-exit p0

    .line 105
    :cond_1
    return-object v0

    .line 102
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected abstract initialize()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/lang3/concurrent/ConcurrentException;
        }
    .end annotation
.end method
