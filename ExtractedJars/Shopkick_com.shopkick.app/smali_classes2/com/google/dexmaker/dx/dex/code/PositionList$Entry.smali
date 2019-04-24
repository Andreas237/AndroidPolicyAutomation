.class public Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;
.super Ljava/lang/Object;
.source "PositionList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/code/PositionList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation


# instance fields
.field private final address:I

.field private final position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;


# direct methods
.method public constructor <init>(ILcom/google/dexmaker/dx/rop/code/SourcePosition;)V
    .locals 0

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    .line 170
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->address:I

    .line 171
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    return-void

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "position == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 163
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "address < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getAddress()I
    .locals 1

    .line 180
    iget v0, p0, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->address:I

    return v0
.end method

.method public getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/PositionList$Entry;->position:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    return-object v0
.end method
