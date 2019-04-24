.class public abstract Lorg/jdom2/output/support/AbstractOutputProcessor;
.super Ljava/lang/Object;
.source "AbstractOutputProcessor.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected buildWalker(Lorg/jdom2/output/support/FormatStack;Ljava/util/List;Z)Lorg/jdom2/output/support/Walker;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/output/support/FormatStack;",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;Z)",
            "Lorg/jdom2/output/support/Walker;"
        }
    .end annotation

    .line 96
    sget-object v0, Lorg/jdom2/output/support/AbstractOutputProcessor$1;->$SwitchMap$org$jdom2$output$Format$TextMode:[I

    invoke-virtual {p1}, Lorg/jdom2/output/support/FormatStack;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jdom2/output/Format$TextMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 110
    new-instance p1, Lorg/jdom2/output/support/WalkerPRESERVE;

    invoke-direct {p1, p2}, Lorg/jdom2/output/support/WalkerPRESERVE;-><init>(Ljava/util/List;)V

    return-object p1

    .line 104
    :pswitch_0
    new-instance v0, Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE;

    invoke-direct {v0, p2, p1, p3}, Lorg/jdom2/output/support/WalkerTRIM_FULL_WHITE;-><init>(Ljava/util/List;Lorg/jdom2/output/support/FormatStack;Z)V

    return-object v0

    .line 102
    :pswitch_1
    new-instance v0, Lorg/jdom2/output/support/WalkerTRIM;

    invoke-direct {v0, p2, p1, p3}, Lorg/jdom2/output/support/WalkerTRIM;-><init>(Ljava/util/List;Lorg/jdom2/output/support/FormatStack;Z)V

    return-object v0

    .line 100
    :pswitch_2
    new-instance v0, Lorg/jdom2/output/support/WalkerNORMALIZE;

    invoke-direct {v0, p2, p1, p3}, Lorg/jdom2/output/support/WalkerNORMALIZE;-><init>(Ljava/util/List;Lorg/jdom2/output/support/FormatStack;Z)V

    return-object v0

    .line 98
    :pswitch_3
    new-instance p1, Lorg/jdom2/output/support/WalkerPRESERVE;

    invoke-direct {p1, p2}, Lorg/jdom2/output/support/WalkerPRESERVE;-><init>(Ljava/util/List;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
