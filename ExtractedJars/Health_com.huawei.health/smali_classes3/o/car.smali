.class public Lo/car;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/caq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/car$c;
    }
.end annotation


# instance fields
.field private a:Lo/cav;

.field private b:Lo/caz;

.field private d:Landroid/content/Context;

.field private e:Lo/car$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/car;->d:Landroid/content/Context;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/car;->e:Lo/car$c;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/car;->a:Lo/cav;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/car;->b:Lo/caz;

    .line 183
    iput-object p1, p0, Lo/car;->d:Landroid/content/Context;

    .line 185
    new-instance v0, Lo/car$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/car$c;-><init>(Lo/car;Lo/car$2;)V

    iput-object v0, p0, Lo/car;->e:Lo/car$c;

    .line 187
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDynamicBroadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 191
    const-string v0, "steps_notify_delete"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 193
    if-eqz p1, :cond_0

    .line 194
    iget-object v0, p0, Lo/car;->e:Lo/car$c;

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 196
    new-instance v0, Lo/caz;

    iget-object v1, p0, Lo/car;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/caz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/car;->b:Lo/caz;

    .line 198
    :cond_0
    return-void
.end method

.method private c(Z)V
    .locals 5

    .line 75
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write2DBStepsNotifiStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 77
    const-string v0, "custom.steps_notification_status"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 78
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lo/car;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 80
    return-void
.end method

.method private h(Z)V
    .locals 5

    .line 84
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write2DBGoalNotifiStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 86
    const-string v0, "custom.goal_notification_status"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 87
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lo/car;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 89
    return-void
.end method

.method private i(Z)V
    .locals 5

    .line 127
    invoke-virtual {p0}, Lo/car;->d()Z

    move-result v0

    if-ne p1, v0, :cond_0

    .line 128
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeGoalNotifiState ambious set:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    return-void

    .line 132
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 133
    if-eqz p1, :cond_1

    .line 134
    const-string v0, "action"

    const-string v1, "start"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v0, "target"

    const-string v1, "GoalNotification"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    sget-object v1, Lo/cau;->d:Lo/cau;

    invoke-virtual {v0, v1, v4}, Lo/cav;->e(Lo/cau;Landroid/os/Bundle;)V

    goto :goto_0

    .line 138
    :cond_1
    const-string v0, "action"

    const-string v1, "stop"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "target"

    const-string v1, "GoalNotification"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    sget-object v1, Lo/cau;->d:Lo/cau;

    invoke-virtual {v0, v1, v4}, Lo/cav;->e(Lo/cau;Landroid/os/Bundle;)V

    .line 142
    :goto_0
    return-void
.end method

.method private k(Z)V
    .locals 5

    .line 92
    invoke-virtual {p0}, Lo/car;->c()Z

    move-result v0

    if-ne p1, v0, :cond_0

    .line 93
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeStepsNotifiState ambious set:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void

    .line 96
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 97
    if-eqz p1, :cond_1

    .line 98
    const-string v0, "action"

    const-string v1, "start"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "target"

    const-string v1, "StepsNotification"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    sget-object v1, Lo/cau;->d:Lo/cau;

    invoke-virtual {v0, v1, v4}, Lo/cav;->e(Lo/cau;Landroid/os/Bundle;)V

    goto :goto_0

    .line 102
    :cond_1
    const-string v0, "action"

    const-string v1, "stop"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "target"

    const-string v1, "StepsNotification"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    sget-object v1, Lo/cau;->d:Lo/cau;

    invoke-virtual {v0, v1, v4}, Lo/cav;->e(Lo/cau;Landroid/os/Bundle;)V

    .line 106
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 45
    invoke-static {}, Lo/caw;->h()Ljava/lang/String;

    move-result-object v4

    .line 46
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 47
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetGoalNotifi str:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " defaultConfig:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0}, Lo/car;->d()Z

    move-result v0

    if-ne v5, v0, :cond_0

    .line 49
    return-void

    .line 51
    :cond_0
    invoke-virtual {p0, v5}, Lo/car;->a(Z)V

    .line 52
    return-void
.end method

.method public a(Z)V
    .locals 4

    .line 120
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeGoalNotifiStateAsSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-direct {p0, p1}, Lo/car;->i(Z)V

    .line 123
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 124
    return-void
.end method

.method public b()V
    .locals 1

    .line 205
    invoke-virtual {p0}, Lo/car;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/car;->k(Z)V

    .line 208
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/car;->k(Z)V

    .line 210
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 67
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeStepsNotifiStateAsSync:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-direct {p0, p1}, Lo/car;->k(Z)V

    .line 70
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 71
    return-void
.end method

.method public c()Z
    .locals 5

    .line 145
    iget-object v0, p0, Lo/car;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 146
    const-string v0, "true"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const/4 v0, 0x1

    return v0

    .line 148
    :cond_0
    const-string v0, "false"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    const/4 v0, 0x0

    return v0

    .line 150
    :cond_1
    const-string v0, "UNSETED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepsNotifiState UNSETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x0

    return v0

    .line 154
    :cond_2
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepsNotifiState UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method public d(Z)V
    .locals 4

    .line 57
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeStepsNotifiStateAsUser:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-direct {p0, p1}, Lo/car;->c(Z)V

    .line 61
    invoke-direct {p0, p1}, Lo/car;->k(Z)V

    .line 62
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 63
    return-void
.end method

.method public d()Z
    .locals 5

    .line 159
    iget-object v0, p0, Lo/car;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 160
    const-string v0, "true"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x1

    return v0

    .line 162
    :cond_0
    const-string v0, "false"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    const/4 v0, 0x0

    return v0

    .line 164
    :cond_1
    const-string v0, "UNSETED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalNotifiState UNSETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x0

    return v0

    .line 168
    :cond_2
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalNotifiState UNKNOWN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 6

    .line 35
    invoke-static {}, Lo/caw;->e()Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v5

    .line 37
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetStepsNotifi str:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " defaultConfig:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-virtual {p0}, Lo/car;->c()Z

    move-result v0

    if-ne v5, v0, :cond_0

    .line 39
    return-void

    .line 41
    :cond_0
    invoke-virtual {p0, v5}, Lo/car;->b(Z)V

    .line 42
    return-void
.end method

.method public e(Lo/cav;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lo/car;->a:Lo/cav;

    .line 202
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 111
    const-string v0, "Step_NotificationUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeGoalNotifiStateAsUser:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-direct {p0, p1}, Lo/car;->h(Z)V

    .line 114
    invoke-direct {p0, p1}, Lo/car;->i(Z)V

    .line 115
    iget-object v0, p0, Lo/car;->a:Lo/cav;

    invoke-virtual {v0}, Lo/cav;->c()V

    .line 116
    return-void
.end method

.method public g()Z
    .locals 1

    .line 174
    iget-object v0, p0, Lo/car;->b:Lo/caz;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lo/car;->b:Lo/caz;

    invoke-virtual {v0}, Lo/caz;->d()Z

    move-result v0

    return v0

    .line 177
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()Lo/caq;
    .locals 4

    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lo/cbd;

    invoke-direct {v2, p0}, Lo/cbd;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/caq;

    .line 217
    return-object v3
.end method
