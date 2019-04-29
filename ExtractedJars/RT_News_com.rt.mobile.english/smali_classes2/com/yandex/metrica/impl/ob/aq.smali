.class public Lcom/yandex/metrica/impl/ob/aq;
.super Lcom/yandex/metrica/impl/ob/al;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/kp;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/al<",
        "Lcom/yandex/metrica/impl/ob/x;",
        ">;",
        "Lcom/yandex/metrica/impl/ob/kp;"
    }
.end annotation


# instance fields
.field private volatile a:Landroid/os/ResultReceiver;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/x;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/x;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/al;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ae;)V

    .line 36
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/CounterConfiguration;->a()Landroid/os/ResultReceiver;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/aq;->a:Landroid/os/ResultReceiver;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/t;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/CounterConfiguration;->a()Landroid/os/ResultReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/aq;->a:Landroid/os/ResultReceiver;

    .line 41
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aq;->b()Lcom/yandex/metrica/impl/ob/ae;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/x;

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/x;->a(Lcom/yandex/metrica/impl/ob/t;)V

    .line 42
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/aq;->b()Lcom/yandex/metrica/impl/ob/ae;

    move-result-object p2

    check-cast p2, Lcom/yandex/metrica/impl/ob/x;

    invoke-virtual {p2, p1, p0}, Lcom/yandex/metrica/impl/ob/x;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/aq;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/km;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/km;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aq;->a:Landroid/os/ResultReceiver;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/j;->a(Landroid/os/ResultReceiver;Lcom/yandex/metrica/impl/ob/km;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aq;->a:Landroid/os/ResultReceiver;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/j;->a(Landroid/os/ResultReceiver;Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method
