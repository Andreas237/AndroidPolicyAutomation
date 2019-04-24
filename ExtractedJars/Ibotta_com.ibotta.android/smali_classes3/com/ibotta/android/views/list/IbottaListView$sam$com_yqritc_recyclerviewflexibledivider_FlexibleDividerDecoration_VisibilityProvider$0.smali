.class final Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;
.super Ljava/lang/Object;
.source "IbottaListView.kt"

# interfaces
.implements Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final synthetic function:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;->function:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final synthetic shouldHideDivider(ILandroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/list/IbottaListView$sam$com_yqritc_recyclerviewflexibledivider_FlexibleDividerDecoration_VisibilityProvider$0;->function:Lkotlin/jvm/functions/Function2;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "invoke(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
