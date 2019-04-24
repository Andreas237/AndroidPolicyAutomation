.class Lo/cym$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cym;->c(Lcom/google/android/gms/common/api/PendingResult;Lcom/google/android/gms/wearable/PutDataMapRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/google/android/gms/common/api/ResultCallback<Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/gms/wearable/PutDataMapRequest;

.field final synthetic d:Lo/cym;


# direct methods
.method constructor <init>(Lo/cym;Lcom/google/android/gms/wearable/PutDataMapRequest;)V
    .locals 0

    .line 595
    iput-object p1, p0, Lo/cym$4;->d:Lo/cym;

    iput-object p2, p0, Lo/cym$4;->c:Lcom/google/android/gms/wearable/PutDataMapRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;)V
    .locals 5
    .param p1    # Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 598
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendMessageAPI onResult"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 599
    invoke-interface {p1}, Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-nez v0, :cond_0

    .line 601
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendMessageResult is unSuccess so try to use syncDataItem"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 602
    iget-object v0, p0, Lo/cym$4;->d:Lo/cym;

    iget-object v1, p0, Lo/cym$4;->c:Lcom/google/android/gms/wearable/PutDataMapRequest;

    invoke-virtual {v0, v1}, Lo/cym;->c(Lcom/google/android/gms/wearable/PutDataMapRequest;)V

    .line 604
    :cond_0
    return-void
.end method

.method public synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Result;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 595
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;

    invoke-virtual {p0, v0}, Lo/cym$4;->c(Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;)V

    return-void
.end method
