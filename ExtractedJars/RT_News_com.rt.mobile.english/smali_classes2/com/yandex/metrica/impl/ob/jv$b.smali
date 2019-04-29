.class public Lcom/yandex/metrica/impl/ob/jv$b;
.super Lcom/yandex/metrica/impl/ob/jt$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/jt$a<",
        "Lcom/yandex/metrica/impl/ob/jv;",
        "Lcom/yandex/metrica/impl/ob/jv$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lcom/yandex/metrica/impl/ob/ab;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 439
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/jt$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 440
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv$b;->c:Lcom/yandex/metrica/impl/ob/ab;

    return-void
.end method


# virtual methods
.method protected synthetic a()Lcom/yandex/metrica/impl/ob/jq;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 434
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jv$b;->c()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 434
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jv$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jv;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 434
    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jv$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jv;

    move-result-object p1

    return-object p1
.end method

.method a(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jv;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 500
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/jv$b;->b(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 501
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/jv$b;->c(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 502
    iget-object p2, p2, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jv;->i(Ljava/lang/String;)V

    return-void
.end method

.method b(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0

    .line 506
    iget-object p2, p2, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jv;->a(Ljava/util/List;)V

    return-void
.end method

.method public synthetic c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 434
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jv$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jv;

    move-result-object p1

    return-object p1
.end method

.method protected c()Lcom/yandex/metrica/impl/ob/jv;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 446
    new-instance v0, Lcom/yandex/metrica/impl/ob/jv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;-><init>(B)V

    return-object v0
.end method

.method c(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1

    .line 510
    iget-object v0, p2, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jv;->a(Z)V

    .line 511
    iget-object v0, p2, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jv;->b(Z)V

    .line 512
    iget-object v0, p2, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jv;->c(Z)V

    .line 513
    iget-object p2, p2, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean p2, p2, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jv;->d(Z)V

    return-void
.end method

.method public d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jv;
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "Lcom/yandex/metrica/impl/ob/jv$a;",
            ">;)",
            "Lcom/yandex/metrica/impl/ob/jv;"
        }
    .end annotation

    .line 451
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/jt$a;->c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jv;

    .line 454
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->a(Lcom/yandex/metrica/impl/ob/jv;Ljava/lang/String;)V

    .line 455
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$b;->c:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->F()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->a(Lcom/yandex/metrica/impl/ob/jv;Z)V

    .line 456
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$b;->c:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->u()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->d(I)V

    .line 458
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->e(Z)V

    .line 462
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->a(Landroid/location/Location;)V

    .line 463
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->f(Z)V

    .line 467
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->g(Z)V

    .line 471
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    const/16 v3, 0xa

    .line 473
    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result v1

    .line 472
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 471
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->a(I)V

    .line 479
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    const/4 v3, 0x7

    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->c(I)V

    .line 483
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    const/16 v3, 0x5a

    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Integer;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->b(I)V

    .line 487
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Boolean;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->h(Z)V

    .line 491
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jv$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jv$a;->m:Lcom/yandex/metrica/CounterConfiguration$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jv;->a(Lcom/yandex/metrica/CounterConfiguration$a;)V

    .line 493
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/jv$b;->a(Lcom/yandex/metrica/impl/ob/jv;Lcom/yandex/metrica/impl/ob/ks;)V

    return-object v0
.end method
