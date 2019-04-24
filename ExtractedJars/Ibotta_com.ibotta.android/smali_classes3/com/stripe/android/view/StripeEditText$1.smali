.class Lcom/stripe/android/view/StripeEditText$1;
.super Ljava/lang/Object;
.source "StripeEditText.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/StripeEditText;->setHintDelayed(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/StripeEditText;

.field final synthetic val$hintResource:I


# direct methods
.method constructor <init>(Lcom/stripe/android/view/StripeEditText;I)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText$1;->this$0:Lcom/stripe/android/view/StripeEditText;

    iput p2, p0, Lcom/stripe/android/view/StripeEditText$1;->val$hintResource:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$1;->this$0:Lcom/stripe/android/view/StripeEditText;

    iget v1, p0, Lcom/stripe/android/view/StripeEditText$1;->val$hintResource:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setHint(I)V

    return-void
.end method
