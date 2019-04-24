.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
.super Ljava/lang/Object;
.source "AutofillFillCard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private address:Lcom/usebutton/sdk/internal/models/Text;

.field private addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private context:Landroid/content/Context;

.field private cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

.field private ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field private email:Lcom/usebutton/sdk/internal/models/Text;

.field private emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

.field private name:Lcom/usebutton/sdk/internal/models/Text;

.field private nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private primaryColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    .line 154
    iput-object p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    .line 156
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget p5, Lcom/usebutton/sdk/R$color;->btn_autofill_light:I

    invoke-static {p1, p5}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    .line 157
    new-instance p5, Lcom/usebutton/sdk/internal/models/Text;

    invoke-direct {p5, p1, p2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object p5, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->name:Lcom/usebutton/sdk/internal/models/Text;

    .line 158
    new-instance p2, Lcom/usebutton/sdk/internal/models/Text;

    invoke-direct {p2, p1, p3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->email:Lcom/usebutton/sdk/internal/models/Text;

    .line 159
    new-instance p2, Lcom/usebutton/sdk/internal/models/Text;

    invoke-direct {p2, p1, p4}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->address:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->title:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)I
    .locals 0

    .line 123
    iget p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->primaryColor:I

    return p0
.end method

.method static synthetic access$1100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->name:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->email:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->address:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$800(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;
    .locals 0

    .line 123
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;
    .locals 5

    .line 230
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/R$color;->btn_autofill_light:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 231
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v2, Lcom/usebutton/sdk/R$color;->btn_autofill_dark:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 233
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->title:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_0

    .line 234
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_title:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 237
    :cond_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_1

    .line 238
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_name:I

    .line 240
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 242
    :cond_1
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_2

    .line 243
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_email:I

    .line 244
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 247
    :cond_2
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v2, :cond_3

    .line 248
    new-instance v2, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_subtitle_address:I

    .line 249
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 252
    :cond_3
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_4

    .line 253
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$color;->btn_white:I

    .line 254
    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v4, Lcom/usebutton/sdk/R$string;->btn_autofill_card_label_accept:I

    .line 255
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 257
    :cond_4
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_5

    .line 258
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$string;->btn_autofill_card_label_decline:I

    .line 260
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 262
    :cond_5
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    if-nez v0, :cond_6

    .line 263
    new-instance v0, Lcom/usebutton/sdk/internal/models/Text;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v3, Lcom/usebutton/sdk/R$string;->btn_autofill_card_label_cta:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/models/Text;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 266
    :cond_6
    iget v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->primaryColor:I

    if-nez v0, :cond_7

    .line 267
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->context:Landroid/content/Context;

    sget v1, Lcom/usebutton/sdk/R$color;->btn_autofill_primary_default:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->primaryColor:I

    .line 270
    :cond_7
    new-instance v0, Lcom/usebutton/sdk/purchasepath/CallToAction;

    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_ic_autofill:I

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 272
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->primaryColor:I

    invoke-direct {v0, v1, v2, v3}, Lcom/usebutton/sdk/purchasepath/CallToAction;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->cta:Lcom/usebutton/sdk/purchasepath/CallToAction;

    .line 276
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$1;)V

    return-object v0
.end method

.method public setAcceptButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 199
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setAddressSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 190
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setCtaLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 225
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->ctaLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setDeclineButtonLabel(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 207
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setEmailSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 182
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setNameSubtitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 174
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method

.method public setPrimaryColor(I)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 215
    iput p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->primaryColor:I

    return-object p0
.end method

.method public setTitle(Lcom/usebutton/sdk/internal/models/Text;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 166
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->title:Lcom/usebutton/sdk/internal/models/Text;

    return-object p0
.end method
