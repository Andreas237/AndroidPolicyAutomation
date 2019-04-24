.class public Lcom/newrelic/agent/android/InstantApps;
.super Ljava/lang/Object;
.source "InstantApps.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;
    }
.end annotation


# static fields
.field private static isInstantApp:Ljava/lang/Boolean;

.field private static lastApplicationContext:Landroid/content/Context;

.field private static packageManagerWrapper:Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static isAtLeastO()Z
    .locals 2

    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isInstantApp(Landroid/content/Context;)Z
    .locals 2

    if-eqz p0, :cond_6

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 24
    sget-object v0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/newrelic/agent/android/InstantApps;->lastApplicationContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    sget-object p0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x0

    .line 27
    sput-object v0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    .line 30
    invoke-static {}, Lcom/newrelic/agent/android/InstantApps;->isAtLeastO()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 31
    sget-object v0, Lcom/newrelic/agent/android/InstantApps;->packageManagerWrapper:Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/newrelic/agent/android/InstantApps;->lastApplicationContext:Landroid/content/Context;

    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 33
    :cond_1
    new-instance v0, Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;-><init>(Landroid/content/pm/PackageManager;)V

    sput-object v0, Lcom/newrelic/agent/android/InstantApps;->packageManagerWrapper:Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;

    .line 35
    :cond_2
    sget-object v0, Lcom/newrelic/agent/android/InstantApps;->packageManagerWrapper:Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/InstantApps$PackageManagerWrapper;->isInstantApp()Ljava/lang/Boolean;

    move-result-object v0

    .line 37
    :cond_3
    sput-object p0, Lcom/newrelic/agent/android/InstantApps;->lastApplicationContext:Landroid/content/Context;

    if-eqz v0, :cond_4

    .line 39
    sput-object v0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    goto :goto_0

    .line 42
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v0, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    const/4 p0, 0x1

    .line 43
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    .line 45
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    .line 48
    :goto_0
    sget-object p0, Lcom/newrelic/agent/android/InstantApps;->isInstantApp:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    .line 22
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Application context is null!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 18
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context must be non-null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
