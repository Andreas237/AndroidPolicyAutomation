.class public Lcom/yandex/metrica/impl/ob/au;
.super Lcom/yandex/metrica/impl/ob/aw;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/gy;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/lh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object v0

    .line 36
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lh;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;

    move-result-object v1

    .line 32
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/yandex/metrica/impl/ob/au;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/gy;Lcom/yandex/metrica/impl/ob/lh;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/gy;Lcom/yandex/metrica/impl/ob/lh;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gy;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/lh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/aw;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ab;)V

    .line 46
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/au;->a:Lcom/yandex/metrica/impl/ob/gy;

    .line 47
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/au;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/gy;->a(Ljava/lang/Object;)V

    .line 48
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/au;->b:Lcom/yandex/metrica/impl/ob/lh;

    .line 49
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/au;->b:Lcom/yandex/metrica/impl/ob/lh;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/lh;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 67
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/aw;->a()V

    .line 68
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/au;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gy;->b(Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/au;->b:Lcom/yandex/metrica/impl/ob/lh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lh;->b()V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 54
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/CounterConfiguration;->g()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    .line 53
    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/au;->a(Z)V

    .line 56
    invoke-super {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/aw;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V

    return-void
.end method

.method a(Z)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/au;->a:Lcom/yandex/metrica/impl/ob/gy;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gy;->a(Z)V

    return-void
.end method
