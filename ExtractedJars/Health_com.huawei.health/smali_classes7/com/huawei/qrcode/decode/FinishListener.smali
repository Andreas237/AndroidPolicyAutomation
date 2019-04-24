.class public final Lcom/huawei/qrcode/decode/FinishListener;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private final activityToFinish:Landroid/app/Activity;

.field private iNotifyListener:Lcom/huawei/qrcode/logic/INotifyListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/huawei/qrcode/logic/INotifyListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/decode/FinishListener;->activityToFinish:Landroid/app/Activity;

    iput-object p2, p0, Lcom/huawei/qrcode/decode/FinishListener;->iNotifyListener:Lcom/huawei/qrcode/logic/INotifyListener;

    return-void
.end method

.method private run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/decode/FinishListener;->iNotifyListener:Lcom/huawei/qrcode/logic/INotifyListener;

    invoke-interface {v0}, Lcom/huawei/qrcode/logic/INotifyListener;->onNotifyCallBack()V

    iget-object v0, p0, Lcom/huawei/qrcode/decode/FinishListener;->activityToFinish:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/FinishListener;->run()V

    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/FinishListener;->run()V

    return-void
.end method
