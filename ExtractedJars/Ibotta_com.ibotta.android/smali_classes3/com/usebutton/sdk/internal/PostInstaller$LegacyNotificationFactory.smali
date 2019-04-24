.class Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;
.super Ljava/lang/Object;
.source "PostInstaller.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/PostInstaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LegacyNotificationFactory"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final mBuilder:Landroid/app/Notification$Builder;

.field private final mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

.field private final mContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    .line 183
    iput-object p2, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    .line 184
    iput-object p3, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    return-void
.end method

.method private createNotificationChannel()V
    .locals 4
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 235
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/usebutton/sdk/internal/PostInstaller;->access$000()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 236
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    sget v2, Lcom/usebutton/sdk/R$string;->btn_notification_channel_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 237
    new-instance v2, Landroid/app/NotificationChannel;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 240
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    const-string v1, "notification"

    .line 241
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 242
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 243
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    return-void
.end method

.method private varargs getLocalizedString(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 2

    .line 260
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getCopy()Lcom/usebutton/sdk/internal/models/Configuration$Copy;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    .line 261
    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/usebutton/sdk/internal/models/Configuration$Copy;->getFormattedString(Landroid/content/Context;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private setSoundLightVibration(Landroid/content/Context;Landroid/app/Notification$Builder;)V
    .locals 2

    .line 250
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.VIBRATE"

    .line 251
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x5

    .line 255
    :goto_0
    invoke-virtual {p2, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    return-void
.end method


# virtual methods
.method getAppInfo(Lcom/usebutton/sdk/internal/models/MetaInfo;)Lcom/usebutton/sdk/internal/functional/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/models/MetaInfo;",
            ")",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/CharSequence;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 265
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 268
    :try_start_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 270
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 271
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v0

    .line 272
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 273
    new-instance v0, Lcom/usebutton/sdk/internal/functional/Pair;

    invoke-direct {v0, v1, p1}, Lcom/usebutton/sdk/internal/functional/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    const-string v0, "AppInstaller"

    const-string v1, "Ran out of memory while decoding app icon"

    .line 277
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    const-string v0, "AppInstaller"

    const-string v1, "Could not find application"

    .line 275
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getNotification(Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;)Landroid/app/Notification;
    .locals 6

    const-string v0, "target"

    .line 190
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getTarget()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "promotion_source_token"

    .line 191
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 193
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->getAppInfo(Lcom/usebutton/sdk/internal/models/MetaInfo;)Lcom/usebutton/sdk/internal/functional/Pair;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    const-string v1, "GO_TO_APP_STRING"

    sget v2, Lcom/usebutton/sdk/R$string;->btn_go_to_app:I

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    .line 200
    invoke-direct {p0, v1, v2, v4}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->getLocalizedString(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 201
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/functional/Pair;->second()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 202
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_ic_app_installed_action:I

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 203
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    const-string v1, "WAS_INSTALLED_STRING"

    sget v2, Lcom/usebutton/sdk/R$string;->btn_was_installed:I

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    .line 205
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/functional/Pair;->first()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v5, v3

    .line 204
    invoke-direct {p0, v1, v2, v5}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->getLocalizedString(Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p1

    .line 203
    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 206
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 207
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 208
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->setSoundLightVibration(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 209
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->setPriorityHigh(Landroid/app/Notification$Builder;)V

    .line 210
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->setShowWhen(Landroid/app/Notification$Builder;)V

    .line 212
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_1

    .line 213
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->createNotificationChannel()V

    .line 216
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    .line 217
    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->openIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x8000000

    .line 216
    invoke-static {p1, v3, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    .line 219
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mContext:Landroid/content/Context;

    .line 220
    invoke-static {v0, p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->cancelIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    .line 219
    invoke-static {v0, v3, p2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    .line 222
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 223
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 225
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x10

    if-lt p1, p2, :cond_2

    .line 226
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {p1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    return-object p1

    .line 229
    :cond_2
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->mBuilder:Landroid/app/Notification$Builder;

    invoke-virtual {p1}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method
