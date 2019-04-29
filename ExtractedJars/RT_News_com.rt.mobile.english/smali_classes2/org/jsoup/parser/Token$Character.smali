.class Lorg/jsoup/parser/Token$Character;
.super Lorg/jsoup/parser/Token;
.source "Token.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jsoup/parser/Token;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Character"
.end annotation


# instance fields
.field private final data:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 202
    invoke-direct {p0, v0}, Lorg/jsoup/parser/Token;-><init>(Lorg/jsoup/parser/Token$1;)V

    .line 203
    sget-object v0, Lorg/jsoup/parser/Token$TokenType;->Character:Lorg/jsoup/parser/Token$TokenType;

    iput-object v0, p0, Lorg/jsoup/parser/Token$Character;->type:Lorg/jsoup/parser/Token$TokenType;

    .line 204
    iput-object p1, p0, Lorg/jsoup/parser/Token$Character;->data:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method getData()Ljava/lang/String;
    .locals 1

    .line 208
    iget-object v0, p0, Lorg/jsoup/parser/Token$Character;->data:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 213
    invoke-virtual {p0}, Lorg/jsoup/parser/Token$Character;->getData()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
