.class Lo/bik$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bik;->e(Lo/bik$b;ILcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic c:Lo/bik;


# direct methods
.method constructor <init>(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/bik$4;->c:Lo/bik;

    iput-object p2, p0, Lo/bik$4;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 152
    iget-object v0, p0, Lo/bik$4;->c:Lo/bik;

    iget-object v1, p0, Lo/bik$4;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, p1, v1}, Lo/bik;->e(Lo/bik;Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V

    .line 153
    const/4 v0, 0x1

    return v0
.end method
