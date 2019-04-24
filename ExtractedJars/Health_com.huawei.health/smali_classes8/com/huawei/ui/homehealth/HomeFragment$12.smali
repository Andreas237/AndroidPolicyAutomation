.class Lcom/huawei/ui/homehealth/HomeFragment$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->onActivityCreated(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 363
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$12;->a:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 1

    .line 366
    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$12;->a:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->i(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 369
    :cond_0
    return-void
.end method
