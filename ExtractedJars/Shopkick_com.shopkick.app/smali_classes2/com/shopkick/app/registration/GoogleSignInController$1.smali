.class Lcom/shopkick/app/registration/GoogleSignInController$1;
.super Ljava/lang/Object;
.source "GoogleSignInController.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/registration/GoogleSignInController;->onConnected(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/registration/GoogleSignInController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/registration/GoogleSignInController;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController$1;->this$0:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController$1;->this$0:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-static {v0, p1}, Lcom/shopkick/app/registration/GoogleSignInController;->access$000(Lcom/shopkick/app/registration/GoogleSignInController;Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V

    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/Result;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 251
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/registration/GoogleSignInController$1;->onResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V

    return-void
.end method
