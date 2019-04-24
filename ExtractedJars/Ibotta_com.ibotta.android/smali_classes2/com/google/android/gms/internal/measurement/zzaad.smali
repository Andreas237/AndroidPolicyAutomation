.class final Lcom/google/android/gms/internal/measurement/zzaad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaaw;


# static fields
.field private static final zzbte:Lcom/google/android/gms/internal/measurement/zzaak;


# instance fields
.field private final zzbtd:Lcom/google/android/gms/internal/measurement/zzaak;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaae;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzaae;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzaad;->zzbte:Lcom/google/android/gms/internal/measurement/zzaak;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaaf;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzaak;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzp;->zztl()Lcom/google/android/gms/internal/measurement/zzzp;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaad;->zzts()Lcom/google/android/gms/internal/measurement/zzaak;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzaaf;-><init>([Lcom/google/android/gms/internal/measurement/zzaak;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaad;-><init>(Lcom/google/android/gms/internal/measurement/zzaak;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzaak;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzzr;->zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzaak;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaad;->zzbtd:Lcom/google/android/gms/internal/measurement/zzaak;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzaaj;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzaaj;->zztw()I

    move-result p0

    sget v0, Lcom/google/android/gms/internal/measurement/zzzq$zzb;->zzbsk:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static zzts()Lcom/google/android/gms/internal/measurement/zzaak;
    .locals 4

    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaak;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzaad;->zzbte:Lcom/google/android/gms/internal/measurement/zzaak;

    return-object v0
.end method


# virtual methods
.method public final zzg(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzaav;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/measurement/zzaav<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzaax;->zzh(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaad;->zzbtd:Lcom/google/android/gms/internal/measurement/zzaak;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/zzaak;->zze(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zzaaj;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzaaj;->zztx()Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/measurement/zzzq;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzug()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzl;->zztg()Lcom/google/android/gms/internal/measurement/zzzj;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzaaj;->zzty()Lcom/google/android/gms/internal/measurement/zzaal;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaap;->zza(Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaal;)Lcom/google/android/gms/internal/measurement/zzaap;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzue()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzl;->zzth()Lcom/google/android/gms/internal/measurement/zzzj;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/zzaaj;->zzty()Lcom/google/android/gms/internal/measurement/zzaal;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaap;->zza(Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaal;)Lcom/google/android/gms/internal/measurement/zzaap;

    move-result-object p1

    return-object p1

    :cond_1
    const-class v0, Lcom/google/android/gms/internal/measurement/zzzq;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzaad;->zza(Lcom/google/android/gms/internal/measurement/zzaaj;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaas;->zzub()Lcom/google/android/gms/internal/measurement/zzaaq;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzz;->zztr()Lcom/google/android/gms/internal/measurement/zzzz;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzug()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzl;->zztg()Lcom/google/android/gms/internal/measurement/zzzj;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaai;->zztu()Lcom/google/android/gms/internal/measurement/zzaag;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzaao;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzaaj;Lcom/google/android/gms/internal/measurement/zzaaq;Lcom/google/android/gms/internal/measurement/zzzz;Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaag;)Lcom/google/android/gms/internal/measurement/zzaao;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaas;->zzub()Lcom/google/android/gms/internal/measurement/zzaaq;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzz;->zztr()Lcom/google/android/gms/internal/measurement/zzzz;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzug()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaai;->zztu()Lcom/google/android/gms/internal/measurement/zzaag;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzaao;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzaaj;Lcom/google/android/gms/internal/measurement/zzaaq;Lcom/google/android/gms/internal/measurement/zzzz;Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaag;)Lcom/google/android/gms/internal/measurement/zzaao;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/zzaad;->zza(Lcom/google/android/gms/internal/measurement/zzaaj;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaas;->zzua()Lcom/google/android/gms/internal/measurement/zzaaq;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzz;->zztq()Lcom/google/android/gms/internal/measurement/zzzz;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzue()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzl;->zzth()Lcom/google/android/gms/internal/measurement/zzzj;

    move-result-object v6

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaai;->zztt()Lcom/google/android/gms/internal/measurement/zzaag;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzaao;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzaaj;Lcom/google/android/gms/internal/measurement/zzaaq;Lcom/google/android/gms/internal/measurement/zzzz;Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaag;)Lcom/google/android/gms/internal/measurement/zzaao;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaas;->zzua()Lcom/google/android/gms/internal/measurement/zzaaq;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzz;->zztq()Lcom/google/android/gms/internal/measurement/zzzz;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaax;->zzuf()Lcom/google/android/gms/internal/measurement/zzabj;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzaai;->zztt()Lcom/google/android/gms/internal/measurement/zzaag;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/zzaao;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzaaj;Lcom/google/android/gms/internal/measurement/zzaaq;Lcom/google/android/gms/internal/measurement/zzzz;Lcom/google/android/gms/internal/measurement/zzabj;Lcom/google/android/gms/internal/measurement/zzzj;Lcom/google/android/gms/internal/measurement/zzaag;)Lcom/google/android/gms/internal/measurement/zzaao;

    move-result-object p1

    return-object p1
.end method
