.class public final Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;
.super Ljava/lang/Object;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;",
        "",
        "()V",
        "ARG_SECTION_NUMBER",
        "",
        "getARG_SECTION_NUMBER",
        "()Ljava/lang/String;",
        "newInstance",
        "Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;",
        "sectionNumber",
        "",
        "app_debug"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1, "$constructor_marker"    # Lkotlin/jvm/internal/DefaultConstructorMarker;

    .prologue
    .line 102
    invoke-direct {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getARG_SECTION_NUMBER$p(Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    .line 102
    invoke-direct {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;->getARG_SECTION_NUMBER()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getARG_SECTION_NUMBER()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    invoke-static {}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->access$getARG_SECTION_NUMBER$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final newInstance(I)Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;
    .locals 3
    .param p1, "sectionNumber"    # I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .prologue
    .line 114
    new-instance v1, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;

    invoke-direct {v1}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;-><init>()V

    .line 115
    .local v1, "fragment":Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 116
    .local v0, "args":Landroid/os/Bundle;
    check-cast p0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;

    .end local p0    # "this":Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;
    invoke-direct {p0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment$Companion;->getARG_SECTION_NUMBER()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 117
    invoke-virtual {v1, v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$PlaceholderFragment;->setArguments(Landroid/os/Bundle;)V

    .line 118
    return-object v1
.end method
