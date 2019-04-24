.class public Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_ViewBinding;
.super Ljava/lang/Object;
.source "RetailerRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;

    const-string v0, "field \'ivIcon\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ac

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivIcon:Landroid/widget/ImageView;

    const-string v0, "field \'ivMcommBadge\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivMcommBadge:Landroid/widget/ImageView;

    const-string v0, "field \'tvName\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvShortDescription\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090576

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    const-string v0, "field \'iibFavorite\'"

    .line 32
    const-class v1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const v2, 0x7f090245

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivIcon:Landroid/widget/ImageView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->ivMcommBadge:Landroid/widget/ImageView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvName:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->tvShortDescription:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/picker/RetailerRowView;->iibFavorite:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
