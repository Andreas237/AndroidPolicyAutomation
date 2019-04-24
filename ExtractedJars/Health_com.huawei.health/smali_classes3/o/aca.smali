.class public Lo/aca;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static b:Lo/aca;

.field private static final c:Ljava/lang/Object;


# instance fields
.field private e:Lo/agl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/aca;->c:Ljava/lang/Object;

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/aca;->b:Lo/aca;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aca;->e:Lo/agl;

    .line 79
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    iput-object v0, p0, Lo/aca;->e:Lo/agl;

    .line 80
    return-void
.end method

.method private d()V
    .locals 8

    .line 44
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 45
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginDevice initDatabase "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 47
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 48
    const-string v0, "old_user_id"

    const/4 v1, 0x0

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 50
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice initDatabase oldHuid null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "old_user_id"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 53
    return-void

    .line 56
    :cond_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice initDatabase huid != oldHuid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "old_user_id"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 61
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0}, Lo/acd;->b()V

    .line 62
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_DELETE"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 64
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v7, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 65
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice initDatabase sendBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_1
    goto :goto_0

    .line 68
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice initDatabase huid null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :goto_0
    return-void
.end method

.method public static e()Lo/aca;
    .locals 3

    .line 86
    sget-object v1, Lo/aca;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 87
    :try_start_0
    sget-object v0, Lo/aca;->b:Lo/aca;

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Lo/aca;

    invoke-direct {v0}, Lo/aca;-><init>()V

    sput-object v0, Lo/aca;->b:Lo/aca;

    .line 90
    :cond_0
    sget-object v0, Lo/aca;->b:Lo/aca;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 91
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public b(Landroid/content/Context;ILo/acl$a;Lo/alk$e;)Ljava/lang/String;
    .locals 4

    .line 105
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice startMeasureBackground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lo/aca;->e:Lo/agl;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/agl;->a(Landroid/content/Context;ILo/acl$a;Lo/alk$e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 127
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDevice stopMeasureBackground"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lo/aca;->e:Lo/agl;

    invoke-virtual {v0, p1}, Lo/agl;->a(Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method public finish()V
    .locals 0

    .line 76
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 0

    .line 38
    invoke-static {p1}, Lo/ahj;->b(Landroid/content/Context;)V

    .line 39
    invoke-direct {p0}, Lo/aca;->d()V

    .line 40
    return-void
.end method
