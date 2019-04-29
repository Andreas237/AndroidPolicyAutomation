.class public Lcom/yandex/metrica/impl/ob/gb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/ks;",
        "Lcom/yandex/metrica/impl/ob/jj$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/fx;

.field private b:Lcom/yandex/metrica/impl/ob/fu;

.field private c:Lcom/yandex/metrica/impl/ob/ga;

.field private d:Lcom/yandex/metrica/impl/ob/fz;

.field private e:Lcom/yandex/metrica/impl/ob/fw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/fx;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fx;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gb;->a:Lcom/yandex/metrica/impl/ob/fx;

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/fu;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fu;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gb;->b:Lcom/yandex/metrica/impl/ob/fu;

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/ga;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ga;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gb;->c:Lcom/yandex/metrica/impl/ob/ga;

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/fz;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fz;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gb;->d:Lcom/yandex/metrica/impl/ob/fz;

    .line 30
    new-instance v0, Lcom/yandex/metrica/impl/ob/fw;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fw;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gb;->e:Lcom/yandex/metrica/impl/ob/fw;

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

    .line 22
    check-cast p1, Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gb;->a(Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/jj$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/jj$a;
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a;-><init>()V

    .line 36
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->b:Ljava/lang/String;

    .line 37
    :cond_0
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 38
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->h:[Ljava/lang/String;

    .line 40
    :cond_1
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    if-eqz v1, :cond_2

    .line 41
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->i:[Ljava/lang/String;

    .line 43
    :cond_2
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 44
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->d:[Ljava/lang/String;

    .line 46
    :cond_3
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    if-eqz v1, :cond_4

    .line 47
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->g:[Ljava/lang/String;

    .line 49
    :cond_4
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz v1, :cond_5

    .line 50
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->a:Lcom/yandex/metrica/impl/ob/fx;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    .line 51
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->k:Lcom/yandex/metrica/impl/ob/jj$a$c;

    .line 53
    :cond_5
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    if-eqz v1, :cond_6

    .line 54
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->b:Lcom/yandex/metrica/impl/ob/fu;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    .line 55
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fu;->a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/jj$a$a;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->l:Lcom/yandex/metrica/impl/ob/jj$a$a;

    .line 57
    :cond_6
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    if-eqz v1, :cond_7

    .line 58
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->c:Lcom/yandex/metrica/impl/ob/ga;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/ga;->a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/jj$a$e;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->m:Lcom/yandex/metrica/impl/ob/jj$a$e;

    .line 60
    :cond_7
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->o:Ljava/lang/String;

    .line 61
    :cond_8
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    if-eqz v1, :cond_9

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->e:Ljava/lang/String;

    .line 62
    :cond_9
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->f:Ljava/lang/String;

    .line 63
    :cond_a
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->o:Ljava/lang/String;

    if-eqz v1, :cond_b

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->o:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->r:Ljava/lang/String;

    .line 64
    :cond_b
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->e:Lcom/yandex/metrica/impl/ob/fw;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fw;->a(Lcom/yandex/metrica/impl/ob/kh;)Lcom/yandex/metrica/impl/ob/jj$a$b;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->j:Lcom/yandex/metrica/impl/ob/jj$a$b;

    .line 65
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    if-eqz v1, :cond_c

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->p:Ljava/lang/String;

    .line 66
    :cond_c
    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/ks;->q:Z

    iput-boolean v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->q:Z

    .line 67
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/ks;->p:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->c:J

    .line 68
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/ks;->r:Ljava/util/List;

    if-eqz v1, :cond_e

    .line 69
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->r:Ljava/util/List;

    .line 1112
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jj$a$d;

    .line 1114
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/bn$a;

    const/4 v3, 0x0

    .line 1115
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/gb;->d:Lcom/yandex/metrica/impl/ob/fz;

    invoke-virtual {v4, v2}, Lcom/yandex/metrica/impl/ob/fz;->a(Lcom/yandex/metrica/impl/bn$a;)Lcom/yandex/metrica/impl/ob/jj$a$d;

    move-result-object v2

    aput-object v2, v1, v3

    goto :goto_0

    .line 69
    :cond_d
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a;->n:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    :cond_e
    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jj$a;)Lcom/yandex/metrica/impl/ob/ks;
    .locals 7
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 77
    new-instance v0, Lcom/yandex/metrica/impl/ob/ks$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->e:Lcom/yandex/metrica/impl/ob/fw;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jj$a;->j:Lcom/yandex/metrica/impl/ob/jj$a$b;

    .line 78
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fw;->a(Lcom/yandex/metrica/impl/ob/jj$a$b;)Lcom/yandex/metrica/impl/ob/kh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;-><init>(Lcom/yandex/metrica/impl/ob/kh;)V

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->b:Ljava/lang/String;

    .line 79
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    .line 80
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gi;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->o:Ljava/lang/String;

    .line 81
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->e:Ljava/lang/String;

    .line 82
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->d:[Ljava/lang/String;

    .line 83
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->g:[Ljava/lang/String;

    .line 84
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->i:[Ljava/lang/String;

    .line 85
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->h:[Ljava/lang/String;

    .line 86
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->f:Ljava/lang/String;

    .line 87
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->r:Ljava/lang/String;

    .line 88
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->p:Ljava/lang/String;

    .line 89
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-boolean v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->q:Z

    .line 90
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Z)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->c:J

    .line 91
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ks$a;->a(J)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->n:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    .line 1124
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    array-length v4, v1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1125
    array-length v4, v1

    :goto_0
    if-ge v3, v4, :cond_0

    aget-object v5, v1, v3

    .line 1126
    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/gb;->d:Lcom/yandex/metrica/impl/ob/fz;

    invoke-virtual {v6, v5}, Lcom/yandex/metrica/impl/ob/fz;->a(Lcom/yandex/metrica/impl/ob/jj$a$d;)Lcom/yandex/metrica/impl/bn$a;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    .line 93
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->k:Lcom/yandex/metrica/impl/ob/jj$a$c;

    if-eqz v1, :cond_1

    .line 94
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->a:Lcom/yandex/metrica/impl/ob/fx;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jj$a;->k:Lcom/yandex/metrica/impl/ob/jj$a$c;

    .line 95
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/gs;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/ks$a;

    .line 98
    :cond_1
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->l:Lcom/yandex/metrica/impl/ob/jj$a$a;

    if-eqz v1, :cond_2

    .line 99
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->b:Lcom/yandex/metrica/impl/ob/fu;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jj$a;->l:Lcom/yandex/metrica/impl/ob/jj$a$a;

    .line 100
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fu;->a(Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/gn;

    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/ks$a;

    .line 103
    :cond_2
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->m:Lcom/yandex/metrica/impl/ob/jj$a$e;

    if-eqz v1, :cond_3

    .line 104
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gb;->c:Lcom/yandex/metrica/impl/ob/ga;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jj$a;->m:Lcom/yandex/metrica/impl/ob/jj$a$e;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/ga;->a(Lcom/yandex/metrica/impl/ob/jj$a$e;)Lcom/yandex/metrica/impl/ob/kj;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/ks$a;

    .line 106
    :cond_3
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ks$a;->a()Lcom/yandex/metrica/impl/ob/ks;

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

    .line 22
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gb;->a(Lcom/yandex/metrica/impl/ob/jj$a;)Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    return-object p1
.end method
