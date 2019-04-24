.class public Lo/esj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esd;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field c:Lo/esb;

.field private e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ILandroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esj;->e:Z

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lo/esj;->b:Ljava/lang/String;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esj;->c:Lo/esb;

    .line 21
    new-instance v0, Lo/esb;

    invoke-direct {v0, p3}, Lo/esb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/esj;->c:Lo/esb;

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 24
    invoke-direct {p0, p1, p2}, Lo/esj;->c(Ljava/lang/String;I)V

    .line 26
    return-void
.end method

.method private c(Ljava/lang/String;I)V
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lo/esj;->e(Ljava/lang/String;)V

    .line 31
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lo/esj;->c:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 34
    goto :goto_0

    .line 36
    :pswitch_1
    iget-object v0, p0, Lo/esj;->c:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 37
    goto :goto_0

    .line 39
    :pswitch_2
    iget-object v0, p0, Lo/esj;->c:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 40
    goto :goto_0

    .line 42
    :pswitch_3
    iget-object v0, p0, Lo/esj;->c:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 43
    goto :goto_0

    .line 45
    :pswitch_4
    iget-object v0, p0, Lo/esj;->c:Lo/esb;

    invoke-virtual {v0}, Lo/esb;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/esj;->a:Ljava/util/List;

    .line 46
    .line 52
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public c(I)Lo/esd;
    .locals 1

    .line 63
    invoke-virtual {p0}, Lo/esj;->d()I

    move-result v0

    if-gt v0, p1, :cond_0

    .line 64
    const/4 v0, 0x0

    return-object v0

    .line 66
    :cond_0
    iget-object v0, p0, Lo/esj;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esd;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 56
    iget-object v0, p0, Lo/esj;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 57
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    iget-object v0, p0, Lo/esj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 74
    iput-boolean p1, p0, Lo/esj;->e:Z

    .line 75
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/esj;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/esj;->b:Ljava/lang/String;

    .line 83
    return-void
.end method
