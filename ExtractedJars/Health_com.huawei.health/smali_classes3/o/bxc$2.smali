.class Lo/bxc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->a(Lcom/huawei/health/suggestion/model/Plan;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/Plan;

.field final synthetic e:Lo/bxc;


# direct methods
.method constructor <init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lo/bxc$2;->e:Lo/bxc;

    iput-object p2, p0, Lo/bxc$2;->b:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 389
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/bxc$2;->b:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bxc$2$4;

    invoke-direct {v2, p0}, Lo/bxc$2$4;-><init>(Lo/bxc$2;)V

    invoke-virtual {v0, v1, v2}, Lo/brt;->c(Ljava/lang/String;Lo/bui;)V

    .line 402
    return-void
.end method
