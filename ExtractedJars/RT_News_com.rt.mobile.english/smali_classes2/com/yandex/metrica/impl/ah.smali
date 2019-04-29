.class public Lcom/yandex/metrica/impl/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ag;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ah$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/Executor;

.field private b:Lcom/yandex/metrica/impl/ag;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ag;)V
    .locals 1

    .line 41
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ah;-><init>(Ljava/util/concurrent/Executor;Lcom/yandex/metrica/impl/ag;)V

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/yandex/metrica/impl/ag;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    .line 140
    iput-object p2, p0, Lcom/yandex/metrica/impl/ah;->b:Lcom/yandex/metrica/impl/ag;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ah;)Lcom/yandex/metrica/impl/ag;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/yandex/metrica/impl/ah;->b:Lcom/yandex/metrica/impl/ag;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$1;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ah$1;-><init>(Lcom/yandex/metrica/impl/ah;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$4;

    invoke-direct {v1, p0, p1}, Lcom/yandex/metrica/impl/ah$4;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/content/Intent;I)V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/yandex/metrica/impl/ah$2;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/content/Intent;II)V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$3;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/yandex/metrica/impl/ah$3;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;II)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$8;

    invoke-direct {v1, p0, p1}, Lcom/yandex/metrica/impl/ah$8;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v7, Lcom/yandex/metrica/impl/ah$7;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ah$7;-><init>(Lcom/yandex/metrica/impl/ah;Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->b:Lcom/yandex/metrica/impl/ag;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ag;->b()V

    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$5;

    invoke-direct {v1, p0, p1}, Lcom/yandex/metrica/impl/ah$5;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Landroid/content/Intent;)V
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/yandex/metrica/impl/ah;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/yandex/metrica/impl/ah$6;

    invoke-direct {v1, p0, p1}, Lcom/yandex/metrica/impl/ah$6;-><init>(Lcom/yandex/metrica/impl/ah;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
