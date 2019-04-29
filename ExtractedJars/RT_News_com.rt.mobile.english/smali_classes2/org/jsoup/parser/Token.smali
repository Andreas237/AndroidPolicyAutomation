.class abstract Lorg/jsoup/parser/Token;
.super Ljava/lang/Object;
.source "Token.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jsoup/parser/Token$TokenType;,
        Lorg/jsoup/parser/Token$EOF;,
        Lorg/jsoup/parser/Token$Character;,
        Lorg/jsoup/parser/Token$Comment;,
        Lorg/jsoup/parser/Token$EndTag;,
        Lorg/jsoup/parser/Token$StartTag;,
        Lorg/jsoup/parser/Token$Tag;,
        Lorg/jsoup/parser/Token$Doctype;
    }
.end annotation


# instance fields
.field type:Lorg/jsoup/parser/Token$TokenType;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jsoup/parser/Token$1;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lorg/jsoup/parser/Token;-><init>()V

    return-void
.end method


# virtual methods
.method asCharacter()Lorg/jsoup/parser/Token$Character;
    .locals 1

    .line 260
    move-object v0, p0

    check-cast v0, Lorg/jsoup/parser/Token$Character;

    return-object v0
.end method

.method asComment()Lorg/jsoup/parser/Token$Comment;
    .locals 1

    .line 252
    move-object v0, p0

    check-cast v0, Lorg/jsoup/parser/Token$Comment;

    return-object v0
.end method

.method asDoctype()Lorg/jsoup/parser/Token$Doctype;
    .locals 1

    .line 228
    move-object v0, p0

    check-cast v0, Lorg/jsoup/parser/Token$Doctype;

    return-object v0
.end method

.method asEndTag()Lorg/jsoup/parser/Token$EndTag;
    .locals 1

    .line 244
    move-object v0, p0

    check-cast v0, Lorg/jsoup/parser/Token$EndTag;

    return-object v0
.end method

.method asStartTag()Lorg/jsoup/parser/Token$StartTag;
    .locals 1

    .line 236
    move-object v0, p0

    check-cast v0, Lorg/jsoup/parser/Token$StartTag;

    return-object v0
.end method

.method isCharacter()Z
    .locals 2

    .line 256
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->Character:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isComment()Z
    .locals 2

    .line 248
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->Comment:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isDoctype()Z
    .locals 2

    .line 224
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->Doctype:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isEOF()Z
    .locals 2

    .line 264
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->EOF:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isEndTag()Z
    .locals 2

    .line 240
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->EndTag:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isStartTag()Z
    .locals 2

    .line 232
    iget-object v0, p0, Lorg/jsoup/parser/Token;->type:Lorg/jsoup/parser/Token$TokenType;

    sget-object v1, Lorg/jsoup/parser/Token$TokenType;->StartTag:Lorg/jsoup/parser/Token$TokenType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method tokenType()Ljava/lang/String;
    .locals 1

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
