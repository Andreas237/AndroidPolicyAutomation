.class public Lcom/rt/mobile/english/ui/SettingsActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SettingsActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/SettingsActivity$PrefsFragment;
    }
.end annotation


# instance fields
.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 21
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0026

    .line 22
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/SettingsActivity;->setContentView(I)V

    .line 23
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 24
    iget-object p1, p0, Lcom/rt/mobile/english/ui/SettingsActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/SettingsActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 25
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/SettingsActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 26
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/SettingsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p1

    new-instance v0, Lcom/rt/mobile/english/ui/SettingsActivity$PrefsFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/SettingsActivity$PrefsFragment;-><init>()V

    const v1, 0x7f090059

    invoke-virtual {p1, v1, v0}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commit()I

    .line 28
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/SettingsActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const v0, 0x7f100086

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 30
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    const v0, 0x7f100037

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/SettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
