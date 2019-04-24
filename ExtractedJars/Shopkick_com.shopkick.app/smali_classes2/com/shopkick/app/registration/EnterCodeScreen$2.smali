.class Lcom/shopkick/app/registration/EnterCodeScreen$2;
.super Ljava/lang/Object;
.source "EnterCodeScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 171
    iput-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/registration/EnterCodeScreen;->hideKeyboard()V

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/EnterCodeScreen;->haventReceivedSMSButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_2

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$100(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/account/UserAccount;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->resendCodeDialog:Landroid/app/AlertDialog;

    if-nez p1, :cond_0

    const/4 p1, 0x3

    .line 180
    new-array p1, p1, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 181
    iget-object v2, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v3, 0x7f1102aa

    invoke-virtual {v2, v3}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, p1, v1

    .line 182
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v2, 0x7f1102a2

    .line 183
    invoke-virtual {v1, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    const/4 v0, 0x2

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v2, 0x7f110140

    invoke-virtual {v1, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    .line 185
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/registration/EnterCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 186
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v1, v1, Lcom/shopkick/app/registration/EnterCodeScreen;->dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->resendCodeDialog:Landroid/app/AlertDialog;

    .line 189
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->resendCodeDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 192
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$200(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    goto :goto_0

    .line 194
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/EnterCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_3

    .line 196
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$000(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    goto :goto_0

    .line 197
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/EnterCodeScreen;->helpButton:Landroid/widget/TextView;

    if-ne p1, v0, :cond_4

    .line 198
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->showSKDeskWebview(Lcom/shopkick/app/screens/AppScreen;)V

    goto :goto_0

    .line 199
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {v0}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$300(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-ne p1, v0, :cond_5

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$400(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    goto :goto_0

    .line 201
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {v0}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$500(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    if-ne p1, v0, :cond_6

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$600(Lcom/shopkick/app/registration/EnterCodeScreen;)Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 203
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-static {v0}, Lcom/shopkick/app/registration/EnterCodeScreen;->access$700(Lcom/shopkick/app/registration/EnterCodeScreen;)Landroid/widget/TextView;

    move-result-object v0

    if-ne p1, v0, :cond_7

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    iget-object v0, p1, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x1

    const-string v2, ""

    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v3, 0x7f110750

    .line 206
    invoke-virtual {p1, v3}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen$2;->this$0:Lcom/shopkick/app/registration/EnterCodeScreen;

    const v4, 0x7f11074f

    .line 207
    invoke-virtual {p1, v4}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/shopkick/app/registration/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/registration/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v6, 0x0

    .line 204
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_7
    :goto_0
    return-void
.end method
