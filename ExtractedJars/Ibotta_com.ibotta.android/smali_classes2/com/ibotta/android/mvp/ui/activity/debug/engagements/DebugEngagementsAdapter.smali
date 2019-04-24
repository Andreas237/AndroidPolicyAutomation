.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "DebugEngagementsAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Landroid/view/View$OnClickListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;I)V
    .locals 3

    .line 51
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;

    move-result-object p2

    .line 52
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->tvNumber:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->getOfferId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->tvCount:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->listener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->llRow:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->listener:Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 59
    :cond_1
    :goto_0
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;->llRow:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;
    .locals 2

    .line 44
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0c0148

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 44
    invoke-virtual {p1, p2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 46
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter$ViewHolder;-><init>(Landroid/widget/LinearLayout;)V

    return-object p2
.end method

.method public setListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->listener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 38
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->notifyDataSetChanged()V

    return-void
.end method
