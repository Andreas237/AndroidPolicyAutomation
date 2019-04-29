.class Lcom/yandex/metrica/impl/bk$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 8

    .line 133
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v0

    .line 134
    new-instance v1, Lcom/yandex/metrica/impl/ob/fj;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 1139
    new-instance v0, Lcom/yandex/metrica/impl/ob/fk;

    .line 1140
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 1142
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fk;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    iget-wide v2, p1, Lcom/yandex/metrica/impl/ob/ks;->p:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    const/4 v0, 0x1

    const/4 v2, 0x0

    if-lez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    const/4 v3, -0x1

    .line 1143
    invoke-virtual {v1, v3}, Lcom/yandex/metrica/impl/ob/fj;->c(I)J

    move-result-wide v6

    cmp-long v3, v6, v4

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-nez p1, :cond_2

    if-eqz v0, :cond_3

    .line 1145
    :cond_2
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fj;->c(Z)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    :cond_3
    return-void
.end method
