.class final Lo/azs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static a(J)I
    .locals 9

    .line 49
    const/4 v4, 0x0

    .line 50
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 53
    sub-long v0, v5, p0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 54
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->d()I

    move-result v8

    .line 55
    if-ge v7, v8, :cond_0

    .line 58
    sub-int v4, v8, v7

    .line 61
    :cond_0
    return v4
.end method

.method protected static a()Landroid/app/PendingIntent;
    .locals 4

    .line 34
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 35
    const-string v0, "com.huawei.health.sns.smart_ping_action"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 37
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    const/4 v0, 0x0

    const/high16 v1, 0x8000000

    invoke-static {v3, v0, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method
