.class public Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "DebugMenuAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;,
        Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;,
        Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final listener:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->listener:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 98
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->values()[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;I)V
    .locals 2

    .line 82
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->values()[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    move-result-object v0

    aget-object p2, v0, p2

    .line 84
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;->ivLeftIcon:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->getIconId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 85
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->getNameId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 86
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;->vRow:Landroid/view/View;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V

    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;
    .locals 3

    .line 76
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c014c

    const/4 v2, 0x0

    .line 77
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
