.class final Lcom/google/android/gms/internal/measurement/zzabc;
.super Ljava/lang/Object;


# static fields
.field private static final zzbum:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzbun:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzabd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzabd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzabc;->zzbum:Ljava/util/Iterator;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzabe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzabe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzabc;->zzbun:Ljava/lang/Iterable;

    return-void
.end method

.method static zzuw()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/lang/Iterable<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzabc;->zzbun:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic zzux()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzabc;->zzbum:Ljava/util/Iterator;

    return-object v0
.end method
