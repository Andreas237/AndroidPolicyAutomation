.class public abstract Lcom/huawei/hwid/vermanager/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/huawei/cloudservice/a;)Landroid/webkit/WebViewClient;
    .locals 1

    .line 32
    new-instance v0, Lcom/huawei/hwid/vermanager/a;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwid/vermanager/a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/a;)V

    return-object v0
.end method

.method public static a()Lcom/huawei/hwid/vermanager/d;
    .locals 1

    .line 27
    invoke-static {}, Lcom/huawei/hwid/vermanager/VersionManager;->e()Lcom/huawei/hwid/vermanager/VersionManager;

    move-result-object v0

    return-object v0
.end method
