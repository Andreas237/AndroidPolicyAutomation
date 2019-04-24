.class public final Lcom/google/dexmaker/dx/dex/file/HeaderSection;
.super Lcom/google/dexmaker/dx/dex/file/UniformItemSection;
.source "HeaderSection.java"


# instance fields
.field private final list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/dexmaker/dx/dex/file/HeaderItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/dex/file/DexFile;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 38
    invoke-direct {p0, v0, p1, v1}, Lcom/google/dexmaker/dx/dex/file/UniformItemSection;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/dex/file/DexFile;I)V

    .line 40
    new-instance p1, Lcom/google/dexmaker/dx/dex/file/HeaderItem;

    invoke-direct {p1}, Lcom/google/dexmaker/dx/dex/file/HeaderItem;-><init>()V

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/dex/file/HeaderItem;->setIndex(I)V

    .line 43
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/HeaderSection;->list:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public get(Lcom/google/dexmaker/dx/rop/cst/Constant;)Lcom/google/dexmaker/dx/dex/file/IndexedItem;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public items()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lcom/google/dexmaker/dx/dex/file/Item;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/HeaderSection;->list:Ljava/util/List;

    return-object v0
.end method

.method protected orderItems()V
    .locals 0

    return-void
.end method
