.class public Lcom/yandex/metrica/impl/ob/hw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    return-void
.end method

.method private static a(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ""

    .line 63
    invoke-virtual {v1, p1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private a(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V
    .locals 6

    .line 100
    new-instance v0, Lcom/yandex/metrica/impl/ob/fk;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 101
    new-instance p1, Lcom/yandex/metrica/impl/ob/ie;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    invoke-direct {p1, v1, p2}, Lcom/yandex/metrica/impl/ob/ie;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 103
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 104
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 105
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 107
    :cond_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ie;->a()Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 109
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 111
    :cond_1
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 113
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 115
    :cond_2
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 117
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 119
    :cond_3
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 121
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 123
    :cond_4
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 124
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 125
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fk;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    :cond_5
    const-wide/16 v1, -0x1

    .line 127
    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/ie;->a(J)J

    move-result-wide v3

    cmp-long v5, v3, v1

    if-eqz v5, :cond_6

    .line 129
    invoke-virtual {v0, v3, v4}, Lcom/yandex/metrica/impl/ob/fk;->a(J)Lcom/yandex/metrica/impl/ob/fk;

    .line 131
    :cond_6
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/ie;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 132
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 133
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/fk;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    .line 136
    :cond_7
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fk;->i()V

    .line 137
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ie;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    const-string v1, "_bidoptpreferences"

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 37
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 1071
    sget-object v1, Lcom/yandex/metrica/impl/ob/ie;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1072
    new-instance v3, Lcom/yandex/metrica/impl/ob/ie;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/yandex/metrica/impl/ob/ie;-><init>(Landroid/content/Context;)V

    .line 1073
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v2}, Lcom/yandex/metrica/impl/ob/ie;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1074
    invoke-virtual {v3, v1}, Lcom/yandex/metrica/impl/ob/ie;->j(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ie;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ie;->j()V

    .line 1075
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    sget-object v3, Lcom/yandex/metrica/impl/ob/ie;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2046
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 2047
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 2048
    sget-object v3, Lcom/yandex/metrica/impl/ob/ie;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/yandex/metrica/impl/ob/hw;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 2049
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 2050
    new-instance v4, Lcom/yandex/metrica/impl/ob/ig;

    sget-object v5, Lcom/yandex/metrica/impl/ob/ie;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2051
    new-instance v5, Lcom/yandex/metrica/impl/ob/ie;

    iget-object v6, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    invoke-direct {v5, v6, v3}, Lcom/yandex/metrica/impl/ob/ie;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 2052
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v5, v2}, Lcom/yandex/metrica/impl/ob/ie;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2053
    invoke-virtual {v5, v4}, Lcom/yandex/metrica/impl/ob/ie;->i(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ie;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ie;->j()V

    goto :goto_0

    .line 41
    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_3
    return-void
.end method

.method public b()V
    .locals 5

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    const-string v2, "_startupserviceinfopreferences"

    .line 82
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/ih;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 2142
    new-instance v2, Lcom/yandex/metrica/impl/ob/fk;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 2143
    sget-object v4, Lcom/yandex/metrica/impl/ob/ie;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2144
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/fk;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v4

    iget-object v4, v4, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2145
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/fk;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fk;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/fk;->i()V

    .line 2146
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    sget-object v3, Lcom/yandex/metrica/impl/ob/ie;->c:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2152
    :cond_0
    new-instance v2, Lcom/yandex/metrica/impl/ob/fk;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    .line 2153
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 2154
    sget-object v3, Lcom/yandex/metrica/impl/ob/ie;->e:Lcom/yandex/metrica/impl/ob/ig;

    .line 2155
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 2154
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2159
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/fk;->a(Z)Lcom/yandex/metrica/impl/ob/fk;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/fk;->i()V

    .line 86
    :cond_1
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hw;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/yandex/metrica/impl/ob/hw;->a(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    .line 3092
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 3093
    sget-object v2, Lcom/yandex/metrica/impl/ob/ie;->d:Lcom/yandex/metrica/impl/ob/ig;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ig;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/hw;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 3094
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 3095
    invoke-direct {p0, v0, v2}, Lcom/yandex/metrica/impl/ob/hw;->a(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method
