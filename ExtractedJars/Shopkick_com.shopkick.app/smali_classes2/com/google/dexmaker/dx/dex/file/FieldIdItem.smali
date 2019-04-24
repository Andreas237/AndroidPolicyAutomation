.class public final Lcom/google/dexmaker/dx/dex/file/FieldIdItem;
.super Lcom/google/dexmaker/dx/dex/file/MemberIdItem;
.source "FieldIdItem.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/dex/file/MemberIdItem;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;)V

    return-void
.end method


# virtual methods
.method public addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 1

    .line 43
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/dex/file/MemberIdItem;->addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V

    .line 45
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object p1

    .line 46
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/FieldIdItem;->getFieldRef()Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->intern(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/dex/file/TypeIdItem;

    return-void
.end method

.method public getFieldRef()Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;
    .locals 1

    .line 55
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/FieldIdItem;->getRef()Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    return-object v0
.end method

.method protected getTypoidIdx(Lcom/google/dexmaker/dx/dex/file/DexFile;)I
    .locals 1

    .line 61
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/dex/file/DexFile;->getTypeIds()Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;

    move-result-object p1

    .line 62
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/FieldIdItem;->getFieldRef()Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/TypeIdsSection;->indexOf(Lcom/google/dexmaker/dx/rop/type/Type;)I

    move-result p1

    return p1
.end method

.method protected getTypoidName()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type_idx"

    return-object v0
.end method

.method public itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 37
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_FIELD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method
