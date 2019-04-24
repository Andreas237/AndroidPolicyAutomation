.class Lcom/usebutton/sdk/internal/AuthChallengeActivity$3;
.super Ljava/lang/Object;
.source "AuthChallengeActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/AuthChallengeActivity;->showProgress(J)V
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

    .line 119
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$3;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$3;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->presenter:Lcom/usebutton/sdk/internal/AuthChallengePresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/AuthChallengePresenter;->onProgressDelayComplete()V

    return-void
.end method
