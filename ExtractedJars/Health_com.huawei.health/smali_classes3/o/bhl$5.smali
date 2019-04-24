.class Lo/bhl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhl;->d(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic d:Lo/bhl;


# direct methods
.method constructor <init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lo/bhl$5;->d:Lo/bhl;

    iput-object p2, p0, Lo/bhl$5;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 259
    iget-object v0, p0, Lo/bhl$5;->d:Lo/bhl;

    iget-object v1, p0, Lo/bhl$5;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, v1}, Lo/bhl;->a(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V

    .line 260
    iget-object v0, p0, Lo/bhl$5;->d:Lo/bhl;

    invoke-static {v0}, Lo/bhl;->a(Lo/bhl;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 261
    return-void
.end method
