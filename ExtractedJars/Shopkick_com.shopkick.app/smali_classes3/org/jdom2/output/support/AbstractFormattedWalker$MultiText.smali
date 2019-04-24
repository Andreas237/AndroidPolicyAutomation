.class public final Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;
.super Ljava/lang/Object;
.source "AbstractFormattedWalker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/AbstractFormattedWalker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "MultiText"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;


# direct methods
.method private constructor <init>(Lorg/jdom2/output/support/AbstractFormattedWalker;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/output/support/AbstractFormattedWalker;Lorg/jdom2/output/support/AbstractFormattedWalker$1;)V
    .locals 0

    .line 141
    invoke-direct {p0, p1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;-><init>(Lorg/jdom2/output/support/AbstractFormattedWalker;)V

    return-void
.end method

.method static synthetic access$1200(Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;Ljava/lang/String;)V
    .locals 0

    .line 141
    invoke-direct {p0, p1}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->forceAppend(Ljava/lang/String;)V

    return-void
.end method

.method private closeText()V
    .locals 3

    .line 166
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 170
    :cond_0
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->ensurespace()V

    .line 171
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 172
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$200(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$008(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v1

    iget-object v2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 173
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method private ensurespace()V
    .locals 4

    .line 154
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 155
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v3}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lorg/jdom2/Content;

    invoke-static {v0, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$102(Lorg/jdom2/output/support/AbstractFormattedWalker;[Lorg/jdom2/Content;)[Lorg/jdom2/Content;

    .line 156
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$200(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object v2

    array-length v2, v2

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$202(Lorg/jdom2/output/support/AbstractFormattedWalker;[Ljava/lang/String;)[Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private escapeCDATA(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$500(Lorg/jdom2/output/support/AbstractFormattedWalker;)Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object p1
.end method

.method private escapeText(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 216
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$500(Lorg/jdom2/output/support/AbstractFormattedWalker;)Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$600(Lorg/jdom2/output/support/AbstractFormattedWalker;)Lorg/jdom2/output/support/FormatStack;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jdom2/output/support/FormatStack;->getEscapeOutput()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 219
    :cond_0
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$500(Lorg/jdom2/output/support/AbstractFormattedWalker;)Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$700(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lorg/jdom2/output/Format;->escapeText(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method private forceAppend(Ljava/lang/String;)V
    .locals 2

    .line 272
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$402(Lorg/jdom2/output/support/AbstractFormattedWalker;Z)Z

    .line 273
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public appendCDATA(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V
    .locals 2

    .line 236
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->closeText()V

    .line 238
    sget-object v0, Lorg/jdom2/output/support/AbstractFormattedWalker$2;->$SwitchMap$org$jdom2$output$support$AbstractFormattedWalker$Trim:[I

    invoke-virtual {p1}, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 252
    :pswitch_0
    invoke-static {p2}, Lorg/jdom2/output/Format;->compact(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 249
    :pswitch_1
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 246
    :pswitch_2
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimLeft(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 243
    :pswitch_3
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimBoth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 256
    :goto_0
    :pswitch_4
    invoke-direct {p0, p2}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->escapeCDATA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 257
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->ensurespace()V

    .line 259
    iget-object p2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {p2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object p2

    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v0

    invoke-static {}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$800()Lorg/jdom2/CDATA;

    move-result-object v1

    aput-object v1, p2, v0

    .line 260
    iget-object p2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {p2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$200(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$008(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v0

    aput-object p1, p2, v0

    .line 262
    iget-object p1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$402(Lorg/jdom2/output/support/AbstractFormattedWalker;Z)Z

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

.method public appendRaw(Lorg/jdom2/Content;)V
    .locals 3

    .line 282
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->closeText()V

    .line 283
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->ensurespace()V

    .line 284
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$200(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$000(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 285
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$100(Lorg/jdom2/output/support/AbstractFormattedWalker;)[Lorg/jdom2/Content;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$008(Lorg/jdom2/output/support/AbstractFormattedWalker;)I

    move-result v1

    aput-object p1, v0, v1

    .line 286
    iget-object p1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {p1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method public appendText(Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;Ljava/lang/String;)V
    .locals 2

    .line 186
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 191
    sget-object v1, Lorg/jdom2/output/support/AbstractFormattedWalker$2;->$SwitchMap$org$jdom2$output$support$AbstractFormattedWalker$Trim:[I

    invoke-virtual {p1}, Lorg/jdom2/output/support/AbstractFormattedWalker$Trim;->ordinal()I

    move-result p1

    aget p1, v1, p1

    packed-switch p1, :pswitch_data_0

    move-object p2, v0

    goto :goto_0

    .line 205
    :pswitch_0
    invoke-static {p2}, Lorg/jdom2/output/Format;->compact(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 202
    :pswitch_1
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimRight(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 199
    :pswitch_2
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimLeft(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 196
    :pswitch_3
    invoke-static {p2}, Lorg/jdom2/output/Format;->trimBoth(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    :pswitch_4
    if-eqz p2, :cond_1

    .line 209
    invoke-direct {p0, p2}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->escapeText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 210
    iget-object p2, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {p2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    iget-object p1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$402(Lorg/jdom2/output/support/AbstractFormattedWalker;Z)Z

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public done()V
    .locals 2

    .line 295
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$900(Lorg/jdom2/output/support/AbstractFormattedWalker;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$1000(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v1}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$1000(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    :cond_0
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$400(Lorg/jdom2/output/support/AbstractFormattedWalker;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 300
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->closeText()V

    .line 302
    :cond_1
    iget-object v0, p0, Lorg/jdom2/output/support/AbstractFormattedWalker$MultiText;->this$0:Lorg/jdom2/output/support/AbstractFormattedWalker;

    invoke-static {v0}, Lorg/jdom2/output/support/AbstractFormattedWalker;->access$300(Lorg/jdom2/output/support/AbstractFormattedWalker;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method
