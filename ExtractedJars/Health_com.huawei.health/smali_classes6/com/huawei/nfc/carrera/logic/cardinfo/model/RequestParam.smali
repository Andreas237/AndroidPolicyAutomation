.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private issuerId:Ljava/lang/String;

.field private mode:I

.field private productId:Ljava/lang/String;

.field private type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    .line 32
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->mode:I

    .line 33
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->type:I

    .line 34
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public convert2Map()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 71
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 72
    const-string v0, "productid"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v0, "mode"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->mode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v0, "type"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->type:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v0, "issuerid"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    return-object v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 52
    if-ne p1, p0, :cond_0

    .line 54
    const/4 v0, 0x1

    return v0

    .line 56
    :cond_0
    instance-of v0, p1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    if-nez v0, :cond_1

    .line 58
    const/4 v0, 0x0

    return v0

    .line 60
    :cond_1
    move-object v2, p1

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->type:I

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->type:I

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->mode:I

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->mode:I

    if-ne v0, v1, :cond_2

    .line 64
    const/4 v0, 0x1

    return v0

    .line 66
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 40
    const/16 v2, 0x1f

    .line 41
    const/4 v3, 0x1

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->issuerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/lit8 v3, v0, 0x1f

    .line 43
    mul-int/lit8 v0, v3, 0x1f

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->mode:I

    add-int v3, v0, v1

    .line 44
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->productId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int v3, v0, v1

    .line 45
    mul-int/lit8 v0, v3, 0x1f

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->type:I

    add-int v3, v0, v1

    .line 46
    return v3
.end method
