.class public Lcom/google/android/gms/wearable/PutDataMapRequest;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private final zzr:Lcom/google/android/gms/wearable/DataMap;

.field private final zzs:Lcom/google/android/gms/wearable/PutDataRequest;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/DataMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    new-instance p1, Lcom/google/android/gms/wearable/DataMap;

    invoke-direct {p1}, Lcom/google/android/gms/wearable/DataMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzr:Lcom/google/android/gms/wearable/DataMap;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzr:Lcom/google/android/gms/wearable/DataMap;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putAll(Lcom/google/android/gms/wearable/DataMap;)V

    :cond_0
    return-void
.end method

.method public static create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "path must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Asserts;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/wearable/PutDataMapRequest;

    invoke-static {p0}, Lcom/google/android/gms/wearable/PutDataRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/DataMap;)V

    return-object v0
.end method

.method public static createFromDataMapItem(Lcom/google/android/gms/wearable/DataMapItem;)Lcom/google/android/gms/wearable/PutDataMapRequest;
    .locals 2
    .param p0    # Lcom/google/android/gms/wearable/DataMapItem;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "source must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Asserts;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/wearable/PutDataMapRequest;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataMapItem;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/wearable/PutDataRequest;->zza(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataMapItem;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/wearable/PutDataMapRequest;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/DataMap;)V

    return-object v0
.end method

.method public static createWithAutoAppendedId(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "pathPrefix must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/Asserts;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/wearable/PutDataMapRequest;

    invoke-static {p0}, Lcom/google/android/gms/wearable/PutDataRequest;->createWithAutoAppendedId(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/DataMap;)V

    return-object v0
.end method


# virtual methods
.method public asPutDataRequest()Lcom/google/android/gms/wearable/PutDataRequest;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzr:Lcom/google/android/gms/wearable/DataMap;

    invoke-static {v0}, Lcom/google/android/gms/internal/wearable/zze;->zza(Lcom/google/android/gms/wearable/DataMap;)Lcom/google/android/gms/internal/wearable/zzf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    iget-object v2, v0, Lcom/google/android/gms/internal/wearable/zzf;->zzfw:Lcom/google/android/gms/internal/wearable/zzg;

    invoke-static {v2}, Lcom/google/android/gms/internal/wearable/zzt;->zzb(Lcom/google/android/gms/internal/wearable/zzt;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/wearable/PutDataRequest;->setData([B)Lcom/google/android/gms/wearable/PutDataRequest;

    iget-object v1, v0, Lcom/google/android/gms/internal/wearable/zzf;->zzfx:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/google/android/gms/internal/wearable/zzf;->zzfx:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/wearable/Asset;

    if-nez v3, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x1a

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "asset key cannot be null: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez v4, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "asset cannot be null: key="

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_1
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string v5, "DataMap"

    const/4 v6, 0x3

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "DataMap"

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x21

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v7, v8

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v7, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "asPutDataRequest: adding asset: "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object v5, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/wearable/PutDataRequest;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    return-object v0
.end method

.method public getDataMap()Lcom/google/android/gms/wearable/DataMap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzr:Lcom/google/android/gms/wearable/DataMap;

    return-object v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public isUrgent()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->isUrgent()Z

    move-result v0

    return v0
.end method

.method public setUrgent()Lcom/google/android/gms/wearable/PutDataMapRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/PutDataMapRequest;->zzs:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->setUrgent()Lcom/google/android/gms/wearable/PutDataRequest;

    return-object p0
.end method
