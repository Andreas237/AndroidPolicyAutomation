.class public Lcom/yandex/metrica/impl/ob/fu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/gn;",
        "Lcom/yandex/metrica/impl/ob/jj$a$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/fx;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/fx;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fx;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/fu;->a:Lcom/yandex/metrica/impl/ob/fx;

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
    check-cast p1, Lcom/yandex/metrica/impl/ob/gn;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fu;->a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/jj$a$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/gn;
    .locals 18
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 40
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/fu;->a:Lcom/yandex/metrica/impl/ob/fx;

    iget-object v3, v1, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/gs;

    move-result-object v2

    .line 41
    new-instance v17, Lcom/yandex/metrica/impl/ob/gn;

    iget-wide v4, v2, Lcom/yandex/metrica/impl/ob/gs;->c:J

    iget v6, v2, Lcom/yandex/metrica/impl/ob/gs;->d:F

    iget v7, v2, Lcom/yandex/metrica/impl/ob/gs;->e:I

    iget v8, v2, Lcom/yandex/metrica/impl/ob/gs;->f:I

    iget-wide v9, v2, Lcom/yandex/metrica/impl/ob/gs;->g:J

    iget v11, v2, Lcom/yandex/metrica/impl/ob/gs;->h:I

    iget-boolean v12, v2, Lcom/yandex/metrica/impl/ob/gs;->i:Z

    iget-wide v13, v1, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

    iget-wide v1, v1, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    move-object/from16 v3, v17

    move-wide v15, v1

    invoke-direct/range {v3 .. v16}, Lcom/yandex/metrica/impl/ob/gn;-><init>(JFIIJIZJJ)V

    return-object v17
.end method

.method public a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/jj$a$a;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/gn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$a;-><init>()V

    .line 29
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/fu;->a:Lcom/yandex/metrica/impl/ob/fx;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$a;->b:Lcom/yandex/metrica/impl/ob/jj$a$c;

    .line 30
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/gn;->b:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$a;->d:J

    .line 31
    iget-wide v1, p1, Lcom/yandex/metrica/impl/ob/gn;->a:J

    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$a;->c:J

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
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fu;->a(Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/gn;

    move-result-object p1

    return-object p1
.end method
