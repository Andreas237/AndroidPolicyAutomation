.class public final Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;,
        Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u0008\u0018\u00010\u0004R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;",
        "Landroid/support/v7/app/AppCompatActivity;",
        "()V",
        "mSectionsPagerAdapter",
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onCreateOptionsMenu",
        "",
        "menu",
        "Landroid/view/Menu;",
        "onOptionsItemSelected",
        "item",
        "Landroid/view/MenuItem;",
        "PlaceholderFragment",
        "SectionsPagerAdapter",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private mSectionsPagerAdapter:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .prologue
    .line 33
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    const v0, 0x7f0a001b

    invoke-virtual {p0, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->setContentView(I)V

    .line 36
    sget v0, Ledu/uccs/andreasslovacek/decompiletestproject/R$id;->toolbar:I

    invoke-virtual {p0, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 39
    new-instance v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;

    invoke-virtual {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string/jumbo v2, "supportFragmentManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;-><init>(Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->mSectionsPagerAdapter:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;

    .line 42
    sget v0, Ledu/uccs/andreasslovacek/decompiletestproject/R$id;->container:I

    invoke-virtual {p0, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->mSectionsPagerAdapter:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;

    check-cast v1, Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 44
    sget v0, Ledu/uccs/andreasslovacek/decompiletestproject/R$id;->fab:I

    invoke-virtual {p0, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/FloatingActionButton;

    sget-object v1, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;->INSTANCE:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;

    check-cast v1, Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .prologue
    const-string/jumbo v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0b0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 55
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2
    .param p1, "item"    # Landroid/view/MenuItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .prologue
    const-string/jumbo v1, "item"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 64
    .local v0, "id":I
    const v1, 0x7f080017

    if-ne v0, v1, :cond_0

    .line 65
    const/4 v1, 0x1

    .line 68
    :goto_0
    return v1

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v1

    goto :goto_0
.end method
