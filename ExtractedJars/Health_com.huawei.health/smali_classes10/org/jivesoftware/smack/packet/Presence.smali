.class public final Lorg/jivesoftware/smack/packet/Presence;
.super Lorg/jivesoftware/smack/packet/Stanza;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/util/TypedCloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/Presence$Mode;,
        Lorg/jivesoftware/smack/packet/Presence$Type;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/packet/Stanza;Lorg/jivesoftware/smack/util/TypedCloneable<Lorg/jivesoftware/smack/packet/Presence;>;"
    }
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "presence"


# instance fields
.field private mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

.field private priority:I

.field private status:Ljava/lang/String;

.field private type:Lorg/jivesoftware/smack/packet/Presence$Type;


# direct methods
.method public constructor <init>(Lo/fte;Lorg/jivesoftware/smack/packet/Presence$Type;)V
    .locals 0

    .line 90
    invoke-direct {p0, p2}, Lorg/jivesoftware/smack/packet/Presence;-><init>(Lorg/jivesoftware/smack/packet/Presence$Type;)V

    .line 91
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Presence;->setTo(Lo/fte;)V

    .line 92
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/Presence$Type;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 66
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    .line 68
    const/high16 v0, -0x80000000

    iput v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 79
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Presence;->setType(Lorg/jivesoftware/smack/packet/Presence$Type;)V

    .line 80
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/Presence$Type;Ljava/lang/String;ILorg/jivesoftware/smack/packet/Presence$Mode;)V
    .locals 1

    .line 104
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 66
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    .line 68
    const/high16 v0, -0x80000000

    iput v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 105
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/packet/Presence;->setType(Lorg/jivesoftware/smack/packet/Presence$Type;)V

    .line 106
    invoke-virtual {p0, p2}, Lorg/jivesoftware/smack/packet/Presence;->setStatus(Ljava/lang/String;)V

    .line 107
    invoke-virtual {p0, p3}, Lorg/jivesoftware/smack/packet/Presence;->setPriority(I)V

    .line 108
    invoke-virtual {p0, p4}, Lorg/jivesoftware/smack/packet/Presence;->setMode(Lorg/jivesoftware/smack/packet/Presence$Mode;)V

    .line 109
    return-void
.end method

.method public constructor <init>(Lorg/jivesoftware/smack/packet/Presence;)V
    .locals 1

    .line 121
    invoke-direct {p0, p1}, Lorg/jivesoftware/smack/packet/Stanza;-><init>(Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 66
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    .line 68
    const/high16 v0, -0x80000000

    iput v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 122
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 123
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    .line 124
    iget v0, p1, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    iput v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    .line 125
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 126
    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 62
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Presence;->clone()Lorg/jivesoftware/smack/packet/Presence;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jivesoftware/smack/packet/Presence;
    .locals 1

    .line 299
    new-instance v0, Lorg/jivesoftware/smack/packet/Presence;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/packet/Presence;-><init>(Lorg/jivesoftware/smack/packet/Presence;)V

    return-object v0
.end method

.method public cloneWithNewId()Lorg/jivesoftware/smack/packet/Presence;
    .locals 2

    .line 309
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Presence;->clone()Lorg/jivesoftware/smack/packet/Presence;

    move-result-object v1

    .line 310
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/jivesoftware/smack/packet/Presence;->setStanzaId(Ljava/lang/String;)V

    .line 311
    return-object v1
.end method

.method public getMode()Lorg/jivesoftware/smack/packet/Presence$Mode;
    .locals 1

    .line 227
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-nez v0, :cond_0

    .line 228
    sget-object v0, Lorg/jivesoftware/smack/packet/Presence$Mode;->available:Lorg/jivesoftware/smack/packet/Presence$Mode;

    return-object v0

    .line 230
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    return-object v0
.end method

.method public getPriority()I
    .locals 1

    .line 203
    iget v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lorg/jivesoftware/smack/packet/Presence$Type;
    .locals 1

    .line 163
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    return-object v0
.end method

.method public isAvailable()Z
    .locals 2

    .line 140
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isAway()Z
    .locals 2

    .line 154
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->away:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->xa:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->dnd:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setMode(Lorg/jivesoftware/smack/packet/Presence$Mode;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    .line 241
    return-void
.end method

.method public setPriority(I)V
    .locals 3

    .line 214
    const/16 v0, -0x80

    if-lt p1, v0, :cond_0

    const/16 v0, 0x7f

    if-le p1, v0, :cond_1

    .line 215
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Priority value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not valid. Valid range is -128 through 127."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_1
    iput p1, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    .line 219
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setType(Lorg/jivesoftware/smack/packet/Presence$Type;)V
    .locals 1

    .line 172
    const-string v0, "Type cannot be null"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/Presence$Type;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 173
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 245
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    const-string v0, "Presence Stanza ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Presence;->logCommonAttributes(Ljava/lang/StringBuilder;)V

    .line 248
    const-string v0, "type="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 249
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "mode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 252
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 253
    const-string v0, "status="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 255
    :cond_1
    iget v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    .line 256
    const-string v0, "prio="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 258
    :cond_2
    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 259
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Presence;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 264
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 265
    const-string v0, "presence"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 266
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Presence;->addCommonAttributes(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 267
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    if-eq v0, v1, :cond_0

    .line 268
    const-string v0, "type"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->type:Lorg/jivesoftware/smack/packet/Presence$Type;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 270
    :cond_0
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 272
    const-string v0, "status"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->status:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 273
    iget v0, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 274
    const-string v0, "priority"

    iget v1, p0, Lorg/jivesoftware/smack/packet/Presence;->priority:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 276
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    sget-object v1, Lorg/jivesoftware/smack/packet/Presence$Mode;->available:Lorg/jivesoftware/smack/packet/Presence$Mode;

    if-eq v0, v1, :cond_2

    .line 277
    const-string v0, "show"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Presence;->mode:Lorg/jivesoftware/smack/packet/Presence$Mode;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/Enum;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 279
    :cond_2
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Presence;->getExtensionsXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 282
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/Presence;->appendErrorIfExists(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 284
    const-string v0, "presence"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 286
    return-object v2
.end method
