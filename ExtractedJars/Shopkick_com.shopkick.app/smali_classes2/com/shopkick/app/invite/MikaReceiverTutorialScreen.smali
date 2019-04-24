.class public Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "MikaReceiverTutorialScreen.java"


# instance fields
.field private deadlineDateText:Ljava/lang/String;

.field private kickAmountText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x1

    .line 34
    new-array v0, p3, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->kickAmountText:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f1103ee

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const v0, 0x7f0c011d

    .line 35
    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09047e

    .line 37
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 38
    new-array v0, p3, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->deadlineDateText:Ljava/lang/String;

    aput-object v1, v0, v2

    const v1, 0x7f1103f0

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f09047d

    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 41
    new-array p3, p3, [Ljava/lang/Object;

    iget-object v0, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->kickAmountText:Ljava/lang/String;

    aput-object v0, p3, v2

    const v0, 0x7f1103ec

    invoke-virtual {p0, v0, p3}, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p1, "deadline_date"

    .line 25
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->deadlineDateText:Ljava/lang/String;

    const-string p1, "kick_amount"

    .line 26
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->kickAmountText:Ljava/lang/String;

    .line 28
    iget-object p1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->kickAmountText:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string p2, "Kick amount text should never be empty."

    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/shopkick/app/invite/MikaReceiverTutorialScreen;->deadlineDateText:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string p2, "Deadline date text should never be empty."

    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    return-void
.end method
