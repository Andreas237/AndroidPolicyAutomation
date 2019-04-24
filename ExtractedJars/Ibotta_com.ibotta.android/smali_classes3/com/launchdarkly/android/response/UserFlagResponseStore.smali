.class public Lcom/launchdarkly/android/response/UserFlagResponseStore;
.super Ljava/lang/Object;
.source "UserFlagResponseStore.java"

# interfaces
.implements Lcom/launchdarkly/android/response/FlagResponseStore;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/launchdarkly/android/response/FlagResponseStore<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final function:Lcom/google/common/base/Function;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Function<",
            "Lcom/google/gson/JsonObject;",
            "TT;>;"
        }
    .end annotation
.end field

.field private final jsonObject:Lcom/google/gson/JsonObject;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/gson/JsonObject;Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;)V
    .locals 0
    .param p1    # Lcom/google/gson/JsonObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lcom/launchdarkly/android/response/interpreter/FlagResponseInterpreter<",
            "TT;>;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/launchdarkly/android/response/UserFlagResponseStore;->jsonObject:Lcom/google/gson/JsonObject;

    .line 23
    iput-object p2, p0, Lcom/launchdarkly/android/response/UserFlagResponseStore;->function:Lcom/google/common/base/Function;

    return-void
.end method


# virtual methods
.method public getFlagResponse()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/launchdarkly/android/response/UserFlagResponseStore;->function:Lcom/google/common/base/Function;

    iget-object v1, p0, Lcom/launchdarkly/android/response/UserFlagResponseStore;->jsonObject:Lcom/google/gson/JsonObject;

    invoke-interface {v0, v1}, Lcom/google/common/base/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
