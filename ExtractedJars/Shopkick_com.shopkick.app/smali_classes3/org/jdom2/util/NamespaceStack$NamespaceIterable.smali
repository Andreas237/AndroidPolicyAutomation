.class final Lorg/jdom2/util/NamespaceStack$NamespaceIterable;
.super Ljava/lang/Object;
.source "NamespaceStack.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/util/NamespaceStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NamespaceIterable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lorg/jdom2/Namespace;",
        ">;"
    }
.end annotation


# instance fields
.field private final forward:Z

.field private final namespaces:[Lorg/jdom2/Namespace;


# direct methods
.method public constructor <init>([Lorg/jdom2/Namespace;Z)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-boolean p2, p0, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;->forward:Z

    .line 189
    iput-object p1, p0, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;->namespaces:[Lorg/jdom2/Namespace;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    .line 193
    iget-boolean v0, p0, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;->forward:Z

    if-eqz v0, :cond_0

    new-instance v0, Lorg/jdom2/util/NamespaceStack$ForwardWalker;

    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;->namespaces:[Lorg/jdom2/Namespace;

    invoke-direct {v0, v1}, Lorg/jdom2/util/NamespaceStack$ForwardWalker;-><init>([Lorg/jdom2/Namespace;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/jdom2/util/NamespaceStack$BackwardWalker;

    iget-object v1, p0, Lorg/jdom2/util/NamespaceStack$NamespaceIterable;->namespaces:[Lorg/jdom2/Namespace;

    invoke-direct {v0, v1}, Lorg/jdom2/util/NamespaceStack$BackwardWalker;-><init>([Lorg/jdom2/Namespace;)V

    :goto_0
    return-object v0
.end method
