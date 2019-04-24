.class public Lo/brx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Landroid/content/Context;
    .locals 1

    .line 20
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 2

    .line 29
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v1, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 30
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 0

    .line 17
    return-void
.end method

.method public static e()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;
    .locals 1

    .line 38
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    return-object v0
.end method
