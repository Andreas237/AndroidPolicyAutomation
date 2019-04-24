.class public Lo/crd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private h:I

.field private i:J

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lo/crd;->c:I

    .line 38
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput p1, p0, Lo/crd;->c:I

    .line 51
    iput p2, p0, Lo/crd;->e:I

    .line 52
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p3, p0, Lo/crd;->c:I

    .line 63
    iput p2, p0, Lo/crd;->a:I

    .line 64
    iput p1, p0, Lo/crd;->e:I

    .line 65
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput p1, p0, Lo/crd;->c:I

    .line 56
    iput p2, p0, Lo/crd;->a:I

    .line 57
    iput p3, p0, Lo/crd;->e:I

    .line 58
    iput p4, p0, Lo/crd;->d:I

    .line 59
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p1, p0, Lo/crd;->c:I

    .line 46
    iput-object p2, p0, Lo/crd;->b:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lo/crd;->b:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public static a(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V
    .locals 1

    .line 270
    invoke-virtual {p1}, Lo/crd;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 271
    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setAppID(I)V

    .line 272
    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceID(I)V

    .line 273
    invoke-virtual {p1}, Lo/crd;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 274
    return-void
.end method

.method public static a(Ljava/util/List;Lo/crd;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/crd;)V"
        }
    .end annotation

    .line 258
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    .line 259
    invoke-static {v2, p1}, Lo/crd;->a(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V

    .line 260
    goto :goto_0

    .line 261
    :cond_0
    return-void
.end method

.method public static b(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V
    .locals 1

    .line 277
    invoke-virtual {p1}, Lo/crd;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 278
    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setAppID(I)V

    .line 279
    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceID(I)V

    .line 280
    invoke-virtual {p1}, Lo/crd;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 281
    invoke-virtual {p1}, Lo/crd;->e()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 282
    return-void
.end method

.method public static b(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 264
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    .line 265
    invoke-virtual {v2, p1}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 266
    goto :goto_0

    .line 267
    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 95
    iget v0, p0, Lo/crd;->d:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 115
    iput p1, p0, Lo/crd;->a:I

    .line 116
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/crd;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 107
    iput p1, p0, Lo/crd;->c:I

    .line 108
    return-void
.end method

.method public c()I
    .locals 1

    .line 111
    iget v0, p0, Lo/crd;->a:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 83
    iput p1, p0, Lo/crd;->h:I

    .line 84
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 139
    iput-wide p1, p0, Lo/crd;->i:J

    .line 140
    return-void
.end method

.method public d()I
    .locals 1

    .line 103
    iget v0, p0, Lo/crd;->c:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 131
    iput p1, p0, Lo/crd;->e:I

    .line 132
    return-void
.end method

.method public e()I
    .locals 1

    .line 79
    iget v0, p0, Lo/crd;->h:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 99
    iput p1, p0, Lo/crd;->d:I

    .line 100
    return-void
.end method

.method public f()I
    .locals 1

    .line 127
    iget v0, p0, Lo/crd;->e:I

    return v0
.end method

.method public f(I)V
    .locals 0

    .line 143
    iput p1, p0, Lo/crd;->k:I

    .line 144
    return-void
.end method

.method public h()I
    .locals 1

    .line 147
    iget v0, p0, Lo/crd;->k:I

    return v0
.end method

.method public i()J
    .locals 2

    .line 135
    iget-wide v0, p0, Lo/crd;->i:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 152
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiHealthContext{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 153
    const-string v0, "app="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 154
    const-string v0, ", device="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 155
    const-string v0, ", client="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 156
    const-string v0, ", who="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 157
    const-string v0, ", packageName=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/crd;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 158
    const-string v0, ", syncType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 159
    const-string v0, ", cloudDevice="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/crd;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 160
    const-string v0, ", needUploadData="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/crd;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 161
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 162
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
