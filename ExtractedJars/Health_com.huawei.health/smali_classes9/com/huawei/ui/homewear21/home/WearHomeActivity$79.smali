.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 955
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 958
    if-nez p1, :cond_2

    .line 959
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 960
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 962
    const-string v0, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 963
    const-string v0, "android.provider.extra.APP_PACKAGE"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 964
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    .line 966
    const-string v0, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 967
    const-string v0, "app_package"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 968
    const-string v0, "app_uid"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 970
    :cond_1
    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 971
    const-string v0, "package"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 973
    :goto_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CommonAutoTestToast onResponse."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 976
    :cond_2
    return-void
.end method
