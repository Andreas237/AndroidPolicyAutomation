.class public Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;
.super Landroid/widget/LinearLayout;
.source "PreferenceView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

.field private preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

.field protected sStatus:Landroid/widget/Switch;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ea
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 57
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 58
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setClickable(Z)V

    .line 59
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setFocusable(Z)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 62
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0192

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 66
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 67
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initStatus()V
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->sStatus:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->sStatus:Landroid/widget/Switch;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/settings/preferences/-$$Lambda$PreferenceView$nVcAfLpFrI7SOLIl13ih8_i2dJo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/-$$Lambda$PreferenceView$nVcAfLpFrI7SOLIl13ih8_i2dJo;-><init>(Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initStatus$0(Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;Landroid/view/View;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->onStatusClicked()V

    return-void
.end method

.method private onCheckedSet()V
    .locals 0

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initStatus()V

    return-void
.end method

.method private onPreferenceSet()V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->initName()V

    return-void
.end method

.method private onStatusClicked()V
    .locals 2

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

    if-eqz v0, :cond_0

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;->onPreferenceClicked(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->listener:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;

    return-void
.end method

.method public setPreference(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->preference:Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->onPreferenceSet()V

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferenceView;->onCheckedSet()V

    return-void
.end method
