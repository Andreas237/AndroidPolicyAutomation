.class public Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE;
.super Lorg/jdom2/output/support/AbstractFormattedWalker;
.source "WalkerTRIM_FULL_WHITE.java"


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
    .locals 4

    move v0, p3

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    add-int v1, p2, v0

    .line 87
    invoke-virtual {p0, v1}, Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE;->get(I)Lorg/jdom2/Content;

    move-result-object v1

    .line 88
    instance-of v2, v1, Lorg/jdom2/Text;

    if-eqz v2, :cond_1

    .line 90
    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/jdom2/Verifier;->isAllXMLWhitespace(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    if-gez v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    add-int v1, p2, v0

    .line 104
    invoke-virtual {p0, v1}, Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE;->get(I)Lorg/jdom2/Content;

    move-result-object v1

    .line 105
    sget-object v2, Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE$1;->$SwitchMap$org$jdom2$Content$CType:[I

    invoke-virtual {v1}, Lorg/jdom2/Content;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v3

    invoke-virtual {v3}, Lorg/jdom2/Content$CType;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 116
    invoke-virtual {p1, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendRaw(Lorg/jdom2/Content;)V

    goto :goto_1

    .line 110
    :pswitch_0
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->NONE:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendCDATA(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V

    goto :goto_1

    .line 107
    :pswitch_1
    sget-object v2, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->NONE:Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;

    invoke-virtual {v1}, Lorg/jdom2/Content;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->appendText(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
