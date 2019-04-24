.class public Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;
.super Ljava/lang/Object;
.source "CatchHandlerList.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/code/CatchHandlerList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field private final exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private final handler:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstType;I)V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_1

    if-eqz p1, :cond_0

    .line 189
    iput p2, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->handler:I

    .line 190
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-void

    .line 186
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "exceptionType == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 182
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "handler < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compareTo(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;)I
    .locals 2

    .line 211
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->handler:I

    iget v1, p1, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->handler:I

    if-ge v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 217
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object p1, p1, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 167
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->compareTo(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 202
    instance-of v0, p1, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 203
    check-cast p1, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->compareTo(Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method public getExceptionType()Lcom/google/dexmaker/dx/rop/cst/CstType;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object v0
.end method

.method public getHandler()I
    .locals 1

    .line 235
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->handler:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 196
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->handler:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/CatchHandlerList$Entry;->exceptionType:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
