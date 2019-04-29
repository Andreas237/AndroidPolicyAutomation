.class public Lcom/yandex/metrica/impl/ob/fx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/gs;",
        "Lcom/yandex/metrica/impl/ob/jj$a$c;",
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
    check-cast p1, Lcom/yandex/metrica/impl/ob/gs;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/gs;
    .locals 11
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 43
    new-instance v10, Lcom/yandex/metrica/impl/ob/gs;

    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    iget v3, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    iget v4, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    iget v5, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    iget-wide v6, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    iget v8, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    iget-boolean v9, p1, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/yandex/metrica/impl/ob/gs;-><init>(JFIIJIZ)V

    return-object v10
.end method

.method public a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$c;-><init>()V

    .line 27
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/gs;->c:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->b:J

    .line 28
    iget v1, p1, Lcom/yandex/metrica/impl/ob/gs;->d:F

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->c:F

    .line 29
    iget v1, p1, Lcom/yandex/metrica/impl/ob/gs;->e:I

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->d:I

    .line 30
    iget v1, p1, Lcom/yandex/metrica/impl/ob/gs;->f:I

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->e:I

    .line 31
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/gs;->g:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->f:J

    .line 32
    iget v1, p1, Lcom/yandex/metrica/impl/ob/gs;->h:I

    iput v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->g:I

    .line 33
    iget-boolean p1, p1, Lcom/yandex/metrica/impl/ob/gs;->i:Z

    iput-boolean p1, v0, Lcom/yandex/metrica/impl/ob/jj$a$c;->h:Z

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

    .line 16
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/gs;

    move-result-object p1

    return-object p1
.end method
