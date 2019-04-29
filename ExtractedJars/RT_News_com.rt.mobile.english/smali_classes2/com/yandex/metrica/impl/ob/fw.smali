.class public Lcom/yandex/metrica/impl/ob/fw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/kh;",
        "Lcom/yandex/metrica/impl/ob/jj$a$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 16
    check-cast p1, Lcom/yandex/metrica/impl/ob/kh;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fw;->a(Lcom/yandex/metrica/impl/ob/kh;)Lcom/yandex/metrica/impl/ob/jj$a$b;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/kh;)Lcom/yandex/metrica/impl/ob/jj$a$b;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/kh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 22
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$b;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$b;-><init>()V

    .line 23
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->g:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->h:Z

    .line 24
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->e:Z

    .line 25
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->d:Z

    .line 26
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->c:Z

    .line 27
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->b:Z

    .line 28
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->e:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->f:Z

    .line 29
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->g:Z

    .line 30
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->l:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->l:Z

    .line 31
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->j:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->k:Z

    .line 32
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->n:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->n:Z

    .line 33
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->m:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->m:Z

    .line 34
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/kh;->h:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->i:Z

    .line 35
    iget-boolean p1, p1, Lcom/yandex/metrica/impl/ob/kh;->i:Z

    iput-boolean p1, v0, Lcom/yandex/metrica/impl/ob/jj$a$b;->j:Z

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jj$a$b;)Lcom/yandex/metrica/impl/ob/kh;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kh$a;-><init>()V

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->b:Z

    .line 43
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->a(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->n:Z

    .line 44
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->m(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->m:Z

    .line 45
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->l(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->l:Z

    .line 46
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->k(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->k:Z

    .line 47
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->j(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->j:Z

    .line 48
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->i(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->i:Z

    .line 49
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->h(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->g:Z

    .line 50
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->f(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->f:Z

    .line 51
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->e(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->e:Z

    .line 52
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->d(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->d:Z

    .line 53
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->c(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->c:Z

    .line 54
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kh$a;->b(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object v0

    iget-boolean p1, p1, Lcom/yandex/metrica/impl/ob/jj$a$b;->h:Z

    .line 55
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->g(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->a()Lcom/yandex/metrica/impl/ob/kh;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/e;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 16
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a$b;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fw;->a(Lcom/yandex/metrica/impl/ob/jj$a$b;)Lcom/yandex/metrica/impl/ob/kh;

    move-result-object p1

    return-object p1
.end method
