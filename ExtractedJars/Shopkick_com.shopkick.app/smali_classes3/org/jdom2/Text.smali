.class public Lorg/jdom2/Text;
.super Lorg/jdom2/Content;
.source "Text.java"


# static fields
.field static final EMPTY_STRING:Ljava/lang/String; = ""

.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field protected value:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 98
    sget-object v0, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Text;-><init>(Lorg/jdom2/Content$CType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 111
    sget-object v0, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Text;-><init>(Lorg/jdom2/Content$CType;)V

    .line 112
    invoke-virtual {p0, p1}, Lorg/jdom2/Text;->setText(Ljava/lang/String;)Lorg/jdom2/Text;

    return-void
.end method

.method protected constructor <init>(Lorg/jdom2/Content$CType;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    return-void
.end method

.method public static normalizeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 161
    :cond_0
    invoke-static {p0}, Lorg/jdom2/output/Format;->compact(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public append(Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 203
    :cond_0
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 207
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    :cond_1
    return-void

    .line 204
    :cond_2
    new-instance v1, Lorg/jdom2/IllegalDataException;

    const-string v2, "character content"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public append(Lorg/jdom2/Text;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 222
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lorg/jdom2/Text;->clone()Lorg/jdom2/Text;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 68
    invoke-virtual {p0}, Lorg/jdom2/Text;->clone()Lorg/jdom2/Text;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/Content;
    .locals 1

    .line 68
    invoke-virtual {p0}, Lorg/jdom2/Text;->clone()Lorg/jdom2/Text;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/Text;
    .locals 2

    .line 257
    invoke-super {p0}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Text;

    .line 258
    iget-object v1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    iput-object v1, v0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic detach()Lorg/jdom2/Content;
    .locals 1

    .line 68
    invoke-virtual {p0}, Lorg/jdom2/Text;->detach()Lorg/jdom2/Text;

    move-result-object v0

    return-object v0
.end method

.method public detach()Lorg/jdom2/Text;
    .locals 1

    .line 264
    invoke-super {p0}, Lorg/jdom2/Content;->detach()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Text;

    return-object v0
.end method

.method public getParent()Lorg/jdom2/Element;
    .locals 1

    .line 275
    invoke-super {p0}, Lorg/jdom2/Content;->getParent()Lorg/jdom2/Parent;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Element;

    return-object v0
.end method

.method public bridge synthetic getParent()Lorg/jdom2/Parent;
    .locals 1

    .line 68
    invoke-virtual {p0}, Lorg/jdom2/Text;->getParent()Lorg/jdom2/Element;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object v0
.end method

.method public getTextNormalize()Ljava/lang/String;
    .locals 1

    .line 143
    invoke-virtual {p0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jdom2/Text;->normalizeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTextTrim()Ljava/lang/String;
    .locals 1

    .line 132
    invoke-virtual {p0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jdom2/output/Format;->trimBoth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object v0
.end method

.method protected bridge synthetic setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;
    .locals 0

    .line 68
    invoke-virtual {p0, p1}, Lorg/jdom2/Text;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Text;

    move-result-object p1

    return-object p1
.end method

.method protected setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Text;
    .locals 0

    .line 269
    invoke-super {p0, p1}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Text;

    return-object p1
.end method

.method public setText(Ljava/lang/String;)Lorg/jdom2/Text;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    .line 177
    iput-object p1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object p0

    .line 181
    :cond_0
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 184
    iput-object p1, p0, Lorg/jdom2/Text;->value:Ljava/lang/String;

    return-object p0

    .line 182
    :cond_1
    new-instance v1, Lorg/jdom2/IllegalDataException;

    const-string v2, "character content"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[Text: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
