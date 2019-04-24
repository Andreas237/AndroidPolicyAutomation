.class Lcom/shopkick/app/account/ChangePhoneScreen$1;
.super Ljava/lang/Object;
.source "ChangePhoneScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/ChangePhoneScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/ChangePhoneScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/ChangePhoneScreen;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePhoneScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_2

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    .line 99
    invoke-virtual {p1}, Lcom/shopkick/app/account/ChangePhoneScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    iget-boolean p1, p1, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    if-eqz p1, :cond_0

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePhoneScreen;->changePhoneError:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    iput-boolean v1, p1, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    .line 107
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ChangePhoneScreen;->access$000(Lcom/shopkick/app/account/ChangePhoneScreen;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 111
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen$1;->this$0:Lcom/shopkick/app/account/ChangePhoneScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ChangePhoneScreen;->access$100(Lcom/shopkick/app/account/ChangePhoneScreen;)V

    :cond_2
    return-void
.end method
