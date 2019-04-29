.class public Lcom/yandex/metrica/impl/ob/ga;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/kj;",
        "Lcom/yandex/metrica/impl/ob/jj$a$e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
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

    .line 17
    check-cast p1, Lcom/yandex/metrica/impl/ob/kj;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ga;->a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/jj$a$e;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/jj$a$e;
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/kj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$e;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$e;-><init>()V

    .line 24
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/kj;->a:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    .line 25
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/kj;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    .line 26
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/kj;->c:Ljava/util/List;

    .line 1062
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    .line 1063
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 1064
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 26
    :cond_0
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jj$a$e;)Lcom/yandex/metrica/impl/ob/kj;
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a$e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/kj;

    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$e;->b:J

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jj$a$e;->c:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jj$a$e;->d:[I

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lm;->a([I)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/yandex/metrica/impl/ob/kj;-><init>(JLjava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/e;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 17
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a$e;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ga;->a(Lcom/yandex/metrica/impl/ob/jj$a$e;)Lcom/yandex/metrica/impl/ob/kj;

    move-result-object p1

    return-object p1
.end method
