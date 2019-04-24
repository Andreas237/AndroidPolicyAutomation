.class Lo/cbd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbd;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/reflect/Method;

.field final synthetic b:[Ljava/lang/Object;

.field final synthetic c:Ljava/util/concurrent/CountDownLatch;

.field final synthetic d:[Ljava/lang/Object;

.field final synthetic e:Lo/cbd;


# direct methods
.method constructor <init>(Lo/cbd;[Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/cbd$4;->e:Lo/cbd;

    iput-object p2, p0, Lo/cbd$4;->d:[Ljava/lang/Object;

    iput-object p3, p0, Lo/cbd$4;->a:Ljava/lang/reflect/Method;

    iput-object p4, p0, Lo/cbd$4;->b:[Ljava/lang/Object;

    iput-object p5, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 66
    :try_start_0
    iget-object v0, p0, Lo/cbd$4;->d:[Ljava/lang/Object;

    iget-object v1, p0, Lo/cbd$4;->a:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lo/cbd$4;->e:Lo/cbd;

    invoke-static {v2}, Lo/cbd;->e(Lo/cbd;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lo/cbd$4;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    goto :goto_0

    .line 67
    :catch_0
    move-exception v4

    .line 68
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    goto :goto_0

    .line 70
    :catch_1
    move-exception v4

    .line 71
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lo/cbd$4;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    throw v5

    .line 76
    :goto_0
    return-void
.end method
