.class final Lcom/google/android/gms/measurement/internal/zzdi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;

.field private final synthetic zzarl:Lcom/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Lcom/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzdi;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzdi;->zzarl:Lcom/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdi;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdi;->zzarl:Lcom/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzda;->zza(Lcom/google/android/gms/measurement/internal/zzda;Lcom/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty;)V

    return-void
.end method
