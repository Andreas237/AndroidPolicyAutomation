.class final Lo/egp$5;
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

.field final synthetic b:Landroid/widget/RelativeLayout;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic h:I

.field final synthetic k:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 142
    iput-object p1, p0, Lo/egp$5;->e:Ljava/lang/String;

    iput-object p2, p0, Lo/egp$5;->a:Landroid/content/Context;

    iput-object p3, p0, Lo/egp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p4, p0, Lo/egp$5;->b:Landroid/widget/RelativeLayout;

    iput-object p5, p0, Lo/egp$5;->c:Ljava/lang/String;

    iput-object p6, p0, Lo/egp$5;->k:Ljava/lang/String;

    iput-object p7, p0, Lo/egp$5;->f:Ljava/lang/String;

    iput p8, p0, Lo/egp$5;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 145
    const-string v0, "UIHLH_CommonAutoTestToast"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click cancel , "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/egp$5;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/egp$5;->e:Ljava/lang/String;

    const-string v1, "0"

    iget-object v2, p0, Lo/egp$5;->a:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lo/egp;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 147
    iget-object v0, p0, Lo/egp$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lo/egp$5;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lo/egp$5;->a:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/egp$5;->c:Ljava/lang/String;

    const-string v3, "false"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 150
    iget-object v0, p0, Lo/egp$5;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/egp$5;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/egp$5;->f:Ljava/lang/String;

    iget v3, p0, Lo/egp$5;->h:I

    invoke-static {v0, v1, v2, v3}, Lo/egp;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    return-void
.end method
