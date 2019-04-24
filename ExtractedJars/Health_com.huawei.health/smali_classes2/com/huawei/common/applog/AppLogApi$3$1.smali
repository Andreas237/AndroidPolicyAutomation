.class Lcom/huawei/common/applog/AppLogApi$3$1;
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
.field final synthetic this$0:Lcom/huawei/common/applog/AppLogApi$3;


# direct methods
.method constructor <init>(Lcom/huawei/common/applog/AppLogApi$3;)V
    .locals 0

    .line 1094
    iput-object p1, p0, Lcom/huawei/common/applog/AppLogApi$3$1;->this$0:Lcom/huawei/common/applog/AppLogApi$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1098
    new-instance v3, Lcom/huawei/common/applog/a/b;

    invoke-direct {v3}, Lcom/huawei/common/applog/a/b;-><init>()V

    .line 1099
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$800()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/common/applog/a/b;->a(Landroid/content/Context;ZZ)V

    .line 1100
    return-void
.end method
