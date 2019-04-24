.class Lcom/shopkick/app/util/badge/SonyBadgeProvider;
.super Ljava/lang/Object;
.source "SonyBadgeProvider.java"

# interfaces
.implements Lcom/shopkick/app/util/badge/IBadgeProvider;


# static fields
.field private static final INTENT_ACTION:Ljava/lang/String; = "com.sonyericsson.home.action.UPDATE_BADGE"

.field private static final INTENT_EXTRA_ACTIVITY_NAME:Ljava/lang/String; = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"

.field private static final INTENT_EXTRA_MESSAGE:Ljava/lang/String; = "com.sonyericsson.home.intent.extra.badge.MESSAGE"

.field private static final INTENT_EXTRA_PACKAGE_NAME:Ljava/lang/String; = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"

.field private static final INTENT_EXTRA_SHOW_MESSAGE:Ljava/lang/String; = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"

.field private static final PROVIDER_COLUMNS_ACTIVITY_NAME:Ljava/lang/String; = "activity_name"

.field private static final PROVIDER_COLUMNS_BADGE_COUNT:Ljava/lang/String; = "badge_count"

.field private static final PROVIDER_COLUMNS_PACKAGE_NAME:Ljava/lang/String; = "package_name"

.field private static final PROVIDER_CONTENT_URI:Ljava/lang/String; = "content://com.sonymobile.home.resourceprovider/badge"

.field private static final SONY_HOME_PROVIDER_NAME:Ljava/lang/String; = "com.sonymobile.home.resourceprovider"

.field private static final SONY_LAUNCHER_PACKAGE_NAME:Ljava/lang/String; = "com.sonyericsson.home"


# instance fields
.field private final BADGE_CONTENT_URI:Landroid/net/Uri;

.field private final appContext:Landroid/content/Context;

.field private final componentName:Landroid/content/ComponentName;

.field private final homePackageName:Ljava/lang/String;

.field private mQueryHandler:Landroid/content/AsyncQueryHandler;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "content://com.sonymobile.home.resourceprovider/badge"

    .line 25
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->BADGE_CONTENT_URI:Landroid/net/Uri;

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->appContext:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->componentName:Landroid/content/ComponentName;

    .line 35
    iput-object p3, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->homePackageName:Ljava/lang/String;

    return-void
.end method

.method private static executeBadgeByBroadcast(Landroid/content/Context;Landroid/content/ComponentName;I)V
    .locals 3

    .line 60
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.sonyericsson.home.action.UPDATE_BADGE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME"

    .line 61
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME"

    .line 62
    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "com.sonyericsson.home.intent.extra.badge.MESSAGE"

    .line 63
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE"

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 64
    :goto_0
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 65
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method private executeBadgeByContentProvider(Landroid/content/Context;Landroid/content/ComponentName;I)V
    .locals 1

    if-gez p3, :cond_0

    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->mQueryHandler:Landroid/content/AsyncQueryHandler;

    if-nez v0, :cond_1

    .line 82
    new-instance v0, Lcom/shopkick/app/util/badge/SonyBadgeProvider$1;

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/util/badge/SonyBadgeProvider$1;-><init>(Lcom/shopkick/app/util/badge/SonyBadgeProvider;Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->mQueryHandler:Landroid/content/AsyncQueryHandler;

    .line 86
    :cond_1
    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p3, p1, p2}, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->insertBadgeAsync(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private insertBadgeAsync(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 107
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "badge_count"

    .line 108
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p1, "package_name"

    .line 109
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "activity_name"

    .line 110
    invoke-virtual {v0, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->mQueryHandler:Landroid/content/AsyncQueryHandler;

    iget-object p2, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->BADGE_CONTENT_URI:Landroid/net/Uri;

    const/4 p3, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, p3, v1, p2, v0}, Landroid/content/AsyncQueryHandler;->startInsert(ILjava/lang/Object;Landroid/net/Uri;Landroid/content/ContentValues;)V

    return-void
.end method

.method private static sonyBadgeContentProviderExists(Landroid/content/Context;)Z
    .locals 2

    .line 124
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "com.sonymobile.home.resourceprovider"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method


# virtual methods
.method public setBadge(I)V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->sonyBadgeContentProviderExists(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->appContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->executeBadgeByContentProvider(Landroid/content/Context;Landroid/content/ComponentName;I)V

    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->appContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->executeBadgeByBroadcast(Landroid/content/Context;Landroid/content/ComponentName;I)V

    :goto_0
    return-void
.end method

.method public supportBadgeOnDevice()Z
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SonyBadgeProvider;->homePackageName:Ljava/lang/String;

    const-string v1, "com.sonyericsson.home"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
