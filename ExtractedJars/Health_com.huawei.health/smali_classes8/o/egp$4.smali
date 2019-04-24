.class final Lo/egp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egp;->c(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/RelativeLayout;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic h:I

.field final synthetic i:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/widget/RelativeLayout;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 264
    iput-object p1, p0, Lo/egp$4;->a:Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lo/egp$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p3, p0, Lo/egp$4;->c:Landroid/content/Context;

    iput-object p4, p0, Lo/egp$4;->e:Ljava/lang/String;

    iput-object p5, p0, Lo/egp$4;->b:Ljava/lang/String;

    iput-object p6, p0, Lo/egp$4;->f:Ljava/lang/String;

    iput-object p7, p0, Lo/egp$4;->i:Ljava/lang/String;

    iput p8, p0, Lo/egp$4;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 267
    iget-object v0, p0, Lo/egp$4;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lo/egp$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 269
    iget-object v0, p0, Lo/egp$4;->c:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/egp$4;->e:Ljava/lang/String;

    const-string v3, "true"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 272
    iget-object v0, p0, Lo/egp$4;->c:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/egp$4;->b:Ljava/lang/String;

    const-string v3, "false"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 273
    iget-object v0, p0, Lo/egp$4;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/egp$4;->f:Ljava/lang/String;

    iget-object v2, p0, Lo/egp$4;->i:Ljava/lang/String;

    iget v3, p0, Lo/egp$4;->h:I

    invoke-static {v0, v1, v2, v3}, Lo/egp;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    .line 274
    return-void
.end method
