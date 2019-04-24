.class Lcom/shopkick/app/registration/VerifyPhoneScreen$1;
.super Ljava/lang/Object;
.source "VerifyPhoneScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/VerifyPhoneScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-boolean v0, v0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getVerificationSMSSent()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    const-class v0, Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 180
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    invoke-static {p1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->access$000(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V

    goto :goto_0

    .line 182
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

    if-ne p1, v0, :cond_3

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    const-class v0, Lcom/shopkick/app/account/ChangePhoneScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 185
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->disclaimerClickHere:Landroid/widget/TextView;

    if-ne p1, v0, :cond_4

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object p1, p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 187
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->haveCodeLink:Landroid/widget/TextView;

    if-ne p1, v0, :cond_5

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    const-class v0, Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    .line 191
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;->this$0:Lcom/shopkick/app/registration/VerifyPhoneScreen;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    return-void
.end method
