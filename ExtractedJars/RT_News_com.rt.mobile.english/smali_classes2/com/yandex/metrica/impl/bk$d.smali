.class Lcom/yandex/metrica/impl/bk$d;
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
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 7

    .line 184
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v0

    .line 185
    new-instance v1, Lcom/yandex/metrica/impl/ob/fj;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 1240
    new-instance v0, Lcom/yandex/metrica/impl/ob/if;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/if;-><init>(Landroid/content/Context;)V

    .line 1241
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/if;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    .line 1242
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/fj;->a(Z)V

    .line 1243
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/if;->b()V

    .line 2230
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/id;

    .line 2231
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2}, Lcom/yandex/metrica/impl/ob/id;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 2232
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/id;->a(I)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    .line 2234
    invoke-virtual {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/fj;->a(J)Lcom/yandex/metrica/impl/ob/fj;

    .line 2236
    :cond_1
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/id;->a()V

    .line 3212
    new-instance v0, Lcom/yandex/metrica/impl/ob/ai;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lcom/yandex/metrica/impl/ob/ai;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3213
    new-instance v2, Lcom/yandex/metrica/impl/ob/ib;

    .line 3214
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Lcom/yandex/metrica/impl/ob/ib;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 3216
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ib;->b()Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    .line 3217
    sget-object v4, Lcom/yandex/metrica/CounterConfiguration$a;->a:Lcom/yandex/metrica/CounterConfiguration$a;

    if-eq v0, v4, :cond_2

    .line 3218
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/fj;->a(Lcom/yandex/metrica/CounterConfiguration$a;)Lcom/yandex/metrica/impl/ob/fj;

    .line 3221
    :cond_2
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ib;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3222
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 3223
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/fj;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fj;

    .line 3226
    :cond_3
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ib;->d()Lcom/yandex/metrica/impl/ob/ib;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ib;->c()Lcom/yandex/metrica/impl/ob/ib;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ib;->j()V

    .line 191
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    .line 193
    new-instance v0, Lcom/yandex/metrica/impl/ob/hw;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/hw;-><init>(Landroid/content/Context;)V

    .line 194
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hw;->a()V

    .line 195
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hw;->b()V

    .line 4201
    new-instance v0, Lcom/yandex/metrica/impl/ob/fk;

    .line 4202
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v1

    .line 4203
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 4205
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    .line 4206
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fk;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v0, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4205
    invoke-virtual {v1, p1, v0}, Lcom/yandex/metrica/impl/ob/gi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
