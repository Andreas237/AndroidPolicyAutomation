.class Lo/bxc$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->c(Lo/bxc$a;Lcom/huawei/health/suggestion/model/Plan;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bxc;

.field final synthetic e:Lcom/huawei/health/suggestion/model/Plan;


# direct methods
.method constructor <init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lo/bxc$9;->b:Lo/bxc;

    iput-object p2, p0, Lo/bxc$9;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 232
    iget-object v0, p0, Lo/bxc$9;->b:Lo/bxc;

    iget-object v1, p0, Lo/bxc$9;->e:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v0, v1}, Lo/bxc;->d(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 233
    return-void
.end method
