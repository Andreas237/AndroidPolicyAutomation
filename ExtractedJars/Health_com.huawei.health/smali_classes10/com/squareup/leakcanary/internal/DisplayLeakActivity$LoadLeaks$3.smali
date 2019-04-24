.class Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

.field final synthetic val$leaks:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;Ljava/util/List;)V
    .locals 0

    .line 493
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    iput-object p2, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->val$leaks:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 495
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->inFlight:Ljava/util/List;

    iget-object v1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 496
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    iget-object v0, v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    if-eqz v0, :cond_0

    .line 497
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    iget-object v0, v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    iget-object v1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->val$leaks:Ljava/util/List;

    iput-object v1, v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity;->leaks:Ljava/util/List;

    .line 498
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;->this$0:Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    iget-object v0, v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    invoke-virtual {v0}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity;->updateUi()V

    .line 500
    :cond_0
    return-void
.end method
