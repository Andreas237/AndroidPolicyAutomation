.class Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ProductsModuleView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 40
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductsModuleView;->onViewAllClicked()V

    return-void
.end method
