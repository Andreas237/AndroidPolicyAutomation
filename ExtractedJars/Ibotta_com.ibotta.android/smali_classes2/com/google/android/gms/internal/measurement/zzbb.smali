.class final Lcom/google/android/gms/internal/measurement/zzbb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Landroid/content/ComponentName;

.field private final synthetic zzwt:Lcom/google/android/gms/internal/measurement/zzaz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzaz;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbb;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzbb;->val$name:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbb;->zzwt:Lcom/google/android/gms/internal/measurement/zzaz;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzaz;->zzwp:Lcom/google/android/gms/internal/measurement/zzax;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbb;->val$name:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzax;->zza(Lcom/google/android/gms/internal/measurement/zzax;Landroid/content/ComponentName;)V

    return-void
.end method
