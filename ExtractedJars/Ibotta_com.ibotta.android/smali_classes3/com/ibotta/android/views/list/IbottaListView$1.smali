.class final Lcom/ibotta/android/views/list/IbottaListView$1;
.super Ljava/lang/Object;
.source "IbottaListView.kt"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<anonymous parameter 0>",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 1>",
        "Landroid/view/MotionEvent;",
        "onTouch"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/views/list/IbottaListView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/list/IbottaListView;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView$1;->this$0:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView$1;->this$0:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-static {p1}, Lcom/ibotta/android/views/list/IbottaListView;->access$getViewEvents$p(Lcom/ibotta/android/views/list/IbottaListView;)Lcom/ibotta/android/views/list/IbottaListViewEvents;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/android/views/list/IbottaListViewEvents;->onListViewTouched()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
