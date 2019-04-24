.class public final Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;
.super Ljava/lang/Object;
.source "DexTranslationAdvice.java"

# interfaces
.implements Lcom/google/dexmaker/dx/rop/code/TranslationAdvice;


# static fields
.field private static final MIN_INVOKE_IN_ORDER:I = 0x6

.field public static final NO_SOURCES_IN_ORDER:Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;

.field public static final THE_ONE:Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;


# instance fields
.field private final disableSourcesInOrder:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;

    .line 33
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;-><init>(Z)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->NO_SOURCES_IN_ORDER:Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->disableSourcesInOrder:Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-boolean p1, p0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->disableSourcesInOrder:Z

    return-void
.end method

.method private totalRopWidth(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)I
    .locals 4

    .line 116
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 120
    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getCategory()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method


# virtual methods
.method public getMaxOptimalRegisterCount()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public hasConstantOperation(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 3

    .line 59
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sget-object v1, Lcom/google/dexmaker/dx/rop/type/Type;->INT:Lcom/google/dexmaker/dx/rop/type/Type;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 64
    :cond_0
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object v0

    instance-of v0, v0, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    if-nez v0, :cond_2

    .line 66
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p3

    instance-of p3, p3, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result p1

    const/16 p3, 0xf

    if-ne p1, p3, :cond_1

    .line 68
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    .line 69
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->fitsIn16Bits()Z

    move-result p1

    return p1

    :cond_1
    return v2

    .line 75
    :cond_2
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getTypeBearer()Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p2

    check-cast p2, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    .line 77
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    return v2

    .line 91
    :pswitch_1
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->fitsIn8Bits()Z

    move-result p1

    return p1

    .line 94
    :pswitch_2
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result p1

    neg-int p1, p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->make(I)Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->fitsIn16Bits()Z

    move-result p1

    return p1

    .line 86
    :pswitch_3
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->fitsIn16Bits()Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public requiresSourcesInOrder(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->disableSourcesInOrder:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->isCallLike()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lcom/google/dexmaker/dx/rop/code/DexTranslationAdvice;->totalRopWidth(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)I

    move-result p1

    const/4 p2, 0x6

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
