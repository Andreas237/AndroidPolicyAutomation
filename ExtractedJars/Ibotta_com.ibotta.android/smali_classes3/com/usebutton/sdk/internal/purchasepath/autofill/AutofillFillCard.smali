.class public Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "AutofillFillCard.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;,
        Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
    }
.end annotation


# static fields
.field public static final CARD_TYPE_FILL:Ljava/lang/String; = "fill"


# instance fields
.field protected acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field protected address:Lcom/usebutton/sdk/internal/models/Text;

.field protected addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

.field protected email:Lcom/usebutton/sdk/internal/models/Text;

.field protected emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

.field protected name:Lcom/usebutton/sdk/internal/models/Text;

.field protected nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field protected primaryColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field protected title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)V
    .locals 1

    .line 44
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 45
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 46
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 47
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$300(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    .line 48
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$400(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 49
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$500(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    .line 50
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$600(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 51
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$700(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->address:Lcom/usebutton/sdk/internal/models/Text;

    .line 52
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$800(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 53
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$900(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    .line 54
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$1000(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->primaryColor:I

    .line 55
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;->access$1100(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Builder;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$Listener;

    return-object p0
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 10
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 67
    sget v0, Lcom/usebutton/sdk/R$id;->view_topbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 68
    sget v1, Lcom/usebutton/sdk/R$id;->tv_title_instructions:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 69
    sget v2, Lcom/usebutton/sdk/R$id;->tv_name:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 70
    sget v3, Lcom/usebutton/sdk/R$id;->tv_subtitle_name:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 71
    sget v4, Lcom/usebutton/sdk/R$id;->tv_email:I

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 72
    sget v5, Lcom/usebutton/sdk/R$id;->tv_subtitle_email:I

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 73
    sget v6, Lcom/usebutton/sdk/R$id;->tv_address:I

    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 74
    sget v7, Lcom/usebutton/sdk/R$id;->tv_subtitle_address:I

    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 75
    sget v8, Lcom/usebutton/sdk/R$id;->bt_cta_accept:I

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Button;

    .line 76
    sget v9, Lcom/usebutton/sdk/R$id;->tv_cta_decline:I

    invoke-virtual {p1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 78
    iget v9, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->primaryColor:I

    invoke-virtual {v0, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 79
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->name:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->nameSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 85
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 86
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->email:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v4}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->emailSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v5}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 93
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 94
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->address:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->address:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v6}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->addressSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v7}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 101
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 102
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    :cond_2
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->acceptButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v8}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 106
    iget v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->primaryColor:I

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 107
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;->declineButtonLabel:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    .line 109
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)V

    instance-of v1, v8, Landroid/view/View;

    if-nez v1, :cond_3

    invoke-virtual {v8, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_3
    check-cast v8, Landroid/view/View;

    invoke-static {v8, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 115
    :goto_0
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard$2;-><init>(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillFillCard;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_4
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
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

    .line 61
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 62
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_view_autofill_fillcard:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
