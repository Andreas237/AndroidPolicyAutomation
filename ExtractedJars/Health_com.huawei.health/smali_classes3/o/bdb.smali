.class public final Lo/bdb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    .line 54
    return-void
.end method

.method private declared-synchronized a(Ljava/lang/String;)I
    .locals 4

    monitor-enter p0

    .line 61
    const/4 v3, 0x0

    .line 62
    :try_start_0
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 65
    const-string v0, "UrlPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hit cache, result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_0
    monitor-exit p0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Ljava/lang/String;)Z
    .locals 12

    .line 161
    const/4 v6, 0x0

    .line 162
    const-string v0, "content://com.huawei.systemmanager.BlockCheckProvider/checkurl/0"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 163
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v8, v0

    .line 164
    const/4 v9, 0x0

    .line 167
    :try_start_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v7

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 173
    goto :goto_0

    .line 169
    :catch_0
    move-exception v10

    .line 172
    const-string v0, "UrlPolicy"

    const-string v1, "query SystemManager block url meet Exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    :goto_0
    if-eqz v9, :cond_3

    .line 176
    const/4 v10, 0x0

    .line 177
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 179
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 180
    const-string v0, "result"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 181
    if-ltz v11, :cond_0

    .line 183
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    goto :goto_1

    .line 187
    :cond_0
    const-string v0, "UrlPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query SystemManager block url,cursor wrong index:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_1
    :goto_1
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 193
    const/4 v0, 0x1

    if-ne v10, v0, :cond_2

    .line 196
    const/4 v6, 0x1

    .line 198
    :cond_2
    const-string v0, "UrlPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query SystemManager block url,the value:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    goto :goto_2

    .line 202
    :cond_3
    const-string v0, "UrlPolicy"

    const-string v1, "query SystemManager block url.the cursor is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_2
    return v6
.end method

.method private declared-synchronized c(Ljava/lang/String;I)V
    .locals 3

    monitor-enter p0

    .line 76
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 79
    monitor-exit p0

    return-void

    .line 82
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    .line 87
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 88
    iget-object v0, p0, Lo/bdb;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 3

    .line 235
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 237
    const/4 v0, 0x0

    return v0

    .line 240
    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 242
    if-nez v2, :cond_1

    .line 244
    const-string v0, "UrlPolicy"

    const-string v1, "host is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const/4 v0, 0x0

    return v0

    .line 249
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 252
    const-string v0, ".huawei.com"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ".vmall.com"

    .line 253
    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ".hicloud.com"

    .line 254
    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ".hotalk.com"

    .line 255
    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 252
    :goto_0
    return v0
.end method

.method private static d(Ljava/lang/String;)I
    .locals 3

    .line 212
    const/4 v1, 0x0

    .line 215
    new-instance v0, Lo/arh;

    invoke-direct {v0}, Lo/arh;-><init>()V

    invoke-virtual {v0, p0}, Lo/arh;->e(Ljava/lang/String;)I

    move-result v2

    .line 216
    if-nez v2, :cond_0

    .line 218
    const/4 v1, 0x1

    goto :goto_0

    .line 220
    :cond_0
    const/4 v0, 0x1

    if-ne v2, v0, :cond_1

    .line 222
    const/4 v1, 0x2

    .line 225
    :cond_1
    :goto_0
    return v1
.end method

.method private static d(I)Z
    .locals 1

    .line 95
    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public e(Ljava/lang/String;)Z
    .locals 2

    .line 107
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    const/4 v0, 0x1

    return v0

    .line 119
    :cond_0
    invoke-static {p1}, Lo/bdb;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    const/4 v0, 0x1

    return v0

    .line 130
    :cond_1
    invoke-direct {p0, p1}, Lo/bdb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_2
    invoke-direct {p0, p1}, Lo/bdb;->a(Ljava/lang/String;)I

    move-result v1

    .line 140
    if-nez v1, :cond_3

    .line 142
    invoke-static {p1}, Lo/bdb;->d(Ljava/lang/String;)I

    move-result v1

    .line 143
    if-eqz v1, :cond_3

    .line 146
    invoke-direct {p0, p1, v1}, Lo/bdb;->c(Ljava/lang/String;I)V

    .line 150
    :cond_3
    invoke-static {v1}, Lo/bdb;->d(I)Z

    move-result v0

    return v0
.end method
