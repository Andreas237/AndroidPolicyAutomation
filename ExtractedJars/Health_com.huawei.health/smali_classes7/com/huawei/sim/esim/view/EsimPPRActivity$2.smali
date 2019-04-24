.class Lcom/huawei/sim/esim/view/EsimPPRActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimPPRActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/esim/view/EsimPPRActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$2;->c:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 121
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error_code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 124
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 125
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 126
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity$2;->c:Lcom/huawei/sim/esim/view/EsimPPRActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->d(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 127
    return-void
.end method
