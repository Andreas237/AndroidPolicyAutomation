.class public final synthetic Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyTeammatesViewHolder$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/views/empty/EmptyViewEvents;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyTeammatesViewHolder$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;

    return-void
.end method


# virtual methods
.method public final onActionButtonClick()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyTeammatesViewHolder$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4;->f$0:Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->lambda$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;)V

    return-void
.end method

.method public synthetic onEmptyViewClicked()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/empty/EmptyViewEvents$-CC;->$default$onEmptyViewClicked(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method
