.class public Lcom/yandex/metrica/impl/ob/dz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/dz$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/el;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/ed;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/ma;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/ed;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ed;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/ob/el;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/el;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-direct {p0, p2, v0, p3, p1}, Lcom/yandex/metrica/impl/ob/dz;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/el;Lcom/yandex/metrica/impl/ob/ed;Lcom/yandex/metrica/impl/ob/ma;)V

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/yandex/metrica/impl/ob/el;Lcom/yandex/metrica/impl/ob/ed;Lcom/yandex/metrica/impl/ob/ma;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/el;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ed;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ma;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dz;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 100
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dz;->b:Lcom/yandex/metrica/impl/ob/el;

    .line 101
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dz;->c:Lcom/yandex/metrica/impl/ob/ed;

    .line 102
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/dz;->d:Lcom/yandex/metrica/impl/ob/ma;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dz;->c:Lcom/yandex/metrica/impl/ob/ed;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ed;->a()V

    return-void
.end method

.method public a(J)V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dz;->c:Lcom/yandex/metrica/impl/ob/ed;

    invoke-interface {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ed;->a(J)V

    .line 1090
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/dz;->b:Lcom/yandex/metrica/impl/ob/el;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/dz;->d:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {p2}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/el;->a(J)Lcom/yandex/metrica/impl/ob/el;

    return-void
.end method

.method public a(JLcom/yandex/metrica/impl/ob/dz$a;)V
    .locals 2
    .param p3    # Lcom/yandex/metrica/impl/ob/dz$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dz;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/yandex/metrica/impl/ob/dz$1;

    invoke-direct {v1, p3}, Lcom/yandex/metrica/impl/ob/dz$1;-><init>(Lcom/yandex/metrica/impl/ob/dz$a;)V

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, p3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public b()Z
    .locals 6

    .line 82
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dz;->d:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v0

    .line 2086
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dz;->b:Lcom/yandex/metrica/impl/ob/el;

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/el;->b(J)J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 82
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dz;->d:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->b()J

    move-result-wide v0

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
