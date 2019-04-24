.class Lo/duc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/duc;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/duc;

.field final synthetic d:Lo/dwr;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/duc;Lo/dwr;Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/duc$1;->b:Lo/duc;

    iput-object p2, p0, Lo/duc$1;->d:Lo/dwr;

    iput-object p3, p0, Lo/duc$1;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 138
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 139
    iget-object v0, p0, Lo/duc$1;->d:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 140
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 141
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "getData data is null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void

    .line 144
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 145
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    .line 146
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvu;

    .line 147
    iget-object v0, p0, Lo/duc$1;->b:Lo/duc;

    invoke-static {v0, v7}, Lo/duc;->c(Lo/duc;Lo/dvu;)V

    .line 148
    iget-object v0, p0, Lo/duc$1;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lo/duc$1;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    :cond_1
    iget-object v0, p0, Lo/duc$1;->b:Lo/duc;

    invoke-static {v0, v7}, Lo/duc;->e(Lo/duc;Lo/dvu;)V

    .line 145
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 152
    :cond_3
    iget-object v0, p0, Lo/duc$1;->b:Lo/duc;

    const-string v1, "success"

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/duc;->d(Lo/duc;ILjava/lang/Object;)V

    .line 153
    return-void
.end method
