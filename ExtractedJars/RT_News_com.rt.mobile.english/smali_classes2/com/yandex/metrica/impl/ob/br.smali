.class public Lcom/yandex/metrica/impl/ob/br;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/br;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->B()Lcom/yandex/metrica/impl/ob/ff;

    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ff;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->A()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 53
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->G()Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/br;->b()Ljava/util/HashSet;

    move-result-object v2

    .line 56
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/br;->c()Ljava/util/ArrayList;

    move-result-object v3

    .line 57
    invoke-static {v2, v3}, Lcom/yandex/metrica/impl/ob/lm;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 58
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->q()V

    goto :goto_1

    .line 60
    :cond_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 61
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/ob/gm;

    .line 62
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/gm;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 64
    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "features"

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1477
    new-instance v4, Lcom/yandex/metrica/impl/h;

    invoke-direct {v4, p1}, Lcom/yandex/metrica/impl/h;-><init>(Lcom/yandex/metrica/impl/h;)V

    .line 1478
    sget-object p1, Lcom/yandex/metrica/impl/q$a;->E:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p1

    invoke-virtual {v4, p1}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/yandex/metrica/impl/h;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ab;->g(Lcom/yandex/metrica/impl/h;)V

    .line 67
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/fh;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method b()Ljava/util/HashSet;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/yandex/metrica/impl/ob/gm;",
            ">;"
        }
    .end annotation

    .line 79
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/br;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->G()Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->b()Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 85
    :cond_0
    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 86
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 87
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    .line 88
    new-instance v4, Lcom/yandex/metrica/impl/ob/gm;

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/ob/gm;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    :catch_0
    return-object v2
.end method

.method c()Ljava/util/ArrayList;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/yandex/metrica/impl/ob/gm;",
            ">;"
        }
    .end annotation

    .line 102
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/br;->a()Lcom/yandex/metrica/impl/ob/ab;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 104
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x4000

    .line 103
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 107
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x18

    .line 2045
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2046
    new-instance v2, Lcom/yandex/metrica/impl/ob/gl$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/gl$a;-><init>()V

    goto :goto_0

    .line 2048
    :cond_0
    new-instance v2, Lcom/yandex/metrica/impl/ob/gl$b;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/gl$b;-><init>()V

    .line 110
    :goto_0
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    if-eqz v3, :cond_1

    .line 111
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->reqFeatures:[Landroid/content/pm/FeatureInfo;

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v0, v4

    .line 112
    invoke-virtual {v2, v5}, Lcom/yandex/metrica/impl/ob/gl;->b(Landroid/content/pm/FeatureInfo;)Lcom/yandex/metrica/impl/ob/gm;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-object v1

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
