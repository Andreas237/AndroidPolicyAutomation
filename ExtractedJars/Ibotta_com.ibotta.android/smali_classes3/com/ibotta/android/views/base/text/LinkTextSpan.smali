.class public final Lcom/ibotta/android/views/base/text/LinkTextSpan;
.super Landroid/text/style/ClickableSpan;
.source "LinkTextSpan.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u000cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/text/LinkTextSpan;",
        "Landroid/text/style/ClickableSpan;",
        "spanClickListener",
        "Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;",
        "(Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;)V",
        "onClick",
        "",
        "widget",
        "Landroid/view/View;",
        "updateDrawState",
        "drawState",
        "Landroid/text/TextPaint;",
        "OnSpanClickListener",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final spanClickListener:Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "spanClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/base/text/LinkTextSpan;->spanClickListener:Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/ibotta/android/views/base/text/LinkTextSpan;->spanClickListener:Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;

    invoke-interface {p1}, Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;->onSpanClicked()V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "drawState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    return-void
.end method
