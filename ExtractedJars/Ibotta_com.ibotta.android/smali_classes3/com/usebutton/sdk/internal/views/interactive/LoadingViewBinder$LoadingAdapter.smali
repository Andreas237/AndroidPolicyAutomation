.class Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;
.super Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;
.source "LoadingViewBinder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoadingAdapter"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/InteractiveButton;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/interactive/BaseInventoryAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/InteractiveButton;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 57
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_inventory_two_line_preview:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;

    .line 58
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->showPlaceHolders()V

    .line 59
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;->getItemLayoutParams()Landroid/support/v4/view/ViewPager$LayoutParams;

    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setTag(Ljava/lang/Object;)V

    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
