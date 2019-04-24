.class public Lo/anc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-static {p0}, Lo/anh;->a(Landroid/content/Context;)V

    .line 38
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-static {p0}, Lo/anh;->e(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-static {p0}, Lo/anc;->a(Landroid/content/Context;)V

    .line 16
    return-void
.end method

.method private static d(Landroid/content/Context;)Lo/anh;
    .locals 1

    .line 33
    invoke-static {p0}, Lo/anh;->b(Landroid/content/Context;)Lo/anh;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)J
    .locals 5

    .line 19
    invoke-static {p0}, Lo/anc;->d(Landroid/content/Context;)Lo/anh;

    move-result-object v4

    .line 20
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lo/anh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    :cond_0
    const-string v0, "Step_AliveStatusMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireLastAliveStatusRecord empty(maybe reboot\u3001first install or exception occurred ),make deathMills zero!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    const-wide/16 v0, 0x0

    return-wide v0

    .line 26
    :cond_1
    invoke-virtual {v4}, Lo/anh;->b()J

    move-result-wide v0

    return-wide v0
.end method
