.class public Lcom/ibotta/android/receiver/NetworkChangeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "NetworkChangeReceiver.java"


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field protected hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "NetworkChangeReceiver.java"

    const-class v1, Lcom/ibotta/android/receiver/NetworkChangeReceiver;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "trackNetworkLost"

    const-string v3, "com.ibotta.android.receiver.NetworkChangeReceiver"

    const-string v4, "java.lang.Class"

    const-string v5, "activityClass"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x7a

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private getActivityManager(Landroid/content/Context;)Landroid/app/ActivityManager;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 60
    const-class v0, Landroid/app/ActivityManager;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    goto :goto_0

    :cond_0
    const-string v0, "activity"

    .line 62
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    :goto_0
    return-object p1
.end method

.method private getClassFromQualifiedName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 112
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Class not found for %1$s"

    const/4 v1, 0x1

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getTopRunningActivityClass(Landroid/app/ActivityManager;)Ljava/lang/Class;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 72
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 73
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getTopRunningActivityClassNew(Landroid/app/ActivityManager;)Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    .line 75
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getTopRunningActivityClassDeprecated(Landroid/app/ActivityManager;)Ljava/lang/Class;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getTopRunningActivityClassDeprecated(Landroid/app/ActivityManager;)Ljava/lang/Class;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x1

    .line 97
    invoke-virtual {p1, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object p1

    .line 99
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 103
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 105
    iget-object v0, p1, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    if-eqz v0, :cond_1

    iget-object p1, p1, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getClassFromQualifiedName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private getTopRunningActivityClassNew(Landroid/app/ActivityManager;)Ljava/lang/Class;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 83
    invoke-virtual {p1}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    move-result-object p1

    .line 85
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 89
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager$AppTask;

    invoke-virtual {p1}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    move-result-object p1

    .line 91
    iget-object v0, p1, Landroid/app/ActivityManager$RecentTaskInfo;->topActivity:Landroid/content/ComponentName;

    if-eqz v0, :cond_1

    iget-object p1, p1, Landroid/app/ActivityManager$RecentTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getClassFromQualifiedName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private trackNetworkLost(Ljava/lang/Class;)V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->CONNECTION_LOST:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    :try_start_0
    const-string v1, "activityClass: %1$s"

    const/4 v2, 0x1

    .line 122
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw p1
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p2, "onReceive"

    const/4 v0, 0x0

    .line 34
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p2

    invoke-interface {p2, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/NetworkChangeReceiver;)V

    .line 39
    iget-object p2, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {p2}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->startIfWorkToDo()V

    if-eqz p1, :cond_1

    .line 41
    iget-object p2, p0, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {p2}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result p2

    if-nez p2, :cond_1

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getActivityManager(Landroid/content/Context;)Landroid/app/ActivityManager;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->getTopRunningActivityClass(Landroid/app/ActivityManager;)Ljava/lang/Class;

    move-result-object p2

    :cond_0
    if-eqz p2, :cond_1

    .line 50
    invoke-direct {p0, p2}, Lcom/ibotta/android/receiver/NetworkChangeReceiver;->trackNetworkLost(Ljava/lang/Class;)V

    :cond_1
    return-void
.end method
