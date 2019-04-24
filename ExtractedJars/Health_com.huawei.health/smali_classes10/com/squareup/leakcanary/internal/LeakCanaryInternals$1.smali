.class final Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/internal/LeakCanaryInternals;->setEnabled(Landroid/content/Context;Ljava/lang/Class;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$appContext:Landroid/content/Context;

.field final synthetic val$componentClass:Ljava/lang/Class;

.field final synthetic val$enabled:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Class;Z)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$appContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$componentClass:Ljava/lang/Class;

    iput-boolean p3, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$enabled:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$appContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$componentClass:Ljava/lang/Class;

    iget-boolean v2, p0, Lcom/squareup/leakcanary/internal/LeakCanaryInternals$1;->val$enabled:Z

    invoke-static {v0, v1, v2}, Lcom/squareup/leakcanary/internal/LeakCanaryInternals;->setEnabledBlocking(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 72
    return-void
.end method
