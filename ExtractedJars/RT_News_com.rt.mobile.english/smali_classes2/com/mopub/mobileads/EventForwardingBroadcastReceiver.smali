.class public Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "EventForwardingBroadcastReceiver.java"


# static fields
.field public static final ACTION_INTERSTITIAL_CLICK:Ljava/lang/String; = "com.mopub.action.interstitial.click"

.field public static final ACTION_INTERSTITIAL_DISMISS:Ljava/lang/String; = "com.mopub.action.interstitial.dismiss"

.field public static final ACTION_INTERSTITIAL_FAIL:Ljava/lang/String; = "com.mopub.action.interstitial.fail"

.field public static final ACTION_INTERSTITIAL_SHOW:Ljava/lang/String; = "com.mopub.action.interstitial.show"

.field private static sIntentFilter:Landroid/content/IntentFilter;


# instance fields
.field private final mBroadcastIdentifier:J

.field private mContext:Landroid/content/Context;

.field private final mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;J)V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    .line 28
    iput-wide p2, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mBroadcastIdentifier:J

    .line 29
    invoke-static {}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->getHtmlInterstitialIntentFilter()Landroid/content/IntentFilter;

    move-result-object p1

    sput-object p1, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    return-void
.end method

.method static broadcastAction(Landroid/content/Context;JLjava/lang/String;)V
    .locals 1

    .line 33
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p3, "broadcastIdentifier"

    .line 34
    invoke-virtual {v0, p3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    return-void
.end method

.method public static getHtmlInterstitialIntentFilter()Landroid/content/IntentFilter;
    .locals 2

    .line 39
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    .line 41
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "com.mopub.action.interstitial.fail"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 42
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "com.mopub.action.interstitial.show"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "com.mopub.action.interstitial.dismiss"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 44
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    const-string v1, "com.mopub.action.interstitial.click"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 46
    :cond_0
    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 51
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, "broadcastIdentifier"

    const-wide/16 v0, -0x1

    .line 61
    invoke-virtual {p2, p1, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 62
    iget-wide v2, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mBroadcastIdentifier:J

    cmp-long p1, v2, v0

    if-eqz p1, :cond_1

    return-void

    .line 66
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.mopub.action.interstitial.fail"

    .line 67
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 68
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    sget-object p2, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_INVALID_STATE:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {p1, p2}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0

    :cond_2
    const-string p2, "com.mopub.action.interstitial.show"

    .line 69
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 70
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    invoke-interface {p1}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialShown()V

    goto :goto_0

    :cond_3
    const-string p2, "com.mopub.action.interstitial.dismiss"

    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 72
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    invoke-interface {p1}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialDismissed()V

    .line 73
    invoke-virtual {p0}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->unregister()V

    goto :goto_0

    :cond_4
    const-string p2, "com.mopub.action.interstitial.click"

    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 75
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mCustomEventInterstitialListener:Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;

    invoke-interface {p1}, Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;->onInterstitialClicked()V

    :cond_5
    :goto_0
    return-void
.end method

.method public register(Landroid/content/Context;)V
    .locals 1

    .line 81
    iput-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mContext:Landroid/content/Context;

    .line 82
    iget-object p1, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mContext:Landroid/content/Context;

    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    sget-object v0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->sIntentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p1, p0, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public unregister()V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->mContext:Landroid/content/Context;

    :cond_0
    return-void
.end method
