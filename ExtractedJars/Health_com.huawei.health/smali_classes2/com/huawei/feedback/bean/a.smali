.class public Lcom/huawei/feedback/bean/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final a:J = 0x1L

.field private static final b:I = -0x1


# instance fields
.field private c:J

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/feedback/bean/a;->c:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 26
    iget-wide v0, p0, Lcom/huawei/feedback/bean/a;->c:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/feedback/bean/a;->e:I

    .line 39
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 30
    iput-wide p1, p0, Lcom/huawei/feedback/bean/a;->c:J

    .line 31
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/feedback/bean/a;->d:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 78
    iput-boolean p1, p0, Lcom/huawei/feedback/bean/a;->g:Z

    .line 79
    return-void
.end method

.method public b()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/feedback/bean/a;->e:I

    return v0
.end method

.method public b(J)V
    .locals 0

    .line 54
    iput-wide p1, p0, Lcom/huawei/feedback/bean/a;->i:J

    .line 55
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/feedback/bean/a;->f:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/feedback/bean/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/feedback/bean/a;->h:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public d()J
    .locals 2

    .line 50
    iget-wide v0, p0, Lcom/huawei/feedback/bean/a;->i:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/feedback/bean/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/feedback/bean/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Lcom/huawei/feedback/bean/a;->g:Z

    return v0
.end method
