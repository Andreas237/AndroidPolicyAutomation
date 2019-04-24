.class Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "MaskedCardAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;-><init>(Lcom/stripe/android/view/MaskedCardAdapter;Landroid/widget/FrameLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

.field final synthetic val$this$0:Lcom/stripe/android/view/MaskedCardAdapter;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;Lcom/stripe/android/view/MaskedCardAdapter;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

    iput-object p2, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->val$this$0:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 135
    iget-object p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

    iget-object p1, p1, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->maskedCardView:Lcom/stripe/android/view/MaskedCardView;

    invoke-virtual {p1}, Lcom/stripe/android/view/MaskedCardView;->isSelected()Z

    move-result p1

    if-nez p1, :cond_0

    .line 136
    iget-object p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

    iget-object p1, p1, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->maskedCardView:Lcom/stripe/android/view/MaskedCardView;

    invoke-virtual {p1}, Lcom/stripe/android/view/MaskedCardView;->toggleSelected()V

    .line 137
    iget-object p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

    iget-object p1, p1, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->this$0:Lcom/stripe/android/view/MaskedCardAdapter;

    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;

    iget v0, v0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->index:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/MaskedCardAdapter;->updateSelectedIndex(I)V

    :cond_0
    return-void
.end method
