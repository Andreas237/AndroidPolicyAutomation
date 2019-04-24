.class final Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;
.super Ljava/lang/Object;
.source "DebugFeatureFlagRowView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->initRowTap(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "onClick"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $viewState:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

.field final synthetic this$0:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;->this$0:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;

    iput-object p2, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;->$viewState:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 50
    iget-object p1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;->this$0:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;

    invoke-static {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->access$getRowViewEvents$p(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;->$viewState:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getRowIndex()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;->onRowTapped(I)V

    :cond_0
    return-void
.end method
