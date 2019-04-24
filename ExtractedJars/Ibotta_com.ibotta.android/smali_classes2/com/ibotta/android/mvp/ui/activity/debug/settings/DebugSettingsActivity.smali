.class public Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;
.super Lcom/ibotta/android/mvp/base/MvpActivity;
.source "DebugSettingsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerViewHolder;,
        Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/MvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;"
    }
.end annotation


# static fields
.field private static final HOSTNAMES:[Ljava/lang/String;


# instance fields
.field protected actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090051
    .end annotation
.end field

.field protected sColumns:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e1
    .end annotation
.end field

.field protected tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090440
    .end annotation
.end field

.field protected tbTMonitor:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090442
    .end annotation
.end field

.field protected tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090443
    .end annotation
.end field

.field protected tvApiUrl:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f7
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const-string v0, "api.ibotta.com"

    const-string v1, "api-promo-codes.ibotta.com"

    const-string v2, "api-apistage01.ibotta.com"

    const-string v3, "api-apistage02.ibotta.com"

    const-string v4, "api-apistage03.ibotta.com"

    const-string v5, "api-gpustage01.ibotta.com"

    const-string v6, "api-webstage02.ibotta.com"

    .line 44
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->HOSTNAMES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initActvHostName()V
    .locals 4

    .line 261
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->HOSTNAMES:[Ljava/lang/String;

    const v3, 0x109000a

    invoke-direct {v0, v1, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 263
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method private initColumns()V
    .locals 5

    .line 241
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {}, Lcom/ibotta/android/profile/GalleryColumns;->values()[Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object v1

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    invoke-static {}, Lcom/ibotta/android/profile/GalleryColumns;->values()[Lcom/ibotta/android/profile/GalleryColumns;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 244
    invoke-virtual {v4}, Lcom/ibotta/android/profile/GalleryColumns;->getNum()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 247
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;

    invoke-direct {v2, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$ColumnsSpinnerAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;
    .locals 1

    .line 63
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;

    move-result-object v0

    .line 64
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;)V

    .line 65
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;->debugSettingsModule(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;

    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DaggerDebugSettingsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;

    move-result-object p1

    return-object p1
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public initIgnoreUpdatesTb(Z)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 163
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->setIgnoreUpdatesTbText(Z)V

    return-void
.end method

.method public initTMonitorTb(Z)V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbTMonitor:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 169
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->setTMonitorTbText(Z)V

    return-void
.end method

.method public initUseDebugApiTb(Z)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 157
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->setUseDebugApiTbText(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 41
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;)V
    .locals 0

    .line 71
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 76
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0030

    .line 78
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->setContentView(I)V

    .line 79
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->initActvHostName()V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->initColumns()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0004

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 115
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onDebugHttpClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090085
        }
    .end annotation

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/readystatesoftware/chuck/Chuck;->getLaunchIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onHostnameClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090051
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-virtual {v0}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->showDropDown()V

    return-void
.end method

.method public onIgnoreUpdatesChecked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090440
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v1}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;->onIgnoreUpdatesChecked(Z)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 120
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090019

    if-eq v0, v1, :cond_0

    .line 126
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/MvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->onBackPressed()V

    const/4 p1, 0x1

    return p1
.end method

.method protected onStart()V
    .locals 2

    .line 87
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->onStart()V

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x1

    .line 107
    invoke-static {v0}, Lcom/ibotta/android/App;->getApiUrl(Z)Ljava/lang/String;

    .line 108
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/MvpActivity;->onStop()V

    return-void
.end method

.method public onTMonitorChecked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090442
        }
    .end annotation

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbTMonitor:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v1}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;->onTMonitorChecked(Z)V

    return-void
.end method

.method public onUseDebugApiChecked()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090443
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v1}, Landroid/support/v7/widget/SwitchCompat;->isChecked()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-virtual {v2}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;->onUseDebugApiChecked(ZLjava/lang/String;)V

    return-void
.end method

.method public setActvHostname(Ljava/lang/String;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->actvHostname:Landroid/support/v7/widget/AppCompatAutoCompleteTextView;

    invoke-virtual {p1}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/AppCompatAutoCompleteTextView;->setSelection(I)V

    return-void
.end method

.method public setIgnoreUpdatesTbText(Z)V
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbIgnoreUpdates:Landroid/support/v7/widget/SwitchCompat;

    if-eqz p1, :cond_0

    const p1, 0x7f110241

    goto :goto_0

    :cond_0
    const p1, 0x7f110240

    :goto_0
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setText(I)V

    return-void
.end method

.method public setSColumnsSelection(I)V
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->sColumns:Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setSelection(I)V

    return-void
.end method

.method public setTMonitorTbText(Z)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbTMonitor:Landroid/support/v7/widget/SwitchCompat;

    if-eqz p1, :cond_0

    const p1, 0x7f110241

    goto :goto_0

    :cond_0
    const p1, 0x7f110240

    :goto_0
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setText(I)V

    return-void
.end method

.method public setTvApiUrl()V
    .locals 2

    .line 194
    invoke-static {}, Lcom/ibotta/android/App;->updateApiUrl()V

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tvApiUrl:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/ibotta/android/App;->getApiUrl(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setUseDebugApiTbText(Z)V
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsActivity;->tbUseDebugApi:Landroid/support/v7/widget/SwitchCompat;

    if-eqz p1, :cond_0

    const p1, 0x7f110241

    goto :goto_0

    :cond_0
    const p1, 0x7f110240

    :goto_0
    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SwitchCompat;->setText(I)V

    return-void
.end method
