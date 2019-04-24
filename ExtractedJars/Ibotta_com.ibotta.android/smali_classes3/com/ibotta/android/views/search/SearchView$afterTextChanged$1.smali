.class public final Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;
.super Ljava/util/TimerTask;
.source "SearchView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/search/SearchView;->afterTextChanged(Landroid/text/Editable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSearchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchView.kt\ncom/ibotta/android/views/search/SearchView$afterTextChanged$1\n*L\n1#1,119:1\n*E\n"
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
        "com/ibotta/android/views/search/SearchView$afterTextChanged$1",
        "Ljava/util/TimerTask;",
        "run",
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
.field final synthetic this$0:Lcom/ibotta/android/views/search/SearchView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/search/SearchView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 90
    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;->this$0:Lcom/ibotta/android/views/search/SearchView;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;->this$0:Lcom/ibotta/android/views/search/SearchView;

    invoke-static {v0}, Lcom/ibotta/android/views/search/SearchView;->access$getViewEvents$p(Lcom/ibotta/android/views/search/SearchView;)Lcom/ibotta/android/views/search/SearchViewEvents;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;->this$0:Lcom/ibotta/android/views/search/SearchView;

    invoke-static {v1}, Lcom/ibotta/android/views/search/SearchView;->access$getSearchText$p(Lcom/ibotta/android/views/search/SearchView;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/search/SearchViewEvents;->onSearchTextPostDelay(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method
