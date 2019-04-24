.class Lcom/huawei/ui/main/stories/history/SportDataActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/history/SportDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 678
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/eic;IILo/eie;)V
    .locals 10

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;Z)Z

    .line 687
    mul-int/lit8 v0, p2, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 688
    mul-int/lit8 v0, p3, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v8, v0, v2

    .line 691
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    goto :goto_0

    .line 693
    :cond_0
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    goto :goto_0

    .line 695
    :cond_1
    invoke-virtual {p1}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    goto :goto_0

    .line 698
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(Lcom/huawei/ui/main/stories/history/SportDataActivity;I)I

    .line 701
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->h(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Lo/ffi;

    move-result-object v0

    move-wide v1, v6

    move-wide v3, v8

    iget-object v5, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->i(Lcom/huawei/ui/main/stories/history/SportDataActivity;)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/ffi;->a(JJI)V

    .line 702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d(Lcom/huawei/ui/main/stories/history/SportDataActivity;Z)Z

    .line 703
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;-><init>(Lcom/huawei/ui/main/stories/history/SportDataActivity$2;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 710
    return-void
.end method
