.class final Lo/egp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egp;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Landroid/widget/RelativeLayout;

.field final synthetic f:I

.field final synthetic i:Ljava/lang/String;

.field final synthetic k:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Landroid/widget/RelativeLayout;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/egp$2;->b:Ljava/lang/String;

    iput-object p2, p0, Lo/egp$2;->a:Landroid/content/Context;

    iput-object p3, p0, Lo/egp$2;->e:Landroid/widget/RelativeLayout;

    iput-object p4, p0, Lo/egp$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p5, p0, Lo/egp$2;->d:Ljava/lang/String;

    iput-object p6, p0, Lo/egp$2;->k:Ljava/lang/String;

    iput-object p7, p0, Lo/egp$2;->i:Ljava/lang/String;

    iput p8, p0, Lo/egp$2;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 131
    const-string v0, "UIHLH_CommonAutoTestToast"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click no again notice , "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/egp$2;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lo/egp$2;->b:Ljava/lang/String;

    const-string v1, "1"

    iget-object v2, p0, Lo/egp$2;->a:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lo/egp;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 133
    iget-object v0, p0, Lo/egp$2;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lo/egp$2;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lo/egp$2;->a:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/egp$2;->b:Ljava/lang/String;

    const-string v3, "true"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 138
    iget-object v0, p0, Lo/egp$2;->a:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/egp$2;->d:Ljava/lang/String;

    const-string v3, "false"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 139
    iget-object v0, p0, Lo/egp$2;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/egp$2;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/egp$2;->i:Ljava/lang/String;

    iget v3, p0, Lo/egp$2;->f:I

    invoke-static {v0, v1, v2, v3}, Lo/egp;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 140
    return-void
.end method
