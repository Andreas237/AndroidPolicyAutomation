.class public Lcom/huawei/hms/support/api/push/b/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    const-string v0, ""

    return-object v0

    .line 12
    :cond_0
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/b/e;->a()[B

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/b/b/a;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    const-string v0, ""

    return-object v0

    .line 19
    :cond_0
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/b/e;->a()[B

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/b/b/a;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
