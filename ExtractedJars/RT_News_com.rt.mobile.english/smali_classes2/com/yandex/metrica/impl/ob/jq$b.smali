.class public abstract Lcom/yandex/metrica/impl/ob/jq$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/jq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/jq;",
        "A:",
        "Lcom/yandex/metrica/impl/ob/jq$a;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/jq$d<",
        "TT;",
        "Lcom/yandex/metrica/impl/ob/jq$c<",
        "TA;>;>;"
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    .line 308
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jq$b;->b:Ljava/lang/String;

    return-void
.end method

.method private declared-synchronized a(Lcom/yandex/metrica/impl/ob/jq;Lcom/yandex/metrica/impl/ob/jq$c;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 1375
    :try_start_0
    iget-object v0, p2, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    .line 362
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/jq;->d(Ljava/lang/String;)V

    .line 363
    invoke-virtual {p0, p2}, Lcom/yandex/metrica/impl/ob/jq$b;->b(Lcom/yandex/metrica/impl/ob/jq$c;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/jq;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 361
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method protected abstract a()Lcom/yandex/metrica/impl/ob/jq;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;)TT;"
        }
    .end annotation

    .line 316
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jq$b;->a()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jq;->a(Landroid/content/Context;)V

    .line 319
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/yandex/metrica/impl/g;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jq;->a(Lcom/yandex/metrica/impl/g;)V

    .line 320
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jq;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 322
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v2, Lcom/yandex/metrica/impl/ob/jq$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jq$a;->a:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lcom/yandex/metrica/impl/ob/jq$b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jq;->g(Ljava/lang/String;)V

    .line 324
    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/jq$b;->a(Lcom/yandex/metrica/impl/ob/jq;Lcom/yandex/metrica/impl/ob/jq$c;)V

    .line 326
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast v2, Lcom/yandex/metrica/impl/ob/jq$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/jq$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    .line 1340
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1341
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/br;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1344
    :cond_0
    invoke-virtual {v0, v2}, Lcom/yandex/metrica/impl/ob/jq;->c(Ljava/lang/String;)V

    .line 327
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$a;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$a;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    .line 1352
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1353
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1356
    :cond_1
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jq;->b(Ljava/lang/String;)V

    .line 329
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jq;->a(Ljava/lang/String;)V

    .line 330
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object p1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b(Landroid/content/Context;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jq;->a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;)V

    .line 331
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/yandex/metrica/impl/aa;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/aa;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/aa;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/jq;->f(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 298
    check-cast p1, Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jq$b;->a(Lcom/yandex/metrica/impl/ob/jq$c;)Lcom/yandex/metrica/impl/ob/jq;

    move-result-object p1

    return-object p1
.end method

.method a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    if-nez p2, :cond_0

    .line 380
    invoke-static {p1}, Lcom/yandex/metrica/impl/g;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/g;

    move-result-object p1

    iget-object p1, p1, Lcom/yandex/metrica/impl/g;->g:Ljava/lang/String;

    return-object p1

    :cond_0
    return-object p2
.end method

.method b(Lcom/yandex/metrica/impl/ob/jq$c;)Ljava/lang/String;
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 367
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    .line 368
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jq$b;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method
