.class Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;
.super Lcom/ibotta/android/view/common/OnGlobalLayoutListener;
.source "StandardReceiptGuideView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->setPrevReceiptBottomLineLocation(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

.field final synthetic val$prevRecContainerHFinal:I


# direct methods
.method constructor <init>(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;Landroid/view/View;I)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->this$0:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    iput p3, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->val$prevRecContainerHFinal:I

    invoke-direct {p0, p2}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 270
    invoke-super {p0}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->onGlobalLayout()V

    .line 271
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->detach()V

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->this$0:Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;

    iget v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->val$prevRecContainerHFinal:I

    invoke-static {v0, v1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->access$000(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;I)V

    return-void
.end method
