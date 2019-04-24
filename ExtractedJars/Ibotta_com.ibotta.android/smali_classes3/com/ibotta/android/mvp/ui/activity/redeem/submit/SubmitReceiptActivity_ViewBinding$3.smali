.class Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SubmitReceiptActivity_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;->val$target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->onCancelClicked()V

    return-void
.end method
