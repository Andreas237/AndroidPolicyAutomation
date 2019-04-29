.class public Lcom/yandex/metrica/impl/ob/ah;
.super Lcom/yandex/metrica/impl/ob/ab;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ah$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/ab<",
        "Lcom/yandex/metrica/impl/ob/au;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/jm;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ah$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;Lcom/yandex/metrica/impl/ob/jm;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/kk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/v;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/yandex/metrica/impl/ob/jm;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 38
    invoke-direct/range {p0 .. p5}, Lcom/yandex/metrica/impl/ob/ab;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;)V

    .line 39
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/ah;->a:Lcom/yandex/metrica/impl/ob/jm;

    .line 40
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ah;->g()Lcom/yandex/metrica/impl/ob/bc;

    move-result-object p1

    .line 41
    sget-object p2, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    new-instance p3, Lcom/yandex/metrica/impl/ob/cq;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/bc;->a()Lcom/yandex/metrica/impl/ob/cs;

    move-result-object p4

    invoke-direct {p3, p4}, Lcom/yandex/metrica/impl/ob/cq;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, p2, p3}, Lcom/yandex/metrica/impl/ob/bc;->a(Lcom/yandex/metrica/impl/q$a;Lcom/yandex/metrica/impl/ob/cl;)V

    .line 42
    new-instance p1, Lcom/yandex/metrica/impl/ob/ah$a;

    invoke-direct {p1, p0}, Lcom/yandex/metrica/impl/ob/ah$a;-><init>(Lcom/yandex/metrica/impl/ob/ah;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ah;->b:Lcom/yandex/metrica/impl/ob/ah$a;

    .line 43
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ah;->a:Lcom/yandex/metrica/impl/ob/jm;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ah;->b:Lcom/yandex/metrica/impl/ob/ah$a;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jm;->a(Lcom/yandex/metrica/impl/ob/jm$a;)V

    return-void
.end method


# virtual methods
.method declared-synchronized i()V
    .locals 2

    monitor-enter p0

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ah;->a:Lcom/yandex/metrica/impl/ob/jm;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ah;->b:Lcom/yandex/metrica/impl/ob/ah$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jm;->b(Lcom/yandex/metrica/impl/ob/jm$a;)V

    .line 49
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ab;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 47
    monitor-exit p0

    throw v0
.end method
