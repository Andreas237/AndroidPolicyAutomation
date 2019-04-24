.class Lcom/huawei/health/sns/ui/HomeActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/HomeActivity;->m()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/HomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity$5;->e:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$5;->e:Lcom/huawei/health/sns/ui/HomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Lcom/huawei/health/sns/ui/HomeActivity;Z)V

    .line 569
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->h()V

    .line 570
    return-void
.end method
