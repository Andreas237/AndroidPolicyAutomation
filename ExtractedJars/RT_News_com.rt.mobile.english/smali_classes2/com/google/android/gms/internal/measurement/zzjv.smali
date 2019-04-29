.class final Lcom/google/android/gms/internal/measurement/zzjv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfn;


# instance fields
.field private final synthetic zzarf:Lcom/google/android/gms/internal/measurement/zzjs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6
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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzjs;->zzb(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
