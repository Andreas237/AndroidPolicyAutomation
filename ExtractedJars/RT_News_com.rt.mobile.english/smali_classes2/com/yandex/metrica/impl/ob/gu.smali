.class public Lcom/yandex/metrica/impl/ob/gu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Landroid/location/LocationManager;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 30
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "gps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 31
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/gu;->a:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/LocationManager;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gu;->b:Landroid/content/Context;

    .line 41
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gu;->c:Landroid/location/LocationManager;

    return-void
.end method


# virtual methods
.method public a()Landroid/location/Location;
    .locals 12
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gu;->c:Landroid/location/LocationManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gu;->b:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    .line 1030
    invoke-static {v0, v2}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 51
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gu;->b:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    .line 1034
    invoke-static {v2, v3}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    .line 53
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/gu;->c:Landroid/location/LocationManager;

    invoke-virtual {v3}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 56
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v10, v1

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 57
    sget-object v5, Lcom/yandex/metrica/impl/ob/gu;->a:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    if-eqz v0, :cond_2

    :try_start_0
    const-string v5, "passive"

    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v2, :cond_2

    .line 64
    :cond_1
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/gu;->c:Landroid/location/LocationManager;

    invoke-virtual {v5, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v11, v1

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_1
    move-object v11, v4

    :goto_2
    if-eqz v11, :cond_0

    .line 71
    sget-wide v6, Lcom/yandex/metrica/impl/ob/gt;->a:J

    const-wide/16 v8, 0xc8

    move-object v4, v11

    move-object v5, v10

    invoke-static/range {v4 .. v9}, Lcom/yandex/metrica/impl/ob/gt;->a(Landroid/location/Location;Landroid/location/Location;JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v10, v11

    goto :goto_0

    :cond_3
    move-object v1, v10

    :cond_4
    return-object v1
.end method
