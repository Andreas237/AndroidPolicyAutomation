.class public Lorg/jsoup/examples/ListLinks;
.super Ljava/lang/Object;
.source "ListLinks.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 16
    array-length v2, p0

    if-ne v2, v1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "usage: supply url to fetch"

    invoke-static {v2, v3}, Lorg/jsoup/helper/Validate;->isTrue(ZLjava/lang/String;)V

    .line 17
    aget-object p0, p0, v0

    const-string v2, "Fetching %s..."

    .line 18
    new-array v3, v1, [Ljava/lang/Object;

    aput-object p0, v3, v0

    invoke-static {v2, v3}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    invoke-static {p0}, Lorg/jsoup/Jsoup;->connect(Ljava/lang/String;)Lorg/jsoup/Connection;

    move-result-object p0

    invoke-interface {p0}, Lorg/jsoup/Connection;->get()Lorg/jsoup/nodes/Document;

    move-result-object p0

    const-string v2, "a[href]"

    .line 21
    invoke-virtual {p0, v2}, Lorg/jsoup/nodes/Document;->select(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v2

    const-string v3, "[src]"

    .line 22
    invoke-virtual {p0, v3}, Lorg/jsoup/nodes/Document;->select(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v3

    const-string v4, "link[href]"

    .line 23
    invoke-virtual {p0, v4}, Lorg/jsoup/nodes/Document;->select(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object p0

    const-string v4, "\nMedia: (%d)"

    .line 25
    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lorg/jsoup/select/Elements;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    invoke-static {v4, v5}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-virtual {v3}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jsoup/nodes/Element;

    .line 27
    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "img"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v7, " * %s: <%s> %sx%s (%s)"

    const/4 v8, 0x5

    .line 28
    new-array v8, v8, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v0

    const-string v9, "abs:src"

    invoke-virtual {v4, v9}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v1

    const-string v9, "width"

    invoke-virtual {v4, v9}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    const-string v6, "height"

    invoke-virtual {v4, v6}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v5

    const/4 v5, 0x4

    const-string v6, "alt"

    invoke-virtual {v4, v6}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x14

    invoke-static {v4, v6}, Lorg/jsoup/examples/ListLinks;->trim(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v8, v5

    invoke-static {v7, v8}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    const-string v5, " * %s: <%s>"

    .line 32
    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    const-string v7, "abs:src"

    invoke-virtual {v4, v7}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, v1

    invoke-static {v5, v6}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const-string v3, "\nImports: (%d)"

    .line 35
    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lorg/jsoup/select/Elements;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v4, v0

    invoke-static {v3, v4}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-virtual {p0}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jsoup/nodes/Element;

    const-string v4, " * %s <%s> (%s)"

    .line 37
    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v0

    const-string v8, "abs:href"

    invoke-virtual {v3, v8}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v1

    const-string v8, "rel"

    invoke-virtual {v3, v8}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v7, v6

    invoke-static {v4, v7}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const-string p0, "\nLinks: (%d)"

    .line 40
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/jsoup/select/Elements;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {p0, v3}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    invoke-virtual {v2}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jsoup/nodes/Element;

    const-string v3, " * a: <%s>  (%s)"

    .line 42
    new-array v4, v6, [Ljava/lang/Object;

    const-string v5, "abs:href"

    invoke-virtual {v2, v5}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {v2}, Lorg/jsoup/nodes/Element;->text()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x23

    invoke-static {v2, v5}, Lorg/jsoup/examples/ListLinks;->trim(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Lorg/jsoup/examples/ListLinks;->print(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    return-void
.end method

.method private static varargs print(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 47
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method private static trim(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 51
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method
