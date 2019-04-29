.class final Lcom/google/android/gms/tagmanager/zzfu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzbe;


# instance fields
.field private final zzaaz:Ljava/lang/String;

.field private final zzbcp:Lcom/google/android/gms/tagmanager/zzfx;

.field private final zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

.field private final zzqx:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzfw;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    new-instance v0, Lcom/google/android/gms/tagmanager/zzfv;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/zzfv;-><init>()V

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/tagmanager/zzfu;-><init>(Lcom/google/android/gms/tagmanager/zzfx;Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzfw;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/tagmanager/zzfx;Landroid/content/Context;Lcom/google/android/gms/tagmanager/zzfw;)V
    .locals 6
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcp:Lcom/google/android/gms/tagmanager/zzfx;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzqx:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

    const-string p1, "GoogleTagManager"

    const-string p2, "4.00"

    sget-object p3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->ID:Ljava/lang/String;

    const-string v3, "%s/%s (Linux; U; Android %s; %s; %s Build/%s)"

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 p1, 0x1

    aput-object p2, v4, p1

    const/4 p1, 0x2

    aput-object p3, v4, p1

    const/4 p1, 0x3

    aput-object v1, v4, p1

    const/4 p1, 0x4

    aput-object v0, v4, p1

    const/4 p1, 0x5

    aput-object v2, v4, p1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzaaz:Ljava/lang/String;

    return-void
.end method

.method private static zzd(Lcom/google/android/gms/tagmanager/zzbw;)Ljava/net/URL;
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/zzbw;->zznr()Ljava/lang/String;

    move-result-object p0

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string p0, "Error trying to parse the GTM url."

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final zze(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/tagmanager/zzbw;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x28

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v2

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_6

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/tagmanager/zzbw;

    invoke-static {v4}, Lcom/google/android/gms/tagmanager/zzfu;->zzd(Lcom/google/android/gms/tagmanager/zzbw;)Ljava/net/URL;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v5, "No destination: discarding hit."

    invoke-static {v5}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

    invoke-interface {v5, v4}, Lcom/google/android/gms/tagmanager/zzfw;->zzb(Lcom/google/android/gms/tagmanager/zzbw;)V

    goto/16 :goto_5

    :cond_0
    const/4 v6, 0x0

    :try_start_0
    iget-object v7, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcp:Lcom/google/android/gms/tagmanager/zzfx;

    invoke-interface {v7, v5}, Lcom/google/android/gms/tagmanager/zzfx;->zzc(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    :try_start_1
    iget-object v7, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzqx:Landroid/content/Context;

    invoke-static {v7}, Lcom/google/android/gms/tagmanager/zzdn;->zzp(Landroid/content/Context;)V

    move v3, v1

    goto :goto_1

    :catchall_0
    move-exception v7

    move-object v8, v6

    goto :goto_3

    :cond_1
    :goto_1
    const-string v7, "User-Agent"

    iget-object v8, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzaaz:Ljava/lang/String;

    invoke-virtual {v5, v7, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v6, 0xc8

    if-eq v7, v6, :cond_2

    const/16 v6, 0x19

    :try_start_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Bad response: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    iget-object v6, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

    invoke-interface {v6, v4}, Lcom/google/android/gms/tagmanager/zzfw;->zzc(Lcom/google/android/gms/tagmanager/zzbw;)V

    goto :goto_2

    :catchall_1
    move-exception v7

    goto :goto_3

    :cond_2
    iget-object v6, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

    invoke-interface {v6, v4}, Lcom/google/android/gms/tagmanager/zzfw;->zza(Lcom/google/android/gms/tagmanager/zzbw;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v8, :cond_3

    :try_start_3
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    :cond_3
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_5

    :goto_3
    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    :cond_4
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v7
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v5

    const-string v6, "Exception sending hit: "

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_5
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v6, v7

    :goto_4
    invoke-static {v6}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzbcq:Lcom/google/android/gms/tagmanager/zzfw;

    invoke-interface {v5, v4}, Lcom/google/android/gms/tagmanager/zzfw;->zzc(Lcom/google/android/gms/tagmanager/zzbw;)V

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final zzng()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfu;->zzqx:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const-string v0, "...no network connectivity"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
