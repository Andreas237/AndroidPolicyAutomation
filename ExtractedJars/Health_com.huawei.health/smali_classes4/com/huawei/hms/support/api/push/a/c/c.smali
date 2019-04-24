.class public Lcom/huawei/hms/support/api/push/a/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;
    .locals 6

    .line 76
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.android.push.intent.CLICK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 77
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v3

    .line 78
    const-string v0, "notifyId"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 79
    const-string v0, "clickBtn"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1}, Ljava/security/SecureRandom;->nextInt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    .line 82
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPendingIntent,requestCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const/high16 v0, 0x8000000

    invoke-static {p0, v4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 85
    return-object v5
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Ljava/lang/String;
    .locals 2

    .line 89
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 90
    :cond_0
    const-string v0, ""

    return-object v0

    .line 92
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 95
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 96
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;ILandroid/widget/RemoteViews;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 3

    .line 52
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 53
    :cond_0
    const-string v0, "PushSelfShowLog"

    const-string v1, "showRightBtn error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void

    .line 56
    :cond_1
    sget-object v0, Lcom/huawei/hms/support/api/push/a/c/a;->c:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/huawei/hms/support/api/push/a/c/a;->d:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/huawei/hms/support/api/push/a/c/a;->e:Lcom/huawei/hms/support/api/push/a/c/a;

    .line 57
    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 58
    :cond_2
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->w()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 59
    const-string v0, "id"

    const-string v1, "right_btn"

    invoke-static {p0, v0, v1}, Lcom/huawei/hms/support/api/push/a/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 60
    const/4 v0, 0x0

    invoke-virtual {p2, v2, v0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 61
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->v()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p2, v2, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 62
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->w()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p0, p1, v0}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p2, v2, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 65
    :cond_3
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;)V
    .locals 5

    .line 25
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 26
    :cond_0
    return-void

    .line 29
    :cond_1
    invoke-static {}, Lcom/huawei/hms/support/api/push/a/d/a;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 30
    return-void

    .line 32
    :cond_2
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v4, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 36
    if-nez v4, :cond_3

    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "btn_star_big_on"

    const-string v2, "drawable"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 39
    if-nez v4, :cond_3

    .line 41
    const v4, 0x1080093

    .line 44
    :cond_3
    const-string v0, "id"

    const-string v1, "icon"

    invoke-static {p0, v0, v1}, Lcom/huawei/hms/support/api/push/a/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0, v4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 45
    goto :goto_0

    .line 46
    :cond_4
    const-string v0, "id"

    const-string v1, "icon"

    invoke-static {p0, v0, v1}, Lcom/huawei/hms/support/api/push/a/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0, p1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 48
    :goto_0
    return-void
.end method
