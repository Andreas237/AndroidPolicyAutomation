.class Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "RebateRowView_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;->val$target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->onShopClicked()V

    return-void
.end method
