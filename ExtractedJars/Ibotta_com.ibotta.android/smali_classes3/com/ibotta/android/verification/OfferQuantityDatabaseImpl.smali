.class public Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;
.super Ljava/lang/Object;
.source "OfferQuantityDatabaseImpl.java"

# interfaces
.implements Lcom/ibotta/android/verification/OfferQuantityDatabase;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final DEFAULT_VERIFICATION_VALIDITY:J

.field public static final PREFS_NAME:Ljava/lang/String; = "offer_quantity_database"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->DEFAULT_VERIFICATION_VALIDITY:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Landroid/content/SharedPreferences;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/json/IbottaJson;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-void
.end method

.method private deleteEntryIfTooOld(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 106
    instance-of v0, p3, Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 110
    :cond_0
    check-cast p3, Ljava/lang/String;

    .line 111
    invoke-direct {p0, p3}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->fromJson(Ljava/lang/String;)Lcom/ibotta/android/verification/OfferQuantity;

    move-result-object p3

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->getAgeLimit()J

    move-result-wide v2

    sub-long/2addr v0, v2

    if-eqz p3, :cond_1

    .line 114
    invoke-virtual {p3}, Lcom/ibotta/android/verification/OfferQuantity;->getSaveTime()J

    move-result-wide v2

    cmp-long p3, v2, v0

    if-gez p3, :cond_1

    .line 115
    invoke-interface {p1, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_1
    return-void
.end method

.method private fromJson(Ljava/lang/String;)Lcom/ibotta/android/verification/OfferQuantity;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 141
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    const-class v1, Lcom/ibotta/android/verification/OfferQuantity;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/OfferQuantity;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Failed to parse OfferQuantity from String: %1$s"

    const/4 v1, 0x1

    .line 143
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private getAgeLimit()J
    .locals 4

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getVerificationValidity()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    .line 152
    sget-wide v0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->DEFAULT_VERIFICATION_VALIDITY:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 155
    :cond_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private toJson(Lcom/ibotta/android/verification/OfferQuantity;)Ljava/lang/String;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 128
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v0, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Failed to serialize OfferQuantity to JSON String: %1$s"

    const/4 v1, 0x1

    .line 130
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private toKey(I)Ljava/lang/String;
    .locals 0

    .line 120
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public delete(I)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->toKey(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public deleteAll()V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public deleteOld()V
    .locals 4

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 93
    iget-object v1, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 95
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 96
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 97
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 99
    invoke-direct {p0, v1, v3, v2}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->deleteEntryIfTooOld(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public get(I)Lcom/ibotta/android/verification/OfferQuantity;
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->toKey(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-direct {p0, v0}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->fromJson(Ljava/lang/String;)Lcom/ibotta/android/verification/OfferQuantity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Lcom/ibotta/android/verification/OfferQuantity;

    invoke-direct {v0}, Lcom/ibotta/android/verification/OfferQuantity;-><init>()V

    .line 67
    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferQuantity;->setOfferId(I)V

    const/4 p1, 0x0

    .line 68
    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferQuantity;->setQuantity(I)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/verification/OfferQuantity;->setSaveTime(J)V

    :cond_0
    return-object v0
.end method

.method public getQuantity(I)I
    .locals 0

    .line 77
    invoke-virtual {p0, p1}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->get(I)Lcom/ibotta/android/verification/OfferQuantity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/verification/OfferQuantity;->getQuantity()I

    move-result p1

    return p1
.end method

.method public save(II)Lcom/ibotta/android/verification/OfferQuantity;
    .locals 3

    .line 41
    new-instance v0, Lcom/ibotta/android/verification/OfferQuantity;

    invoke-direct {v0}, Lcom/ibotta/android/verification/OfferQuantity;-><init>()V

    .line 42
    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferQuantity;->setOfferId(I)V

    .line 43
    invoke-virtual {v0, p2}, Lcom/ibotta/android/verification/OfferQuantity;->setQuantity(I)V

    .line 44
    iget-object p2, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/verification/OfferQuantity;->setSaveTime(J)V

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->toKey(I)Ljava/lang/String;

    move-result-object p1

    .line 47
    invoke-direct {p0, v0}, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->toJson(Lcom/ibotta/android/verification/OfferQuantity;)Ljava/lang/String;

    move-result-object p2

    .line 49
    iget-object v1, p0, Lcom/ibotta/android/verification/OfferQuantityDatabaseImpl;->prefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz p2, :cond_0

    .line 51
    invoke-interface {v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 53
    :cond_0
    invoke-interface {v1, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 55
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object v0
.end method
