.class public abstract Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;
.super Ljava/lang/Object;
.source "AbstractMyRetailersRow.java"


# instance fields
.field private index:I

.field private moduleIndex:Ljava/lang/Integer;

.field private moduleName:Ljava/lang/String;

.field private final myRetailersRowType:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->myRetailersRowType:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->index:I

    return v0
.end method

.method public getModuleIndex()Ljava/lang/Integer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->moduleIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->myRetailersRowType:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public setIndex(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->index:I

    return-void
.end method

.method public setModuleIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->moduleIndex:Ljava/lang/Integer;

    return-void
.end method

.method public setModuleName(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->moduleName:Ljava/lang/String;

    return-void
.end method
