.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
.super Ljava/lang/Object;
.source "AutofillExtension.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;
    }
.end annotation


# static fields
.field static final AUTOFILL_CARD_KEY:Ljava/lang/String; = "btn_autofill_card_key"
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AutofillExtension"


# instance fields
.field private final autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

.field private final buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field private final context:Landroid/content/Context;

.field private fillFields:Lorg/json/JSONObject;

.field private final listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;Lcom/usebutton/sdk/internal/ButtonRepository;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 51
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 52
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    return-void
.end method

.method private hasAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;)Z
    .locals 1

    const-string v0, "btn_autofill_card_key"

    .line 156
    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private hideAutofillCards(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 103
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->hasAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    const-string p2, "btn_autofill_card_key"

    .line 105
    invoke-interface {p1, p2}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cacheFillFields(Lorg/json/JSONObject;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->fillFields:Lorg/json/JSONObject;

    return-void
.end method

.method public displayAutofillFillCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 9

    .line 114
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 119
    :cond_0
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->hasAutofillCard(Lcom/usebutton/sdk/purchasepath/CardList;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "btn_autofill_card_key"

    .line 120
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    .line 123
    :cond_1
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserImpl;->getProfile()Lcom/usebutton/sdk/internal/user/UserProfile;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    .line 126
    :cond_2
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->hasUserDataForFillCard()Z

    move-result v2

    if-nez v2, :cond_3

    return-void

    .line 128
    :cond_3
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFullName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getFullName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    const-string v2, ""

    :goto_0
    move-object v5, v2

    .line 129
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getEmail()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_5
    const-string v2, ""

    :goto_1
    move-object v6, v2

    .line 131
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/user/UserProfile;->getAddressLineOne()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_6
    const-string v1, ""

    :goto_2
    move-object v7, v1

    .line 133
    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->context:Landroid/content/Context;

    move-object v3, v1

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;)V

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 140
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getPrimaryColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v2

    .line 139
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setPrimaryColor(I)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 141
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 142
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getNameLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setNameSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 143
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getEmailLabelText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setEmailSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 144
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getCardCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setCtaLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 145
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getPrimaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setAcceptButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    .line 146
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->getSecondaryActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->setDeclineButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;

    move-result-object v1

    .line 147
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->build()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    move-result-object v1

    const-string v2, "btn_autofill_card_key"

    .line 149
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->setKey(Ljava/lang/Object;)V

    .line 150
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    const/4 p1, 0x0

    .line 151
    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/purchasepath/CardList;->insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V

    .line 152
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillDisplayed()V

    return-void
.end method

.method public onAutofillFillAccepted()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->fillFields:Lorg/json/JSONObject;

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillAccepted(Lorg/json/JSONObject;)V

    return-void
.end method

.method public onAutofillFillDeclined()V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;->onAutofillFillDeclined()V

    return-void
.end method

.method public onClosed()V
    .locals 0

    return-void
.end method

.method public onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    return-void
.end method

.method public onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 0

    return-void
.end method

.method public onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 0

    return-void
.end method

.method public onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 0

    return-void
.end method

.method public onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 62
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->hideAutofillCards(Lcom/usebutton/sdk/purchasepath/CardList;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method
