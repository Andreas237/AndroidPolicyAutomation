.class public Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;
.super Landroid/widget/LinearLayout;
.source "SettingMenuView.java"


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

.field protected tvLabel:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090539
    .end annotation
.end field

.field protected tvRight:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056c
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initLayout()V

    return-void
.end method

.method private initLabel()V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->tvLabel:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->getNameResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setClickable(Z)V

    .line 54
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setFocusable(Z)V

    .line 55
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->setOrientation(I)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01c6

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initRightLabel()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;->UPDATE_PROFILE:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    if-ne v0, v1, :cond_0

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->tvRight:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private onSettingMenuSet()V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initLabel()V

    return-void
.end method


# virtual methods
.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->initRightLabel()V

    return-void
.end method

.method public setSettingMenu(Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->settingMenu:Lcom/ibotta/android/mvp/ui/activity/settings/SettingMenu;

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingMenuView;->onSettingMenuSet()V

    return-void
.end method
