.class public Lo/ctw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctw$b;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    .line 25
    invoke-direct {p0}, Lo/ctw;->c()V

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Lo/ctw$4;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/ctw;-><init>()V

    return-void
.end method

.method private c()V
    .locals 2

    .line 36
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/ctw;->e:Ljava/util/List;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/ctw;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctw;->b:Landroid/content/Context;

    .line 56
    sget-object v0, Lo/ctw$b;->d:Lo/ctw;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    invoke-static {v0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const/4 v0, 0x0

    return-object v0

    .line 90
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 92
    iget-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 93
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    goto :goto_2

    .line 97
    :cond_1
    goto :goto_1

    .line 98
    :cond_2
    :goto_2
    goto :goto_0

    .line 99
    :cond_3
    return-object v1
.end method

.method public a()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Lo/ctw;->c()V

    .line 61
    sget-object v0, Lo/ctw;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/ctw;->e:Ljava/util/List;

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/cui;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    .line 62
    return-void
.end method

.method public d(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SyncKey;>;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    invoke-static {v0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    iget-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 77
    invoke-virtual {v3}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 78
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    return-object v1

    .line 81
    :cond_1
    goto :goto_0

    .line 82
    :cond_2
    return-object v1
.end method

.method public e()V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    invoke-static {v0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ctw;->d:Ljava/util/List;

    .line 68
    :cond_0
    return-void
.end method
