.class public Lcom/rt/mobile/english/ui/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;


# static fields
.field public static final ARGUMENT_URI:Ljava/lang/String; = "open_uri"

.field public static final RESTART_MAIN_ACTIVITY:Ljava/lang/String; = "restart_main_activity"

.field public static final RESULT_EXTRA_LANGUAGE_CODE:Ljava/lang/String; = "language_code"


# instance fields
.field public OtherNews:Z

.field appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

.field editionManager:Lcom/rt/mobile/english/data/EditionManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

.field private mToolbar:Landroid/support/v7/widget/Toolbar;

.field private slidingTabLayout:Lcom/rt/mobile/english/ui/widget/SlidingTabLayout;

.field private toolBarAndTabs:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->OtherNews:Z

    return-void
.end method

.method private openUrl(Landroid/content/Intent;)V
    .locals 4

    .line 145
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 146
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 147
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    return-void

    .line 154
    :cond_1
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 155
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    return-void

    .line 161
    :cond_2
    iget-object v2, p0, Lcom/rt/mobile/english/ui/MainActivity;->editionManager:Lcom/rt/mobile/english/data/EditionManager;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/EditionManager;->getCurrentEdition()Lcom/rt/mobile/english/data/EditionManager$Edition;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 162
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    const-string v2, "PushNotifications"

    const-string v3, "PushOpen"

    invoke-virtual {v1, p0, v2, v3, v0}, Lcom/rt/mobile/english/Utils;->sendEvent(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setSelection(Landroid/net/Uri;)V

    goto :goto_0

    .line 166
    :cond_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->editionManager:Lcom/rt/mobile/english/data/EditionManager;

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/EditionManager;->findEditionByScheme(Ljava/lang/String;)Lcom/rt/mobile/english/data/EditionManager$Edition;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 167
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->editionManager:Lcom/rt/mobile/english/data/EditionManager;

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/data/EditionManager;->findEditionByScheme(Ljava/lang/String;)Lcom/rt/mobile/english/data/EditionManager$Edition;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/EditionManager$Edition;->getKey()Ljava/lang/String;

    move-result-object p1

    .line 168
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f10004c

    .line 169
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x1

    .line 170
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    const v1, 0x104000a

    .line 171
    new-instance v2, Lcom/rt/mobile/english/ui/MainActivity$1;

    invoke-direct {v2, p0, p1}, Lcom/rt/mobile/english/ui/MainActivity$1;-><init>(Lcom/rt/mobile/english/ui/MainActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const p1, 0x7f100046

    .line 178
    new-instance v1, Lcom/rt/mobile/english/ui/MainActivity$2;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/MainActivity$2;-><init>(Lcom/rt/mobile/english/ui/MainActivity;)V

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 181
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 182
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 186
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Parse url failed"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 94
    invoke-static {p1}, Lcom/rt/mobile/english/data/LocaleHelper;->onAttach(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public getDrawerFragment()Lcom/rt/mobile/english/ui/DrawerFragment;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    return-object v0
.end method

.method public onBackPressed()V
    .locals 4

    .line 103
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f10007c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getDrawerFragment()Lcom/rt/mobile/english/ui/DrawerFragment;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getDrawerFragment()Lcom/rt/mobile/english/ui/DrawerFragment;

    move-result-object v1

    iget-object v1, v1, Lcom/rt/mobile/english/ui/DrawerFragment;->articlesItemView:Lcom/rt/mobile/english/ui/widget/DrawerItemView;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setSelectedItem(Landroid/view/View;)V

    .line 110
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "other_news_boolean"

    const/4 v3, 0x0

    .line 111
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    new-instance v1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;-><init>()V

    .line 113
    invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 114
    invoke-virtual {p0, v2}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 116
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 117
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 118
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const v2, 0x7f010018

    const v3, 0x7f010013

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 119
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const v2, 0x7f090058

    const-string v3, "main"

    invoke-virtual {v0, v2, v1, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 120
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    const/4 v0, 0x0

    .line 121
    iput-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    return-void

    .line 127
    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 62
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "restart_main_activity"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "restart_main_activity"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 66
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getLocale()Ljava/lang/String;

    move-result-object p1

    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 67
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/rt/mobile/english/ui/EditionActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "main_activity_intent"

    .line 68
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 69
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 70
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->finish()V

    return-void

    .line 74
    :cond_1
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    const p1, 0x7f10007c

    .line 75
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->setTitle(I)V

    const p1, 0x7f0c0022

    .line 76
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->setContentView(I)V

    .line 78
    new-instance p1, Lcom/mopub/mobileads/MoPubConversionTracker;

    invoke-direct {p1}, Lcom/mopub/mobileads/MoPubConversionTracker;-><init>()V

    invoke-virtual {p1, p0}, Lcom/mopub/mobileads/MoPubConversionTracker;->reportAppOpen(Landroid/content/Context;)V

    .line 81
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    const v0, 0x7f0900fd

    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/DrawerFragment;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    .line 83
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    const v1, 0x7f090071

    .line 85
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v4/widget/DrawerLayout;

    .line 83
    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setUp(ILandroid/support/v4/widget/DrawerLayout;)V

    .line 88
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->openUrl(Landroid/content/Intent;)V

    .line 89
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/AppEventCounter;->appLaunched()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DrawerFragment;->isDrawerOpen()Z

    move-result v0

    if-nez v0, :cond_0

    .line 333
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1

    .line 336
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onDestroy()V
    .locals 0

    .line 372
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onNavigationDrawerClosed()V
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    const/4 v0, 0x0

    .line 325
    iput-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    :cond_0
    return-void
.end method

.method public onNavigationDrawerItemSelected(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 194
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    .line 294
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Drawer item at view with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " does not define"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 223
    :sswitch_0
    new-instance v1, Lcom/rt/mobile/english/ui/ViralFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ViralFragment;-><init>()V

    const p1, 0x7f10008b

    .line 224
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 263
    :sswitch_1
    new-instance v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;-><init>()V

    const p1, 0x7f10008a

    .line 264
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 258
    :sswitch_2
    new-instance v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;-><init>()V

    const p1, 0x7f100089

    .line 259
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 248
    :sswitch_3
    new-instance v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;-><init>()V

    const p1, 0x7f100088

    .line 249
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 233
    :sswitch_4
    new-instance v1, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ShowsRecyclerViewFragment;-><init>()V

    const p1, 0x7f100087

    .line 234
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 284
    :sswitch_5
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/rt/mobile/english/ui/SettingsActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    :sswitch_6
    const/4 p1, 0x1

    if-eqz p2, :cond_0

    const-string v0, "other_news_boolean"

    .line 208
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 210
    :cond_0
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "other_news_boolean"

    .line 211
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 213
    :goto_0
    new-instance v1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;-><init>()V

    const p1, 0x7f100085

    .line 214
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 218
    :sswitch_7
    new-instance v1, Lcom/rt/mobile/english/ui/OpedgeFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/OpedgeFragment;-><init>()V

    const p1, 0x7f100084

    .line 219
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 228
    :sswitch_8
    new-instance v1, Lcom/rt/mobile/english/ui/NoticiasFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/NoticiasFragment;-><init>()V

    const p1, 0x7f100083

    .line 229
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 238
    :sswitch_9
    new-instance v1, Lcom/rt/mobile/english/ui/MediaFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/MediaFragment;-><init>()V

    const p1, 0x7f100082

    .line 239
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_3

    .line 268
    :sswitch_a
    new-instance v1, Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ChannelsFragment;-><init>()V

    const p1, 0x7f100081

    .line 269
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 243
    :sswitch_b
    new-instance v1, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/GalleriesRecyclerViewFragment;-><init>()V

    const p1, 0x7f100080

    .line 244
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :sswitch_c
    const-string p1, "https://francais.rt.com/coupedumonde2018"

    .line 288
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 289
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 290
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/MainActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 253
    :sswitch_d
    new-instance v1, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/VideoEpisodesRecyclerViewFragment;-><init>()V

    const p1, 0x7f10007e

    .line 254
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 278
    :sswitch_e
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/rt/mobile/english/ui/EditionActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "main_activity_intent"

    .line 279
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 280
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->startActivity(Landroid/content/Intent;)V

    :goto_1
    move-object p1, v1

    goto :goto_3

    .line 273
    :sswitch_f
    new-instance v1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;-><init>()V

    const p1, 0x7f10007d

    .line 274
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    .line 196
    :sswitch_10
    new-instance v1, Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;-><init>()V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    const-string v0, "other_news_boolean"

    .line 198
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_2

    .line 200
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "other_news_boolean"

    .line 201
    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_2
    const p1, 0x7f10007c

    .line 203
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_3
    if-eqz v1, :cond_3

    .line 297
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_2

    .line 299
    invoke-virtual {v1, p2}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 301
    :cond_2
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    .line 302
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 304
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const p2, 0x7f010018

    const v0, 0x7f010013

    invoke-virtual {p1, p2, v0}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 305
    iget-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const p2, 0x7f090058

    const-string v0, "main"

    invoke-virtual {p1, p2, v1, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    :cond_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090028 -> :sswitch_10
        0x7f090031 -> :sswitch_f
        0x7f090074 -> :sswitch_e
        0x7f09007f -> :sswitch_d
        0x7f09009d -> :sswitch_c
        0x7f0900a9 -> :sswitch_b
        0x7f0900cb -> :sswitch_a
        0x7f0900da -> :sswitch_9
        0x7f09010b -> :sswitch_8
        0x7f090110 -> :sswitch_7
        0x7f090112 -> :sswitch_6
        0x7f090154 -> :sswitch_5
        0x7f090167 -> :sswitch_4
        0x7f0901ad -> :sswitch_3
        0x7f0901ae -> :sswitch_2
        0x7f0901af -> :sswitch_1
        0x7f0901b2 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 132
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onNewIntent(Landroid/content/Intent;)V

    const-string v0, "restart_main_activity"

    const/4 v1, 0x0

    .line 133
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->finish()V

    const-string v0, "restart_main_activity"

    .line 135
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 138
    :cond_0
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->setIntent(Landroid/content/Intent;)V

    .line 140
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/MainActivity;->openUrl(Landroid/content/Intent;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    .line 341
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 343
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method protected onPause()V
    .locals 0

    .line 361
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    .line 362
    invoke-static {}, Lcom/comscore/analytics/comScore;->onExitForeground()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 355
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 356
    invoke-static {}, Lcom/comscore/analytics/comScore;->onEnterForeground()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 378
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "launch"

    const/4 v1, 0x1

    .line 379
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 350
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 0

    .line 367
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    return-void
.end method

.method public openLive()V
    .locals 4

    .line 310
    new-instance v0, Lcom/rt/mobile/english/ui/ChannelsFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/ChannelsFragment;-><init>()V

    const v1, 0x7f100081

    .line 311
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 312
    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 313
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 314
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iput-object v1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 315
    iget-object v1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const v2, 0x7f010018

    const v3, 0x7f010013

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 316
    iget-object v1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    const-string v2, "main"

    const v3, 0x7f090058

    invoke-virtual {v1, v3, v0, v2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 317
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    const/4 v0, 0x0

    .line 318
    iput-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->mFragmentTransaction:Landroid/support/v4/app/FragmentTransaction;

    return-void
.end method

.method public setToolbar(Landroid/support/v7/widget/Toolbar;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/rt/mobile/english/ui/MainActivity;->drawerFragment:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setUpToggle(Landroid/support/v7/widget/Toolbar;)V

    .line 57
    iput-object p1, p0, Lcom/rt/mobile/english/ui/MainActivity;->mToolbar:Landroid/support/v7/widget/Toolbar;

    return-void
.end method
