.class Lo/cym$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cym;->c(Lcom/google/android/gms/wearable/PutDataMapRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/google/android/gms/common/api/ResultCallback<Lcom/google/android/gms/wearable/DataApi$DataItemResult;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/cym;


# direct methods
.method constructor <init>(Lo/cym;)V
    .locals 0

    .line 580
    iput-object p1, p0, Lo/cym$1;->c:Lo/cym;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/google/android/gms/wearable/DataApi$DataItemResult;)V
    .locals 6

    .line 583
    invoke-interface {p1}, Lcom/google/android/gms/wearable/DataApi$DataItemResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v5

    .line 584
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncDataItem() Sending image was successful: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 585
    return-void
.end method

.method public synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 1

    .line 580
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/wearable/DataApi$DataItemResult;

    invoke-virtual {p0, v0}, Lo/cym$1;->d(Lcom/google/android/gms/wearable/DataApi$DataItemResult;)V

    return-void
.end method
