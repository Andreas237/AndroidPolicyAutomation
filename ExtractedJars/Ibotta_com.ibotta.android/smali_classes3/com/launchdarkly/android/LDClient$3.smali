.class Lcom/launchdarkly/android/LDClient$3;
.super Ljava/lang/Object;
.source "LDClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/LDClient;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/LDClient;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/LDClient;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lcom/launchdarkly/android/LDClient$3;->this$0:Lcom/launchdarkly/android/LDClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$3;->this$0:Lcom/launchdarkly/android/LDClient;

    invoke-static {v0}, Lcom/launchdarkly/android/LDClient;->access$200(Lcom/launchdarkly/android/LDClient;)V

    return-void
.end method
