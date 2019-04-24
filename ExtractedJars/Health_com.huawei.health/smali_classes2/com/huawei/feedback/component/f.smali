.class Lcom/huawei/feedback/component/f;
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
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/logupload/LogUpload;

.field final synthetic c:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/ProgressService;ILcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 1198
    iput-object p1, p0, Lcom/huawei/feedback/component/f;->c:Lcom/huawei/feedback/component/ProgressService;

    iput p2, p0, Lcom/huawei/feedback/component/f;->a:I

    iput-object p3, p0, Lcom/huawei/feedback/component/f;->b:Lcom/huawei/logupload/LogUpload;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1201
    iget-object v0, p0, Lcom/huawei/feedback/component/f;->c:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/NotificationManager;

    move-result-object v0

    iget v1, p0, Lcom/huawei/feedback/component/f;->a:I

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1205
    iget-object v0, p0, Lcom/huawei/feedback/component/f;->c:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->g(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/f;->b:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1206
    iget-object v0, p0, Lcom/huawei/feedback/component/f;->c:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->h(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/f;->b:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1211
    return-void
.end method
