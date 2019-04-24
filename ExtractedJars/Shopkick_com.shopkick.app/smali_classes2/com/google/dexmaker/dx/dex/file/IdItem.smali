.class public abstract Lcom/google/dexmaker/dx/dex/file/IdItem;
.super Lcom/google/dexmaker/dx/dex/file/IndexedItem;
.source "IdItem.java"


# instance fields
.field private final type:Lcom/google/dexmaker/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstType;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/google/dexmaker/dx/dex/file/IndexedItem;-><init>()V

    if-eqz p1, :cond_0

    .line 42
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/IdItem;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "type == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 1

    .line 48
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object p1

    .line 49
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/IdItem;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->intern(Lcom/google/dexmaker/dx/rop/cst/CstType;)Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    return-void
.end method

.method public final getDefiningClass()Lcom/google/dexmaker/dx/rop/cst/CstType;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/IdItem;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object v0
.end method
