.class Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;
.super Ljava/lang/Object;
.source "ProductRowView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->initRowClickHandler()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->access$000(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;->access$100(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)Lcom/ibotta/api/model/ProductModel;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView$ProductRowListener;->onProductRowClicked(Lcom/ibotta/api/model/ProductModel;)V

    :cond_0
    return-void
.end method
