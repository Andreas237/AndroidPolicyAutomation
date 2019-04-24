.class public final Lcom/google/dexmaker/dx/util/Uint;
.super Ljava/lang/Object;
.source "Uint.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/util/Uint;",
        ">;"
    }
.end annotation


# instance fields
.field public final intValue:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/google/dexmaker/dx/util/Uint;->intValue:I

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/google/dexmaker/dx/util/Uint;)I
    .locals 1

    .line 30
    iget v0, p0, Lcom/google/dexmaker/dx/util/Uint;->intValue:I

    iget p1, p1, Lcom/google/dexmaker/dx/util/Uint;->intValue:I

    invoke-static {v0, p1}, Lcom/google/dexmaker/dx/util/Unsigned;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 22
    check-cast p1, Lcom/google/dexmaker/dx/util/Uint;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/util/Uint;->compareTo(Lcom/google/dexmaker/dx/util/Uint;)I

    move-result p1

    return p1
.end method
