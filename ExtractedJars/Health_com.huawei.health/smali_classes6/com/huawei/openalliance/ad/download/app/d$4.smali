.class final Lcom/huawei/openalliance/ad/download/app/d$4;
.super Landroid/os/CountDownTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/d;->a(Landroid/app/AlertDialog;ILcom/huawei/openalliance/ad/download/app/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/d$a;


# direct methods
.method constructor <init>(JJLandroid/app/AlertDialog;Lcom/huawei/openalliance/ad/download/app/d$a;)V
    .locals 0

    iput-object p5, p0, Lcom/huawei/openalliance/ad/download/app/d$4;->a:Landroid/app/AlertDialog;

    iput-object p6, p0, Lcom/huawei/openalliance/ad/download/app/d$4;->b:Lcom/huawei/openalliance/ad/download/app/d$a;

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/d$4;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/d$4;->b:Lcom/huawei/openalliance/ad/download/app/d$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/d$4;->b:Lcom/huawei/openalliance/ad/download/app/d$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/download/app/d$a;->b()V

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/d;->a(Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
