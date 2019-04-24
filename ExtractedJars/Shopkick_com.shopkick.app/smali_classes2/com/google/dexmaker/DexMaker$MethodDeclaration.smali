.class Lcom/google/dexmaker/DexMaker$MethodDeclaration;
.super Ljava/lang/Object;
.source "DexMaker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/DexMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MethodDeclaration"
.end annotation


# instance fields
.field private final code:Lcom/google/dexmaker/Code;

.field private final flags:I

.field final method:Lcom/google/dexmaker/MethodId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/MethodId<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/MethodId;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/MethodId<",
            "**>;I)V"
        }
    .end annotation

    .line 480
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 481
    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->method:Lcom/google/dexmaker/MethodId;

    .line 482
    iput p2, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->flags:I

    .line 483
    new-instance p1, Lcom/google/dexmaker/Code;

    invoke-direct {p1, p0}, Lcom/google/dexmaker/Code;-><init>(Lcom/google/dexmaker/DexMaker$MethodDeclaration;)V

    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->code:Lcom/google/dexmaker/Code;

    return-void
.end method

.method static synthetic access$600(Lcom/google/dexmaker/DexMaker$MethodDeclaration;)Lcom/google/dexmaker/Code;
    .locals 0

    .line 475
    iget-object p0, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->code:Lcom/google/dexmaker/Code;

    return-object p0
.end method


# virtual methods
.method isDirect()Z
    .locals 2

    .line 491
    iget v0, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->flags:I

    const v1, 0x1000a

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method isStatic()Z
    .locals 1

    .line 487
    iget v0, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->flags:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method toEncodedMethod(Lcom/google/dexmaker/dx/dex/DexOptions;)Lcom/google/dexmaker/dx/dex/file/EncodedMethod;
    .locals 4

    .line 495
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/RopMethod;

    iget-object v1, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->code:Lcom/google/dexmaker/Code;

    invoke-virtual {v1}, Lcom/google/dexmaker/Code;->toBasicBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/RopMethod;-><init>(Lcom/google/dexmaker/dx/rop/code/BasicBlockList;I)V

    .line 497
    iget-object v1, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->code:Lcom/google/dexmaker/Code;

    invoke-virtual {v1}, Lcom/google/dexmaker/Code;->paramSize()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v3, v2, v1, p1}, Lcom/google/dexmaker/dx/dex/code/RopTranslator;->translate(Lcom/google/dexmaker/dx/rop/code/RopMethod;ILcom/google/dexmaker/dx/rop/code/LocalVariableInfo;ILcom/google/dexmaker/dx/dex/DexOptions;)Lcom/google/dexmaker/dx/dex/code/DalvCode;

    move-result-object p1

    .line 499
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;

    iget-object v1, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->method:Lcom/google/dexmaker/MethodId;

    iget-object v1, v1, Lcom/google/dexmaker/MethodId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    iget v2, p0, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->flags:I

    sget-object v3, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/dex/file/EncodedMethod;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;ILcom/google/dexmaker/dx/dex/code/DalvCode;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    return-object v0
.end method
