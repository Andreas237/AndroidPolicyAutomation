.class public final Lcom/ibotta/android/content/ContentBackgroundReducer;
.super Ljava/lang/Object;
.source "ContentBackgroundReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentBackgroundReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentBackgroundReducer.kt\ncom/ibotta/android/content/ContentBackgroundReducer\n*L\n1#1,22:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/content/ContentBackgroundReducer;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "create",
        "",
        "isSelected",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final appContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/ContentBackgroundReducer;->appContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final create(Z)I
    .locals 3
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 16
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->shape_border_darkest_pink_outline_rounded_corners:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 17
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 18
    iget-object v1, p0, Lcom/ibotta/android/content/ContentBackgroundReducer;->appContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x101030e

    invoke-virtual {v1, v2, p1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 17
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
