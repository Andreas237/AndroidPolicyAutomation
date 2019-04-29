.class final Lcom/google/android/gms/internal/measurement/zzju;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfn;


# instance fields
.field private final synthetic zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

.field private final synthetic zzarg:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzju;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzju;->zzarg:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzju;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iget-object p5, p0, Lcom/google/android/gms/internal/measurement/zzju;->zzarg:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(ILjava/lang/Throwable;[BLjava/lang/String;)V

    return-void
.end method
