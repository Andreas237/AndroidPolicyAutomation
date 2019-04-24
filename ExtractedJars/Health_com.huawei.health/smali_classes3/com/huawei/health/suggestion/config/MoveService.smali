.class public Lcom/huawei/health/suggestion/config/MoveService;
.super Landroid/app/IntentService;
.source "SourceFile"


# instance fields
.field private b:Z

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    const-string v0, "MoveService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->d:Z

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->b:Z

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->e:Z

    .line 45
    return-void
.end method

.method private a()Z
    .locals 14

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 174
    const/4 v6, 0x0

    .line 175
    invoke-static {}, Lo/bsm;->a()Ljava/lang/String;

    move-result-object v7

    .line 176
    invoke-static {}, Lo/bsm;->e()[Ljava/lang/String;

    move-result-object v8

    .line 177
    invoke-static {}, Lo/bsm;->b()[Ljava/lang/String;

    move-result-object v9

    .line 178
    const/4 v10, 0x0

    :goto_0
    array-length v0, v8

    if-ge v10, v0, :cond_2

    .line 179
    aget-object v11, v8, v10

    .line 180
    const/4 v12, 0x0

    :goto_1
    array-length v0, v9

    if-ge v12, v0, :cond_1

    .line 181
    aget-object v13, v9, v12

    .line 182
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/config/MoveService;->d(Ljava/io/File;Ljava/io/File;)Z

    move-result v6

    .line 183
    if-nez v6, :cond_0

    .line 184
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyOK = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    const/4 v0, 0x0

    return v0

    .line 180
    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 178
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 189
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 190
    const-string v0, "MoveService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent copy time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v10, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", copyOK = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x1

    return v0
.end method

.method private b()V
    .locals 3

    .line 134
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/config/MoveService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 135
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.health.suggestion.config.MoveService.DEL_ACTION"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 137
    return-void
.end method

.method private static b(Ljava/io/File;)V
    .locals 10

    .line 148
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    .line 149
    :cond_0
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDirWihtFile  dir == null || !dir.exists() || !dir.isDirectory()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void

    .line 153
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 154
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 155
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDirWihtFile  null == files"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void

    .line 159
    :cond_2
    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    aget-object v8, v5, v7

    .line 160
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 161
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v9

    .line 162
    const-string v0, "MoveService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDirWihtFile = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "   delFile = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 164
    invoke-static {v8}, Lcom/huawei/health/suggestion/config/MoveService;->b(Ljava/io/File;)V

    .line 159
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 167
    :cond_5
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v5

    .line 168
    const-string v0, "MoveService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDirWihtFile = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  delFileDir = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-void
.end method

.method private declared-synchronized b(Z)V
    .locals 0

    monitor-enter p0

    .line 287
    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/config/MoveService;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c()V
    .locals 4

    .line 123
    invoke-static {}, Lo/bsm;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->e(Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-static {}, Lo/bsm;->e()[Ljava/lang/String;

    move-result-object v1

    .line 126
    const/4 v2, 0x0

    :goto_0
    array-length v0, v1

    if-ge v2, v0, :cond_0

    .line 127
    aget-object v3, v1, v2

    .line 128
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/config/MoveService;->e(Ljava/lang/String;)V

    .line 126
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 131
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 6

    .line 337
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startService type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 339
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 340
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/config/MoveService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 341
    const-string v0, "TYPE_KEY"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 342
    invoke-virtual {p0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 343
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startService TYPE_CP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    goto :goto_0

    .line 345
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 346
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/config/MoveService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 347
    const-string v0, "TYPE_KEY"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 348
    invoke-virtual {p0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 349
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "clear_version"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v5

    .line 350
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "clear_version"

    add-int/lit8 v2, v5, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startService type TYPE_DEL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized c(Z)V
    .locals 0

    monitor-enter p0

    .line 279
    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/config/MoveService;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized d(Z)V
    .locals 0

    monitor-enter p0

    .line 271
    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/config/MoveService;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static d()Z
    .locals 2

    .line 296
    const-string v0, "IS_CP_COMPLETE_SD_KEY_MOVE_SERVICE"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 297
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 298
    const/4 v0, 0x0

    return v0

    .line 300
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 301
    const/4 v0, 0x1

    return v0

    .line 303
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static d(Ljava/io/File;)Z
    .locals 7

    .line 258
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lo/bsm;->d(Ljava/io/File;J)Z

    move-result v4

    .line 259
    if-nez v4, :cond_0

    .line 260
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 261
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/bsm;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 262
    if-nez v6, :cond_0

    .line 263
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "vaildFile validVideoFileAndToLastModified   =  false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private d(Ljava/io/File;Ljava/io/File;)Z
    .locals 10

    .line 196
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "from = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 200
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 201
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent null == files"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const/4 v0, 0x1

    return v0

    .line 205
    :cond_0
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "files = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    array-length v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_7

    .line 207
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isCpCancel() = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    const/4 v0, 0x0

    return v0

    .line 211
    :cond_1
    aget-object v6, v4, v5

    .line 212
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileFrom = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 215
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 217
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileTo.exists() == true  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bsm;->b(Ljava/lang/String;J)V

    .line 219
    goto/16 :goto_2

    .line 222
    :cond_2
    invoke-static {v6}, Lcom/huawei/health/suggestion/config/MoveService;->d(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 223
    goto/16 :goto_2

    .line 226
    :cond_3
    new-instance v8, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 227
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileToTemp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :try_start_0
    invoke-static {v6, v8}, Lo/bzz;->c(Ljava/io/File;Ljava/io/File;)Z

    move-result v9

    .line 230
    if-eqz v9, :cond_5

    .line 231
    invoke-virtual {v8, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 232
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileToTemp.renameTo(fileTo) = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bsm;->b(Ljava/lang/String;J)V

    goto :goto_1

    .line 235
    :cond_4
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileToTemp.renameTo(fileTo) = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 239
    :cond_5
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copy = false  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    :goto_1
    goto :goto_2

    .line 242
    :catch_0
    move-exception v9

    .line 243
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_6
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 248
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 140
    invoke-static {}, Lo/bsm;->b()[Ljava/lang/String;

    move-result-object v2

    .line 141
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_0

    .line 142
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v2, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-static {v4}, Lcom/huawei/health/suggestion/config/MoveService;->b(Ljava/io/File;)V

    .line 141
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 145
    :cond_0
    return-void
.end method

.method public static e()Z
    .locals 2

    .line 314
    const-string v0, "IS_DEL_COMPLETE_SD_KEY_MOVE_SERVICE"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 315
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 316
    const/4 v0, 0x0

    return v0

    .line 318
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 319
    const/4 v0, 0x1

    return v0

    .line 321
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized f()Z
    .locals 2

    monitor-enter p0

    .line 275
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private static g()V
    .locals 4

    .line 308
    const-string v0, "IS_CP_COMPLETE_SD_KEY_MOVE_SERVICE"

    const-string v1, "1"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCpCompletePref()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return-void
.end method

.method private static h()V
    .locals 4

    .line 326
    const-string v0, "IS_DEL_COMPLETE_SD_KEY_MOVE_SERVICE"

    const-string v1, "1"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDelCompletePref()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    return-void
.end method

.method private declared-synchronized i()Z
    .locals 2

    monitor-enter p0

    .line 283
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private declared-synchronized k()Z
    .locals 2

    monitor-enter p0

    .line 291
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/config/MoveService;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private static m()Z
    .locals 5

    .line 331
    invoke-static {}, Lo/bzp;->a()Lo/bzp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bzp;->b()Z

    move-result v4

    .line 332
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSDPermission() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    return v4
.end method


# virtual methods
.method public onCreate()V
    .locals 4

    .line 49
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 51
    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 6

    .line 91
    const-string v0, "MoveService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent(Intent intent) mIsCpDoing = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->k()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", mIsDelDoing = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 93
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->i()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",  mIsCpCancel = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 94
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->f()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 91
    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 96
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent(Intent intent) null == intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 100
    :cond_0
    const-string v0, "TYPE_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 101
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent(Intent intent)  typeValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x1

    if-ne v0, v4, :cond_3

    .line 103
    const/4 v5, 0x1

    .line 104
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->a()Z

    move-result v5

    .line 107
    :cond_1
    if-eqz v5, :cond_2

    .line 108
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->g()V

    .line 110
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->b(Z)V

    .line 111
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->d(Z)V

    .line 112
    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    if-ne v0, v4, :cond_4

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->c()V

    .line 114
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->h()V

    .line 115
    invoke-static {}, Lcom/huawei/health/suggestion/config/MoveService;->g()V

    .line 116
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->b()V

    .line 117
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->c(Z)V

    .line 119
    :cond_4
    :goto_0
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHandleIntent end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 5
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    const-string v0, "MoveService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart(intent, startId) mIsCpDoing = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 56
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->k()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", mIsDelDoing = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->i()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",  mIsCpCancel = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->f()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 55
    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 61
    const-string v0, "MoveService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart null == intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    return-void

    .line 65
    :cond_0
    const-string v0, "TYPE_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 66
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart(intent, startId)  typeValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const/4 v0, 0x1

    if-ne v0, v4, :cond_3

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->k()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    :cond_1
    return-void

    .line 72
    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->b(Z)V

    goto :goto_0

    .line 73
    :cond_3
    const/4 v0, 0x2

    if-ne v0, v4, :cond_6

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 75
    return-void

    .line 77
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/suggestion/config/MoveService;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->d(Z)V

    .line 80
    :cond_5
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/config/MoveService;->c(Z)V

    goto :goto_0

    .line 82
    :cond_6
    const-string v0, "MoveService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart else typeValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 86
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/app/IntentService;->onStart(Landroid/content/Intent;I)V

    .line 87
    return-void
.end method
