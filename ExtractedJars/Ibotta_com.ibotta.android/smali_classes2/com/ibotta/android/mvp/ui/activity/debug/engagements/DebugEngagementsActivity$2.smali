.class Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$2;
.super Ljava/lang/Object;
.source "DebugEngagementsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->initAdapter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V

    return-void
.end method
