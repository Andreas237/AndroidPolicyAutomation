.class public Lcom/yandex/metrica/impl/ob/eu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/yandex/metrica/impl/ob/eu;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/et;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/ev;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/ep;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/Context;

.field private f:Lcom/yandex/metrica/impl/ob/et;

.field private g:Lcom/yandex/metrica/impl/ob/ep;

.field private h:Lcom/yandex/metrica/impl/ob/ev;

.field private i:Lcom/yandex/metrica/impl/ob/ev;

.field private j:Lcom/yandex/metrica/impl/ob/ev;

.field private k:Lcom/yandex/metrica/impl/ob/ex;

.field private l:Lcom/yandex/metrica/impl/ob/ew;

.field private m:Lcom/yandex/metrica/impl/ob/ey;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->b:Ljava/util/Map;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->c:Ljava/util/Map;

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->d:Ljava/util/Map;

    .line 66
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;
    .locals 2

    .line 41
    sget-object v0, Lcom/yandex/metrica/impl/ob/eu;->a:Lcom/yandex/metrica/impl/ob/eu;

    if-nez v0, :cond_1

    .line 42
    const-class v0, Lcom/yandex/metrica/impl/ob/eu;

    monitor-enter v0

    .line 43
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/eu;->a:Lcom/yandex/metrica/impl/ob/eu;

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Lcom/yandex/metrica/impl/ob/eu;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/eu;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/ob/eu;->a:Lcom/yandex/metrica/impl/ob/eu;

    .line 46
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 48
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/ob/eu;->a:Lcom/yandex/metrica/impl/ob/eu;

    return-object p0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x15

    .line 179
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/eu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 189
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v0

    .line 190
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 191
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 192
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-virtual {v2, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 193
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 195
    invoke-virtual {v2, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 198
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-journal"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 199
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 200
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 204
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object p1
.end method


# virtual methods
.method public declared-synchronized a()Lcom/yandex/metrica/impl/ob/et;
    .locals 2

    monitor-enter p0

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->f:Lcom/yandex/metrica/impl/ob/et;

    if-nez v0, :cond_0

    const-string v0, "metrica_data.db"

    .line 86
    invoke-static {}, Lcom/yandex/metrica/impl/ob/eq;->b()Lcom/yandex/metrica/impl/ob/ez;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/eu;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ez;)Lcom/yandex/metrica/impl/ob/et;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->f:Lcom/yandex/metrica/impl/ob/et;

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->f:Lcom/yandex/metrica/impl/ob/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 84
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/et;
    .locals 2

    monitor-enter p0

    .line 1212
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "db_metrica_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/et;

    if-nez v0, :cond_0

    .line 77
    invoke-static {}, Lcom/yandex/metrica/impl/ob/eq;->a()Lcom/yandex/metrica/impl/ob/ez;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/eu;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ez;)Lcom/yandex/metrica/impl/ob/et;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 69
    monitor-exit p0

    throw p1
.end method

.method a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ez;)Lcom/yandex/metrica/impl/ob/et;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 175
    new-instance v0, Lcom/yandex/metrica/impl/ob/et;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1, p2}, Lcom/yandex/metrica/impl/ob/et;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ez;)V

    return-object v0
.end method

.method public declared-synchronized b()Lcom/yandex/metrica/impl/ob/ep;
    .locals 3

    monitor-enter p0

    .line 118
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->g:Lcom/yandex/metrica/impl/ob/ep;

    if-nez v0, :cond_0

    .line 119
    new-instance v0, Lcom/yandex/metrica/impl/ob/ep;

    new-instance v1, Lcom/yandex/metrica/impl/ob/fe;

    .line 121
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/fe;-><init>(Lcom/yandex/metrica/impl/ob/et;)V

    const-string v2, "binary_data"

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ep;-><init>(Lcom/yandex/metrica/impl/ob/fc;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->g:Lcom/yandex/metrica/impl/ob/ep;

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->g:Lcom/yandex/metrica/impl/ob/ep;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 117
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/ev;
    .locals 3

    monitor-enter p0

    .line 92
    :try_start_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->c:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ev;

    if-nez v1, :cond_0

    .line 95
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/et;

    move-result-object p1

    .line 96
    new-instance v1, Lcom/yandex/metrica/impl/ob/ev;

    const-string v2, "preferences"

    invoke-direct {v1, p1, v2}, Lcom/yandex/metrica/impl/ob/ev;-><init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V

    .line 97
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/eu;->c:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_0
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    .line 91
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/ep;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 104
    :try_start_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v0

    .line 105
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ep;

    if-nez v1, :cond_0

    .line 107
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/et;

    move-result-object p1

    .line 108
    new-instance v1, Lcom/yandex/metrica/impl/ob/ep;

    new-instance v2, Lcom/yandex/metrica/impl/ob/fe;

    invoke-direct {v2, p1}, Lcom/yandex/metrica/impl/ob/fe;-><init>(Lcom/yandex/metrica/impl/ob/et;)V

    const-string p1, "binary_data"

    invoke-direct {v1, v2, p1}, Lcom/yandex/metrica/impl/ob/ep;-><init>(Lcom/yandex/metrica/impl/ob/fc;Ljava/lang/String;)V

    .line 112
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/eu;->d:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    :cond_0
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    .line 103
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()Lcom/yandex/metrica/impl/ob/ev;
    .locals 3

    monitor-enter p0

    .line 129
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->h:Lcom/yandex/metrica/impl/ob/ev;

    if-nez v0, :cond_0

    .line 130
    new-instance v0, Lcom/yandex/metrica/impl/ob/ev;

    .line 131
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v1

    const-string v2, "preferences"

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ev;-><init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->h:Lcom/yandex/metrica/impl/ob/ev;

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->h:Lcom/yandex/metrica/impl/ob/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 128
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Lcom/yandex/metrica/impl/ob/ey;
    .locals 3

    monitor-enter p0

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->m:Lcom/yandex/metrica/impl/ob/ey;

    if-nez v0, :cond_0

    .line 138
    new-instance v0, Lcom/yandex/metrica/impl/ob/ey;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v1

    const-string v2, "permissions"

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ey;-><init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->m:Lcom/yandex/metrica/impl/ob/ey;

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->m:Lcom/yandex/metrica/impl/ob/ey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 136
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Lcom/yandex/metrica/impl/ob/ev;
    .locals 3

    monitor-enter p0

    .line 144
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->i:Lcom/yandex/metrica/impl/ob/ev;

    if-nez v0, :cond_0

    .line 145
    new-instance v0, Lcom/yandex/metrica/impl/ob/ev;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v1

    const-string v2, "startup"

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ev;-><init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->i:Lcom/yandex/metrica/impl/ob/ev;

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->i:Lcom/yandex/metrica/impl/ob/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 143
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()Lcom/yandex/metrica/impl/ob/ev;
    .locals 3

    monitor-enter p0

    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->j:Lcom/yandex/metrica/impl/ob/ev;

    if-nez v0, :cond_0

    const-string v0, "metrica_client_data.db"

    .line 152
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/eu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 153
    new-instance v1, Lcom/yandex/metrica/impl/ob/fd;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Lcom/yandex/metrica/impl/ob/fd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 154
    new-instance v0, Lcom/yandex/metrica/impl/ob/ev;

    const-string v2, "preferences"

    invoke-direct {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/ev;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/fc;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->j:Lcom/yandex/metrica/impl/ob/ev;

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->j:Lcom/yandex/metrica/impl/ob/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 150
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()Lcom/yandex/metrica/impl/ob/ex;
    .locals 3

    monitor-enter p0

    .line 160
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->k:Lcom/yandex/metrica/impl/ob/ex;

    if-nez v0, :cond_0

    .line 161
    new-instance v0, Lcom/yandex/metrica/impl/ob/ex;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ex;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/et;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->k:Lcom/yandex/metrica/impl/ob/ex;

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->k:Lcom/yandex/metrica/impl/ob/ex;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 159
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h()Lcom/yandex/metrica/impl/ob/ew;
    .locals 3

    monitor-enter p0

    .line 167
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->l:Lcom/yandex/metrica/impl/ob/ew;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Lcom/yandex/metrica/impl/ob/ew;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/eu;->e:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/eu;->a()Lcom/yandex/metrica/impl/ob/et;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ew;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/et;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->l:Lcom/yandex/metrica/impl/ob/ew;

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/eu;->l:Lcom/yandex/metrica/impl/ob/ew;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 166
    monitor-exit p0

    throw v0
.end method
