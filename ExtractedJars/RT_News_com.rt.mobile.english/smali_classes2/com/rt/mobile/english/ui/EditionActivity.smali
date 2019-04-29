.class public Lcom/rt/mobile/english/ui/EditionActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "EditionActivity.java"


# static fields
.field public static final EXTRA_MAIN_ACTIVITY_INTENT:Ljava/lang/String; = "main_activity_intent"


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

    .line 22
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0025

    .line 23
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/EditionActivity;->setContentView(I)V

    .line 25
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 26
    iget-object p1, p0, Lcom/rt/mobile/english/ui/EditionActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/EditionActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 28
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getLocale()Ljava/lang/String;

    move-result-object p1

    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 29
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EditionActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const v0, 0x7f10004d

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/EditionActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 30
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EditionActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EditionActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 35
    :goto_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/EditionActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const v0, 0x7f090058

    new-instance v1, Lcom/rt/mobile/english/ui/EditionFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/EditionFragment;-><init>()V

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 37
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    return-void
.end method
