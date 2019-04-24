.class Lo/eji$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eji$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:Lo/eje;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eje;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lo/eji;


# direct methods
.method constructor <init>(Lo/eji;)V
    .locals 6

    .line 127
    iput-object p1, p0, Lo/eji$a;->e:Lo/eji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eji$a;->a:Lo/eje;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eji$a;->d:Ljava/util/List;

    .line 128
    iget-object v0, p0, Lo/eji$a;->d:Ljava/util/List;

    new-instance v1, Lo/ejc;

    invoke-static {p1}, Lo/eji;->d(Lo/eji;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v3

    invoke-static {p1}, Lo/eji;->h(Lo/eji;)Lo/oa;

    move-result-object v4

    invoke-static {p1}, Lo/eji;->k(Lo/eji;)Lo/eja;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lo/ejc;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/eja;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    iget-object v0, p0, Lo/eji$a;->d:Ljava/util/List;

    new-instance v1, Lo/eiy;

    invoke-static {p1}, Lo/eji;->d(Lo/eji;)Landroid/content/Context;

    move-result-object v2

    invoke-static {p1}, Lo/eji;->a(Lo/eji;)Lo/eie;

    move-result-object v3

    invoke-static {p1}, Lo/eji;->h(Lo/eji;)Lo/oa;

    move-result-object v4

    invoke-static {p1}, Lo/eji;->k(Lo/eji;)Lo/eja;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lo/eiy;-><init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/eja;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    return-void
.end method


# virtual methods
.method public c(Landroid/view/MotionEvent;)Lo/eji$b;
    .locals 5

    .line 134
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v2, v0, 0xff

    .line 135
    if-eqz v2, :cond_0

    const/4 v0, 0x5

    if-ne v2, v0, :cond_3

    .line 137
    :cond_0
    iget-object v0, p0, Lo/eji$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eje;

    .line 138
    invoke-interface {v4, p1}, Lo/eje;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    goto :goto_0

    .line 143
    :cond_1
    iget-object v0, p0, Lo/eji$a;->a:Lo/eje;

    if-eqz v0, :cond_2

    .line 144
    iget-object v0, p0, Lo/eji$a;->a:Lo/eje;

    invoke-interface {v0}, Lo/eje;->b()V

    .line 146
    :cond_2
    invoke-interface {v4}, Lo/eje;->e()V

    .line 148
    iput-object v4, p0, Lo/eji$a;->a:Lo/eje;

    .line 149
    .line 152
    :cond_3
    iget-object v0, p0, Lo/eji$a;->a:Lo/eje;

    if-nez v0, :cond_4

    .line 153
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no op seq defined,logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_4
    iget-object v0, p0, Lo/eji$a;->a:Lo/eje;

    invoke-interface {v0, p1}, Lo/eje;->d(Landroid/view/MotionEvent;)V

    .line 158
    iget-object v0, p0, Lo/eji$a;->a:Lo/eje;

    invoke-interface {v0}, Lo/eje;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 159
    iget-object v0, p0, Lo/eji$a;->e:Lo/eji;

    invoke-static {v0}, Lo/eji;->c(Lo/eji;)Lo/eji$b;

    move-result-object v0

    return-object v0

    .line 161
    :cond_5
    return-object p0
.end method
