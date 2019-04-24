.class public Lcom/huawei/hwid/core/d/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwid/core/d/a/a;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/a/c;->a:Ljava/util/List;

    .line 20
    sget-object v0, Lcom/huawei/hwid/core/d/a/c;->a:Ljava/util/List;

    new-instance v1, Lcom/huawei/hwid/core/d/a/d;

    invoke-direct {v1}, Lcom/huawei/hwid/core/d/a/d;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    sget-object v0, Lcom/huawei/hwid/core/d/a/c;->a:Ljava/util/List;

    new-instance v1, Lcom/huawei/hwid/core/d/a/b;

    invoke-direct {v1}, Lcom/huawei/hwid/core/d/a/b;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 7

    const-class v6, Lcom/huawei/hwid/core/d/a/c;

    monitor-enter v6

    .line 25
    const-string v0, "encryptversion"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    const/4 v3, -0x1

    .line 27
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 29
    :try_start_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v3, v0

    .line 32
    goto :goto_0

    .line 30
    :catch_0
    move-exception v4

    .line 31
    const-string v0, "VersionUpdateHelper"

    const-string v1, "parse encryptversion error:"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :cond_0
    :goto_0
    const/4 v0, 0x3

    if-ge v3, v0, :cond_1

    .line 36
    sget-object v0, Lcom/huawei/hwid/core/d/a/c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwid/core/d/a/a;

    .line 37
    const/4 v0, 0x3

    invoke-interface {v5, p0, v3, v0}, Lcom/huawei/hwid/core/d/a/a;->a(Landroid/content/Context;II)V

    .line 38
    goto :goto_1

    .line 41
    :cond_1
    const-string v0, "encryptversion"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    monitor-exit v6

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method
