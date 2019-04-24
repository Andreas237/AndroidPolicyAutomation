.class public Lnet/hockeyapp/android/UpdateFragment;
.super Landroid/app/DialogFragment;
.source "UpdateFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;
.implements Lnet/hockeyapp/android/UpdateInfoListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field public static final FRAGMENT_URL:Ljava/lang/String; = "url"

.field public static final FRAGMENT_VERSION_INFO:Ljava/lang/String; = "versionInfo"


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

.field private mUrlString:Ljava/lang/String;

.field private mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

.field private mVersionInfo:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lnet/hockeyapp/android/UpdateFragment;Landroid/app/Activity;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lnet/hockeyapp/android/UpdateFragment;->startDownloadTask(Landroid/app/Activity;)V

    return-void
.end method

.method public static newInstance(Lorg/json/JSONArray;Ljava/lang/String;)Lnet/hockeyapp/android/UpdateFragment;
    .locals 2

    .line 83
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url"

    .line 84
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "versionInfo"

    .line 85
    instance-of v1, p0, Lorg/json/JSONArray;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    check-cast p0, Lorg/json/JSONArray;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->toString(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {v0, p1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    new-instance p0, Lnet/hockeyapp/android/UpdateFragment;

    invoke-direct {p0}, Lnet/hockeyapp/android/UpdateFragment;-><init>()V

    .line 88
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/UpdateFragment;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method

.method private startDownloadTask(Landroid/app/Activity;)V
    .locals 3

    .line 245
    new-instance v0, Lnet/hockeyapp/android/tasks/DownloadFileTask;

    iget-object v1, p0, Lnet/hockeyapp/android/UpdateFragment;->mUrlString:Ljava/lang/String;

    new-instance v2, Lnet/hockeyapp/android/UpdateFragment$3;

    invoke-direct {v2, p0, p1}, Lnet/hockeyapp/android/UpdateFragment$3;-><init>(Lnet/hockeyapp/android/UpdateFragment;Landroid/app/Activity;)V

    invoke-direct {v0, p1, v1, v2}, Lnet/hockeyapp/android/tasks/DownloadFileTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    iput-object v0, p0, Lnet/hockeyapp/android/UpdateFragment;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    .line 257
    iget-object p1, p0, Lnet/hockeyapp/android/UpdateFragment;->mDownloadTask:Lnet/hockeyapp/android/tasks/DownloadFileTask;

    invoke-static {p1}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    return-void
.end method


# virtual methods
.method public getAppName()Ljava/lang/String;
    .locals 3

    .line 266
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 269
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 270
    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 271
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

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

    .line 218
    :try_start_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getLayoutView()Landroid/view/View;
    .locals 3

    .line 283
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 284
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lnet/hockeyapp/android/R$layout;->hockeyapp_fragment_update:I

    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 169
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->prepareDownload()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "UpdateFragment"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/hockeyapp/android/UpdateFragment;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "UpdateFragment#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "UpdateFragment#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :goto_0
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 104
    :try_start_1
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnet/hockeyapp/android/UpdateFragment;->mUrlString:Ljava/lang/String;

    .line 105
    new-instance p1, Lorg/json/JSONArray;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "versionInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionInfo:Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 p1, 0x1

    const v0, 0x1030073

    .line 111
    invoke-virtual {p0, p1, v0}, Lnet/hockeyapp/android/UpdateFragment;->setStyle(II)V

    .line 112
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void

    .line 107
    :catch_1
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->dismiss()V

    .line 108
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    const/4 p1, 0x0

    :try_start_0
    iget-object p2, p0, Lnet/hockeyapp/android/UpdateFragment;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string p3, "UpdateFragment#onCreateView"

    invoke-static {p2, p3, p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string p2, "UpdateFragment#onCreateView"

    invoke-static {p1, p2, p1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getLayoutView()Landroid/view/View;

    move-result-object p1

    .line 124
    new-instance p2, Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    iget-object v0, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionInfo:Lorg/json/JSONArray;

    instance-of v1, v0, Lorg/json/JSONArray;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    check-cast v0, Lorg/json/JSONArray;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->toString(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p2, p3, v0, p0}, Lnet/hockeyapp/android/utils/VersionHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/UpdateInfoListener;)V

    iput-object p2, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    .line 126
    sget p2, Lnet/hockeyapp/android/R$id;->label_title:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 127
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getAppName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    sget p2, Lnet/hockeyapp/android/R$id;->label_version:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 130
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Version "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v0}, Lnet/hockeyapp/android/utils/VersionHelper;->getVersionString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 131
    iget-object v0, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v0}, Lnet/hockeyapp/android/utils/VersionHelper;->getFileDateString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unknown size"

    .line 134
    iget-object v2, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {v2}, Lnet/hockeyapp/android/utils/VersionHelper;->getFileSizeBytes()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    cmp-long v8, v2, v4

    if-ltz v8, :cond_1

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "%.2f"

    new-array v8, v7, [Ljava/lang/Object;

    long-to-float v2, v2

    const/high16 v3, 0x49800000    # 1048576.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v8, v6

    invoke-static {v4, v5, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MB"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 138
    :cond_1
    new-instance v2, Lnet/hockeyapp/android/tasks/GetFileSizeTask;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    iget-object v4, p0, Lnet/hockeyapp/android/UpdateFragment;->mUrlString:Ljava/lang/String;

    new-instance v5, Lnet/hockeyapp/android/UpdateFragment$1;

    invoke-direct {v5, p0, p2, p3, v0}, Lnet/hockeyapp/android/UpdateFragment$1;-><init>(Lnet/hockeyapp/android/UpdateFragment;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3, v4, v5}, Lnet/hockeyapp/android/tasks/GetFileSizeTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/listeners/DownloadFileListener;)V

    .line 148
    invoke-static {v2}, Lnet/hockeyapp/android/utils/AsyncTaskUtils;->execute(Landroid/os/AsyncTask;)V

    .line 150
    :goto_2
    sget v2, Lnet/hockeyapp/android/R$string;->hockeyapp_update_version_details_label:I

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p3, v3, v6

    aput-object v0, v3, v7

    const/4 p3, 0x2

    aput-object v1, v3, p3

    invoke-virtual {p0, v2, v3}, Lnet/hockeyapp/android/UpdateFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    sget p2, Lnet/hockeyapp/android/R$id;->button_update:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    .line 153
    instance-of p3, p2, Landroid/view/View;

    if-nez p3, :cond_2

    invoke-virtual {p2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_2
    check-cast p2, Landroid/view/View;

    invoke-static {p2, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 155
    :goto_3
    sget p2, Lnet/hockeyapp/android/R$id;->web_update_details:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/webkit/WebView;

    .line 156
    invoke-virtual {v0, v7}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 157
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroyDrawingCache()V

    const-string v1, "https://sdk.hockeyapp.net/"

    .line 158
    iget-object p2, p0, Lnet/hockeyapp/android/UpdateFragment;->mVersionHelper:Lnet/hockeyapp/android/utils/VersionHelper;

    invoke-virtual {p2, v6}, Lnet/hockeyapp/android/utils/VersionHelper;->getReleaseNotes(Z)Ljava/lang/String;

    move-result-object v2

    const-string v3, "text/html"

    const-string v4, "utf-8"

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 174
    array-length p2, p2

    if-eqz p2, :cond_4

    array-length p2, p3

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    if-ne p1, p2, :cond_3

    const/4 p1, 0x0

    .line 181
    aget p1, p3, p1

    if-nez p1, :cond_1

    .line 183
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/hockeyapp/android/UpdateFragment;->startDownloadTask(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    const-string p1, "User denied write permission, can\'t continue with updater task."

    .line 186
    invoke-static {p1}, Lnet/hockeyapp/android/utils/HockeyLog;->warn(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lnet/hockeyapp/android/UpdateManager;->getLastListener()Lnet/hockeyapp/android/UpdateManagerListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 190
    invoke-virtual {p1}, Lnet/hockeyapp/android/UpdateManagerListener;->onUpdatePermissionsNotGranted()V

    goto :goto_0

    .line 193
    :cond_2
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_update_title:I

    .line 194
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_update_message:I

    .line 195
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_dialog_negative_button:I

    .line 196
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget p2, Lnet/hockeyapp/android/R$string;->hockeyapp_permission_dialog_positive_button:I

    .line 197
    invoke-virtual {p0, p2}, Lnet/hockeyapp/android/UpdateFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lnet/hockeyapp/android/UpdateFragment$2;

    invoke-direct {p3, p0, p0}, Lnet/hockeyapp/android/UpdateFragment$2;-><init>(Lnet/hockeyapp/android/UpdateFragment;Lnet/hockeyapp/android/UpdateFragment;)V

    invoke-virtual {p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 202
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 203
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureObserver;->getInstance()Lcom/newrelic/agent/android/gestures/GestureObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityOrFragmentStarted(Ljava/lang/Object;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/DialogFragment;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureObserver;->getInstance()Lcom/newrelic/agent/android/gestures/GestureObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityOrFragmentStopped(Ljava/lang/Object;)V

    return-void
.end method

.method public prepareDownload()V
    .locals 2

    .line 227
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 229
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 231
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lnet/hockeyapp/android/UpdateFragment;->requestPermissions([Ljava/lang/String;I)V

    return-void

    .line 236
    :cond_0
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/hockeyapp/android/UpdateFragment;->startDownloadTask(Landroid/app/Activity;)V

    .line 237
    invoke-virtual {p0}, Lnet/hockeyapp/android/UpdateFragment;->dismiss()V

    return-void
.end method
