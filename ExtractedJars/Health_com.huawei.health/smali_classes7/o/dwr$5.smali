.class Lo/dwr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dwr;


# direct methods
.method constructor <init>(Lo/dwr;)V
    .locals 0

    .line 892
    iput-object p1, p0, Lo/dwr$5;->d:Lo/dwr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 896
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 897
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 899
    const-wide/16 v4, 0x0

    .line 900
    iget-object v0, p0, Lo/dwr$5;->d:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v2}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v6

    .line 901
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 902
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    .line 903
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    .line 904
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dvf;

    .line 905
    instance-of v0, v9, Lo/dvu;

    if-eqz v0, :cond_1

    .line 906
    move-object v10, v9

    check-cast v10, Lo/dvu;

    .line 907
    invoke-virtual {v10}, Lo/dvu;->y()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    invoke-virtual {v10}, Lo/dvu;->y()J

    move-result-wide v0

    goto :goto_1

    :cond_0
    move-wide v0, v4

    :goto_1
    move-wide v4, v0

    .line 903
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 910
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 911
    const-string v0, "timestamp"

    invoke-interface {v3, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    :cond_3
    iget-object v0, p0, Lo/dwr$5;->d:Lo/dwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 914
    return-void
.end method
