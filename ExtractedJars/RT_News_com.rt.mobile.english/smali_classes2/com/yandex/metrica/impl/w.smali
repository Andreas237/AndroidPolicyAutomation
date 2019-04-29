.class public final Lcom/yandex/metrica/impl/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    return-void
.end method

.method static a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 196
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    :cond_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/w;
    .locals 0

    .line 63
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/w;->c()Lcom/yandex/metrica/impl/w;

    .line 66
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/w;->b()Lcom/yandex/metrica/impl/w;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p0
.end method

.method a(Landroid/content/Context;)Lcom/yandex/metrica/impl/w;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    const-string v1, "dfid"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "apps"

    .line 129
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "names"

    .line 130
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONArray;

    const-string v2, "system_flags"

    .line 131
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v2, v3}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONArray;

    const-string v3, "disabled_flags"

    .line 132
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v3, v4}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONArray;

    const-string v4, "first_install_time"

    .line 133
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v4, v5}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONArray;

    const-string v5, "last_update_time"

    .line 135
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v5, v6}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/json/JSONArray;

    const-string v6, "version"

    const/4 v7, 0x0

    .line 138
    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1237
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object p1

    .line 140
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 141
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 142
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v8, 0x1

    and-int/2addr v6, v8

    if-ne v6, v8, :cond_0

    move v6, v8

    goto :goto_1

    :cond_0
    move v6, v7

    :goto_1
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 143
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-boolean v6, v6, Landroid/content/pm/ApplicationInfo;->enabled:Z

    xor-int/2addr v6, v8

    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 2151
    iget-wide v8, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v10, 0x3e8

    div-long/2addr v8, v10

    invoke-virtual {v4, v8, v9}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 2155
    iget-wide v8, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    div-long/2addr v8, v10

    invoke-virtual {v5, v8, v9}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method a(Landroid/content/Context;Z)Lcom/yandex/metrica/impl/w;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    const-string v1, "dfid"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "au"

    .line 84
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "aun"

    .line 85
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONArray;

    const-string v2, "ausf"

    .line 86
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 87
    invoke-static {v0, v2, v3}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONArray;

    const-string v3, "audf"

    .line 88
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 89
    invoke-static {v0, v3, v4}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONArray;

    const-string v4, "aulu"

    .line 90
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 91
    invoke-static {v0, v4, v5}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONArray;

    .line 92
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    if-eqz p2, :cond_0

    const-string v6, "aufi"

    .line 94
    invoke-static {v0, v6, v5}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 99
    new-instance v6, Ljava/lang/String;

    const-string v7, "YW5kcm9pZC5pbnRlbnQuYWN0aW9uLk1BSU4="

    const/4 v8, 0x0

    .line 100
    invoke-static {v7, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    const-string v9, "UTF-8"

    invoke-direct {v6, v7, v9}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    new-instance v7, Ljava/lang/String;

    const-string v9, "YW5kcm9pZC5pbnRlbnQuY2F0ZWdvcnkuTEFVTkNIRVI="

    .line 101
    invoke-static {v9, v8}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-direct {v7, v9, v10}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 99
    invoke-static {p1, v6, v7}, Lcom/yandex/metrica/impl/br;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/ResolveInfo;

    .line 102
    iget-object v7, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 103
    iget-object v9, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 104
    iget-object v9, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 105
    iget v9, v7, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v10, 0x1

    and-int/2addr v9, v10

    if-ne v9, v10, :cond_2

    move v9, v10

    goto :goto_1

    :cond_2
    move v9, v8

    .line 106
    :goto_1
    invoke-virtual {v2, v9}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 107
    new-instance v11, Ljava/io/File;

    iget-object v12, v7, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    move-result-wide v11

    invoke-virtual {v4, v11, v12}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 108
    iget-boolean v11, v7, Landroid/content/pm/ApplicationInfo;->enabled:Z

    xor-int/2addr v10, v11

    invoke-virtual {v3, v10}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    if-eqz p2, :cond_1

    if-eqz v9, :cond_3

    .line 111
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    goto :goto_0

    .line 113
    :cond_3
    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {p1, v7}, Lcom/yandex/metrica/impl/br;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v7

    if-nez v7, :cond_4

    .line 115
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    goto :goto_0

    .line 117
    :cond_4
    iget-wide v9, v7, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-wide/16 v11, 0x3e8

    div-long/2addr v9, v11

    invoke-virtual {v5, v9, v10}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method b()Lcom/yandex/metrica/impl/w;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    const-string v1, "dfid"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "boot_time"

    .line 1021
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long v6, v2, v4

    const-wide/16 v2, 0x3e8

    .line 77
    div-long/2addr v6, v2

    invoke-virtual {v0, v1, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-object p0
.end method

.method c()Lcom/yandex/metrica/impl/w;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    const-string v1, "dfid"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/w;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const/4 v1, 0x1

    .line 160
    invoke-static {v1}, Lcom/yandex/metrica/impl/as;->a(Z)J

    move-result-wide v2

    const/4 v4, 0x0

    .line 161
    invoke-static {v4}, Lcom/yandex/metrica/impl/as;->a(Z)J

    move-result-wide v5

    .line 163
    invoke-static {v1}, Lcom/yandex/metrica/impl/as;->c(Z)J

    move-result-wide v7

    .line 164
    invoke-static {v4}, Lcom/yandex/metrica/impl/as;->c(Z)J

    move-result-wide v9

    const-string v1, "tds"

    add-long v11, v2, v5

    .line 166
    invoke-virtual {v0, v1, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "fds"

    add-long v2, v7, v9

    .line 167
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/yandex/metrica/impl/w;->a:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
