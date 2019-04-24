.class Lo/dsd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dsd;


# direct methods
.method constructor <init>(Lo/dsd;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/dsd$2;->a:Lo/dsd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 9

    .line 103
    new-instance v2, Lo/dro;

    invoke-direct {v2}, Lo/dro;-><init>()V

    .line 104
    invoke-virtual {v2, p1}, Lo/dro;->d(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v2}, Lo/dro;->b()Lo/dri;

    move-result-object v3

    .line 106
    invoke-virtual {v2}, Lo/dro;->e()Lo/drq;

    move-result-object v4

    .line 107
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lo/drq;->c()Lo/dqy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 108
    invoke-virtual {v4}, Lo/drq;->c()Lo/dqy;

    move-result-object v0

    invoke-virtual {v0}, Lo/dqy;->b()Ljava/util/ArrayList;

    move-result-object v5

    .line 109
    if-eqz v5, :cond_1

    .line 110
    const/4 v6, 0x0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_1

    .line 111
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/drb;

    .line 112
    invoke-virtual {v8}, Lo/drb;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {v8}, Lo/drb;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/drb;->e(Ljava/lang/String;)V

    .line 110
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 119
    :cond_1
    iget-object v0, p0, Lo/dsd$2;->a:Lo/dsd;

    invoke-static {v0, v3}, Lo/dsd;->a(Lo/dsd;Lo/dri;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 120
    iget-object v0, p0, Lo/dsd$2;->a:Lo/dsd;

    invoke-static {v0, v4}, Lo/dsd;->a(Lo/dsd;Lo/drq;)V

    .line 122
    :cond_2
    return-void
.end method
