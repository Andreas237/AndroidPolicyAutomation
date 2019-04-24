.class public Lo/ama;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/als;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 45
    invoke-static {p1}, Lo/ama;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 46
    const-string v0, "UNSETED"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    return-void

    .line 49
    :cond_1
    invoke-static {}, Lo/akw;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo/ama$3;

    invoke-direct {v1, p0, p1, v2}, Lo/ama$3;-><init>(Lo/ama;Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 75
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepsNotificationShowStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const-string v4, "UNSETED"

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/amy;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "daemonService_perference"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 79
    if-eqz v5, :cond_0

    .line 80
    const-string v0, "steps_notification_status"

    const-string v1, "UNSETED"

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 82
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getStepsNotificationShowStatus= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_0
    return-object v4
.end method

.method private b(Landroid/content/Context;Z)V
    .locals 5

    .line 67
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write2DBGoalNotifiStatus:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 69
    const-string v0, "custom.goal_notification_status"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 70
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 71
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 72
    return-void
.end method

.method static synthetic b(Lo/ama;Landroid/content/Context;Z)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lo/ama;->b(Landroid/content/Context;Z)V

    return-void
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 88
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalNotificationShowStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const-string v4, "UNSETED"

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/amy;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "daemonService_perference"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    .line 92
    if-eqz v5, :cond_0

    .line 93
    const-string v0, "goal_notification_status"

    const-string v1, "UNSETED"

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getGoalNotificationShowStatus= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    :cond_0
    return-object v4
.end method

.method private c(Landroid/content/Context;Z)V
    .locals 5

    .line 58
    const-string v0, "Step_Migration_V2_TO_V2_1"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write2DBStepsNotifiStatus:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 60
    const-string v0, "custom.steps_notification_status"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 61
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 62
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 63
    return-void
.end method

.method static synthetic d(Lo/ama;Landroid/content/Context;Z)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lo/ama;->c(Landroid/content/Context;Z)V

    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 32
    invoke-static {p1}, Lo/ama;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 33
    const-string v0, "UNSETED"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    :cond_0
    return-void

    .line 36
    :cond_1
    invoke-static {}, Lo/akw;->e()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo/ama$1;

    invoke-direct {v1, p0, p1, v2}, Lo/ama$1;-><init>(Lo/ama;Landroid/content/Context;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 42
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 18
    const-string v0, "Athene"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    const/4 v0, 0x1

    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/ama;->a(Landroid/content/Context;)V

    .line 27
    invoke-direct {p0, p1}, Lo/ama;->e(Landroid/content/Context;)V

    .line 28
    const-string v0, "Athene2"

    invoke-static {p1, v0}, Lo/amy;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 29
    return-void
.end method
