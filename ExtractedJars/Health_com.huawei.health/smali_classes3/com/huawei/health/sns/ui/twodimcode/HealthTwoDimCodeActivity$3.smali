.class Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;->d:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 200
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 203
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;->d:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->b(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;->d:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v0, v3}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Lcom/huawei/health/sns/model/group/Group;)V

    .line 205
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
