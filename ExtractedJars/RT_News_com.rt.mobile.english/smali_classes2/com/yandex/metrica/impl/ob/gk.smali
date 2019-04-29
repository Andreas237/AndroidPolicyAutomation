.class public Lcom/yandex/metrica/impl/ob/gk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/gi;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gi;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 146
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    .line 147
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/impl/ob/gf;

    .line 148
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/gf;->d()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/ob/ge;

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ge;->c()Lcom/yandex/metrica/impl/bl$a;

    move-result-object v4

    iget-object v4, v4, Lcom/yandex/metrica/impl/bl$a;->e:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v2, v3

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    return-object v0

    .line 157
    :cond_2
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gf;->a()Z

    move-result p0

    if-nez p0, :cond_3

    .line 158
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 159
    :cond_3
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gf;->a()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 160
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 162
    :cond_4
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "method_carriers_count"

    .line 88
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/impl/ob/gf;

    .line 95
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/gf;->b()I

    move-result v4

    if-le v4, v2, :cond_1

    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 98
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_1
    if-ne v4, v2, :cond_0

    .line 101
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v2, 0x1

    if-ne p2, v2, :cond_3

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/gf;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 110
    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/yandex/metrica/impl/ob/gf;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/gf;->b()I

    move-result p2

    if-ne p2, v2, :cond_4

    .line 111
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_6

    .line 114
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gk;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_5

    .line 116
    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 118
    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_6
    move-object p1, p2

    :goto_2
    return-object p1
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;"
        }
    .end annotation

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/gf;

    .line 128
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gf;->a()Z

    move-result v2

    if-nez v2, :cond_0

    .line 129
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 132
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 5255
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p0

    const-string v0, "multiple_device_ids"

    .line 242
    new-instance v1, Lcom/yandex/metrica/impl/ob/gk$3;

    invoke-direct {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/gk$3;-><init>(Ljava/lang/String;I)V

    invoke-interface {p0, v0, v1}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "method_device_id_comparing"

    .line 197
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/lang/String;I)V

    const-string p0, ""

    .line 200
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/gf;

    .line 201
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 202
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/ge;",
            ">;)V"
        }
    .end annotation

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ge;

    .line 211
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ge;->c()Lcom/yandex/metrica/impl/bl$a;

    move-result-object v2

    iget-object v2, v2, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ge;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 4255
    :cond_0
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p0

    const-string p1, "multiple_device_ids"

    .line 217
    new-instance v1, Lcom/yandex/metrica/impl/ob/gk$1;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/ob/gk$1;-><init>(Ljava/lang/StringBuilder;)V

    invoke-interface {p0, p1, v1}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 47
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gk;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method a(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/gf;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "method_first_installed"

    .line 170
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-wide v1, 0x7fffffffffffffffL

    .line 174
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 175
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/gf;

    .line 176
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gf;->e()Ljava/lang/Long;

    move-result-object v3

    .line 177
    invoke-virtual {v3, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v4

    if-gez v4, :cond_1

    .line 179
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 180
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v1, v3

    goto :goto_0

    :cond_1
    if-nez v4, :cond_0

    .line 183
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 186
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_3

    const/4 p1, 0x0

    .line 187
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/gf;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 189
    :cond_3
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/gk;->b(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method b(Landroid/content/Context;)Ljava/lang/String;
    .locals 10
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/ob/gj;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/gj;-><init>(Landroid/content/Context;)V

    .line 1286
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gk;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    .line 1288
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1290
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 1293
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/bl$a;

    .line 1294
    iget-object v6, v4, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    invoke-static {v6}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageItemInfo;)I

    move-result v6

    const/16 v7, 0x1d

    if-ge v6, v7, :cond_1

    .line 1296
    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1298
    :cond_1
    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    invoke-virtual {v6}, Lcom/yandex/metrica/impl/ob/gi;->e()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 2259
    iget-object v6, v4, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    iget-object v6, v6, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2260
    iget-object v7, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    invoke-virtual {v7, p1, v6}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v7

    .line 2261
    iget-object v8, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    invoke-virtual {v8, p1, v6}, Lcom/yandex/metrica/impl/ob/gi;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v6

    if-nez v7, :cond_2

    if-nez v6, :cond_2

    goto :goto_1

    .line 2265
    :cond_2
    new-instance v5, Lcom/yandex/metrica/impl/ob/gg;

    invoke-direct {v5, v4, v6, v7}, Lcom/yandex/metrica/impl/ob/gg;-><init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;Lcom/yandex/metrica/impl/ob/gh;)V

    goto :goto_1

    .line 2270
    :cond_3
    iget-object v6, v4, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    iget-object v6, v6, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 2271
    iget-object v7, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    invoke-virtual {v7, p1, v6}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 2273
    invoke-virtual {v6}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v7

    .line 2274
    invoke-static {v7}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 2275
    new-instance v5, Lcom/yandex/metrica/impl/ob/ge;

    invoke-direct {v5, v4, v6}, Lcom/yandex/metrica/impl/ob/ge;-><init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;)V

    :cond_4
    :goto_1
    if-eqz v5, :cond_0

    .line 1300
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1305
    :cond_5
    invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/yandex/metrica/impl/bl$a;

    .line 1306
    iget-object v4, v3, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 1307
    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/gk;->a:Lcom/yandex/metrica/impl/ob/gi;

    invoke-virtual {v6, p1, v4}, Lcom/yandex/metrica/impl/ob/gi;->g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1308
    invoke-static {v4}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    .line 1310
    new-instance v6, Lcom/yandex/metrica/impl/ob/ge;

    new-instance v7, Lcom/yandex/metrica/impl/ob/gh;

    const-wide/16 v8, -0x1

    invoke-direct {v7, v4, v5, v8, v9}, Lcom/yandex/metrica/impl/ob/gh;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gj;J)V

    invoke-direct {v6, v3, v7}, Lcom/yandex/metrica/impl/ob/ge;-><init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const-string v1, ""

    .line 56
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c

    .line 57
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 59
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/yandex/metrica/impl/ob/ge;

    .line 60
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/ge;->a()Ljava/lang/String;

    move-result-object v6

    .line 61
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/yandex/metrica/impl/ob/gf;

    if-nez v7, :cond_8

    .line 64
    new-instance v7, Lcom/yandex/metrica/impl/ob/gf;

    invoke-direct {v7, v6, v0}, Lcom/yandex/metrica/impl/ob/gf;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gj;)V

    .line 65
    invoke-virtual {v3, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_8
    invoke-virtual {v7, v5}, Lcom/yandex/metrica/impl/ob/gf;->a(Lcom/yandex/metrica/impl/ob/ge;)V

    goto :goto_3

    .line 70
    :cond_9
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_b

    .line 71
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/gf;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gf;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_a
    const-string v0, "Smth wrong when iterate through initial candidates list"

    .line 3227
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 3229
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3255
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p1

    const-string v0, "multiple_device_ids"

    .line 3234
    new-instance v3, Lcom/yandex/metrica/impl/ob/gk$2;

    invoke-direct {v3, v2}, Lcom/yandex/metrica/impl/ob/gk$2;-><init>(Ljava/lang/StringBuilder;)V

    invoke-interface {p1, v0, v3}, Lcom/yandex/metrica/IReporter;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_4

    .line 79
    :cond_b
    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/ob/gk;->c(Landroid/content/Context;Ljava/util/List;)V

    .line 80
    invoke-direct {p0, p1, v3}, Lcom/yandex/metrica/impl/ob/gk;->a(Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_c
    :goto_4
    return-object v1
.end method

.method c(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bl$a;",
            ">;"
        }
    .end annotation

    .line 318
    invoke-static {p1}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/bl;->b(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
