.class Lcom/huawei/feedback/logic/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/logic/j;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/logic/j;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/feedback/logic/k;->a:Lcom/huawei/feedback/logic/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 97
    const-string v0, "FeedbackSubmitTask"

    const-string v1, "send feedback message success"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    return-void
.end method
