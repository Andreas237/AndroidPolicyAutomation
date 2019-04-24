.class Lcom/huawei/openalliance/ad/views/c$1;
.super Lcom/huawei/openalliance/ad/monitor/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/openalliance/ad/views/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/c;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/monitor/b;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a(JI)V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/c;->a(Lcom/huawei/openalliance/ad/views/c;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "PPSBaseView"

    const-string v1, "onViewShowEnd - no adShowStartTime"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/c;->a(Lcom/huawei/openalliance/ad/views/c;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v4, v2, v0

    const/16 v6, 0x64

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/c;->a:Lcom/huawei/openalliance/ad/j/a/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/c;->a:Lcom/huawei/openalliance/ad/j/a/f;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/views/c;->b:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v0, v1, v4, v5, v6}, Lcom/huawei/openalliance/ad/j/a/f;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;JI)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/c$1;->b:Lcom/huawei/openalliance/ad/views/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/c;->a(Lcom/huawei/openalliance/ad/views/c;Ljava/lang/Long;)Ljava/lang/Long;

    return-void
.end method
