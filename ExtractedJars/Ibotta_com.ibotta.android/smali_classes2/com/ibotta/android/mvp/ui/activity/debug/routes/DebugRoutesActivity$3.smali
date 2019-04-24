.class Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$3;
.super Ljava/lang/Object;
.source "DebugRoutesActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initOffersSpinner()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

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

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$3;->this$0:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

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
