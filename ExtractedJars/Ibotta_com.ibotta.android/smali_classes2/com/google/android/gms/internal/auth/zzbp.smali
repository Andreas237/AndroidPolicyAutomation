.class final Lcom/google/android/gms/internal/auth/zzbp;
.super Lcom/google/android/gms/internal/auth/zzbg;


# instance fields
.field private final synthetic zzed:Lcom/google/android/gms/internal/auth/zzbo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/auth/zzbo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzbp;->zzed:Lcom/google/android/gms/internal/auth/zzbo;

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/zzbg;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzd(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzbp;->zzed:Lcom/google/android/gms/internal/auth/zzbo;

    new-instance v1, Lcom/google/android/gms/internal/auth/zzbq;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/auth/zzbq;-><init>(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/zzbo;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
