.class public Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x17
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static createPendingIntent(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 3

    .line 40
    const-class v0, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/squareup/leakcanary/internal/LeakCanaryInternals;->setEnabledBlocking(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 41
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 42
    const/high16 v0, 0x14000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 43
    const/4 v0, 0x1

    const/high16 v1, 0x8000000

    invoke-static {p0, v0, v2, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private hasStoragePermission()Z
    .locals 1

    .line 71
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 47
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 49
    if-nez p1, :cond_1

    .line 50
    invoke-direct {p0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->hasStoragePermission()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->finish()V

    .line 52
    return-void

    .line 54
    :cond_0
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 57
    const/16 v0, 0x2a

    invoke-virtual {p0, v2, v0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 59
    :cond_1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 63
    invoke-direct {p0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->hasStoragePermission()Z

    move-result v0

    if-nez v0, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    sget v1, Lcom/squareup/leakcanary/R$string;->leak_canary_permission_not_granted:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/squareup/leakcanary/internal/RequestStoragePermissionActivity;->finish()V

    .line 68
    return-void
.end method
