.class Lcom/huawei/ui/homehealth/HomeFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 341
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->c(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 350
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->d(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 353
    invoke-static {}, Lo/dda;->e()V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->e(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->y()V

    .line 357
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$3;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->a(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 358
    return-void
.end method
