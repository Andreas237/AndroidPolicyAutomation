.class public final Lorg/jivesoftware/smack/packet/XMPPError$Builder;
.super Lorg/jivesoftware/smack/packet/AbstractError$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/XMPPError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/packet/AbstractError$Builder<Lorg/jivesoftware/smack/packet/XMPPError$Builder;>;"
    }
.end annotation


# instance fields
.field private condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

.field private conditionText:Ljava/lang/String;

.field private errorGenerator:Ljava/lang/String;

.field private stanza:Lorg/jivesoftware/smack/packet/Stanza;

.field private type:Lorg/jivesoftware/smack/packet/XMPPError$Type;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 295
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/AbstractError$Builder;-><init>()V

    .line 296
    return-void
.end method

.method synthetic constructor <init>(Lorg/jivesoftware/smack/packet/XMPPError$3;)V
    .locals 0

    .line 288
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lorg/jivesoftware/smack/packet/XMPPError;
    .locals 8

    .line 336
    new-instance v0, Lorg/jivesoftware/smack/packet/XMPPError;

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    iget-object v2, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->conditionText:Ljava/lang/String;

    iget-object v3, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->errorGenerator:Ljava/lang/String;

    iget-object v4, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    iget-object v5, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->descriptiveTexts:Ljava/util/Map;

    iget-object v6, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->extensions:Ljava/util/List;

    iget-object v7, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->stanza:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-direct/range {v0 .. v7}, Lorg/jivesoftware/smack/packet/XMPPError;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Condition;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/XMPPError$Type;Ljava/util/Map;Ljava/util/List;Lorg/jivesoftware/smack/packet/Stanza;)V

    return-object v0
.end method

.method public copyFrom(Lorg/jivesoftware/smack/packet/XMPPError;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 1

    .line 324
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getCondition()Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setCondition(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 325
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getType()Lorg/jivesoftware/smack/packet/XMPPError$Type;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setType(Lorg/jivesoftware/smack/packet/XMPPError$Type;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 326
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getConditionText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setConditionText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 327
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getErrorGenerator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setErrorGenerator(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 328
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/XMPPError;->getStanza()Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setStanza(Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 329
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/XMPPError;->descriptiveTexts:Ljava/util/Map;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setDescriptiveTexts(Ljava/util/Map;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    .line 330
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/XMPPError;->textNamespace:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setTextNamespace(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    .line 331
    iget-object v0, p1, Lorg/jivesoftware/smack/packet/XMPPError;->extensions:Ljava/util/List;

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setExtensions(Ljava/util/List;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    .line 332
    return-object p0
.end method

.method protected bridge synthetic getThis()Lorg/jivesoftware/smack/packet/AbstractError$Builder;
    .locals 1

    .line 288
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->getThis()Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected getThis()Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 342
    return-object p0
.end method

.method public setCondition(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 299
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->condition:Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    .line 300
    return-object p0
.end method

.method public setConditionText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 309
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->conditionText:Ljava/lang/String;

    .line 310
    return-object p0
.end method

.method public setErrorGenerator(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 314
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->errorGenerator:Ljava/lang/String;

    .line 315
    return-object p0
.end method

.method public setStanza(Lorg/jivesoftware/smack/packet/Stanza;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 319
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->stanza:Lorg/jivesoftware/smack/packet/Stanza;

    .line 320
    return-object p0
.end method

.method public setType(Lorg/jivesoftware/smack/packet/XMPPError$Type;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 0

    .line 304
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->type:Lorg/jivesoftware/smack/packet/XMPPError$Type;

    .line 305
    return-object p0
.end method
