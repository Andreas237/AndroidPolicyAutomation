.class Lcom/shopkick/app/products/ScanV2Screen$1;
.super Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;
.source "ScanV2Screen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanV2Screen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanV2Screen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanV2Screen;Landroid/content/Context;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/shopkick/app/products/ScanV2Screen$1;->this$0:Lcom/shopkick/app/products/ScanV2Screen;

    invoke-direct {p0, p2}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public canScrollVertically()Z
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/products/ScanV2Screen$1;->this$0:Lcom/shopkick/app/products/ScanV2Screen;

    invoke-static {v0}, Lcom/shopkick/app/products/ScanV2Screen;->access$000(Lcom/shopkick/app/products/ScanV2Screen;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
