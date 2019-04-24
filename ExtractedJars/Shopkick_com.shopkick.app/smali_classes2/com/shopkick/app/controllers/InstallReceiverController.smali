.class public Lcom/shopkick/app/controllers/InstallReceiverController;
.super Landroid/content/BroadcastReceiver;
.source "InstallReceiverController.java"


# static fields
.field public static final PROMO_CODE:Ljava/lang/String; = "promo_code"

.field public static final SK_WEB_REGISTRATION_KEY:Ljava/lang/String; = "sk_wr_id"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private saveReferrer(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "referrer"

    .line 32
    invoke-virtual {p2, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p2, :cond_2

    :try_start_1
    const-string v2, "UTF-8"

    .line 34
    invoke-static {p2, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "&"

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 36
    array-length v3, v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object v4, v0

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    :try_start_2
    aget-object v5, v2, v0

    const-string v6, "="

    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 38
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_0

    aget-object v6, v5, v1

    const-string/jumbo v7, "sk_wr_id"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x1

    .line 39
    aget-object v4, v5, v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-object v0, v4

    goto :goto_1

    :cond_1
    move-object v0, v4

    goto :goto_1

    :catch_1
    move-object p2, v0

    :catch_2
    :cond_2
    :goto_1
    const-string v2, "com.shopkick.app.prefs"

    .line 46
    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 48
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string/jumbo v1, "shopkick_web_registration_id"

    .line 49
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    if-eqz p2, :cond_3

    const-string v0, "install_referrer"

    .line 51
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 53
    :cond_3
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/controllers/InstallReceiverController;->saveReferrer(Landroid/content/Context;Landroid/content/Intent;)V

    .line 24
    new-instance v0, Lio/branch/referral/InstallListener;

    invoke-direct {v0}, Lio/branch/referral/InstallListener;-><init>()V

    .line 25
    invoke-virtual {v0, p1, p2}, Lio/branch/referral/InstallListener;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
