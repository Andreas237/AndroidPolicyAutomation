.class public Lcom/google/dexmaker/dx/io/Code$Try;
.super Ljava/lang/Object;
.source "Code.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/io/Code;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Try"
.end annotation


# instance fields
.field final handlerOffset:I

.field final instructionCount:I

.field final startAddress:I


# direct methods
.method constructor <init>(III)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput p1, p0, Lcom/google/dexmaker/dx/io/Code$Try;->startAddress:I

    .line 74
    iput p2, p0, Lcom/google/dexmaker/dx/io/Code$Try;->instructionCount:I

    .line 75
    iput p3, p0, Lcom/google/dexmaker/dx/io/Code$Try;->handlerOffset:I

    return-void
.end method


# virtual methods
.method public getHandlerOffset()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/google/dexmaker/dx/io/Code$Try;->handlerOffset:I

    return v0
.end method

.method public getInstructionCount()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/google/dexmaker/dx/io/Code$Try;->instructionCount:I

    return v0
.end method

.method public getStartAddress()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/google/dexmaker/dx/io/Code$Try;->startAddress:I

    return v0
.end method
