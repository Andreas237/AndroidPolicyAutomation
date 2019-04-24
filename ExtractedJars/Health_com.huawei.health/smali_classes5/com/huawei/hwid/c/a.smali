.class public final Lcom/huawei/hwid/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/hwid/c/a;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lcom/huawei/hwid/core/datatype/HwAccount;

.field private d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/c/a;->b:Lcom/huawei/hwid/c/a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/c/a;->d:Ljava/util/HashMap;

    .line 37
    iput-object p1, p0, Lcom/huawei/hwid/c/a;->a:Landroid/content/Context;

    .line 38
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;
    .locals 5

    .line 27
    const-class v2, Lcom/huawei/hwid/c/a;

    .line 28
    move-object v3, v2

    monitor-enter v3

    .line 29
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/c/a;->b:Lcom/huawei/hwid/c/a;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Lcom/huawei/hwid/c/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/c/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwid/c/a;->b:Lcom/huawei/hwid/c/a;

    .line 32
    :cond_0
    sget-object v0, Lcom/huawei/hwid/c/a;->b:Lcom/huawei/hwid/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 33
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 123
    :goto_0
    return-object v1
.end method

.method public a()V
    .locals 3

    .line 44
    const-string v0, "HwIDMemCache"

    const-string v1, "initHwAccountMemCache"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/c/a;->a:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 48
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    iput-object v0, p0, Lcom/huawei/hwid/c/a;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    goto :goto_0

    .line 50
    :cond_0
    const-string v0, "HwIDMemCache"

    const-string v1, "file has no account"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 2

    .line 77
    const-string v0, "HwIDMemCache"

    const-string v1, "saveHwAccountToCache"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    iput-object p1, p0, Lcom/huawei/hwid/c/a;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    goto :goto_0

    .line 81
    :cond_0
    const-string v0, "HwIDMemCache"

    const-string v1, "save hwAccount is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/c/a;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 84
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 112
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    :cond_0
    return-void
.end method

.method public b()Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/huawei/hwid/c/a;->a()V

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->c:Lcom/huawei/hwid/core/datatype/HwAccount;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/hwid/c/a;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 119
    return-void
.end method
