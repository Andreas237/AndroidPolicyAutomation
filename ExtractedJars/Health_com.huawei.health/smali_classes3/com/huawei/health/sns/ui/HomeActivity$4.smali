.class Lcom/huawei/health/sns/ui/HomeActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/HomeActivity;->L()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/HomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 1642
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity$4;->c:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1646
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$4;->c:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->d(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 1648
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$4;->c:Lcom/huawei/health/sns/ui/HomeActivity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_im_online_failed:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 1649
    return-void
.end method
