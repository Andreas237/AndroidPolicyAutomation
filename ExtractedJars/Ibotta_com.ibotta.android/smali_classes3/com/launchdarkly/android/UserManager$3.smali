.class Lcom/launchdarkly/android/UserManager$3;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;->updateCurrentUser()Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function<",
        "Lcom/google/gson/JsonObject;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/UserManager;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/UserManager;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$3;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 134
    check-cast p1, Lcom/google/gson/JsonObject;

    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/UserManager$3;->apply(Lcom/google/gson/JsonObject;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public apply(Lcom/google/gson/JsonObject;)Ljava/lang/Void;
    .locals 0
    .param p1    # Lcom/google/gson/JsonObject;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
