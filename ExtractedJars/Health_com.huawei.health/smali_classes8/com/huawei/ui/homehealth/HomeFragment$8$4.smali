.class Lcom/huawei/ui/homehealth/HomeFragment$8$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment$8;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment$8;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment$8;)V
    .locals 0

    .line 1362
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$8$4;->e:Lcom/huawei/ui/homehealth/HomeFragment$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1365
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$8$4;->e:Lcom/huawei/ui/homehealth/HomeFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$8;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$8$4;->e:Lcom/huawei/ui/homehealth/HomeFragment$8;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$8;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->e(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/Context;)V

    .line 1366
    invoke-static {}, Lo/ahu;->c()V

    .line 1367
    return-void
.end method
