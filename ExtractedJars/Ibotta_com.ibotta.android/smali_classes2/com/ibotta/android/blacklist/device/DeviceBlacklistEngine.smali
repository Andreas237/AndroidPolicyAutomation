.class public Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;
.super Ljava/lang/Object;
.source "DeviceBlacklistEngine.java"

# interfaces
.implements Lcom/ibotta/android/blacklist/BlacklistEngine;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private getConfig()Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getOcrDeviceBlacklist()Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    move-result-object v0

    if-nez v0, :cond_0

    .line 72
    sget-object v0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public isBlacklisted()Z
    .locals 9

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;->getConfig()Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;->getBlacklistRuleSets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;

    const-string v4, "Executing blacklist rules for: %1$s"

    .line 40
    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->getBlacklistRules()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;

    const-string v7, "Checking blacklist rule: %1$s"

    .line 44
    new-array v8, v2, [Ljava/lang/Object;

    aput-object v6, v8, v3

    invoke-static {v7, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-object v7, p0, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    invoke-virtual {v7, v6}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v7

    .line 48
    invoke-interface {v7}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->isClassified()Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, "Confirmed classification found with blacklist rule: %1$s"

    .line 49
    new-array v8, v2, [Ljava/lang/Object;

    aput-object v6, v8, v3

    invoke-static {v7, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRuleSet;->getBlacklistRules()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v5, v1, :cond_0

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    const-string v0, "This device is BLACKLISTED."

    .line 61
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    const-string v0, "This device is not blacklisted."

    .line 63
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return v2
.end method

.method public setConfig(Lcom/ibotta/android/state/app/config/blacklist/BlacklistConfig;)V
    .locals 0

    return-void
.end method
