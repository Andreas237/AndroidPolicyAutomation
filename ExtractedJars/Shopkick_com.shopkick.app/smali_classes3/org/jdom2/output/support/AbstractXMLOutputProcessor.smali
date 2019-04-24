.class public abstract Lorg/jdom2/output/support/AbstractXMLOutputProcessor;
.super Lorg/jdom2/output/support/AbstractOutputProcessor;
.source "AbstractXMLOutputProcessor.java"

# interfaces
.implements Lorg/jdom2/output/support/XMLOutputProcessor;


# static fields
.field protected static final CDATAPOST:Ljava/lang/String; = "]]>"

.field protected static final CDATAPRE:Ljava/lang/String; = "<![CDATA["


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractOutputProcessor;-><init>()V

    return-void
.end method


# virtual methods
.method protected attributeEscapedEntitiesFilter(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 395
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEscapeOutput()Z

    move-result v0

    if-nez v0, :cond_0

    .line 397
    invoke-virtual {p0, p1, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void

    .line 401
    :cond_0
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;

    move-result-object p2

    invoke-static {p2, p3}, Lorg/jdom2/output/Format;->escapeAttribute(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printAttribute(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Attribute;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1007
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->isSpecified()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isSpecifiedAttributesOnly()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, " "

    .line 1010
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 1011
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, "="

    .line 1012
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, "\""

    .line 1014
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 1015
    invoke-virtual {p3}, Lorg/jdom2/Attribute;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->attributeEscapedEntitiesFilter(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Ljava/lang/String;)V

    const-string p2, "\""

    .line 1016
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printCDATA(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/CDATA;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 748
    invoke-virtual {p3}, Lorg/jdom2/CDATA;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textCDATA(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printComment(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string p2, "<!--"

    .line 710
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 711
    invoke-virtual {p3}, Lorg/jdom2/Comment;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, "-->"

    .line 712
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printContent(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 924
    :goto_0
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 925
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_1

    .line 928
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v0

    .line 929
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 930
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textCDATA(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_0

    .line 932
    :cond_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_0

    .line 935
    :cond_1
    sget-object v1, Lorg/jdom2/output/support/AbstractXMLOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 949
    :pswitch_0
    check-cast v0, Lorg/jdom2/EntityRef;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printEntityRef(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V

    goto :goto_0

    .line 937
    :pswitch_1
    check-cast v0, Lorg/jdom2/CDATA;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printCDATA(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/CDATA;)V

    goto :goto_0

    .line 956
    :pswitch_2
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printText(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V

    goto :goto_0

    .line 952
    :pswitch_3
    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printProcessingInstruction(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_0

    .line 946
    :pswitch_4
    check-cast v0, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printElement(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    goto :goto_0

    .line 943
    :pswitch_5
    check-cast v0, Lorg/jdom2/DocType;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printDocType(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V

    goto :goto_0

    .line 940
    :pswitch_6
    check-cast v0, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printComment(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V

    goto :goto_0

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printDeclaration(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 575
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isOmitDeclaration()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 582
    :cond_0
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isOmitEncoding()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "<?xml version=\"1.0\"?>"

    .line 583
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "<?xml version=\"1.0\""

    .line 585
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, " encoding=\""

    .line 586
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 587
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEncoding()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, "\"?>"

    .line 588
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 595
    :goto_0
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printDocType(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 613
    invoke-virtual {p3}, Lorg/jdom2/DocType;->getPublicID()Ljava/lang/String;

    move-result-object v0

    .line 614
    invoke-virtual {p3}, Lorg/jdom2/DocType;->getSystemID()Ljava/lang/String;

    move-result-object v1

    .line 615
    invoke-virtual {p3}, Lorg/jdom2/DocType;->getInternalSubset()Ljava/lang/String;

    move-result-object v2

    const-string v3, "<!DOCTYPE "

    .line 621
    invoke-virtual {p0, p1, v3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 622
    invoke-virtual {p3}, Lorg/jdom2/DocType;->getElementName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1, v3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    const-string v3, " PUBLIC \""

    .line 624
    invoke-virtual {p0, p1, v3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 625
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, "\""

    .line 626
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    const-string v0, " SYSTEM"

    .line 631
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_1
    const-string v0, " \""

    .line 633
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 634
    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v0, "\""

    .line 635
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_2
    if-eqz v2, :cond_3

    const-string v0, ""

    .line 637
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, " ["

    .line 638
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 639
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 640
    invoke-virtual {p3}, Lorg/jdom2/DocType;->getInternalSubset()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, "]"

    .line 641
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_3
    const-string p2, ">"

    .line 643
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printDocument(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Document;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 496
    invoke-virtual {p4}, Lorg/jdom2/Document;->hasRootElement()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Lorg/jdom2/Document;->getContent()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p4}, Lorg/jdom2/Document;->getContentSize()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 498
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 499
    invoke-virtual {p4}, Lorg/jdom2/Document;->getContentSize()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    .line 501
    invoke-virtual {p4, v2}, Lorg/jdom2/Document;->getContent(I)Lorg/jdom2/Content;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 505
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printDeclaration(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;)V

    const/4 p4, 0x1

    .line 507
    invoke-virtual {p0, p2, v0, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p4

    .line 508
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 509
    :cond_2
    :goto_2
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 511
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->next()Lorg/jdom2/Content;

    move-result-object v0

    if-nez v0, :cond_3

    .line 516
    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->text()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 517
    invoke-static {v0}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p4}, Lorg/jdom2/output/support/Walker;->isCDATA()Z

    move-result v1

    if-nez v1, :cond_2

    .line 522
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_2

    .line 525
    :cond_3
    sget-object v1, Lorg/jdom2/output/support/AbstractXMLOutputProcessor$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v0}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_2

    .line 540
    :pswitch_0
    check-cast v0, Lorg/jdom2/Text;

    invoke-virtual {v0}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 541
    invoke-static {v0}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 545
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_2

    .line 536
    :pswitch_1
    check-cast v0, Lorg/jdom2/ProcessingInstruction;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printProcessingInstruction(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V

    goto :goto_2

    .line 533
    :pswitch_2
    check-cast v0, Lorg/jdom2/Element;

    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printElement(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    goto :goto_2

    .line 530
    :pswitch_3
    check-cast v0, Lorg/jdom2/DocType;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printDocType(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V

    goto :goto_2

    .line 527
    :pswitch_4
    check-cast v0, Lorg/jdom2/Comment;

    invoke-virtual {p0, p1, p2, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printComment(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V

    goto :goto_2

    .line 554
    :cond_4
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_5

    .line 555
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected printElement(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 794
    invoke-virtual {p3, p4}, Lorg/jdom2/util/NamespaceStack;->push(Lorg/jdom2/Element;)V

    .line 796
    :try_start_0
    invoke-virtual {p4}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object v0

    const-string v1, "<"

    .line 800
    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 802
    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 805
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->addedForward()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Namespace;

    .line 806
    invoke-virtual {p0, p1, p2, v2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printNamespace(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Namespace;)V

    goto :goto_0

    .line 810
    :cond_0
    invoke-virtual {p4}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 811
    invoke-virtual {p4}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jdom2/Attribute;

    .line 812
    invoke-virtual {p0, p1, p2, v2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printAttribute(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Attribute;)V

    goto :goto_1

    .line 816
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 818
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isExpandEmptyElements()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "></"

    .line 819
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 820
    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, ">"

    .line 821
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    const-string p2, " />"

    .line 824
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 885
    :goto_2
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    return-void

    .line 831
    :cond_3
    :try_start_1
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->push()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    const-string v1, "space"

    .line 835
    sget-object v2, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {p4, v1, v2}, Lorg/jdom2/Element;->getAttributeValue(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "default"

    .line 838
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 839
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getDefaultMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v1

    invoke-virtual {p2, v1}, Lorg/jdom2/output/support/FormatStack;->setTextMode(Lorg/jdom2/output/Format$TextMode;)V

    goto :goto_3

    :cond_4
    const-string v2, "preserve"

    .line 841
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 842
    sget-object v1, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {p2, v1}, Lorg/jdom2/output/support/FormatStack;->setTextMode(Lorg/jdom2/output/Format$TextMode;)V

    :cond_5
    :goto_3
    const/4 v1, 0x1

    .line 846
    invoke-virtual {p0, p2, v0, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object v0

    .line 848
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result v1

    if-nez v1, :cond_7

    .line 850
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isExpandEmptyElements()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "></"

    .line 851
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 852
    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p1, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p4, ">"

    .line 853
    invoke-virtual {p0, p1, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    const-string p4, " />"

    .line 856
    invoke-virtual {p0, p1, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 885
    :goto_4
    :try_start_3
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    return-void

    :cond_7
    :try_start_4
    const-string v1, ">"

    .line 862
    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 863
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v1

    if-nez v1, :cond_8

    .line 865
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadBetween()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    .line 868
    :cond_8
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printContent(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 870
    invoke-interface {v0}, Lorg/jdom2/output/support/Walker;->isAllText()Z

    move-result v0

    if-nez v0, :cond_9

    .line 872
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getPadLast()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_9
    const-string v0, "</"

    .line 874
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 875
    invoke-virtual {p4}, Lorg/jdom2/Element;->getQualifiedName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p1, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p4, ">"

    .line 876
    invoke-virtual {p0, p1, p4}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 885
    :try_start_5
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_6
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->pop()V

    .line 879
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    .line 885
    invoke-virtual {p3}, Lorg/jdom2/util/NamespaceStack;->pop()V

    .line 882
    throw p1
.end method

.method protected printEntityRef(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 730
    invoke-virtual {p3}, Lorg/jdom2/EntityRef;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textEntityRef(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printNamespace(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Namespace;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 979
    invoke-virtual {p3}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v0

    .line 980
    invoke-virtual {p3}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p3

    const-string v1, " xmlns"

    .line 982
    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string v1, ""

    .line 983
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ":"

    .line 984
    invoke-virtual {p0, p1, v1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 985
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_0
    const-string v0, "=\""

    .line 987
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 988
    invoke-virtual {p0, p1, p2, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->attributeEscapedEntitiesFilter(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Ljava/lang/String;)V

    const-string p2, "\""

    .line 989
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected printProcessingInstruction(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 662
    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getTarget()Ljava/lang/String;

    move-result-object v0

    .line 665
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->isIgnoreTrAXEscapingPIs()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    const-string v1, "javax.xml.transform.disable-output-escaping"

    .line 666
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 668
    invoke-virtual {p2, v2}, Lorg/jdom2/output/support/FormatStack;->setEscapeOutput(Z)V

    goto :goto_0

    :cond_0
    const-string v1, "javax.xml.transform.enable-output-escaping"

    .line 671
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 673
    invoke-virtual {p2, v3}, Lorg/jdom2/output/support/FormatStack;->setEscapeOutput(Z)V

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    if-nez v3, :cond_3

    .line 678
    invoke-virtual {p3}, Lorg/jdom2/ProcessingInstruction;->getData()Ljava/lang/String;

    move-result-object p2

    const-string p3, ""

    .line 681
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "<?"

    .line 682
    invoke-virtual {p0, p1, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 683
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p3, " "

    .line 684
    invoke-virtual {p0, p1, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 685
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, "?>"

    .line 686
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string p2, "<?"

    .line 689
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    .line 690
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, "?>"

    .line 691
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method protected printText(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Text;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 765
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEscapeOutput()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 766
    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    invoke-virtual {p2}, Lorg/jdom2/output/support/FormatStack;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p2, p3}, Lorg/jdom2/output/Format;->escapeText(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    return-void

    .line 771
    :cond_0
    invoke-virtual {p3}, Lorg/jdom2/Text;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Writer;",
            "Lorg/jdom2/output/Format;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 234
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x1

    .line 235
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 236
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printContent(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 237
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 250
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 251
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x1

    .line 252
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 253
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 254
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printContent(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 256
    :cond_0
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 287
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printComment(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/Comment;)V

    .line 288
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/DocType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 204
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printDocType(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/DocType;)V

    .line 205
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 191
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printDocument(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Document;)V

    .line 192
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 219
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    new-instance p2, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p2}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printElement(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/Element;)V

    .line 221
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 316
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printEntityRef(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/EntityRef;)V

    .line 317
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 300
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x1

    .line 302
    invoke-virtual {v0, p2}, Lorg/jdom2/output/support/FormatStack;->setIgnoreTrAXEscapingPIs(Z)V

    .line 303
    invoke-virtual {p0, p1, v0, p3}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printProcessingInstruction(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/ProcessingInstruction;)V

    .line 304
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    .line 270
    new-instance v0, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v0, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    const/4 p2, 0x1

    .line 271
    invoke-virtual {p0, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;

    move-result-object p2

    .line 272
    invoke-interface {p2}, Lorg/jdom2/output/support/Walker;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 273
    new-instance p3, Lorg/jdom2/util/NamespaceStack;

    invoke-direct {p3}, Lorg/jdom2/util/NamespaceStack;-><init>()V

    invoke-virtual {p0, p1, v0, p3, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->printContent(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Lorg/jdom2/util/NamespaceStack;Lorg/jdom2/output/support/Walker;)V

    .line 275
    :cond_0
    invoke-virtual {p1}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method protected textCDATA(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<![CDATA["

    .line 462
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    .line 463
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    const-string p2, "]]>"

    .line 464
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected textEntityRef(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x26

    .line 450
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;C)V

    .line 451
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;Ljava/lang/String;)V

    const/16 p2, 0x3b

    .line 452
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->textRaw(Ljava/io/Writer;C)V

    return-void
.end method

.method protected textRaw(Ljava/io/Writer;C)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 436
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;C)V

    return-void
.end method

.method protected textRaw(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 419
    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->write(Ljava/io/Writer;Ljava/lang/String;)V

    return-void
.end method

.method protected write(Ljava/io/Writer;C)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 356
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method protected write(Ljava/io/Writer;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 342
    :cond_0
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method
