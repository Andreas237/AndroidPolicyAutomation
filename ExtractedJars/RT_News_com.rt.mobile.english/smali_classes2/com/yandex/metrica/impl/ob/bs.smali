.class public Lcom/yandex/metrica/impl/ob/bs;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/ff;

.field private b:Lcom/yandex/metrica/impl/ob/lx;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 2

    .line 27
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v0

    invoke-static {}, Lcom/yandex/metrica/impl/ob/lx;->a()Lcom/yandex/metrica/impl/ob/lx;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/bs;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/ff;Lcom/yandex/metrica/impl/ob/lx;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/ff;Lcom/yandex/metrica/impl/ob/lx;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 33
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 34
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    .line 35
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/bs;->b:Lcom/yandex/metrica/impl/ob/lx;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bs;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    .line 45
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ff;->d()Z

    move-result v2

    if-nez v2, :cond_2

    .line 48
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ff;->c()Z

    move-result v2

    if-nez v2, :cond_1

    .line 49
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->L()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 50
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bs;->b:Lcom/yandex/metrica/impl/ob/lx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/lx;->a(Landroid/content/Context;)V

    .line 51
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bs;->b:Lcom/yandex/metrica/impl/ob/lx;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/lx;->c()V

    .line 55
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->b()Ljava/lang/String;

    move-result-object v2

    .line 56
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v3, v2}, Lcom/yandex/metrica/impl/ob/ff;->c(Ljava/lang/String;)V

    .line 1482
    sget-object v3, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v3}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 58
    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 57
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->c(Lcom/yandex/metrica/impl/h;)V

    const/4 p1, 0x1

    .line 60
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->a(Z)V

    .line 61
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    .line 62
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->M()Z

    move-result v0

    .line 61
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/ff;->a(Z)V

    .line 63
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bs;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->H()Lcom/yandex/metrica/impl/ob/da;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/da;->a()V

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bs;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ff;->b()V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
