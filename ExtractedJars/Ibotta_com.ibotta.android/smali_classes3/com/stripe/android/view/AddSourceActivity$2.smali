.class Lcom/stripe/android/view/AddSourceActivity$2;
.super Ljava/lang/Object;
.source "AddSourceActivity.java"

# interfaces
.implements Lcom/stripe/android/SourceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/AddSourceActivity;->onActionSave()V
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

    .line 138
    iput-object p1, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Exception;)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/AddSourceActivity;->setCommunicatingProgress(Z)V

    .line 144
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/AddSourceActivity;->showError(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/stripe/android/model/Source;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-static {v0}, Lcom/stripe/android/view/AddSourceActivity;->access$000(Lcom/stripe/android/view/AddSourceActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/view/AddSourceActivity;->access$100(Lcom/stripe/android/view/AddSourceActivity;Lcom/stripe/android/model/StripePaymentSource;)V

    goto :goto_0

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity$2;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/view/AddSourceActivity;->access$200(Lcom/stripe/android/view/AddSourceActivity;Lcom/stripe/android/model/Source;)V

    :goto_0
    return-void
.end method
