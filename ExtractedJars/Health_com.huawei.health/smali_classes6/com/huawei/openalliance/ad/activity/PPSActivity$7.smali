.class Lcom/huawei/openalliance/ad/activity/PPSActivity$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/activity/PPSActivity;->j()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/activity/PPSActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$7;->a:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$7;->a:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->b(Lcom/huawei/openalliance/ad/activity/PPSActivity;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->w()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/activity/PPSActivity$7;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
