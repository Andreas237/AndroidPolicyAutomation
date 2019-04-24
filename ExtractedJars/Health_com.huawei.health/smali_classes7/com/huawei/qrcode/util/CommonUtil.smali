.class public Lcom/huawei/qrcode/util/CommonUtil;
.super Ljava/lang/Object;


# static fields
.field private static final APPLICATION_DETAILS_SETTINGS:Ljava/lang/String; = "android.settings.APPLICATION_DETAILS_SETTINGS"

.field private static final APP_DETAILS_CLASS_NAME:Ljava/lang/String; = "com.android.settings.InstalledAppDetails"

.field private static final APP_DETAILS_PACKAGE_NAME:Ljava/lang/String; = "com.android.settings"

.field private static final APP_PKG_NAME_21:Ljava/lang/String; = "com.android.settings.ApplicationPkgName"

.field private static final APP_PKG_NAME_22:Ljava/lang/String; = "pkg"

.field public static final SUCCESS:Ljava/lang/String; = "success"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static showInstalledAppDetails(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x9

    if-lt v3, v0, :cond_0

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "package"

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_1

    :cond_0
    const/16 v0, 0x8

    if-ne v0, v3, :cond_1

    const-string v4, "pkg"

    goto :goto_0

    :cond_1
    const-string v4, "com.android.settings.ApplicationPkgName"

    :goto_0
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "com.android.settings"

    const-string v1, "com.android.settings.InstalledAppDetails"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_1
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
