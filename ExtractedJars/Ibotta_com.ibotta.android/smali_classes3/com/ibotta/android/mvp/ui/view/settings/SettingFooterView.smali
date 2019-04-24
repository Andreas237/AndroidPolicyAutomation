.class public Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;
.super Landroid/widget/LinearLayout;
.source "SettingFooterView.java"


# instance fields
.field private major:Ljava/lang/String;

.field private minor:Ljava/lang/String;

.field protected tvMajorVersion:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090597
    .end annotation
.end field

.field protected tvMinorVersion:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090598
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 51
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->setOrientation(I)V

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01c5

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 54
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initMajor()V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMajorVersion:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->major:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initMinor()V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->tvMinorVersion:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->minor:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onVersionSet()V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initMajor()V

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->initMinor()V

    return-void
.end method


# virtual methods
.method public setVersion(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->major:Ljava/lang/String;

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->minor:Ljava/lang/String;

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/SettingFooterView;->onVersionSet()V

    return-void
.end method
