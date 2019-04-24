.class Lo/dwr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dwr;


# direct methods
.method constructor <init>(Lo/dwr;)V
    .locals 0

    .line 920
    iput-object p1, p0, Lo/dwr$2;->e:Lo/dwr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 924
    iget-object v0, p0, Lo/dwr$2;->e:Lo/dwr;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 925
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 926
    return-void

    .line 929
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 930
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvf;

    .line 931
    const/4 v6, 0x0

    .line 932
    instance-of v0, v5, Lo/dvs;

    if-eqz v0, :cond_1

    .line 933
    move-object v6, v5

    check-cast v6, Lo/dvs;

    .line 935
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 936
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 937
    invoke-static {}, Lo/dwr;->z()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalConfigInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvs;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 939
    invoke-virtual {v6}, Lo/dvs;->m()Ljava/lang/String;

    move-result-object v10

    .line 940
    invoke-virtual {v6}, Lo/dvs;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    .line 941
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    .line 942
    const-string v0, "eventType"

    invoke-interface {v7, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    const-string v0, "key"

    invoke-virtual {v6}, Lo/dvs;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    const-string v0, "keyType"

    invoke-virtual {v6}, Lo/dvs;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    const-string v0, "value"

    const-string v1, "true"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    const-string v0, "timestamp"

    invoke-interface {v7, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 947
    const-string v0, "medalId"

    invoke-virtual {v6}, Lo/dvs;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    const-string v0, "NOT_UPLOAD"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 949
    iget-object v0, p0, Lo/dwr$2;->e:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v7}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 929
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 954
    :cond_3
    return-void
.end method
