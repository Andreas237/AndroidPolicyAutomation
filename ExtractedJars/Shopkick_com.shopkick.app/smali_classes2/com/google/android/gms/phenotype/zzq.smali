.class final synthetic Lcom/google/android/gms/phenotype/zzq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/phenotype/PhenotypeFlag$zza;


# instance fields
.field private final zzav:Ljava/lang/String;

.field private final zzaw:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/phenotype/zzq;->zzav:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/phenotype/zzq;->zzaw:Z

    return-void
.end method


# virtual methods
.method public final zzh()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/phenotype/zzq;->zzav:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/google/android/gms/phenotype/zzq;->zzaw:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/phenotype/PhenotypeFlag;->zzb(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
