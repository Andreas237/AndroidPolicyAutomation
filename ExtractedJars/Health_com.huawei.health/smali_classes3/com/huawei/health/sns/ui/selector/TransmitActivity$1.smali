.class Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitActivity;->g()Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->b(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Lo/bio;

    move-result-object v0

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 270
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitActivity$1;->c:Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->c(Lcom/huawei/health/sns/ui/selector/TransmitActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc30

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 274
    :cond_0
    return-void
.end method
