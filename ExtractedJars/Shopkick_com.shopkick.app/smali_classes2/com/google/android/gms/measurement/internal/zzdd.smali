.class final Lcom/google/android/gms/measurement/internal/zzdd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic zzads:Ljava/lang/String;

.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;

.field private final synthetic zzarf:J

.field private final synthetic zzarj:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzads:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzdd;->val$name:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzarj:Ljava/lang/Object;

    iput-wide p5, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzarf:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzads:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzdd;->val$name:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzarj:Ljava/lang/Object;

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/zzdd;->zzarf:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/zzda;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
