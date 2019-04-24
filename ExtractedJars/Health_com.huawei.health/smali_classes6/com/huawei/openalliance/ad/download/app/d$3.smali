.class final Lcom/huawei/openalliance/ad/download/app/d$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/d;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/d$a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/d$3;->a:Lcom/huawei/openalliance/ad/download/app/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/d$3;->a:Lcom/huawei/openalliance/ad/download/app/d$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/d$3;->a:Lcom/huawei/openalliance/ad/download/app/d$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/download/app/d$a;->b()V

    :cond_0
    return-void
.end method
