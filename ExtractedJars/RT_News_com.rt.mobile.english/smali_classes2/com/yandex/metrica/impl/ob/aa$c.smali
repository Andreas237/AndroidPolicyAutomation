.class Lcom/yandex/metrica/impl/ob/aa$c;
.super Lcom/yandex/metrica/impl/ob/aa$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/hy;

.field private final b:Lcom/yandex/metrica/impl/ob/ff;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hy;)V
    .locals 0

    .line 321
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/aa$f;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 322
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    .line 323
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/aa$c;->b:Lcom/yandex/metrica/impl/ob/ff;

    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 3

    const-string v0, "DONE"

    .line 328
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/hy;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DONE"

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    .line 329
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/hy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method protected b()V
    .locals 3

    .line 335
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hy;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "DONE"

    .line 336
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->b:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ff;->b()V

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hy;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 341
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 342
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/aa$c;->b:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v2, v0}, Lcom/yandex/metrica/impl/ob/ff;->c(Ljava/lang/String;)V

    .line 345
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DONE"

    .line 346
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 347
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->b:Lcom/yandex/metrica/impl/ob/ff;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ff;->a()V

    .line 350
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->d()V

    .line 351
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->e()V

    .line 352
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa$c;->a:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->c()V

    return-void
.end method
