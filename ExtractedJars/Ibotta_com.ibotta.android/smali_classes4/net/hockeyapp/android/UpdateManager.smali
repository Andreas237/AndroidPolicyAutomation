.class public Lnet/hockeyapp/android/UpdateManager;
.super Ljava/lang/Object;
.source "UpdateManager.java"


# static fields
.field private static lastListener:Lnet/hockeyapp/android/UpdateManagerListener;

.field private static updateTask:Lnet/hockeyapp/android/tasks/CheckUpdateTask;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static checkExpiryDate(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/UpdateManagerListener;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Lnet/hockeyapp/android/UpdateManagerListener;",
            ")Z"
        }
    .end annotation

    .line 182
    invoke-static {p1}, Lnet/hockeyapp/android/UpdateManager;->checkExpiryDateForBackground(Lnet/hockeyapp/android/UpdateManagerListener;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    invoke-virtual {p1}, Lnet/hockeyapp/android/UpdateManagerListener;->onBuildExpired()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 188
    invoke-static {p0}, Lnet/hockeyapp/android/UpdateManager;->startExpiryInfoIntent(Ljava/lang/ref/WeakReference;)V

    :cond_1
    return v0
.end method

.method private static checkExpiryDateForBackground(Lnet/hockeyapp/android/UpdateManagerListener;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 202
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateManagerListener;->getExpiryDate()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 203
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, p0}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private static dialogShown(Ljava/lang/ref/WeakReference;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 276
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-eqz p0, :cond_1

    .line 278
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v1, "hockey_update_dialog"

    invoke-virtual {p0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    return v0
.end method

.method public static getLastListener()Lnet/hockeyapp/android/UpdateManagerListener;
    .locals 1

    .line 292
    sget-object v0, Lnet/hockeyapp/android/UpdateManager;->lastListener:Lnet/hockeyapp/android/UpdateManagerListener;

    return-object v0
.end method

.method private static installedFromMarket(Ljava/lang/ref/WeakReference;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "+",
            "Landroid/content/Context;",
            ">;)Z"
        }
    .end annotation

    .line 215
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 218
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 219
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p0, :cond_1

    const-string v1, "adb"

    invoke-static {p0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    const/4 v0, 0x1

    :catch_0
    :cond_1
    return v0
.end method

.method public static register(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 58
    invoke-static {p0, p1, v0}, Lnet/hockeyapp/android/UpdateManager;->register(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void
.end method

.method public static register(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V
    .locals 1

    .line 117
    invoke-static {p2}, Lnet/hockeyapp/android/utils/Util;->sanitizeAppIdentifier(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 119
    sput-object p3, Lnet/hockeyapp/android/UpdateManager;->lastListener:Lnet/hockeyapp/android/UpdateManagerListener;

    .line 121
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 122
    invoke-static {}, Lnet/hockeyapp/android/utils/Util;->fragmentsSupported()Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v0}, Lnet/hockeyapp/android/UpdateManager;->dialogShown(Ljava/lang/ref/WeakReference;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 126
    :cond_0
    invoke-static {v0, p3}, Lnet/hockeyapp/android/UpdateManager;->checkExpiryDate(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/UpdateManagerListener;)Z

    move-result p0

    if-nez p0, :cond_3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lnet/hockeyapp/android/UpdateManagerListener;->canUpdateInMarket()Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    invoke-static {v0}, Lnet/hockeyapp/android/UpdateManager;->installedFromMarket(Ljava/lang/ref/WeakReference;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 127
    :cond_2
    invoke-static {v0, p1, p2, p3, p4}, Lnet/hockeyapp/android/UpdateManager;->startUpdateTask(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V

    :cond_3
    return-void
.end method

.method public static register(Landroid/app/Activity;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V
    .locals 1

    const-string v0, "https://sdk.hockeyapp.net/"

    .line 92
    invoke-static {p0, v0, p1, p2, p3}, Lnet/hockeyapp/android/UpdateManager;->register(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V

    return-void
.end method

.method public static register(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 69
    invoke-static {p0, p1, v0, p2}, Lnet/hockeyapp/android/UpdateManager;->register(Landroid/app/Activity;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V

    return-void
.end method

.method private static startExpiryInfoIntent(Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 233
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-eqz p0, :cond_0

    .line 235
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 237
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lnet/hockeyapp/android/ExpiryInfoActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x14000000

    .line 238
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 239
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private static startUpdateTask(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnet/hockeyapp/android/UpdateManagerListener;",
            "Z)V"
        }
    .end annotation

    .line 249
    sget-object v0, Lnet/hockeyapp/android/UpdateManager;->updateTask:Lnet/hockeyapp/android/tasks/CheckUpdateTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lnet/hockeyapp/android/tasks/CheckUpdateTask;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 253
    :cond_0
    sget-object p1, Lnet/hockeyapp/android/UpdateManager;->updateTask:Lnet/hockeyapp/android/tasks/CheckUpdateTask;

    invoke-virtual {p1, p0}, Lnet/hockeyapp/android/tasks/CheckUpdateTask;->attach(Ljava/lang/ref/WeakReference;)V

    goto :goto_1

    .line 250
    :cond_1
    :goto_0
    new-instance v6, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V

    sput-object v6, Lnet/hockeyapp/android/UpdateManager;->updateTask:Lnet/hockeyapp/android/tasks/CheckUpdateTask;

    .line 251
    sget-object p0, Lnet/hockeyapp/android/UpdateManager;->updateTask:Lnet/hockeyapp/android/tasks/CheckUpdateTask;

    invoke-static {p0}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    :goto_1
    return-void
.end method
