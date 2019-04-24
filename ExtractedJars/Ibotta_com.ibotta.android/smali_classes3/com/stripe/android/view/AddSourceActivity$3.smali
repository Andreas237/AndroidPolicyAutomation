.class Lcom/stripe/android/view/AddSourceActivity$3;
.super Ljava/lang/Object;
.source "AddSourceActivity.java"

# interfaces
.implements Lcom/stripe/android/CustomerSession$SourceRetrievalListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/AddSourceActivity;->attachCardToCustomer(Lcom/stripe/android/model/StripePaymentSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/AddSourceActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/AddSourceActivity;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/stripe/android/view/AddSourceActivity$3;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 170
    iget-object p1, p0, Lcom/stripe/android/view/AddSourceActivity$3;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/AddSourceActivity;->setCommunicatingProgress(Z)V

    return-void
.end method

.method public onSourceRetrieved(Lcom/stripe/android/model/Source;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Source;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 163
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$3;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/view/AddSourceActivity;->access$200(Lcom/stripe/android/view/AddSourceActivity;Lcom/stripe/android/model/Source;)V

    return-void
.end method
