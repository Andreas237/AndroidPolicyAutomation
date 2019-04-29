.class public Lorg/jsoup/examples/HtmlToPlainText;
.super Ljava/lang/Object;
.source "HtmlToPlainText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs main([Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 26
    array-length v2, p0

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "usage: supply url to fetch"

    invoke-static {v1, v2}, Lorg/jsoup/helper/Validate;->isTrue(ZLjava/lang/String;)V

    .line 27
    aget-object p0, p0, v0

    .line 30
    invoke-static {p0}, Lorg/jsoup/Jsoup;->connect(Ljava/lang/String;)Lorg/jsoup/Connection;

    move-result-object p0

    invoke-interface {p0}, Lorg/jsoup/Connection;->get()Lorg/jsoup/nodes/Document;

    move-result-object p0

    .line 32
    new-instance v0, Lorg/jsoup/examples/HtmlToPlainText;

    invoke-direct {v0}, Lorg/jsoup/examples/HtmlToPlainText;-><init>()V

    .line 33
    invoke-virtual {v0, p0}, Lorg/jsoup/examples/HtmlToPlainText;->getPlainText(Lorg/jsoup/nodes/Element;)Ljava/lang/String;

    move-result-object p0

    .line 34
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getPlainText(Lorg/jsoup/nodes/Element;)Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;-><init>(Lorg/jsoup/examples/HtmlToPlainText;Lorg/jsoup/examples/HtmlToPlainText$1;)V

    .line 44
    new-instance v1, Lorg/jsoup/select/NodeTraversor;

    invoke-direct {v1, v0}, Lorg/jsoup/select/NodeTraversor;-><init>(Lorg/jsoup/select/NodeVisitor;)V

    .line 45
    invoke-virtual {v1, p1}, Lorg/jsoup/select/NodeTraversor;->traverse(Lorg/jsoup/nodes/Node;)V

    .line 47
    invoke-virtual {v0}, Lorg/jsoup/examples/HtmlToPlainText$FormattingVisitor;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
