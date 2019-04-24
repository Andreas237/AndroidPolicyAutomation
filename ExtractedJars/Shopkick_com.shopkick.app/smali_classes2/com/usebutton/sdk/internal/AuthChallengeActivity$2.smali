.class Lcom/usebutton/sdk/internal/AuthChallengeActivity$2;
.super Ljava/lang/Object;
.source "AuthChallengeActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/AuthChallengeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$2;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 92
    iget-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$2;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onCancelButtonClick()V

    return-void
.end method
