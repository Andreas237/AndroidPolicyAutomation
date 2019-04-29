.class public final Lcom/google/android/gms/internal/wearable/zzw;
.super Ljava/lang/Object;


# static fields
.field private static final zzhn:I = 0xb

.field private static final zzho:I = 0xc

.field private static final zzhp:I = 0x10

.field private static final zzhq:I = 0x1a

.field private static final zzhr:[I

.field public static final zzhs:[J

.field public static final zzht:[F

.field private static final zzhu:[D

.field private static final zzhv:[Z

.field public static final zzhw:[Ljava/lang/String;

.field private static final zzhx:[[B

.field public static final zzhy:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhr:[I

    new-array v1, v0, [J

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhs:[J

    new-array v1, v0, [F

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzht:[F

    new-array v1, v0, [D

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhu:[D

    new-array v1, v0, [Z

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhv:[Z

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhw:[Ljava/lang/String;

    new-array v1, v0, [[B

    sput-object v1, Lcom/google/android/gms/internal/wearable/zzw;->zzhx:[[B

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/wearable/zzw;->zzhy:[B

    return-void
.end method

.method public static final zzb(Lcom/google/android/gms/internal/wearable/zzk;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/wearable/zzk;->getPosition()I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzd(I)Z

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/wearable/zzk;->zzj()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzd(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/wearable/zzk;->zzc(II)V

    return v1
.end method
