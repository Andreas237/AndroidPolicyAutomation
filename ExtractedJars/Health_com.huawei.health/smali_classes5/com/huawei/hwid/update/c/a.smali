.class public Lcom/huawei/hwid/update/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;ILcom/huawei/hwid/update/d/j;)V
    .locals 6

    .line 31
    if-eqz p0, :cond_0

    if-nez p2, :cond_1

    .line 32
    :cond_0
    return-void

    .line 35
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-static {p0}, Lcom/huawei/hwid/update/c/a;->b(Landroid/content/Context;)Lcom/huawei/hwid/d/d$a;

    move-result-object v3

    .line 50
    sget-object v0, Lcom/huawei/hwid/d/d$a;->c:Lcom/huawei/hwid/d/d$a;

    if-eq v3, v0, :cond_2

    sget-object v0, Lcom/huawei/hwid/d/d$a;->b:Lcom/huawei/hwid/d/d$a;

    if-ne v3, v0, :cond_3

    .line 53
    :cond_2
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/update/c/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 57
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_4
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    :goto_0
    invoke-virtual {p2, v2}, Lcom/huawei/hwid/update/d/j;->a(Ljava/util/ArrayList;)V

    .line 68
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hwid/update/d/a;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hwid/activity/BridgeActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 69
    const-string v0, "intent.extra.update.info"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 71
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_5

    .line 72
    const/high16 v0, 0x10000000

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 73
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 75
    :cond_5
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v4, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :goto_1
    goto :goto_2

    .line 77
    :catch_0
    move-exception v5

    .line 78
    const-string v0, "UpdateManager"

    const-string v1, "Silent can not start activity:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :goto_2
    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 6

    .line 96
    new-instance v4, Lcom/huawei/hwid/d/d;

    invoke-direct {v4, p0}, Lcom/huawei/hwid/d/d;-><init>(Landroid/content/Context;)V

    .line 97
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Lcom/huawei/hwid/d/d;->b(Ljava/lang/String;)I

    move-result v5

    .line 99
    int-to-long v0, v5

    const-wide/32 v2, 0x42f3678

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(Landroid/content/Context;)Lcom/huawei/hwid/d/d$a;
    .locals 2

    .line 109
    new-instance v1, Lcom/huawei/hwid/d/d;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/d/d;-><init>(Landroid/content/Context;)V

    .line 110
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v1, v0}, Lcom/huawei/hwid/d/d;->a(Ljava/lang/String;)Lcom/huawei/hwid/d/d$a;

    move-result-object v0

    return-object v0
.end method
