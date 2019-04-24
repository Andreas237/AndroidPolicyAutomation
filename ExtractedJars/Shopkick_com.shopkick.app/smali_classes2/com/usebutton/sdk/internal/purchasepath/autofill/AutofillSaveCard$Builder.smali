.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
.super Ljava/lang/Object;
.source "AutofillSaveCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private clickListener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

.field private context:Landroid/content/Context;

.field private cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

.field private ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

.field private displayTitle:Lcom/usebutton/sdk/internal/models/Text;

.field private email:Lcom/usebutton/sdk/internal/models/Text;

.field private emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private isUpdateCard:Z

.field private name:Lcom/usebutton/sdk/internal/models/Text;

.field private nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

.field private shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    .line 163
    iput-boolean p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->isUpdateCard:Z

    .line 164
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->clickListener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Z
    .locals 0

    .line 136
    iget-boolean p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->isUpdateCard:Z

    return p0
.end method

.method static synthetic access$1000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)I
    .locals 0

    .line 136
    iget p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->primaryColor:I

    return p0
.end method

.method static synthetic access$1300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->clickListener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Listener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->name:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->email:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$800(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 136
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;
    .locals 5

    .line 266
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/R$color;->btn_autofill_light:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 267
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v2, Lcom/usebutton/sdk/R$color;->btn_autofill_dark:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 269
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_0

    .line 270
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_save_card_display_title:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 273
    :cond_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_1

    .line 274
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_save_card_display_subtitle:I

    .line 275
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 278
    :cond_1
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_2

    .line 279
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_name:I

    .line 281
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 284
    :cond_2
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_3

    .line 285
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_email:I

    .line 286
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 289
    :cond_3
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_4

    .line 290
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_shipping:I

    .line 291
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 294
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_5

    .line 295
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$color;->btn_white:I

    .line 296
    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_save_card_save:I

    .line 297
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 300
    :cond_5
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_6

    .line 301
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$string;->btn_autofill_save_card_display_no_thanks:I

    .line 303
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 305
    :cond_6
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_7

    .line 306
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$string;->btn_autofill_card_label_cta:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 309
    :cond_7
    iget v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->primaryColor:I

    if-nez v0, :cond_8

    .line 310
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/R$color;->btn_autofill_primary_default:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->primaryColor:I

    .line 313
    :cond_8
    new-instance v0, Lcom/usebutton/sdk/purchasepath/CallToAction;

    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_ic_autofill:I

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 315
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->primaryColor:I

    invoke-direct {v0, v1, v2, v3}, Lcom/usebutton/sdk/purchasepath/CallToAction;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

    .line 319
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$1;)V

    return-object v0
.end method

.method public setCtaLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 261
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setDeclineButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 243
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setDisplaySubTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 179
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displaySubTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setDisplayTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 171
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->displayTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setEmail(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 211
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->email:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setEmailSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 203
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setName(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 195
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->name:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setNameSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 187
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setPrimaryColor(I)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 251
    iput p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->primaryColor:I

    return-object p0
.end method

.method public setSaveButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 235
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->saveButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setShippingAddress(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 227
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddress:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setShippingAddressSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 219
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillSaveCard$Builder;->shippingAddressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method
