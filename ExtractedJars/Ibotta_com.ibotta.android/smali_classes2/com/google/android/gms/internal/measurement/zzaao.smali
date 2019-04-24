.class final Lcom/google/android/gms/internal/measurement/zzaao;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaav;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzaav<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zzbti:[I

.field private static final zzbtj:Lsun/misc/Unsafe;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaao;->zzbti:[I

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzabm;->zzur()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaao;->zzbtj:Lsun/misc/Unsafe;

    return-void
.end method

.method static zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzaaj;Lcom/google/android/gms/internal/measurement/zzaaq;Lcom/google/android/gms/internal/measurement/zzzz;Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaag;)Lcom/google/android/gms/internal/measurement/zzaao;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/measurement/zzaaj;",
            "Lcom/google/android/gms/internal/measurement/zzaaq;",
            "Lcom/google/android/gms/internal/measurement/zzzz;",
            "Lcom/google/android/gms/internal/measurement/zzabj<",
            "**>;",
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/zzaag;",
            ")",
            "Lcom/google/android/gms/internal/measurement/zzaao<",
            "TT;>;"
        }
    .end annotation

    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzaau;

    if-eqz p0, :cond_0

    new-instance p0, Ljava/lang/NoSuchMethodError;

    invoke-direct {p0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/NoSuchMethodError;

    invoke-direct {p0}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final hashCode(Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method
