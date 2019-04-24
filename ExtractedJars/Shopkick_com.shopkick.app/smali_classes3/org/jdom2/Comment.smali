.class public Lorg/jdom2/Comment;
.super Lorg/jdom2/Content;
.source "Comment.java"


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field protected text:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 79
    sget-object v0, Lorg/jdom2/Content$CType;->Comment:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 88
    sget-object v0, Lorg/jdom2/Content$CType;->Comment:Lorg/jdom2/Content$CType;

    invoke-direct {p0, v0}, Lorg/jdom2/Content;-><init>(Lorg/jdom2/Content$CType;)V

    .line 89
    invoke-virtual {p0, p1}, Lorg/jdom2/Comment;->setText(Ljava/lang/String;)Lorg/jdom2/Comment;

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

    .line 65
    invoke-virtual {p0}, Lorg/jdom2/Comment;->clone()Lorg/jdom2/Comment;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/CloneBase;
    .locals 1

    .line 65
    invoke-virtual {p0}, Lorg/jdom2/Comment;->clone()Lorg/jdom2/Comment;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/Comment;
    .locals 1

    .line 133
    invoke-super {p0}, Lorg/jdom2/Content;->clone()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Comment;

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/Content;
    .locals 1

    .line 65
    invoke-virtual {p0}, Lorg/jdom2/Comment;->clone()Lorg/jdom2/Comment;

    move-result-object v0

    return-object v0
.end method

.method public detach()Lorg/jdom2/Comment;
    .locals 1

    .line 138
    invoke-super {p0}, Lorg/jdom2/Content;->detach()Lorg/jdom2/Content;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Comment;

    return-object v0
.end method

.method public bridge synthetic detach()Lorg/jdom2/Content;
    .locals 1

    .line 65
    invoke-virtual {p0}, Lorg/jdom2/Comment;->detach()Lorg/jdom2/Comment;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lorg/jdom2/Comment;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lorg/jdom2/Comment;->text:Ljava/lang/String;

    return-object v0
.end method

.method protected setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Comment;
    .locals 0

    .line 143
    invoke-super {p0, p1}, Lorg/jdom2/Content;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Comment;

    return-object p1
.end method

.method protected bridge synthetic setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Content;
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lorg/jdom2/Comment;->setParent(Lorg/jdom2/Parent;)Lorg/jdom2/Comment;

    move-result-object p1

    return-object p1
.end method

.method public setText(Ljava/lang/String;)Lorg/jdom2/Comment;
    .locals 3

    .line 123
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkCommentData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 127
    iput-object p1, p0, Lorg/jdom2/Comment;->text:Ljava/lang/String;

    return-object p0

    .line 124
    :cond_0
    new-instance v1, Lorg/jdom2/IllegalDataException;

    const-string v2, "comment"

    invoke-direct {v1, p1, v2, v0}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Comment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Lorg/jdom2/output/XMLOutputter;

    invoke-direct {v1}, Lorg/jdom2/output/XMLOutputter;-><init>()V

    invoke-virtual {v1, p0}, Lorg/jdom2/output/XMLOutputter;->outputString(Lorg/jdom2/Comment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
