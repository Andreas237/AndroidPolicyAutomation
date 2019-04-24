.class Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->executeBlocking(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

.field final synthetic d:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;Ljava/lang/Runnable;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;->b:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    iput-object p2, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;->d:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 48
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;->b:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->access$000(Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 51
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v1

    iget-object v0, p0, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor$3;->b:Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;->access$000(Lorg/jivesoftware/smack/util/BoundedThreadPoolExecutor;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 51
    throw v1

    .line 52
    :goto_0
    return-void
.end method
