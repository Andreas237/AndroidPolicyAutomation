.class public final Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SectionsPagerAdapter"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;",
        "Landroid/support/v4/app/FragmentPagerAdapter;",
        "fm",
        "Landroid/support/v4/app/FragmentManager;",
        "(Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;Landroid/support/v4/app/FragmentManager;)V",
        "getCount",
        "",
        "getItem",
        "Landroid/support/v4/app/Fragment;",
        "position",
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
.field final synthetic this$0:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;


# direct methods
.method public constructor <init>(Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 1
    .param p1, "$outer"    # Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2, "fm"    # Landroid/support/v4/app/FragmentManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            ")V"
        }
    .end annotation

    .prologue
    const-string/jumbo v0, "fm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iput-object p1, p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$SectionsPagerAdapter;->this$0:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;

    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x3

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2
    .param p1, "position"    # I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    .line 81
    sget-object v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->Companion:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;->newInstance(I)Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method
