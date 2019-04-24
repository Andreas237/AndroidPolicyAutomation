.class public Lo/cbe;
.super Lo/cao;
.source "SourceFile"


# instance fields
.field private c:I

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Lo/cao;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbe;->d:Landroid/content/Context;

    .line 24
    const/4 v0, 0x2

    iput v0, p0, Lo/cbe;->c:I

    .line 26
    iput-object p1, p0, Lo/cbe;->d:Landroid/content/Context;

    .line 27
    return-void
.end method

.method private a(Lo/ald;)V
    .locals 5

    .line 58
    if-nez p1, :cond_0

    .line 59
    return-void

    .line 62
    :cond_0
    invoke-virtual {p1}, Lo/ald;->c()Landroid/os/Bundle;

    move-result-object v2

    .line 63
    const-string v0, "KEY_BG_COLOR_TYPE"

    iget v1, p0, Lo/cbe;->c:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 66
    iget-object v0, p0, Lo/cbe;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 69
    const-class v3, Lo/cbe;

    monitor-enter v3

    .line 70
    :try_start_0
    iget-object v0, p0, Lo/cbe;->d:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/huawei/health/ui/widget/HealthSportWidget;->c(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 73
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .line 51
    return-void
.end method

.method public b()V
    .locals 0

    .line 45
    invoke-super {p0}, Lo/cao;->b()V

    .line 46
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 3

    .line 31
    invoke-super {p0, p1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 32
    iget-object v0, p0, Lo/cbe;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "launcher_background_color"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cbe;->c:I

    .line 33
    return-void
.end method

.method protected c(Lo/ald;)V
    .locals 0

    .line 37
    if-nez p1, :cond_0

    .line 38
    return-void

    .line 40
    :cond_0
    invoke-direct {p0, p1}, Lo/cbe;->a(Lo/ald;)V

    .line 41
    return-void
.end method
