.class final Lorg/jdom2/output/support/WalkerPRESERVE$1;
.super Ljava/lang/Object;
.source "WalkerPRESERVE.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/support/WalkerPRESERVE;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lorg/jdom2/Content;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0}, Lorg/jdom2/output/support/WalkerPRESERVE$1;->next()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Content;
    .locals 2

    .line 82
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Cannot call next() on an empty iterator."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public remove()V
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot remove from an empty iterator."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
