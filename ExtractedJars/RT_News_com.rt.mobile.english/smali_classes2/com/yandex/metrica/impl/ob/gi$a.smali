.class Lcom/yandex/metrica/impl/ob/gi$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Lcom/yandex/metrica/impl/ob/gi;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/lq;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/gi;)V
    .locals 2

    .line 342
    new-instance v0, Lcom/yandex/metrica/impl/ob/lq;

    const-string v1, "com.yandex.metrica.synchronization.deviceid"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lq;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/gi$a;-><init>(Lcom/yandex/metrica/impl/ob/gi;Lcom/yandex/metrica/impl/ob/lq;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/gi;B)V
    .locals 0

    .line 334
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/gi$a;-><init>(Lcom/yandex/metrica/impl/ob/gi;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/gi;Lcom/yandex/metrica/impl/ob/lq;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 347
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gi$a;->a:Lcom/yandex/metrica/impl/ob/gi;

    .line 348
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gi$a;->b:Lcom/yandex/metrica/impl/ob/lq;

    return-void
.end method


# virtual methods
.method a()Lcom/yandex/metrica/impl/ob/gi;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi$a;->a:Lcom/yandex/metrica/impl/ob/gi;

    return-object v0
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 362
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 367
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gi;->f()Lcom/yandex/metrica/impl/ob/gk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 372
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi$a;->b:Lcom/yandex/metrica/impl/ob/lq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lq;->c()V

    .line 374
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gi;->f()Lcom/yandex/metrica/impl/ob/gk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 377
    invoke-virtual {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/gi$a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/lq$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    :try_start_1
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gi$a;->b:Lcom/yandex/metrica/impl/ob/lq;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/lq;->b()V
    :try_end_1
    .catch Lcom/yandex/metrica/impl/ob/lq$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :catch_1
    :goto_0
    return-object p1
.end method

.method a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 388
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    .line 389
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 390
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 395
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Lcom/yandex/metrica/impl/ob/gi;->f(Landroid/content/Context;Ljava/lang/String;)V

    return-object p3

    .line 400
    :cond_1
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 401
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->f(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "update_snapshot"

    .line 402
    new-instance v2, Lcom/yandex/metrica/impl/ob/gi$c;

    invoke-direct {v2, p1, p3, p2}, Lcom/yandex/metrica/impl/ob/gi$c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-object p2

    .line 406
    :cond_2
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 408
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->f(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "wtf_situation. App has id and elector hasn\'t"

    .line 411
    new-instance v2, Lcom/yandex/metrica/impl/ob/gi$c;

    invoke-direct {v2, p1, p3, p2}, Lcom/yandex/metrica/impl/ob/gi$c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-object p2

    .line 417
    :cond_3
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi$a;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v1

    invoke-virtual {v1, p1, p3}, Lcom/yandex/metrica/impl/ob/gi;->f(Landroid/content/Context;Ljava/lang/String;)V

    const-string v1, "overlapping_device_id"

    .line 419
    new-instance v2, Lcom/yandex/metrica/impl/ob/gi$c;

    invoke-direct {v2, p1, p3, p2}, Lcom/yandex/metrica/impl/ob/gi$c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-object p3
.end method
