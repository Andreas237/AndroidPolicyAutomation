.class public interface abstract Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub;
    }
.end annotation


# virtual methods
.method public abstract checkServerAuthorization(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/signin/internal/ISignInService;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;",
            "Lcom/google/android/gms/signin/internal/ISignInService;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

.method public abstract uploadServerAuthCode(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/ISignInService;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
