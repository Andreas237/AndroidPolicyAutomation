.class Lcom/yandex/metrica/impl/ob/jk$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/jk$a$a;

.field final synthetic b:Lcom/yandex/metrica/impl/ob/jk;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/jk;Lcom/yandex/metrica/impl/ob/jk$a$a;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$2;->b:Lcom/yandex/metrica/impl/ob/jk;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 355
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$2;->b:Lcom/yandex/metrica/impl/ob/jk;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk;)Lcom/yandex/metrica/impl/ob/kb;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kb;->b(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    .line 356
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a$b;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;-><init>(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    .line 357
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jk$2;->b:Lcom/yandex/metrica/impl/ob/jk;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/jk;->b(Lcom/yandex/metrica/impl/ob/jk;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/as;->d(Landroid/content/Context;)Lcom/yandex/metrica/impl/as$a;

    move-result-object v1

    .line 358
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/as$a;)V

    .line 359
    sget-object v2, Lcom/yandex/metrica/impl/as$a;->c:Lcom/yandex/metrica/impl/as$a;

    if-ne v1, v2, :cond_0

    .line 360
    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->a:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/ob/jk$a$b$a;)V

    goto/16 :goto_1

    .line 362
    :cond_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jk$a$a;->f:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 365
    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->b:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/ob/jk$a$b$a;)V

    goto/16 :goto_1

    .line 367
    :cond_1
    sget-object v1, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/ob/jk$a$b$a;)V

    .line 369
    :try_start_0
    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jk$a$a;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 370
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jk$a$a;->d:Lcom/yandex/metrica/impl/ob/me;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/me;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 371
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, ","

    .line 372
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v5, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    .line 371
    invoke-virtual {v1, v4, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    .line 374
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 375
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jk$2;->a:Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jk$a$a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 376
    sget v2, Lcom/yandex/metrica/impl/ob/ho$a;->a:I

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 377
    sget v2, Lcom/yandex/metrica/impl/ob/ho$a;->a:I

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 378
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V

    .line 379
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 380
    sget-object v3, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->c:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    invoke-virtual {v0, v3}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/ob/jk$a$b$a;)V

    .line 381
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Ljava/lang/Integer;)V

    .line 382
    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/ob/jk;->a(Ljava/net/HttpURLConnection;Lcom/yandex/metrica/impl/ob/jk$a$b;)V

    .line 383
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 387
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Ljava/lang/Exception;)V

    .line 390
    :goto_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jk$2;->b:Lcom/yandex/metrica/impl/ob/jk;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk;Lcom/yandex/metrica/impl/ob/jk$a$b;)V

    return-void
.end method
