.class public Lorg/jdom2/output/support/WalkerTRIM;
.super Lorg/jdom2/output/support/AbstractFormattedWalker;
.source "WalkerTRIM.java"


# direct methods
.method public constructor <init>(Ljava/util/List;Lorg/jdom2/output/support/FormatStack;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;",
            "Lorg/jdom2/output/support/FormatStack;",
            "Z)V"
        }
    .end annotation

    .line 79
    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/output/support/AbstractFormattedWalker;-><init>(Ljava/util/List;Lorg/jdom2/output/support/FormatStack;Z)V

    return-void
.end method


# virtual methods
.method protected analyzeMultiText(Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;II)V
    .locals 6

    :goto_0
    if-lez p3, :cond_1

    .line 87
    invoke-virtual {p0, p2}, Lorg/jdom2/output/support/WalkerTRIM;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    .line 88
    instance-of v1, v0, Lorg/jdom2/Text;

    if-eqz v1, :cond_1

    .line 90
    invoke-virtual {v0}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x1

    if-lez p3, :cond_3

    add-int v1, p2, p3

    sub-int/2addr v1, v0

    .line 101
    invoke-virtual {p0, v1}, Lorg/jdom2/output/support/WalkerTRIM;->get(I)Lorg/jdom2/Content;

    move-result-object v1

    .line 102
    instance-of v2, v1, Lorg/jdom2/Text;

    if-eqz v2, :cond_3

    .line 104
    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_3
    :goto_2
    const/4 v1, 0x0

    :goto_3
    if-ge v1, p3, :cond_7

    .line 114
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->NONE:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    add-int/lit8 v3, v1, 0x1

    if-ne v3, p3, :cond_4

    .line 116
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->RIGHT:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    :cond_4
    if-nez v1, :cond_5

    .line 119
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->LEFT:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    :cond_5
    if-ne p3, v0, :cond_6

    .line 122
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->BOTH:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    :cond_6
    add-int/2addr v1, p2

    .line 124
    invoke-virtual {p0, v1}, Lorg/jdom2/output/support/WalkerTRIM;->get(I)Lorg/jdom2/Content;

    move-result-object v1

    .line 125
    sget-object v4, Lorg/jdom2/output/support/WalkerTRIM$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v1}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v5

    invoke-virtual {v5}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 136
    invoke-virtual {p1, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendRaw(Lorg/jdom2/Content;)V

    goto :goto_4

    .line 130
    :pswitch_0
    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendCDATA(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V

    goto :goto_4

    .line 127
    :pswitch_1
    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendText(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V

    :goto_4
    move v1, v3

    goto :goto_3

    :cond_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
