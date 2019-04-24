.class public Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PreferencesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;
.implements Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesView;",
        "Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;"
    }
.end annotation


# static fields
.field private static final TAG_SUCCESS:Ljava/lang/String; = "success"


# instance fields
.field protected passwordPrompterFactory:Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected plvPreferences:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903a1
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initListView()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->plvPreferences:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;->setListener(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesAdapterListener;)V

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->plvPreferences:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f1105cb

    .line 84
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;
    .locals 1

    .line 42
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;

    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;)V

    .line 44
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;->preferencesModule(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesModule;)Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;

    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/DaggerPreferencesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;

    move-result-object p1

    return-object p1
.end method

.method public displayPasswordPrompt(Ljava/lang/String;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->passwordPrompterFactory:Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;->create(Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;->capturePassword()V

    return-void
.end method

.method public getLightText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1105da

    .line 110
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSoundText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1105db

    .line 100
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVibrateText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1105dc

    .line 105
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;)V
    .locals 0

    .line 50
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 55
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0059

    .line 57
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->setContentView(I)V

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->initTitle()V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->initListView()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0012

    .line 67
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 69
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 1

    const-string v0, "success"

    .line 146
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->finish()V

    goto :goto_0

    .line 149
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDialogFragmentDismissed(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "success"

    .line 137
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->finish()V

    goto :goto_0

    .line 140
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDialogFragmentDismissed(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 74
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f090024

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 76
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;->onSaveClicked()V

    const/4 p1, 0x1

    return p1
.end method

.method public onPasswordCaptured(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;->savePreferences(Ljava/lang/String;)V

    return-void
.end method

.method public onPreferenceClicked(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesPresenter;->onPreferenceClicked(Lcom/ibotta/android/mvp/ui/activity/settings/preferences/Preference;)V

    return-void
.end method

.method public onSaveSuccess()V
    .locals 3

    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    .line 130
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    .line 131
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 132
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "success"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/preferences/row/AbstractPreferencesRow;",
            ">;)V"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/preferences/PreferencesActivity;->plvPreferences:Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/settings/preferences/PreferencesListView;->setRows(Ljava/util/List;)V

    return-void
.end method
