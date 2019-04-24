.class Lo/dca$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field final synthetic b:Lo/dca;

.field c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dca;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/util/ArrayList<[B>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 859
    iput-object p1, p0, Lo/dca$e;->b:Lo/dca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 860
    iput-object p4, p0, Lo/dca$e;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 861
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dca$e;->a:Ljava/util/ArrayList;

    .line 862
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dca$e;->e:Ljava/util/ArrayList;

    .line 863
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 864
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 865
    iget-object v0, p0, Lo/dca$e;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 864
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 868
    :cond_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 869
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 870
    iget-object v0, p0, Lo/dca$e;->e:Ljava/util/ArrayList;

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 869
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 873
    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 877
    iget-object v0, p0, Lo/dca$e;->b:Lo/dca;

    iget-object v1, p0, Lo/dca$e;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/dca$e;->e:Ljava/util/ArrayList;

    iget-object v3, p0, Lo/dca$e;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2, v3}, Lo/dca;->b(Lo/dca;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 878
    return-void
.end method
