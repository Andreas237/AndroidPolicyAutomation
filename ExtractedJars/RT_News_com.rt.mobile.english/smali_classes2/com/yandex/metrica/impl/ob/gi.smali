.class public Lcom/yandex/metrica/impl/ob/gi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/gi$c;,
        Lcom/yandex/metrica/impl/ob/gi$a;,
        Lcom/yandex/metrica/impl/ob/gi$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/yandex/metrica/impl/ob/gi$a;

.field private final c:Lcom/yandex/metrica/impl/ob/gk;

.field private d:Lcom/yandex/metrica/impl/ob/gh;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    .line 69
    new-instance v0, Lcom/yandex/metrica/impl/ob/gi$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/ob/gi$a;-><init>(Lcom/yandex/metrica/impl/ob/gi;B)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->b:Lcom/yandex/metrica/impl/ob/gi$a;

    .line 70
    new-instance v0, Lcom/yandex/metrica/impl/ob/gk;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/gk;-><init>(Lcom/yandex/metrica/impl/ob/gi;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->c:Lcom/yandex/metrica/impl/ob/gk;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/gi;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/yandex/metrica/impl/ob/gh;
    .locals 2

    .line 144
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x2000

    .line 146
    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 149
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 1180
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 148
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->h(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static a()Lcom/yandex/metrica/impl/ob/gi;
    .locals 1

    .line 64
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi$b;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    return-object v0
.end method

.method private h(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;
    .locals 5

    const/4 v0, 0x0

    .line 161
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 163
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    :try_start_1
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/u;->a(Landroid/content/Context;Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    .line 165
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_0

    return-object v0

    .line 166
    :cond_0
    :try_start_2
    new-instance p2, Lcom/yandex/metrica/impl/ob/gh;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    invoke-direct {p2, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/gh;-><init>(Lorg/json/JSONObject;J)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p2

    :catchall_0
    move-exception p1

    .line 165
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method private i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 238
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 239
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->c()Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v1

    if-nez v1, :cond_4

    .line 240
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 242
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->e()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 243
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object p2

    .line 244
    invoke-virtual {v1, p2}, Lcom/yandex/metrica/impl/ob/gh;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/gh;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 245
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Lcom/yandex/metrica/impl/ob/gh;)V

    .line 246
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 248
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->b()Lcom/yandex/metrica/impl/ob/gi$a;

    move-result-object p2

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Lcom/yandex/metrica/impl/ob/gi$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 251
    :cond_1
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gh;->e()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 252
    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Lcom/yandex/metrica/impl/ob/gh;)V

    .line 253
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 255
    :cond_2
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->b()Lcom/yandex/metrica/impl/ob/gi$a;

    move-result-object p2

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Lcom/yandex/metrica/impl/ob/gi$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 259
    :cond_3
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->b()Lcom/yandex/metrica/impl/ob/gi$a;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/gi$a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 262
    :cond_4
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->c()Lcom/yandex/metrica/impl/ob/gh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 264
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method a(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;
    .locals 1

    const-string v0, "credentials.dat"

    .line 130
    invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 129
    invoke-direct {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 234
    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/gi;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method a(Lcom/yandex/metrica/impl/ob/gh;)V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gi;->d:Lcom/yandex/metrica/impl/ob/gh;

    .line 97
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/gi;->d:Lcom/yandex/metrica/impl/ob/gh;

    if-eqz p1, :cond_0

    .line 98
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    new-instance v1, Lcom/yandex/metrica/impl/ob/o;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gi;->d:Lcom/yandex/metrica/impl/ob/gh;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    .line 100
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method b(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gh;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 136
    new-instance v0, Ljava/io/File;

    .line 137
    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "credentials.dat"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 136
    invoke-direct {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/yandex/metrica/impl/ob/gh;

    move-result-object p1

    return-object p1
.end method

.method b()Lcom/yandex/metrica/impl/ob/gi$a;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 77
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->b:Lcom/yandex/metrica/impl/ob/gi$a;

    return-object v0
.end method

.method c()Lcom/yandex/metrica/impl/ob/gh;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->d:Lcom/yandex/metrica/impl/ob/gh;

    return-object v0
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 192
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 110
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->c()Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_0
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 202
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :try_start_1
    new-instance v1, Lcom/yandex/metrica/impl/ob/gh;

    new-instance v2, Lcom/yandex/metrica/impl/ob/gj;

    invoke-direct {v2, p1}, Lcom/yandex/metrica/impl/ob/gj;-><init>(Landroid/content/Context;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, p2, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/gh;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/gj;J)V

    invoke-virtual {p0, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Lcom/yandex/metrica/impl/ob/gh;)V

    .line 204
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/gi;->d:Lcom/yandex/metrica/impl/ob/gh;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/gh;->a()Ljava/lang/String;

    move-result-object p2

    .line 205
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gi;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 206
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->e(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    const-string v1, "credentials.dat"

    .line 1186
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1187
    :try_start_2
    invoke-static {p1, v1, p2}, Lcom/yandex/metrica/impl/u;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1188
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 1188
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    .line 209
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    return-void
.end method

.method e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "credentials.dat"

    .line 219
    invoke-static {p1, v1, p2}, Lcom/yandex/metrica/impl/u;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method e()Z
    .locals 1

    const/16 v0, 0x15

    .line 196
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    return v0
.end method

.method f()Lcom/yandex/metrica/impl/ob/gk;
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gi;->c:Lcom/yandex/metrica/impl/ob/gk;

    return-object v0
.end method

.method f(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 225
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "saving_empty_device_id"

    new-instance v2, Lcom/yandex/metrica/impl/ob/gi$c;

    invoke-direct {v2, p1, p2}, Lcom/yandex/metrica/impl/ob/gi$c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 227
    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 229
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/gi;->d(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method g(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".MetricaContentProvider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 270
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 272
    iget-boolean v0, v0, Landroid/content/pm/ProviderInfo;->enabled:Z

    if-nez v0, :cond_0

    goto :goto_2

    .line 276
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "content://%s.MetricaContentProvider/DEVICE_ID"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v2

    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 281
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_1

    .line 282
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "DEVICE_ID"

    .line 283
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, p2

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catchall_1
    move-exception p2

    move-object p1, v1

    .line 290
    :goto_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 291
    throw p2

    :catch_0
    move-object p1, v1

    .line 290
    :catch_1
    :cond_1
    :goto_1
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    return-object v1

    :cond_2
    :goto_2
    return-object v1
.end method
