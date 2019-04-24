.class Lo/bik$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bik;->c(Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bik;

.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lo/bik;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lo/bik$5;->b:Lo/bik;

    iput-object p2, p0, Lo/bik$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 211
    const-string v0, "HealthGroupListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/bik$5;->b:Lo/bik;

    iget-object v1, p0, Lo/bik$5;->c:Lcom/huawei/health/sns/model/group/Group;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/bik;->c(Lo/bik;Lcom/huawei/health/sns/model/group/Group;Z)V

    .line 213
    return-void
.end method
