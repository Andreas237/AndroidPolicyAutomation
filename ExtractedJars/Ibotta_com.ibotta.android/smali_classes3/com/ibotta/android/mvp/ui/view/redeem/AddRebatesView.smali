.class public Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;
.super Landroid/widget/LinearLayout;
.source "AddRebatesView.java"


# instance fields
.field protected bAddRebates:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007c
    .end annotation
.end field

.field private foundRebateCount:I

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ad
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;

.field private state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

.field protected tvFoundRebates:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090528
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->setOrientation(I)V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0131

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onAllVerified()V
    .locals 5

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->ivImage:Landroid/widget/ImageView;

    const v1, 0x7f08020d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->tvFoundRebates:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->foundRebateCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f110068

    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->bAddRebates:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private onNoneVerified()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->ivImage:Landroid/widget/ImageView;

    const v1, 0x7f08020c

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->tvFoundRebates:Landroid/widget/TextView;

    const v1, 0x7f11006a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->bAddRebates:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private onSetup()V
    .locals 2

    .line 72
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$redeem$AddRebatesState:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 80
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->onAllVerified()V

    goto :goto_0

    .line 77
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->onSomeVerified()V

    goto :goto_0

    .line 74
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->onNoneVerified()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private onSomeVerified()V
    .locals 5

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->ivImage:Landroid/widget/ImageView;

    const v1, 0x7f08020c

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->tvFoundRebates:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->foundRebateCount:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f11006b

    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->bAddRebates:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method protected onAddRebatesClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007c
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->listener:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;

    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;->onAddRebatesClicked()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->listener:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesListener;

    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;I)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    .line 61
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->foundRebateCount:I

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesView;->onSetup()V

    return-void
.end method
