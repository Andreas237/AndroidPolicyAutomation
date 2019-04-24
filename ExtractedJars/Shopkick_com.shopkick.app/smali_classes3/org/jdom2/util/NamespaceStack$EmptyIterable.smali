.class final Lorg/jdom2/util/NamespaceStack$EmptyIterable;
.super Ljava/lang/Object;
.source "NamespaceStack.java"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/util/NamespaceStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "EmptyIterable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lorg/jdom2/Namespace;",
        ">;",
        "Ljava/util/Iterator<",
        "Lorg/jdom2/Namespace;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/util/NamespaceStack$1;)V
    .locals 0

    .line 203
    invoke-direct {p0}, Lorg/jdom2/util/NamespaceStack$EmptyIterable;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation

    return-object p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 203
    invoke-virtual {p0}, Lorg/jdom2/util/NamespaceStack$EmptyIterable;->next()Lorg/jdom2/Namespace;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Namespace;
    .locals 2

    .line 217
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Can not call next() on an empty Iterator."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 223
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot remove Namespaces from iterator"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
