.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "AutofillSaveCard.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;,
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;
    }
.end annotation


# static fields
.field public static final CARD_TYPE_SAVE:Ljava/lang/String; = "save"

.field public static final CARD_TYPE_UPDATE:Ljava/lang/String; = "update"


# instance fields
.field protected declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field protected displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected displayTitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected email:Lcom/usebutton/sdk/internal/models/Text;

.field protected emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected isUpdateCard:Z

.field private listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

.field protected name:Lcom/usebutton/sdk/internal/models/Text;

.field protected nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected primaryColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field protected saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field protected shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

.field protected shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)V
    .locals 1

    .line 47
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 48
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->isUpdateCard:Z

    .line 49
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 50
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 51
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 52
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$500(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    .line 53
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$600(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 54
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$700(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    .line 55
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$800(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 56
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$900(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

    .line 57
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$1000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 58
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$1100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 59
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$1200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->primaryColor:I

    .line 60
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->access$1300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    return-object p0
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 11
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 77
    sget v0, Lcom/usebutton/sdk/R$id;->view_topbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 78
    sget v1, Lcom/usebutton/sdk/R$id;->tv_display_title:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 79
    sget v2, Lcom/usebutton/sdk/R$id;->tv_display_subtitle:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 80
    sget v3, Lcom/usebutton/sdk/R$id;->tv_name:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 81
    sget v4, Lcom/usebutton/sdk/R$id;->tv_subtitle_name:I

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 82
    sget v5, Lcom/usebutton/sdk/R$id;->tv_email:I

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 83
    sget v6, Lcom/usebutton/sdk/R$id;->tv_subtitle_email:I

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 84
    sget v7, Lcom/usebutton/sdk/R$id;->tv_shipping_address:I

    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 85
    sget v8, Lcom/usebutton/sdk/R$id;->tv_subtitle_shipping_address:I

    .line 86
    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 87
    sget v9, Lcom/usebutton/sdk/R$id;->bt_cta_accept:I

    invoke-virtual {p1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    .line 88
    sget v10, Lcom/usebutton/sdk/R$id;->tv_cta_decline:I

    invoke-virtual {p1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 90
    iget v10, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->primaryColor:I

    invoke-virtual {v0, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 94
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v4}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 98
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 99
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v5}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v6}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 106
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v7}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v8}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 114
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 115
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v9}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 119
    iget v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->primaryColor:I

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 120
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 122
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;)V

    invoke-virtual {v9, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$2;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 66
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 68
    iget-boolean v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;->isUpdateCard:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 69
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_view_autofill_savecard_update:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 72
    :cond_0
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_view_autofill_savecard:I

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
