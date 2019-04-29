.class public final Lcom/google/android/gms/wearable/Wearable$WearableOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$Optional;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/Wearable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WearableOptions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;
    }
.end annotation


# instance fields
.field private final zzac:Landroid/os/Looper;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;->zza(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/wearable/Wearable$WearableOptions;->zzac:Landroid/os/Looper;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;Lcom/google/android/gms/wearable/zzj;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/Wearable$WearableOptions;-><init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)V

    return-void
.end method

.method private final zza()Lcom/google/android/gms/common/api/GoogleApi$Settings;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/Wearable$WearableOptions;->zzac:Landroid/os/Looper;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/GoogleApi$Settings$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/GoogleApi$Settings$Builder;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/wearable/Wearable$WearableOptions;->zzac:Landroid/os/Looper;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApi$Settings$Builder;->setLooper(Landroid/os/Looper;)Lcom/google/android/gms/common/api/GoogleApi$Settings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApi$Settings$Builder;->build()Lcom/google/android/gms/common/api/GoogleApi$Settings;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/GoogleApi$Settings;->DEFAULT_SETTINGS:Lcom/google/android/gms/common/api/GoogleApi$Settings;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/wearable/Wearable$WearableOptions;)Lcom/google/android/gms/common/api/GoogleApi$Settings;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/Wearable$WearableOptions;->zza()Lcom/google/android/gms/common/api/GoogleApi$Settings;

    move-result-object p0

    return-object p0
.end method
