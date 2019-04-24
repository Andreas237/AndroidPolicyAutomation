.class Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;
.super Ljava/lang/Object;
.source "DebugEngagementsActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->initSpinner()V
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

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 80
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/ibotta/api/model/TaskModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;->onTypeSelected(Lcom/ibotta/api/model/TaskModel$Type;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
