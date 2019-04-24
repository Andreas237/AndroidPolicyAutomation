.class public Lo/cba;
.super Lo/cao;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Lo/cao;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cba;->c:Landroid/content/Context;

    .line 27
    iput-object p1, p0, Lo/cba;->c:Landroid/content/Context;

    .line 28
    return-void
.end method

.method private a(Landroid/content/Context;III)V
    .locals 8

    .line 40
    const/4 v0, 0x3

    new-array v4, v0, [I

    const/4 v0, 0x0

    aput p2, v4, v0

    const/4 v0, 0x1

    aput p4, v4, v0

    const/4 v0, 0x2

    aput p3, v4, v0

    .line 42
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.com.huawei.bone.NOTIFY_SPORT_DATA"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 43
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 44
    const-string v0, "cache total data"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 45
    const-string v0, "steps"

    const/4 v1, 0x0

    aget v1, v4, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 46
    const-string v0, "cal"

    const/4 v1, 0x1

    aget v1, v4, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 47
    const-string v0, "distance"

    const/4 v1, 0x2

    aget v1, v4, v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 48
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 49
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    const-string v0, "Step_HealthSmartCoverHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcast step : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget v2, v4, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cal "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aget v2, v4, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " dis "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aget v2, v4, v2

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 51
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/16 v0, 0x17

    if-lt v7, v0, :cond_0

    .line 55
    const-string v0, "com.android.keyguard"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    const-string v0, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER"

    invoke-static {p1, v5, v0}, Lo/cba;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "com.android.keyguard.permission.SEND_STEP_INFO"

    invoke-static {p1, v5, v0}, Lo/cba;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 61
    :goto_0
    const-string v0, "com.android.systemui"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    const-string v0, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER"

    invoke-static {p1, v5, v0}, Lo/cba;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method public static final a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 5

    .line 74
    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 75
    :catch_0
    move-exception v4

    .line 76
    const-string v0, "Step_HealthSmartCoverHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBroadcast exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .line 102
    return-void
.end method

.method public b()V
    .locals 0

    .line 96
    invoke-super {p0}, Lo/cao;->b()V

    .line 97
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 83
    invoke-super {p0, p1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 84
    return-void
.end method

.method protected c(Lo/ald;)V
    .locals 4

    .line 88
    if-nez p1, :cond_0

    .line 89
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lo/cba;->c:Landroid/content/Context;

    iget v1, p1, Lo/ald;->a:I

    iget v2, p1, Lo/ald;->b:I

    iget v3, p1, Lo/ald;->d:I

    invoke-direct {p0, v0, v1, v2, v3}, Lo/cba;->a(Landroid/content/Context;III)V

    .line 92
    return-void
.end method
