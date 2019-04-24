.class Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;
.super Ljava/lang/Object;
.source "DebugMenuAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$MoreItemViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;

.field final synthetic val$debugMenuItem:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;->val$debugMenuItem:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 89
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter;)Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$1;->val$debugMenuItem:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuListener;->onDebugMenuItemClicked(Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;)V

    :cond_0
    return-void
.end method
