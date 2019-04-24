.class Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ebo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;->e:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method
