.class public Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final OVERSEAS_GRS_CFG:Ljava/lang/String; = "wallet_grs"

.field private static SYNC_LOCK:Ljava/lang/Object; = null

.field private static instance:Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences; = null


# instance fields
.field private sp:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->instance:Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->SYNC_LOCK:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wallet_grs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    .line 27
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;
    .locals 4

    .line 38
    sget-object v2, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->SYNC_LOCK:Ljava/lang/Object;

    monitor-enter v2

    .line 40
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->instance:Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 42
    new-instance v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->instance:Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    .line 44
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->instance:Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 45
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public contains(Ljava/lang/String;)Z
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public getAll()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public putMap(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 66
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 69
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 71
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "HASURLS"

    const-string v1, "true"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 76
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 78
    :cond_1
    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 62
    return-void
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method
