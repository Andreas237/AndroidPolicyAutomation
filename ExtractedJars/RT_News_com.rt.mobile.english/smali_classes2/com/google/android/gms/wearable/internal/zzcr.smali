.class final synthetic Lcom/google/android/gms/wearable/internal/zzcr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;


# static fields
.field static final zzbx:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzcr;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/zzcr;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/zzcr;->zzbx:Lcom/google/android/gms/common/internal/PendingResultUtil$ResultConverter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final convert(Lcom/google/android/gms/common/api/Result;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzcu;

    check-cast p1, Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    invoke-direct {v0, p1}, Lcom/google/android/gms/wearable/internal/zzcu;-><init>(Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;)V

    return-object v0
.end method
