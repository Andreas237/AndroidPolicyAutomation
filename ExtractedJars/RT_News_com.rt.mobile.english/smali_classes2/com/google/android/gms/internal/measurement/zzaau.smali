.class final Lcom/google/android/gms/internal/measurement/zzaau;
.super Ljava/lang/Object;


# static fields
.field private static final zzbty:Lcom/google/android/gms/internal/measurement/zzaas;

.field private static final zzbtz:Lcom/google/android/gms/internal/measurement/zzaas;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaau;->zzul()Lcom/google/android/gms/internal/measurement/zzaas;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaau;->zzbty:Lcom/google/android/gms/internal/measurement/zzaas;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaat;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaat;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaau;->zzbtz:Lcom/google/android/gms/internal/measurement/zzaas;

    return-void
.end method

.method static zzuj()Lcom/google/android/gms/internal/measurement/zzaas;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaau;->zzbty:Lcom/google/android/gms/internal/measurement/zzaas;

    return-object v0
.end method

.method static zzuk()Lcom/google/android/gms/internal/measurement/zzaas;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaau;->zzbtz:Lcom/google/android/gms/internal/measurement/zzaas;

    return-object v0
.end method

.method private static zzul()Lcom/google/android/gms/internal/measurement/zzaas;
    .locals 3

    :try_start_0
    const-string v0, "com.google.protobuf.NewInstanceSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaas;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
