.class public final Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;
.super Ljava/lang/Object;
.source "ContentRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ClickableViewEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/content/row/ContentRowView;->onFinishInflate()V
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
        "com/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
        "onClick",
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
.field final synthetic this$0:Lcom/ibotta/android/views/content/row/ContentRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/content/row/ContentRowView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;->this$0:Lcom/ibotta/android/views/content/row/ContentRowView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;->this$0:Lcom/ibotta/android/views/content/row/ContentRowView;

    invoke-static {v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->access$getViewEvents$p(Lcom/ibotta/android/views/content/row/ContentRowView;)Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;->this$0:Lcom/ibotta/android/views/content/row/ContentRowView;

    invoke-static {v1}, Lcom/ibotta/android/views/content/row/ContentRowView;->access$getViewState$p(Lcom/ibotta/android/views/content/row/ContentRowView;)Lcom/ibotta/android/views/content/row/ContentRowViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;->onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method
