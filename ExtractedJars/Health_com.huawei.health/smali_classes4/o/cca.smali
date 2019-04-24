.class public Lo/cca;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ccr;>;"
        }
    .end annotation
.end field

.field private b:Lo/ccf;

.field private c:I

.field private d:Lo/cbq;


# direct methods
.method public constructor <init>(Lo/ccp;I)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cca;->a:Ljava/util/List;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/cca;->c:I

    .line 134
    new-instance v0, Lo/cca$4;

    invoke-direct {v0, p0}, Lo/cca$4;-><init>(Lo/cca;)V

    iput-object v0, p0, Lo/cca;->b:Lo/ccf;

    .line 42
    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    return-void

    .line 46
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/cca;->d(Lo/ccp;I)V

    .line 47
    invoke-direct {p0}, Lo/cca;->e()V

    .line 48
    invoke-direct {p0}, Lo/cca;->b()V

    .line 50
    return-void
.end method

.method static synthetic a(Lo/cca;)Lo/cbq;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/cca;->d:Lo/cbq;

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 99
    iget-object v0, p0, Lo/cca;->d:Lo/cbq;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/cca;->d:Lo/cbq;

    invoke-virtual {v0}, Lo/cbq;->d()V

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cca;->d:Lo/cbq;

    goto :goto_0

    .line 103
    :cond_0
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stop mArMotionDetector is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :goto_0
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    if-nez v0, :cond_1

    .line 107
    return-void

    .line 110
    :cond_1
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ccr;

    .line 112
    if-eqz v5, :cond_2

    .line 114
    invoke-interface {v5}, Lo/ccr;->a()V

    goto :goto_2

    .line 116
    :cond_2
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stop iTrackStategy is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :goto_2
    goto :goto_1

    .line 121
    :cond_3
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cca;->a:Ljava/util/List;

    .line 123
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destoryAllStragety"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void
.end method

.method private a(I)V
    .locals 6

    .line 159
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 160
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dispatchPhoneState null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return-void

    .line 163
    :cond_0
    iget v0, p0, Lo/cca;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 164
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " dispatchPhoneState IS mPhoneState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cca;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-void

    .line 167
    :cond_1
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ccr;

    .line 168
    if-eqz v5, :cond_2

    .line 169
    invoke-interface {v5, p1}, Lo/ccr;->c(I)V

    goto :goto_1

    .line 171
    :cond_2
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dispatchPhoneState is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :goto_1
    goto :goto_0

    .line 174
    :cond_3
    return-void
.end method

.method static synthetic a(Lo/cca;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/cca;->a(I)V

    return-void
.end method

.method private b()V
    .locals 4

    .line 128
    new-instance v0, Lo/cbq;

    iget-object v1, p0, Lo/cca;->b:Lo/ccf;

    invoke-direct {v0, v1}, Lo/cbq;-><init>(Lo/ccf;)V

    iput-object v0, p0, Lo/cca;->d:Lo/cbq;

    .line 129
    iget-object v0, p0, Lo/cca;->d:Lo/cbq;

    invoke-virtual {v0}, Lo/cbq;->c()V

    .line 130
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMotionDetector"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    return-void
.end method

.method private d(Lo/ccp;I)V
    .locals 9

    .line 74
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 75
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 76
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    .line 77
    new-instance v7, Lo/cee;

    invoke-direct {v7, v4, v5, v6}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v7}, Lo/cee;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    new-instance v8, Lo/ccu;

    invoke-direct {v8}, Lo/ccu;-><init>()V

    .line 81
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_0
    const/16 v0, 0x108

    if-eq p2, v0, :cond_1

    .line 87
    new-instance v8, Lo/cct;

    iget-object v0, p0, Lo/cca;->b:Lo/ccf;

    invoke-direct {v8, p1, v0}, Lo/cct;-><init>(Lo/ccp;Lo/ccf;)V

    .line 88
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_1
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAllStragety"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method

.method private e()V
    .locals 6

    .line 56
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ccr;

    .line 58
    if-eqz v5, :cond_0

    .line 60
    invoke-interface {v5}, Lo/ccr;->c()V

    goto :goto_1

    .line 62
    :cond_0
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " start iTrackStategy is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    :goto_1
    goto :goto_0

    .line 65
    :cond_1
    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 69
    invoke-direct {p0}, Lo/cca;->a()V

    .line 70
    return-void
.end method

.method public e(I)V
    .locals 6

    .line 178
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyUserOperateSportState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iput p1, p0, Lo/cca;->c:I

    .line 180
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 181
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " dispatchPhoneState IS mPhoneState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cca;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    if-nez v0, :cond_1

    .line 185
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserOperateSportState null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lo/cca;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ccr;

    .line 189
    if-eqz v5, :cond_2

    .line 190
    invoke-interface {v5, p1}, Lo/ccr;->e(I)V

    goto :goto_1

    .line 192
    :cond_2
    const-string v0, "Track_StrategyManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserOperateSportState is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    :goto_1
    goto :goto_0

    .line 195
    :cond_3
    return-void
.end method
