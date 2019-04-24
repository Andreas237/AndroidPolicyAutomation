.class public final Lcom/google/dexmaker/Code;
.super Ljava/lang/Object;
.source "Code.java"


# instance fields
.field private final catchLabels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/Label;",
            ">;"
        }
    .end annotation
.end field

.field private final catchTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/TypeId<",
            "*>;>;"
        }
    .end annotation
.end field

.field private catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field private currentLabel:Lcom/google/dexmaker/Label;

.field private final labels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/Label;",
            ">;"
        }
    .end annotation
.end field

.field private final locals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/Local<",
            "*>;>;"
        }
    .end annotation
.end field

.field private localsInitialized:Z

.field private final method:Lcom/google/dexmaker/MethodId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/MethodId<",
            "**>;"
        }
    .end annotation
.end field

.field private final parameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/Local<",
            "*>;>;"
        }
    .end annotation
.end field

.field private sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

.field private final thisLocal:Lcom/google/dexmaker/Local;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/Local<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/dexmaker/DexMaker$MethodDeclaration;)V
    .locals 4

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/Code;->locals:Ljava/util/List;

    .line 203
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    iput-object v0, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    .line 205
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/Code;->catchLabels:Ljava/util/List;

    .line 206
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->EMPTY:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iput-object v0, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 209
    iget-object v0, p1, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->method:Lcom/google/dexmaker/MethodId;

    iput-object v0, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    .line 210
    invoke-virtual {p1}, Lcom/google/dexmaker/DexMaker$MethodDeclaration;->isStatic()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 211
    iput-object p1, p0, Lcom/google/dexmaker/Code;->thisLocal:Lcom/google/dexmaker/Local;

    goto :goto_0

    .line 213
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object p1, p1, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-static {p0, p1}, Lcom/google/dexmaker/Local;->get(Lcom/google/dexmaker/Code;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/Code;->thisLocal:Lcom/google/dexmaker/Local;

    .line 214
    iget-object p1, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    iget-object v0, p0, Lcom/google/dexmaker/Code;->thisLocal:Lcom/google/dexmaker/Local;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    :goto_0
    iget-object p1, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object p1, p1, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    iget-object p1, p1, Lcom/google/dexmaker/TypeList;->types:[Lcom/google/dexmaker/TypeId;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 217
    iget-object v3, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    invoke-static {p0, v2}, Lcom/google/dexmaker/Local;->get(Lcom/google/dexmaker/Code;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 219
    :cond_1
    new-instance p1, Lcom/google/dexmaker/Label;

    invoke-direct {p1}, Lcom/google/dexmaker/Label;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    .line 220
    iget-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    invoke-direct {p0, p1}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 221
    iget-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/dexmaker/Label;->marked:Z

    return-void
.end method

.method private addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V
    .locals 1

    const/4 v0, 0x0

    .line 401
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/Label;)V

    return-void
.end method

.method private addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/Label;)V
    .locals 2

    .line 409
    iget-object v0, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    if-eqz v0, :cond_6

    iget-boolean v0, v0, Lcom/google/dexmaker/Label;->marked:Z

    if-eqz v0, :cond_6

    .line 412
    iget-object v0, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    iget-object v0, v0, Lcom/google/dexmaker/Label;->instructions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 414
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 v0, 0x6

    const/4 v1, 0x0

    if-eq p1, v0, :cond_4

    packed-switch p1, :pswitch_data_0

    .line 451
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    if-eqz p2, :cond_0

    .line 440
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/google/dexmaker/Code;->splitCurrentLabel(Lcom/google/dexmaker/Label;Ljava/util/List;)V

    goto :goto_0

    .line 438
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "branch == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-eqz p2, :cond_1

    .line 432
    iget-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    iput-object p2, p1, Lcom/google/dexmaker/Label;->primarySuccessor:Lcom/google/dexmaker/Label;

    .line 433
    iput-object v1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    goto :goto_0

    .line 430
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "branch == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    if-nez p2, :cond_2

    .line 425
    iput-object v1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    goto :goto_0

    .line 423
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "unexpected branch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    if-nez p2, :cond_3

    return-void

    .line 417
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "unexpected branch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-nez p2, :cond_5

    .line 447
    new-instance p1, Ljava/util/ArrayList;

    iget-object p2, p0, Lcom/google/dexmaker/Code;->catchLabels:Ljava/util/List;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v1, p1}, Lcom/google/dexmaker/Code;->splitCurrentLabel(Lcom/google/dexmaker/Label;Ljava/util/List;)V

    :goto_0
    return-void

    .line 445
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "unexpected branch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 410
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "no current label"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private adopt(Lcom/google/dexmaker/Label;)V
    .locals 1

    .line 318
    iget-object v0, p1, Lcom/google/dexmaker/Label;->code:Lcom/google/dexmaker/Code;

    if-ne v0, p0, :cond_0

    return-void

    .line 321
    :cond_0
    iget-object v0, p1, Lcom/google/dexmaker/Label;->code:Lcom/google/dexmaker/Code;

    if-nez v0, :cond_1

    .line 324
    iput-object p0, p1, Lcom/google/dexmaker/Label;->code:Lcom/google/dexmaker/Code;

    .line 325
    iget-object v0, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 322
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot adopt label; it belongs to another Code"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private cleanUpLabels()V
    .locals 4

    .line 881
    iget-object v0, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 882
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/Label;

    .line 883
    invoke-virtual {v2}, Lcom/google/dexmaker/Label;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 884
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 886
    :cond_0
    invoke-virtual {v2}, Lcom/google/dexmaker/Label;->compact()V

    add-int/lit8 v3, v1, 0x1

    .line 887
    iput v1, v2, Lcom/google/dexmaker/Label;->id:I

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method private coerce(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;)",
            "Lcom/google/dexmaker/Local<",
            "TT;>;"
        }
    .end annotation

    .line 261
    iget-object v0, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, p2}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 262
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requested "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " but was "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static concatenate(Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 894
    :goto_0
    new-instance v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    array-length v3, p1

    add-int/2addr v3, v1

    invoke-direct {v2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;-><init>(I)V

    if-eqz p0, :cond_1

    .line 896
    invoke-virtual {p0}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    invoke-virtual {v2, v0, p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 898
    :cond_1
    :goto_1
    array-length p0, p1

    if-ge v0, p0, :cond_2

    add-int p0, v0, v1

    .line 899
    aget-object v3, p1, v0

    invoke-virtual {v3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v2, p0, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method private getCastRop(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Rop;
    .locals 2

    .line 753
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->getBasicType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 754
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/type/Type;->getBasicType()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 758
    :pswitch_0
    sget-object p1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_CHAR:Lcom/google/dexmaker/dx/rop/code/Rop;

    return-object p1

    .line 760
    :pswitch_1
    sget-object p1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_BYTE:Lcom/google/dexmaker/dx/rop/code/Rop;

    return-object p1

    .line 756
    :cond_0
    sget-object p1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_SHORT:Lcom/google/dexmaker/dx/rop/code/Rop;

    return-object p1

    .line 763
    :cond_1
    :goto_0
    invoke-static {p2, p1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opConv(Lcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private varargs invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/dx/rop/code/Rop;",
            "Lcom/google/dexmaker/MethodId<",
            "TD;TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;",
            "Lcom/google/dexmaker/Local<",
            "+TD;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 691
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-static {p4, p5}, Lcom/google/dexmaker/Code;->concatenate(Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p2, Lcom/google/dexmaker/MethodId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 694
    invoke-direct {p0, p3, p1}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    :cond_0
    return-void
.end method

.method private moveResult(Lcom/google/dexmaker/Local;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 836
    iget-object p2, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object p2, p2, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object p2, p2, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMoveResult(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p2

    .line 839
    :goto_0
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v0, p2, v1, p1, v2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method private splitCurrentLabel(Lcom/google/dexmaker/Label;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Label;",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/Label;",
            ">;)V"
        }
    .end annotation

    .line 461
    new-instance v0, Lcom/google/dexmaker/Label;

    invoke-direct {v0}, Lcom/google/dexmaker/Label;-><init>()V

    .line 462
    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 463
    iget-object v1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    iput-object v0, v1, Lcom/google/dexmaker/Label;->primarySuccessor:Lcom/google/dexmaker/Label;

    .line 464
    iput-object p1, v1, Lcom/google/dexmaker/Label;->alternateSuccessor:Lcom/google/dexmaker/Label;

    .line 465
    iput-object p2, v1, Lcom/google/dexmaker/Label;->catchLabels:Ljava/util/List;

    .line 466
    iput-object v0, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    .line 467
    iget-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/google/dexmaker/Label;->marked:Z

    return-void
.end method

.method private toTypeList(Ljava/util/List;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/TypeId<",
            "*>;>;)",
            "Lcom/google/dexmaker/dx/rop/type/StdTypeList;"
        }
    .end annotation

    .line 393
    new-instance v0, Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;-><init>(I)V

    const/4 v1, 0x0

    .line 394
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 395
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/TypeId;

    iget-object v2, v2, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->set(ILcom/google/dexmaker/dx/rop/type/Type;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public addCatchClause(Lcom/google/dexmaker/TypeId;Lcom/google/dexmaker/Label;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lcom/google/dexmaker/Label;",
            ")V"
        }
    .end annotation

    .line 362
    iget-object v0, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    invoke-direct {p0, p2}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 366
    iget-object v0, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 367
    iget-object p1, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/google/dexmaker/Code;->toTypeList(Ljava/util/List;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 368
    iget-object p1, p0, Lcom/google/dexmaker/Code;->catchLabels:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 363
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Already caught: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public aget(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 791
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    iget-object v1, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opAget(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    iget-object p3, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p2, p3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p2, 0x1

    .line 793
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method public aput(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 800
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    iget-object v1, p3, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opAput(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    iget-object p2, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public arrayLength(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 772
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ARRAY_LENGTH:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    iget-object v3, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p2, v3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p2, 0x1

    .line 774
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method public cast(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 741
    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->getType()Lcom/google/dexmaker/TypeId;

    move-result-object v0

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->isReference()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 742
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    sget-object v2, Lcom/google/dexmaker/dx/rop/code/Rops;->CHECK_CAST:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v3, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    iget-object v5, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object p2, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v6, p2, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p2, 0x1

    .line 744
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    goto :goto_0

    .line 746
    :cond_0
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    iget-object v2, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v2, v2, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-direct {p0, v1, v2}, Lcom/google/dexmaker/Code;->getCastRop(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    :goto_0
    return-void
.end method

.method public compare(Lcom/google/dexmaker/Comparison;Lcom/google/dexmaker/Label;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Comparison;",
            "Lcom/google/dexmaker/Label;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 534
    invoke-direct {p0, p2}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 536
    iget-object v0, p3, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    iget-object v1, p4, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/Comparison;->rop(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    .line 537
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p4}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {v0, p1, v1, p4, p3}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0, p2}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/Label;)V

    return-void
.end method

.method public compareFloatingPoint(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Number;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;I)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 551
    iget-object p4, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object p4, p4, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p4}, Lcom/google/dexmaker/dx/rop/code/Rops;->opCmpg(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    if-ne p4, v0, :cond_1

    .line 553
    iget-object p4, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object p4, p4, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {p4}, Lcom/google/dexmaker/dx/rop/code/Rops;->opCmpl(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p4

    .line 557
    :goto_0
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    invoke-direct {v0, p4, v1, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void

    .line 555
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected 1 or -1 but was "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public compareLongs(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Long;",
            ">;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 567
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPL_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public getParameter(ILcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;)",
            "Lcom/google/dexmaker/Local<",
            "TT;>;"
        }
    .end annotation

    .line 242
    iget-object v0, p0, Lcom/google/dexmaker/Code;->thisLocal:Lcom/google/dexmaker/Local;

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/Local;

    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->coerce(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object p1

    return-object p1
.end method

.method public getThis(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;)",
            "Lcom/google/dexmaker/Local<",
            "TT;>;"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lcom/google/dexmaker/Code;->thisLocal:Lcom/google/dexmaker/Local;

    if-eqz v0, :cond_0

    .line 256
    invoke-direct {p0, v0, p1}, Lcom/google/dexmaker/Code;->coerce(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object p1

    return-object p1

    .line 254
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "static methods cannot access \'this\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public iget(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/FieldId<",
            "TD;TV;>;",
            "Lcom/google/dexmaker/Local<",
            "TV;>;",
            "Lcom/google/dexmaker/Local<",
            "TD;>;)V"
        }
    .end annotation

    .line 578
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v0, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opGetField(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-static {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p1, Lcom/google/dexmaker/FieldId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p1, 0x1

    .line 580
    invoke-direct {p0, p2, p1}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method initializeLocals()V
    .locals 13

    .line 280
    iget-boolean v0, p0, Lcom/google/dexmaker/Code;->localsInitialized:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 283
    iput-boolean v0, p0, Lcom/google/dexmaker/Code;->localsInitialized:Z

    .line 286
    iget-object v0, p0, Lcom/google/dexmaker/Code;->locals:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/Local;

    .line 287
    invoke-virtual {v3, v2}, Lcom/google/dexmaker/Local;->initialize(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    .line 290
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 291
    iget-object v3, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/Local;

    sub-int v6, v4, v2

    .line 292
    invoke-static {v6}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->make(I)Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    move-result-object v12

    .line 293
    invoke-virtual {v5, v4}, Lcom/google/dexmaker/Local;->initialize(I)I

    move-result v6

    add-int/2addr v4, v6

    .line 294
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    iget-object v7, v5, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v7, v7, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v7}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMoveParam(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v8

    iget-object v9, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {v5}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v10

    sget-object v11, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-object v7, v6

    invoke-direct/range {v7 .. v12}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 297
    :cond_1
    iget-object v2, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/Label;

    iget-object v2, v2, Lcom/google/dexmaker/Label;->instructions:Ljava/util/List;

    invoke-interface {v2, v1, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    return-void

    .line 281
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public instanceOfType(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/TypeId;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/Local<",
            "*>;",
            "Lcom/google/dexmaker/TypeId<",
            "*>;)V"
        }
    .end annotation

    .line 706
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->INSTANCE_OF:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p3, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p2, 0x1

    .line 708
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method public varargs invokeDirect(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/MethodId<",
            "TD;TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;",
            "Lcom/google/dexmaker/Local<",
            "+TD;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 661
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/MethodId;->prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opInvokeDirect(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/Code;->invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public varargs invokeInterface(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/MethodId<",
            "TD;TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;",
            "Lcom/google/dexmaker/Local<",
            "+TD;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 686
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/MethodId;->prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opInvokeInterface(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/Code;->invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public varargs invokeStatic(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/MethodId<",
            "*TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 633
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/MethodId;->prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opInvokeStatic(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/Code;->invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public varargs invokeSuper(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/MethodId<",
            "TD;TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;",
            "Lcom/google/dexmaker/Local<",
            "+TD;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 673
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/MethodId;->prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opInvokeSuper(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/Code;->invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public varargs invokeVirtual(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/MethodId<",
            "TD;TR;>;",
            "Lcom/google/dexmaker/Local<",
            "-TR;>;",
            "Lcom/google/dexmaker/Local<",
            "+TD;>;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 647
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/MethodId;->prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opInvokeVirtual(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/Code;->invoke(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void
.end method

.method public iput(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/FieldId<",
            "TD;TV;>;",
            "Lcom/google/dexmaker/Local<",
            "TD;>;",
            "Lcom/google/dexmaker/Local<",
            "TV;>;)V"
        }
    .end annotation

    .line 588
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v0, p3, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opPutField(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p3, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p1, Lcom/google/dexmaker/FieldId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public jump(Lcom/google/dexmaker/Label;)V
    .locals 5

    .line 348
    invoke-direct {p0, p1}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 349
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GOTO:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0, p1}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/Label;)V

    return-void
.end method

.method public loadConstant(Lcom/google/dexmaker/Local;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "TT;>;TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 477
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_OBJECT_NOTHROW:Lcom/google/dexmaker/dx/rop/code/Rop;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opConst(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    :goto_0
    move-object v2, v0

    .line 480
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result v0

    const/4 v7, 0x1

    if-ne v0, v7, :cond_1

    .line 481
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;

    iget-object v3, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    sget-object v5, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-static {p2}, Lcom/google/dexmaker/Constants;->getConstant(Ljava/lang/Object;)Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/rop/code/PlainCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    goto :goto_1

    .line 484
    :cond_1
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v3, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v4, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    iget-object v5, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-static {p2}, Lcom/google/dexmaker/Constants;->getConstant(Ljava/lang/Object;)Lcom/google/dexmaker/dx/rop/cst/TypedConstant;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    .line 486
    invoke-direct {p0, p1, v7}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    :goto_1
    return-void
.end method

.method public mark(Lcom/google/dexmaker/Label;)V
    .locals 1

    .line 332
    invoke-direct {p0, p1}, Lcom/google/dexmaker/Code;->adopt(Lcom/google/dexmaker/Label;)V

    .line 333
    iget-boolean v0, p1, Lcom/google/dexmaker/Label;->marked:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 336
    iput-boolean v0, p1, Lcom/google/dexmaker/Label;->marked:Z

    .line 337
    iget-object v0, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/Code;->jump(Lcom/google/dexmaker/Label;)V

    .line 340
    :cond_0
    iput-object p1, p0, Lcom/google/dexmaker/Code;->currentLabel:Lcom/google/dexmaker/Label;

    return-void

    .line 334
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "already marked"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public monitorEnter(Lcom/google/dexmaker/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 848
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    iget-object v3, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public monitorExit(Lcom/google/dexmaker/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 856
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    iget-object v3, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public move(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 494
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMove(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public newArray(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/Local<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 782
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v0, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opNewArray(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object p2, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v5, p2, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p2, 0x1

    .line 784
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method public varargs newInstance(Lcom/google/dexmaker/Local;Lcom/google/dexmaker/MethodId;[Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/MethodId<",
            "TT;",
            "Ljava/lang/Void;",
            ">;[",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 619
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEW_INSTANCE:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v0, p2, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    iget-object v5, v0, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 v0, 0x1

    .line 621
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    const/4 v0, 0x0

    .line 622
    invoke-virtual {p0, p2, v0, p1, p3}, Lcom/google/dexmaker/Code;->invokeDirect(Lcom/google/dexmaker/MethodId;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;[Lcom/google/dexmaker/Local;)V

    return-void

    .line 617
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public newLocal(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/TypeId<",
            "TT;>;)",
            "Lcom/google/dexmaker/Local<",
            "TT;>;"
        }
    .end annotation

    .line 229
    iget-boolean v0, p0, Lcom/google/dexmaker/Code;->localsInitialized:Z

    if-nez v0, :cond_0

    .line 232
    invoke-static {p0, p1}, Lcom/google/dexmaker/Local;->get(Lcom/google/dexmaker/Code;Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Local;

    move-result-object p1

    .line 233
    iget-object v0, p0, Lcom/google/dexmaker/Code;->locals:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 230
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot allocate locals after adding instructions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public op(Lcom/google/dexmaker/BinaryOp;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/BinaryOp;",
            "Lcom/google/dexmaker/Local<",
            "TT1;>;",
            "Lcom/google/dexmaker/Local<",
            "TT1;>;",
            "Lcom/google/dexmaker/Local<",
            "TT2;>;)V"
        }
    .end annotation

    .line 515
    iget-object v0, p3, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    iget-object v1, p4, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->make(Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/BinaryOp;->rop(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    .line 516
    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-virtual {p4}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p3

    .line 518
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p4

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 519
    new-instance p4, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v0, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-direct {p4, p1, v0, p2, p3}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, p4}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    goto :goto_0

    .line 521
    :cond_0
    new-instance p4, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {p4, p1, v1, p3, v2}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, p4}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    .line 522
    invoke-direct {p0, p2, v0}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    :goto_0
    return-void
.end method

.method public op(Lcom/google/dexmaker/UnaryOp;Lcom/google/dexmaker/Local;Lcom/google/dexmaker/Local;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/UnaryOp;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;",
            "Lcom/google/dexmaker/Local<",
            "TT;>;)V"
        }
    .end annotation

    .line 504
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p3, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    invoke-virtual {p1, v1}, Lcom/google/dexmaker/UnaryOp;->rop(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object p1

    iget-object v1, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p3

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method paramSize()I
    .locals 3

    .line 306
    iget-object v0, p0, Lcom/google/dexmaker/Code;->parameters:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/Local;

    .line 307
    invoke-virtual {v2}, Lcom/google/dexmaker/Local;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public removeCatchClause(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/Label;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lcom/google/dexmaker/Label;"
        }
    .end annotation

    .line 375
    iget-object v0, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 379
    iget-object p1, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 380
    iget-object p1, p0, Lcom/google/dexmaker/Code;->catchTypes:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/google/dexmaker/Code;->toTypeList(Ljava/util/List;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 381
    iget-object p1, p0, Lcom/google/dexmaker/Code;->catchLabels:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/Label;

    return-object p1

    .line 377
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No catch clause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public returnValue(Lcom/google/dexmaker/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "*>;)V"
        }
    .end annotation

    .line 826
    iget-object v0, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object v1, v1, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 831
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    iget-object v1, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v1, v1, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/code/Rops;->opReturn(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void

    .line 828
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "declared "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object v2, v2, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " but returned "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public returnVoid()V
    .locals 5

    .line 812
    iget-object v0, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object v0, v0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    sget-object v1, Lcom/google/dexmaker/TypeId;->VOID:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 816
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_VOID:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    const/4 v3, 0x0

    sget-object v4, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void

    .line 813
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "declared "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->method:Lcom/google/dexmaker/MethodId;

    iget-object v2, v2, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " but returned void"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public sget(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/FieldId<",
            "*TV;>;",
            "Lcom/google/dexmaker/Local<",
            "TV;>;)V"
        }
    .end annotation

    .line 596
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v0, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opGetStatic(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    sget-object v3, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p1, Lcom/google/dexmaker/FieldId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    const/4 p1, 0x1

    .line 598
    invoke-direct {p0, p2, p1}, Lcom/google/dexmaker/Code;->moveResult(Lcom/google/dexmaker/Local;Z)V

    return-void
.end method

.method public sput(Lcom/google/dexmaker/FieldId;Lcom/google/dexmaker/Local;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/dexmaker/FieldId<",
            "*TV;>;",
            "Lcom/google/dexmaker/Local<",
            "TV;>;)V"
        }
    .end annotation

    .line 605
    new-instance v6, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    iget-object v0, p2, Lcom/google/dexmaker/Local;->type:Lcom/google/dexmaker/TypeId;

    iget-object v0, v0, Lcom/google/dexmaker/TypeId;->ropType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opPutStatic(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p2}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    iget-object v5, p1, Lcom/google/dexmaker/FieldId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;Lcom/google/dexmaker/dx/rop/cst/Constant;)V

    invoke-direct {p0, v6}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method public throwValue(Lcom/google/dexmaker/Local;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/Local<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 388
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->THROW:Lcom/google/dexmaker/dx/rop/code/Rop;

    iget-object v2, p0, Lcom/google/dexmaker/Code;->sourcePosition:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    invoke-virtual {p1}, Lcom/google/dexmaker/Local;->spec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    iget-object v3, p0, Lcom/google/dexmaker/Code;->catches:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    invoke-direct {p0, v0}, Lcom/google/dexmaker/Code;->addInstruction(Lcom/google/dexmaker/dx/rop/code/Insn;)V

    return-void
.end method

.method toBasicBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;
    .locals 3

    .line 863
    iget-boolean v0, p0, Lcom/google/dexmaker/Code;->localsInitialized:Z

    if-nez v0, :cond_0

    .line 864
    invoke-virtual {p0}, Lcom/google/dexmaker/Code;->initializeLocals()V

    .line 867
    :cond_0
    invoke-direct {p0}, Lcom/google/dexmaker/Code;->cleanUpLabels()V

    .line 869
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    iget-object v1, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;-><init>(I)V

    const/4 v1, 0x0

    .line 870
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 871
    iget-object v2, p0, Lcom/google/dexmaker/Code;->labels:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/Label;

    invoke-virtual {v2}, Lcom/google/dexmaker/Label;->toBasicBlock()Lcom/google/dexmaker/dx/rop/code/BasicBlock;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->set(ILcom/google/dexmaker/dx/rop/code/BasicBlock;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
