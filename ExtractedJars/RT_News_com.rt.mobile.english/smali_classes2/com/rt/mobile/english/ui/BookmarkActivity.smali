.class public Lcom/rt/mobile/english/ui/BookmarkActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "BookmarkActivity.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/PagerFragment$Adapter;
.implements Lcom/rt/mobile/english/ui/PagerFragment$Listener;
.implements Lcom/rt/mobile/english/ui/BookmarkReader$Listener;


# static fields
.field public static final ARGUMENT_ARTICLES_STRING:Ljava/lang/String; = "articles_string"

.field public static final ARGUMENT_INITIAL_POSITION:Ljava/lang/String; = "initial_position"


# instance fields
.field private articlesString:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private initialPosition:I

.field private pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public getFragment(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/BookmarkReader;->newInstance(Ljava/lang/String;I)Lcom/rt/mobile/english/ui/BookmarkReader;

    move-result-object p1

    return-object p1
.end method

.method public getInitialPosition()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->initialPosition:I

    return v0
.end method

.method public getPageCount()I
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onAttach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 2

    .line 73
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onAttach"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->pagerFragment:Lcom/rt/mobile/english/ui/PagerFragment;

    .line 75
    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/ui/PagerFragment;->setAdapter(Lcom/rt/mobile/english/ui/PagerFragment$Adapter;)V

    return-void
.end method

.method public onBookmarkDeleted(I)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 86
    iget-object p1, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_0

    .line 87
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->finish()V

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->finish()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 34
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c001c

    .line 35
    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->setContentView(I)V

    .line 37
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 38
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 39
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 41
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "articles_string"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->articlesString:Ljava/util/ArrayList;

    .line 42
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "initial_position"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->initialPosition:I

    if-nez p1, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/BookmarkActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    const v0, 0x7f090058

    const/4 v1, 0x0

    .line 45
    invoke-static {v2, v1}, Lcom/rt/mobile/english/ui/PagerFragment;->newInstance(ZLjava/lang/String;)Lcom/rt/mobile/english/ui/PagerFragment;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    return-void
.end method

.method public onDetach(Lcom/rt/mobile/english/ui/PagerFragment;)V
    .locals 0

    return-void
.end method
