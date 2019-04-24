.class public final Lorg/jdom2/output/XMLOutputter;
.super Ljava/lang/Object;
.source "XMLOutputter.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;
    }
.end annotation


# static fields
.field private static final DEFAULTPROCESSOR:Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;


# instance fields
.field private myFormat:Lorg/jdom2/output/Format;

.field private myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 226
    new-instance v0, Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;-><init>(Lorg/jdom2/output/XMLOutputter$1;)V

    sput-object v0, Lorg/jdom2/output/XMLOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 275
    invoke-direct {p0, v0, v0}, Lorg/jdom2/output/XMLOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/XMLOutputProcessor;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/Format;)V
    .locals 1

    const/4 v0, 0x0

    .line 305
    invoke-direct {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/XMLOutputProcessor;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/XMLOutputProcessor;)V
    .locals 1

    .line 265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 236
    iput-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    .line 239
    iput-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    if-nez p1, :cond_0

    .line 266
    invoke-static {}, Lorg/jdom2/output/Format;->getRawFormat()Lorg/jdom2/output/Format;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->clone()Lorg/jdom2/output/Format;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    if-nez p2, :cond_1

    .line 267
    sget-object p2, Lorg/jdom2/output/XMLOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;

    :cond_1
    iput-object p2, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/XMLOutputter;)V
    .locals 1

    .line 288
    iget-object p1, p1, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/XMLOutputProcessor;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/output/support/XMLOutputProcessor;)V
    .locals 1

    const/4 v0, 0x0

    .line 317
    invoke-direct {p0, v0, p1}, Lorg/jdom2/output/XMLOutputter;-><init>(Lorg/jdom2/output/Format;Lorg/jdom2/output/support/XMLOutputProcessor;)V

    return-void
.end method

.method private static final makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 168
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-direct {v2, p0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getEncoding()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v2, p0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 147
    invoke-virtual {p0}, Lorg/jdom2/output/XMLOutputter;->clone()Lorg/jdom2/output/XMLOutputter;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/output/XMLOutputter;
    .locals 2

    .line 1039
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/output/XMLOutputter;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1045
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public escapeAttributeEntities(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1007
    sget-object v0, Lorg/jdom2/output/XMLOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-virtual {v0, p1, v1}, Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;->escapeAttributeEntities(Ljava/lang/String;Lorg/jdom2/output/Format;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public escapeElementEntities(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1019
    sget-object v0, Lorg/jdom2/output/XMLOutputter;->DEFAULTPROCESSOR:Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-virtual {v0, p1, v1}, Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;->escapeElementEntities(Ljava/lang/String;Lorg/jdom2/output/Format;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getFormat()Lorg/jdom2/output/Format;
    .locals 1

    .line 347
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public getXMLOutputProcessor()Lorg/jdom2/output/support/XMLOutputProcessor;
    .locals 1

    .line 357
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    return-object v0
.end method

.method public final output(Ljava/util/List;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;",
            "Ljava/io/OutputStream;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 474
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Ljava/util/List;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Ljava/util/List;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;",
            "Ljava/io/Writer;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 901
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Ljava/util/List;)V

    .line 902
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/CDATA;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 490
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/CDATA;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/CDATA;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 918
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/CDATA;)V

    .line 919
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/Comment;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 523
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Comment;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Comment;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 953
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Comment;)V

    .line 954
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/DocType;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/DocType;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/DocType;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 839
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/DocType;)V

    .line 840
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/Document;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Document;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Document;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 822
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Document;)V

    .line 823
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/Element;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 428
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Element;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Element;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 859
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Element;)V

    .line 860
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public output(Lorg/jdom2/EntityRef;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 556
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/EntityRef;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/EntityRef;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 988
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/EntityRef;)V

    .line 989
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/ProcessingInstruction;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 540
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/ProcessingInstruction;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/ProcessingInstruction;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 971
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/ProcessingInstruction;)V

    .line 972
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final output(Lorg/jdom2/Text;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 507
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Text;Ljava/io/Writer;)V

    return-void
.end method

.method public final output(Lorg/jdom2/Text;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 936
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Lorg/jdom2/Text;)V

    .line 937
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final outputElementContent(Lorg/jdom2/Element;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-static {p2, v0}, Lorg/jdom2/output/XMLOutputter;->makeWriter(Ljava/io/OutputStream;Lorg/jdom2/output/Format;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/output/XMLOutputter;->outputElementContent(Lorg/jdom2/Element;Ljava/io/Writer;)V

    return-void
.end method

.method public final outputElementContent(Lorg/jdom2/Element;Ljava/io/Writer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 881
    iget-object v0, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    invoke-virtual {p1}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p2, v1, p1}, Lorg/jdom2/output/support/XMLOutputProcessor;->process(Ljava/io/Writer;Lorg/jdom2/output/Format;Ljava/util/List;)V

    .line 882
    invoke-virtual {p2}, Ljava/io/Writer;->flush()V

    return-void
.end method

.method public final outputElementContentString(Lorg/jdom2/Element;)Ljava/lang/String;
    .locals 1

    .line 787
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 789
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->outputElementContent(Lorg/jdom2/Element;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 651
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 653
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Ljava/util/List;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 657
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/CDATA;)Ljava/lang/String;
    .locals 1

    .line 673
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 675
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/CDATA;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 679
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/Comment;)Ljava/lang/String;
    .locals 1

    .line 717
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 719
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Comment;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 723
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/DocType;)Ljava/lang/String;
    .locals 1

    .line 602
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 604
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/DocType;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 608
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/Document;)Ljava/lang/String;
    .locals 1

    .line 580
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 582
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Document;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 586
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/Element;)Ljava/lang/String;
    .locals 1

    .line 624
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 626
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Element;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 630
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/EntityRef;)Ljava/lang/String;
    .locals 1

    .line 761
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 763
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/EntityRef;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 767
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/ProcessingInstruction;)Ljava/lang/String;
    .locals 1

    .line 739
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 741
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/ProcessingInstruction;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 745
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final outputString(Lorg/jdom2/Text;)Ljava/lang/String;
    .locals 1

    .line 695
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 697
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lorg/jdom2/output/XMLOutputter;->output(Lorg/jdom2/Text;Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 701
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public setFormat(Lorg/jdom2/output/Format;)V
    .locals 0

    .line 335
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->clone()Lorg/jdom2/output/Format;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    return-void
.end method

.method public setXMLOutputProcessor(Lorg/jdom2/output/support/XMLOutputProcessor;)V
    .locals 0

    .line 368
    iput-object p1, p0, Lorg/jdom2/output/XMLOutputter;->myProcessor:Lorg/jdom2/output/support/XMLOutputProcessor;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1056
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "XMLOutputter[omitDeclaration = "

    .line 1057
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1058
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->omitDeclaration:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 1059
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "encoding = "

    .line 1060
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1061
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->encoding:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 1062
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "omitEncoding = "

    .line 1063
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1064
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->omitEncoding:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 1065
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "indent = \'"

    .line 1066
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1067
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->indent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    .line 1068
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 1069
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "expandEmptyElements = "

    .line 1070
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-boolean v1, v1, Lorg/jdom2/output/Format;->expandEmptyElements:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 1072
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "lineSeparator = \'"

    .line 1073
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    iget-object v1, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v1, v1, Lorg/jdom2/output/Format;->lineSeparator:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-char v4, v1, v3

    const/16 v5, 0xd

    if-eq v4, v5, :cond_0

    packed-switch v4, :pswitch_data_0

    .line 1086
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v4, "\\n"

    .line 1080
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v4, "\\t"

    .line 1083
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v4, "\\r"

    .line 1077
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "\', "

    .line 1090
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "textMode = "

    .line 1091
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/jdom2/output/XMLOutputter;->myFormat:Lorg/jdom2/output/Format;

    iget-object v2, v2, Lorg/jdom2/output/Format;->mode:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1093
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
