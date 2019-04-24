.class Lcom/stripe/android/view/StripeActivity$2;
.super Ljava/lang/Object;
.source "StripeActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/StripeActivity;->showError(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/StripeActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/StripeActivity;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity$2;->this$0:Lcom/stripe/android/view/StripeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 138
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
