.class Lo/dwo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwo;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwo;


# direct methods
.method constructor <init>(Lo/dwo;)V
    .locals 0

    .line 856
    iput-object p1, p0, Lo/dwo$1;->b:Lo/dwo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 858
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 859
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 860
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 861
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "kakas is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 862
    return-void

    .line 864
    :cond_0
    invoke-static {}, Lo/dwo;->k()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 865
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lo/dwo;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 867
    :cond_1
    invoke-static {}, Lo/dwo;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 868
    iget-object v0, p0, Lo/dwo$1;->b:Lo/dwo;

    invoke-static {}, Lo/dwo;->k()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dwo;->c(Ljava/util/ArrayList;)V

    .line 870
    :cond_2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 872
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kakas size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 874
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 875
    instance-of v0, v7, Lo/dvq;

    if-eqz v0, :cond_3

    .line 876
    move-object v8, v7

    check-cast v8, Lo/dvq;

    .line 877
    invoke-static {}, Lo/dwo;->k()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v8}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 878
    iget-object v0, p0, Lo/dwo$1;->b:Lo/dwo;

    invoke-virtual {v8}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1, v8}, Lo/dwo;->c(Ljava/util/Map;Ljava/lang/String;Lo/dvq;)V

    .line 873
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 882
    :cond_4
    iget-object v0, p0, Lo/dwo$1;->b:Lo/dwo;

    invoke-static {}, Lo/dwo;->k()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/dwo;->c(Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 883
    return-void
.end method
