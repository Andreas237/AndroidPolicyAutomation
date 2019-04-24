.class public final Lcom/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1;
.super Ljava/lang/Object;
.source "LinkTextView.kt"

# interfaces
.implements Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/base/text/LinkTextView;->updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1",
        "Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;",
        "onSpanClicked",
        "",
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
.field final synthetic this$0:Lcom/ibotta/android/views/base/text/LinkTextView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/base/text/LinkTextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1;->this$0:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSpanClicked()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1;->this$0:Lcom/ibotta/android/views/base/text/LinkTextView;

    invoke-static {v0}, Lcom/ibotta/android/views/base/text/LinkTextView;->access$getViewEvent$p(Lcom/ibotta/android/views/base/text/LinkTextView;)Lcom/ibotta/android/views/components/ClickableViewEvent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/android/views/components/ClickableViewEvent;->onClick()V

    :cond_0
    return-void
.end method
