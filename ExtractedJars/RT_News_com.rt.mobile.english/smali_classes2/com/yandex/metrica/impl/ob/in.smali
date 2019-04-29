.class public abstract Lcom/yandex/metrica/impl/ob/in;
.super Lcom/yandex/metrica/impl/ob/is;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/yandex/metrica/impl/ob/is;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/ik;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "TT;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ik;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/yandex/metrica/impl/ob/is;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    .line 33
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/in;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ja;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/ja;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/in;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1053
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/in;->e()Lcom/yandex/metrica/impl/ob/ik;

    move-result-object v0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/in;->d()I

    move-result v1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/in;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/ja;->a(ILjava/lang/String;)Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object v1

    invoke-virtual {v0, p1, v1, p0}, Lcom/yandex/metrica/impl/ob/ik;->a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;Lcom/yandex/metrica/impl/ob/ii;)Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/in;->a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V

    :cond_0
    return-void
.end method

.method protected abstract a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/in;->a:Ljava/lang/Object;

    return-object v0
.end method
