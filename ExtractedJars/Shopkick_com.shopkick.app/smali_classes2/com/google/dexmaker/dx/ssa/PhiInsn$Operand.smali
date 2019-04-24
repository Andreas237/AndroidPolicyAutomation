.class Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;
.super Ljava/lang/Object;
.source "PhiInsn.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/PhiInsn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Operand"
.end annotation


# instance fields
.field public final blockIndex:I

.field public regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

.field public final ropLabel:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;II)V
    .locals 0

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 386
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 387
    iput p2, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->blockIndex:I

    .line 388
    iput p3, p0, Lcom/google/dexmaker/dx/ssa/PhiInsn$Operand;->ropLabel:I

    return-void
.end method
