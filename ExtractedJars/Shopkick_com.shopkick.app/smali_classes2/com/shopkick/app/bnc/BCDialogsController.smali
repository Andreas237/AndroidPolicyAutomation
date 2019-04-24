.class public Lcom/shopkick/app/bnc/BCDialogsController;
.super Ljava/lang/Object;
.source "BCDialogsController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;,
        Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;
    }
.end annotation


# instance fields
.field private dialogDismissListener:Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private registrationOrVerificationButton:Lcom/shopkick/app/widget/SKButton;

.field private registrationOrVerificationClickListener:Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;

.field private registrationOrVerificationToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/controllers/PhoneVerificationController;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    .line 44
    iput-object p2, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 45
    iput-object p3, p0, Lcom/shopkick/app/bnc/BCDialogsController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 46
    iput-object p4, p0, Lcom/shopkick/app/bnc/BCDialogsController;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 47
    new-instance p1, Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;-><init>(Lcom/shopkick/app/bnc/BCDialogsController;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->dialogDismissListener:Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;

    .line 48
    new-instance p1, Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;-><init>(Lcom/shopkick/app/bnc/BCDialogsController;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationClickListener:Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/bnc/BCDialogsController;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/bnc/BCDialogsController;->launchRegistrationOrVerification()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/bnc/BCDialogsController;Landroid/content/DialogInterface;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/BCDialogsController;->dismissDialogAndPopScreen(Landroid/content/DialogInterface;)V

    return-void
.end method

.method private dismissDialogAndPopScreen(Landroid/content/DialogInterface;)V
    .locals 0

    .line 157
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 160
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$showAlertWithDialogDismissClickListener$20(Lcom/shopkick/app/bnc/BCDialogsController;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    :cond_0
    return-void
.end method

.method private launchRegistrationOrVerification()V
    .locals 4

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v1

    if-nez v1, :cond_1

    .line 103
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "origin_screen"

    const/16 v3, 0x79

    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 104
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "LaunchPhoneVerificationPostRegistration"

    const/4 v3, 0x1

    .line 107
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    .line 106
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-virtual {v0, v2, v3, v1}, Lcom/shopkick/app/screens/AppScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result v0

    if-nez v0, :cond_2

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public handlingRegistrationOrVerification()Z
    .locals 4

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 73
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->dismiss()V

    :cond_2
    return v1

    .line 59
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v1

    if-nez v1, :cond_4

    const v1, 0x7f0c0059

    goto :goto_1

    :cond_4
    const v1, 0x7f0c005a

    :goto_1
    const/4 v2, 0x0

    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0904a8

    .line 64
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationButton:Lcom/shopkick/app/widget/SKButton;

    .line 65
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationClickListener:Lcom/shopkick/app/bnc/BCDialogsController$RegistrationOrVerificationClickListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    new-instance v1, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    iget-object v2, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/bnc/BCDialogsController;->dialogDismissListener:Lcom/shopkick/app/bnc/BCDialogsController$DialogDismissListener;

    invoke-direct {v1, v2, v0, v3}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/content/DialogInterface$OnCancelListener;)V

    iput-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->registrationOrVerificationToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->show()V

    const/4 v0, 0x1

    return v0
.end method

.method public showAlertWithDialogDismissClickListener(Ljava/lang/String;)V
    .locals 8

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 84
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/bnc/BCDialogsController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    .line 85
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    const v3, 0x7f110155

    invoke-virtual {v0, v3}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/shopkick/app/bnc/BCDialogsController;->screenRef:Ljava/lang/ref/WeakReference;

    .line 87
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    const v4, 0x7f11014f

    invoke-virtual {v0, v4}, Lcom/shopkick/app/screens/AppScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/shopkick/app/bnc/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/bnc/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    new-instance v7, Lcom/shopkick/app/bnc/-$$Lambda$BCDialogsController$kWsYU9Glt4sAW6kOQ-3sc1MIwjA;

    invoke-direct {v7, p0}, Lcom/shopkick/app/bnc/-$$Lambda$BCDialogsController$kWsYU9Glt4sAW6kOQ-3sc1MIwjA;-><init>(Lcom/shopkick/app/bnc/BCDialogsController;)V

    move-object v4, p1

    .line 84
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method
