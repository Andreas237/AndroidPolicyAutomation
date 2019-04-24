.class public Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "UnconfirmedFlyUpPageCreator.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;,
        Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;,
        Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;
    }
.end annotation


# static fields
.field public static final EVENT_RESEND_EMAIL:I = 0x2

.field public static final EVENT_RESET_EMAIL:I = 0x1

.field public static final PAGE_RESET_EMAIL:I = 0x1

.field public static final PAGE_UNCONFIRMED:I


# instance fields
.field private final emailAddress:Ljava/lang/String;

.field private pageDataResetEmail:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private pageDataUnconfirmed:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private final validation:Lcom/ibotta/android/util/Validation;

.field private vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Lcom/ibotta/android/util/Validation;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->emailAddress:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->validation:Lcom/ibotta/android/util/Validation;

    .line 48
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataUnconfirmed:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataUnconfirmed:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x0

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 50
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataUnconfirmed:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    .line 53
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataResetEmail:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataResetEmail:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x1

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 55
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->PREVIOUS:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 56
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataResetEmail:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method

.method public static synthetic lambda$makeResetEmailViewHolder$2(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;Landroid/view/View;)V
    .locals 0

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$500(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->onResetEmailClicked(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$makeUnconfirmedViewHolder$0(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;Landroid/view/View;)V
    .locals 1

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->getController()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->goToPage(I)V

    return-void
.end method

.method public static synthetic lambda$makeUnconfirmedViewHolder$1(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;Landroid/view/View;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->onResendEmailClicked()V

    return-void
.end method

.method private makeResetEmailViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;
    .locals 1

    .line 111
    new-instance p2, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;-><init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$1;)V

    iput-object p2, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    .line 112
    iget-object p2, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    const v0, 0x7f0901c5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$502(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 113
    iget-object p2, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    const v0, 0x7f09009f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-static {p2, p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$602(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;Landroid/widget/Button;)Landroid/widget/Button;

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$500(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$600(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$FOP6jzYrCchiqX5uzbjxj0ecdPc;

    invoke-direct {p2, p0}, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$FOP6jzYrCchiqX5uzbjxj0ecdPc;-><init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;)V

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 119
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    return-object p1
.end method

.method private makeUnconfirmedViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;
    .locals 4

    .line 96
    new-instance p2, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;-><init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$1;)V

    const v0, 0x7f090450

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TextContainerView;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$102(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Lcom/ibotta/android/view/common/TextContainerView;)Lcom/ibotta/android/view/common/TextContainerView;

    const v0, 0x7f09009f

    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$202(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Landroid/widget/Button;)Landroid/widget/Button;

    const v0, 0x7f09009d

    .line 99
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    invoke-static {p2, p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$302(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Landroid/widget/Button;)Landroid/widget/Button;

    .line 101
    invoke-static {p2}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$100(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Lcom/ibotta/android/view/common/TextContainerView;

    move-result-object p1

    .line 102
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->emailAddress:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f1102d7

    invoke-virtual {v0, v2, v1}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    .line 104
    invoke-static {p2}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$200(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$5QQlYaa9626Qa7HGQqGeVqw2K0A;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$5QQlYaa9626Qa7HGQqGeVqw2K0A;-><init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 106
    :goto_0
    invoke-static {p2}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->access$300(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$ore7guMQcjYXqKQLtIY8MH2of_8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/cashout/-$$Lambda$UnconfirmedFlyUpPageCreator$ore7guMQcjYXqKQLtIY8MH2of_8;-><init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-object p2
.end method

.method private onResendEmailClicked()V
    .locals 1

    const/4 v0, 0x2

    .line 130
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->notifyPageEvent(I)V

    return-void
.end method

.method private onResetEmailClicked(Ljava/lang/String;)V
    .locals 2

    .line 123
    new-instance v0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;-><init>()V

    const/4 v1, 0x1

    .line 124
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;->setEventId(I)V

    .line 125
    invoke-virtual {v0, p1}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;->setNewEmail(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->vhResetEmail:Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    if-eqz v0, :cond_0

    .line 142
    invoke-static {v0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;->access$600(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public getFlyUpData()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataUnconfirmed:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->pageDataResetEmail:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    .line 70
    iget p3, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    packed-switch p3, :pswitch_data_0

    const/4 p3, -0x1

    goto :goto_0

    :pswitch_0
    const p3, 0x7f0c00e3

    goto :goto_0

    :pswitch_1
    const p3, 0x7f0c00e5

    :goto_0
    const/4 v0, 0x1

    .line 78
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 1

    .line 84
    iget v0, p2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 89
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->makeResetEmailViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailViewHolder;

    move-result-object p1

    goto :goto_0

    .line 86
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;->makeUnconfirmedViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
