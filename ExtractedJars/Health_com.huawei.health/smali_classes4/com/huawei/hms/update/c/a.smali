.class public Lcom/huawei/hms/update/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;ILcom/huawei/hms/update/e/u;)V
    .locals 4

    .line 31
    if-eqz p0, :cond_0

    if-nez p2, :cond_1

    .line 32
    :cond_0
    return-void

    .line 35
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-static {p0}, Lcom/huawei/hms/update/c/a;->b(Landroid/content/Context;)Lcom/huawei/hms/c/g$a;

    move-result-object v2

    .line 39
    invoke-virtual {p2}, Lcom/huawei/hms/update/e/u;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 42
    sget-object v0, Lcom/huawei/hms/c/g$a;->a:Lcom/huawei/hms/c/g$a;

    if-ne v2, v0, :cond_2

    .line 44
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_2
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 50
    :cond_3
    sget-object v0, Lcom/huawei/hms/c/g$a;->c:Lcom/huawei/hms/c/g$a;

    if-eq v2, v0, :cond_4

    sget-object v0, Lcom/huawei/hms/c/g$a;->b:Lcom/huawei/hms/c/g$a;

    if-ne v2, v0, :cond_5

    .line 53
    :cond_4
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_5
    invoke-static {p0}, Lcom/huawei/hms/update/c/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 57
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_6
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    :goto_0
    invoke-virtual {p2, v1}, Lcom/huawei/hms/update/e/u;->a(Ljava/util/ArrayList;)V

    .line 68
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/update/e/a;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hms/activity/BridgeActivity;->getIntentStartBridgeActivity(Landroid/app/Activity;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 69
    const-string v0, "intent.extra.update.info"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 70
    invoke-virtual {p0, v3, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 71
    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 6

    .line 87
    new-instance v4, Lcom/huawei/hms/c/g;

    invoke-direct {v4, p0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 88
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v5

    .line 90
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

.method private static b(Landroid/content/Context;)Lcom/huawei/hms/c/g$a;
    .locals 2

    .line 100
    new-instance v1, Lcom/huawei/hms/c/g;

    invoke-direct {v1, p0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 101
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v1, v0}, Lcom/huawei/hms/c/g;->a(Ljava/lang/String;)Lcom/huawei/hms/c/g$a;

    move-result-object v0

    return-object v0
.end method
