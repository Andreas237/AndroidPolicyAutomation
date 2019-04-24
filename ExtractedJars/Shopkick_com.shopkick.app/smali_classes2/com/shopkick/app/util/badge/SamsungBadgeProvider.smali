.class Lcom/shopkick/app/util/badge/SamsungBadgeProvider;
.super Ljava/lang/Object;
.source "SamsungBadgeProvider.java"

# interfaces
.implements Lcom/shopkick/app/util/badge/IBadgeProvider;


# static fields
.field private static final BADGE_COUNT:Ljava/lang/String; = "badgecount"

.field private static final CLASS:Ljava/lang/String; = "class"

.field private static final PACKAGE:Ljava/lang/String; = "package"

.field private static final SAMSUNG_BADGE_URI:Ljava/lang/String; = "content://com.sec.badge/apps"

.field private static final SK_CLASS:Ljava/lang/String; = "com.shopkick.app.activities.SplashActivity"


# instance fields
.field private appContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public setBadge(I)V
    .locals 6

    const-string v0, "content://com.sec.badge/apps"

    .line 51
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 52
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "badgecount"

    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "package"

    .line 54
    iget-object v3, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "class"

    const-string v3, "com.shopkick.app.activities.SplashActivity"

    .line 55
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "package=?"

    const/4 v3, 0x1

    .line 57
    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 58
    iget-object v4, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    .line 59
    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    .line 61
    invoke-virtual {v1}, Landroid/content/ContentValues;->clear()V

    const-string v2, "package"

    .line 62
    iget-object v3, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "class"

    const-string v3, "com.shopkick.app.activities.SplashActivity"

    .line 63
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "badgecount"

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 65
    invoke-virtual {v4, v0, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    :cond_0
    return-void
.end method

.method public supportBadgeOnDevice()Z
    .locals 8

    const-string v0, "content://com.sec.badge/apps"

    .line 28
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.sec.android.provider.badge.permission.READ"

    const-string v3, "com.shopkick.app"

    .line 30
    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    const-string v3, "com.sec.android.provider.badge.permission.WRITE"

    const-string v4, "com.shopkick.app"

    .line 32
    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v7, 0x0

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-nez v0, :cond_0

    return v7

    .line 40
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v7
.end method
