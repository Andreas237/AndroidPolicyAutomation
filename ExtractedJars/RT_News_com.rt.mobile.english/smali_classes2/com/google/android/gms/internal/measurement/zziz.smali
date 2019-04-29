.class final Lcom/google/android/gms/internal/measurement/zziz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Landroid/content/ComponentName;

.field private final synthetic zzapw:Lcom/google/android/gms/internal/measurement/zzix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzix;Landroid/content/ComponentName;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zziz;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zziz;->val$name:Landroid/content/ComponentName;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zziz;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zziz;->val$name:Landroid/content/ComponentName;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Lcom/google/android/gms/internal/measurement/zzij;Landroid/content/ComponentName;)V

    return-void
.end method
