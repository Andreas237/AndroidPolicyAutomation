.class public Lcom/yandex/metrica/impl/ob/dw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dw$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 71
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    const-string v1, "YMM-CSE"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/dw;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ef;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/yandex/metrica/impl/ob/dw$a;

    invoke-direct {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/dw$a;-><init>(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ef;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ee;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 90
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/yandex/metrica/impl/ob/dw$a;

    invoke-direct {v1, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/dw$a;-><init>(Lcom/yandex/metrica/impl/ob/ef;Landroid/os/Bundle;Lcom/yandex/metrica/impl/ob/ee;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
