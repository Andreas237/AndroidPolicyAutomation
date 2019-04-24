.class Lcom/huawei/feedback/component/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/logupload/LogUpload;

.field final synthetic b:J

.field final synthetic c:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V
    .locals 0

    .line 1355
    iput-object p1, p0, Lcom/huawei/feedback/component/h;->c:Lcom/huawei/feedback/component/ProgressService;

    iput-object p2, p0, Lcom/huawei/feedback/component/h;->a:Lcom/huawei/logupload/LogUpload;

    iput-wide p3, p0, Lcom/huawei/feedback/component/h;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1359
    iget-object v0, p0, Lcom/huawei/feedback/component/h;->c:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/h;->a:Lcom/huawei/logupload/LogUpload;

    iget-wide v2, p0, Lcom/huawei/feedback/component/h;->b:J

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V

    .line 1360
    return-void
.end method
