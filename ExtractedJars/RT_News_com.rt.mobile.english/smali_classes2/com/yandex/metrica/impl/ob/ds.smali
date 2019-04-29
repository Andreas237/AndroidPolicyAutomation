.class Lcom/yandex/metrica/impl/ob/ds;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/yandex/metrica/impl/ob/gs;)Landroid/os/Bundle;
    .locals 4
    .param p0    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "sputi"

    .line 47
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/gs;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "spudi"

    .line 48
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gs;->d:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "sbs"

    .line 49
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gs;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mbs"

    .line 50
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gs;->f:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "maff"

    .line 51
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/gs;->g:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "mrtsl"

    .line 52
    iget v2, p0, Lcom/yandex/metrica/impl/ob/gs;->h:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ce"

    .line 53
    iget-boolean p0, p0, Lcom/yandex/metrica/impl/ob/gs;->i:Z

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method a(Landroid/os/Bundle;Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/ks;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "package_name"

    .line 23
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "clte"

    .line 24
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 25
    iget-object p2, p4, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz p2, :cond_0

    const-string p2, "flcc"

    .line 26
    iget-object p3, p4, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    .line 27
    invoke-static {p3}, Lcom/yandex/metrica/impl/ob/ds;->a(Lcom/yandex/metrica/impl/ob/gs;)Landroid/os/Bundle;

    move-result-object p3

    .line 26
    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    :cond_0
    iget-object p2, p4, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    if-eqz p2, :cond_1

    const-string p2, "blcc"

    .line 30
    iget-object p3, p4, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    .line 1037
    invoke-static {p3}, Lcom/yandex/metrica/impl/ob/ds;->a(Lcom/yandex/metrica/impl/ob/gs;)Landroid/os/Bundle;

    move-result-object p4

    const-string v0, "cd"

    .line 1038
    iget-wide v1, p3, Lcom/yandex/metrica/impl/ob/gn;->a:J

    invoke-virtual {p4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "ci"

    .line 1039
    iget-wide v1, p3, Lcom/yandex/metrica/impl/ob/gn;->b:J

    invoke-virtual {p4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 30
    invoke-virtual {p1, p2, p4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method
