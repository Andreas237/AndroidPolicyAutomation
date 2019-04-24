.class public Lcom/ibotta/android/service/push/BrazeCachesExtras;
.super Ljava/lang/Object;
.source "BrazeCachesExtras.java"


# static fields
.field private static final KEY_BONUS_ID:Ljava/lang/String; = "bonus_id"

.field public static final KEY_BRAZE_EXTRA:Ljava/lang/String; = "extra"

.field private static final KEY_CACHES:Ljava/lang/String; = "caches"

.field private static final KEY_OFFER_ID:Ljava/lang/String; = "offer_id"


# instance fields
.field private extrasMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/service/push/BrazeCachesExtras;->extrasMap:Ljava/util/Map;

    if-eqz p1, :cond_0

    const-string v0, "extra"

    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "extra"

    .line 30
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/service/push/BrazeCachesExtras;->parseExtrasMap(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private parseExtrasMap(Ljava/lang/String;)V
    .locals 5

    .line 63
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 69
    :try_start_0
    sget-object v2, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    .line 70
    invoke-virtual {v2, v1, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    const-class v4, Ljava/lang/String;

    .line 71
    invoke-interface {v2, p1, v3, v4}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to parse App Boy extras JSON str."

    .line 73
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_1

    .line 77
    iput-object v0, p0, Lcom/ibotta/android/service/push/BrazeCachesExtras;->extrasMap:Ljava/util/Map;

    :cond_1
    return-void
.end method


# virtual methods
.method public getBonusId()I
    .locals 4

    const/4 v0, 0x0

    .line 54
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/service/push/BrazeCachesExtras;->extrasMap:Ljava/util/Map;

    const-string v2, "bonus_id"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to parse bonus_id"

    .line 56
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0
.end method

.method public getCacheFlags()Ljava/lang/String;
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/service/push/BrazeCachesExtras;->extrasMap:Ljava/util/Map;

    const-string v1, "caches"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOfferId()I
    .locals 4

    const/4 v0, 0x0

    .line 42
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/service/push/BrazeCachesExtras;->extrasMap:Ljava/util/Map;

    const-string v2, "offer_id"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to parse offer_id"

    .line 44
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0
.end method
