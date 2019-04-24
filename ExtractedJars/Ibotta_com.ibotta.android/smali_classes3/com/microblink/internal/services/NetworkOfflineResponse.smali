.class public final Lcom/microblink/internal/services/NetworkOfflineResponse;
.super Lcom/microblink/internal/services/ServiceResponse;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/internal/services/ServiceResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public final message()Ljava/lang/String;
    .locals 2
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "message"
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SDK Offline Status: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/microblink/internal/services/NetworkOfflineResponse;->networkOffline()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final networkOffline()Z
    .locals 1
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "offline"
    .end annotation

    invoke-static {}, Lcom/microblink/ReceiptSdk;->networkOffline()Z

    move-result v0

    return v0
.end method

.method public final success()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
