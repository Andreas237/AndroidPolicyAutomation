.class public Lcom/huawei/hwid/api/common/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)Landroid/app/AlertDialog;
    .locals 2

    .line 22
    new-instance v1, Lcom/huawei/hwid/api/common/g;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/g;-><init>(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 23
    invoke-virtual {v1}, Lcom/huawei/hwid/api/common/g;->show()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
