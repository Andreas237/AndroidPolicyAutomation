.class public final Lcom/huawei/hwCloudJs/service/locationapi/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/hwCloudJs/service/locationapi/a/a; = null

.field private static final b:Ljava/lang/String; = "SharedPreferencesStorage"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/hwCloudJs/service/locationapi/a/a;
    .locals 4

    const-class v2, Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/locationapi/a/a;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a/a;

    :cond_0
    sget-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)V
    .locals 5

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "location_cfg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "location_cfg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const/4 v0, 0x0

    invoke-interface {v3, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 5

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "location_cfg"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method
