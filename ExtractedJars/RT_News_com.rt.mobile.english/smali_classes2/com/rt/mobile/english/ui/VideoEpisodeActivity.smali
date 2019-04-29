.class public Lcom/rt/mobile/english/ui/VideoEpisodeActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "VideoEpisodeActivity.java"


# static fields
.field public static final ARGUMENT_EPISODES:Ljava/lang/String; = "episodes_string"

.field public static final ARGUMENT_INITIAL_POSITION:Ljava/lang/String; = "initial_position"


# instance fields
.field private selectPosition:I

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field

.field toolbar_and_tabs:Landroid/support/design/widget/AppBarLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090197
    .end annotation
.end field

.field private videoStrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field viewPager:Landroid/support/v4/view/ViewPager;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090114
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->videoStrings:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->selectPosition:I

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 41
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c001d

    .line 42
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->setContentView(I)V

    .line 44
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 46
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    new-instance v0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity$1;-><init>(Lcom/rt/mobile/english/ui/VideoEpisodeActivity;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "episodes_string"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->videoStrings:Ljava/util/ArrayList;

    .line 53
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "initial_position"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->selectPosition:I

    .line 54
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v0, 0x7f100088

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 55
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    new-instance v0, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->videoStrings:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lcom/rt/mobile/english/ui/adapter/VideoPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 56
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->viewPager:Landroid/support/v4/view/ViewPager;

    iget v0, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->selectPosition:I

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 58
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    const v0, 0x7f10003a

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 63
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    .line 68
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 65
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->finish()V

    const/4 p1, 0x1

    return p1
.end method
