.class final Lcom/google/android/gms/internal/measurement/zzaba;
.super Ljava/lang/Object;


# static fields
.field private static final zzbuc:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzbud:Ljava/lang/Iterable;
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

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzabb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzabb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaba;->zzbuc:Ljava/util/Iterator;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzabc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzabc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaba;->zzbud:Ljava/lang/Iterable;

    return-void
.end method

.method static zzun()Ljava/lang/Iterable;
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

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaba;->zzbud:Ljava/lang/Iterable;

    return-object v0
.end method

.method static synthetic zzuo()Ljava/util/Iterator;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaba;->zzbuc:Ljava/util/Iterator;

    return-object v0
.end method
