.class Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ChangeQuantityActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity_ViewBinding$2;->val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->onIncrementClicked()V

    return-void
.end method
