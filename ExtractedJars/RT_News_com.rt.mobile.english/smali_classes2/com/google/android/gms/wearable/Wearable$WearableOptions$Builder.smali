.class public Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/Wearable$WearableOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zzac:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;)Landroid/os/Looper;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;->zzac:Landroid/os/Looper;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/google/android/gms/wearable/Wearable$WearableOptions;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/Wearable$WearableOptions;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wearable/Wearable$WearableOptions;-><init>(Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;Lcom/google/android/gms/wearable/zzj;)V

    return-object v0
.end method

.method public setLooper(Landroid/os/Looper;)Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/Wearable$WearableOptions$Builder;->zzac:Landroid/os/Looper;

    return-object p0
.end method
