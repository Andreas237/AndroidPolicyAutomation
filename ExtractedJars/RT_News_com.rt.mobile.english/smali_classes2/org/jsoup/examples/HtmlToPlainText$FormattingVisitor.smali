.class Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;
.super Ljava/lang/Object;
.source "HtmlToPlainText.java"

# interfaces
.implements Lorg/jsoup/select/NodeVisitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jsoup/examples/HtmlToPlainText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FormattingVisitor"
.end annotation


# static fields
.field private static final maxWidth:I = 0x50


# instance fields
.field private accum:Ljava/lang/StringBuilder;

.field final synthetic this$0:Lorg/jsoup/examples/HtmlToPlainText;

.field private width:I


# direct methods
.method private constructor <init>(Lorg/jsoup/examples/HtmlToPlainText;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->this$0:Lorg/jsoup/examples/HtmlToPlainText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 53
    iput p1, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    return-void
.end method

.method synthetic constructor <init>(Lorg/jsoup/examples/HtmlToPlainText;Lorg/jsoup/examples/HtmlToPlainText$1;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;-><init>(Lorg/jsoup/examples/HtmlToPlainText;)V

    return-void
.end method

.method private append(Ljava/lang/String;)V
    .locals 7

    const-string v0, "\n"

    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 79
    iput v1, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    :cond_0
    const-string v0, " "

    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    iget-object v3, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, " "

    aput-object v4, v3, v1

    const-string v4, "\n"

    aput-object v4, v3, v2

    invoke-static {v0, v3}, Lorg/jsoup/helper/StringUtil;->in(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    return-void

    .line 84
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v3, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    add-int/2addr v0, v3

    const/16 v3, 0x50

    if-le v0, v3, :cond_6

    const-string v0, "\\s+"

    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    move v0, v1

    .line 86
    :goto_0
    array-length v4, p1

    if-ge v0, v4, :cond_7

    .line 87
    aget-object v4, p1, v0

    .line 88
    array-length v5, p1

    sub-int/2addr v5, v2

    if-ne v0, v5, :cond_3

    move v5, v2

    goto :goto_1

    :cond_3
    move v5, v1

    :goto_1
    if-nez v5, :cond_4

    .line 90
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 91
    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    iget v6, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    add-int/2addr v5, v6

    if-le v5, v3, :cond_5

    .line 92
    iget-object v5, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    iput v4, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    goto :goto_2

    .line 95
    :cond_5
    iget-object v5, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    iget v5, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v5, v4

    iput v5, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 100
    :cond_6
    iget-object v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->width:I

    :cond_7
    return-void
.end method


# virtual methods
.method public head(Lorg/jsoup/nodes/Node;I)V
    .locals 1

    .line 58
    invoke-virtual {p1}, Lorg/jsoup/nodes/Node;->nodeName()Ljava/lang/String;

    move-result-object p2

    .line 59
    instance-of v0, p1, Lorg/jsoup/nodes/TextNode;

    if-eqz v0, :cond_0

    .line 60
    check-cast p1, Lorg/jsoup/nodes/TextNode;

    invoke-virtual {p1}, Lorg/jsoup/nodes/TextNode;->text()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "li"

    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\n * "

    .line 62
    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->append(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public tail(Lorg/jsoup/nodes/Node;I)V
    .locals 5

    .line 67
    invoke-virtual {p1}, Lorg/jsoup/nodes/Node;->nodeName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "br"

    .line 68
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "\n"

    .line 69
    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    .line 70
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "p"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "h1"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v4, "h2"

    aput-object v4, v0, v1

    const/4 v1, 0x3

    const-string v4, "h3"

    aput-object v4, v0, v1

    const/4 v1, 0x4

    const-string v4, "h4"

    aput-object v4, v0, v1

    const/4 v1, 0x5

    const-string v4, "h5"

    aput-object v4, v0, v1

    invoke-static {p2, v0}, Lorg/jsoup/helper/StringUtil;->in(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "\n\n"

    .line 71
    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "a"

    .line 72
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, " <%s>"

    .line 73
    new-array v0, v3, [Ljava/lang/Object;

    const-string v1, "href"

    invoke-virtual {p1, v1}, Lorg/jsoup/nodes/Node;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->append(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->accum:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
