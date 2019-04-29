.class final Lcom/google/android/gms/tagmanager/zzez;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbbb:Lcom/google/android/gms/tagmanager/zzex;

.field private final synthetic zzbbc:Lcom/google/android/gms/internal/measurement/zzvz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzex;Lcom/google/android/gms/internal/measurement/zzvz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzez;->zzbbb:Lcom/google/android/gms/tagmanager/zzex;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzez;->zzbbc:Lcom/google/android/gms/internal/measurement/zzvz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzez;->zzbbb:Lcom/google/android/gms/tagmanager/zzex;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzez;->zzbbc:Lcom/google/android/gms/internal/measurement/zzvz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/zzex;->zzb(Lcom/google/android/gms/internal/measurement/zzvz;)Z

    return-void
.end method
