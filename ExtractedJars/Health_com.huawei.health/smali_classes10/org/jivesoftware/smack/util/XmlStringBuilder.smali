.class public Lorg/jivesoftware/smack/util/XmlStringBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final RIGHT_ANGLE_BRACKET:Ljava/lang/String;


# instance fields
.field private final sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    .line 30
    const/16 v0, 0x3e

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->RIGHT_ANGLE_BRACKET:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 36
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/ExtensionElement;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 40
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->prelude(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 41
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/ExtensionElement;Ljava/lang/String;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 50
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    .line 51
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    goto :goto_0

    .line 54
    :cond_0
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->prelude(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 56
    :goto_0
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/NamedElement;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 45
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/NamedElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 46
    return-void
.end method

.method private prelude(Lorg/jivesoftware/smack/packet/ExtensionElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 386
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/ExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->prelude(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(C)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;II)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public append(C)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 461
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 462
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 447
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 448
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 449
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 454
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 455
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;II)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 456
    return-object p0
.end method

.method public append(Ljava/util/Collection;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+Lorg/jivesoftware/smack/packet/Element;>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 416
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/jivesoftware/smack/packet/Element;

    .line 417
    invoke-interface {v2}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 418
    goto :goto_0

    .line 419
    :cond_0
    return-object p0
.end method

.method public append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 410
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 411
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    iget-object v1, p1, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Lorg/jivesoftware/smack/util/LazyStringBuilder;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 412
    return-object p0
.end method

.method public attribute(Ljava/lang/String;I)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 269
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 270
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 259
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Enum<*>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 263
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 264
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 265
    return-object p0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 234
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 235
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 236
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escapeAttributeValue(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 237
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 238
    return-object p0
.end method

.method public attribute(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 254
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 255
    :cond_0
    invoke-static {p2}, Lo/ftt;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public attribute(Ljava/lang/String;Z)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 242
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public charAt(I)C
    .locals 1

    .line 472
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->charAt(I)C

    move-result v0

    return v0
.end method

.method public closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 190
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const-string v1, "</"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 191
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 192
    return-object p0
.end method

.method public closeElement(Lorg/jivesoftware/smack/packet/NamedElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 196
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/NamedElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 197
    return-object p0
.end method

.method public closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 201
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const-string v1, "/>"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 202
    return-object p0
.end method

.method public condAttribute(ZLjava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 439
    if-eqz p1, :cond_0

    .line 440
    invoke-virtual {p0, p2, p3}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 442
    :cond_0
    return-object p0
.end method

.method public condEmptyElement(ZLjava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 432
    if-eqz p1, :cond_0

    .line 433
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->emptyElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 435
    :cond_0
    return-object p0
.end method

.method public element(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 102
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public element(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Enum<*>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 106
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 107
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 108
    return-object p0
.end method

.method public element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 74
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 75
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->openElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 76
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 77
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 78
    return-object p0
.end method

.method public element(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 90
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 91
    :cond_0
    invoke-static {p2}, Lo/ftt;->b(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public element(Lorg/jivesoftware/smack/packet/Element;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 112
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 113
    :cond_0
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public emptyElement(Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Enum<*>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 423
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->emptyElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public emptyElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 427
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 428
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 487
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    .line 488
    const/4 v0, 0x0

    return v0

    .line 490
    :cond_0
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    .line 491
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public escape(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 382
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 363
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 364
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 365
    return-object p0
.end method

.method public escapeAttributeValue(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 369
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 370
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXmlAttributeApos(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 371
    return-object p0
.end method

.method public escapedElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 59
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 60
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->openElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 61
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 62
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 63
    return-object p0
.end method

.method public final halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 175
    sget-boolean v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->isNotEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 176
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 177
    return-object p0
.end method

.method public halfOpenElement(Lorg/jivesoftware/smack/packet/NamedElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 181
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/NamedElement;->getElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 496
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public length()I
    .locals 1

    .line 467
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public openElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 185
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 186
    return-object p0
.end method

.method public optAppend(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 396
    if-eqz p1, :cond_0

    .line 397
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 399
    :cond_0
    return-object p0
.end method

.method public optAppend(Lorg/jivesoftware/smack/packet/Element;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 403
    if-eqz p1, :cond_0

    .line 404
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 406
    :cond_0
    return-object p0
.end method

.method public optAttribute(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 297
    if-eqz p2, :cond_0

    .line 298
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 300
    :cond_0
    return-object p0
.end method

.method public optAttribute(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Enum<*>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 304
    if-eqz p2, :cond_0

    .line 305
    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 307
    :cond_0
    return-object p0
.end method

.method public optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 274
    if-eqz p2, :cond_0

    .line 275
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 277
    :cond_0
    return-object p0
.end method

.method public optAttribute(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 290
    if-eqz p2, :cond_0

    .line 291
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 293
    :cond_0
    return-object p0
.end method

.method public optBooleanAttribute(Ljava/lang/String;Z)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 339
    if-eqz p2, :cond_0

    .line 340
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    const-string v1, "=\'true\'"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 342
    :cond_0
    return-object p0
.end method

.method public optBooleanAttributeDefaultTrue(Ljava/lang/String;Z)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 346
    if-nez p2, :cond_0

    .line 347
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    const-string v1, "=\'false\'"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 349
    :cond_0
    return-object p0
.end method

.method public optElement(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 140
    if-eqz p2, :cond_0

    .line 141
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 143
    :cond_0
    return-object p0
.end method

.method public optElement(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Enum<*>;)Lorg/jivesoftware/smack/util/XmlStringBuilder;"
        }
    .end annotation

    .line 154
    if-eqz p2, :cond_0

    .line 155
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 157
    :cond_0
    return-object p0
.end method

.method public optElement(Ljava/lang/String;Ljava/lang/Object;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 161
    if-eqz p2, :cond_0

    .line 162
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 164
    :cond_0
    return-object p0
.end method

.method public optElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 117
    if-eqz p2, :cond_0

    .line 118
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 120
    :cond_0
    return-object p0
.end method

.method public optElement(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 133
    if-eqz p2, :cond_0

    .line 134
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/util/Date;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 136
    :cond_0
    return-object p0
.end method

.method public optElement(Lorg/jivesoftware/smack/packet/Element;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 147
    if-eqz p1, :cond_0

    .line 148
    invoke-interface {p1}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 150
    :cond_0
    return-object p0
.end method

.method public optEscape(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 375
    if-nez p1, :cond_0

    .line 376
    return-object p0

    .line 378
    :cond_0
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public optIntAttribute(Ljava/lang/String;I)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 318
    if-ltz p2, :cond_0

    .line 319
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 321
    :cond_0
    return-object p0
.end method

.method public optIntElement(Ljava/lang/String;I)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 168
    if-ltz p2, :cond_0

    .line 169
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 171
    :cond_0
    return-object p0
.end method

.method public optLongAttribute(Ljava/lang/String;Ljava/lang/Long;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 4

    .line 332
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 333
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 335
    :cond_0
    return-object p0
.end method

.method public prelude(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 390
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 391
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 392
    return-object p0
.end method

.method public rightAngelBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 223
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 2

    .line 211
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    sget-object v1, Lorg/jivesoftware/smack/util/XmlStringBuilder;->RIGHT_ANGLE_BRACKET:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    .line 212
    return-object p0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 477
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0, p1, p2}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 482
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/io/Writer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 508
    iget-object v0, p0, Lorg/jivesoftware/smack/util/XmlStringBuilder;->sb:Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->getAsList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    .line 509
    instance-of v0, v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    if-eqz v0, :cond_0

    .line 510
    move-object v0, v2

    check-cast v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->write(Ljava/io/Writer;)V

    goto :goto_1

    .line 513
    :cond_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 515
    :goto_1
    goto :goto_0

    .line 516
    :cond_1
    return-void
.end method

.method public xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 358
    const-string v0, "xml:lang"

    invoke-virtual {p0, v0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 359
    return-object p0
.end method

.method public xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 353
    const-string v0, "xmlns"

    invoke-virtual {p0, v0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 354
    return-object p0
.end method
