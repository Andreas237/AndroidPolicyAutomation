.class public Lcom/huawei/hwid/update/d/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/update/d/j;->f:Z

    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)TT;"
        }
    .end annotation

    .line 81
    return-object p0
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hwid/update/d/j;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/hwid/update/d/j;->b:I

    .line 43
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwid/update/d/j;->a:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 67
    iput-object p1, p0, Lcom/huawei/hwid/update/d/j;->e:Ljava/util/ArrayList;

    .line 68
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 76
    iput-boolean p1, p0, Lcom/huawei/hwid/update/d/j;->f:Z

    .line 77
    return-void
.end method

.method b()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/hwid/update/d/j;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hwid/update/d/j;->c:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwid/update/d/j;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwid/update/d/j;->d:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/huawei/hwid/update/d/j;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/j;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
