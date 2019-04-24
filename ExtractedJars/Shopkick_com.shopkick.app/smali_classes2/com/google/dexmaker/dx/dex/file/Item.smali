.class public abstract Lcom/google/dexmaker/dx/dex/file/Item;
.super Ljava/lang/Object;
.source "Item.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract addContents(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
.end method

.method public abstract itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/dex/file/Item;->itemType()Lcom/google/dexmaker/dx/dex/file/ItemType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/dex/file/ItemType;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract writeSize()I
.end method

.method public abstract writeTo(Lcom/google/dexmaker/dx/dex/file/DexFile;Lcom/google/dexmaker/dx/util/AnnotatedOutput;)V
.end method
