.class Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "WithdrawListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->initLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;

.field final synthetic val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->access$000(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;)Lcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v2

    invoke-static {v0, p1, v1, v2}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;->access$100(Lcom/ibotta/android/mvp/ui/view/account/withdraw/WithdrawListView;ILcom/ibotta/android/mvp/ui/activity/account/withdraw/WithdrawAdapter;I)I

    move-result p1

    return p1
.end method
