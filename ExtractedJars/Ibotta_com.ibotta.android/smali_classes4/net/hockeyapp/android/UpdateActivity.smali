.class public Lnet/hockeyapp/android/UpdateActivity;
.super Landroid/app/Activity;
.source "UpdateActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;
.implements Lnet/hockeyapp/android/UpdateActivityInterface;
.implements Lnet/hockeyapp/android/UpdateInfoListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private mContext:Landroid/content/Context;

.field protected mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

.field private mError:Lnet/hockeyapp/android/objects/ErrorObject;

.field protected mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lnet/hockeyapp/android/UpdateActivity;Lnet/hockeyapp/android/objects/ErrorObject;)Lnet/hockeyapp/android/objects/ErrorObject;
    .locals 0

    .line 40
    iput-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    return-object p1
.end method

.method private isUnknownSourcesChecked()Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/4 v0, 0x1

    .line 350
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v1, v2, :cond_1

    .line 351
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "install_non_market_apps"

    invoke-static {v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 353
    :cond_1
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "install_non_market_apps"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0

    :catch_0
    return v0
.end method

.method private isWriteExternalStorageSet(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 336
    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method protected configureView()V
    .locals 11

    .line 224
    sget v0, Lnet/hockeyapp/android/R$id;->label_title:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 225
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    sget v0, Lnet/hockeyapp/android/R$id;->label_version:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 228
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnet/hockeyapp/android/UpdateActivity;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v2}, Lnet/hockeyapp/android/utils/VersionHelper;->getVersionString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 229
    iget-object v2, p0, Lnet/hockeyapp/android/UpdateActivity;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v2}, Lnet/hockeyapp/android/utils/VersionHelper;->getFileDateString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unknown size"

    .line 232
    iget-object v4, p0, Lnet/hockeyapp/android/UpdateActivity;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v4}, Lnet/hockeyapp/android/utils/VersionHelper;->getFileSizeBytes()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    cmp-long v10, v4, v8

    if-ltz v10, :cond_0

    .line 234
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, "%.2f"

    new-array v10, v7, [Ljava/lang/Object;

    long-to-float v4, v4

    const/high16 v5, 0x49800000    # 1048576.0f

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v10, v6

    invoke-static {v8, v9, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " MB"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 236
    :cond_0
    new-instance v4, Lnet/hockeyapp/android/tasks/GetFileSizeTask;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    const-string v8, "url"

    invoke-virtual {v5, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v8, Lnet/hockeyapp/android/UpdateActivity$3;

    invoke-direct {v8, p0, v0, v1, v2}, Lnet/hockeyapp/android/UpdateActivity$3;-><init>(Lnet/hockeyapp/android/UpdateActivity;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v4, p0, v5, v8}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    .line 246
    invoke-static {v4}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    .line 248
    :goto_0
    sget v4, Lnet/hockeyapp/android/R$string;->hockeyapp_update_version_details_label:I

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v6

    aput-object v2, v5, v7

    const/4 v1, 0x2

    aput-object v3, v5, v1

    invoke-virtual {p0, v4, v5}, Lnet/hockeyapp/android/UpdateActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    sget v0, Lnet/hockeyapp/android/R$id;->button_update:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 251
    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 253
    :goto_1
    sget v0, Lnet/hockeyapp/android/R$id;->web_update_details:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/webkit/WebView;

    .line 254
    invoke-virtual {v1, v7}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 255
    invoke-virtual {v1}, Landroid/webkit/WebView;->destroyDrawingCache()V

    const-string v2, "https://sdk.hockeyapp.net/"

    .line 256
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getReleaseNotes()Ljava/lang/String;

    move-result-object v3

    const-string v4, "text/html"

    const-string v5, "utf-8"

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected createDownloadTask(Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V
    .locals 1

    .line 302
    new-instance v0, Lnet/hockeyapp/android/tasks/DownloadFileTask;

    invoke-direct {v0, p0, p1, p2}, Lnet/hockeyapp/android/tasks/DownloadFileTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    iput-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    return-void
.end method

.method public enableUpdateButton()V
    .locals 2

    .line 309
    sget v0, Lnet/hockeyapp/android/R$id;->button_update:I

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 310
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public getAppName()Ljava/lang/String;
    .locals 3

    .line 320
    :try_start_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 321
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 322
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method

.method public getCurrentVersionCode()I
    .locals 3

    .line 193
    :try_start_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getLayoutView()Landroid/view/View;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 207
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lnet/hockeyapp/android/R$layout;->hockeyapp_activity_update:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected getReleaseNotes()Ljava/lang/String;
    .locals 2

    .line 265
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnet/hockeyapp/android/utils/VersionHelper;->getReleaseNotes(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 215
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->prepareDownload()V

    const/4 v0, 0x0

    .line 216
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "UpdateActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/hockeyapp/android/UpdateActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "UpdateActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "UpdateActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "App Update"

    .line 74
    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/UpdateActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getLayoutView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/UpdateActivity;->setContentView(Landroid/view/View;)V

    .line 77
    iput-object p0, p0, Lnet/hockeyapp/android/UpdateActivity;->mContext:Landroid/content/Context;

    .line 78
    new-instance p1, Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "json"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p0, v0, p0}, Lnet/hockeyapp/android/utils/VersionHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/UpdateInfoListener;)V

    iput-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    .line 79
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->configureView()V

    .line 81
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/hockeyapp/android/tasks/DownloadFileTask;

    iput-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    .line 82
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    if-eqz p1, :cond_0

    .line 83
    invoke-virtual {p1, p0}, Lnet/hockeyapp/android/tasks/DownloadFileTask;->attach(Landroid/content/Context;)V

    .line 85
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 1

    const/4 v0, 0x0

    .line 104
    invoke-virtual {p0, p1, v0}, Lnet/hockeyapp/android/UpdateActivity;->onCreateDialog(ILandroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    return-object p1
.end method

.method protected onCreateDialog(ILandroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 111
    :cond_0
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string p2, "An error has occured"

    .line 112
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 113
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "Error"

    .line 114
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const p2, 0x1080027

    .line 115
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "OK"

    new-instance v0, Lnet/hockeyapp/android/UpdateActivity$1;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/UpdateActivity$1;-><init>(Lnet/hockeyapp/android/UpdateActivity;)V

    .line 116
    invoke-virtual {p1, p2, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 121
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    check-cast p2, Landroid/app/AlertDialog;

    .line 132
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    if-eqz p1, :cond_1

    .line 134
    invoke-virtual {p1}, Lnet/hockeyapp/android/objects/ErrorObject;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const-string p1, "An unknown error has occured."

    .line 137
    invoke-virtual {p2, p1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 147
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->enableUpdateButton()V

    .line 149
    array-length p2, p2

    if-eqz p2, :cond_4

    array-length p2, p3

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    if-ne p1, p2, :cond_3

    const/4 p1, 0x0

    .line 156
    aget p1, p3, p1

    if-nez p1, :cond_1

    .line 158
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->prepareDownload()V

    goto :goto_0

    :cond_1
    const-string p1, "User denied write permission, can\'t continue with updater task."

    .line 161
    invoke-static {p1}, Lnet/hockeyapp/android/utils/HockeyLog;->warn(Ljava/lang/String;)V

    .line 163
    invoke-static {}, Lnet/hockeyapp/android/UpdateManager;->getLastListener()Lnet/hockeyapp/android/UpdateManagerListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 165
    invoke-virtual {p1}, Lnet/hockeyapp/android/UpdateManagerListener;->onUpdatePermissionsNotGranted()V

    goto :goto_0

    .line 168
    :cond_2
    new-instance p1, Landroid/app/AlertDialog$Builder;

    iget-object p2, p0, Lnet/hockeyapp/android/UpdateActivity;->mContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_update_title:I

    .line 169
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_update_message:I

    .line 170
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_dialog_negative_button:I

    .line 171
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_dialog_positive_button:I

    .line 172
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lnet/hockeyapp/android/UpdateActivity$2;

    invoke-direct {p3, p0, p0}, Lnet/hockeyapp/android/UpdateActivity$2;-><init>(Lnet/hockeyapp/android/UpdateActivity;Lnet/hockeyapp/android/UpdateActivity;)V

    invoke-virtual {p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 177
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 178
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 1

    .line 96
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v0}, Lnet/hockeyapp/android/tasks/DownloadFileTask;->detach()V

    .line 99
    :cond_0
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    return-object v0
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    return-void
.end method

.method protected prepareDownload()V
    .locals 2

    .line 361
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lnet/hockeyapp/android/utils/Util;->isConnectedToNetwork(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 362
    new-instance v0, Lnet/hockeyapp/android/objects/ErrorObject;

    invoke-direct {v0}, Lnet/hockeyapp/android/objects/ErrorObject;-><init>()V

    iput-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    .line 363
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_error_no_network_message:I

    invoke-virtual {p0, v1}, Lnet/hockeyapp/android/UpdateActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/hockeyapp/android/objects/ErrorObject;->setMessage(Ljava/lang/String;)V

    .line 365
    new-instance v0, Lnet/hockeyapp/android/UpdateActivity$5;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/UpdateActivity$5;-><init>(Lnet/hockeyapp/android/UpdateActivity;)V

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 374
    :cond_0
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->isWriteExternalStorageSet(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 376
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 378
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lnet/hockeyapp/android/UpdateActivity;->requestPermissions([Ljava/lang/String;I)V

    return-void

    .line 382
    :cond_1
    new-instance v0, Lnet/hockeyapp/android/objects/ErrorObject;

    invoke-direct {v0}, Lnet/hockeyapp/android/objects/ErrorObject;-><init>()V

    iput-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    .line 383
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    const-string v1, "The permission to access the external storage permission is not set. Please contact the developer."

    invoke-virtual {v0, v1}, Lnet/hockeyapp/android/objects/ErrorObject;->setMessage(Ljava/lang/String;)V

    .line 385
    new-instance v0, Lnet/hockeyapp/android/UpdateActivity$6;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/UpdateActivity$6;-><init>(Lnet/hockeyapp/android/UpdateActivity;)V

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 396
    :cond_2
    invoke-direct {p0}, Lnet/hockeyapp/android/UpdateActivity;->isUnknownSourcesChecked()Z

    move-result v0

    if-nez v0, :cond_3

    .line 397
    new-instance v0, Lnet/hockeyapp/android/objects/ErrorObject;

    invoke-direct {v0}, Lnet/hockeyapp/android/objects/ErrorObject;-><init>()V

    iput-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    .line 398
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateActivity;->mError:Lnet/hockeyapp/android/objects/ErrorObject;

    const-string v1, "The installation from unknown sources is not enabled. Please check the device settings."

    invoke-virtual {v0, v1}, Lnet/hockeyapp/android/objects/ErrorObject;->setMessage(Ljava/lang/String;)V

    .line 400
    new-instance v0, Lnet/hockeyapp/android/UpdateActivity$7;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/UpdateActivity$7;-><init>(Lnet/hockeyapp/android/UpdateActivity;)V

    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 411
    :cond_3
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->startDownloadTask()V

    return-void
.end method

.method protected startDownloadTask()V
    .locals 2

    .line 274
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 275
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateActivity;->startDownloadTask(Ljava/lang/String;)V

    return-void
.end method

.method protected startDownloadTask(Ljava/lang/String;)V
    .locals 1

    .line 285
    new-instance v0, Lnet/hockeyapp/android/UpdateActivity$4;

    invoke-direct {v0, p0}, Lnet/hockeyapp/android/UpdateActivity$4;-><init>(Lnet/hockeyapp/android/UpdateActivity;)V

    invoke-virtual {p0, p1, v0}, Lnet/hockeyapp/android/UpdateActivity;->createDownloadTask(Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    .line 298
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateActivity;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    invoke-static {p1}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    return-void
.end method
