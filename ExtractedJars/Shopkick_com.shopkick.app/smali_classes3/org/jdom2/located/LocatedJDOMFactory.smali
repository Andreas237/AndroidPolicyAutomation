.class public Lorg/jdom2/located/LocatedJDOMFactory;
.super Lorg/jdom2/DefaultJDOMFactory;
.source "LocatedJDOMFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 82
    invoke-direct {p0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public cdata(IILjava/lang/String;)Lorg/jdom2/CDATA;
    .locals 1

    .line 86
    new-instance v0, Lorg/jdom2/located/LocatedCDATA;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedCDATA;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedCDATA;->setLine(I)V

    .line 88
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedCDATA;->setColumn(I)V

    return-object v0
.end method

.method public comment(IILjava/lang/String;)Lorg/jdom2/Comment;
    .locals 1

    .line 102
    new-instance v0, Lorg/jdom2/located/LocatedComment;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedComment;-><init>(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedComment;->setLine(I)V

    .line 104
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedComment;->setColumn(I)V

    return-object v0
.end method

.method public docType(IILjava/lang/String;)Lorg/jdom2/DocType;
    .locals 1

    .line 128
    new-instance v0, Lorg/jdom2/located/LocatedDocType;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedDocType;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedDocType;->setLine(I)V

    .line 130
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedDocType;->setColumn(I)V

    return-object v0
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 1

    .line 120
    new-instance v0, Lorg/jdom2/located/LocatedDocType;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedDocType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedDocType;->setLine(I)V

    .line 122
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedDocType;->setColumn(I)V

    return-object v0
.end method

.method public docType(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;
    .locals 1

    .line 111
    new-instance v0, Lorg/jdom2/located/LocatedDocType;

    invoke-direct {v0, p3, p4, p5}, Lorg/jdom2/located/LocatedDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedDocType;->setLine(I)V

    .line 113
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedDocType;->setColumn(I)V

    return-object v0
.end method

.method public element(IILjava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 144
    new-instance v0, Lorg/jdom2/located/LocatedElement;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedElement;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedElement;->setLine(I)V

    .line 146
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedElement;->setColumn(I)V

    return-object v0
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 152
    new-instance v0, Lorg/jdom2/located/LocatedElement;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedElement;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedElement;->setLine(I)V

    .line 154
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedElement;->setColumn(I)V

    return-object v0
.end method

.method public element(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Element;
    .locals 1

    .line 161
    new-instance v0, Lorg/jdom2/located/LocatedElement;

    invoke-direct {v0, p3, p4, p5}, Lorg/jdom2/located/LocatedElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedElement;->setLine(I)V

    .line 163
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedElement;->setColumn(I)V

    return-object v0
.end method

.method public element(IILjava/lang/String;Lorg/jdom2/Namespace;)Lorg/jdom2/Element;
    .locals 1

    .line 136
    new-instance v0, Lorg/jdom2/located/LocatedElement;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedElement;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    .line 137
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedElement;->setLine(I)V

    .line 138
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedElement;->setColumn(I)V

    return-object v0
.end method

.method public entityRef(IILjava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 1

    .line 196
    new-instance v0, Lorg/jdom2/located/LocatedEntityRef;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedEntityRef;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedEntityRef;->setLine(I)V

    .line 198
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedEntityRef;->setColumn(I)V

    return-object v0
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 1

    .line 213
    new-instance v0, Lorg/jdom2/located/LocatedEntityRef;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedEntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedEntityRef;->setLine(I)V

    .line 215
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedEntityRef;->setColumn(I)V

    return-object v0
.end method

.method public entityRef(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/EntityRef;
    .locals 1

    .line 205
    new-instance v0, Lorg/jdom2/located/LocatedEntityRef;

    invoke-direct {v0, p3, p4, p5}, Lorg/jdom2/located/LocatedEntityRef;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedEntityRef;->setLine(I)V

    .line 207
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedEntityRef;->setColumn(I)V

    return-object v0
.end method

.method public processingInstruction(IILjava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 1

    .line 170
    new-instance v0, Lorg/jdom2/located/LocatedProcessingInstruction;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedProcessingInstruction;-><init>(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedProcessingInstruction;->setLine(I)V

    .line 172
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedProcessingInstruction;->setColumn(I)V

    return-object v0
.end method

.method public processingInstruction(IILjava/lang/String;Ljava/lang/String;)Lorg/jdom2/ProcessingInstruction;
    .locals 1

    .line 188
    new-instance v0, Lorg/jdom2/located/LocatedProcessingInstruction;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedProcessingInstruction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedProcessingInstruction;->setLine(I)V

    .line 190
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedProcessingInstruction;->setColumn(I)V

    return-object v0
.end method

.method public processingInstruction(IILjava/lang/String;Ljava/util/Map;)Lorg/jdom2/ProcessingInstruction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/jdom2/ProcessingInstruction;"
        }
    .end annotation

    .line 179
    new-instance v0, Lorg/jdom2/located/LocatedProcessingInstruction;

    invoke-direct {v0, p3, p4}, Lorg/jdom2/located/LocatedProcessingInstruction;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 180
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedProcessingInstruction;->setLine(I)V

    .line 181
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedProcessingInstruction;->setColumn(I)V

    return-object v0
.end method

.method public text(IILjava/lang/String;)Lorg/jdom2/Text;
    .locals 1

    .line 94
    new-instance v0, Lorg/jdom2/located/LocatedText;

    invoke-direct {v0, p3}, Lorg/jdom2/located/LocatedText;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v0, p1}, Lorg/jdom2/located/LocatedText;->setLine(I)V

    .line 96
    invoke-virtual {v0, p2}, Lorg/jdom2/located/LocatedText;->setColumn(I)V

    return-object v0
.end method
