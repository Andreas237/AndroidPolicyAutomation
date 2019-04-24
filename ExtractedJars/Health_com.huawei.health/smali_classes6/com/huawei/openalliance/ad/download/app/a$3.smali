.class Lcom/huawei/openalliance/ad/download/app/a$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/a;->f(Lcom/huawei/openalliance/ad/download/app/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/a$3;->a:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$3;->a:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_download_no_space:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
