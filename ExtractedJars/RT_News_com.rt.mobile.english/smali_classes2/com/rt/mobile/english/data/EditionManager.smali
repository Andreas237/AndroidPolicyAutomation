.class public Lcom/rt/mobile/english/data/EditionManager;
.super Ljava/lang/Object;
.source "EditionManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/EditionManager$Edition;
    }
.end annotation


# instance fields
.field private editions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/EditionManager$Edition;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    .line 26
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "en"

    const-string v3, "rtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "es"

    const-string v3, "spanishrtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "ar"

    const-string v3, "arabicrtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "fr"

    const-string v3, "frenchrtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "de"

    const-string v3, "deutshcrtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    new-instance v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    const-string v2, "ru"

    const-string v3, "russianrtnews"

    invoke-direct {v1, v2, v3}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static changeEdition(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 3

    .line 85
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/rt/mobile/english/Utils;->setLocale(Landroid/content/Context;Ljava/lang/String;)V

    .line 87
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/RTApp;->getTracker()Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    .line 89
    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/Tracker;->setLanguage(Ljava/lang/String;)V

    const-string v1, "&cd1"

    .line 91
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/Utils;->getLocale()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;-><init>()V

    .line 94
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;->setNewSession()Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;

    const/4 v2, 0x1

    .line 95
    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;->setCustomDimension(ILjava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;->build()Ljava/util/Map;

    move-result-object p1

    .line 92
    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    const-string p1, "notification"

    .line 98
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 99
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    .line 101
    invoke-static {}, Lcom/rt/mobile/english/service/FCMService;->subscribe()V

    const-string p1, "restart_main_activity"

    .line 103
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 104
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 105
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p0

    invoke-virtual {p0}, Lcom/rt/mobile/english/RTApp;->resetObjectGraph()V

    return-void
.end method


# virtual methods
.method public findEditionByScheme(Ljava/lang/String;)Lcom/rt/mobile/english/data/EditionManager$Edition;
    .locals 3

    .line 48
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/EditionManager;->getEditions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    .line 49
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public findSchemeByEdition(Ljava/lang/String;)Lcom/rt/mobile/english/data/EditionManager$Edition;
    .locals 3

    .line 57
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/EditionManager;->getEditions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    .line 58
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getCurrentEdition()Lcom/rt/mobile/english/data/EditionManager$Edition;
    .locals 4

    .line 39
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/rt/mobile/english/data/EditionManager$Edition;

    .line 40
    invoke-virtual {v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v3

    invoke-virtual {v3}, Lcom/rt/mobile/english/Utils;->getLocale()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 41
    new-instance v0, Lcom/rt/mobile/english/data/EditionManager$Edition;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lcom/rt/mobile/english/data/EditionManager$Edition;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 44
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown locale in shared preferences"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getEditions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/EditionManager$Edition;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager;->editions:Ljava/util/List;

    return-object v0
.end method
