.class public abstract Lo/agv;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private productList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agv;->productList:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 19
    iget-object v0, p0, Lo/agv;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/agv;->productList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 29
    int-to-long v0, p1

    return-wide v0
.end method

.method public getProductList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afa;>;)V"
        }
    .end annotation

    .line 14
    iput-object p1, p0, Lo/agv;->productList:Ljava/util/ArrayList;

    .line 15
    return-void
.end method
