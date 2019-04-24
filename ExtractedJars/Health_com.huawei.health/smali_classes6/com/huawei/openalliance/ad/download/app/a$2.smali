.class Lcom/huawei/openalliance/ad/download/app/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/a;->e(Lcom/huawei/openalliance/ad/download/app/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/c;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/a$2;->b:Lcom/huawei/openalliance/ad/download/app/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/a$2;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$2;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$2;->b:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_download_retry_toast_content:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$2;->b:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
