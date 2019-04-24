.class public final Lcom/google/dexmaker/dx/dex/code/PositionList;
.super Lcom/google/dexmaker/dx/util/FixedSizeList;
.source "PositionList.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/google/dexmaker/dx/dex/code/PositionList;

.field public static final IMPORTANT:I = 0x3

.field public static final LINES:I = 0x2

.field public static final NONE:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lcom/google/dexmaker/dx/dex/code/PositionList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/dexmaker/dx/dex/code/PositionList;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/PositionList;->EMPTY:Lcom/google/dexmaker/dx/dex/code/PositionList;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 120
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;-><init>(I)V

    return-void
.end method

.method public static make(Lcom/google/dexmaker/dx/dex/code/DalvInsnList;I)Lcom/google/dexmaker/dx/dex/code/PositionList;
    .locals 11

    packed-switch p1, :pswitch_data_0

    .line 69
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "bogus howMuch"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 73
    :pswitch_0
    sget-object v0, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    .line 75
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->size()I

    move-result v1

    .line 76
    new-array v2, v1, [Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    const/4 v3, 0x0

    move-object v6, v0

    move v4, v3

    move v5, v4

    move v7, v5

    :goto_0
    if-ge v4, v1, :cond_4

    .line 81
    invoke-virtual {p0, v4}, Lcom/google/dexmaker/dx/dex/code/DalvInsnList;->get(I)Lcom/google/dexmaker/dx/dex/code/DalvInsn;

    move-result-object v8

    .line 83
    instance-of v9, v8, Lcom/google/dexmaker/dx/dex/code/CodeAddress;

    if-eqz v9, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    .line 88
    :cond_0
    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v9

    .line 90
    invoke-virtual {v9, v0}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v9, v6}, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->sameLine(Lcom/google/dexmaker/dx/rop/code/SourcePosition;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x3

    if-ne p1, v10, :cond_2

    if-nez v7, :cond_2

    goto :goto_1

    .line 99
    :cond_2
    new-instance v6, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    invoke-virtual {v8}, Lcom/google/dexmaker/dx/dex/code/DalvInsn;->getAddress()I

    move-result v7

    invoke-direct {v6, v7, v9}, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;-><init>(ILcom/google/dexmaker/dx/rop/code/SourcePosition;)V

    aput-object v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    move v7, v3

    move-object v6, v9

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 105
    :cond_4
    new-instance p0, Lcom/google/dexmaker/dx/dex/code/PositionList;

    invoke-direct {p0, v5}, Lcom/google/dexmaker/dx/dex/code/PositionList;-><init>(I)V

    :goto_2
    if-ge v3, v5, :cond_5

    .line 107
    aget-object p1, v2, v3

    invoke-virtual {p0, v3, p1}, Lcom/google/dexmaker/dx/dex/code/PositionList;->set(ILcom/google/dexmaker/dx/dex/code/PositionList$Entry;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 110
    :cond_5
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/code/PositionList;->setImmutable()V

    return-object p0

    .line 61
    :pswitch_1
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/PositionList;->EMPTY:Lcom/google/dexmaker/dx/dex/code/PositionList;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public get(I)Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;
    .locals 0

    .line 132
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/dex/code/PositionList;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;

    return-object p1
.end method

.method public set(ILcom/google/dexmaker/dx/dex/code/PositionList$Entry;)V
    .locals 0

    .line 142
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/PositionList;->set0(ILjava/lang/Object;)V

    return-void
.end method
