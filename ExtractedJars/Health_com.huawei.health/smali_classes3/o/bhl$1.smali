.class Lo/bhl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhl;->e(Lo/bhl$c;ILcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic d:Lo/bhl;


# direct methods
.method constructor <init>(Lo/bhl;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/bhl$1;->d:Lo/bhl;

    iput-object p2, p0, Lo/bhl$1;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 160
    iget-object v0, p0, Lo/bhl$1;->d:Lo/bhl;

    iget-object v1, p0, Lo/bhl$1;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, p1, v1}, Lo/bhl;->d(Lo/bhl;Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V

    .line 161
    const/4 v0, 0x1

    return v0
.end method
