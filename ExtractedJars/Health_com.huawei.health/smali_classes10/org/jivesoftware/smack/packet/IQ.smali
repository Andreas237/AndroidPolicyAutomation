.class public abstract Lorg/jivesoftware/smack/packet/IQ;
.super Lorg/jivesoftware/smack/packet/Stanza;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;,
        Lorg/jivesoftware/smack/packet/IQ$Type;
    }
.end annotation


# static fields
.field public static final IQ_ELEMENT:Ljava/lang/String; = "iq"

.field public static final QUERY_ELEMENT:Ljava/lang/String; = "query"


# instance fields
.field private final childElementName:Ljava/lang/String;

.field private final childElementNamespace:Ljava/lang/String;

.field private type:Lorg/jivesoftware/smack/packet/IQ$Type;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 51
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    .line 65
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementName:Ljava/lang/String;

    .line 66
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementNamespace:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/IQ;)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;-><init>(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 51
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    .line 55
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    .line 56
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/IQ;->childElementName:Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementName:Ljava/lang/String;

    .line 57
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/IQ;->childElementNamespace:Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementNamespace:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public static createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError$Builder;)Lorg/jivesoftware/smack/packet/ErrorIQ;
    .locals 4

    .line 269
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-eq v0, v1, :cond_0

    .line 270
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IQ must be of type \'set\' or \'get\'. Original IQ: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 271
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    :cond_0
    new-instance v3, Lorg/jivesoftware/smack/packet/ErrorIQ;

    invoke-direct {v3, p1}, Lorg/jivesoftware/smack/packet/ErrorIQ;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V

    .line 274
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/packet/ErrorIQ;->setStanzaId(Ljava/lang/String;)V

    .line 275
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getTo()Lo/fte;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/packet/ErrorIQ;->setFrom(Lo/fte;)V

    .line 276
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getFrom()Lo/fte;

    move-result-object v0

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/packet/ErrorIQ;->setTo(Lo/fte;)V

    .line 278
    invoke-virtual {p1, v3}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setStanza(Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 280
    return-object v3
.end method

.method public static createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/ErrorIQ;
    .locals 1

    .line 284
    invoke-static {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError$Builder;)Lorg/jivesoftware/smack/packet/ErrorIQ;

    move-result-object v0

    return-object v0
.end method

.method public static createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError;)Lorg/jivesoftware/smack/packet/ErrorIQ;
    .locals 1

    .line 306
    invoke-static {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder(Lorg/jivesoftware/smack/packet/XMPPError;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->createErrorResponse(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/XMPPError$Builder;)Lorg/jivesoftware/smack/packet/ErrorIQ;

    move-result-object v0

    return-object v0
.end method

.method public static createResultIQ(Lorg/jivesoftware/smack/packet/IQ;)Lorg/jivesoftware/smack/packet/IQ;
    .locals 1

    .line 247
    new-instance v0, Lorg/jivesoftware/smack/packet/EmptyResultIQ;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/packet/EmptyResultIQ;-><init>(Lorg/jivesoftware/smack/packet/IQ;)V

    return-object v0
.end method


# virtual methods
.method public final getChildElementName()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementName:Ljava/lang/String;

    return-object v0
.end method

.method public final getChildElementNamespace()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementNamespace:Ljava/lang/String;

    return-object v0
.end method

.method public final getChildElementXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 5

    .line 152
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 153
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/IQ$Type;->error:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-ne v0, v1, :cond_0

    .line 155
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/IQ;->appendErrorIfExists(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    goto :goto_0

    .line 157
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->childElementName:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 159
    new-instance v0, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;-><init>(Lorg/jivesoftware/smack/packet/IQ;Lorg/jivesoftware/smack/packet/IQ$1;)V

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;

    move-result-object v3

    .line 160
    if-eqz v3, :cond_3

    .line 161
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 162
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getExtensionsXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v4

    .line 163
    invoke-static {v3}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->access$100(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    invoke-virtual {v4}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 165
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 166
    return-object v2

    .line 168
    :cond_1
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 171
    :cond_2
    invoke-virtual {v2, v4}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 172
    invoke-static {v3}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->access$200(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 175
    :cond_3
    :goto_0
    return-object v2
.end method

.method protected abstract getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
.end method

.method public getType()Lorg/jivesoftware/smack/packet/IQ$Type;
    .locals 1

    .line 75
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    return-object v0
.end method

.method protected final initialzeAsResultFor(Lorg/jivesoftware/smack/packet/IQ;)V
    .locals 3

    .line 220
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getType()Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-eq v0, v1, :cond_0

    .line 221
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IQ must be of type \'set\' or \'get\'. Original IQ: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 222
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 224
    :cond_0
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setStanzaId(Ljava/lang/String;)V

    .line 225
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getTo()Lo/fte;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setFrom(Lo/fte;)V

    .line 226
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ;->getFrom()Lo/fte;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setTo(Lo/fte;)V

    .line 227
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->result:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 228
    return-void
.end method

.method public isRequestIQ()Z
    .locals 2

    .line 98
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$1;->a:[I

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 101
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 103
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V
    .locals 1

    .line 88
    const-string v0, "type must not be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/IQ$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    .line 89
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    const-string v0, "IQ Stanza ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getChildElementName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getChildElementNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    const-string v0, ") ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/IQ;->logCommonAttributes(Ljava/lang/StringBuilder;)V

    .line 123
    const-string v0, "type="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 42
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 130
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 131
    const-string v0, "iq"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 132
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/IQ;->addCommonAttributes(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 133
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    if-nez v0, :cond_0

    .line 134
    const-string v0, "type"

    const-string v1, "get"

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    goto :goto_0

    .line 137
    :cond_0
    const-string v0, "type"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/IQ;->type:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {v1}, Lorg/jivesoftware/smack/packet/IQ$Type;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 139
    :goto_0
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 140
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/IQ;->getChildElementXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 141
    const-string v0, "iq"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 142
    return-object v2
.end method
