.class public Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "AppboyBroadcastReceiver.java"


# static fields
.field private static final SHOPKICK_BADGE_NUMBER:Ljava/lang/String; = "shopkick_badge_number"

.field private static final SHOPKICK_SCHEME:Ljava/lang/String; = "shopkick"

.field public static final SOURCE_KEY:Ljava/lang/String; = "source"

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "%s.%s"

    const/4 v1, 0x2

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Appboy v2.5.1 ."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;

    .line 27
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 25
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private getPushExtrasBundle(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 3

    const-string v0, "extra"

    .line 89
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    const-string v1, "cid"

    const-string v2, "cid"

    .line 93
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo p1, "source"

    const-string v1, "Appboy"

    .line 94
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".intent.APPBOY_PUSH_RECEIVED"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".intent.APPBOY_NOTIFICATION_OPENED"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 43
    invoke-direct {p0, p2}, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;->getPushExtrasBundle(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/push/AppboyNotificationUtils;->isUninstallTrackingPush(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p2, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {p2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string p2, "received appboy uninstall tracking push"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 46
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;->getPushExtrasBundle(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p2

    const-string/jumbo v0, "shopkick_badge_number"

    .line 47
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 48
    new-instance v0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;-><init>(Landroid/content/Context;)V

    .line 50
    invoke-virtual {v0}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->getBadgeProvider()Lcom/shopkick/app/util/badge/IBadgeProvider;

    move-result-object p1

    .line 51
    invoke-interface {p1}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string/jumbo v0, "shopkick_badge_number"

    .line 52
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 53
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/shopkick/app/util/badge/IBadgeProvider;->setBadge(I)V

    goto/16 :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    .line 58
    invoke-direct {p0, p2}, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;->getPushExtrasBundle(Landroid/content/Intent;)Landroid/os/Bundle;

    .line 59
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x24000000

    .line 60
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const v2, 0x10008000

    .line 61
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string/jumbo v2, "uri"

    .line 63
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-static {v2}, Lcom/appboy/support/StringUtils;->isNullOrBlank(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 65
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 66
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "shopkick"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 67
    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v4, "sk"

    .line 68
    invoke-virtual {v2, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    .line 69
    invoke-virtual {v3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    .line 70
    invoke-virtual {v3}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v4

    .line 71
    invoke-virtual {v3}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 72
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 75
    :cond_2
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;-><init>()V

    .line 76
    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->skUrl:Ljava/lang/String;

    const-string v2, "a"

    .line 77
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v3, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->message:Ljava/lang/String;

    const-string p2, "fromPns"

    .line 79
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p2, "pnsPushMessage"

    .line 80
    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    :cond_3
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 84
    :cond_4
    sget-object p1, Lcom/shopkick/app/gcm/AppboyBroadcastReceiver;->TAG:Ljava/lang/String;

    const-string p2, "Ignoring intent with unsupported action %s"

    new-array v0, v1, [Ljava/lang/Object;

    aput-object v2, v0, v3

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_0
    return-void
.end method
