.class public final Lcom/google/dexmaker/dx/io/CodeReader;
.super Ljava/lang/Object;
.source "CodeReader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/io/CodeReader$Visitor;
    }
.end annotation


# instance fields
.field private fallbackVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

.field private fieldVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

.field private methodVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

.field private stringVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

.field private typeVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fallbackVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 27
    iput-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->stringVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 28
    iput-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->typeVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 29
    iput-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fieldVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 30
    iput-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->methodVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method private callVisit([Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;)V
    .locals 2

    .line 102
    sget-object v0, Lcom/google/dexmaker/dx/io/CodeReader$1;->$SwitchMap$com$android$dx$io$IndexType:[I

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->getOpcode()I

    move-result v1

    invoke-static {v1}, Lcom/google/dexmaker/dx/io/OpcodeInfo;->getIndexType(I)Lcom/google/dexmaker/dx/io/IndexType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/io/IndexType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    .line 106
    :pswitch_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->methodVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    goto :goto_0

    .line 105
    :pswitch_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fieldVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    goto :goto_0

    .line 104
    :pswitch_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->typeVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    goto :goto_0

    .line 103
    :pswitch_3
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->stringVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    :goto_0
    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fallbackVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    :cond_0
    if-eqz v0, :cond_1

    .line 114
    invoke-interface {v0, p1, p2}, Lcom/google/dexmaker/dx/io/CodeReader$Visitor;->visit([Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public setAllVisitors(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fallbackVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 37
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->stringVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 38
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->typeVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 39
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fieldVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    .line 40
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->methodVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setFallbackVisitor(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fallbackVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setFieldVisitor(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->fieldVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setMethodVisitor(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->methodVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setStringVisitor(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->stringVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public setTypeVisitor(Lcom/google/dexmaker/dx/io/CodeReader$Visitor;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/CodeReader;->typeVisitor:Lcom/google/dexmaker/dx/io/CodeReader$Visitor;

    return-void
.end method

.method public visitAll([Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/dexmaker/dx/util/DexException;
        }
    .end annotation

    .line 81
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 84
    aget-object v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 89
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/google/dexmaker/dx/io/CodeReader;->callVisit([Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public visitAll([S)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/dexmaker/dx/util/DexException;
        }
    .end annotation

    .line 94
    invoke-static {p1}, Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;->decodeAll([S)[Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;

    move-result-object p1

    .line 96
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/io/CodeReader;->visitAll([Lcom/google/dexmaker/dx/io/instructions/DecodedInstruction;)V

    return-void
.end method
