.class final Lcom/google/android/gms/tagmanager/zzb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzd;


# instance fields
.field private final synthetic zzavj:Lcom/google/android/gms/tagmanager/zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzb;->zzavj:Lcom/google/android/gms/tagmanager/zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzmd()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzb;->zzavj:Lcom/google/android/gms/tagmanager/zza;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zza;->zza(Lcom/google/android/gms/tagmanager/zza;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Unknown exception. Could not get the Advertising Id Info."

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzb;->zzavj:Lcom/google/android/gms/tagmanager/zza;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/zza;->close()V

    const-string v1, "GooglePlayServicesNotAvailableException getting Advertising Id Info"

    goto :goto_0

    :catch_2
    move-exception v0

    const-string v1, "IOException getting Ad Id Info"

    goto :goto_0

    :catch_3
    move-exception v0

    const-string v1, "GooglePlayServicesRepairableException getting Advertising Id Info"

    goto :goto_0

    :catch_4
    move-exception v0

    const-string v1, "IllegalStateException getting Advertising Id Info"

    :goto_0
    invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/zzdi;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method
