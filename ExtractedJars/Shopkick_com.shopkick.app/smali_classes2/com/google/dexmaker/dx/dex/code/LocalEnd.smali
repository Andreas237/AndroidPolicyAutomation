.class public final Lcom/google/dexmaker/dx/dex/code/LocalEnd;
.super Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;
.source "LocalEnd.java"


# instance fields
.field private final local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/code/ZeroSizeInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)V

    if-eqz p2, :cond_0

    .line 54
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "local == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocal()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object v0
.end method

.method protected listingString0(Z)Ljava/lang/String;
    .locals 1

    .line 88
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "local-end "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-static {v0}, Lcom/google/dexmaker/dx/dex/code/LocalStart;->localString(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 3

    .line 60
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {v2, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/dexmaker/dx/dex/code/LocalEnd;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-object v0
.end method

.method public withRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/dex/code/DalvInsn;
    .locals 2

    .line 66
    new-instance p1, Lcom/google/dexmaker/dx/dex/code/LocalEnd;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalEnd;->local:Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-direct {p1, v0, v1}, Lcom/google/dexmaker/dx/dex/code/LocalEnd;-><init>(Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-object p1
.end method
