.class public Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;
.super Lnet/hockeyapp/android/tasks/CheckUpdateTask;
.source "CheckUpdateTaskWithUI.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mDialog:Landroid/app/AlertDialog;

.field protected mIsDialogRequired:Z


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;Z)V
    .locals 0
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

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/hockeyapp/android/tasks/CheckUpdateTask;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/UpdateManagerListener;)V

    const/4 p2, 0x0

    .line 36
    iput-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    .line 37
    iput-object p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mDialog:Landroid/app/AlertDialog;

    const/4 p2, 0x0

    .line 38
    iput-boolean p2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mIsDialogRequired:Z

    if-eqz p1, :cond_0

    .line 44
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    .line 47
    :cond_0
    iput-boolean p5, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mIsDialogRequired:Z

    return-void
.end method

.method static synthetic access$000(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;)Landroid/app/Activity;
    .locals 0

    .line 34
    iget-object p0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->showUpdateFragment(Lorg/json/JSONArray;)V

    return-void
.end method

.method static synthetic access$200(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;Ljava/lang/Boolean;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->startUpdateIntent(Lorg/json/JSONArray;Ljava/lang/Boolean;)V

    return-void
.end method

.method private showDialog(Lorg/json/JSONArray;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 76
    invoke-virtual {p0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->getCachingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "HockeyUpdate"

    const-string v1, "Caching is enabled. Setting version to cached one."

    .line 77
    invoke-static {v0, v1}, Lnet/hockeyapp/android/utils/HockeyLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    instance-of v1, p1, Lorg/json/JSONArray;

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    check-cast v1, Lorg/json/JSONArray;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->toString(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Lnet/hockeyapp/android/utils/VersionCache;->setVersionInfo(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    :cond_1
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 85
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 86
    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_update_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 88
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mandatory:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3

    .line 89
    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_update_dialog_message:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 90
    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_update_dialog_negative_button:I

    new-instance v2, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$1;

    invoke-direct {v2, p0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$1;-><init>(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 99
    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_update_dialog_positive_button:I

    new-instance v2, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;

    invoke-direct {v2, p0, p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI$2;-><init>(Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;Lorg/json/JSONArray;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 114
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mDialog:Landroid/app/AlertDialog;

    .line 115
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_1

    .line 117
    :cond_3
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-static {v0}, Lnet/hockeyapp/android/utils/Util;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 118
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    sget v2, Lnet/hockeyapp/android/R$string;->hockeyapp_update_mandatory_toast:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 121
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->startUpdateIntent(Lorg/json/JSONArray;Ljava/lang/Boolean;)V

    :goto_1
    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method private showUpdateFragment(Lorg/json/JSONArray;)V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 127
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 128
    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const/16 v1, 0x1001

    .line 129
    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->setTransition(I)Landroid/app/FragmentTransaction;

    .line 131
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "hockey_update_dialog"

    invoke-virtual {v1, v2}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 133
    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    :cond_0
    const/4 v1, 0x0

    .line 135
    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 138
    const-class v2, Lnet/hockeyapp/android/UpdateFragment;

    .line 139
    iget-object v3, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->listener:Lnet/hockeyapp/android/UpdateManagerListener;

    if-eqz v3, :cond_1

    .line 140
    iget-object v2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->listener:Lnet/hockeyapp/android/UpdateManagerListener;

    invoke-virtual {v2}, Lnet/hockeyapp/android/UpdateManagerListener;->getUpdateFragmentClass()Ljava/lang/Class;

    move-result-object v2

    :cond_1
    const/4 v3, 0x0

    :try_start_0
    const-string v4, "newInstance"

    const/4 v5, 0x2

    .line 144
    new-array v6, v5, [Ljava/lang/Class;

    const-class v7, Lorg/json/JSONArray;

    aput-object v7, v6, v3

    const-class v7, Ljava/lang/String;

    const/4 v8, 0x1

    aput-object v7, v6, v8

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 145
    new-array v4, v5, [Ljava/lang/Object;

    aput-object p1, v4, v3

    const-string v5, "apk"

    invoke-virtual {p0, v5}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->getURLString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/DialogFragment;

    const-string v2, "hockey_update_dialog"

    .line 146
    invoke-virtual {v1, v0, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentTransaction;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "An exception happened while showing the update fragment:"

    .line 148
    invoke-static {v1}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;)V

    .line 149
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const-string v0, "Showing update activity instead."

    .line 150
    invoke-static {v0}, Lnet/hockeyapp/android/utils/HockeyLog;->error(Ljava/lang/String;)V

    .line 151
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->startUpdateIntent(Lorg/json/JSONArray;Ljava/lang/Boolean;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private startUpdateIntent(Lorg/json/JSONArray;Ljava/lang/Boolean;)V
    .locals 3

    .line 158
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->listener:Lnet/hockeyapp/android/UpdateManagerListener;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->listener:Lnet/hockeyapp/android/UpdateManagerListener;

    invoke-virtual {v0}, Lnet/hockeyapp/android/UpdateManagerListener;->getUpdateActivityClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 162
    const-class v0, Lnet/hockeyapp/android/UpdateActivity;

    .line 165
    :cond_1
    iget-object v1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    if-eqz v1, :cond_3

    .line 166
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 167
    iget-object v2, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v0, "json"

    .line 168
    instance-of v2, p1, Lorg/json/JSONArray;

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    check-cast p1, Lorg/json/JSONArray;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->toString(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "url"

    const-string v0, "apk"

    .line 169
    invoke-virtual {p0, v0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->getURLString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 172
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 173
    iget-object p1, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 177
    :cond_3
    invoke-virtual {p0}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->cleanUp()V

    return-void
.end method


# virtual methods
.method protected cleanUp()V
    .locals 1

    .line 182
    invoke-super {p0}, Lnet/hockeyapp/android/tasks/CheckUpdateTask;->cleanUp()V

    const/4 v0, 0x0

    .line 183
    iput-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mActivity:Landroid/app/Activity;

    .line 184
    iput-object v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mDialog:Landroid/app/AlertDialog;

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 34
    check-cast p1, Lorg/json/JSONArray;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->onPostExecute(Lorg/json/JSONArray;)V

    return-void
.end method

.method protected onPostExecute(Lorg/json/JSONArray;)V
    .locals 1

    .line 64
    invoke-super {p0, p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTask;->onPostExecute(Lorg/json/JSONArray;)V

    if-eqz p1, :cond_0

    .line 66
    iget-boolean v0, p0, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->mIsDialogRequired:Z

    if-eqz v0, :cond_0

    .line 67
    invoke-direct {p0, p1}, Lnet/hockeyapp/android/tasks/CheckUpdateTaskWithUI;->showDialog(Lorg/json/JSONArray;)V

    :cond_0
    return-void
.end method
