.class public Lio/sentry/android/AndroidSentryClientFactory;
.super Lio/sentry/DefaultSentryClientFactory;
.source "AndroidSentryClientFactory.java"


# static fields
.field private static final DEFAULT_BUFFER_DIR:Ljava/lang/String; = "sentry-buffered-events"

.field public static final TAG:Ljava/lang/String; = "io.sentry.android.AndroidSentryClientFactory"


# instance fields
.field private ctx:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Lio/sentry/DefaultSentryClientFactory;-><init>()V

    .line 46
    sget-object v0, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    const-string v1, "Construction of Android Sentry."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    return-void
.end method

.method private checkPermission(Ljava/lang/String;)Z
    .locals 1

    .line 129
    iget-object v0, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

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
.method public createSentryClient(Lio/sentry/dsn/Dsn;)Lio/sentry/SentryClient;
    .locals 3

    const-string v0, "android.permission.INTERNET"

    .line 53
    invoke-direct {p0, v0}, Lio/sentry/android/AndroidSentryClientFactory;->checkPermission(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    sget-object v0, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    const-string v1, "android.permission.INTERNET is required to connect to the Sentry server, please add it to your AndroidManifest.xml"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    :cond_0
    sget-object v0, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sentry init with ctx=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' and dsn=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    invoke-virtual {p1}, Lio/sentry/dsn/Dsn;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "noop"

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 62
    sget-object v0, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    const-string v1, "*** Couldn\'t find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/modules/android/ ***"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v1, "http"

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "async"

    .line 65
    invoke-static {v1, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v1, "false"

    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 67
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Sentry Android cannot use synchronous connections, remove \'async=false\' from your options."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Only \'http\' or \'https\' connections are supported in Sentry Android, but received: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 75
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->createSentryClient(Lio/sentry/dsn/Dsn;)Lio/sentry/SentryClient;

    move-result-object p1

    .line 76
    new-instance v0, Lio/sentry/android/event/helper/AndroidEventBuilderHelper;

    iget-object v1, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-direct {v0, v1}, Lio/sentry/android/event/helper/AndroidEventBuilderHelper;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/sentry/SentryClient;->addBuilderHelper(Lio/sentry/event/helper/EventBuilderHelper;)V

    return-object p1
.end method

.method protected getBuffer(Lio/sentry/dsn/Dsn;)Lio/sentry/buffer/Buffer;
    .locals 4

    const-string v0, "buffer.dir"

    .line 106
    invoke-static {v0, p1}, Lio/sentry/config/Lookup;->lookup(Ljava/lang/String;Lio/sentry/dsn/Dsn;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 108
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 110
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "sentry-buffered-events"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :goto_0
    sget-object v0, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using buffer dir: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    new-instance v0, Lio/sentry/buffer/DiskBuffer;

    invoke-virtual {p0, p1}, Lio/sentry/android/AndroidSentryClientFactory;->getBufferSize(Lio/sentry/dsn/Dsn;)I

    move-result p1

    invoke-direct {v0, v1, p1}, Lio/sentry/buffer/DiskBuffer;-><init>(Ljava/io/File;I)V

    return-object v0
.end method

.method protected getContextManager(Lio/sentry/dsn/Dsn;)Lio/sentry/context/ContextManager;
    .locals 0

    .line 119
    new-instance p1, Lio/sentry/context/SingletonContextManager;

    invoke-direct {p1}, Lio/sentry/context/SingletonContextManager;-><init>()V

    return-object p1
.end method

.method protected getInAppFrames(Lio/sentry/dsn/Dsn;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/sentry/dsn/Dsn;",
            ")",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 83
    invoke-super {p0, p1}, Lio/sentry/DefaultSentryClientFactory;->getInAppFrames(Lio/sentry/dsn/Dsn;)Ljava/util/Collection;

    move-result-object p1

    .line 85
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 88
    :try_start_0
    iget-object v1, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/android/AndroidSentryClientFactory;->ctx:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 90
    sget-object v2, Lio/sentry/android/AndroidSentryClientFactory;->TAG:Ljava/lang/String;

    const-string v3, "Error getting package information."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    if-eqz v0, :cond_0

    .line 93
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Lio/sentry/util/Util;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 94
    new-instance p1, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_0
    return-object p1
.end method
