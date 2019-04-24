.class Lo/cwk$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwk;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwk;


# direct methods
.method constructor <init>(Lo/cwk;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lo/cwk$2;->a:Lo/cwk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 171
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "record cached log"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 173
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    const-string v0, "flushLog"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->b(Lo/cwk;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 178
    invoke-static {}, Lo/dho;->a()V

    .line 179
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/cwk$2$4;

    invoke-direct {v1, p0}, Lo/cwk$2$4;-><init>(Lo/cwk$2;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 187
    iget-object v0, p0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->a(Lo/cwk;)Ljava/util/Timer;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lo/cwk$2;->a:Lo/cwk;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-static {v0, v1}, Lo/cwk;->b(Lo/cwk;Ljava/util/Timer;)Ljava/util/Timer;

    .line 190
    :cond_0
    iget-object v0, p0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->a(Lo/cwk;)Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lo/cwk$e;

    iget-object v2, p0, Lo/cwk$2;->a:Lo/cwk;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/cwk$e;-><init>(Lo/cwk;Lo/cwk$2;)V

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 192
    iget-object v0, p0, Lo/cwk$2;->a:Lo/cwk;

    invoke-static {v0}, Lo/cwk;->b(Lo/cwk;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/cwk$2$3;

    invoke-direct {v1, p0}, Lo/cwk$2$3;-><init>(Lo/cwk$2;)V

    invoke-static {v0, v1}, Lo/cwj;->e(Landroid/content/Context;Lo/dik;)V

    .line 203
    return-void
.end method
