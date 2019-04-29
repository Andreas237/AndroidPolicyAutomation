.class public Lcom/yandex/metrica/impl/ob/bz;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/ff;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 1

    .line 24
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/bz;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/ff;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/ff;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 29
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 30
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/bz;->a:Lcom/yandex/metrica/impl/ob/ff;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bz;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bz;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ff;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jv;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1486
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    goto :goto_0

    .line 2430
    :cond_0
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bz;->a:Lcom/yandex/metrica/impl/ob/ff;

    const-string v2, ""

    .line 45
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/ff;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->d(Lcom/yandex/metrica/impl/h;)V

    const/4 p1, 0x1

    .line 46
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->a(Z)V

    .line 47
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bz;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ff;->a()V

    .line 48
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/bz;->a:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ff;->e()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
