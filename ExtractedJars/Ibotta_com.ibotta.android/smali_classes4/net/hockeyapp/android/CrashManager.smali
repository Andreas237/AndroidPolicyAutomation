.class public Lnet/hockeyapp/android/CrashManager;
.super Ljava/lang/Object;
.source "CrashManager.java"


# static fields
.field private static didCrashInLastSession:Z = false

.field private static identifier:Ljava/lang/String; = null

.field private static initializeTimestamp:J = 0x0L

.field private static submitting:Z = false

.field private static urlString:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method static synthetic access$002(Z)Z
    .locals 0

    .line 43
    sput-boolean p0, Lnet/hockeyapp/android/CrashManager;->submitting:Z

    return p0
.end method

.method private static contentsOfFile(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 696
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_3

    .line 698
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object p0

    invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 703
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 704
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "line.separator"

    .line 705
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 713
    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    goto :goto_5

    :catchall_0
    move-exception p0

    move-object v0, v2

    goto :goto_3

    :catch_0
    move-exception p0

    move-object v0, v2

    goto :goto_1

    :catch_1
    move-object v0, v2

    goto :goto_4

    :catchall_1
    move-exception p0

    goto :goto_3

    :catch_2
    move-exception p0

    .line 709
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_2

    .line 713
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_5

    :goto_3
    if-eqz v0, :cond_1

    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 715
    :catch_3
    :cond_1
    throw p0

    :catch_4
    nop

    :goto_4
    if-eqz v0, :cond_2

    goto :goto_2

    .line 719
    :catch_5
    :cond_2
    :goto_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method

.method private static deleteRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 657
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_0

    const-string p2, "HockeySDK"

    const/4 v0, 0x0

    .line 659
    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 660
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 661
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "RETRY_COUNT: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 662
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method private static deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 674
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_0

    .line 676
    invoke-virtual {p0, p1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    const-string v0, ".stacktrace"

    const-string v1, ".user"

    .line 678
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 679
    invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    const-string v0, ".stacktrace"

    const-string v1, ".contact"

    .line 681
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 682
    invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    const-string v0, ".stacktrace"

    const-string v1, ".description"

    .line 684
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 685
    invoke-virtual {p0, p1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public static deleteStackTraces(Ljava/lang/ref/WeakReference;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 387
    invoke-static {}, Lnet/hockeyapp/android/CrashManager;->searchForStackTraces()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 389
    array-length v1, v0

    if-lez v1, :cond_1

    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " stacktrace(s)."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 392
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    if-eqz p0, :cond_0

    .line 396
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Delete stacktrace "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 397
    aget-object v2, v0, v1

    invoke-static {p0, v2}, Lnet/hockeyapp/android/CrashManager;->deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 399
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-eqz v2, :cond_0

    .line 401
    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    .line 405
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static execute(Landroid/content/Context;Lnet/hockeyapp/android/CrashManagerListener;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 167
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->ignoreDefaultHandler()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 168
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 170
    invoke-static {v3}, Lnet/hockeyapp/android/CrashManager;->hasStackTraces(Ljava/lang/ref/WeakReference;)I

    move-result v4

    if-ne v4, v1, :cond_4

    .line 172
    sput-boolean v1, Lnet/hockeyapp/android/CrashManager;->didCrashInLastSession:Z

    .line 173
    instance-of v4, p0, Landroid/app/Activity;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 174
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 175
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v4, "always_send_crash_reports"

    invoke-interface {p0, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    or-int/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p1, :cond_2

    .line 178
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->shouldAutoUploadCrashes()Z

    move-result v0

    or-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesFound()Z

    move-result v0

    or-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    .line 181
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onNewCrashesFound()V

    .line 184
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_3

    .line 185
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {v3, p1, p0}, Lnet/hockeyapp/android/CrashManager;->showDialog(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    goto :goto_2

    .line 187
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {v3, p1, p0}, Lnet/hockeyapp/android/CrashManager;->sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    goto :goto_2

    :cond_4
    const/4 p0, 0x2

    if-ne v4, p0, :cond_6

    if-eqz p1, :cond_5

    .line 191
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onConfirmedCrashesFound()V

    .line 194
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {v3, p1, p0}, Lnet/hockeyapp/android/CrashManager;->sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    goto :goto_2

    .line 196
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {v3, p1, p0}, Lnet/hockeyapp/android/CrashManager;->registerHandler(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    :goto_2
    return-void
.end method

.method private static getAlertTitle(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 553
    invoke-static {p0}, Lnet/hockeyapp/android/utils/Util;->getAppName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 555
    sget v1, Lnet/hockeyapp/android/R$string;->hockeyapp_crash_dialog_title:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    .line 556
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getConfirmedFilenames(Ljava/lang/ref/WeakReference;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 792
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_0

    const-string v0, "HockeySDK"

    const/4 v1, 0x0

    .line 794
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "ConfirmedFilenames"

    const-string v1, ""

    .line 795
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\|"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static getInitializeTimestamp()J
    .locals 2

    .line 802
    sget-wide v0, Lnet/hockeyapp/android/CrashManager;->initializeTimestamp:J

    return-wide v0
.end method

.method private static getURLString()Ljava/lang/String;
    .locals 2

    .line 620
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lnet/hockeyapp/android/CrashManager;->urlString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "api/2/apps/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lnet/hockeyapp/android/CrashManager;->identifier:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/crashes/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static handleUserInput(Lnet/hockeyapp/android/objects/CrashManagerUserInput;Lnet/hockeyapp/android/objects/CrashMetaData;Lnet/hockeyapp/android/CrashManagerListener;Ljava/lang/ref/WeakReference;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/hockeyapp/android/objects/CrashManagerUserInput;",
            "Lnet/hockeyapp/android/objects/CrashMetaData;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;Z)Z"
        }
    .end annotation

    .line 428
    sget-object v0, Lnet/hockeyapp/android/CrashManager$7;->$SwitchMap$net$hockeyapp$android$objects$CrashManagerUserInput:[I

    invoke-virtual {p0}, Lnet/hockeyapp/android/objects/CrashManagerUserInput;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    packed-switch p0, :pswitch_data_0

    return v0

    .line 453
    :pswitch_0
    invoke-static {p3, p2, p4, p1}, Lnet/hockeyapp/android/CrashManager;->sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;ZLnet/hockeyapp/android/objects/CrashMetaData;)V

    return v1

    :pswitch_1
    const/4 p0, 0x0

    if-eqz p3, :cond_0

    .line 440
    invoke-virtual {p3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    :cond_0
    if-nez p0, :cond_1

    return v0

    .line 447
    :cond_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 448
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "always_send_crash_reports"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 450
    invoke-static {p3, p2, p4, p1}, Lnet/hockeyapp/android/CrashManager;->sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;ZLnet/hockeyapp/android/objects/CrashMetaData;)V

    return v1

    :pswitch_2
    if-eqz p2, :cond_2

    .line 431
    invoke-virtual {p2}, Lnet/hockeyapp/android/CrashManagerListener;->onUserDeniedCrashes()V

    .line 434
    :cond_2
    invoke-static {p3}, Lnet/hockeyapp/android/CrashManager;->deleteStackTraces(Ljava/lang/ref/WeakReference;)V

    .line 435
    invoke-static {p3, p2, p4}, Lnet/hockeyapp/android/CrashManager;->registerHandler(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static hasStackTraces(Ljava/lang/ref/WeakReference;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;)I"
        }
    .end annotation

    .line 209
    invoke-static {}, Lnet/hockeyapp/android/CrashManager;->searchForStackTraces()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 212
    array-length v3, v0

    if-lez v3, :cond_3

    .line 214
    :try_start_0
    invoke-static {p0}, Lnet/hockeyapp/android/CrashManager;->getConfirmedFilenames(Ljava/lang/ref/WeakReference;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    const/4 v3, 0x2

    .line 223
    array-length v4, v0

    :goto_1
    if-ge v1, v4, :cond_1

    aget-object v5, v0, v1

    .line 224
    invoke-interface {p0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_2
    return v1
.end method

.method private static initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;Z)V
    .locals 5

    if-eqz p0, :cond_3

    .line 486
    sget-wide v0, Lnet/hockeyapp/android/CrashManager;->initializeTimestamp:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 487
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lnet/hockeyapp/android/CrashManager;->initializeTimestamp:J

    .line 489
    :cond_0
    sput-object p1, Lnet/hockeyapp/android/CrashManager;->urlString:Ljava/lang/String;

    .line 490
    invoke-static {p2}, Lnet/hockeyapp/android/utils/Util;->sanitizeAppIdentifier(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lnet/hockeyapp/android/CrashManager;->identifier:Ljava/lang/String;

    const/4 p1, 0x0

    .line 491
    sput-boolean p1, Lnet/hockeyapp/android/CrashManager;->didCrashInLastSession:Z

    .line 493
    invoke-static {p0}, Lnet/hockeyapp/android/Constants;->loadFromContext(Landroid/content/Context;)V

    .line 495
    sget-object p2, Lnet/hockeyapp/android/CrashManager;->identifier:Ljava/lang/String;

    if-nez p2, :cond_1

    .line 496
    sget-object p2, Lnet/hockeyapp/android/Constants;->APP_PACKAGE:Ljava/lang/String;

    sput-object p2, Lnet/hockeyapp/android/CrashManager;->identifier:Ljava/lang/String;

    :cond_1
    if-eqz p4, :cond_3

    if-eqz p3, :cond_2

    .line 500
    invoke-virtual {p3}, Lnet/hockeyapp/android/CrashManagerListener;->ignoreDefaultHandler()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p1, 0x1

    :cond_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 501
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 502
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p2, p3, p0}, Lnet/hockeyapp/android/CrashManager;->registerHandler(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    :cond_3
    return-void
.end method

.method private static joinArray([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 752
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 753
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 754
    aget-object v2, p0, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 755
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    .line 756
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 759
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-static {p0, p1, p2, p3, v0}, Lnet/hockeyapp/android/CrashManager;->initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    .line 125
    invoke-static {p0, p3}, Lnet/hockeyapp/android/CrashManager;->execute(Landroid/content/Context;Lnet/hockeyapp/android/CrashManagerListener;)V

    return-void
.end method

.method public static register(Landroid/content/Context;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;)V
    .locals 1

    const-string v0, "https://sdk.hockeyapp.net/"

    .line 110
    invoke-static {p0, v0, p1, p2}, Lnet/hockeyapp/android/CrashManager;->register(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnet/hockeyapp/android/CrashManagerListener;)V

    return-void
.end method

.method private static registerHandler(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Z)V"
        }
    .end annotation

    .line 598
    sget-object p0, Lnet/hockeyapp/android/Constants;->APP_VERSION:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Lnet/hockeyapp/android/Constants;->APP_PACKAGE:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 600
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Current handler class = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 606
    :cond_0
    instance-of v0, p0, Lnet/hockeyapp/android/ExceptionHandler;

    if-eqz v0, :cond_1

    .line 607
    check-cast p0, Lnet/hockeyapp/android/ExceptionHandler;

    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/ExceptionHandler;->setListener(Lnet/hockeyapp/android/CrashManagerListener;)V

    goto :goto_0

    .line 609
    :cond_1
    new-instance v0, Lnet/hockeyapp/android/ExceptionHandler;

    invoke-direct {v0, p0, p1, p2}, Lnet/hockeyapp/android/ExceptionHandler;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    goto :goto_0

    :cond_2
    const-string p0, "Exception handler not set because version or package is null."

    .line 612
    invoke-static {p0}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private static saveConfirmedStackTraces(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 732
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    if-eqz p0, :cond_0

    .line 735
    :try_start_0
    invoke-static {}, Lnet/hockeyapp/android/CrashManager;->searchForStackTraces()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "HockeySDK"

    const/4 v2, 0x0

    .line 736
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    .line 737
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v1, "ConfirmedFilenames"

    const-string v2, "|"

    .line 738
    invoke-static {v0, v2}, Lnet/hockeyapp/android/CrashManager;->joinArray([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 739
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private static searchForStackTraces()[Ljava/lang/String;
    .locals 3

    .line 766
    sget-object v0, Lnet/hockeyapp/android/Constants;->FILES_PATH:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 767
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Looking for exceptions in: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lnet/hockeyapp/android/Constants;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 770
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lnet/hockeyapp/android/Constants;->FILES_PATH:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 771
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v1

    if-nez v1, :cond_0

    .line 772
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 773
    new-array v0, v0, [Ljava/lang/String;

    return-object v0

    .line 777
    :cond_0
    new-instance v1, Lnet/hockeyapp/android/CrashManager$6;

    invoke-direct {v1}, Lnet/hockeyapp/android/CrashManager$6;-><init>()V

    .line 782
    invoke-virtual {v0, v1}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "Can\'t search for exception as file path is null."

    .line 784
    invoke-static {v0}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private static sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 564
    invoke-static {p0, p1, p2, v0}, Lnet/hockeyapp/android/CrashManager;->sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;ZLnet/hockeyapp/android/objects/CrashMetaData;)V

    return-void
.end method

.method private static sendCrashes(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;ZLnet/hockeyapp/android/objects/CrashMetaData;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Z",
            "Lnet/hockeyapp/android/objects/CrashMetaData;",
            ")V"
        }
    .end annotation

    .line 572
    invoke-static {p0}, Lnet/hockeyapp/android/CrashManager;->saveConfirmedStackTraces(Ljava/lang/ref/WeakReference;)V

    .line 573
    invoke-static {p0, p1, p2}, Lnet/hockeyapp/android/CrashManager;->registerHandler(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V

    .line 575
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 576
    invoke-static {p2}, Lnet/hockeyapp/android/utils/Util;->isConnectedToNetwork(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    .line 581
    :cond_0
    sget-boolean p2, Lnet/hockeyapp/android/CrashManager;->submitting:Z

    if-nez p2, :cond_1

    const/4 p2, 0x1

    .line 582
    sput-boolean p2, Lnet/hockeyapp/android/CrashManager;->submitting:Z

    .line 584
    new-instance p2, Lnet/hockeyapp/android/CrashManager$5;

    invoke-direct {p2, p0, p1, p3}, Lnet/hockeyapp/android/CrashManager$5;-><init>(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Lnet/hockeyapp/android/objects/CrashMetaData;)V

    .line 590
    invoke-virtual {p2}, Lnet/hockeyapp/android/CrashManager$5;->start()V

    :cond_1
    return-void
.end method

.method private static showDialog(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Z)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 514
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 521
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onHandleAlertView()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 525
    :cond_2
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 526
    invoke-static {v0}, Lnet/hockeyapp/android/CrashManager;->getAlertTitle(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 527
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 528
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_crash_dialog_message:I

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 530
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_crash_dialog_negative_button:I

    new-instance v2, Lnet/hockeyapp/android/CrashManager$2;

    invoke-direct {v2, p1, p0, p2}, Lnet/hockeyapp/android/CrashManager$2;-><init>(Lnet/hockeyapp/android/CrashManagerListener;Ljava/lang/ref/WeakReference;Z)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 536
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_crash_dialog_neutral_button:I

    new-instance v2, Lnet/hockeyapp/android/CrashManager$3;

    invoke-direct {v2, p1, p0, p2}, Lnet/hockeyapp/android/CrashManager$3;-><init>(Lnet/hockeyapp/android/CrashManagerListener;Ljava/lang/ref/WeakReference;Z)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 542
    sget v0, Lnet/hockeyapp/android/R$string;->hockeyapp_crash_dialog_positive_button:I

    new-instance v2, Lnet/hockeyapp/android/CrashManager$4;

    invoke-direct {v2, p1, p0, p2}, Lnet/hockeyapp/android/CrashManager$4;-><init>(Lnet/hockeyapp/android/CrashManagerListener;Ljava/lang/ref/WeakReference;Z)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 549
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public static submitStackTraces(Ljava/lang/ref/WeakReference;Lnet/hockeyapp/android/CrashManagerListener;Lnet/hockeyapp/android/objects/CrashMetaData;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Lnet/hockeyapp/android/CrashManagerListener;",
            "Lnet/hockeyapp/android/objects/CrashMetaData;",
            ")V"
        }
    .end annotation

    .line 293
    invoke-static {}, Lnet/hockeyapp/android/CrashManager;->searchForStackTraces()[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 294
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v0, :cond_10

    .line 296
    array-length v3, v0

    if-lez v3, :cond_10

    .line 297
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Found "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " stacktrace(s)."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    move-object v3, v2

    const/4 v2, 0x0

    .line 299
    :goto_0
    array-length v4, v0

    if-ge v2, v4, :cond_10

    const/4 v4, 0x0

    .line 303
    :try_start_0
    aget-object v5, v0, v2

    .line 304
    invoke-static {p0, v5}, Lnet/hockeyapp/android/CrashManager;->contentsOfFile(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 305
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_7

    .line 308
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Transmitting crash data: \n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    const-string v7, ".stacktrace"

    const-string v8, ".user"

    .line 311
    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7}, Lnet/hockeyapp/android/CrashManager;->contentsOfFile(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, ".stacktrace"

    const-string v9, ".contact"

    .line 312
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v8}, Lnet/hockeyapp/android/CrashManager;->contentsOfFile(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz p2, :cond_1

    .line 315
    invoke-virtual {p2}, Lnet/hockeyapp/android/objects/CrashMetaData;->getUserID()Ljava/lang/String;

    move-result-object v9

    .line 316
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_0

    move-object v7, v9

    .line 319
    :cond_0
    invoke-virtual {p2}, Lnet/hockeyapp/android/objects/CrashMetaData;->getUserEmail()Ljava/lang/String;

    move-result-object v9

    .line 320
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_1

    move-object v8, v9

    :cond_1
    const-string v9, ".stacktrace"

    const-string v10, ".description"

    .line 326
    invoke-virtual {v5, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5}, Lnet/hockeyapp/android/CrashManager;->contentsOfFile(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz p2, :cond_2

    .line 327
    invoke-virtual {p2}, Lnet/hockeyapp/android/objects/CrashMetaData;->getUserDescription()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_2
    const-string v9, ""

    .line 328
    :goto_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    const/4 v11, 0x1

    if-nez v10, :cond_4

    .line 329
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "%s\n\nLog:\n%s"

    const/4 v12, 0x2

    .line 330
    new-array v12, v12, [Ljava/lang/Object;

    aput-object v9, v12, v1

    aput-object v5, v12, v11

    invoke-static {v10, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    :cond_3
    const-string v9, "Log:\n%s"

    .line 332
    new-array v10, v11, [Ljava/lang/Object;

    aput-object v5, v10, v1

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 336
    :cond_4
    :goto_2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const-string v10, "raw"

    .line 338
    invoke-interface {v5, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "userID"

    .line 339
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "contact"

    .line 340
    invoke-interface {v5, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "description"

    .line 341
    invoke-interface {v5, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "sdk"

    const-string v7, "HockeySDK"

    .line 342
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "sdk_version"

    const-string v7, "4.1.0-beta.1"

    .line 343
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    new-instance v6, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    invoke-static {}, Lnet/hockeyapp/android/CrashManager;->getURLString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "POST"

    .line 346
    invoke-virtual {v6, v7}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setRequestMethod(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object v6

    .line 347
    invoke-virtual {v6, v5}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->writeFormFields(Ljava/util/Map;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    move-result-object v5

    .line 348
    invoke-virtual {v5}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->build()Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 350
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    const/16 v6, 0xca

    if-eq v5, v6, :cond_6

    const/16 v6, 0xc9

    if-ne v5, v6, :cond_5

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    .line 352
    :cond_6
    :goto_3
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_7
    if-eqz v4, :cond_8

    .line 359
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 361
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_9

    const-string v4, "Transmission succeeded"

    .line 362
    invoke-static {v4}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 363
    aget-object v4, v0, v2

    invoke-static {p0, v4}, Lnet/hockeyapp/android/CrashManager;->deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    if-eqz p1, :cond_c

    .line 366
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesSent()V

    .line 367
    aget-object v4, v0, v2

    :goto_4
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->getMaxRetryAttempts()I

    move-result v5

    invoke-static {p0, v4, v5}, Lnet/hockeyapp/android/CrashManager;->deleteRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V

    goto :goto_6

    :cond_9
    const-string v4, "Transmission failed, will retry on next register() call"

    .line 370
    invoke-static {v4}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    .line 372
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesNotSent()V

    .line 373
    aget-object v4, v0, v2

    :goto_5
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->getMaxRetryAttempts()I

    move-result v5

    invoke-static {p0, v4, v5}, Lnet/hockeyapp/android/CrashManager;->updateRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V

    goto :goto_6

    :catchall_0
    move-exception p2

    goto :goto_7

    :catch_0
    move-exception v5

    .line 356
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_a

    .line 359
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 361
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_b

    const-string v4, "Transmission succeeded"

    .line 362
    invoke-static {v4}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 363
    aget-object v4, v0, v2

    invoke-static {p0, v4}, Lnet/hockeyapp/android/CrashManager;->deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    if-eqz p1, :cond_c

    .line 366
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesSent()V

    .line 367
    aget-object v4, v0, v2

    goto :goto_4

    :cond_b
    const-string v4, "Transmission failed, will retry on next register() call"

    .line 370
    invoke-static {v4}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    if-eqz p1, :cond_c

    .line 372
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesNotSent()V

    .line 373
    aget-object v4, v0, v2

    goto :goto_5

    :cond_c
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :goto_7
    if-eqz v4, :cond_d

    .line 359
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 361
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "Transmission succeeded"

    .line 362
    invoke-static {v1}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    .line 363
    aget-object v1, v0, v2

    invoke-static {p0, v1}, Lnet/hockeyapp/android/CrashManager;->deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    if-eqz p1, :cond_f

    .line 366
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesSent()V

    .line 367
    aget-object v0, v0, v2

    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->getMaxRetryAttempts()I

    move-result p1

    invoke-static {p0, v0, p1}, Lnet/hockeyapp/android/CrashManager;->deleteRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V

    goto :goto_8

    :cond_e
    const-string v1, "Transmission failed, will retry on next register() call"

    .line 370
    invoke-static {v1}, Lnet/hockeyapp/android/utils/HockeyLog;->debug(Ljava/lang/String;)V

    if-eqz p1, :cond_f

    .line 372
    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->onCrashesNotSent()V

    .line 373
    aget-object v0, v0, v2

    invoke-virtual {p1}, Lnet/hockeyapp/android/CrashManagerListener;->getMaxRetryAttempts()I

    move-result p1

    invoke-static {p0, v0, p1}, Lnet/hockeyapp/android/CrashManager;->updateRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V

    :cond_f
    :goto_8
    throw p2

    :cond_10
    return-void
.end method

.method private static updateRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_2

    .line 633
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    const-string v1, "HockeySDK"

    const/4 v2, 0x0

    .line 635
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 636
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 638
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RETRY_COUNT: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-lt v0, p2, :cond_1

    .line 640
    invoke-static {p0, p1}, Lnet/hockeyapp/android/CrashManager;->deleteStackTrace(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 641
    invoke-static {p0, p1, p2}, Lnet/hockeyapp/android/CrashManager;->deleteRetryCounter(Ljava/lang/ref/WeakReference;Ljava/lang/String;I)V

    goto :goto_0

    .line 643
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RETRY_COUNT: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 644
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_2
    :goto_0
    return-void
.end method
