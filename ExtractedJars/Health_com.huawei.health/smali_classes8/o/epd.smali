.class public Lo/epd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Landroid/content/Context;)V
    .locals 6

    .line 57
    invoke-static {p0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 58
    if-nez v4, :cond_0

    .line 59
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncGoogleFit network is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-void

    .line 62
    :cond_0
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjr;->c()Z

    move-result v5

    .line 63
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSyncGoogleFit.isConnect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    if-eqz v5, :cond_1

    .line 65
    new-instance v0, Lo/fjo;

    invoke-direct {v0, p0}, Lo/fjo;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/fjo;->c()V

    .line 66
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncGoogleFit end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :cond_1
    return-void
.end method

.method private static d(Landroid/content/Context;)V
    .locals 7

    .line 38
    invoke-static {p0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncMyft network is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 44
    :cond_0
    invoke-static {p0}, Lo/fjx;->a(Landroid/content/Context;)Lo/fjx;

    move-result-object v5

    .line 45
    invoke-virtual {v5}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v6

    .line 46
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSyncMyft.isLogin = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v0, Lo/fjv;

    invoke-direct {v0, p0}, Lo/fjv;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/fjv;->e()V

    .line 49
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncMyft end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :cond_1
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 4

    .line 25
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncThirdPartService start."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    invoke-static {p0}, Lo/epd;->d(Landroid/content/Context;)V

    .line 29
    invoke-static {p0}, Lo/epd;->c(Landroid/content/Context;)V

    .line 32
    return-void
.end method
