.class public Lorg/researchstack/backbone/model/Choice;
.super Ljava/lang/Object;
.source "Choice.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private detailText:Ljava/lang/String;

.field private text:Ljava/lang/String;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/model/Choice;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;
    .param p3, "detailText"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 40
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lorg/researchstack/backbone/model/Choice;->text:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Lorg/researchstack/backbone/model/Choice;->value:Ljava/lang/Object;

    .line 43
    iput-object p3, p0, Lorg/researchstack/backbone/model/Choice;->detailText:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
.method public getDetailText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 93
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/model/Choice;->detailText:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/model/Choice;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 73
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    iget-object v0, p0, Lorg/researchstack/backbone/model/Choice;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public setDetailText(Ljava/lang/String;)V
    .locals 0
    .param p1, "detailText"    # Ljava/lang/String;

    .prologue
    .line 103
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    iput-object p1, p0, Lorg/researchstack/backbone/model/Choice;->detailText:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 63
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    iput-object p1, p0, Lorg/researchstack/backbone/model/Choice;->text:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 83
    .local p0, "this":Lorg/researchstack/backbone/model/Choice;, "Lorg/researchstack/backbone/model/Choice<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lorg/researchstack/backbone/model/Choice;->value:Ljava/lang/Object;

    .line 84
    return-void
.end method
