.class final Lorg/jdom2/util/NamespaceStack$BackwardWalker;
.super Ljava/lang/Object;
.source "NamespaceStack.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/util/NamespaceStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "BackwardWalker"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lorg/jdom2/Namespace;",
        ">;"
    }
.end annotation


# instance fields
.field cursor:I

.field private final namespaces:[Lorg/jdom2/Namespace;


# direct methods
.method public constructor <init>([Lorg/jdom2/Namespace;)V
    .locals 1

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 149
    iput v0, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->cursor:I

    .line 152
    iput-object p1, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->namespaces:[Lorg/jdom2/Namespace;

    .line 153
    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->cursor:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 158
    iget v0, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->cursor:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 147
    invoke-virtual {p0}, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->next()Lorg/jdom2/Namespace;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Namespace;
    .locals 3

    .line 163
    iget v0, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->cursor:I

    if-ltz v0, :cond_0

    .line 166
    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->namespaces:[Lorg/jdom2/Namespace;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;->cursor:I

    aget-object v0, v1, v0

    return-object v0

    .line 164
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Cannot over-iterate..."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 171
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot remove Namespaces from iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
