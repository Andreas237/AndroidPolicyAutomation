.class public Lo/caw;
.super Lo/cao;
.source "SourceFile"


# instance fields
.field private a:Lo/cao;

.field private c:Landroid/content/Context;

.field private d:Lo/cao;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Lo/cao;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/caw;->d:Lo/cao;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/caw;->a:Lo/cao;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/caw;->c:Landroid/content/Context;

    .line 26
    iput-object p1, p0, Lo/caw;->c:Landroid/content/Context;

    .line 28
    new-instance v0, Lo/cbc;

    iget-object v1, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cbc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/caw;->d:Lo/cao;

    .line 29
    new-instance v0, Lo/cay;

    iget-object v1, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cay;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/caw;->a:Lo/cao;

    .line 30
    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 100
    invoke-static {}, Lo/caw;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    const-string v0, "true"

    return-object v0

    .line 103
    :cond_0
    const-string v0, "false"

    return-object v0
.end method

.method private g()V
    .locals 6

    .line 78
    const-string v0, "Step_HNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initNotification ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 80
    iget-object v0, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 82
    const-string v0, "Step_HNH"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default statusStepsNotifi:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " statusGoalNotifi:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const-string v0, "UNSETED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "UNSETED"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-static {}, Lo/caw;->e()Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-static {}, Lo/caw;->h()Ljava/lang/String;

    move-result-object v5

    .line 87
    iget-object v0, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/amy;->c(Landroid/content/Context;Z)V

    .line 88
    iget-object v0, p0, Lo/caw;->c:Landroid/content/Context;

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/amy;->b(Landroid/content/Context;Z)V

    .line 91
    :cond_0
    const-string v0, "true"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 94
    :cond_1
    const-string v0, "true"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 97
    :cond_2
    return-void
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .line 107
    invoke-static {}, Lo/caw;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const-string v0, "true"

    return-object v0

    .line 110
    :cond_0
    const-string v0, "false"

    return-object v0
.end method

.method public static k()Z
    .locals 3

    .line 114
    invoke-static {}, Lo/dbf;->a()Ljava/lang/String;

    move-result-object v1

    .line 115
    if-eqz v1, :cond_0

    const-string v0, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_1
    const-string v2, "5"

    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method protected a()V
    .locals 5

    .line 137
    :try_start_0
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->d()V

    .line 138
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    goto :goto_0

    .line 139
    :catch_0
    move-exception v4

    .line 140
    const-string v0, "Step_HNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "languageChanged refresh exception!!!:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 125
    invoke-super {p0}, Lo/cao;->b()V

    .line 126
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->b()V

    .line 129
    :cond_0
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->b()V

    .line 132
    :cond_1
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 6

    .line 35
    invoke-super {p0, p1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 37
    const-string v0, "action"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 38
    const-string v0, "target"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 40
    const-string v0, "Step_HNH"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " target:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    const-string v0, "init"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-direct {p0}, Lo/caw;->g()V

    goto :goto_0

    .line 43
    :cond_0
    const-string v0, "start"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    const-string v0, "GoalNotification"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cao;->b(Landroid/os/Bundle;)V

    goto :goto_0

    .line 46
    :cond_1
    const-string v0, "StepsNotification"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 47
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cao;->b(Landroid/os/Bundle;)V

    goto :goto_0

    .line 49
    :cond_2
    const-string v0, "stop"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 50
    const-string v0, "GoalNotification"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->b()V

    goto :goto_0

    .line 52
    :cond_3
    const-string v0, "StepsNotification"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 53
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    invoke-virtual {v0}, Lo/cao;->b()V

    .line 57
    :cond_4
    :goto_0
    return-void
.end method

.method protected c(Lo/ald;)V
    .locals 5

    .line 63
    :try_start_0
    iget-object v0, p0, Lo/caw;->d:Lo/cao;

    invoke-virtual {v0, p1}, Lo/cao;->d(Lo/ald;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 64
    :catch_0
    move-exception v4

    .line 65
    const-string v0, "Step_HNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepsNotification refresh exception!!!:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    :goto_0
    :try_start_1
    iget-object v0, p0, Lo/caw;->a:Lo/cao;

    invoke-virtual {v0, p1}, Lo/cao;->d(Lo/ald;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    goto :goto_1

    .line 70
    :catch_1
    move-exception v4

    .line 71
    const-string v0, "Step_HNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goalNotification refresh exception!!!:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_1
    return-void
.end method
