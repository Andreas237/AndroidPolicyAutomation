.class final Lcom/google/android/gms/tagmanager/zzex;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzah;


# instance fields
.field private final zzalw:Ljava/util/concurrent/ExecutorService;

.field private final zzavt:Ljava/lang/String;

.field private zzbau:Lcom/google/android/gms/tagmanager/zzdh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/zzdh<",
            "Lcom/google/android/gms/internal/measurement/zzvz;",
            ">;"
        }
    .end annotation
.end field

.field private final zzqx:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzqx:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzex;->zzavt:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzalw:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private static zza(Ljava/io/ByteArrayOutputStream;)Lcom/google/android/gms/internal/measurement/zzwf;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzda;->zzdf(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn\'t contain a JSON container"

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    return-object v0

    :catch_1
    const-string p0, "Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format."

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->zzcx(Ljava/lang/String;)V

    return-object v0
.end method

.method private static zze([B)Lcom/google/android/gms/internal/measurement/zzwf;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzi;-><init>()V

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/measurement/zzacg;->zza(Lcom/google/android/gms/internal/measurement/zzacg;[B)Lcom/google/android/gms/internal/measurement/zzacg;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/zzi;

    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzwb;->zza(Lcom/google/android/gms/internal/measurement/zzi;)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "The container was successfully loaded from the resource (using binary file)"

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzacf; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/measurement/zzwj; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    const-string p0, "The resource file is invalid. The container from the binary file is invalid"

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    return-object v0

    :catch_1
    const-string p0, "The resource file is corrupted. The container cannot be extracted from the binary file"

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    return-object v0
.end method

.method private final zzol()Ljava/io/File;
    .locals 4
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "resource_"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzavt:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzqx:Landroid/content/Context;

    const-string v2, "google_tagmanager"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public final declared-synchronized release()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzalw:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzvz;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzalw:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzez;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/tagmanager/zzez;-><init>(Lcom/google/android/gms/tagmanager/zzex;Lcom/google/android/gms/internal/measurement/zzvz;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/tagmanager/zzdh;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/zzdh<",
            "Lcom/google/android/gms/internal/measurement/zzvz;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    return-void
.end method

.method final zzb(Lcom/google/android/gms/internal/measurement/zzvz;)Z
    .locals 5
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzex;->zzol()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvv()I

    move-result v3

    new-array v3, v3, [B

    array-length v4, v3

    invoke-static {p1, v3, v1, v4}, Lcom/google/android/gms/internal/measurement/zzacg;->zza(Lcom/google/android/gms/internal/measurement/zzacg;[BII)V

    invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "error closing stream for writing resource to disk"

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    :try_start_3
    const-string p1, "Error writing resource to disk. Removing resource from disk."

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    return v1

    :catch_2
    const-string p1, "error closing stream for writing resource to disk"

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    return v1

    :goto_1
    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_2

    :catch_3
    const-string v0, "error closing stream for writing resource to disk"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    :goto_2
    throw p1

    :catch_4
    const-string p1, "Error opening resource file for writing"

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    return v1
.end method

.method public final zzms()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzalw:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/tagmanager/zzey;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/zzey;-><init>(Lcom/google/android/gms/tagmanager/zzex;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method final zzok()V
    .locals 3
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Callback must be set before execute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzdh;->zzmr()V

    const-string v0, "Attempting to load resource from disk"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzeh;->zzof()Lcom/google/android/gms/tagmanager/zzeh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzeh;->zzog()Lcom/google/android/gms/tagmanager/zzeh$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbaj:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzeh;->zzof()Lcom/google/android/gms/tagmanager/zzeh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzeh;->zzog()Lcom/google/android/gms/tagmanager/zzeh$zza;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/zzeh$zza;->zzbak:Lcom/google/android/gms/tagmanager/zzeh$zza;

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzavt:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzeh;->zzof()Lcom/google/android/gms/tagmanager/zzeh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/zzeh;->getContainerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    sget v1, Lcom/google/android/gms/tagmanager/zzcz;->zzazi:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzdh;->zzq(I)V

    return-void

    :cond_2
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzex;->zzol()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzwb;->zza(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzvz;

    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/zzvz;-><init>()V

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzacg;->zza(Lcom/google/android/gms/internal/measurement/zzacg;[B)Lcom/google/android/gms/internal/measurement/zzacg;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzvz;

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    if-nez v2, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-nez v2, :cond_3

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Resource and SupplementedResource are NULL."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    invoke-interface {v2, v1}, Lcom/google/android/gms/tagmanager/zzdh;->onSuccess(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    sget v2, Lcom/google/android/gms/tagmanager/zzcz;->zzazj:I

    invoke-interface {v1, v2}, Lcom/google/android/gms/tagmanager/zzdh;->zzq(I)V

    const-string v1, "Failed to read the resource from disk. The resource is inconsistent"

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_1
    :try_start_4
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    sget v2, Lcom/google/android/gms/tagmanager/zzcz;->zzazj:I

    invoke-interface {v1, v2}, Lcom/google/android/gms/tagmanager/zzdh;->zzq(I)V

    const-string v1, "Failed to read the resource from disk"

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_2
    const-string v0, "Error closing stream for reading resource from disk"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    :goto_1
    const-string v0, "The Disk resource was successfully read."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    return-void

    :goto_2
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    const-string v0, "Error closing stream for reading resource from disk"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    :goto_3
    throw v1

    :catch_4
    const-string v0, "Failed to find the resource in the disk"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzcx(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzex;->zzbau:Lcom/google/android/gms/tagmanager/zzdh;

    sget v1, Lcom/google/android/gms/tagmanager/zzcz;->zzazi:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/zzdh;->zzq(I)V

    return-void
.end method

.method public final zzr(I)Lcom/google/android/gms/internal/measurement/zzwf;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzqx:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/zzex;->zzqx:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x42

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Attempting to load a container from the resource ID "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    :try_start_1
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzwb;->zza(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzex;->zza(Ljava/io/ByteArrayOutputStream;)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "The container was successfully loaded from the resource (using JSON file format)"

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/zzdi;->v(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/zzex;->zze([B)Lcom/google/android/gms/internal/measurement/zzwf;

    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzex;->zzqx:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x43

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Error reading the default container with resource ID "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->zzaa(Ljava/lang/String;)V

    return-object v0

    :catch_1
    const/16 v1, 0x62

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Failed to load the container. No default container resource found with the resource ID "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method
