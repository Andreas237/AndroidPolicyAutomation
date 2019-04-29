.class public Lcom/yandex/metrica/impl/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/h$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:I

.field d:I

.field e:I

.field private f:Lcom/yandex/metrica/impl/h$a;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Landroid/util/Pair;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:J

.field private o:J

.field private p:Lcom/yandex/metrica/impl/r;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, ""

    const/4 v1, 0x0

    .line 67
    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/h;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/h;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/yandex/metrica/impl/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/h$a;-><init>(B)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    const/4 v0, 0x2

    .line 58
    iput v0, p0, Lcom/yandex/metrica/impl/h;->k:I

    .line 63
    sget-object v0, Lcom/yandex/metrica/impl/r;->a:Lcom/yandex/metrica/impl/r;

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    if-eqz p1, :cond_0

    .line 72
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    .line 74
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/h;->c:I

    .line 75
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->e()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/h;->d:I

    .line 76
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->g:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->i:Ljava/lang/String;

    .line 78
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->h:Ljava/lang/String;

    .line 79
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->f()Landroid/location/Location;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/h$a;->a:Landroid/location/Location;

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->g()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    .line 81
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->i()Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/yandex/metrica/impl/h$a;->c:Ljava/lang/Integer;

    .line 82
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->k()Landroid/util/Pair;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    .line 83
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->p()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/h;->e:I

    .line 84
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->q()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/h;->k:I

    .line 85
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->l:Ljava/lang/String;

    .line 86
    iget-object v0, p1, Lcom/yandex/metrica/impl/h;->m:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->m:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->u()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/h;->n:J

    .line 88
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->v()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/h;->o:J

    .line 89
    iget-object p1, p1, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, ""

    .line 95
    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/h;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 100
    new-instance v0, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yandex/metrica/impl/h;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/yandex/metrica/impl/ob/lz;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/yandex/metrica/impl/ob/lz;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/yandex/metrica/impl/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/h$a;-><init>(B)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    const/4 v0, 0x2

    .line 58
    iput v0, p0, Lcom/yandex/metrica/impl/h;->k:I

    .line 63
    sget-object v0, Lcom/yandex/metrica/impl/r;->a:Lcom/yandex/metrica/impl/r;

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    .line 106
    iput-object p2, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    .line 107
    iput p3, p0, Lcom/yandex/metrica/impl/h;->c:I

    .line 108
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    .line 109
    invoke-virtual {p4}, Lcom/yandex/metrica/impl/ob/lz;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/h;->n:J

    .line 110
    invoke-virtual {p4}, Lcom/yandex/metrica/impl/ob/lz;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/yandex/metrica/impl/h;->o:J

    return-void
.end method

.method public static a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 415
    new-instance v0, Lcom/yandex/metrica/impl/h;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/h;-><init>(Lcom/yandex/metrica/impl/h;)V

    const-string p0, ""

    .line 416
    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/h;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    .line 417
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    return-object v0
.end method

.method public static a(Lcom/yandex/metrica/impl/h;Ljava/util/List;)Lcom/yandex/metrica/impl/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/h;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/hs;",
            ">;)",
            "Lcom/yandex/metrica/impl/h;"
        }
    .end annotation

    .line 461
    new-instance v0, Lcom/yandex/metrica/impl/h;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/h;-><init>(Lcom/yandex/metrica/impl/h;)V

    const-string p0, ""

    .line 464
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 465
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/hs;

    .line 466
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "name"

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/hs;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "granted"

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/hs;->a()Z

    move-result v2

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 468
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "permissions"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, p1

    .line 472
    :catch_0
    sget-object p1, Lcom/yandex/metrica/impl/q$a;->D:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/h;
    .locals 3

    .line 434
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v0

    .line 435
    new-instance v1, Lcom/yandex/metrica/impl/w;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/w;-><init>()V

    .line 436
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/w;->a()Lcom/yandex/metrica/impl/w;

    move-result-object v1

    .line 439
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->E()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 440
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/w;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/w;

    .line 442
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->E()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 445
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jv;->F()Z

    move-result p0

    .line 443
    invoke-virtual {v1, v0, p0}, Lcom/yandex/metrica/impl/w;->a(Landroid/content/Context;Z)Lcom/yandex/metrica/impl/w;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 452
    :catch_0
    :cond_1
    new-instance p0, Lcom/yandex/metrica/impl/h;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/h;-><init>(Lcom/yandex/metrica/impl/h;)V

    .line 454
    sget-object p1, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 455
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/w;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/h;
    .locals 4

    const-string v0, "CounterReport.Object"

    .line 387
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CounterReport.Object"

    .line 388
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 390
    :goto_0
    new-instance v0, Lcom/yandex/metrica/impl/h;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/h;-><init>()V

    const-string v1, "CounterReport.Type"

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    .line 391
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.CustomType"

    .line 392
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->b(I)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.GeoLocation"

    .line 393
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/gy;->a([B)Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->a(Landroid/location/Location;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.Value"

    .line 394
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/bp;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.UserInfo"

    .line 395
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.Environment"

    .line 396
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.Wifi"

    .line 397
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.CellId"

    .line 398
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.Event"

    .line 399
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.PackageName"

    .line 400
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.AppEnvironmentDiffKey"

    .line 1376
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "CounterReport.AppEnvironmentDiffValue"

    .line 1377
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "CounterReport.AppEnvironmentDiffKey"

    .line 1378
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "CounterReport.AppEnvironmentDiffValue"

    .line 1379
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1380
    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 2218
    :goto_1
    iput-object v3, v0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    const-string v1, "CounterReport.TRUNCATED"

    .line 402
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->c(I)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.ConnectionType"

    .line 403
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->d(I)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.CellularConnectionType"

    .line 404
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.ProfileID"

    .line 405
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/h;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.CreationElapsedRealtime"

    .line 406
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/h;->a(J)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.CreationTimestamp"

    .line 407
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/h;->b(J)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    const-string v1, "CounterReport.UniquenessStatus"

    .line 409
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 408
    invoke-static {p0}, Lcom/yandex/metrica/impl/r;->a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/r;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/r;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method a(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    .line 315
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "CounterReport.Event"

    .line 317
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CounterReport.Value"

    .line 318
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CounterReport.Type"

    .line 319
    iget v2, p0, Lcom/yandex/metrica/impl/h;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CounterReport.CustomType"

    .line 320
    iget v2, p0, Lcom/yandex/metrica/impl/h;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CounterReport.Wifi"

    .line 321
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CounterReport.TRUNCATED"

    .line 322
    iget v2, p0, Lcom/yandex/metrica/impl/h;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CounterReport.ConnectionType"

    .line 323
    iget v2, p0, Lcom/yandex/metrica/impl/h;->k:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "CounterReport.CellularConnectionType"

    .line 324
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CounterReport.ProfileID"

    .line 325
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->m:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CounterReport.UniquenessStatus"

    .line 326
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    iget v2, v2, Lcom/yandex/metrica/impl/r;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 328
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/h$a;->a:Landroid/location/Location;

    if-eqz v1, :cond_0

    const-string v1, "CounterReport.GeoLocation"

    .line 329
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/h$a;->a:Landroid/location/Location;

    .line 330
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/location/Location;)[B

    move-result-object v2

    .line 329
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 333
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/h$a;->c:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    const-string v1, "CounterReport.CellId"

    .line 334
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v2, v2, Lcom/yandex/metrica/impl/h$a;->c:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 336
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->h:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, "CounterReport.Environment"

    .line 337
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->g:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v1, "CounterReport.UserInfo"

    .line 340
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->i:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v1, "CounterReport.PackageName"

    .line 343
    iget-object v2, p0, Lcom/yandex/metrica/impl/h;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    :cond_4
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    if-eqz v1, :cond_5

    .line 346
    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    const-string v2, "CounterReport.AppEnvironmentDiffKey"

    .line 1370
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "CounterReport.AppEnvironmentDiffValue"

    .line 1371
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const-string v1, "CounterReport.CreationElapsedRealtime"

    .line 348
    iget-wide v2, p0, Lcom/yandex/metrica/impl/h;->n:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "CounterReport.CreationTimestamp"

    .line 349
    iget-wide v2, p0, Lcom/yandex/metrica/impl/h;->o:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    if-eqz p1, :cond_6

    goto :goto_0

    .line 351
    :cond_6
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v1, "CounterReport.Object"

    .line 352
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public a(I)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 145
    iput p1, p0, Lcom/yandex/metrica/impl/h;->c:I

    return-object p0
.end method

.method protected a(J)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 256
    iput-wide p1, p0, Lcom/yandex/metrica/impl/h;->n:J

    return-object p0
.end method

.method a(Landroid/location/Location;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iput-object p1, v0, Lcom/yandex/metrica/impl/h$a;->a:Landroid/location/Location;

    return-object p0
.end method

.method public a(Lcom/yandex/metrica/impl/r;)Lcom/yandex/metrica/impl/h;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/r;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 302
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    return-object p0
.end method

.method a(Ljava/lang/Integer;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iput-object p1, v0, Lcom/yandex/metrica/impl/h$a;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->g:Ljava/lang/String;

    return-object p0
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    :cond_0
    return-object p0
.end method

.method public a([B)Lcom/yandex/metrica/impl/h;
    .locals 2
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 136
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 154
    iput p1, p0, Lcom/yandex/metrica/impl/h;->d:I

    return-object p0
.end method

.method protected b(J)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 261
    iput-wide p1, p0, Lcom/yandex/metrica/impl/h;->o:J

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected c(I)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 241
    iput p1, p0, Lcom/yandex/metrica/impl/h;->e:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c()[B
    .locals 2

    .line 127
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/yandex/metrica/impl/h;->c:I

    return v0
.end method

.method protected d(I)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 246
    iput p1, p0, Lcom/yandex/metrica/impl/h;->k:I

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 291
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->m:Ljava/lang/String;

    return-object p0
.end method

.method public e()I
    .locals 1

    .line 150
    iget v0, p0, Lcom/yandex/metrica/impl/h;->d:I

    return v0
.end method

.method e(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iput-object p1, v0, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public f()Landroid/location/Location;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v0, v0, Lcom/yandex/metrica/impl/h$a;->a:Landroid/location/Location;

    return-object v0
.end method

.method f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->h:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->i:Ljava/lang/String;

    return-object p0
.end method

.method g()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v0, v0, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected h(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/yandex/metrica/impl/h;->l:Ljava/lang/String;

    return-object p0
.end method

.method h()Lorg/json/JSONArray;
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v0, v0, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    iget-object v1, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/h$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 180
    :catch_0
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    return-object v0
.end method

.method i()Ljava/lang/Integer;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->f:Lcom/yandex/metrica/impl/h$a;

    iget-object v0, v0, Lcom/yandex/metrica/impl/h$a;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method j()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->h:Ljava/lang/String;

    return-object v0
.end method

.method public k()Landroid/util/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->j:Landroid/util/Pair;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->g:Ljava/lang/String;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->i:Ljava/lang/String;

    return-object v0
.end method

.method public n()Z
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 2

    .line 270
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v0

    iget v1, p0, Lcom/yandex/metrica/impl/h;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public p()I
    .locals 1

    .line 274
    iget v0, p0, Lcom/yandex/metrica/impl/h;->e:I

    return v0
.end method

.method public q()I
    .locals 1

    .line 278
    iget v0, p0, Lcom/yandex/metrica/impl/h;->k:I

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->l:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 287
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->m:Ljava/lang/String;

    return-object v0
.end method

.method public t()Lcom/yandex/metrica/impl/r;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 297
    iget-object v0, p0, Lcom/yandex/metrica/impl/h;->p:Lcom/yandex/metrica/impl/r;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 358
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "[event: %s, type: %s, value: %s]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/yandex/metrica/impl/h;->a:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/yandex/metrica/impl/h;->c:I

    .line 362
    invoke-static {v3}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/q$a;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/yandex/metrica/impl/h;->b:Ljava/lang/String;

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 358
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()J
    .locals 2

    .line 307
    iget-wide v0, p0, Lcom/yandex/metrica/impl/h;->n:J

    return-wide v0
.end method

.method public v()J
    .locals 2

    .line 311
    iget-wide v0, p0, Lcom/yandex/metrica/impl/h;->o:J

    return-wide v0
.end method
