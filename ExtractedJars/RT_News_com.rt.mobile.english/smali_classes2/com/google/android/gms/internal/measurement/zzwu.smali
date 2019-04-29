.class public abstract Lcom/google/android/gms/internal/measurement/zzwu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final zzbno:Ljava/lang/Object;

.field private static zzbnp:Z = false

.field private static volatile zzbnq:Ljava/lang/Boolean;

.field private static zzqx:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private final zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

.field final zzbns:Ljava/lang/String;

.field private final zzbnt:Ljava/lang/String;

.field private final zzbnu:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private zzbnv:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private volatile zzbnw:Lcom/google/android/gms/internal/measurement/zzwr;

.field private volatile zzbnx:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbno:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnv:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnw:Lcom/google/android/gms/internal/measurement/zzwr;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnx:Landroid/content/SharedPreferences;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzxe;->zza(Lcom/google/android/gms/internal/measurement/zzxe;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzxe;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnt:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzxe;->zzc(Lcom/google/android/gms/internal/measurement/zzxe;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbns:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnu:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/zzwy;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzwu;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static init(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbno:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, v1

    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    if-eq v1, p0, :cond_2

    const/4 v1, 0x0

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnq:Ljava/lang/Boolean;

    :cond_2
    sput-object p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x0

    sput-boolean p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnp:Z

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "D)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzxb;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzxb;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzwz;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwz;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "J)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzwy;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwy;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzxc;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzxc;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzxe;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzxa;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzxa;-><init>(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzxd;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/measurement/zzxd<",
            "TV;>;)TV;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzxd;->zzsl()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    return-object p0

    :catch_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide v0

    :try_start_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzxd;->zzsl()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p0

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p0

    return-object p0
.end method

.method static zzd(Ljava/lang/String;Z)Z
    .locals 2

    const/4 p1, 0x0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzwu;->zzsj()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzwx;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzwx;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxd;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :cond_0
    return p1

    :catch_0
    move-exception p0

    const-string v0, "PhenotypeFlag"

    const-string v1, "Unable to read GServices, returning default value."

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return p1
.end method

.method static final synthetic zze(Ljava/lang/String;Z)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzwp;->zza(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final zzsh()Ljava/lang/Object;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "gms:phenotype:phenotype_flag:debug_bypass_phenotype"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzwu;->zzd(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzxe;->zza(Lcom/google/android/gms/internal/measurement/zzxe;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnw:Lcom/google/android/gms/internal/measurement/zzwr;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzxe;->zza(Lcom/google/android/gms/internal/measurement/zzxe;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzwr;->zza(Landroid/content/ContentResolver;Landroid/net/Uri;)Lcom/google/android/gms/internal/measurement/zzwr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnw:Lcom/google/android/gms/internal/measurement/zzwr;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnw:Lcom/google/android/gms/internal/measurement/zzwr;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzwv;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzwv;-><init>(Lcom/google/android/gms/internal/measurement/zzwu;Lcom/google/android/gms/internal/measurement/zzwr;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxd;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzwu;->zzex(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    goto :goto_1

    :cond_2
    const-string v0, "PhenotypeFlag"

    const-string v1, "Bypass reading Phenotype values for flag: "

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbns:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v2

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private final zzsi()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzwu;->zzsj()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzww;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzww;-><init>(Lcom/google/android/gms/internal/measurement/zzwu;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzwu;->zza(Lcom/google/android/gms/internal/measurement/zzxd;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzwu;->zzex(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "PhenotypeFlag"

    const-string v2, "Unable to read GServices for flag: "

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbns:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_0
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static zzsj()Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnq:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    const-string v2, "com.google.android.providers.gsf.permission.READ_GSERVICES"

    invoke-static {v0, v2}, Landroid/support/v4/content/PermissionChecker;->checkCallingOrSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnq:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnq:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call PhenotypeFlag.init() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnr:Lcom/google/android/gms/internal/measurement/zzxe;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzwu;->zzsh()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzwu;->zzsi()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnu:Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract zzex(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method final synthetic zzsk()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzqx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbnt:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzwp;->zza(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
