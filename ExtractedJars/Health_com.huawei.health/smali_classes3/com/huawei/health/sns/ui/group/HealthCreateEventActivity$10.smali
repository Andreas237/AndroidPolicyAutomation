.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V
    .locals 0

    .line 774
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 2

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    .line 779
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->a(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    .line 785
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 774
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$10;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
