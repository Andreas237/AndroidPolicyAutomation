.class Lcom/huawei/bone/social/ui/RankingFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/RankingFragment;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/bone/social/ui/RankingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 558
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$2;->b:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 560
    new-instance v2, Lo/wq;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 561
    new-instance v0, Lcom/huawei/bone/social/ui/RankingFragment$2$4;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/RankingFragment$2$4;-><init>(Lcom/huawei/bone/social/ui/RankingFragment$2;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Lo/wq;->a(ILo/wo;)V

    .line 589
    return-void
.end method
