.class final enum Lcom/google/dexmaker/UnaryOp$1;
.super Lcom/google/dexmaker/UnaryOp;
.source "UnaryOp.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/UnaryOp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, p2, v0}, Lcom/google/dexmaker/UnaryOp;-><init>(Ljava/lang/String;ILcom/google/dexmaker/UnaryOp$1;)V

    return-void
.end method


# virtual methods
.method rop(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/dx/rop/code/Rop;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "*>;)",
            "Lcom/google/dexmaker/dx/rop/code/Rop;"
        }
    .end annotation

    .line 30
    iget-object p1, p1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opNot(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    return-object p1
.end method
