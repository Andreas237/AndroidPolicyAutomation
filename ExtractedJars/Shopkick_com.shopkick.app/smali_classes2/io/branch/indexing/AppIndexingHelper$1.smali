.class final Lio/branch/indexing/AppIndexingHelper$1;
.super Ljava/lang/Object;
.source "AppIndexingHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/branch/indexing/AppIndexingHelper;->addToAppIndex(Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;Lio/branch/referral/util/LinkProperties;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$buo:Lio/branch/indexing/BranchUniversalObject;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$linkProperties:Lio/branch/referral/util/LinkProperties;


# direct methods
.method constructor <init>(Lio/branch/referral/util/LinkProperties;Lio/branch/indexing/BranchUniversalObject;Landroid/content/Context;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$linkProperties:Lio/branch/referral/util/LinkProperties;

    iput-object p2, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$buo:Lio/branch/indexing/BranchUniversalObject;

    iput-object p3, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 35
    :try_start_0
    invoke-static {}, Lcom/google/firebase/appindexing/FirebaseUserActions;->getInstance()Lcom/google/firebase/appindexing/FirebaseUserActions;

    move-result-object v0

    invoke-static {v0}, Lio/branch/indexing/AppIndexingHelper;->access$002(Lcom/google/firebase/appindexing/FirebaseUserActions;)Lcom/google/firebase/appindexing/FirebaseUserActions;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "BranchSDK"

    const-string v1, "Failed to index your contents using Firebase. Please make sure Firebase  is enabled and initialised in your app"

    .line 41
    invoke-static {v0, v1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    const-string v0, "BranchSDK"

    const-string v1, "Firebase app indexing is not available. Please consider enabling Firebase app indexing for your app for better indexing experience with Google."

    .line 38
    invoke-static {v0, v1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    :goto_0
    iget-object v0, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$linkProperties:Lio/branch/referral/util/LinkProperties;

    if-nez v0, :cond_0

    .line 45
    iget-object v0, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$buo:Lio/branch/indexing/BranchUniversalObject;

    iget-object v1, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$context:Landroid/content/Context;

    invoke-static {}, Lio/branch/indexing/AppIndexingHelper;->access$100()Lio/branch/referral/util/LinkProperties;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/branch/indexing/BranchUniversalObject;->getShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 47
    :cond_0
    iget-object v1, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$buo:Lio/branch/indexing/BranchUniversalObject;

    iget-object v2, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$context:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, Lio/branch/indexing/BranchUniversalObject;->getShortUrl(Landroid/content/Context;Lio/branch/referral/util/LinkProperties;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "BranchSDK"

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Indexing BranchUniversalObject with Google using URL "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 52
    :try_start_1
    invoke-static {}, Lio/branch/indexing/AppIndexingHelper;->access$000()Lcom/google/firebase/appindexing/FirebaseUserActions;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 53
    iget-object v1, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$buo:Lio/branch/indexing/BranchUniversalObject;

    invoke-static {v0, v1}, Lio/branch/indexing/AppIndexingHelper;->access$200(Ljava/lang/String;Lio/branch/indexing/BranchUniversalObject;)V

    goto :goto_2

    .line 56
    :cond_1
    iget-object v1, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$context:Landroid/content/Context;

    iget-object v2, p0, Lio/branch/indexing/AppIndexingHelper$1;->val$buo:Lio/branch/indexing/BranchUniversalObject;

    invoke-static {v0, v1, v2}, Lio/branch/indexing/AppIndexingHelper;->access$300(Ljava/lang/String;Landroid/content/Context;Lio/branch/indexing/BranchUniversalObject;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :catch_2
    const-string v0, "BranchSDK"

    const-string v1, "Branch Warning: Unable to list your content in Google search. Please make sure you have added latest Firebase app indexing SDK to your project dependencies."

    .line 59
    invoke-static {v0, v1}, Lio/branch/referral/PrefHelper;->Debug(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-void
.end method
