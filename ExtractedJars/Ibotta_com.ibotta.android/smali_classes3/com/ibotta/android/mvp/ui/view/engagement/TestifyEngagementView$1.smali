.class Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView$1;
.super Ljava/lang/Object;
.source "TestifyEngagementView.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->initAnswerField()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->access$000(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
