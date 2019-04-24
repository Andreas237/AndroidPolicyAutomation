.class final Lcom/google/android/gms/internal/measurement/zzzl;
.super Ljava/lang/Object;


# static fields
.field private static final zzbrq:Lcom/google/android/gms/internal/measurement/zzzj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;"
        }
    .end annotation
.end field

.field private static final zzbrr:Lcom/google/android/gms/internal/measurement/zzzj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzzk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzl;->zzbrq:Lcom/google/android/gms/internal/measurement/zzzj;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzl;->zztf()Lcom/google/android/gms/internal/measurement/zzzj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzl;->zzbrr:Lcom/google/android/gms/internal/measurement/zzzj;

    return-void
.end method

.method private static zztf()Lcom/google/android/gms/internal/measurement/zzzj;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.google.protobuf.ExtensionSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzzj;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static zztg()Lcom/google/android/gms/internal/measurement/zzzj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzl;->zzbrq:Lcom/google/android/gms/internal/measurement/zzzj;

    return-object v0
.end method

.method static zzth()Lcom/google/android/gms/internal/measurement/zzzj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzzj<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzl;->zzbrr:Lcom/google/android/gms/internal/measurement/zzzj;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Protobuf runtime is not correctly loaded."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
