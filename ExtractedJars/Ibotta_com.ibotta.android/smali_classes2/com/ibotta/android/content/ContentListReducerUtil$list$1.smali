.class final Lcom/ibotta/android/content/ContentListReducerUtil$list$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ContentListReducerUtil.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/content/ContentListReducerUtil;->list(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Lcom/ibotta/android/content/DisplayContent;",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "Lcom/ibotta/android/views/list/ContentViewState;",
        "index",
        "",
        "displayContent",
        "Lcom/ibotta/android/content/DisplayContent;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $contentTrackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

.field final synthetic this$0:Lcom/ibotta/android/content/ContentListReducerUtil;


# direct methods
.method constructor <init>(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->this$0:Lcom/ibotta/android/content/ContentListReducerUtil;

    iput-object p2, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->$contentTrackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(ILcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/views/list/ContentViewState;
    .locals 3
    .param p2    # Lcom/ibotta/android/content/DisplayContent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "displayContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lcom/ibotta/android/content/DisplayContent;->getContentStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/content/ContentListReducerUtil$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->this$0:Lcom/ibotta/android/content/ContentListReducerUtil;

    invoke-static {v0}, Lcom/ibotta/android/content/ContentListReducerUtil;->access$getContentCardReducer$p(Lcom/ibotta/android/content/ContentListReducerUtil;)Lcom/ibotta/android/content/card/ContentCardReducer;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->this$0:Lcom/ibotta/android/content/ContentListReducerUtil;

    iget-object v2, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->$contentTrackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-static {v1, p2, v2, p1}, Lcom/ibotta/android/content/ContentListReducerUtil;->access$getTrackingPayload(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/content/DisplayContent;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/content/card/ContentCardViewState;->withTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/ContentViewState;

    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->this$0:Lcom/ibotta/android/content/ContentListReducerUtil;

    invoke-static {v0}, Lcom/ibotta/android/content/ContentListReducerUtil;->access$getContentRowReducer$p(Lcom/ibotta/android/content/ContentListReducerUtil;)Lcom/ibotta/android/content/row/ContentRowReducer;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/content/row/ContentRowReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/views/content/row/ContentRowViewState;

    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->this$0:Lcom/ibotta/android/content/ContentListReducerUtil;

    iget-object v2, p0, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->$contentTrackingPayload:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    invoke-static {v1, p2, v2, p1}, Lcom/ibotta/android/content/ContentListReducerUtil;->access$getTrackingPayload(Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/content/DisplayContent;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->withTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/content/row/ContentRowViewState;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/ContentViewState;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lcom/ibotta/android/content/DisplayContent;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/content/ContentListReducerUtil$list$1;->invoke(ILcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/views/list/ContentViewState;

    move-result-object p1

    return-object p1
.end method
