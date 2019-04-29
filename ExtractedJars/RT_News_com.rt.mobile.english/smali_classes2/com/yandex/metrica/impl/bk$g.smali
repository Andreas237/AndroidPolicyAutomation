.class Lcom/yandex/metrica/impl/bk$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bk$g$d;,
        Lcom/yandex/metrica/impl/bk$g$c;,
        Lcom/yandex/metrica/impl/bk$g$e;,
        Lcom/yandex/metrica/impl/bk$g$b;,
        Lcom/yandex/metrica/impl/bk$g$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .line 254
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bk$g;->b(Landroid/content/Context;)V

    .line 1259
    new-instance v0, Lcom/yandex/metrica/impl/ob/fk;

    .line 1260
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v1

    .line 1261
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    new-instance p1, Lcom/yandex/metrica/impl/ob/ig;

    const-string v1, "LAST_STARTUP_CLIDS_SAVE_TIME"

    invoke-direct {p1, v1}, Lcom/yandex/metrica/impl/ob/ig;-><init>(Ljava/lang/String;)V

    .line 1263
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ig;->b()Ljava/lang/String;

    move-result-object p1

    .line 1262
    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fk;->n(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fi;

    move-result-object p1

    .line 1264
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fi;->i()V

    return-void
.end method

.method b(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 268
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bk$g;->c(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/bk$g$a;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/io/FilenameFilter;

    new-instance v3, Lcom/yandex/metrica/impl/bk$g$b;

    new-instance v4, Lcom/yandex/metrica/impl/bk$g$e;

    .line 271
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/bk$g$e;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lcom/yandex/metrica/impl/bk$g$b;-><init>(Ljava/io/FilenameFilter;)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Lcom/yandex/metrica/impl/bk$g$b;

    new-instance v5, Lcom/yandex/metrica/impl/bk$g$d;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/bk$g$d;-><init>()V

    invoke-direct {v3, v5}, Lcom/yandex/metrica/impl/bk$g$b;-><init>(Ljava/io/FilenameFilter;)V

    const/4 v5, 0x1

    aput-object v3, v2, v5

    new-instance v3, Lcom/yandex/metrica/impl/bk$g$b;

    new-instance v5, Lcom/yandex/metrica/impl/bk$g$c;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/bk$g$c;-><init>()V

    invoke-direct {v3, v5}, Lcom/yandex/metrica/impl/bk$g$b;-><init>(Ljava/io/FilenameFilter;)V

    const/4 v5, 0x2

    aput-object v3, v2, v5

    .line 270
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bk$g$a;-><init>(Ljava/lang/Iterable;)V

    .line 268
    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    .line 277
    array-length v1, v0

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v2, v0, v4

    .line 279
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    if-nez v3, :cond_0

    .line 280
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v3

    const-string v5, "Can not delete file"

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "fileName"

    .line 282
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    .line 280
    invoke-interface {v3, v5, v2}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 286
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v3

    const-string v5, "Can not delete file"

    .line 287
    invoke-interface {v3, v5, v2}, Lcom/yandex/metrica/b;->reportError(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method c(Landroid/content/Context;)Ljava/io/File;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/16 v0, 0x15

    .line 295
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p1

    goto :goto_0

    .line 298
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    const-string v1, "databases"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
