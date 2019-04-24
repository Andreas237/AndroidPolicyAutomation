.class public Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "QuestAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field public questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 70
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapter$ViewHolder;->questView:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    return-void
.end method
