.class public Lcom/huawei/hms/update/e/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/ArrayList;

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/update/e/u;->g:Z

    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)TT;"
        }
    .end annotation

    .line 91
    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/hms/update/e/u;->c:I

    .line 53
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hms/update/e/u;->b:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/hms/update/e/u;->f:Ljava/util/ArrayList;

    .line 78
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/hms/update/e/u;->a:Z

    .line 37
    return-void
.end method

.method a()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/u;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method b()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hms/update/e/u;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/hms/update/e/u;->d:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 86
    iput-boolean p1, p0, Lcom/huawei/hms/update/e/u;->g:Z

    .line 87
    return-void
.end method

.method c()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hms/update/e/u;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hms/update/e/u;->e:Ljava/lang/String;

    .line 70
    return-void
.end method

.method d()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/hms/update/e/u;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/hms/update/e/u;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/util/ArrayList;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hms/update/e/u;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/u;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/e/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
