.class public Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static gotoSetting(Landroid/content/Context;)V
    .locals 5

    .line 20
    :try_start_0
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processHuawei(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 26
    goto :goto_0

    .line 21
    :catch_0
    move-exception v4

    .line 22
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SecurityException when opening security manager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processSystemSetting(Landroid/content/Context;)V

    .line 26
    goto :goto_0

    .line 24
    :catch_1
    move-exception v4

    .line 25
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown exception occurred when opening security manager "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    :goto_0
    return-void
.end method

.method public static processHuawei(Landroid/content/Context;)V
    .locals 6

    .line 32
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter huawei"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.huawei.systemmanager"

    const-string v1, "com.huawei.permissionmanager.ui.MainActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 36
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 37
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_0

    .line 38
    :catch_0
    move-exception v4

    .line 39
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not XIAOMI, start meizu process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processXIAOMI(Landroid/content/Context;)V

    .line 42
    :goto_0
    return-void
.end method

.method public static processLETV(Landroid/content/Context;)V
    .locals 6

    .line 104
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter letv"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.letv.android.letvsafe"

    const-string v1, "com.letv.android.letvsafe.BackgroundAppManageActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 108
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 109
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    goto :goto_0

    .line 110
    :catch_0
    move-exception v4

    .line 111
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processSystemSetting(Landroid/content/Context;)V

    .line 113
    :goto_0
    return-void
.end method

.method public static processMEIZU(Landroid/content/Context;)V
    .locals 5

    .line 63
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter meizu"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.meizu.safe"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 70
    goto :goto_0

    .line 65
    :catch_0
    move-exception v4

    .line 66
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not MEIZU, start oppo process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processOPPO(Landroid/content/Context;)V

    .line 70
    goto :goto_0

    .line 68
    :catch_1
    move-exception v4

    .line 69
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processOPPO(Landroid/content/Context;)V

    .line 71
    :goto_0
    return-void
.end method

.method public static processOPPO(Landroid/content/Context;)V
    .locals 6

    .line 76
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter oppo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.coloros.safecenter"

    const-string v1, "com.coloros.privacypermissionsentry.PermissionTopActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 80
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 81
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 82
    :catch_0
    move-exception v4

    .line 83
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not oppo, start system setting process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processVIVO(Landroid/content/Context;)V

    .line 86
    :goto_0
    return-void
.end method

.method public static processSystemSetting(Landroid/content/Context;)V
    .locals 5

    .line 117
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 119
    const-string v0, "package:com.unionpay.tsmbleuniteservice"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 120
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    goto :goto_0

    .line 121
    :catch_0
    move-exception v4

    .line 122
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t open system setting page. ingnored!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :goto_0
    return-void
.end method

.method public static processVIVO(Landroid/content/Context;)V
    .locals 5

    .line 91
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter vivo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.iqoo.secure"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 98
    goto :goto_0

    .line 93
    :catch_0
    move-exception v4

    .line 94
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not vivo, start system setting process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processLETV(Landroid/content/Context;)V

    .line 98
    goto :goto_0

    .line 96
    :catch_1
    move-exception v4

    .line 97
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processLETV(Landroid/content/Context;)V

    .line 99
    :goto_0
    return-void
.end method

.method public static processXIAOMI(Landroid/content/Context;)V
    .locals 6

    .line 47
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter xiaomi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.miui.securitycenter"

    const-string v1, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 51
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 52
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 53
    :catch_0
    move-exception v4

    .line 54
    sget-object v0, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not XIAOMI, start meizu process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-static {p0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->processMEIZU(Landroid/content/Context;)V

    .line 58
    :goto_0
    return-void
.end method
