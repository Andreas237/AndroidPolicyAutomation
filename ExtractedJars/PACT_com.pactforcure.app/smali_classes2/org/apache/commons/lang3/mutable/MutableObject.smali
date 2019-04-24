.class public Lorg/apache/commons/lang3/mutable/MutableObject;
.super Ljava/lang/Object;
.source "MutableObject.java"

# interfaces
.implements Lorg/apache/commons/lang3/mutable/Mutable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/apache/commons/lang3/mutable/Mutable",
        "<TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x14146a94f5L


# instance fields
.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 53
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    .line 55
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    const/4 v1, 0x0

    .line 91
    if-nez p1, :cond_1

    .line 101
    :cond_0
    :goto_0
    return v1

    .line 94
    :cond_1
    if-ne p0, p1, :cond_2

    .line 95
    const/4 v1, 0x1

    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    move-object v0, p1

    .line 98
    check-cast v0, Lorg/apache/commons/lang3/mutable/MutableObject;

    .line 99
    .local v0, "that":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<*>;"
    iget-object v1, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    iget-object v2, v0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 64
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 112
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 73
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    .line 74
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 123
    .local p0, "this":Lorg/apache/commons/lang3/mutable/MutableObject;, "Lorg/apache/commons/lang3/mutable/MutableObject<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-string v0, "null"

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/lang3/mutable/MutableObject;->value:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
