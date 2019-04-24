.class public abstract Lcom/ibotta/android/views/search/SearchViewState;
.super Ljava/lang/Object;
.source "SearchViewComponent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u0006\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "Lcom/ibotta/android/views/components/ViewState;",
        "()V",
        "leftIcon",
        "",
        "getLeftIcon",
        "()I",
        "leftIconDesc",
        "getLeftIconDesc",
        "rightIcon",
        "getRightIcon",
        "rightIconDesc",
        "getRightIconDesc",
        "Lcom/ibotta/android/views/search/SearchIconOnlyViewState;",
        "Lcom/ibotta/android/views/search/SearchTextViewState;",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/views/search/SearchViewState;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getLeftIcon()I
.end method

.method public abstract getLeftIconDesc()I
.end method

.method public abstract getRightIcon()I
.end method

.method public abstract getRightIconDesc()I
.end method
