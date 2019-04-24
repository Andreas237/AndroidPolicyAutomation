.class Lo/eyo$b;
.super Lo/ezi$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo/eyo;


# direct methods
.method public constructor <init>(Lo/eyo;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Landroid/view/View;>;)V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lo/eyo$b;->e:Lo/eyo;

    .line 44
    invoke-direct {p0, p1, p2}, Lo/ezi$g;-><init>(Lo/ezi;Ljava/util/List;)V

    .line 45
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 49
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    iget-boolean v0, v0, Lo/ezi$d;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    iget-object v0, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    if-nez v0, :cond_1

    .line 50
    :cond_0
    return-void

    .line 52
    :cond_1
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    iget-object v2, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 55
    const-string v0, "rest_hr"

    iget-object v1, v2, Lo/ezi$d$c;->a:Lo/ehe$a;

    invoke-virtual {v1}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->g()V

    .line 57
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 58
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 59
    return-void

    .line 63
    :cond_2
    const-string v0, "warning_hr"

    iget-object v1, v2, Lo/ezi$d$c;->a:Lo/ehe$a;

    invoke-virtual {v1}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 64
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->n()V

    .line 65
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 66
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 67
    return-void

    .line 70
    :cond_3
    invoke-super {p0}, Lo/ezi$g;->a()V

    .line 71
    return-void
.end method

.method public a(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ezi$f;
        }
    .end annotation

    .line 77
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    .line 78
    :cond_0
    return-void

    .line 81
    :cond_1
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ehe$a;

    .line 84
    const-string v0, "rest_hr"

    invoke-virtual {v3}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 87
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    new-instance v1, Lo/ezi$d$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ezi$d$c;-><init>(Lo/eii;Lo/ehe$a;)V

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 90
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    invoke-static {v0}, Lo/eyo;->e(Lo/eyo;)V

    .line 91
    return-void

    .line 95
    :cond_2
    const-string v0, "warning_hr"

    invoke-virtual {v3}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 97
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 98
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->d:Lo/ezi$d;

    new-instance v1, Lo/ezi$d$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v3}, Lo/ezi$d$c;-><init>(Lo/eii;Lo/ehe$a;)V

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 102
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    invoke-static {v0}, Lo/eyo;->b(Lo/eyo;)V

    .line 106
    :cond_3
    return-void

    .line 109
    :cond_4
    invoke-super {p0, p1}, Lo/ezi$g;->a(I)V

    .line 110
    return-void
.end method

.method public d()V
    .locals 8

    .line 115
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    invoke-static {v0}, Lo/eyo;->d(Lo/eyo;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 116
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    invoke-static {v0}, Lo/eyo;->d(Lo/eyo;)Landroid/graphics/Paint;

    move-result-object v0

    const/16 v1, 0xff

    const/16 v2, 0xfc

    const/16 v3, 0x31

    const/16 v4, 0x59

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 117
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    invoke-static {v0}, Lo/eyo;->d(Lo/eyo;)Landroid/graphics/Paint;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ehe$a;

    .line 122
    if-eqz v6, :cond_0

    const-string v0, "rest_hr"

    invoke-virtual {v6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0, v6}, Lo/ezh;->c(Lo/ehe$a;)Lo/eii;

    move-result-object v7

    .line 124
    invoke-virtual {p0, v6, v7}, Lo/eyo$b;->c(Lo/ehe$a;Lo/eii;)V

    .line 125
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->b:Ljava/util/Map;

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    goto :goto_0

    .line 130
    :cond_0
    if-eqz v6, :cond_1

    const-string v0, "warning_hr"

    invoke-virtual {v6}, Lo/ehe$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->f:Lo/ezh;

    invoke-virtual {v0, v6}, Lo/ezh;->c(Lo/ehe$a;)Lo/eii;

    move-result-object v7

    .line 132
    invoke-virtual {p0, v6, v7}, Lo/eyo$b;->c(Lo/ehe$a;Lo/eii;)V

    .line 133
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    iget-object v0, v0, Lo/eyo;->b:Ljava/util/Map;

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    goto :goto_0

    .line 136
    :cond_1
    goto :goto_0

    .line 138
    :cond_2
    iget-object v0, p0, Lo/eyo$b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    .line 139
    instance-of v0, v6, Lo/ezn;

    if-eqz v0, :cond_3

    .line 140
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    move-object v1, v6

    check-cast v1, Lo/ezn;

    invoke-static {v0, v1}, Lo/eyo;->b(Lo/eyo;Lo/ezn;)V

    goto :goto_2

    .line 141
    :cond_3
    instance-of v0, v6, Lo/ezm;

    if-eqz v0, :cond_4

    .line 142
    iget-object v0, p0, Lo/eyo$b;->e:Lo/eyo;

    move-object v1, v6

    check-cast v1, Lo/ezm;

    invoke-static {v0, v1}, Lo/eyo;->a(Lo/eyo;Lo/ezm;)V

    .line 144
    :cond_4
    :goto_2
    goto :goto_1

    .line 145
    :cond_5
    return-void
.end method
