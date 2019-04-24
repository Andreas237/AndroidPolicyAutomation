.class Lo/fay$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lo/fay;


# direct methods
.method private constructor <init>(Lo/fay;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/fay$c;->b:Lo/fay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fay;Lo/fay$5;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/fay$c;-><init>(Lo/fay;)V

    return-void
.end method

.method private b(JJLo/fbd$e;)V
    .locals 6

    .line 153
    new-instance v3, Lo/fbr;

    invoke-direct {v3}, Lo/fbr;-><init>()V

    .line 154
    invoke-virtual {v3, p1, p2, p3, p4}, Lo/fbr;->e(JJ)Lo/fbr;

    .line 158
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 159
    sget-object v0, Lo/fbr$e;->e:Lo/fbr$e;

    const-string v1, "HR_WARNING_DETAIL"

    const/16 v2, 0x835

    invoke-virtual {v3, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v5

    .line 161
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lo/fay$c;->b:Lo/fay;

    invoke-static {v0}, Lo/fay;->e(Lo/fay;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fay$c$5;

    invoke-direct {v1, p0, p5}, Lo/fay$c$5;-><init>(Lo/fay$c;Lo/fbd$e;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 201
    return-void
.end method

.method private c(JJLo/fbd$e;)V
    .locals 6

    .line 72
    new-instance v3, Lo/fbr;

    invoke-direct {v3}, Lo/fbr;-><init>()V

    .line 73
    invoke-virtual {v3, p1, p2, p3, p4}, Lo/fbr;->e(JJ)Lo/fbr;

    .line 77
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 78
    sget-object v0, Lo/fbr$e;->a:Lo/fbr$e;

    const-string v1, "HR_WARNING_MAX"

    const v2, 0xb79b

    invoke-virtual {v3, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v5

    .line 80
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    iget-object v0, p0, Lo/fay$c;->b:Lo/fay;

    invoke-static {v0}, Lo/fay;->e(Lo/fay;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fay$c$1;

    invoke-direct {v1, p0, p5}, Lo/fay$c$1;-><init>(Lo/fay$c;Lo/fbd$e;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 109
    return-void
.end method

.method private e(JJLo/fbd$e;)V
    .locals 6

    .line 113
    new-instance v3, Lo/fbr;

    invoke-direct {v3}, Lo/fbr;-><init>()V

    .line 114
    invoke-virtual {v3, p1, p2, p3, p4}, Lo/fbr;->e(JJ)Lo/fbr;

    .line 118
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 119
    sget-object v0, Lo/fbr$e;->b:Lo/fbr$e;

    const-string v1, "HR_WARNING_MAX"

    const v2, 0xb79b

    invoke-virtual {v3, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v5

    .line 121
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lo/fay$c;->b:Lo/fay;

    invoke-static {v0}, Lo/fay;->e(Lo/fay;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/fay$c$3;

    invoke-direct {v1, p0, p5}, Lo/fay$c$3;-><init>(Lo/fay$c;Lo/fbd$e;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 150
    return-void
.end method


# virtual methods
.method public e(Lo/fbh;JJLo/fbd$e;)V
    .locals 6

    .line 61
    sget-object v0, Lo/fbh;->a:Lo/fbh;

    if-ne p1, v0, :cond_0

    .line 62
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lo/fay$c;->c(JJLo/fbd$e;)V

    goto :goto_0

    .line 63
    :cond_0
    sget-object v0, Lo/fbh;->d:Lo/fbh;

    if-ne p1, v0, :cond_1

    .line 64
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lo/fay$c;->e(JJLo/fbd$e;)V

    goto :goto_0

    .line 65
    :cond_1
    sget-object v0, Lo/fbh;->b:Lo/fbh;

    if-ne p1, v0, :cond_2

    .line 66
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lo/fay$c;->b(JJLo/fbd$e;)V

    .line 69
    :cond_2
    :goto_0
    return-void
.end method
