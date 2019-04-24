.class Lo/dsf$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dsf;


# direct methods
.method constructor <init>(Lo/dsf;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/dsf$5;->d:Lo/dsf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 15

    .line 126
    new-instance v3, Lo/dro;

    invoke-direct {v3}, Lo/dro;-><init>()V

    .line 127
    move-object/from16 v0, p1

    invoke-virtual {v3, v0}, Lo/dro;->d(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v3}, Lo/dro;->b()Lo/dri;

    move-result-object v4

    .line 129
    invoke-virtual {v3}, Lo/dro;->c()Lo/drp;

    move-result-object v5

    .line 130
    invoke-virtual {v3}, Lo/dro;->b()Lo/dri;

    move-result-object v0

    invoke-virtual {v0}, Lo/dri;->c()Ljava/lang/String;

    move-result-object v6

    .line 131
    invoke-static {}, Lo/dsf;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reqName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    const-string v0, "GetDevServInfo"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    invoke-virtual {v3}, Lo/dro;->e()Lo/drq;

    move-result-object v7

    .line 134
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 135
    invoke-virtual {v7}, Lo/drq;->c()Lo/dqy;

    move-result-object v8

    .line 136
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 137
    invoke-virtual {v8}, Lo/dqy;->b()Ljava/util/ArrayList;

    move-result-object v9

    .line 138
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 139
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    .line 140
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_1

    .line 141
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/drb;

    .line 142
    const/4 v0, 0x0

    if-eq v0, v12, :cond_0

    .line 143
    invoke-virtual {v12}, Lo/drb;->e()Ljava/lang/String;

    move-result-object v13

    .line 144
    const/4 v0, 0x0

    if-eq v0, v13, :cond_0

    .line 145
    iget-object v0, p0, Lo/dsf$5;->d:Lo/dsf;

    invoke-static {v0}, Lo/dsf;->a(Lo/dsf;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 146
    iget-object v0, p0, Lo/dsf$5;->d:Lo/dsf;

    invoke-static {v0}, Lo/dsf;->a(Lo/dsf;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "smdp_address"

    invoke-static {v0, v14, v1, v13}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 140
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 154
    :cond_1
    iget-object v0, p0, Lo/dsf$5;->d:Lo/dsf;

    invoke-static {v0, v4}, Lo/dsf;->c(Lo/dsf;Lo/dri;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    iget-object v0, p0, Lo/dsf$5;->d:Lo/dsf;

    invoke-static {v0, v5}, Lo/dsf;->d(Lo/dsf;Lo/drp;)V

    .line 157
    :cond_2
    return-void
.end method
