.class Lcom/huawei/health/sns/api/NotifyCenterManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/api/NotifyCenterManager;->k()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/api/NotifyCenterManager;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/api/NotifyCenterManager;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/health/sns/api/NotifyCenterManager$4;->a:Lcom/huawei/health/sns/api/NotifyCenterManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 135
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/api/NotifyCenterManager$4;->d(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/huawei/health/sns/api/NotifyCenterManager$4;->a:Lcom/huawei/health/sns/api/NotifyCenterManager;

    iget-object v1, p0, Lcom/huawei/health/sns/api/NotifyCenterManager$4;->a:Lcom/huawei/health/sns/api/NotifyCenterManager;

    invoke-virtual {v1}, Lcom/huawei/health/sns/api/NotifyCenterManager;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/api/NotifyCenterManager;->b(Lcom/huawei/health/sns/api/NotifyCenterManager;I)V

    .line 140
    const/4 v0, 0x0

    return-object v0
.end method
