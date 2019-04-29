.class public Lorg/jsoup/nodes/DocumentType;
.super Lorg/jsoup/nodes/Node;
.source "DocumentType.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0, p4}, Lorg/jsoup/nodes/Node;-><init>(Ljava/lang/String;)V

    const-string p4, "name"

    .line 22
    invoke-virtual {p0, p4, p1}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Node;

    const-string p1, "publicId"

    .line 23
    invoke-virtual {p0, p1, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Node;

    const-string p1, "systemId"

    .line 24
    invoke-virtual {p0, p1, p3}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Node;

    return-void
.end method


# virtual methods
.method public nodeName()Ljava/lang/String;
    .locals 1

    const-string v0, "#doctype"

    return-object v0
.end method

.method outerHtmlHead(Ljava/lang/StringBuilder;ILorg/jsoup/nodes/Document$OutputSettings;)V
    .locals 0

    const-string p2, "<!DOCTYPE"

    .line 34
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "name"

    .line 35
    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/jsoup/helper/StringUtil;->isBlank(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, " "

    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "name"

    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string p2, "publicId"

    .line 37
    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/jsoup/helper/StringUtil;->isBlank(Ljava/lang/String;)Z

    move-result p2

    const/16 p3, 0x22

    if-nez p2, :cond_1

    const-string p2, " PUBLIC \""

    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "publicId"

    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const-string p2, "systemId"

    .line 39
    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/jsoup/helper/StringUtil;->isBlank(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, " \""

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "systemId"

    invoke-virtual {p0, p2}, Lorg/jsoup/nodes/DocumentType;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    const/16 p2, 0x3e

    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method outerHtmlTail(Ljava/lang/StringBuilder;ILorg/jsoup/nodes/Document$OutputSettings;)V
    .locals 0

    return-void
.end method
