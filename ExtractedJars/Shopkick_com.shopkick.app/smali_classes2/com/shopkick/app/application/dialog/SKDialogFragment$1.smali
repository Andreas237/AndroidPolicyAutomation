.class Lcom/shopkick/app/application/dialog/SKDialogFragment$1;
.super Ljava/lang/Object;
.source "SKDialogFragment.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/dialog/SKDialogFragment;->showButtonsVerticallyIfNoRoom()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

.field final synthetic val$pxBtnSpacing:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/dialog/SKDialogFragment;I)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    iput p2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->val$pxBtnSpacing:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$000(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$000(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$100(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v1

    .line 180
    iget-object v2, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$200(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v2

    .line 181
    iget-object v3, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v3}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$300(Lcom/shopkick/app/application/dialog/SKDialogFragment;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/widget/SKTextView;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    if-lez v1, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-lez v2, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-lez v3, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/2addr v5, v4

    .line 194
    iget v4, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->val$pxBtnSpacing:I

    mul-int/2addr v5, v4

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    add-int/2addr v1, v5

    if-lt v1, v0, :cond_3

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$1;->this$0:Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-static {v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->access$400(Lcom/shopkick/app/application/dialog/SKDialogFragment;)V

    :cond_3
    return-void
.end method
