.class Lcom/google/dexmaker/DexMaker$TypeDeclaration;
.super Ljava/lang/Object;
.source "DexMaker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/DexMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TypeDeclaration"
.end annotation


# instance fields
.field private declared:Z

.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/dexmaker/FieldId;",
            "Lcom/google/dexmaker/DexMaker$FieldDeclaration;",
            ">;"
        }
    .end annotation
.end field

.field private flags:I

.field private interfaces:Lcom/google/dexmaker/TypeList;

.field private final methods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/dexmaker/MethodId;",
            "Lcom/google/dexmaker/DexMaker$MethodDeclaration;",
            ">;"
        }
    .end annotation
.end field

.field private sourceFile:Ljava/lang/String;

.field private supertype:Lcom/google/dexmaker/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/TypeId<",
            "*>;"
        }
    .end annotation
.end field

.field private final type:Lcom/google/dexmaker/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/TypeId<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/dexmaker/TypeId;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "*>;)V"
        }
    .end annotation

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 408
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    .line 410
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    .line 414
    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->type:Lcom/google/dexmaker/TypeId;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/DexMaker$TypeDeclaration;)Z
    .locals 0

    .line 398
    iget-boolean p0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->declared:Z

    return p0
.end method

.method static synthetic access$002(Lcom/google/dexmaker/DexMaker$TypeDeclaration;Z)Z
    .locals 0

    .line 398
    iput-boolean p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->declared:Z

    return p1
.end method

.method static synthetic access$102(Lcom/google/dexmaker/DexMaker$TypeDeclaration;I)I
    .locals 0

    .line 398
    iput p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->flags:I

    return p1
.end method

.method static synthetic access$202(Lcom/google/dexmaker/DexMaker$TypeDeclaration;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/TypeId;
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->supertype:Lcom/google/dexmaker/TypeId;

    return-object p1
.end method

.method static synthetic access$302(Lcom/google/dexmaker/DexMaker$TypeDeclaration;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->sourceFile:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$402(Lcom/google/dexmaker/DexMaker$TypeDeclaration;Lcom/google/dexmaker/TypeList;)Lcom/google/dexmaker/TypeList;
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->interfaces:Lcom/google/dexmaker/TypeList;

    return-object p1
.end method

.method static synthetic access$500(Lcom/google/dexmaker/DexMaker$TypeDeclaration;)Ljava/util/Map;
    .locals 0

    .line 398
    iget-object p0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$700(Lcom/google/dexmaker/DexMaker$TypeDeclaration;)Ljava/util/Map;
    .locals 0

    .line 398
    iget-object p0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method toClassDefItem()Lcom/google/dexmaker/dx/dex/file/ClassDefItem;
    .locals 8

    .line 418
    iget-boolean v0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->declared:Z

    if-eqz v0, :cond_4

    .line 423
    new-instance v0, Lcom/google/dexmaker/dx/dex/DexOptions;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/dex/DexOptions;-><init>()V

    const/16 v1, 0xd

    .line 424
    iput v1, v0, Lcom/google/dexmaker/dx/dex/DexOptions;->targetApiLevel:I

    .line 426
    iget-object v1, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->type:Lcom/google/dexmaker/TypeId;

    iget-object v3, v1, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 428
    new-instance v1, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;

    iget v4, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->flags:I

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->supertype:Lcom/google/dexmaker/TypeId;

    iget-object v5, v2, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->interfaces:Lcom/google/dexmaker/TypeList;

    iget-object v6, v2, Lcom/google/dexmaker/TypeList;->ropTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    new-instance v7, Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->sourceFile:Ljava/lang/String;

    invoke-direct {v7, v2}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;ILcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    .line 431
    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/DexMaker$MethodDeclaration;

    .line 432
    invoke-virtual {v3, v0}, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->toEncodedMethod(Lcom/google/dexmaker/dx/dex/DexOptions;)Lcom/google/dexmaker/dx/dex/file/EncodedMethod;

    move-result-object v4

    .line 433
    invoke-virtual {v3}, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->isDirect()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 434
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->addDirectMethod(Lcom/google/dexmaker/dx/dex/file/EncodedMethod;)V

    goto :goto_0

    .line 436
    :cond_0
    invoke-virtual {v1, v4}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->addVirtualMethod(Lcom/google/dexmaker/dx/dex/file/EncodedMethod;)V

    goto :goto_0

    .line 439
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/DexMaker$FieldDeclaration;

    .line 440
    invoke-virtual {v2}, Lcom/google/dexmaker/DexMaker$FieldDeclaration;->toEncodedField()Lcom/google/dexmaker/dx/dex/file/EncodedField;

    move-result-object v3

    .line 441
    invoke-virtual {v2}, Lcom/google/dexmaker/DexMaker$FieldDeclaration;->isStatic()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 442
    invoke-static {v2}, Lcom/google/dexmaker/DexMaker$FieldDeclaration;->access$800(Lcom/google/dexmaker/DexMaker$FieldDeclaration;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/Constants;->getConstant(Ljava/lang/Object;)Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->addStaticField(Lcom/google/dexmaker/dx/dex/file/EncodedField;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    goto :goto_1

    .line 444
    :cond_2
    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/dex/file/ClassDefItem;->addInstanceField(Lcom/google/dexmaker/dx/dex/file/EncodedField;)V

    goto :goto_1

    :cond_3
    return-object v1

    .line 419
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undeclared type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->type:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " declares members: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->fields:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/DexMaker$TypeDeclaration;->methods:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
