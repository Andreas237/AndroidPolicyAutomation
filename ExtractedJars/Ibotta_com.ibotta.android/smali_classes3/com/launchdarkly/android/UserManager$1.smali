.class Lcom/launchdarkly/android/UserManager$1;
.super Ljava/lang/Object;
.source "UserManager.java"

# interfaces
.implements Lcom/launchdarkly/android/Util$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/UserManager;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/FeatureFlagFetcher;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/launchdarkly/android/Util$Provider<",
        "Lcom/google/gson/JsonParser;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/UserManager;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/UserManager;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/launchdarkly/android/UserManager$1;->this$0:Lcom/launchdarkly/android/UserManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lcom/google/gson/JsonParser;
    .locals 1

    .line 78
    new-instance v0, Lcom/google/gson/JsonParser;

    invoke-direct {v0}, Lcom/google/gson/JsonParser;-><init>()V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 75
    invoke-virtual {p0}, Lcom/launchdarkly/android/UserManager$1;->get()Lcom/google/gson/JsonParser;

    move-result-object v0

    return-object v0
.end method
