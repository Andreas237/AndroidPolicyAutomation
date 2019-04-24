.class public Lcom/shopkick/app/util/badge/BadgeProviderFactory;
.super Ljava/lang/Object;
.source "BadgeProviderFactory.java"


# instance fields
.field private appContext:Landroid/content/Context;

.field private badgeProviderList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/util/badge/IBadgeProvider;",
            ">;"
        }
    .end annotation
.end field

.field private envComponentName:Landroid/content/ComponentName;

.field private envHomePackage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->appContext:Landroid/content/Context;

    .line 33
    invoke-direct {p0}, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->detectEnvironmentParams()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    new-instance v1, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;

    invoke-direct {v1, p1}, Lcom/shopkick/app/util/badge/SamsungBadgeProvider;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    new-instance v1, Lcom/shopkick/app/util/badge/HTCBadgeProvider;

    iget-object v2, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envComponentName:Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envHomePackage:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v3}, Lcom/shopkick/app/util/badge/HTCBadgeProvider;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    new-instance v1, Lcom/shopkick/app/util/badge/LGBadgeProvider;

    iget-object v2, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envComponentName:Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envHomePackage:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v3}, Lcom/shopkick/app/util/badge/LGBadgeProvider;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    new-instance v1, Lcom/shopkick/app/util/badge/SonyBadgeProvider;

    iget-object v2, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envComponentName:Landroid/content/ComponentName;

    iget-object v3, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envHomePackage:Ljava/lang/String;

    invoke-direct {v1, p1, v2, v3}, Lcom/shopkick/app/util/badge/SonyBadgeProvider;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private detectEnvironmentParams()Z
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->appContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->appContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 71
    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envComponentName:Landroid/content/ComponentName;

    .line 73
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.MAIN"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.HOME"

    .line 74
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->appContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/high16 v3, 0x10000

    .line 76
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 78
    iget-object v2, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "resolver"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->envHomePackage:Ljava/lang/String;

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public getBadgeProvider()Lcom/shopkick/app/util/badge/IBadgeProvider;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/util/badge/BadgeProviderFactory;->badgeProviderList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lcom/shopkick/app/util/badge/DefaultBadgeProvider;

    invoke-direct {v0}, Lcom/shopkick/app/util/badge/DefaultBadgeProvider;-><init>()V

    return-object v0

    .line 57
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/util/badge/IBadgeProvider;

    .line 58
    invoke-interface {v1}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    .line 63
    :cond_2
    new-instance v0, Lcom/shopkick/app/util/badge/DefaultBadgeProvider;

    invoke-direct {v0}, Lcom/shopkick/app/util/badge/DefaultBadgeProvider;-><init>()V

    return-object v0
.end method
