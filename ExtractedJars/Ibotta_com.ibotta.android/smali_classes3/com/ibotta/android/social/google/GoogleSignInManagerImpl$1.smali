.class Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;
.super Ljava/lang/Object;
.source "GoogleSignInManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->unlinkGoogleFromIbotta(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/social/google/GoogleLinkListener;->hideGoogleUnlinking()V

    .line 139
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$100(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/state/user/UserState;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->deleteGoogleSignInAuth()V

    .line 142
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$200(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->revokeAccess()Lcom/google/android/gms/tasks/Task;

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/social/google/GoogleLinkListener;->onGoogleUnlinkSuccess()V

    goto :goto_0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {v0}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object v0

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/social/google/GoogleLinkListener;->onGoogleUnlinkFailed(Lcom/ibotta/api/ApiException;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;->this$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/social/google/GoogleLinkListener;->showGoogleUnlinking()V

    :cond_0
    return-void
.end method
