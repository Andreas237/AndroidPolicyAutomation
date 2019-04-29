.class public Lcom/yandex/metrica/impl/bk;
.super Lcom/yandex/metrica/impl/ak;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bk$g;,
        Lcom/yandex/metrica/impl/bk$d;,
        Lcom/yandex/metrica/impl/bk$a;,
        Lcom/yandex/metrica/impl/bk$f;,
        Lcom/yandex/metrica/impl/bk$e;,
        Lcom/yandex/metrica/impl/bk$c;,
        Lcom/yandex/metrica/impl/bk$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/fj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ak;-><init>()V

    .line 53
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    .line 54
    new-instance v0, Lcom/yandex/metrica/impl/ob/fj;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bk;->a:Lcom/yandex/metrica/impl/ob/fj;

    return-void
.end method


# virtual methods
.method protected a(Lcom/yandex/metrica/impl/ob/ic;)I
    .locals 1

    .line 77
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ic;->a()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 79
    iget-object p1, p0, Lcom/yandex/metrica/impl/bk;->a:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/fj;->a(I)I

    move-result p1

    :cond_0
    return p1
.end method

.method a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ak$a;",
            ">;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/yandex/metrica/impl/bk$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/bk$1;-><init>()V

    return-object v0
.end method

.method protected a(Lcom/yandex/metrica/impl/ob/ic;I)V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/yandex/metrica/impl/bk;->a:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/fj;->b(I)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p2

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 87
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ic;->b()Lcom/yandex/metrica/impl/ob/ic;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ic;->j()V

    return-void
.end method
