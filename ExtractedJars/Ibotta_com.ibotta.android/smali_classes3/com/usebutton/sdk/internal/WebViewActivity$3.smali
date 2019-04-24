.class Lcom/usebutton/sdk/internal/WebViewActivity$3;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->onBottomSheetReady(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

.field final synthetic val$expand:Z


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;Z)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iput-boolean p2, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->val$expand:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 6

    .line 253
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$400(Lcom/usebutton/sdk/internal/WebViewActivity;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 257
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$500(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    .line 260
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    .line 261
    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$400(Lcom/usebutton/sdk/internal/WebViewActivity;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 263
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-boolean v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->val$expand:Z

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$300(Lcom/usebutton/sdk/internal/WebViewActivity;Z)V

    return v2

    .line 267
    :cond_1
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    .line 268
    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    sget v4, Lcom/usebutton/sdk/R$id;->web_chrome:I

    invoke-virtual {v3, v4}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 269
    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/WebViewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/usebutton/sdk/R$dimen;->btn_card_vertical_margin:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    neg-float v4, v4

    const/high16 v5, 0x41000000    # 8.0f

    mul-float v4, v4, v5

    .line 274
    iget-object v5, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v5}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$500(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    move-result-object v5

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getItemCount()I

    move-result v5

    if-ne v5, v2, :cond_2

    .line 275
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    .line 276
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v5, Lcom/usebutton/sdk/R$dimen;->btn_card_recycler_view_vertical_margin:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x10

    int-to-float v1, v1

    add-float/2addr v4, v1

    .line 280
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setAlwaysPeekSheet(Z)V

    goto :goto_0

    .line 282
    :cond_2
    iget-object v5, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v5, v5, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v5, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setAlwaysPeekSheet(Z)V

    .line 285
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    add-float/2addr v0, v3

    add-float/2addr v0, v4

    invoke-virtual {v1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setPeekSheetTranslation(F)V

    .line 286
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setMaxTranslationOffset(F)V

    .line 288
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->val$expand:Z

    if-eqz v0, :cond_3

    .line 289
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->expandSheet()V

    goto :goto_1

    .line 291
    :cond_3
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$3;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    :goto_1
    return v2
.end method
