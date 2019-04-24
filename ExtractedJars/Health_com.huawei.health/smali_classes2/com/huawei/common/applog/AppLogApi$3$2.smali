.class Lcom/huawei/common/applog/AppLogApi$3$2;
.super Ljava/util/TimerTask;
.source "SourceFile"


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

    .line 1110
    iput-object p1, p0, Lcom/huawei/common/applog/AppLogApi$3$2;->this$0:Lcom/huawei/common/applog/AppLogApi$3;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1114
    const-string v0, "ReportApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "time has come =="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$700()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1115
    new-instance v3, Lcom/huawei/common/applog/a/b;

    invoke-direct {v3}, Lcom/huawei/common/applog/a/b;-><init>()V

    .line 1116
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$800()Z

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/common/applog/a/b;->a(Landroid/content/Context;ZZ)V

    .line 1117
    return-void
.end method
