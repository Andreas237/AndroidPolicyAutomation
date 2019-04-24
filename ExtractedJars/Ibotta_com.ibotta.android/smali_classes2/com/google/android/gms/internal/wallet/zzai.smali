.class final Lcom/google/android/gms/internal/wallet/zzai;
.super Lcom/google/android/gms/internal/wallet/zzaf;


# instance fields
.field private final zzgk:Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder<",
            "Lcom/google/android/gms/common/api/BooleanResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder<",
            "Lcom/google/android/gms/common/api/BooleanResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/wallet/zzaf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/wallet/zzai;->zzgk:Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/common/api/Status;ZLandroid/os/Bundle;)V
    .locals 1

    iget-object p3, p0, Lcom/google/android/gms/internal/wallet/zzai;->zzgk:Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;

    new-instance v0, Lcom/google/android/gms/common/api/BooleanResult;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/common/api/BooleanResult;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    invoke-interface {p3, v0}, Lcom/google/android/gms/common/api/internal/BaseImplementation$ResultHolder;->setResult(Ljava/lang/Object;)V

    return-void
.end method
