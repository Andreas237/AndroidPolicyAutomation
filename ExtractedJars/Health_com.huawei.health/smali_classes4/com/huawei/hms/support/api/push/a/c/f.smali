.class public Lcom/huawei/hms/support/api/push/a/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/app/Notification$Builder;ILcom/huawei/hms/support/api/push/a/b/a;Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
    .locals 3

    .line 24
    const-string v0, "PushSelfShowLog"

    const-string v1, "Notification addStyle"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 26
    :cond_0
    return-object p1

    .line 28
    :cond_1
    sget-object v2, Lcom/huawei/hms/support/api/push/a/c/a;->b:Lcom/huawei/hms/support/api/push/a/c/a;

    .line 29
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v0

    invoke-static {}, Lcom/huawei/hms/support/api/push/a/c/a;->values()[Lcom/huawei/hms/support/api/push/a/c/a;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 30
    invoke-static {}, Lcom/huawei/hms/support/api/push/a/c/a;->values()[Lcom/huawei/hms/support/api/push/a/c/a;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->u()I

    move-result v1

    aget-object v2, v0, v1

    .line 32
    :cond_2
    sget-object v0, Lcom/huawei/hms/support/api/push/a/c/g;->a:[I

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 34
    :sswitch_0
    invoke-static {p0, p2, p4, p3}, Lcom/huawei/hms/support/api/push/a/c/f;->a(Landroid/content/Context;ILandroid/graphics/Bitmap;Lcom/huawei/hms/support/api/push/a/b/a;)Landroid/widget/RemoteViews;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 35
    goto :goto_0

    .line 37
    :sswitch_1
    invoke-static {p0, p1, p2, p4, p3}, Lcom/huawei/hms/support/api/push/a/c/e;->a(Landroid/content/Context;Landroid/app/Notification$Builder;ILandroid/graphics/Bitmap;Lcom/huawei/hms/support/api/push/a/b/a;)V

    .line 38
    .line 42
    :goto_0
    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private static a(Landroid/content/Context;ILandroid/graphics/Bitmap;Lcom/huawei/hms/support/api/push/a/b/a;)Landroid/widget/RemoteViews;
    .locals 3

    .line 54
    new-instance v2, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hwpush_layout2"

    invoke-static {p0, v1}, Lcom/huawei/hms/support/api/push/a/d/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-direct {v2, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 56
    invoke-static {p0, p2, v2}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/widget/RemoteViews;)V

    .line 57
    invoke-static {p0, p1, v2, p3}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;ILandroid/widget/RemoteViews;Lcom/huawei/hms/support/api/push/a/b/a;)V

    .line 58
    const-string v0, "title"

    invoke-static {p0, v0}, Lcom/huawei/hms/support/api/push/a/d/b;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 59
    invoke-static {p0, p3}, Lcom/huawei/hms/support/api/push/a/c/c;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 60
    const-string v0, "text"

    invoke-static {p0, v0}, Lcom/huawei/hms/support/api/push/a/d/b;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 61
    return-object v2
.end method
