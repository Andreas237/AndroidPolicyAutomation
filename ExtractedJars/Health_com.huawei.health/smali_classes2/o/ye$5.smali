.class Lo/ye$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ye;->a(Lo/yb;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/ye;


# direct methods
.method constructor <init>(Lo/ye;I)V
    .locals 0

    .line 251
    iput-object p1, p0, Lo/ye$5;->d:Lo/ye;

    iput p2, p0, Lo/ye$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 254
    iget-object v0, p0, Lo/ye$5;->d:Lo/ye;

    iget-object v1, p0, Lo/ye$5;->d:Lo/ye;

    invoke-static {v1}, Lo/ye;->c(Lo/ye;)Ljava/util/ArrayList;

    move-result-object v1

    iget v2, p0, Lo/ye$5;->a:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/ye;->b(Lo/ye;J)V

    .line 255
    return-void
.end method
