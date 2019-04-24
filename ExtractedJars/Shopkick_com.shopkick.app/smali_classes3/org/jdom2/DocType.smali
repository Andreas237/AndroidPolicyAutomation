.class public Lorg/jdom2/DocType;
.super Lorg/jdom2/Content;
.source "DocType.java"


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field protected elementName:Ljava/lang/String;

.field protected internalSubset:Ljava/lang/String;

.field protected publicID:Ljava/lang/String;

.field protected systemID:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 99
    sget-object v0, Lorg/jdom2/Content$CType;->DocType:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 158
    invoke-direct {p0, p1, v0, v0}, Lorg/jdom2/DocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 145
    invoke-direct {p0, p1, v0, p2}, Lorg/jdom2/DocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 124
    sget-object v0, Lorg/jdom2/Content$CType;->DocType:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    .line 125
    invoke-virtual {p0, p1}, Lorg/jdom2/DocType;->setElementName(Ljava/lang/String;)Lorg/jdom2/DocType;

    .line 126
    invoke-virtual {p0, p2}, Lorg/jdom2/DocType;->setPublicID(Ljava/lang/String;)Lorg/jdom2/DocType;

    .line 127
    invoke-virtual {p0, p3}, Lorg/jdom2/DocType;->setSystemID(Ljava/lang/String;)Lorg/jdom2/DocType;

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Lorg/jdom2/DocType;->clone()Lorg/jdom2/DocType;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lorg/jdom2/DocType;->clone()Lorg/jdom2/DocType;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/Content;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lorg/jdom2/DocType;->clone()Lorg/jdom2/DocType;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/DocType;
    .locals 1

    .line 299
    invoke-super {p0}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/DocType;

    return-object v0
.end method

.method public bridge synthetic detach()Lorg/jdom2/Content;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lorg/jdom2/DocType;->detach()Lorg/jdom2/DocType;

    move-result-object v0

    return-object v0
.end method

.method public detach()Lorg/jdom2/DocType;
    .locals 1

    .line 304
    invoke-super {p0}, Lorg/jdom2/Content;->detach()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/DocType;

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lorg/jdom2/DocType;->elementName:Ljava/lang/String;

    return-object v0
.end method

.method public getInternalSubset()Ljava/lang/String;
    .locals 1

    .line 278
    iget-object v0, p0, Lorg/jdom2/DocType;->internalSubset:Ljava/lang/String;

    return-object v0
.end method

.method public getParent()Lorg/jdom2/Document;
    .locals 1

    .line 315
    invoke-super {p0}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Document;

    return-object v0
.end method

.method public bridge synthetic getParent()Lorg/jdom2/Parent;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lorg/jdom2/DocType;->getParent()Lorg/jdom2/Document;

    move-result-object v0

    return-object v0
.end method

.method public getPublicID()Ljava/lang/String;
    .locals 1

    .line 199
    iget-object v0, p0, Lorg/jdom2/DocType;->publicID:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemID()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lorg/jdom2/DocType;->systemID:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public setElementName(Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 3

    .line 183
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkXMLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 187
    iput-object p1, p0, Lorg/jdom2/DocType;->elementName:Ljava/lang/String;

    return-object p0

    .line 185
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalNameException;

    const-string v2, "DocType"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public setInternalSubset(Ljava/lang/String;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lorg/jdom2/DocType;->internalSubset:Ljava/lang/String;

    return-void
.end method

.method protected bridge synthetic setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;
    .locals 0

    .line 64
    invoke-virtual {p0, p1}, Lorg/jdom2/DocType;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/DocType;

    move-result-object p1

    return-object p1
.end method

.method protected setParent(Lorg/jdom2/Parent;)Lorg/jdom2/DocType;
    .locals 0

    .line 309
    invoke-super {p0, p1}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    move-result-object p1

    check-cast p1, Lorg/jdom2/DocType;

    return-object p1
.end method

.method public setPublicID(Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 3

    .line 212
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkPublicID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 216
    iput-object p1, p0, Lorg/jdom2/DocType;->publicID:Ljava/lang/String;

    return-object p0

    .line 214
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalDataException;

    const-string v2, "DocType"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public setSystemID(Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 3

    .line 243
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkSystemLiteral(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 247
    iput-object p1, p0, Lorg/jdom2/DocType;->systemID:Ljava/lang/String;

    return-object p0

    .line 245
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalDataException;

    const-string v2, "DocType"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 290
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[DocType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Lorg/jdom2/output/XMLOutputter;

    invoke-direct {v1}, Lorg/jdom2/output/XMLOutputter;-><init>()V

    invoke-virtual {v1, p0}, Lorg/jdom2/output/XMLOutputter;->outputString(Lorg/jdom2/DocType;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
