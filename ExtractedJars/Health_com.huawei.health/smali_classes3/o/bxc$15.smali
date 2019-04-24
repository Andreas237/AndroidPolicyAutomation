.class Lo/bxc$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->e(Lo/bxc$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/model/Plan;

.field final synthetic d:Lo/bxc;


# direct methods
.method constructor <init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lo/bxc$15;->d:Lo/bxc;

    iput-object p2, p0, Lo/bxc$15;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 351
    iget-object v0, p0, Lo/bxc$15;->d:Lo/bxc;

    iget-object v1, p0, Lo/bxc$15;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v0, v1}, Lo/bxc;->d(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 352
    return-void
.end method
