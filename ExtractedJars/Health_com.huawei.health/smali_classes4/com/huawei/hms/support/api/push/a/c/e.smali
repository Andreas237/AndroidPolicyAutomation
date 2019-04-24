.class public Lcom/huawei/hms/support/api/push/a/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/app/Notification$Builder;ILandroid/graphics/Bitmap;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 8

    .line 30
    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 31
    :cond_0
    const-string v0, "PushSelfShowLog"

    const-string v1, "msg is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void

    .line 34
    :cond_1
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "##"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 35
    :cond_2
    return-void

    .line 37
    :cond_3
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "##"

    const-string v2, "\uff0c"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 38
    invoke-static {}, Lcom/huawei/hms/support/api/push/a/d/a;->c()Z

    move-result v0

    if-nez v0, :cond_4

    .line 39
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "##"

    const-string v2, "\uff0c"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 40
    return-void

    .line 42
    :cond_4
    invoke-virtual {p1, p3}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 43
    invoke-static {p0, p4}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 44
    new-instance v3, Landroid/app/Notification$InboxStyle;

    invoke-direct {v3}, Landroid/app/Notification$InboxStyle;-><init>()V

    .line 45
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "##"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 46
    array-length v5, v4

    .line 47
    const/4 v0, 0x4

    if-le v5, v0, :cond_5

    .line 48
    const/4 v5, 0x4

    .line 50
    :cond_5
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 51
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    .line 52
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 53
    const/4 v0, 0x4

    if-ne v0, v5, :cond_6

    .line 54
    add-int/lit8 v5, v5, -0x1

    .line 57
    :cond_6
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_7

    .line 58
    aget-object v0, v4, v6

    invoke-virtual {v3, v0}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    .line 57
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 61
    :cond_7
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_9

    .line 62
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    array-length v6, v0

    .line 63
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_9

    .line 64
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->w()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 65
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    .line 66
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->w()[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v7

    invoke-static {p0, p2, v1}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v1

    .line 65
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 63
    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 70
    :cond_9
    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 71
    return-void
.end method
