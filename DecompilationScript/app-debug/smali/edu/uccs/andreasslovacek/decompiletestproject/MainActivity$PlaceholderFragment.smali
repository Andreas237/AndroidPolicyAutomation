.class public final Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;
.super Landroid/support/v4/app/Fragment;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PlaceholderFragment"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;",
        "Landroid/support/v4/app/Fragment;",
        "()V",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "Companion",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# static fields
# The value of this static final field might be set in the static constructor
.field private static final ARG_SECTION_NUMBER:Ljava/lang/String; = "section_number"

.field public static final Companion:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    new-instance v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->Companion:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;

    .line 107
    const-string/jumbo v0, "section_number"

    sput-object v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->ARG_SECTION_NUMBER:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static final synthetic access$getARG_SECTION_NUMBER$cp()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    .line 93
    sget-object v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->ARG_SECTION_NUMBER:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2, "container"    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .prologue
    const/4 v6, 0x0

    const-string/jumbo v1, "inflater"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    const v1, 0x7f0a002a

    invoke-virtual {p1, v1, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 98
    .local v0, "rootView":Landroid/view/View;
    sget v1, Ledu/uccs/andreasslovacek/decompiletestproject/R$id;->section_label:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0d002b

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    sget-object v5, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->Companion:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;

    invoke-static {v5}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;->access$getARG_SECTION_NUMBER$p(Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    return-object v0
.end method

.method public synthetic onDestroyView()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    invoke-virtual {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->_$_clearFindViewByIdCache()V

    return-void
.end method
