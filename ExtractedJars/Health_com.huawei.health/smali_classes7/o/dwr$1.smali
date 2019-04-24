.class Lo/dwr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dwr;

.field final synthetic c:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dwr;[Ljava/lang/String;)V
    .locals 0

    .line 708
    iput-object p1, p0, Lo/dwr$1;->a:Lo/dwr;

    iput-object p2, p0, Lo/dwr$1;->c:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 710
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 711
    iget-object v0, p0, Lo/dwr$1;->c:[Ljava/lang/String;

    array-length v5, v0

    .line 712
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 713
    iget-object v0, p0, Lo/dwr$1;->c:[Ljava/lang/String;

    aget-object v7, v0, v6

    .line 714
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 715
    goto :goto_1

    .line 717
    :cond_0
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 712
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 719
    :cond_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 720
    iget-object v0, p0, Lo/dwr$1;->a:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v6}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v7

    .line 721
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 722
    const/4 v8, 0x0

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 723
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dvf;

    .line 724
    instance-of v0, v9, Lo/dvu;

    if-eqz v0, :cond_2

    .line 725
    move-object v10, v9

    check-cast v10, Lo/dvu;

    .line 726
    invoke-virtual {v10}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 727
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealNotUploadMedal medalID is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    iget-object v0, p0, Lo/dwr$1;->a:Lo/dwr;

    iget-object v1, p0, Lo/dwr$1;->a:Lo/dwr;

    invoke-virtual {v10}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10}, Lo/dvu;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/dwr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 722
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 733
    :cond_3
    return-void
.end method
