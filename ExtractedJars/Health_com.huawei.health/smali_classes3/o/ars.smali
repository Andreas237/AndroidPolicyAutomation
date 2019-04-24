.class public Lo/ars;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:J

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 125
    iput p1, p0, Lo/ars;->f:I

    .line 126
    iput p2, p0, Lo/ars;->k:I

    .line 127
    iput p3, p0, Lo/ars;->g:I

    .line 128
    iput-object p4, p0, Lo/ars;->h:Ljava/util/ArrayList;

    .line 129
    return-void
.end method

.method public b()Lcom/huawei/health/sns/logic/complain/ComplainRequest;
    .locals 4

    .line 143
    new-instance v3, Lcom/huawei/health/sns/logic/complain/ComplainRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;-><init>()V

    .line 144
    iget v0, p0, Lo/ars;->d:I

    iget v1, p0, Lo/ars;->a:I

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setType(II)V

    .line 145
    iget-wide v0, p0, Lo/ars;->b:J

    iget-object v2, p0, Lo/ars;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setUserInfo(JLjava/lang/String;)V

    .line 146
    iget-object v0, p0, Lo/ars;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/ars;->i:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setTarget(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    iget v0, p0, Lo/ars;->f:I

    iget v1, p0, Lo/ars;->k:I

    iget v2, p0, Lo/ars;->g:I

    invoke-virtual {v3, v0, v1, v2}, Lcom/huawei/health/sns/logic/complain/ComplainRequest;->setChatInfo(III)V

    .line 148
    return-object v3
.end method

.method public b(II)V
    .locals 0

    .line 88
    iput p1, p0, Lo/ars;->d:I

    .line 89
    iput p2, p0, Lo/ars;->a:I

    .line 90
    return-void
.end method

.method public c(JLjava/lang/String;)V
    .locals 0

    .line 100
    iput-wide p1, p0, Lo/ars;->b:J

    .line 101
    iput-object p3, p0, Lo/ars;->c:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public d()I
    .locals 1

    .line 76
    iget v0, p0, Lo/ars;->d:I

    .line 77
    return v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lo/ars;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/ars;->e:Ljava/lang/String;

    .line 113
    iput-object p2, p0, Lo/ars;->i:Ljava/lang/String;

    .line 114
    return-void
.end method
