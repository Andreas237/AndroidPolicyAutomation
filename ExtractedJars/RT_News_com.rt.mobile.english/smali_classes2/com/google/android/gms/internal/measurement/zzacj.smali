.class public final Lcom/google/android/gms/internal/measurement/zzacj;
.super Ljava/lang/Object;


# static fields
.field public static final zzbts:[I

.field private static final zzbxs:I = 0xb

.field private static final zzbxt:I = 0xc

.field private static final zzbxu:I = 0x10

.field private static final zzbxv:I = 0x1a

.field public static final zzbxw:[J

.field private static final zzbxx:[F

.field private static final zzbxy:[D

.field private static final zzbxz:[Z

.field public static final zzbya:[Ljava/lang/String;

.field private static final zzbyb:[[B

.field public static final zzbyc:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbts:[I

    new-array v1, v0, [J

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxw:[J

    new-array v1, v0, [F

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxx:[F

    new-array v1, v0, [D

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxy:[D

    new-array v1, v0, [Z

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbxz:[Z

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbya:[Ljava/lang/String;

    new-array v1, v0, [[B

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzacj;->zzbyb:[[B

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzacj;->zzbyc:[B

    return-void
.end method

.method public static final zzb(Lcom/google/android/gms/internal/measurement/zzabx;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzak(I)Z

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabx;->zzvf()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzak(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzabx;->zzd(II)V

    return v1
.end method
