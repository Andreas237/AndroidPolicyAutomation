.class public Lorg/jdom2/ProcessingInstruction;
.super Lorg/jdom2/Content;
.source "ProcessingInstruction.java"


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field protected transient mapData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected rawData:Ljava/lang/String;

.field protected target:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 91
    sget-object v0, Lorg/jdom2/Content$CType;->ProcessingInstruction:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, ""

    .line 103
    invoke-direct {p0, p1, v0}, Lorg/jdom2/ProcessingInstruction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 132
    sget-object v0, Lorg/jdom2/Content$CType;->ProcessingInstruction:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    .line 133
    invoke-virtual {p0, p1}, Lorg/jdom2/ProcessingInstruction;->setTarget(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    .line 134
    invoke-virtual {p0, p2}, Lorg/jdom2/ProcessingInstruction;->setData(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 117
    sget-object v0, Lorg/jdom2/Content$CType;->ProcessingInstruction:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    .line 118
    invoke-virtual {p0, p1}, Lorg/jdom2/ProcessingInstruction;->setTarget(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;

    .line 119
    invoke-virtual {p0, p2}, Lorg/jdom2/ProcessingInstruction;->setData(Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;

    return-void
.end method

.method private static extractQuotedString(Ljava/lang/String;)[I
    .locals 9

    const/16 v0, 0x22

    const/4 v1, 0x0

    move v4, v0

    move v2, v1

    move v3, v2

    move v5, v3

    .line 422
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v2, v6, :cond_3

    .line 423
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v0, :cond_0

    const/16 v8, 0x27

    if-ne v6, v8, :cond_2

    :cond_0
    if-nez v3, :cond_1

    add-int/lit8 v3, v2, 0x1

    move v5, v3

    move v4, v6

    move v3, v7

    goto :goto_1

    :cond_1
    if-ne v4, v6, :cond_2

    const/4 p0, 0x2

    .line 434
    new-array p0, p0, [I

    aput v5, p0, v1

    aput v2, p0, v7

    return-object p0

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private parseData(Ljava/lang/String;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 329
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 334
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 337
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, ""

    const-string v2, ""

    const/4 v3, 0x0

    .line 344
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v5, 0x1

    move v7, v3

    move v6, v4

    move v4, v5

    .line 346
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v4, v8, :cond_4

    .line 347
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x3d

    if-ne v8, v9, :cond_2

    .line 349
    invoke-virtual {p1, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v4, 0x1

    .line 352
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/jdom2/ProcessingInstruction;->extractQuotedString(Ljava/lang/String;)[I

    move-result-object v2

    if-nez v2, :cond_1

    .line 356
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 358
    :cond_1
    aget v3, v2, v3

    add-int/2addr v3, v4

    add-int/2addr v3, v5

    aget v6, v2, v5

    add-int/2addr v6, v4

    add-int/2addr v6, v5

    invoke-virtual {p1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 360
    aget v2, v2, v5

    add-int/2addr v2, v5

    add-int/2addr v4, v2

    move-object v2, v3

    goto :goto_2

    .line 363
    :cond_2
    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v8}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-nez v6, :cond_3

    move v7, v4

    :cond_3
    add-int/lit8 v4, v4, 0x1

    move v6, v8

    goto :goto_1

    .line 372
    :cond_4
    :goto_2
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 380
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 386
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method private static final toString(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 300
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 306
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-lez p0, :cond_1

    .line 307
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 310
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 70
    invoke-virtual {p0}, Lorg/jdom2/ProcessingInstruction;->clone()Lorg/jdom2/ProcessingInstruction;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 70
    invoke-virtual {p0}, Lorg/jdom2/ProcessingInstruction;->clone()Lorg/jdom2/ProcessingInstruction;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/Content;
    .locals 1

    .line 70
    invoke-virtual {p0}, Lorg/jdom2/ProcessingInstruction;->clone()Lorg/jdom2/ProcessingInstruction;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/ProcessingInstruction;
    .locals 2

    .line 465
    invoke-super {p0}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    .line 471
    iget-object v1, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    invoke-direct {p0, v1}, Lorg/jdom2/ProcessingInstruction;->parseData(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    return-object v0
.end method

.method public bridge synthetic detach()Lorg/jdom2/Content;
    .locals 1

    .line 70
    invoke-virtual {p0}, Lorg/jdom2/ProcessingInstruction;->detach()Lorg/jdom2/ProcessingInstruction;

    move-result-object v0

    return-object v0
.end method

.method public detach()Lorg/jdom2/ProcessingInstruction;
    .locals 1

    .line 477
    invoke-super {p0}, Lorg/jdom2/Content;->detach()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    return-object v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    return-object v0
.end method

.method public getPseudoAttributeNames()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getPseudoAttributeValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getTarget()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->target:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    return-object v0
.end method

.method public removePseudoAttribute(Ljava/lang/String;)Z
    .locals 1

    .line 282
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 283
    iget-object p1, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-static {p1}, Lorg/jdom2/ProcessingInstruction;->toString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setData(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 2

    .line 202
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkProcessingInstructionData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 207
    iput-object p1, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    .line 208
    invoke-direct {p0, p1}, Lorg/jdom2/ProcessingInstruction;->parseData(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    return-object p0

    .line 204
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalDataException;

    invoke-direct {v1, p1, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public setData(Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/jdom2/ProcessingInstruction;"
        }
    .end annotation

    .line 222
    invoke-static {p1}, Lorg/jdom2/ProcessingInstruction;->toString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-static {v0}, Lorg/jdom2/Verifier;->checkProcessingInstructionData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 229
    iput-object v0, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    .line 230
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    return-object p0

    .line 226
    :cond_0
    new-instance p1, Lorg/jdom2/IllegalDataException;

    invoke-direct {p1, v0, v1}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1
.end method

.method protected bridge synthetic setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;
    .locals 0

    .line 70
    invoke-virtual {p0, p1}, Lorg/jdom2/ProcessingInstruction;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/ProcessingInstruction;

    move-result-object p1

    return-object p1
.end method

.method protected setParent(Lorg/jdom2/Parent;)Lorg/jdom2/ProcessingInstruction;
    .locals 0

    .line 482
    invoke-super {p0, p1}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    move-result-object p1

    check-cast p1, Lorg/jdom2/ProcessingInstruction;

    return-object p1
.end method

.method public setPseudoAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 1

    .line 258
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkProcessingInstructionData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 263
    invoke-static {p2}, Lorg/jdom2/Verifier;->checkProcessingInstructionData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    iget-object p1, p0, Lorg/jdom2/ProcessingInstruction;->mapData:Ljava/util/Map;

    invoke-static {p1}, Lorg/jdom2/ProcessingInstruction;->toString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/ProcessingInstruction;->rawData:Ljava/lang/String;

    return-object p0

    .line 265
    :cond_0
    new-instance p1, Lorg/jdom2/IllegalDataException;

    invoke-direct {p1, p2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    .line 260
    :cond_1
    new-instance p2, Lorg/jdom2/IllegalDataException;

    invoke-direct {p2, p1, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p2
.end method

.method public setTarget(Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 2

    .line 145
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkProcessingInstructionTarget(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 150
    iput-object p1, p0, Lorg/jdom2/ProcessingInstruction;->target:Ljava/lang/String;

    return-object p0

    .line 147
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalTargetException;

    invoke-direct {v1, p1, v0}, Lorg/jdom2/IllegalTargetException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[ProcessingInstruction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Lorg/jdom2/output/XMLOutputter;

    invoke-direct {v1}, Lorg/jdom2/output/XMLOutputter;-><init>()V

    invoke-virtual {v1, p0}, Lorg/jdom2/output/XMLOutputter;->outputString(Lorg/jdom2/ProcessingInstruction;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
