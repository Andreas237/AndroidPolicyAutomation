.class public Lo/dar;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;"
        }
    .end annotation
.end field

.field private e:Z


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;Ljava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;Z)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Lo/dar;->b:I

    .line 18
    iput-object p2, p0, Lo/dar;->a:Ljava/util/ArrayList;

    .line 19
    iput-object p3, p0, Lo/dar;->c:Ljava/util/ArrayList;

    .line 20
    iput-boolean p4, p0, Lo/dar;->e:Z

    .line 21
    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lo/dar;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 24
    iget v0, p0, Lo/dar;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lo/dar;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lo/dar;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public d(Z)V
    .locals 1

    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/dar;->e:Z

    .line 43
    return-void
.end method
