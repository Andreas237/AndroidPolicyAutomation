.class final Lo/fdr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdr;->b(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fha;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/fha;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/fdr$4;->a:Lo/fha;

    iput-object p2, p0, Lo/fdr$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 223
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get hselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fdr$4;->a:Lo/fha;

    invoke-virtual {v2}, Lo/fha;->getCurrentPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/fdr$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/fdr$4;->a:Lo/fha;

    invoke-virtual {v1}, Lo/fha;->getCurrentPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 225
    return-void
.end method
