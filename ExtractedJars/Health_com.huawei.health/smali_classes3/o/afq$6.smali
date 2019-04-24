.class Lo/afq$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->a(Ljava/util/ArrayList;Lo/aev;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Lo/afq;


# direct methods
.method constructor <init>(Lo/afq;Ljava/util/ArrayList;)V
    .locals 0

    .line 637
    iput-object p1, p0, Lo/afq$6;->e:Lo/afq;

    iput-object p2, p0, Lo/afq$6;->d:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 640
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/afq$6;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 641
    const/4 v5, 0x0

    :goto_1
    iget-object v0, p0, Lo/afq$6;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afk;

    iget-object v0, v0, Lo/afk;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 642
    iget-object v0, p0, Lo/afq$6;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afk;

    iget-object v0, v0, Lo/afk;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afl;

    invoke-virtual {v0}, Lo/afl;->b()Ljava/lang/String;

    move-result-object v6

    .line 643
    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 644
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    sget-object v1, Lo/agx;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/afq$6;->e:Lo/afq;

    invoke-static {v2}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v2

    invoke-virtual {v0, v6, v1, v2}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    goto :goto_2

    .line 646
    :cond_0
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    sget-object v1, Lo/agx;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/afq$6;->e:Lo/afq;

    invoke-static {v2}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v2

    invoke-virtual {v0, v6, v1, v2}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 641
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 640
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 650
    :cond_2
    iget-object v0, p0, Lo/afq$6;->e:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 651
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group parse success callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    iget-object v0, p0, Lo/afq$6;->e:Lo/afq;

    invoke-static {v0}, Lo/afq;->d(Lo/afq;)Lo/aff;

    move-result-object v0

    const-string v1, "group"

    const/16 v2, 0xc8

    invoke-interface {v0, v2, v1}, Lo/aff;->onResult(ILjava/lang/String;)V

    .line 654
    :cond_3
    return-void
.end method
