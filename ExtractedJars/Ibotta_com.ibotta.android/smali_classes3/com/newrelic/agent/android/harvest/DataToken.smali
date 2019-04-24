.class public Lcom/newrelic/agent/android/harvest/DataToken;
.super Lcom/newrelic/agent/android/harvest/type/HarvestableArray;
.source "DataToken.java"


# instance fields
.field private accountId:I

.field private agentId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/type/HarvestableArray;-><init>()V

    .line 20
    iput p1, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    .line 21
    iput p2, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    return-void
.end method


# virtual methods
.method public asJsonArray()Lcom/newrelic/com/google/gson/JsonArray;
    .locals 3

    .line 26
    new-instance v0, Lcom/newrelic/com/google/gson/JsonArray;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonArray;-><init>()V

    .line 27
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget v2, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    .line 28
    new-instance v1, Lcom/newrelic/com/google/gson/JsonPrimitive;

    iget v2, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/com/google/gson/JsonArray;->add(Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    .line 34
    iput v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    return-void
.end method

.method public getAccountId()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    return v0
.end method

.method public getAgentId()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    return v0
.end method

.method public isValid()Z
    .locals 1

    .line 54
    iget v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAccountId(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    return-void
.end method

.method public setAgentId(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataToken{accountId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/DataToken;->accountId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", agentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/newrelic/agent/android/harvest/DataToken;->agentId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
