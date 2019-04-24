.class public Lcom/ibotta/android/service/debug/DebugOverlayService;
.super Landroid/app/Service;
.source "DebugOverlayService.java"


# static fields
.field private static final CHANNEL_ID:Ljava/lang/String; = "IbottaDebug"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final localBroadcastReceiver:Landroid/content/BroadcastReceiver;

.field private tvDebug:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 38
    new-instance v0, Lcom/ibotta/android/service/debug/DebugOverlayService$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/service/debug/DebugOverlayService$1;-><init>(Lcom/ibotta/android/service/debug/DebugOverlayService;)V

    iput-object v0, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/service/debug/DebugOverlayService;Landroid/content/Intent;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/debug/DebugOverlayService;->onLocalBroadcastReceived(Landroid/content/Intent;)V

    return-void
.end method

.method private onLocalBroadcastReceived(Landroid/content/Intent;)V
    .locals 4

    .line 114
    invoke-static {p1}, Lcom/ibotta/android/LocalBroadcast;->isDebugLoading(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "debug_loading_jobs"

    .line 119
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 122
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 123
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 128
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-gtz p1, :cond_2

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    const-string v0, "Done."

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method public static start(Lcom/ibotta/android/profile/BuildProfile;Landroid/content/Context;)V
    .locals 2

    .line 49
    invoke-interface {p0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugLoadingAllowed()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 53
    :cond_0
    new-instance p0, Landroid/content/Intent;

    const-class v0, Lcom/ibotta/android/service/debug/DebugOverlayService;

    invoke-direct {p0, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 56
    invoke-virtual {p1, p0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p1, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method private startForegroundServiceNotif()V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 137
    new-instance v0, Landroid/app/NotificationChannel;

    const-string v1, "IbottaDebug"

    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v1, "notification"

    .line 142
    invoke-virtual {p0, v1}, Lcom/ibotta/android/service/debug/DebugOverlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 144
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Builder;

    const-string v1, "IbottaDebug"

    invoke-direct {v0, p0, v1}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const/4 v1, 0x1

    .line 146
    invoke-virtual {p0, v1, v0}, Lcom/ibotta/android/service/debug/DebugOverlayService;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 9

    .line 70
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "onCreate"

    const/4 v1, 0x0

    .line 71
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/debug/DebugOverlayService;)V

    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/service/debug/DebugOverlayService;->startForegroundServiceNotif()V

    :cond_0
    const-string v0, "window"

    .line 79
    invoke-virtual {p0, v0}, Lcom/ibotta/android/service/debug/DebugOverlayService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 81
    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/service/debug/DebugOverlayService;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    .line 82
    iget-object v3, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    const-string v4, "Hello!"

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v3, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    const/16 v4, 0xff

    invoke-static {v4, v4, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 84
    iget-object v3, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 85
    iget-object v3, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v5, 0x7f0600f2

    invoke-interface {v4, v5}, Lcom/ibotta/android/util/AppHelper;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 87
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v2, :cond_1

    const/16 v2, 0x7f6

    const/16 v6, 0x7f6

    goto :goto_0

    :cond_1
    const/16 v2, 0x7d6

    const/16 v6, 0x7d6

    .line 90
    :goto_0
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    const/4 v4, -0x2

    const/4 v5, -0x2

    const/16 v7, 0x18

    const/4 v8, -0x3

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const/16 v3, 0x33

    .line 97
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 98
    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 99
    iput v1, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->tvDebug:Landroid/widget/TextView;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.ibotta.android.LOCAL"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 109
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/service/debug/DebugOverlayService;->localBroadcastReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 110
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method
