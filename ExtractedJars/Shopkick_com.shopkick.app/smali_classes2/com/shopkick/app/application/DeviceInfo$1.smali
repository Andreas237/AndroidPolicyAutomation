.class Lcom/shopkick/app/application/DeviceInfo$1;
.super Ljava/lang/Object;
.source "DeviceInfo.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/DeviceInfo;->safetyNetSystemCheck()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/safetynet/SafetyNetApi$zza;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/DeviceInfo;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo$1;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/Result;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 324
    check-cast p1, Lcom/google/android/gms/safetynet/SafetyNetApi$zza;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/DeviceInfo$1;->onResult(Lcom/google/android/gms/safetynet/SafetyNetApi$zza;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/safetynet/SafetyNetApi$zza;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/safetynet/SafetyNetApi$zza;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 327
    invoke-interface {p1}, Lcom/google/android/gms/safetynet/SafetyNetApi$zza;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    .line 328
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$1;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-interface {p1}, Lcom/google/android/gms/safetynet/SafetyNetApi$zza;->getJwsResult()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/application/DeviceInfo;->access$000(Lcom/shopkick/app/application/DeviceInfo;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
