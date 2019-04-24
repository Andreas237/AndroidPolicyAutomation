.class Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;
.super Ljava/lang/Object;
.source "ProductSummaryView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->initLayout(Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;->access$100(Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView;)Lcom/ibotta/api/model/ProductModel;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductSummaryView$ProductSummaryListener;->onProductSummaryClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method
