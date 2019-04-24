.class public Lo/ame;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/alb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ame$c;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:J

.field private d:I

.field private e:Z

.field private g:Lo/ame$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ame;->e:Z

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lo/ame;->d:I

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ame;->a:Z

    return-void
.end method

.method static synthetic e(Lo/ame;I)I
    .locals 0

    .line 17
    iput p1, p0, Lo/ame;->d:I

    return p1
.end method


# virtual methods
.method public b(Lo/ald;)V
    .locals 6

    .line 95
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "report"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lo/ald;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-boolean v0, p0, Lo/ame;->a:Z

    if-eqz v0, :cond_5

    .line 98
    iget-wide v0, p0, Lo/ame;->c:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 99
    iget-boolean v0, p0, Lo/ame;->e:Z

    if-nez v0, :cond_0

    .line 100
    invoke-static {}, Lo/alx;->e()Lo/alx;

    move-result-object v0

    const-string v1, "protect_for_walk"

    invoke-virtual {v0, v1}, Lo/alx;->d(Ljava/lang/String;)V

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ame;->e:Z

    .line 103
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ame;->c:J

    .line 104
    const/4 v0, -0x1

    iput v0, p0, Lo/ame;->d:I

    .line 107
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/ame;->c:J

    sub-long v4, v0, v2

    .line 108
    const-wide/32 v0, 0x493e0

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    .line 109
    iget-object v0, p0, Lo/ame;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/amx;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ame;->a:Z

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ame;->c:J

    .line 112
    :cond_2
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mScreenOn"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/ame;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-boolean v0, p0, Lo/ame;->a:Z

    if-nez v0, :cond_3

    .line 115
    invoke-static {}, Lo/alx;->e()Lo/alx;

    move-result-object v0

    const-string v1, "protect_for_walk"

    invoke-virtual {v0, v1}, Lo/alx;->b(Ljava/lang/String;)V

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ame;->e:Z

    .line 117
    const/4 v0, -0x1

    iput v0, p0, Lo/ame;->d:I

    .line 118
    return-void

    .line 121
    :cond_3
    iget v0, p0, Lo/ame;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 122
    iget v0, p1, Lo/ald;->a:I

    iput v0, p0, Lo/ame;->d:I

    .line 126
    :cond_4
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "record.mSteps"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lo/ald;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   mLatestStep"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ame;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget v0, p1, Lo/ald;->a:I

    iget v1, p0, Lo/ame;->d:I

    sub-int/2addr v0, v1

    const/16 v1, 0xa

    if-le v0, v1, :cond_5

    iget-boolean v0, p0, Lo/ame;->e:Z

    if-nez v0, :cond_5

    .line 128
    invoke-static {}, Lo/alx;->e()Lo/alx;

    move-result-object v0

    const-string v1, "protect_for_walk"

    invoke-virtual {v0, v1}, Lo/alx;->d(Ljava/lang/String;)V

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ame;->e:Z

    .line 133
    :cond_5
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 40
    iput-boolean p1, p0, Lo/ame;->a:Z

    .line 43
    iget-boolean v0, p0, Lo/ame;->a:Z

    if-nez v0, :cond_0

    .line 44
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setScreenState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-static {}, Lo/alx;->e()Lo/alx;

    move-result-object v0

    const-string v1, "protect_for_walk"

    invoke-virtual {v0, v1}, Lo/alx;->b(Ljava/lang/String;)V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ame;->e:Z

    .line 48
    :cond_0
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 53
    if-nez p1, :cond_0

    .line 54
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init param invalied"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void

    .line 58
    :cond_0
    iput-object p1, p0, Lo/ame;->b:Landroid/content/Context;

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lo/ame;->d:I

    .line 60
    new-instance v0, Lo/ame$c;

    invoke-direct {v0, p0}, Lo/ame$c;-><init>(Lo/ame;)V

    iput-object v0, p0, Lo/ame;->g:Lo/ame$c;

    .line 62
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 63
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 64
    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lo/ame;->g:Lo/ame$c;

    const-string v1, "com.huawei.health.INTERNAL_PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 72
    invoke-static {p1}, Lo/amx;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ame;->a:Z

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ame;->c:J

    .line 74
    invoke-static {}, Lo/alx;->e()Lo/alx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/alx;->e(Landroid/content/Context;)Z

    .line 75
    const-string v0, "Step_PowerKitProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init screenOn "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ame;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    return-void
.end method
