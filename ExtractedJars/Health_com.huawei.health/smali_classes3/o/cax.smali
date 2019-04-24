.class public Lo/cax;
.super Lo/akw;
.source "SourceFile"


# instance fields
.field private a:Lo/caq;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/akw;-><init>(Landroid/content/Context;)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cax;->d:Landroid/content/Context;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cax;->a:Lo/caq;

    .line 27
    iput-object p1, p0, Lo/cax;->d:Landroid/content/Context;

    .line 28
    return-void
.end method

.method private a()V
    .locals 6

    .line 55
    iget-object v0, p0, Lo/cax;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.goal_notification_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 57
    if-nez v4, :cond_0

    .line 58
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncGoalNotifi hiUserPreference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-interface {v0}, Lo/caq;->a()V

    .line 60
    return-void

    .line 63
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 65
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncGoalNotifi:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 69
    :cond_1
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncGoalNotifi hiUserPreference no value"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-interface {v0}, Lo/caq;->a()V

    .line 71
    return-void

    .line 73
    :cond_2
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-interface {v0, v1}, Lo/caq;->a(Z)V

    .line 75
    return-void
.end method

.method private b()V
    .locals 6

    .line 78
    iget-object v0, p0, Lo/cax;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.steps_notification_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 80
    if-nez v4, :cond_0

    .line 81
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStepsNotifi hiUserPreference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-interface {v0}, Lo/caq;->e()V

    .line 83
    return-void

    .line 86
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v5

    .line 88
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStepsNotifi:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 92
    :cond_1
    const-string v0, "Step_UISyncManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStepsNotifi hiUserPreference no value"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-interface {v0}, Lo/caq;->e()V

    .line 94
    return-void

    .line 96
    :cond_2
    iget-object v0, p0, Lo/cax;->a:Lo/caq;

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-interface {v0, v1}, Lo/caq;->b(Z)V

    .line 98
    return-void
.end method

.method private d()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/cax;->b()V

    .line 49
    invoke-direct {p0}, Lo/cax;->a()V

    .line 52
    return-void
.end method


# virtual methods
.method public b(Lo/caq;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/cax;->a:Lo/caq;

    .line 102
    return-void
.end method

.method protected e(I)Z
    .locals 2

    .line 32
    const/4 v1, 0x1

    .line 33
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 35
    :sswitch_0
    invoke-direct {p0}, Lo/cax;->d()V

    .line 36
    goto :goto_1

    .line 39
    :goto_0
    const/4 v1, 0x0

    .line 42
    :goto_1
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
