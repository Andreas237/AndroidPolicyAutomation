.class Lcom/google/android/gms/internal/measurement/zzzz;
.super Ljava/lang/Object;


# static fields
.field private static final zzbta:Lcom/google/android/gms/internal/measurement/zzzz;

.field private static final zzbtb:Lcom/google/android/gms/internal/measurement/zzzz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaab;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaab;-><init>(Lcom/google/android/gms/internal/measurement/zzaaa;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzz;->zzbta:Lcom/google/android/gms/internal/measurement/zzzz;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaac;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaac;-><init>(Lcom/google/android/gms/internal/measurement/zzaaa;)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzz;->zzbtb:Lcom/google/android/gms/internal/measurement/zzzz;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzaaa;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzzz;-><init>()V

    return-void
.end method

.method static zztq()Lcom/google/android/gms/internal/measurement/zzzz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzz;->zzbta:Lcom/google/android/gms/internal/measurement/zzzz;

    return-object v0
.end method

.method static zztr()Lcom/google/android/gms/internal/measurement/zzzz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzz;->zzbtb:Lcom/google/android/gms/internal/measurement/zzzz;

    return-object v0
.end method
