.class public Lcom/huawei/updatesdk/support/e/b;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Landroid/content/Context;)Lcom/huawei/updatesdk/support/e/c;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/huawei/updatesdk/support/e/b;->a(Ljava/lang/String;Landroid/content/Context;I)Lcom/huawei/updatesdk/support/e/c;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Landroid/content/Context;I)Lcom/huawei/updatesdk/support/e/c;
    .locals 2

    invoke-virtual {p1, p0, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, Lcom/huawei/updatesdk/support/e/c;

    invoke-direct {v1, v0}, Lcom/huawei/updatesdk/support/e/c;-><init>(Landroid/content/SharedPreferences;)V

    return-object v1
.end method
