.class public Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "AppInstallCard.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;
    }
.end annotation


# static fields
.field static final APP_INSTALL_CARD_KEY:Ljava/lang/String; = "btn_app_install_card"


# instance fields
.field private final appIconUrl:Landroid/net/Uri;

.field private final body:Lcom/usebutton/sdk/internal/models/Text;

.field private final imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private final listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;

.field private final primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private final primaryColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private final secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

.field private final title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method private constructor <init>(Lcom/usebutton/sdk/internal/InternalCallToAction;Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    const-string p1, "btn_app_install_card"

    .line 60
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->setKey(Ljava/lang/Object;)V

    .line 62
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getPrimaryColor()I

    move-result p1

    iput p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->primaryColor:I

    .line 63
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getAppIcon()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->appIconUrl:Landroid/net/Uri;

    .line 64
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 65
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getBody()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    .line 66
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getPrimaryAction()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 67
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getSecondaryAction()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    .line 68
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    .line 69
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;)V
    .locals 1

    .line 52
    invoke-static {p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->createInternalCallToAction(Lcom/usebutton/sdk/internal/models/InternalInstallCard;)Lcom/usebutton/sdk/internal/InternalCallToAction;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;-><init>(Lcom/usebutton/sdk/internal/InternalCallToAction;Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;)Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;

    return-object p0
.end method

.method private static createInternalCallToAction(Lcom/usebutton/sdk/internal/models/InternalInstallCard;)Lcom/usebutton/sdk/internal/InternalCallToAction;
    .locals 3

    .line 123
    new-instance v0, Lcom/usebutton/sdk/internal/InternalCallToAction;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getCtaIcon()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    .line 124
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->getCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lcom/usebutton/sdk/internal/InternalCallToAction;-><init>(Landroid/net/Uri;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 81
    sget v0, Lcom/usebutton/sdk/R$id;->install_card_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 82
    sget v1, Lcom/usebutton/sdk/R$id;->install_card_body:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 83
    sget v2, Lcom/usebutton/sdk/R$id;->install_card_primary_action:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/views/ColorButton;

    .line 84
    sget v3, Lcom/usebutton/sdk/R$id;->install_card_secondary_action:I

    .line 85
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 86
    sget v4, Lcom/usebutton/sdk/R$id;->install_card_app_icon:I

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 89
    iget-object v4, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-static {v0, v4}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 90
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    invoke-static {v1, v0}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->primaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-static {v2, v0}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->secondaryActionText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-static {v3, v0}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 95
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;)V

    invoke-virtual {v2, v0}, Lcom/usebutton/sdk/internal/views/ColorButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$2;-><init>(Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;)V

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->appIconUrl:Landroid/net/Uri;

    invoke-virtual {v0, v1, p1}, Lcom/usebutton/sdk/internal/ImageLoader;->load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;

    .line 113
    iget p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;->primaryColor:I

    invoke-virtual {v2, p1}, Lcom/usebutton/sdk/internal/views/ColorButton;->setColor(I)V

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

    .line 75
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 76
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_view_app_install_card:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
