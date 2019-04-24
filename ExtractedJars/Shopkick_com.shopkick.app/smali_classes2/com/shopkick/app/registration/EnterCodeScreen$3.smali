.class Lcom/shopkick/app/registration/EnterCodeScreen$3;
.super Ljava/lang/Object;
.source "EnterCodeScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/EnterCodeScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/registration/EnterCodeScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/registration/EnterCodeScreen;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/EnterCodeScreen;->resendCodeDialog:Landroid/app/AlertDialog;

    if-ne p1, v0, :cond_1

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->resendCodeDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 225
    :pswitch_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x41

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 v0, 0x1b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 227
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p2, p2, Lcom/shopkick/app/registration/EnterCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, ""

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v2, 0x7f1102b0

    .line 232
    invoke-virtual {v1, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 230
    invoke-static {p2, v0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    if-eqz p1, :cond_0

    .line 239
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p2, p2, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 241
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    invoke-direct {p2}, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;-><init>()V

    iput-object p2, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    .line 242
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p2, p2, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 222
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$3;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$200(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
