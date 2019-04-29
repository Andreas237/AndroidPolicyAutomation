.class public Lcom/yandex/metrica/impl/ob/jw$b;
.super Lcom/yandex/metrica/impl/ob/jt$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/jt$a<",
        "Lcom/yandex/metrica/impl/ob/jw;",
        "Lcom/yandex/metrica/impl/ob/jw$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 206
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/jt$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected synthetic a()Lcom/yandex/metrica/impl/ob/jq;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 203
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jw$b;->c()Lcom/yandex/metrica/impl/ob/jw;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 203
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jw$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jw;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 203
    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jw$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jw;

    move-result-object p1

    return-object p1
.end method

.method a(Lcom/yandex/metrica/impl/ob/jw;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 229
    iget-object v0, p2, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jw;->b(Ljava/util/List;)V

    .line 230
    iget-object p2, p2, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jw;->a(Ljava/util/List;)V

    return-void
.end method

.method public synthetic c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 203
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jw$b;->d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jw;

    move-result-object p1

    return-object p1
.end method

.method protected c()Lcom/yandex/metrica/impl/ob/jw;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 211
    new-instance v0, Lcom/yandex/metrica/impl/ob/jw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jw;-><init>(B)V

    return-object v0
.end method

.method public d(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jw;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "Lcom/yandex/metrica/impl/ob/jw$a;",
            ">;)",
            "Lcom/yandex/metrica/impl/ob/jw;"
        }
    .end annotation

    .line 216
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/jt$a;->c(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jt;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jw;

    .line 217
    invoke-static {}, Lcom/yandex/metrica/impl/bj;->c()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/jw;->a(Lcom/yandex/metrica/impl/ob/jw;Z)V

    .line 219
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/jw$b;->a(Lcom/yandex/metrica/impl/ob/jw;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 220
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jw$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jw$a;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/jw;->a(Lcom/yandex/metrica/impl/ob/jw;Ljava/lang/String;)V

    .line 221
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jw$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jw$a;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jw;->a(Ljava/util/Map;)V

    .line 222
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v1, Lcom/yandex/metrica/impl/ob/jw$a;

    iget-boolean v1, v1, Lcom/yandex/metrica/impl/ob/jw$a;->f:Z

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jw;->a(Z)V

    .line 223
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast p1, Lcom/yandex/metrica/impl/ob/jw$a;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jw$a;->g:Ljava/util/List;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jw;->c(Ljava/util/List;)V

    return-object v0
.end method
