.class public Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;
.super Ljava/lang/Object;
.source "ImRedemptionActionImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;
.implements Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final collaborators:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private final redeemPreFlightHelper:Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/app/config/AppConfig;Landroid/app/Activity;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->collaborators:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    .line 51
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->redeemPreFlightHelper:Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    .line 52
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 53
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private hasActiveOfferForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object p1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->redeemPreFlightHelper:Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hasActiveOfferForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method static synthetic lambda$showPendingConnectionDialog$0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 149
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private showConnectedAccountDialog(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;)V
    .locals 5

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getImDataDisclaimerRetailers()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 108
    new-instance v1, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;Z)V

    .line 109
    new-instance p2, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;

    .line 110
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 112
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImDisclaimerHelper;->getDisclaimerText(Lcom/ibotta/android/util/AppHelper;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v2, v3, p1, v1}, Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->collaborators:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;->createConnectedAccountDialog(Landroid/content/Context;)Lcom/ibotta/android/view/ImConnectedAccountDialog;

    move-result-object p1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-virtual {p1, p2, v0, p0}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->setup(Lcom/ibotta/android/views/im/connection/ImConnectedDialogViewState;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/view/ImConnectedAccountDialog$ImConnectedAccountDialogListener;)V

    .line 117
    invoke-virtual {p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;->show()V

    return-void
.end method

.method private showConnectedAccountFullModalMessage(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 121
    new-instance v0, Lcom/ibotta/android/routing/intent/ImConnectedIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/routing/intent/ImConnectedIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImConnectedIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private showIbottaCareWebView()V
    .locals 2

    .line 139
    new-instance v0, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 140
    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getLoyaltyCardLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->forUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/WebViewBrowserIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private showImConnect(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 159
    new-instance v0, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImConnectIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private showImErrorDetail(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 154
    new-instance v0, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ImErrorIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private showNoActivatedOffersDialog()V
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->collaborators:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;->createNoActivatedOffersDialog(Landroid/content/Context;)Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->show()V

    return-void
.end method

.method private showPendingConnectionDialog()V
    .locals 3

    .line 146
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f11037c

    .line 147
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f11037b

    .line 148
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 149
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImRedemptionActionImpl$LP6B6zI0B3KADdSzqdb18jxDneo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImRedemptionActionImpl$LP6B6zI0B3KADdSzqdb18jxDneo;

    const v2, 0x104000a

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 150
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public contactIbottaCare()V
    .locals 0

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showIbottaCareWebView()V

    return-void
.end method

.method public onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/api/model/customer/Customer;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 59
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object p2

    .line 58
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p2

    .line 61
    invoke-direct {p0, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->hasActiveOfferForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Z

    move-result p3

    .line 63
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl$1;->$SwitchMap$com$ibotta$api$model$im$ImConnectionStatus:[I

    invoke-virtual {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    .line 89
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showImConnect(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 84
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showImErrorDetail(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 78
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showPendingConnectionDialog()V

    goto :goto_0

    :pswitch_2
    if-nez p3, :cond_0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showNoActivatedOffersDialog()V

    goto :goto_0

    .line 68
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->isReceiptFallbackEnabled()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showConnectedAccountFullModalMessage(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->showConnectedAccountDialog(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public showGallery(I)V
    .locals 2

    .line 132
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x1

    .line 133
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->bringToFront(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 134
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionImpl;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
